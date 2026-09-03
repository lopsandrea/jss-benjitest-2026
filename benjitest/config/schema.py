"""Typed schema for the BenjiTest experiment configuration.

The structure mirrors the YAML file reported in Appendix A (Figure "yaml") of the
paper: experiment metadata, LLM backends and their API parameters, generation
strategies with per-strategy agent activations, iterative-correction settings,
build timeouts, and the metric flags consumed by the Report Generator Module.

Every field carries the default used in the reported experimental campaign, so a
minimal YAML file reproduces the paper configuration.
"""

from __future__ import annotations

from dataclasses import dataclass, field
from enum import Enum
from pathlib import Path
from typing import Any


class StrategyType(str, Enum):
    """The three generation strategies described in Section 4.3 of the paper."""

    #: Fixed prompt template with placeholder injection (zero-shot / few-shot).
    STATIC = "static"
    #: Full Test Generation Crew synthesises the prompt at runtime.
    DYNAMIC = "dynamic"
    #: Two-phase generation through a pseudo-code intermediate representation.
    INTERMEDIATE = "intermediate"


class BuildTool(str, Enum):
    MAVEN = "maven"
    GRADLE = "gradle"


class OrchestrationBackend(str, Enum):
    """Which engine executes a crew's sequential process.

    ``CREWAI`` delegates to the CrewAI library used in the reported campaign.
    ``NATIVE`` runs the identical sequential semantics (ordered agents over a
    shared context memory) directly on the LLM Interaction Layer, which keeps the
    framework usable without the optional CrewAI dependency.
    """

    CREWAI = "crewai"
    NATIVE = "native"


class CorrectionScore(int, Enum):
    """Effectiveness score emitted by the Classifier Agent (Appendix B)."""

    REGRESSION = -1
    NO_PROGRESS = 0
    PARTIAL_PROGRESS = 1


@dataclass(slots=True)
class SampleConfig:
    """Sub-sampling of the dataset for arms too expensive to run on all of it.

    ``require_paired`` is what makes the RQ7 contrasts legitimate: a class enters
    the analysis only if *every* arm produced a result for it, so the arms are
    compared on one population rather than on the population each happened to
    survive.
    """

    kind: str = "stratified"
    size: int | None = None
    strata: list[str] = field(default_factory=list)
    require_paired: bool = True
    seed: int | None = None

    def __post_init__(self) -> None:
        allowed = {"stratified", "random", "all"}
        if self.kind not in allowed:
            raise ValueError(f"experiment.sample.kind must be one of {sorted(allowed)}")
        if self.kind != "all" and not self.size:
            raise ValueError("experiment.sample.size is required unless kind is 'all'")
        if self.kind == "stratified" and not self.strata:
            raise ValueError("experiment.sample.strata must name at least one variable")


@dataclass(slots=True)
class ExperimentConfig:
    name: str = "benjitest-run"
    dataset: str = "classes2test"
    #: Optional free-text note stored in the run manifest.
    description: str = ""
    #: Present when the experiment runs on a sub-sample rather than the corpus.
    sample: SampleConfig | None = None


@dataclass(slots=True)
class LLMConfig:
    """A single evaluated LLM backend.

    ``seed`` is only forwarded to providers that accept it. Per Section 4.7 of the
    paper, ``o3``/``o4-mini`` and the Gemini family do not officially support a
    seed; for those, temperature=0 alone is applied and the value is dropped by
    the LLM Interaction Layer.
    """

    name: str
    provider: str
    model: str
    temperature: float = 0.0
    seed: int | None = None
    max_tokens: int | None = None
    #: Extra keyword arguments forwarded verbatim to LiteLLM (e.g. api_base).
    extra: dict[str, Any] = field(default_factory=dict)

    def __post_init__(self) -> None:
        if not self.name:
            raise ValueError("llms[].name is required")
        if not self.model:
            raise ValueError(f"llms[{self.name}].model is required")


@dataclass(slots=True)
class GenerationAgentToggles:
    """Per-strategy agent activations (also used to express ablation configurations).

    The four ablation configurations of Section 4.8 map onto this object:

    ============================ ============= ============= ==============
    Configuration                black_box     white_box     class_analyzer
    ============================ ============= ============= ==============
    Full Crew (baseline)         True          True          True
    No-BlackBox                  False         True          True
    No-WhiteBox                  True          False         True
    No-Context                   False         False         False
    ============================ ============= ============= ==============
    """

    class_analyzer: bool = True
    black_box_tester: bool = True
    white_box_tester: bool = True
    prompt_engineer: bool = True
    intermediate_representation: bool = False
    #: RQ7 arm B-nosplit: one analysis agent in place of the black-box/white-box
    #: pair, so that the effect of *splitting* the analysis can be separated from
    #: the effect of performing it at all.
    joint_analyzer: bool = False

    def as_dict(self) -> dict[str, bool]:
        return {
            "class_analyzer": self.class_analyzer,
            "black_box_tester": self.black_box_tester,
            "white_box_tester": self.white_box_tester,
            "prompt_engineer": self.prompt_engineer,
            "intermediate_representation": self.intermediate_representation,
            "joint_analyzer": self.joint_analyzer,
        }


@dataclass(slots=True)
class DeterministicContextConfig:
    """RQ7 arm B-rag: context assembled by retrieval, with no model call.

    Every field names a fragment that is copied verbatim into the prompt. The
    point of the arm is that the same information reaches the model as in the
    dynamic strategy, but nothing about it was decided by an LLM.
    """

    class_source: bool = True
    internal_dependency_signatures: bool = False
    javadoc: bool = False
    #: Guard against silently reintroducing a model call into this arm.
    deterministic: bool = True


@dataclass(slots=True)
class RepeatSamplingConfig:
    """RQ7 arm B-budget: repeated cheap sampling under the expensive arm's budget."""

    samples: int = 1
    #: How the retained candidate is chosen among the samples.
    select: str = "best_compiling"
    #: Name of the strategy whose token budget this arm is matched to.
    match_budget_of: str | None = None

    def __post_init__(self) -> None:
        if self.samples < 1:
            raise ValueError("repeat_sampling.samples must be >= 1")
        allowed = {"best_compiling", "best_coverage", "first", "last"}
        if self.select not in allowed:
            raise ValueError(
                f"repeat_sampling.select must be one of {sorted(allowed)}, got '{self.select}'"
            )


@dataclass(slots=True)
class StrategyConfig:
    name: str
    type: StrategyType
    #: Required for ``static`` strategies: template with ``${...}`` placeholders.
    prompt_file: Path | None = None
    agents: GenerationAgentToggles = field(default_factory=GenerationAgentToggles)
    #: Present only on arms that build their context without a model call.
    context: DeterministicContextConfig | None = None
    #: Concatenate the analysis outputs verbatim and issue a single generation
    #: call, instead of letting the Prompt Engineer compose them (arm B-single).
    collapse_to_single_call: bool = False
    #: Present only on budget-matched repeated-sampling arms.
    repeat_sampling: RepeatSamplingConfig | None = None

    def __post_init__(self) -> None:
        if isinstance(self.type, str):
            self.type = StrategyType(self.type)
        if self.type is StrategyType.STATIC and self.prompt_file is None:
            raise ValueError(f"strategy '{self.name}': static strategies require a prompt_file")
        if self.type is StrategyType.INTERMEDIATE:
            # The pseudo-code path is defined by the presence of the IR agent.
            self.agents.intermediate_representation = True
        if self.collapse_to_single_call and self.type is not StrategyType.DYNAMIC:
            raise ValueError(
                f"strategy '{self.name}': collapse_to_single_call applies to dynamic strategies"
            )
        if self.agents.joint_analyzer and (
            self.agents.black_box_tester or self.agents.white_box_tester
        ):
            raise ValueError(
                f"strategy '{self.name}': joint_analyzer replaces the black-box/white-box pair; "
                "enabling it alongside either of them measures neither arm"
            )


@dataclass(slots=True)
class CorrectionAgentToggles:
    error_interpreter: bool = True
    classifier: bool = True
    intermediate_representation: bool = True

    def as_dict(self) -> dict[str, bool]:
        return {
            "error_interpreter": self.error_interpreter,
            "classifier": self.classifier,
            "intermediate_representation": self.intermediate_representation,
        }


@dataclass(slots=True)
class CorrectionArmConfig:
    """One correction-loop arm in the 4-strategies x loop-settings design."""

    name: str
    enabled: bool = True
    max_attempts: int | None = None
    agents: CorrectionAgentToggles = field(default_factory=CorrectionAgentToggles)


@dataclass(slots=True)
class CorrectionConfig:
    """Iterative correction loop settings (Section 4.4, Algorithm 2)."""

    enabled: bool = True
    #: Maximum correction attempts; the campaign used 5.
    max_attempts: int = 5
    agents: CorrectionAgentToggles = field(default_factory=CorrectionAgentToggles)
    #: Halt the loop as soon as the Classifier reports a regression (score = -1).
    halt_on_regression: bool = True
    #: Also attempt to repair tests that compile but fail at runtime.
    correct_test_failures: bool = True
    #: Additional correction settings run as separate arms alongside this one, so
    #: that the loop can be varied independently of the generation strategy.
    ablate: list[CorrectionArmConfig] = field(default_factory=list)

    def __post_init__(self) -> None:
        if self.max_attempts < 1:
            raise ValueError("correction.max_attempts must be >= 1")
        names = [arm.name for arm in self.ablate]
        if len(names) != len(set(names)):
            raise ValueError("correction.ablate arm names must be unique")


@dataclass(slots=True)
class BuildConfig:
    """Build System Integration Module settings."""

    timeout_seconds: int = 1800
    #: Add JUnit 5 / Mockito / JaCoCo / PIT to the sandbox build file when absent.
    inject_dependencies_for_metrics: bool = True
    #: Remove human-written tests from src/test/java so metrics reflect only
    #: LLM-generated code (Phase 1 of the workflow, Section 3.2).
    purge_existing_tests: bool = True
    #: Force a specific build tool instead of auto-detecting from the project.
    force_tool: BuildTool | None = None
    #: Prefer the project's own Maven/Gradle wrapper over the system binary.
    prefer_wrapper: bool = True
    #: Skip the initial "does the project compile untouched?" validation build.
    skip_initial_validation: bool = False
    #: Extra flags appended to every build invocation.
    extra_args: list[str] = field(default_factory=list)
    #: Pin the JDK the sandbox builds under. RQ6 needs 8 for the EvoSuite arm,
    #: and pins every other arm to it as well so the subset is one population.
    force_jdk: int | None = None

    def __post_init__(self) -> None:
        if isinstance(self.force_tool, str):
            self.force_tool = BuildTool(self.force_tool)


@dataclass(slots=True)
class CoverageMetricConfig:
    line: bool = True
    branch: bool = True
    method: bool = True

    @property
    def enabled(self) -> bool:
        return self.line or self.branch or self.method


@dataclass(slots=True)
class MutationMetricConfig:
    enabled: bool = True
    tool: str = "pitest"
    threads: int = 4
    #: Mutation analysis is restricted to the class under test (Section 4.5).
    target_only_cut: bool = True
    #: PIT statuses excluded from the denominator: they are not executable mutants
    #: a test suite could reasonably kill (Section 4.5).
    excluded_statuses: list[str] = field(
        default_factory=lambda: ["NON_VIABLE", "MEMORY_ERROR", "RUN_ERROR", "TIMED_OUT"]
    )
    #: Collapse mutants reported more than once for the same location + operator.
    deduplicate: bool = True


@dataclass(slots=True)
class SmellMetricConfig:
    enabled: bool = True
    #: Path to the tsDetect JAR; falls back to $TSDETECT_JAR.
    tsdetect_jar: Path | None = None


@dataclass(slots=True)
class CostMetricConfig:
    """Per-task telemetry. Feeds ``data/raw/telemetry.csv``."""

    track_tokens: bool = True
    track_calls: bool = True
    track_wallclock: bool = True


@dataclass(slots=True)
class MetricsConfig:
    coverage: CoverageMetricConfig = field(default_factory=CoverageMetricConfig)
    mutation: MutationMetricConfig = field(default_factory=MutationMetricConfig)
    smells: SmellMetricConfig = field(default_factory=SmellMetricConfig)
    cost: CostMetricConfig = field(default_factory=CostMetricConfig)


@dataclass(slots=True)
class ReportingConfig:
    save_candidate_test_files: bool = True
    save_error_logs: bool = True
    output_dir: Path = Path("data/raw")
    formats: list[str] = field(default_factory=lambda: ["csv"])


@dataclass(slots=True)
class LoggingConfig:
    level: str = "INFO"
    save_llm_responses: bool = True
    log_dir: Path = Path("logs")


@dataclass(slots=True)
class ExecutionConfig:
    """Parallelisation settings (Section 4.10).

    The reported campaign processed classes in parallel batches of 64 with build
    execution distributed across 8 worker nodes.
    """

    parallel_jobs: int = 4
    batch_size: int = 64
    allow_reuse_project_sandboxes: bool = False
    #: Resume a run by skipping <project, class, model, strategy> tuples already
    #: present in the output CSV.
    resume: bool = True


@dataclass(slots=True)
class ContextLimitsConfig:
    """Context-window controls described in "Agent Orchestration Details" (Sec. 3.1).

    The Repository Miner output is truncated to 2,000 tokens (top-level package
    structure only); classes longer than 4,000 tokens are split into chunks and
    processed sequentially.
    """

    repository_tree_max_tokens: int = 2_000
    class_source_chunk_tokens: int = 4_000
    #: Class Analyzer output is limited to signatures and dependency lists rather
    #: than duplicating full source code.
    analyzer_omit_method_bodies: bool = True


@dataclass(slots=True)
class OrchestrationConfig:
    backend: OrchestrationBackend = OrchestrationBackend.NATIVE
    #: CrewAI "sequential process" mode: agents run in a predefined order and each
    #: output is appended to a shared context memory.
    process: str = "sequential"
    #: The Coordinator forwards only the final structured output of a crew to the
    #: next crew, rather than the full agent conversation.
    pass_full_conversation_between_crews: bool = False
    context: ContextLimitsConfig = field(default_factory=ContextLimitsConfig)

    def __post_init__(self) -> None:
        if isinstance(self.backend, str):
            self.backend = OrchestrationBackend(self.backend)


@dataclass(slots=True)
class DatasetFilters:
    include: list[str] = field(default_factory=lambda: ["**/*.java"])
    exclude: list[str] = field(default_factory=list)


@dataclass(slots=True)
class ControlSourceConfig:
    """One arm of the memorization control corpus (paper Sec. 5.6.5)."""

    name: str
    kind: str
    count: int
    filters: dict = field(default_factory=dict)
    source_root: str | None = None
    generator: str | None = None
    randomize: list[str] = field(default_factory=list)
    seed: int | None = None
    redact_identifiers: bool = False

    def __post_init__(self) -> None:
        allowed = {"github", "repository", "local", "generated"}
        if self.kind not in allowed:
            raise ValueError(
                f"control source '{self.name}': kind must be one of {sorted(allowed)}"
            )
        if self.kind == "generated" and not self.generator:
            raise ValueError(
                f"control source '{self.name}': a generated arm must name its generator, "
                "otherwise the corpus cannot be regenerated and re-probed"
            )
        if self.count < 1:
            raise ValueError(f"control source '{self.name}': count must be positive")


@dataclass(slots=True)
class MatchingConfig:
    """How the control corpus is matched to the corpus it controls for.

    Without this the control could be easier than Classes2Test, and a lower
    reproduction rate would say nothing about memorization.
    """

    enabled: bool = True
    target_dataset: str = "classes2test"
    match_on: list[str] = field(default_factory=list)
    tolerance: float = 0.1

    def __post_init__(self) -> None:
        if self.enabled and not self.match_on:
            raise ValueError("matching.match_on must name at least one variable")
        if not 0.0 < self.tolerance <= 1.0:
            raise ValueError("matching.tolerance must lie in (0, 1]")


@dataclass(slots=True)
class ProbingConfig:
    """Memorization probe settings (paper Sec. 4.9).

    Present on the control corpus descriptor. The probe must be identical to the
    one run on Classes2Test -- any deviation would invalidate the comparison,
    which is the entire purpose of the control -- so these values are recorded
    with the dataset rather than with the experiment that consumes it.
    """

    protocol: str = "memorization"
    few_shot_examples: int = 2
    temperature: float = 0.0
    seed: int | None = None
    match_levels: list[str] = field(default_factory=lambda: ["exact", "structural", "semantic"])
    semantic_threshold: float = 0.8

    def __post_init__(self) -> None:
        allowed = {"exact", "structural", "semantic"}
        unknown = [m for m in self.match_levels if m not in allowed]
        if unknown:
            raise ValueError(f"probing.match_levels: unknown level(s) {sorted(unknown)}")
        if not 0.0 < self.semantic_threshold <= 1.0:
            raise ValueError("probing.semantic_threshold must lie in (0, 1]")


@dataclass(slots=True)
class DatasetConfig:
    """Dataset descriptor, matching ``config/dataset/classes2test_config.yaml``."""
    #: Present on descriptors that carry a memorization probe.
    probing: ProbingConfig | None = None
    #: Present on the control corpus: the arms it is assembled from.
    sources: list["ControlSourceConfig"] = field(default_factory=list)
    #: Present on the control corpus: what it is matched to, and on what.
    matching: "MatchingConfig | None" = None

    name: str = "Classes2Test"
    description: str = ""
    language: str = "java"
    source_root: Path = Path("dataset/source")
    #: Optional JSON/CSV index mapping production classes to their test classes.
    index_file: Path | None = None
    filters: DatasetFilters = field(default_factory=DatasetFilters)
    #: Cap on the number of <project, class> pairs, for smoke runs.
    limit: int | None = None


@dataclass(slots=True)
class ExternalBaselineConfig:
    """A third-party generator run under BenjiTest's harness (RQ6).

    The adapter produces a test class and nothing else: sandboxing, build, and
    measurement stay on our side, so that a difference in the reported metrics
    cannot come from a difference in how they were measured.
    """

    name: str
    #: ``llm`` baselines are given our backend; ``search-based`` ones are not.
    kind: str = "llm"
    backend: str | None = None
    version: str | None = None
    repository: str | None = None
    #: How the adapter drives the tool: ``cli``, ``maven-plugin``, or ``jar``.
    invocation: str = "cli"
    search_budget_seconds: int | None = None
    jdk: int | None = None
    notes: str = ""

    def __post_init__(self) -> None:
        allowed_kind = {"llm", "search-based"}
        if self.kind not in allowed_kind:
            raise ValueError(
                f"external baseline '{self.name}': kind must be one of {sorted(allowed_kind)}"
            )
        allowed_inv = {"cli", "maven-plugin", "jar"}
        if self.invocation not in allowed_inv:
            raise ValueError(
                f"external baseline '{self.name}': invocation must be one of {sorted(allowed_inv)}"
            )
        if self.kind == "llm" and not self.backend:
            raise ValueError(
                f"external baseline '{self.name}': an LLM baseline must name the backend it was "
                "given, otherwise the comparison confounds orchestration with model choice"
            )


@dataclass(slots=True)
class OrchestrationOverrideConfig:
    """Arm B-fixed: orchestration pinned to one model, generator varied.

    This is what separates framework quality from backend quality: every agent
    except the Test Developer is held on ``pinned_model``, and only the
    generating model moves.
    """

    enabled: bool = False
    pinned_model: str | None = None
    pinned_agents: list[str] = field(default_factory=list)
    vary_generator_across: list[str] = field(default_factory=list)

    def __post_init__(self) -> None:
        if not self.enabled:
            return
        if not self.pinned_model:
            raise ValueError("orchestration_override.pinned_model is required when enabled")
        if not self.vary_generator_across:
            raise ValueError(
                "orchestration_override.vary_generator_across must list the generating models"
            )
        known = set(GenerationAgentToggles().as_dict()) | set(CorrectionAgentToggles().as_dict())
        unknown = [a for a in self.pinned_agents if a not in known]
        if unknown:
            raise ValueError(
                f"orchestration_override.pinned_agents names unknown agent(s): {sorted(unknown)}"
            )
        if "test_developer" in self.pinned_agents:
            raise ValueError(
                "orchestration_override: the Test Developer is the varied agent and cannot be pinned"
            )


@dataclass(slots=True)
class BenjiTestConfig:
    """Root configuration object driving the Coordinator."""

    experiment: ExperimentConfig = field(default_factory=ExperimentConfig)
    llms: list[LLMConfig] = field(default_factory=list)
    strategies: list[StrategyConfig] = field(default_factory=list)
    correction: CorrectionConfig = field(default_factory=CorrectionConfig)
    build: BuildConfig = field(default_factory=BuildConfig)
    metrics: MetricsConfig = field(default_factory=MetricsConfig)
    reporting: ReportingConfig = field(default_factory=ReportingConfig)
    logging: LoggingConfig = field(default_factory=LoggingConfig)
    execution: ExecutionConfig = field(default_factory=ExecutionConfig)
    orchestration: OrchestrationConfig = field(default_factory=OrchestrationConfig)
    dataset: DatasetConfig = field(default_factory=DatasetConfig)
    #: Third-party generators compared against under the same harness (RQ6).
    external_baselines: list[ExternalBaselineConfig] = field(default_factory=list)
    #: Fixed-orchestration / varied-generator arm (RQ7).
    orchestration_override: OrchestrationOverrideConfig = field(
        default_factory=OrchestrationOverrideConfig
    )
    #: Explicit project list; when empty the dataset loader supplies the projects.
    projects: list[Path] = field(default_factory=list)
    #: Directory the YAML was loaded from; relative paths resolve against it.
    root_dir: Path = field(default_factory=Path.cwd)

    def __post_init__(self) -> None:
        if not self.llms:
            raise ValueError("configuration must declare at least one entry under 'llms'")
        if not self.strategies:
            raise ValueError("configuration must declare at least one entry under 'strategies'")
        names = [s.name for s in self.strategies]
        if len(names) != len(set(names)):
            raise ValueError(f"duplicate strategy names: {names}")
        llm_names = [m.name for m in self.llms]
        if len(llm_names) != len(set(llm_names)):
            raise ValueError(f"duplicate LLM names: {llm_names}")

    def llm(self, name: str) -> LLMConfig:
        for candidate in self.llms:
            if candidate.name == name:
                return candidate
        raise KeyError(f"unknown LLM '{name}'")

    def strategy(self, name: str) -> StrategyConfig:
        for candidate in self.strategies:
            if candidate.name == name:
                return candidate
        raise KeyError(f"unknown strategy '{name}'")

    @property
    def total_task_count_per_class(self) -> int:
        """Generation tasks executed for a single class under test."""
        return len(self.llms) * len(self.strategies)
