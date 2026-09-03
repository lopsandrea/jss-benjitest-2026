"""Sequential crew execution.

Section 3.1: *"BenjiTest employs CrewAI's sequential process mode, where agents
execute in a predefined order within each crew, with each agent's output appended
to a shared context memory."*

Two interchangeable backends implement those semantics:

``native``
    Runs the ordered agents directly on the LLM Interaction Layer. This is the
    default because it has no dependency beyond LiteLLM and makes every prompt
    and parse step inspectable.
``crewai``
    Delegates to the CrewAI library used in the reported campaign, mapping each
    :class:`~benjitest.agents.base.AgentSpec` onto a CrewAI ``Agent`` and each
    task description onto a CrewAI ``Task`` under ``Process.sequential``.

Both backends produce the same :class:`CrewResult`, so the Coordinator is
unaffected by the choice.
"""

from __future__ import annotations

import logging
from collections.abc import Callable
from dataclasses import dataclass, field
from typing import Any

from ..agents.base import Agent, AgentOutput, CrewContext
from ..config.schema import OrchestrationBackend

logger = logging.getLogger(__name__)


@dataclass(slots=True)
class CrewResult:
    """Outcome of one crew execution."""

    crew: str
    ok: bool = True
    outputs: list[AgentOutput] = field(default_factory=list)
    #: The crew's final structured output -- the only thing the Coordinator
    #: forwards to the next crew (Section 3.1).
    final: Any = None
    error: str | None = None
    prompt_tokens: int = 0
    completion_tokens: int = 0

    @property
    def total_tokens(self) -> int:
        return self.prompt_tokens + self.completion_tokens

    @property
    def failed_agents(self) -> list[str]:
        return [o.agent for o in self.outputs if not o.ok]

    def output_of(self, agent_name: str) -> AgentOutput | None:
        return next((o for o in self.outputs if o.agent == agent_name), None)


class Crew:
    """An ordered team of agents sharing a context memory.

    Args:
        name: Crew name, used in logs and results.
        agents: Agents in execution order.
        backend: Orchestration backend.
        stop_on_failure: Abort the remaining agents when one fails. Analysis
            crews set this to ``False`` so that a failed optional agent degrades
            the context rather than losing the whole generation.
        final_key: Context key holding the crew's final structured output.
    """

    def __init__(
        self,
        name: str,
        agents: list[Agent],
        *,
        backend: OrchestrationBackend = OrchestrationBackend.NATIVE,
        stop_on_failure: bool = False,
        final_key: str | None = None,
    ) -> None:
        self.name = name
        self.agents = agents
        self.backend = backend
        self.stop_on_failure = stop_on_failure
        self.final_key = final_key

    def __repr__(self) -> str:  # pragma: no cover - debugging aid
        members = ", ".join(agent.spec.name for agent in self.agents)
        return f"<Crew {self.name}: [{members}]>"

    def kickoff(self, context: CrewContext) -> CrewResult:
        """Run the crew over ``context`` and return its result."""
        if self.backend is OrchestrationBackend.CREWAI:
            try:
                return self._kickoff_crewai(context)
            except ImportError:
                logger.warning(
                    "crewai backend requested but the library is unavailable; "
                    "falling back to the native sequential runner"
                )
        return self._kickoff_native(context)

    # ------------------------------------------------------------------
    def _kickoff_native(self, context: CrewContext) -> CrewResult:
        result = CrewResult(crew=self.name)

        for agent in self.agents:
            logger.debug("[%s] running %s", self.name, agent.spec.name)
            output = agent.run(context)
            context.record(output)
            result.outputs.append(output)
            result.prompt_tokens += output.prompt_tokens
            result.completion_tokens += output.completion_tokens

            if not output.ok:
                logger.info("[%s] %s failed: %s", self.name, agent.spec.name, output.error)
                if self.stop_on_failure:
                    result.ok = False
                    result.error = f"{agent.spec.name}: {output.error}"
                    return result

        result.final = self._final_output(context, result)
        result.ok = result.final is not None or not self.agents
        if not result.ok:
            result.error = (
                f"crew produced no final output "
                f"(failed agents: {', '.join(result.failed_agents) or 'none'})"
            )
        return result

    def _final_output(self, context: CrewContext, result: CrewResult) -> Any:
        if self.final_key is not None:
            return context.get(self.final_key)
        return result.outputs[-1].structured if result.outputs else None

    # ------------------------------------------------------------------
    def _kickoff_crewai(self, context: CrewContext) -> CrewResult:
        """Execute through CrewAI's sequential process.

        Task descriptions are built by our own agents so that the prompts are
        identical across backends; CrewAI supplies the orchestration and the
        shared-context plumbing.
        """
        from crewai import Agent as CrewAIAgent  # type: ignore[import-not-found]
        from crewai import Crew as CrewAICrew
        from crewai import Process, Task

        result = CrewResult(crew=self.name)
        llm_agents = [a for a in self.agents if not hasattr(a, "execute")]

        # Tool agents are deterministic and run in place; only LLM agents are
        # handed to CrewAI.
        for agent in self.agents:
            if hasattr(agent, "execute"):
                output = agent.run(context)
                context.record(output)
                result.outputs.append(output)
                if not output.ok and self.stop_on_failure:
                    result.ok = False
                    result.error = f"{agent.spec.name}: {output.error}"
                    return result

        if not llm_agents:
            result.final = self._final_output(context, result)
            return result

        tasks = []
        crewai_agents = []
        for agent in llm_agents:
            crewai_agent = CrewAIAgent(
                role=agent.spec.role,
                goal=agent.spec.goal,
                backstory=agent.system_prompt(),
                llm=_crewai_model_id(agent),
                verbose=False,
                allow_delegation=False,
            )
            crewai_agents.append(crewai_agent)
            tasks.append(
                Task(
                    description=agent.build_task(context),
                    expected_output=agent.spec.returns or "The agent's structured output.",
                    agent=crewai_agent,
                )
            )

        crew = CrewAICrew(
            agents=crewai_agents,
            tasks=tasks,
            process=Process.sequential,
            memory=False,
            verbose=False,
        )
        crew.kickoff()

        # Map CrewAI's task outputs back onto our agents so that parsing,
        # context updates, and downstream code stay backend-agnostic.
        for agent, task in zip(llm_agents, tasks, strict=True):
            raw = _task_output_text(task)
            output = AgentOutput(agent=agent.spec.name, text=raw)
            try:
                output.structured = agent.parse(raw, context)
            except Exception as exc:  # noqa: BLE001
                logger.warning("%s: could not parse CrewAI output (%s)", agent.spec.name, exc)
                output.ok = False
                output.error = str(exc)
            context.record(output)
            result.outputs.append(output)

        result.final = self._final_output(context, result)
        result.ok = result.final is not None
        return result


def _crewai_model_id(agent: Agent) -> str | None:
    """Render the agent's backend as a CrewAI/LiteLLM model identifier."""
    if agent.llm_config is None:
        return None
    from ..llm.layer import LLMLayer

    return LLMLayer.resolve_model_id(agent.llm_config)


def _task_output_text(task: Any) -> str:
    """Extract the raw text of a completed CrewAI task across library versions."""
    output = getattr(task, "output", None)
    if output is None:
        return ""
    for attribute in ("raw", "raw_output", "result", "exported_output"):
        value = getattr(output, attribute, None)
        if isinstance(value, str) and value:
            return value
    return str(output)


def build_crew(
    name: str,
    agent_factories: list[tuple[bool, Callable[[], Agent]]],
    **kwargs: Any,
) -> Crew:
    """Assemble a crew from ``(enabled, factory)`` pairs.

    Disabled agents are never instantiated, which is what makes the ablation
    configurations of Section 4.8 a matter of configuration rather than code.
    """
    agents = [factory() for enabled, factory in agent_factories if enabled]
    return Crew(name, agents, **kwargs)
