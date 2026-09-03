"""Command-line interface -- the User Interface & Configuration module.

Section 3.1 describes this as *"the primary control panel where the user defines
the parameters for a benchmarking run"*. Every parameter lives in the experiment
YAML; the flags here select what to run and allow targeted overrides.

Commands::

    benjitest validate   <config>          check a configuration without running
    benjitest run        <config>          run a full campaign (Algorithm 1)
    benjitest generate   <config> ...      generate for a single class
    benjitest ablation   <config>          run the four RQ2 crew configurations
    benjitest report     <config>          re-aggregate an existing results CSV
    benjitest stats      <results.csv>     Wilcoxon / Cliff's delta comparisons
    benjitest defects4j  <config>          RQ5 fault-detection evaluation
"""

from __future__ import annotations

import argparse
import csv

from .util.csvio import rows as _csvrows
import json
import logging
import sys
from collections.abc import Sequence
from pathlib import Path
from typing import Any

from . import __version__
from .config.loader import ConfigError, load_config, load_dataset_config
from .config.schema import BenjiTestConfig, StrategyType

logger = logging.getLogger("benjitest")


def main(argv: Sequence[str] | None = None) -> int:
    """CLI entry point. Returns a process exit code."""
    parser = _build_parser()
    args = parser.parse_args(argv)

    if args.command is None:
        parser.print_help()
        return 1

    _configure_logging(args.verbose)

    try:
        return int(args.handler(args) or 0)
    except ConfigError as exc:
        logger.error("configuration error: %s", exc)
        return 2
    except KeyboardInterrupt:
        logger.warning("interrupted; partial results have been written to disk")
        return 130
    except Exception as exc:
        logger.error("%s: %s", type(exc).__name__, exc)
        if args.verbose:
            raise
        return 1


# ----------------------------------------------------------------------
def _build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(
        prog="benjitest",
        description=(
            "An agentic framework for evaluating LLM-based unit test generation "
            "and correction."
        ),
    )
    parser.add_argument("--version", action="version", version=f"benjitest {__version__}")
    parser.add_argument(
        "-v", "--verbose", action="store_true", help="enable debug logging"
    )
    subparsers = parser.add_subparsers(dest="command")

    # --- validate ------------------------------------------------------
    validate = subparsers.add_parser(
        "validate", help="load and validate a configuration without running anything"
    )
    _add_config_argument(validate)
    validate.set_defaults(handler=_cmd_validate)

    # --- run -----------------------------------------------------------
    run = subparsers.add_parser("run", help="run a full campaign (Algorithm 1)")
    _add_config_argument(run)
    _add_override_arguments(run)
    run.add_argument("--workdir", help="directory for project sandboxes")
    run.add_argument(
        "--dry-run",
        action="store_true",
        help="enumerate the tasks that would run, without executing them",
    )
    run.set_defaults(handler=_cmd_run)

    # --- generate ------------------------------------------------------
    generate = subparsers.add_parser(
        "generate", help="generate a test class for a single class under test"
    )
    _add_config_argument(generate)
    generate.add_argument("--project", required=True, help="path to the Java project")
    generate.add_argument(
        "--class", dest="class_name", required=True, help="simple name of the class under test"
    )
    generate.add_argument("--model", help="LLM name from the configuration")
    generate.add_argument("--strategy", help="strategy name from the configuration")
    generate.add_argument("--output", help="write the generated test class here")
    generate.set_defaults(handler=_cmd_generate)

    # --- ablation ------------------------------------------------------
    ablation = subparsers.add_parser(
        "ablation", help="run the four crew configurations of the RQ2 ablation study"
    )
    _add_config_argument(ablation)
    _add_override_arguments(ablation)
    ablation.add_argument(
        "--model", default="gpt-4.1", help="reference engine (default: gpt-4.1)"
    )
    ablation.set_defaults(handler=_cmd_ablation)

    # --- report --------------------------------------------------------
    report = subparsers.add_parser(
        "report", help="re-aggregate an existing per-class results CSV"
    )
    _add_config_argument(report)
    report.add_argument("--input", help="per-class results CSV (default: from the config)")
    report.set_defaults(handler=_cmd_report)

    # --- stats ---------------------------------------------------------
    stats = subparsers.add_parser(
        "stats", help="pairwise Wilcoxon / Cliff's delta comparisons between strategies"
    )
    stats.add_argument("results", help="per-class results CSV")
    stats.add_argument(
        "--metric",
        default="mutation_score",
        help="metric column to compare (default: mutation_score)",
    )
    stats.add_argument("--output", help="write the comparison table here as CSV")
    stats.set_defaults(handler=_cmd_stats)

    # --- defects4j -----------------------------------------------------
    defects4j = subparsers.add_parser(
        "defects4j", help="RQ5 fault-detection evaluation on Defects4J"
    )
    _add_config_argument(defects4j)
    defects4j.add_argument(
        "--projects", help="comma-separated Defects4J projects (default: all 17)"
    )
    defects4j.add_argument("--limit-per-project", type=int, help="cap bugs per project")
    defects4j.add_argument("--workdir", help="directory for Defects4J checkouts")
    defects4j.add_argument("--model", help="LLM name from the configuration")
    defects4j.add_argument("--strategy", help="strategy name from the configuration")
    defects4j.add_argument("--output", help="write the per-bug outcomes here as CSV")
    defects4j.set_defaults(handler=_cmd_defects4j)

    return parser


def _add_config_argument(parser: argparse.ArgumentParser) -> None:
    parser.add_argument("config", help="path to the experiment YAML")


def _add_override_arguments(parser: argparse.ArgumentParser) -> None:
    parser.add_argument(
        "--models", help="comma-separated subset of the configured LLM names"
    )
    parser.add_argument(
        "--strategies", help="comma-separated subset of the configured strategy names"
    )
    parser.add_argument("--limit", type=int, help="cap the number of classes under test")
    parser.add_argument("--jobs", type=int, help="override execution.parallel_jobs")
    parser.add_argument(
        "--no-correction", action="store_true", help="disable the correction loop"
    )
    parser.add_argument(
        "--no-resume",
        action="store_true",
        help="re-run tasks already present in the results CSV",
    )


def _configure_logging(verbose: bool) -> None:
    logging.basicConfig(
        level=logging.DEBUG if verbose else logging.INFO,
        format="%(asctime)s %(levelname)-7s %(name)s: %(message)s",
        datefmt="%H:%M:%S",
    )
    if not verbose:
        # LiteLLM is extremely chatty at INFO level.
        for noisy in ("LiteLLM", "litellm", "httpx", "httpcore"):
            logging.getLogger(noisy).setLevel(logging.WARNING)


def _apply_overrides(config: BenjiTestConfig, args: argparse.Namespace) -> BenjiTestConfig:
    """Apply the CLI subset/override flags to a loaded configuration."""
    if getattr(args, "models", None):
        wanted = {name.strip() for name in args.models.split(",") if name.strip()}
        config.llms = [llm for llm in config.llms if llm.name in wanted]
        if not config.llms:
            raise ConfigError(f"no configured LLM matches {sorted(wanted)}")

    if getattr(args, "strategies", None):
        wanted = {name.strip() for name in args.strategies.split(",") if name.strip()}
        config.strategies = [s for s in config.strategies if s.name in wanted]
        if not config.strategies:
            raise ConfigError(f"no configured strategy matches {sorted(wanted)}")

    if getattr(args, "limit", None):
        config.dataset.limit = args.limit
    if getattr(args, "jobs", None):
        config.execution.parallel_jobs = args.jobs
    if getattr(args, "no_correction", False):
        config.correction.enabled = False
    if getattr(args, "no_resume", False):
        config.execution.resume = False
    return config


# ----------------------------------------------------------------------
# Commands
# ----------------------------------------------------------------------
def _cmd_validate(args: argparse.Namespace) -> int:
    # config/dataset/*.yaml are dataset descriptors, not experiments; loading one
    # as an experiment would report a missing 'llms' section rather than
    # validating what the file actually declares.
    if Path(args.config).parent.name == "dataset":
        return _validate_dataset(args.config)
    config = load_config(args.config)
    print(f"Configuration OK: {config.experiment.name}")
    print(f"  dataset:    {config.dataset.name} at {config.dataset.source_root}")
    print(f"  models:     {', '.join(llm.name for llm in config.llms)}")
    print("  strategies:")
    for strategy in config.strategies:
        if strategy.type is StrategyType.STATIC:
            # The static path bypasses the analysis agents entirely, so showing
            # their toggles here would misrepresent what actually runs.
            detail = f"prompt: {strategy.prompt_file}"
        else:
            enabled = [k for k, v in strategy.agents.as_dict().items() if v]
            detail = f"agents: {', '.join(enabled) or 'none'}"
        print(f"    - {strategy.name} ({strategy.type.value}) -- {detail}")
    print(
        f"  correction: {'enabled' if config.correction.enabled else 'disabled'} "
        f"(max {config.correction.max_attempts} attempts)"
    )
    print(f"  backend:    {config.orchestration.backend.value}")
    print(f"  output:     {config.reporting.output_dir}")
    print(f"  tasks/class: {config.total_task_count_per_class}")
    return 0


def _validate_dataset(path: str) -> int:
    dataset = load_dataset_config(path)
    print(f"Dataset configuration OK: {dataset.name}")
    print(f"  language:   {dataset.language}")
    print(f"  source:     {dataset.source_root}")
    if dataset.sources:
        print("  sources:")
        for source in dataset.sources:
            detail = source.generator or source.source_root or "repository query"
            print(f"    - {source.name} ({source.kind}, {source.count}) -- {detail}")
    if dataset.matching and dataset.matching.enabled:
        print(f"  matched to: {dataset.matching.target_dataset} "
              f"on {', '.join(dataset.matching.match_on)} "
              f"(tolerance {dataset.matching.tolerance})")
    if dataset.probing:
        print(f"  probe:      {dataset.probing.protocol}, "
              f"{dataset.probing.few_shot_examples} examples, "
              f"threshold {dataset.probing.semantic_threshold}, "
              f"levels {', '.join(dataset.probing.match_levels)}")
    return 0


def _cmd_run(args: argparse.Namespace) -> int:
    from .coordinator import Coordinator

    config = _apply_overrides(load_config(args.config), args)

    if args.dry_run:
        coordinator = Coordinator(config, workdir=args.workdir)
        grouped = coordinator._resolve_targets()
        total = sum(len(v) for v in grouped.values()) * config.total_task_count_per_class
        print(f"{len(grouped)} project(s), {total} task(s) would be executed:")
        for project_id, targets in list(grouped.items())[:20]:
            print(f"  {project_id}: {len(targets)} class(es)")
        if len(grouped) > 20:
            print(f"  ... and {len(grouped) - 20} more project(s)")
        return 0

    summary = Coordinator(config, workdir=args.workdir).run()

    print("\n=== Campaign summary ===")
    print(f"projects processed: {summary.projects_processed} "
          f"(skipped: {summary.projects_skipped})")
    print(f"tasks executed:     {summary.tasks_executed} "
          f"(skipped: {summary.tasks_skipped}, failed: {summary.tasks_failed})")
    print(f"duration:           {summary.duration_seconds / 60:.1f} min")
    for key, value in summary.report.items():
        print(f"  {key}: {value}")
    print(f"LLM usage: {json.dumps(summary.llm_usage)}")
    return 0


def _cmd_generate(args: argparse.Namespace) -> int:
    """Generate a suite for one class: the fastest way to smoke-test a setup."""
    from .agents.base import CrewContext
    from .build.integration import BuildSystem
    from .coordinator import Coordinator, Task
    from .datasets.base import TargetClass

    config = load_config(args.config)
    llm = config.llm(args.model) if args.model else config.llms[0]
    strategy = config.strategy(args.strategy) if args.strategy else config.strategies[0]

    coordinator = Coordinator(config)
    project_root = Path(args.project).resolve()

    from .java.project import find_class_file

    source_path = find_class_file(project_root, args.class_name)
    if source_path is None:
        logger.error("class %s not found under %s", args.class_name, project_root)
        return 2

    target = TargetClass(
        project_id=project_root.name,
        project_root=project_root,
        source_path=source_path,
    )

    build_system = BuildSystem(config.build)
    repository_crew = coordinator.crew_factory.build_repository_crew(build_system)
    context = CrewContext(
        project_root=project_root, workdir=coordinator.workdir / project_root.name
    )
    repository_result = repository_crew.kickoff(context)
    if not repository_result.ok:
        logger.error("project preparation failed: %s", repository_result.error)
        return 1

    record = coordinator._execute_task(
        Task(target=target, llm=llm, strategy=strategy),
        context["sandbox"],
        repository_result.final or "",
        context.get("project_types") or {},
        context["build_metadata"],
    )

    print(json.dumps(record.to_row(), indent=2))
    if args.output and record.test_file:
        source = Path(config.reporting.output_dir) / record.test_file
        if source.is_file():
            Path(args.output).write_text(source.read_text(encoding="utf-8"), encoding="utf-8")
            print(f"\ntest class written to {args.output}")
    return 0 if record.compiled else 1


def _cmd_ablation(args: argparse.Namespace) -> int:
    from .coordinator import Coordinator
    from .evaluation.ablation import ABLATION_CONFIGURATIONS, build_ablation_config

    base = _apply_overrides(load_config(args.config), args)
    config = build_ablation_config(base, model=args.model)

    print(f"Ablation study with reference engine '{args.model}':")
    for configuration in ABLATION_CONFIGURATIONS:
        print(f"  - {configuration.name}: {configuration.description}")

    summary = Coordinator(config).run()
    print(f"\ntasks executed: {summary.tasks_executed}")
    for key, value in summary.report.items():
        print(f"  {key}: {value}")
    return 0


def _cmd_report(args: argparse.Namespace) -> int:
    from .metrics.aggregate import ClassObservation, aggregate
    from .metrics.model import REPORTED_SMELLS
    from .report.generator import AGGREGATE_COLUMNS

    config = load_config(args.config)
    input_path = Path(args.input) if args.input else config.reporting.output_dir / "per_class_results.csv"
    if not input_path.is_file():
        logger.error("results file not found: %s", input_path)
        return 2

    grouped: dict[tuple[str, str], list[ClassObservation]] = {}
    with input_path.open(encoding="utf-8", newline="") as handle:
        for row in _csvrows(handle):
            key = (row["model"], row["strategy"])
            grouped.setdefault(key, []).append(
                ClassObservation(
                    class_id=row.get("qualified_name", ""),
                    compiled=row.get("compiled") == "1",
                    compiled_initially=row.get("compiled_initially") == "1",
                    attempts=int(row["attempts"]) if row.get("attempts") else None,
                    line_coverage=_float(row.get("line_coverage")),
                    branch_coverage=_float(row.get("branch_coverage")),
                    method_coverage=_float(row.get("method_coverage")),
                    mutation_score=_float(row.get("mutation_score")),
                    smells={s: int(_float(row.get(s))) for s in REPORTED_SMELLS},
                )
            )

    rows = [
        aggregate(observations, model=model, strategy=strategy).to_row()
        for (model, strategy), observations in sorted(grouped.items())
    ]
    output = config.reporting.output_dir / "metrics_per_model_strategy.csv"
    with output.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=AGGREGATE_COLUMNS)
        writer.writeheader()
        writer.writerows(rows)

    print(f"wrote {len(rows)} aggregate row(s) to {output}")
    for row in rows:
        print(
            f"  {row['model']:<16} {row['prompt_name']:<14} "
            f"CR {row['CR_initial']}% -> {row['CR_after_fix']}%  "
            f"MS {row['mutation_score']}%  LC {row['line_coverage']}%"
        )
    return 0


def _cmd_stats(args: argparse.Namespace) -> int:
    from .evaluation.statistics import align_samples, pairwise_comparisons

    path = Path(args.results)
    if not path.is_file():
        logger.error("results file not found: %s", path)
        return 2

    # model -> strategy -> {class_id: value}
    by_model: dict[str, dict[str, dict[str, float]]] = {}
    with path.open(encoding="utf-8", newline="") as handle:
        for row in _csvrows(handle):
            if args.metric not in row:
                logger.error("column '%s' is not present in %s", args.metric, path)
                return 2
            by_model.setdefault(row["model"], {}).setdefault(row["strategy"], {})[
                row.get("qualified_name", "")
            ] = _float(row.get(args.metric))

    results = []
    for model, strategies in sorted(by_model.items()):
        if len(strategies) < 2:
            continue
        class_ids, aligned = align_samples(strategies)
        if not class_ids:
            logger.warning("model %s: no classes are shared by all strategies", model)
            continue
        results.extend(pairwise_comparisons(aligned, model=model, metric=args.metric))

    if not results:
        print("no comparable strategy pairs were found")
        return 1

    print(f"{len(results)} pairwise comparison(s) on '{args.metric}':\n")
    for result in results:
        marker = "*" if result.significant else " "
        saturated = " [p saturated]" if result.p_saturated else ""
        print(
            f"{marker} {result.model:<16} {result.strategy_a:>14} vs "
            f"{result.strategy_b:<14} n={result.n:<6} "
            f"delta={result.cliffs_delta:+.3f} ({result.effect_size}){saturated}"
        )
    print(
        "\nEffect size, not p, carries the interpretation: at this sample size "
        "significance is automatic."
    )

    if args.output:
        rows = [result.to_row() for result in results]
        with Path(args.output).open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=list(rows[0]))
            writer.writeheader()
            writer.writerows(rows)
        print(f"wrote {len(rows)} row(s) to {args.output}")
    return 0


def _cmd_defects4j(args: argparse.Namespace) -> int:
    from .agents.base import CrewContext
    from .build.integration import BuildSystem
    from .coordinator import Coordinator
    from .datasets.defects4j import (
        DEFECTS4J_PROJECTS,
        Defects4JDataset,
        evaluate_fault_detection,
    )
    from .java.parser import parse_file

    config = load_config(args.config)
    llm = config.llm(args.model) if args.model else config.llms[0]
    strategy = config.strategy(args.strategy) if args.strategy else config.strategies[0]

    projects = (
        [p.strip() for p in args.projects.split(",") if p.strip()]
        if args.projects
        else list(DEFECTS4J_PROJECTS)
    )
    workdir = Path(args.workdir or config.root_dir / ".benjitest" / "defects4j")

    dataset = Defects4JDataset(
        workdir=workdir, projects=projects, limit_per_project=args.limit_per_project
    )
    coordinator = Coordinator(config, dataset=dataset, workdir=workdir / "sandboxes")
    build_system = BuildSystem(config.build)

    outcomes = []
    for target in dataset.iter_targets():
        bug = target.metadata["bug"]
        cut = parse_file(target.source_path, target_class=target.source_path.stem)

        context = CrewContext(
            cut=cut,
            build_metadata=build_system.resolve_metadata(target.project_root),
            project_tree="",
            project_types={},
        )
        if strategy.prompt_file:
            context["static_prompt"] = coordinator._render_static_prompt(
                strategy, cut, context
            )
        crew = coordinator.crew_factory.build_generation_crew(strategy, llm)
        crew.kickoff(context)

        test_code = context.get("test_code")
        if not test_code:
            logger.info("%s: no test generated for %s", bug.key, cut.qualified_name)
            continue

        outcome = evaluate_fault_detection(
            dataset=dataset,
            bug=bug,
            target_class=cut.qualified_name,
            test_code=test_code,
            test_class_name=context.get("test_class_name") or f"{cut.name}Test",
            test_package=context.get("test_package") or cut.package,
            build_system=build_system,
            workdir=workdir / "sandboxes",
        )
        outcomes.append(outcome)
        logger.info(
            "%s %s: %s", bug.key, cut.qualified_name,
            "DETECTED" if outcome.detected else f"not detected ({outcome.note})",
        )

    detected = sum(1 for o in outcomes if o.detected)
    total = len(outcomes)
    print(f"\nFault Detection Rate: {detected}/{total} = "
          f"{100.0 * detected / total if total else 0:.1f}%")

    if args.output and outcomes:
        rows = [
            {
                "project": o.bug.project,
                "bug_id": o.bug.bug_id,
                "target_class": o.target_class,
                "compiled_on_buggy": int(o.compiled_on_buggy),
                "failed_on_buggy": int(o.failed_on_buggy),
                "passed_on_fixed": int(o.passed_on_fixed),
                "detected": int(o.detected),
                "note": o.note,
            }
            for o in outcomes
        ]
        with Path(args.output).open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=list(rows[0]))
            writer.writeheader()
            writer.writerows(rows)
        print(f"wrote {len(rows)} row(s) to {args.output}")
    return 0


def _float(value: Any) -> float:
    try:
        return float(value)
    except (TypeError, ValueError):
        return 0.0


if __name__ == "__main__":  # pragma: no cover
    sys.exit(main())
