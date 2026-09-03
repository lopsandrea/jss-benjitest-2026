"""YAML loading for BenjiTest experiment and dataset configurations.

Unknown keys are rejected rather than silently ignored: a typo in an experiment
configuration would otherwise change what is measured without any warning, which
is unacceptable in a replication package.
"""

from __future__ import annotations

import os
import re
from pathlib import Path
from typing import Any

import yaml

from .schema import (
    BenjiTestConfig,
    BuildConfig,
    ContextLimitsConfig,
    CorrectionAgentToggles,
    CorrectionArmConfig,
    CorrectionConfig,
    CostMetricConfig,
    CoverageMetricConfig,
    DatasetConfig,
    DatasetFilters,
    DeterministicContextConfig,
    ExecutionConfig,
    ExperimentConfig,
    ExternalBaselineConfig,
    GenerationAgentToggles,
    LLMConfig,
    LoggingConfig,
    MetricsConfig,
    MutationMetricConfig,
    OrchestrationConfig,
    OrchestrationOverrideConfig,
    ControlSourceConfig,
    MatchingConfig,
    ProbingConfig,
    ReportingConfig,
    RepeatSamplingConfig,
    SampleConfig,
    SmellMetricConfig,
    StrategyConfig,
)

_ENV_PATTERN = re.compile(r"\$\{env:([A-Za-z_][A-Za-z0-9_]*)(?::([^}]*))?\}")


class ConfigError(ValueError):
    """Raised when a configuration file is malformed."""


def _expand_env(value: Any) -> Any:
    """Expand ``${env:VAR}`` / ``${env:VAR:default}`` references inside strings."""
    if isinstance(value, str):

        def _sub(match: re.Match[str]) -> str:
            var, default = match.group(1), match.group(2)
            resolved = os.environ.get(var, default)
            if resolved is None:
                raise ConfigError(f"environment variable '{var}' is not set and has no default")
            return resolved

        return _ENV_PATTERN.sub(_sub, value)
    if isinstance(value, dict):
        return {k: _expand_env(v) for k, v in value.items()}
    if isinstance(value, list):
        return [_expand_env(v) for v in value]
    return value


def _check_keys(section: str, data: dict[str, Any], allowed: set[str]) -> None:
    unknown = set(data) - allowed
    if unknown:
        raise ConfigError(
            f"unknown key(s) in '{section}': {sorted(unknown)}; allowed keys are {sorted(allowed)}"
        )


def _as_dict(section: str, data: Any) -> dict[str, Any]:
    if data is None:
        return {}
    if not isinstance(data, dict):
        raise ConfigError(f"'{section}' must be a mapping, got {type(data).__name__}")
    return data


def _resolve(root: Path, value: str | Path | None) -> Path | None:
    if value is None:
        return None
    path = Path(value)
    return path if path.is_absolute() else (root / path)


def _build_experiment(data: dict[str, Any]) -> ExperimentConfig:
    _check_keys("experiment", data, {"name", "dataset", "description", "sample"})
    sample_data = _as_dict("experiment.sample", data.get("sample"))
    sample = None
    if sample_data:
        _check_keys(
            "experiment.sample",
            sample_data,
            {"kind", "size", "strata", "require_paired", "seed"},
        )
        sample = SampleConfig(
            kind=sample_data.get("kind", "stratified"),
            size=sample_data.get("size"),
            strata=list(sample_data.get("strata") or []),
            require_paired=bool(sample_data.get("require_paired", True)),
            seed=sample_data.get("seed"),
        )
    return ExperimentConfig(
        name=data.get("name", "benjitest-run"),
        dataset=data.get("dataset", "classes2test"),
        description=data.get("description", ""),
        sample=sample,
    )


def _build_llms(items: Any) -> list[LLMConfig]:
    if not isinstance(items, list) or not items:
        raise ConfigError("'llms' must be a non-empty list")
    known = {"name", "provider", "model", "temperature", "seed", "max_tokens", "extra"}
    result: list[LLMConfig] = []
    for entry in items:
        entry = _as_dict("llms[]", entry)
        _check_keys(f"llms[{entry.get('name', '?')}]", entry, known)
        result.append(
            LLMConfig(
                name=entry["name"],
                provider=entry.get("provider", ""),
                model=entry["model"],
                temperature=float(entry.get("temperature", 0.0)),
                seed=entry.get("seed"),
                max_tokens=entry.get("max_tokens"),
                extra=dict(entry.get("extra") or {}),
            )
        )
    return result


def _build_strategies(items: Any, root: Path) -> list[StrategyConfig]:
    if not isinstance(items, list) or not items:
        raise ConfigError("'strategies' must be a non-empty list")
    known = {
        "name",
        "type",
        "prompt_file",
        "agents",
        "context",
        "collapse_to_single_call",
        "repeat_sampling",
    }
    agent_keys = set(GenerationAgentToggles().as_dict())
    result: list[StrategyConfig] = []
    for entry in items:
        entry = _as_dict("strategies[]", entry)
        name = entry.get("name", "?")
        _check_keys(f"strategies[{name}]", entry, known)
        agents_data = _as_dict(f"strategies[{name}].agents", entry.get("agents"))
        _check_keys(f"strategies[{name}].agents", agents_data, agent_keys)
        # An explicitly declared agent block is authoritative: any agent not
        # listed is considered disabled. This is what makes the ablation
        # configurations of Section 4.8 expressible in YAML.
        if agents_data:
            toggles = GenerationAgentToggles(
                **{key: bool(agents_data.get(key, False)) for key in agent_keys}
            )
        else:
            toggles = GenerationAgentToggles()
        context_data = _as_dict(f"strategies[{name}].context", entry.get("context"))
        context = None
        if context_data:
            _check_keys(
                f"strategies[{name}].context",
                context_data,
                {"class_source", "internal_dependency_signatures", "javadoc", "deterministic"},
            )
            context = DeterministicContextConfig(
                **{k: bool(v) for k, v in context_data.items()}
            )
        sampling_data = _as_dict(f"strategies[{name}].repeat_sampling", entry.get("repeat_sampling"))
        sampling = None
        if sampling_data:
            _check_keys(
                f"strategies[{name}].repeat_sampling",
                sampling_data,
                {"samples", "select", "match_budget_of"},
            )
            sampling = RepeatSamplingConfig(
                samples=int(sampling_data.get("samples", 1)),
                select=sampling_data.get("select", "best_compiling"),
                match_budget_of=sampling_data.get("match_budget_of"),
            )
        result.append(
            StrategyConfig(
                name=entry["name"],
                type=entry["type"],
                prompt_file=_resolve(root, entry.get("prompt_file")),
                agents=toggles,
                context=context,
                collapse_to_single_call=bool(entry.get("collapse_to_single_call", False)),
                repeat_sampling=sampling,
            )
        )
    return result


def _build_correction(data: dict[str, Any]) -> CorrectionConfig:
    _check_keys(
        "correction",
        data,
        {
            "enabled",
            "max_attempts",
            "agents",
            "halt_on_regression",
            "correct_test_failures",
            "ablate",
        },
    )
    agent_keys = {"error_interpreter", "classifier", "intermediate_representation"}
    agents_data = _as_dict("correction.agents", data.get("agents"))
    _check_keys("correction.agents", agents_data, agent_keys)
    base_agents = (
        CorrectionAgentToggles(**agents_data) if agents_data else CorrectionAgentToggles()
    )

    arms: list[CorrectionArmConfig] = []
    ablate = data.get("ablate") or []
    if not isinstance(ablate, list):
        raise ConfigError("'correction.ablate' must be a list of arms")
    for entry in ablate:
        entry = _as_dict("correction.ablate[]", entry)
        arm_name = entry.get("name")
        if not arm_name:
            raise ConfigError("every entry of 'correction.ablate' must have a name")
        _check_keys(f"correction.ablate[{arm_name}]", entry, {"name", "enabled", "max_attempts", "agents"})
        arm_agents_data = _as_dict(f"correction.ablate[{arm_name}].agents", entry.get("agents"))
        _check_keys(f"correction.ablate[{arm_name}].agents", arm_agents_data, agent_keys)
        # An arm states only what it changes; the rest is inherited from the
        # base loop, so that an arm differs from it in exactly one respect.
        merged = base_agents.as_dict() | {k: bool(v) for k, v in arm_agents_data.items()}
        arms.append(
            CorrectionArmConfig(
                name=arm_name,
                enabled=bool(entry.get("enabled", True)),
                max_attempts=entry.get("max_attempts"),
                agents=CorrectionAgentToggles(**merged),
            )
        )

    return CorrectionConfig(
        enabled=bool(data.get("enabled", True)),
        max_attempts=int(data.get("max_attempts", 5)),
        agents=base_agents,
        halt_on_regression=bool(data.get("halt_on_regression", True)),
        correct_test_failures=bool(data.get("correct_test_failures", True)),
        ablate=arms,
    )


def _build_build(data: dict[str, Any]) -> BuildConfig:
    _check_keys(
        "build",
        data,
        {
            "timeout_seconds",
            "inject_dependencies_for_metrics",
            "purge_existing_tests",
            "force_tool",
            "prefer_wrapper",
            "skip_initial_validation",
            "extra_args",
            "force_jdk",
        },
    )
    return BuildConfig(**data)


def _build_metrics(data: dict[str, Any], root: Path) -> MetricsConfig:
    _check_keys("metrics", data, {"coverage", "mutation", "smells", "cost"})
    coverage = _as_dict("metrics.coverage", data.get("coverage"))
    _check_keys("metrics.coverage", coverage, {"line", "branch", "method"})
    mutation = _as_dict("metrics.mutation", data.get("mutation"))
    _check_keys(
        "metrics.mutation",
        mutation,
        {"enabled", "tool", "threads", "target_only_cut", "excluded_statuses", "deduplicate"},
    )
    smells = _as_dict("metrics.smells", data.get("smells"))
    _check_keys("metrics.smells", smells, {"enabled", "tsdetect_jar"})
    cost = _as_dict("metrics.cost", data.get("cost"))
    _check_keys("metrics.cost", cost, {"track_tokens", "track_calls", "track_wallclock"})
    return MetricsConfig(
        coverage=CoverageMetricConfig(**coverage) if coverage else CoverageMetricConfig(),
        mutation=MutationMetricConfig(**mutation) if mutation else MutationMetricConfig(),
        smells=SmellMetricConfig(
            enabled=bool(smells.get("enabled", True)),
            tsdetect_jar=_resolve(root, smells.get("tsdetect_jar")),
        ),
        cost=CostMetricConfig(**{k: bool(v) for k, v in cost.items()})
        if cost
        else CostMetricConfig(),
    )


def _build_external_baselines(items: Any) -> list[ExternalBaselineConfig]:
    """Parse the third-party generators compared against in RQ6."""
    if items is None:
        return []
    if not isinstance(items, list):
        raise ConfigError("'external_baselines' must be a list")
    known = {
        "name",
        "kind",
        "backend",
        "version",
        "repository",
        "invocation",
        "search_budget_seconds",
        "jdk",
        "notes",
    }
    result: list[ExternalBaselineConfig] = []
    for entry in items:
        entry = _as_dict("external_baselines[]", entry)
        name = entry.get("name")
        if not name:
            raise ConfigError("every entry of 'external_baselines' must have a name")
        _check_keys(f"external_baselines[{name}]", entry, known)
        result.append(
            ExternalBaselineConfig(
                name=name,
                kind=entry.get("kind", "llm"),
                backend=entry.get("backend"),
                version=str(entry["version"]) if entry.get("version") is not None else None,
                repository=entry.get("repository"),
                invocation=entry.get("invocation", "cli"),
                search_budget_seconds=entry.get("search_budget_seconds"),
                jdk=entry.get("jdk"),
                notes=entry.get("notes", ""),
            )
        )
    names = [b.name for b in result]
    if len(names) != len(set(names)):
        raise ConfigError("external baseline names must be unique")
    return result


def _build_orchestration_override(data: dict[str, Any]) -> OrchestrationOverrideConfig:
    """Parse the fixed-orchestration / varied-generator arm of RQ7."""
    _check_keys(
        "orchestration_override",
        data,
        {"enabled", "pinned_model", "pinned_agents", "vary_generator_across"},
    )
    if not data:
        return OrchestrationOverrideConfig()
    return OrchestrationOverrideConfig(
        enabled=bool(data.get("enabled", False)),
        pinned_model=data.get("pinned_model"),
        pinned_agents=list(data.get("pinned_agents") or []),
        vary_generator_across=list(data.get("vary_generator_across") or []),
    )


def _build_dataset(data: dict[str, Any], root: Path) -> DatasetConfig:
    # Accept both the flat form and the nested form used by
    # config/dataset/classes2test_config.yaml (paths.source_root).
    _check_keys(
        "dataset",
        data,
        {"name", "description", "language", "paths", "source_root", "index_file",
         "filters", "limit", "sources", "matching"},
    )
    paths = _as_dict("dataset.paths", data.get("paths"))
    _check_keys("dataset.paths", paths, {"source_root", "index_file"})
    source_root = data.get("source_root") or paths.get("source_root") or "dataset/source"
    index_file = data.get("index_file") or paths.get("index_file")
    filters_data = _as_dict("dataset.filters", data.get("filters"))
    _check_keys("dataset.filters", filters_data, {"include", "exclude"})
    return DatasetConfig(
        name=data.get("name", "Classes2Test"),
        description=data.get("description", ""),
        language=data.get("language", "java"),
        source_root=_resolve(root, source_root),
        index_file=_resolve(root, index_file),
        filters=DatasetFilters(
            include=list(filters_data.get("include") or ["**/*.java"]),
            exclude=list(filters_data.get("exclude") or []),
        ),
        limit=data.get("limit"),
    )


def _build_orchestration(data: dict[str, Any]) -> OrchestrationConfig:
    _check_keys(
        "orchestration",
        data,
        {"backend", "process", "pass_full_conversation_between_crews", "context"},
    )
    context = _as_dict("orchestration.context", data.get("context"))
    _check_keys(
        "orchestration.context",
        context,
        {"repository_tree_max_tokens", "class_source_chunk_tokens", "analyzer_omit_method_bodies"},
    )
    return OrchestrationConfig(
        backend=data.get("backend", "native"),
        process=data.get("process", "sequential"),
        pass_full_conversation_between_crews=bool(
            data.get("pass_full_conversation_between_crews", False)
        ),
        context=ContextLimitsConfig(**context) if context else ContextLimitsConfig(),
    )


def load_config(path: str | Path, *, overrides: dict[str, Any] | None = None) -> BenjiTestConfig:
    """Load and validate an experiment configuration file.

    Args:
        path: Path to the experiment YAML (e.g. ``config/experiments/*.yaml``).
        overrides: Optional mapping merged over the parsed document before
            validation, used by the CLI to apply ``--set key=value`` flags.

    Returns:
        A fully validated :class:`BenjiTestConfig`.
    """
    config_path = Path(path).expanduser().resolve()
    if not config_path.is_file():
        raise ConfigError(f"configuration file not found: {config_path}")

    raw = yaml.safe_load(config_path.read_text(encoding="utf-8")) or {}
    if not isinstance(raw, dict):
        raise ConfigError(f"{config_path}: top level of the document must be a mapping")
    raw = _expand_env(raw)
    if overrides:
        raw = _deep_merge(raw, overrides)

    # Paths inside the YAML resolve against the repository root, i.e. the
    # directory two levels above config/experiments/<file>.yaml when that layout
    # is used, and against the file's own directory otherwise.
    root = _infer_root(config_path)

    _check_keys(
        str(config_path.name),
        raw,
        {
            "experiment",
            "llms",
            "strategies",
            "correction",
            "build",
            "metrics",
            "reporting",
            "logging",
            "execution",
            "orchestration",
            "dataset",
            "projects",
            "external_baselines",
            "orchestration_override",
        },
    )

    reporting_data = _as_dict("reporting", raw.get("reporting"))
    _check_keys(
        "reporting",
        reporting_data,
        {"save_candidate_test_files", "save_error_logs", "output_dir", "formats"},
    )
    logging_data = _as_dict("logging", raw.get("logging"))
    _check_keys("logging", logging_data, {"level", "save_llm_responses", "log_dir"})
    execution_data = _as_dict("execution", raw.get("execution"))
    _check_keys(
        "execution",
        execution_data,
        {"parallel_jobs", "batch_size", "allow_reuse_project_sandboxes", "resume"},
    )

    try:
        config = BenjiTestConfig(
            experiment=_build_experiment(_as_dict("experiment", raw.get("experiment"))),
            llms=_build_llms(raw.get("llms")),
            strategies=_build_strategies(raw.get("strategies"), root),
            correction=_build_correction(_as_dict("correction", raw.get("correction"))),
            build=_build_build(_as_dict("build", raw.get("build"))),
            metrics=_build_metrics(_as_dict("metrics", raw.get("metrics")), root),
            reporting=ReportingConfig(
                save_candidate_test_files=bool(reporting_data.get("save_candidate_test_files", True)),
                save_error_logs=bool(reporting_data.get("save_error_logs", True)),
                output_dir=_resolve(root, reporting_data.get("output_dir", "data/raw")),
                formats=list(reporting_data.get("formats") or ["csv"]),
            ),
            logging=LoggingConfig(
                level=logging_data.get("level", "INFO"),
                save_llm_responses=bool(logging_data.get("save_llm_responses", True)),
                log_dir=_resolve(root, logging_data.get("log_dir", "logs")),
            ),
            execution=ExecutionConfig(**execution_data) if execution_data else ExecutionConfig(),
            orchestration=_build_orchestration(_as_dict("orchestration", raw.get("orchestration"))),
            dataset=_build_dataset(_as_dict("dataset", raw.get("dataset")), root),
            external_baselines=_build_external_baselines(raw.get("external_baselines")),
            orchestration_override=_build_orchestration_override(
                _as_dict("orchestration_override", raw.get("orchestration_override"))
            ),
            projects=[_resolve(root, p) for p in (raw.get("projects") or [])],
            root_dir=root,
        )
    except ConfigError:
        raise
    except ValueError as exc:  # invariants enforced in the schema dataclasses
        raise ConfigError(f"{config_path}: {exc}") from exc
    return config


def load_dataset_config(path: str | Path) -> DatasetConfig:
    """Load a standalone dataset descriptor (``config/dataset/*.yaml``)."""
    dataset_path = Path(path).expanduser().resolve()
    if not dataset_path.is_file():
        raise ConfigError(f"dataset configuration not found: {dataset_path}")
    raw = _expand_env(yaml.safe_load(dataset_path.read_text(encoding="utf-8")) or {})
    if not isinstance(raw, dict):
        raise ConfigError(f"{dataset_path}: top level of the document must be a mapping")
    _check_keys(dataset_path.name, raw, {"dataset", "probing", "reporting"})
    dataset_data = _as_dict("dataset", raw.get("dataset"))
    dataset = _build_dataset(dataset_data, _infer_root(dataset_path))
    for entry in dataset_data.get("sources") or []:
        entry = _as_dict("dataset.sources[]", entry)
        _check_keys("dataset.sources[%s]" % entry.get("name", "?"), entry,
                    {"name", "kind", "count", "filter", "filters", "source_root", "generator",
                     "randomize", "seed", "redact_identifiers"})
        dataset.sources.append(ControlSourceConfig(
            name=entry["name"], kind=entry.get("kind", "repository"),
            count=int(entry.get("count", 0)),
            filters=dict(entry.get("filter") or entry.get("filters") or {}),
            source_root=entry.get("source_root"), generator=entry.get("generator"),
            randomize=list(entry.get("randomize") or []), seed=entry.get("seed"),
            redact_identifiers=bool(entry.get("redact_identifiers", False))))
    matching_data = _as_dict("dataset.matching", dataset_data.get("matching"))
    if matching_data:
        _check_keys("dataset.matching", matching_data,
                    {"enabled", "target_dataset", "match_on", "tolerance"})
        dataset.matching = MatchingConfig(
            enabled=bool(matching_data.get("enabled", True)),
            target_dataset=matching_data.get("target_dataset", "classes2test"),
            match_on=list(matching_data.get("match_on") or []),
            tolerance=float(matching_data.get("tolerance", 0.1)))
    probing_data = _as_dict("probing", raw.get("probing"))
    if probing_data:
        _check_keys("probing", probing_data,
                    {"protocol", "few_shot_examples", "temperature", "seed",
                     "match_levels", "semantic_threshold"})
        dataset.probing = ProbingConfig(
            protocol=probing_data.get("protocol", "memorization"),
            few_shot_examples=int(probing_data.get("few_shot_examples", 2)),
            temperature=float(probing_data.get("temperature", 0.0)),
            seed=probing_data.get("seed"),
            match_levels=list(probing_data.get("match_levels")
                              or ["exact", "structural", "semantic"]),
            semantic_threshold=float(probing_data.get("semantic_threshold", 0.8)),
        )
    return dataset


def _infer_root(config_path: Path) -> Path:
    """Return the repository root a configuration file's relative paths hang off.

    ``config/experiments/foo.yaml`` and ``config/dataset/foo.yaml`` resolve
    against the repository root; any other location resolves against the file's
    own directory.
    """
    parent = config_path.parent
    if parent.name in {"experiments", "dataset"} and parent.parent.name == "config":
        return parent.parent.parent
    return parent


def _deep_merge(base: dict[str, Any], override: dict[str, Any]) -> dict[str, Any]:
    merged = dict(base)
    for key, value in override.items():
        if isinstance(value, dict) and isinstance(merged.get(key), dict):
            merged[key] = _deep_merge(merged[key], value)
        else:
            merged[key] = value
    return merged
