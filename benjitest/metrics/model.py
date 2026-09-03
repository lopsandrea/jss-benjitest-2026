"""Metric containers produced by the Report Generator Module."""

from __future__ import annotations

from dataclasses import dataclass, field

#: The 19 test smells detected by tsDetect, with the acronyms of Table 3.
TEST_SMELLS: dict[str, str] = {
    "AR": "Assertion Roulette",
    "CTL": "Conditional Test Logic",
    "CI": "Constructor Initialization",
    "DT": "Default Test",
    "DA": "Duplicate Assert",
    "EA": "Eager Test",
    "EM": "Empty Test",
    "EH": "Exception Handling",
    "GF": "General Fixture",
    "IT": "Ignored Test",
    "LT": "Lazy Test",
    "MNT": "Magic Number Test",
    "MG": "Mystery Guest",
    "RP": "Redundant Print",
    "RA": "Redundant Assertion",
    "RO": "Resource Optimism",
    "SE": "Sensitive Equality",
    "ST": "Sleepy Test",
    "UT": "Unknown Test",
}

#: The eight smells reported per model/strategy in the main results table
#: (``metrics_per_model_strategy.csv``).
REPORTED_SMELLS: tuple[str, ...] = ("AR", "EH", "MG", "EA", "LT", "UT", "RO", "MNT")


@dataclass(slots=True)
class CoverageMetrics:
    """JaCoCo coverage of the class under test, in percent."""

    line: float = 0.0
    branch: float = 0.0
    method: float = 0.0
    #: Absolute counters, retained so aggregates can be recomputed from raw data.
    lines_covered: int = 0
    lines_missed: int = 0
    branches_covered: int = 0
    branches_missed: int = 0
    methods_covered: int = 0
    methods_missed: int = 0
    available: bool = False

    @property
    def total_methods(self) -> int:
        return self.methods_covered + self.methods_missed


@dataclass(slots=True)
class MutationMetrics:
    """PIT mutation analysis restricted to the class under test."""

    score: float = 0.0
    killed: int = 0
    survived: int = 0
    #: Mutants excluded from the denominator: non-viable, memory errors, run
    #: errors, timeouts, and duplicates (Section 4.5).
    excluded: int = 0
    duplicates_removed: int = 0
    available: bool = False

    @property
    def total_valid(self) -> int:
        """Denominator of the mutation score: killed + survived valid mutants."""
        return self.killed + self.survived


@dataclass(slots=True)
class SmellMetrics:
    """Test-smell counts keyed by acronym."""

    counts: dict[str, int] = field(default_factory=lambda: {k: 0 for k in TEST_SMELLS})
    #: Which detector produced these counts: ``tsdetect`` or ``builtin``.
    detector: str = "none"
    available: bool = False

    @property
    def total(self) -> int:
        return sum(self.counts.values())

    def reported(self) -> dict[str, int]:
        """The eight smells appearing in the main results table."""
        return {key: self.counts.get(key, 0) for key in REPORTED_SMELLS}


@dataclass(slots=True)
class TestMetrics:
    """The complete metric set for one <project, class, model, strategy> tuple."""

    #: The name begins with "Test", so pytest tries to collect it whenever a test
    #: module imports it. It is a data container, not a test case.
    __test__ = False

    coverage: CoverageMetrics = field(default_factory=CoverageMetrics)
    mutation: MutationMetrics = field(default_factory=MutationMetrics)
    smells: SmellMetrics = field(default_factory=SmellMetrics)

    def to_row(self) -> dict[str, float | int]:
        """Flatten into the column layout of ``metrics_per_model_strategy.csv``."""
        row: dict[str, float | int] = {
            "branch_coverage": round(self.coverage.branch, 2),
            "line_coverage": round(self.coverage.line, 2),
            "method_coverage": round(self.coverage.method, 2),
            "mutation_score": round(self.mutation.score, 2),
        }
        row.update(self.smells.reported())
        return row
