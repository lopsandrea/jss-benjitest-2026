"""The per-task record produced by every generation."""

from __future__ import annotations

from dataclasses import dataclass, field
from typing import Any

from ..metrics.model import REPORTED_SMELLS, TestMetrics


@dataclass(slots=True)
class GenerationRecord:
    """Outcome of one <project, class, model, strategy> tuple.

    This is the atomic unit written to ``data/raw/per_class_results.csv`` and
    aggregated into the model/strategy table of the paper. Failed builds are
    recorded with zero metric values rather than omitted, as required by Phase 3
    of the workflow.
    """

    project_id: str
    class_name: str
    qualified_name: str
    model: str
    strategy: str

    #: Compiled on the first attempt, before any correction.
    compiled_initially: bool = False
    #: Compiled after the correction loop exhausted its attempts.
    compiled: bool = False
    tests_passed: bool = False
    #: Total generation attempts, ``None`` when the class never compiled.
    attempts: int | None = None
    correction_iterations: int = 0
    correction_termination: str = "not_attempted"

    metrics: TestMetrics = field(default_factory=TestMetrics)

    #: Category of the first error encountered, for the Table 8 breakdown.
    initial_error_category: str | None = None
    initial_error_phase: str | None = None
    #: Whether that error was ultimately resolved.
    error_resolved: bool = False

    tests_run: int = 0
    test_failures: int = 0

    prompt_tokens: int = 0
    completion_tokens: int = 0
    duration_seconds: float = 0.0
    #: Populated when the tuple failed before producing any code.
    error: str | None = None
    #: Relative path of the saved candidate test file, when saving is enabled.
    test_file: str | None = None

    @property
    def key(self) -> tuple[str, str, str, str]:
        return (self.project_id, self.qualified_name, self.model, self.strategy)

    @property
    def total_tokens(self) -> int:
        return self.prompt_tokens + self.completion_tokens

    def to_row(self) -> dict[str, Any]:
        """Flatten into a CSV row."""
        row: dict[str, Any] = {
            "project_id": self.project_id,
            "class_name": self.class_name,
            "qualified_name": self.qualified_name,
            "model": self.model,
            "strategy": self.strategy,
            "compiled_initially": int(self.compiled_initially),
            "compiled": int(self.compiled),
            "tests_passed": int(self.tests_passed),
            "attempts": self.attempts if self.attempts is not None else "",
            "correction_iterations": self.correction_iterations,
            "correction_termination": self.correction_termination,
            "line_coverage": round(self.metrics.coverage.line, 2),
            "branch_coverage": round(self.metrics.coverage.branch, 2),
            "method_coverage": round(self.metrics.coverage.method, 2),
            "mutation_score": round(self.metrics.mutation.score, 2),
            "mutants_killed": self.metrics.mutation.killed,
            "mutants_survived": self.metrics.mutation.survived,
            "mutants_excluded": self.metrics.mutation.excluded,
            "smell_detector": self.metrics.smells.detector,
        }
        for acronym in REPORTED_SMELLS:
            row[acronym] = self.metrics.smells.counts.get(acronym, 0)
        row.update(
            {
                "initial_error_category": self.initial_error_category or "",
                "initial_error_phase": self.initial_error_phase or "",
                "error_resolved": int(self.error_resolved),
                "tests_run": self.tests_run,
                "test_failures": self.test_failures,
                "prompt_tokens": self.prompt_tokens,
                "completion_tokens": self.completion_tokens,
                "duration_seconds": round(self.duration_seconds, 2),
                "error": self.error or "",
                "test_file": self.test_file or "",
            }
        )
        return row

    @classmethod
    def csv_columns(cls) -> list[str]:
        template = cls(
            project_id="", class_name="", qualified_name="", model="", strategy=""
        )
        return list(template.to_row().keys())
