"""Report Generator Module (Section 3.1, module 5).

Computes the quality metrics for a successfully built suite, records failed
builds with zero metric values, streams per-task rows to disk, and emits the
aggregate tables the paper reports.

Rows are appended as they are produced rather than buffered until the end: a
campaign of this length will be interrupted, and a partially written CSV is the
difference between resuming and starting over.
"""

from __future__ import annotations

import csv

from ..util.csvio import rows as _csvrows
import logging
import threading
from collections import Counter
from pathlib import Path

from ..build.errors import ErrorCategory, ErrorPhase
from ..build.integration import BuildResult, BuildSystem
from ..build.sandbox import Sandbox
from ..config.schema import MetricsConfig, ReportingConfig
from ..correction.loop import CorrectionResult
from ..java.model import JavaClass
from ..metrics import coverage as coverage_module
from ..metrics import mutation as mutation_module
from ..metrics import smells as smells_module
from ..metrics.aggregate import AggregateMetrics, ClassObservation, aggregate
from ..metrics.model import REPORTED_SMELLS, TEST_SMELLS, TestMetrics
from .records import GenerationRecord

logger = logging.getLogger(__name__)

PER_CLASS_FILENAME = "per_class_results.csv"
AGGREGATE_FILENAME = "metrics_per_model_strategy.csv"
CORRECTION_FILENAME = "correction_loop_breakdown.csv"

#: Column order of ``data/raw/metrics_per_model_strategy.csv``.
AGGREGATE_COLUMNS = [
    "model",
    "prompt_name",
    "branch_coverage",
    "line_coverage",
    "method_coverage",
    "mutation_score",
    *REPORTED_SMELLS,
    "CR_initial",
    "CR_after_fix",
    "num_attempts",
]


class ReportGenerator:
    """Collects metrics and writes the campaign's output files.

    Args:
        reporting: Reporting settings from the experiment YAML.
        metrics_config: Which metrics to compute.
        build_system: Used to drive JaCoCo and PIT.
    """

    def __init__(
        self,
        reporting: ReportingConfig,
        metrics_config: MetricsConfig,
        *,
        build_system: BuildSystem,
    ) -> None:
        self.reporting = reporting
        self.metrics_config = metrics_config
        self.build_system = build_system
        self.output_dir = Path(reporting.output_dir)
        self.output_dir.mkdir(parents=True, exist_ok=True)
        self.records: list[GenerationRecord] = []
        self._lock = threading.Lock()
        self._per_class_path = self.output_dir / PER_CLASS_FILENAME
        self._header_written = self._per_class_path.is_file()

    # ------------------------------------------------------------------
    # Metric collection
    # ------------------------------------------------------------------
    def compute_metrics(
        self,
        *,
        sandbox: Sandbox,
        cut: JavaClass,
        test_code: str,
        test_class_qualified_name: str,
        build_result: BuildResult,
        coverage_already_reported: bool = False,
    ) -> TestMetrics:
        """Compute coverage, mutation score, and smells for a built suite.

        On a failed build the metric set is returned untouched -- all zeros --
        which is what Phase 3 of the workflow prescribes.
        """
        metrics = TestMetrics()
        if not build_result.compiled:
            return metrics

        if self.metrics_config.coverage.enabled:
            try:
                metrics.coverage = coverage_module.collect(
                    sandbox,
                    cut.qualified_name,
                    build_system=self.build_system,
                    already_reported=coverage_already_reported,
                )
            except Exception as exc:  # noqa: BLE001 - a metric failure is not fatal
                logger.warning("coverage collection failed for %s: %s", cut.qualified_name, exc)

        if self.metrics_config.mutation.enabled:
            try:
                metrics.mutation = mutation_module.collect(
                    sandbox,
                    cut.qualified_name,
                    test_class_qualified_name,
                    build_system=self.build_system,
                    threads=self.metrics_config.mutation.threads,
                    excluded_statuses=frozenset(self.metrics_config.mutation.excluded_statuses),
                    deduplicate=self.metrics_config.mutation.deduplicate,
                    target_only_cut=self.metrics_config.mutation.target_only_cut,
                )
            except Exception as exc:  # noqa: BLE001
                logger.warning("mutation analysis failed for %s: %s", cut.qualified_name, exc)

        if self.metrics_config.smells.enabled:
            try:
                metrics.smells = smells_module.collect(
                    test_code,
                    test_file=sandbox.installed_test,
                    production_file=cut.source_path,
                    production_class=cut,
                    tsdetect_jar=self.metrics_config.smells.tsdetect_jar,
                )
            except Exception as exc:  # noqa: BLE001
                logger.warning("smell detection failed for %s: %s", cut.qualified_name, exc)

        return metrics

    # ------------------------------------------------------------------
    # Recording
    # ------------------------------------------------------------------
    def record(self, record: GenerationRecord) -> None:
        """Append a completed task record and stream it to disk."""
        with self._lock:
            self.records.append(record)
            self._append_row(record)

    def _append_row(self, record: GenerationRecord) -> None:
        row = record.to_row()
        write_header = not self._header_written
        with self._per_class_path.open("a", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=GenerationRecord.csv_columns())
            if write_header:
                writer.writeheader()
                self._header_written = True
            writer.writerow(row)

    def save_test_file(
        self,
        record: GenerationRecord,
        test_code: str,
        *,
        test_class_name: str,
    ) -> str | None:
        """Persist a candidate test file under ``generated_tests/<project>/``."""
        if not self.reporting.save_candidate_test_files:
            return None
        directory = self.output_dir / "generated_tests" / record.project_id
        directory.mkdir(parents=True, exist_ok=True)
        filename = f"{record.model}__{record.strategy}__{test_class_name}.java"
        path = directory / filename
        path.write_text(test_code, encoding="utf-8")
        return str(path.relative_to(self.output_dir))

    def save_error_log(self, record: GenerationRecord, log: str) -> None:
        """Persist a build log for a failed task."""
        if not self.reporting.save_error_logs or not log:
            return
        directory = self.output_dir / "error_logs" / record.project_id
        directory.mkdir(parents=True, exist_ok=True)
        filename = f"{record.model}__{record.strategy}__{record.class_name}.log"
        (directory / filename).write_text(log, encoding="utf-8")

    # ------------------------------------------------------------------
    # Resumption
    # ------------------------------------------------------------------
    def completed_keys(self) -> set[tuple[str, str, str, str]]:
        """Read back the tuples already present in the output CSV.

        Used by ``execution.resume`` so an interrupted campaign continues rather
        than repeating millions of LLM calls.
        """
        if not self._per_class_path.is_file():
            return set()
        keys: set[tuple[str, str, str, str]] = set()
        try:
            with self._per_class_path.open(encoding="utf-8", newline="") as handle:
                for row in _csvrows(handle):
                    keys.add(
                        (
                            row.get("project_id", ""),
                            row.get("qualified_name", ""),
                            row.get("model", ""),
                            row.get("strategy", ""),
                        )
                    )
        except OSError as exc:
            logger.warning("could not read %s for resumption: %s", self._per_class_path, exc)
        return keys

    # ------------------------------------------------------------------
    # Aggregation
    # ------------------------------------------------------------------
    def aggregate_all(self) -> list[AggregateMetrics]:
        """Aggregate the collected records per <model, strategy> pair."""
        grouped: dict[tuple[str, str], list[ClassObservation]] = {}
        for record in self.records:
            observation = ClassObservation(
                class_id=record.qualified_name,
                compiled=record.compiled,
                compiled_initially=record.compiled_initially,
                attempts=record.attempts,
                line_coverage=record.metrics.coverage.line,
                branch_coverage=record.metrics.coverage.branch,
                method_coverage=record.metrics.coverage.method,
                mutation_score=record.metrics.mutation.score,
                smells=dict(record.metrics.smells.counts),
            )
            grouped.setdefault((record.model, record.strategy), []).append(observation)

        return [
            aggregate(observations, model=model, strategy=strategy)
            for (model, strategy), observations in sorted(grouped.items())
        ]

    def write_aggregate(self, path: str | Path | None = None) -> Path:
        """Write ``metrics_per_model_strategy.csv``."""
        target = Path(path) if path else self.output_dir / AGGREGATE_FILENAME
        rows = [item.to_row() for item in self.aggregate_all()]
        with target.open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(handle, fieldnames=AGGREGATE_COLUMNS)
            writer.writeheader()
            writer.writerows(rows)
        logger.info("wrote %d aggregate row(s) to %s", len(rows), target)
        return target

    def write_correction_breakdown(self, path: str | Path | None = None) -> Path:
        """Write the Table 8 breakdown: error frequency and per-category fix rate."""
        target = Path(path) if path else self.output_dir / CORRECTION_FILENAME

        frequency: Counter[str] = Counter()
        resolved: Counter[str] = Counter()
        for record in self.records:
            category = record.initial_error_category
            if not category:
                continue
            frequency[category] += 1
            if record.error_resolved:
                resolved[category] += 1

        total = sum(frequency.values())
        rows = []
        for category in ErrorCategory:
            count = frequency.get(category.value, 0)
            if not count and category is ErrorCategory.OTHER:
                continue
            rows.append(
                {
                    "phase": category.phase.value,
                    "error_type": category.value,
                    "frequency_percent": round(100.0 * count / total, 1) if total else 0.0,
                    "fix_rate_percent": (
                        round(100.0 * resolved.get(category.value, 0) / count, 1)
                        if count
                        else 0.0
                    ),
                    "count": count,
                    "fixed": resolved.get(category.value, 0),
                }
            )

        with target.open("w", encoding="utf-8", newline="") as handle:
            writer = csv.DictWriter(
                handle,
                fieldnames=[
                    "phase",
                    "error_type",
                    "frequency_percent",
                    "fix_rate_percent",
                    "count",
                    "fixed",
                ],
            )
            writer.writeheader()
            writer.writerows(rows)
        logger.info("wrote correction breakdown to %s", target)
        return target

    def weighted_fix_rate(self) -> float:
        """Frequency-weighted mean fix rate, the summary figure of Table 8."""
        frequency: Counter[str] = Counter()
        resolved: Counter[str] = Counter()
        for record in self.records:
            if record.initial_error_category:
                frequency[record.initial_error_category] += 1
                if record.error_resolved:
                    resolved[record.initial_error_category] += 1
        total = sum(frequency.values())
        if not total:
            return 0.0
        return 100.0 * sum(resolved.values()) / total

    # ------------------------------------------------------------------
    def summary(self) -> dict[str, object]:
        """Campaign-level summary printed at the end of a run."""
        total = len(self.records)
        compiled = sum(1 for r in self.records if r.compiled)
        compiled_initially = sum(1 for r in self.records if r.compiled_initially)
        return {
            "tasks": total,
            "compiled": compiled,
            "compilation_rate": round(100.0 * compiled / total, 1) if total else 0.0,
            "initial_compilation_rate": (
                round(100.0 * compiled_initially / total, 1) if total else 0.0
            ),
            "weighted_fix_rate": round(self.weighted_fix_rate(), 1),
            "prompt_tokens": sum(r.prompt_tokens for r in self.records),
            "completion_tokens": sum(r.completion_tokens for r in self.records),
        }


def build_record_from_result(
    *,
    project_id: str,
    cut: JavaClass,
    model: str,
    strategy: str,
    initial_result: BuildResult | None,
    correction: CorrectionResult | None,
    final_result: BuildResult | None,
    metrics: TestMetrics,
) -> GenerationRecord:
    """Assemble a :class:`GenerationRecord` from the pieces of one task."""
    record = GenerationRecord(
        project_id=project_id,
        class_name=cut.name,
        qualified_name=cut.qualified_name,
        model=model,
        strategy=strategy,
        metrics=metrics,
    )

    if initial_result is not None:
        record.compiled_initially = initial_result.compiled
        category = initial_result.report.dominant_category
        if category is not None:
            record.initial_error_category = category.value
            record.initial_error_phase = category.phase.value
        elif initial_result.failed:
            record.initial_error_phase = ErrorPhase.UNKNOWN.value

    result = final_result or initial_result
    if result is not None:
        record.compiled = result.compiled
        record.tests_passed = result.tests_passed
        record.tests_run = result.tests_run
        record.test_failures = result.failures + result.errors_count

    if correction is not None:
        record.correction_iterations = correction.correction_iterations
        record.correction_termination = correction.termination
        record.attempts = correction.total_attempts if correction.fixed else None
    elif record.compiled:
        record.attempts = 1

    # An error counts as resolved when the loop ended with a compiling suite that
    # did not compile initially, or when there was never an error to begin with.
    record.error_resolved = record.compiled and bool(record.initial_error_category)
    return record


__all__ = [
    "AGGREGATE_COLUMNS",
    "AGGREGATE_FILENAME",
    "CORRECTION_FILENAME",
    "PER_CLASS_FILENAME",
    "TEST_SMELLS",
    "GenerationRecord",
    "ReportGenerator",
    "build_record_from_result",
]
