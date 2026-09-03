"""Ablation study design (Section 4.8).

Four configurations of the Test Generation Crew isolate the contribution of each
analysis agent. They are ordinary strategies with different agent toggles, so the
Coordinator runs them exactly like any other configuration and the results land
in the same tables.

============================== ============= ============= ============== ================
Configuration                  class_analyzer black_box     white_box      prompt_engineer
============================== ============= ============= ============== ================
Full Crew (baseline)           yes           yes           yes            yes
No-BlackBox                    yes           no            yes            yes
No-WhiteBox                    yes           yes           no             yes
No-Context                     no            no            no             yes
============================== ============= ============= ============== ================

*No-Context* is the control: the Prompt Engineer receives the raw source code
directly, testing whether decomposing the analysis adds anything beyond the
model's own reasoning.
"""

from __future__ import annotations

from dataclasses import dataclass

from ..config.schema import (
    BenjiTestConfig,
    GenerationAgentToggles,
    StrategyConfig,
    StrategyType,
)

FULL_CREW = "Full Crew (Baseline)"
NO_BLACKBOX = "No-BlackBox (w/o Spec.)"
NO_WHITEBOX = "No-WhiteBox (w/o Struct.)"
NO_CONTEXT = "No-Context (Prompt Eng. Only)"


@dataclass(frozen=True, slots=True)
class AblationConfiguration:
    """One ablation arm."""

    name: str
    description: str
    toggles: GenerationAgentToggles

    def to_strategy(self, *, strategy_name: str | None = None) -> StrategyConfig:
        """Render as a dynamic strategy the Coordinator can execute."""
        return StrategyConfig(
            name=strategy_name or _slug(self.name),
            type=StrategyType.DYNAMIC,
            agents=self.toggles,
        )


ABLATION_CONFIGURATIONS: tuple[AblationConfiguration, ...] = (
    AblationConfiguration(
        name=FULL_CREW,
        description=(
            "The complete dynamic configuration: the Prompt Engineer synthesises "
            "inputs from the Class Analyzer, Black-box Agent, and White-box Agent."
        ),
        toggles=GenerationAgentToggles(
            class_analyzer=True,
            black_box_tester=True,
            white_box_tester=True,
            prompt_engineer=True,
        ),
    ),
    AblationConfiguration(
        name=NO_BLACKBOX,
        description=(
            "Black-box Agent disabled. Tests whether behavioural analysis is "
            "required to prevent overfitting to the implementation."
        ),
        toggles=GenerationAgentToggles(
            class_analyzer=True,
            black_box_tester=False,
            white_box_tester=True,
            prompt_engineer=True,
        ),
    ),
    AblationConfiguration(
        name=NO_WHITEBOX,
        description=(
            "White-box Agent disabled. Tests whether structural visibility is "
            "necessary to cover internal logic and edge cases."
        ),
        toggles=GenerationAgentToggles(
            class_analyzer=True,
            black_box_tester=True,
            white_box_tester=False,
            prompt_engineer=True,
        ),
    ),
    AblationConfiguration(
        name=NO_CONTEXT,
        description=(
            "The Prompt Engineer receives the raw source code with no preliminary "
            "analysis. Control for whether task decomposition adds value beyond "
            "the model's own reasoning."
        ),
        toggles=GenerationAgentToggles(
            class_analyzer=False,
            black_box_tester=False,
            white_box_tester=False,
            prompt_engineer=True,
        ),
    ),
)


def _slug(name: str) -> str:
    return (
        name.lower()
        .replace("(", "")
        .replace(")", "")
        .replace("/", "-")
        .replace(".", "")
        .replace(" ", "-")
        .strip("-")
    )


def build_ablation_config(base: BenjiTestConfig, *, model: str = "gpt-4.1") -> BenjiTestConfig:
    """Derive an ablation configuration from a base experiment configuration.

    Section 4.8 uses a single reference engine (``gpt-4.1``) so that differences
    are attributable to crew composition rather than to the backend.
    """
    import copy

    config = copy.deepcopy(base)
    config.llms = [base.llm(model)]
    config.strategies = [c.to_strategy() for c in ABLATION_CONFIGURATIONS]
    config.experiment.name = f"{base.experiment.name}-ablation"
    return config


def configuration_by_name(name: str) -> AblationConfiguration:
    for configuration in ABLATION_CONFIGURATIONS:
        if configuration.name == name or _slug(configuration.name) == _slug(name):
            return configuration
    raise KeyError(f"unknown ablation configuration '{name}'")
