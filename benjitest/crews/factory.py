"""Construction of the three BenjiTest crews from an experiment configuration.

Crew composition is data-driven: the agent toggles in the YAML decide which
members are instantiated. That is what lets the four ablation configurations of
Section 4.8 (Full Crew, No-BlackBox, No-WhiteBox, No-Context) be expressed
without touching any code.
"""

from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path

from ..agents.analysis import (
    BlackBoxAgent,
    ClassAnalyzerAgent,
    JointAnalyzerAgent,
    WhiteBoxAgent,
)
from ..agents.base import Agent
from ..agents.correction import ClassifierAgent, ErrorInterpreterAgent
from ..agents.developer import TestDeveloperAgent
from ..agents.repository import RepositoryManagerAgent, RepositoryMinerAgent
from ..agents.synthesis import IntermediateRepresentationAgent, PromptEngineerAgent
from ..build.integration import BuildSystem
from ..config.schema import (
    BenjiTestConfig,
    LLMConfig,
    StrategyConfig,
    StrategyType,
)
from ..llm.layer import LLMLayer
from .base import Crew


@dataclass(slots=True)
class CorrectionAgents:
    """The Test Correction Crew's members.

    The crew is not a fixed sequence: the Classifier only participates from the
    second attempt onward, and the Intermediate Representation Agent only in
    pseudo-code mode. The loop in :mod:`benjitest.correction.loop` sequences them
    per attempt, following Algorithm 2.
    """

    error_interpreter: ErrorInterpreterAgent | None
    classifier: ClassifierAgent | None
    intermediate_representation: IntermediateRepresentationAgent | None
    test_developer: TestDeveloperAgent


class CrewFactory:
    """Builds crews bound to a specific model backend.

    Args:
        config: The experiment configuration.
        llm_layer: Shared LLM Interaction Layer.
        prompts_dir: Directory holding the released agent prompts; defaults to
            ``<root>/prompts/agents``.
    """

    def __init__(
        self,
        config: BenjiTestConfig,
        llm_layer: LLMLayer,
        *,
        prompts_dir: str | Path | None = None,
    ) -> None:
        self.config = config
        self.llm_layer = llm_layer
        self.prompts_dir = Path(prompts_dir) if prompts_dir else config.root_dir / "prompts" / "agents"

    # ------------------------------------------------------------------
    def _agent_kwargs(self, llm: LLMConfig) -> dict:
        return {
            "llm_layer": self.llm_layer,
            "llm_config": llm,
            "prompts_dir": self.prompts_dir,
        }

    # ------------------------------------------------------------------
    def build_repository_crew(self, build_system: BuildSystem) -> Crew:
        """Repository Crew: validate, sandbox, and map the target project."""
        context_limits = self.config.orchestration.context
        agents: list[Agent] = [
            RepositoryManagerAgent(
                build_system=build_system,
                purge_existing_tests=self.config.build.purge_existing_tests,
                inject_dependencies=self.config.build.inject_dependencies_for_metrics,
                reuse_sandboxes=self.config.execution.allow_reuse_project_sandboxes,
                skip_validation=self.config.build.skip_initial_validation,
            ),
            RepositoryMinerAgent(max_tokens=context_limits.repository_tree_max_tokens),
        ]
        return Crew(
            "Repository Crew",
            agents,
            backend=self.config.orchestration.backend,
            # A project that cannot be sandboxed must not proceed to generation.
            stop_on_failure=True,
            final_key="project_tree",
        )

    # ------------------------------------------------------------------
    def build_generation_crew(self, strategy: StrategyConfig, llm: LLMConfig) -> Crew:
        """Test Generation Crew, composed according to ``strategy``.

        * ``static`` -- the Test Developer alone; the analysis agents are bypassed
          and the rendered template is the entire instruction (Section 3.2).
        * ``dynamic`` -- analyzer, black-box, white-box, prompt engineer, then the
          Test Developer, subject to the strategy's agent toggles.
        * ``intermediate`` -- the Intermediate Representation Agent is inserted
          between the analyzer and the Test Developer.

        Two RQ7 arms are expressed here as well. ``joint_analyzer`` replaces the
        black-box/white-box pair with a single agent that sees both views, and
        ``collapse_to_single_call`` drops the Prompt Engineer so the analysis
        outputs reach the Test Developer concatenated rather than composed.
        """
        kwargs = self._agent_kwargs(llm)
        context_limits = self.config.orchestration.context
        toggles = strategy.agents
        agents: list[Agent] = []

        if strategy.type is not StrategyType.STATIC:
            if toggles.class_analyzer:
                agents.append(
                    ClassAnalyzerAgent(
                        omit_method_bodies=context_limits.analyzer_omit_method_bodies,
                        **kwargs,
                    )
                )
            if toggles.joint_analyzer:
                # arm B-nosplit: one analysis agent instead of the pair
                agents.append(
                    JointAnalyzerAgent(
                        chunk_tokens=context_limits.class_source_chunk_tokens, **kwargs
                    )
                )
            if toggles.black_box_tester:
                agents.append(BlackBoxAgent(**kwargs))
            if toggles.white_box_tester:
                agents.append(
                    WhiteBoxAgent(
                        chunk_tokens=context_limits.class_source_chunk_tokens, **kwargs
                    )
                )
            if toggles.prompt_engineer and not strategy.collapse_to_single_call:
                agents.append(PromptEngineerAgent(**kwargs))
            if toggles.intermediate_representation:
                agents.append(IntermediateRepresentationAgent(**kwargs))

        agents.append(TestDeveloperAgent(**kwargs))

        return Crew(
            f"Test Generation Crew [{strategy.name}]",
            agents,
            backend=self.config.orchestration.backend,
            # An analysis agent failing degrades the context; only the Test
            # Developer failing means the generation produced nothing.
            stop_on_failure=False,
            final_key="test_code",
        )

    # ------------------------------------------------------------------
    def build_correction_agents(
        self, strategy: StrategyConfig, llm: LLMConfig
    ) -> CorrectionAgents:
        """Instantiate the Test Correction Crew's members."""
        kwargs = self._agent_kwargs(llm)
        toggles = self.config.correction.agents

        use_intermediate = (
            toggles.intermediate_representation
            and strategy.type is StrategyType.INTERMEDIATE
        )

        return CorrectionAgents(
            error_interpreter=ErrorInterpreterAgent(**kwargs) if toggles.error_interpreter else None,
            classifier=ClassifierAgent(**kwargs) if toggles.classifier else None,
            intermediate_representation=(
                IntermediateRepresentationAgent(**kwargs) if use_intermediate else None
            ),
            # The Test Developer is reused in correction mode (Appendix B).
            test_developer=TestDeveloperAgent(options={"correction_mode": True}, **kwargs),
        )
