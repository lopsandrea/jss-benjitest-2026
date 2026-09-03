"""Evaluation protocol of Section 4.6.

Given per-class observations, this module computes exactly the quantities the
paper reports:

*Compiled-only average* over the ``N_c`` classes whose suite compiled

.. math:: \\overline{m} = \\frac{1}{N_c}\\sum_i \\mathrm{build}_i \\cdot m_i

*Pessimistic average*, which scores every non-compiled class as zero and bounds
the bias of the scheme above

.. math:: \\overline{m}_p = \\frac{1}{N}\\sum_i \\mathrm{build}_i \\cdot m_i

*Full-set compilation rate* :math:`R_{\\mathrm{build}} = N_c / N`.

Reporting both averages is what makes the comparison fair: compiled-only
averaging favours strategies that compile rarely, since only the easy classes
reach the average.
"""

from __future__ import annotations

from dataclasses import dataclass, field
from statistics import mean

from .model import REPORTED_SMELLS, TEST_SMELLS


@dataclass(slots=True)
class ClassObservation:
    """One <project, class, model, strategy> outcome."""

    class_id: str
    #: Whether the suite compiled after the correction loop; the ``build_i``
    #: indicator of Section 4.6.
    compiled: bool
    #: Whether it compiled on the first attempt, before any correction.
    compiled_initially: bool = False
    #: Generation attempts including the initial one; ``None`` when never compiled.
    attempts: int | None = None
    line_coverage: float = 0.0
    branch_coverage: float = 0.0
    method_coverage: float = 0.0
    mutation_score: float = 0.0
    smells: dict[str, int] = field(default_factory=dict)


@dataclass(slots=True)
class AggregateMetrics:
    """Aggregated results for one <model, strategy> pair."""

    model: str
    strategy: str
    n_total: int = 0
    n_compiled: int = 0
    n_compiled_initially: int = 0

    #: Compiled-only averages.
    line_coverage: float = 0.0
    branch_coverage: float = 0.0
    method_coverage: float = 0.0
    mutation_score: float = 0.0

    #: Pessimistic averages (non-compiled classes count as zero).
    line_coverage_pessimistic: float = 0.0
    branch_coverage_pessimistic: float = 0.0
    method_coverage_pessimistic: float = 0.0
    mutation_score_pessimistic: float = 0.0

    smells: dict[str, float] = field(default_factory=dict)
    num_attempts: float = 0.0

    @property
    def cr_initial(self) -> float:
        """Percentage compiling on the first attempt, before correction."""
        return 100.0 * self.n_compiled_initially / self.n_total if self.n_total else 0.0

    @property
    def cr_after_fix(self) -> float:
        """Full-set compilation rate after the correction loop."""
        return 100.0 * self.n_compiled / self.n_total if self.n_total else 0.0

    @property
    def correction_fix_rate(self) -> float:
        """Share of initially failing suites rescued by the correction loop.

        This is the quantity discussed in Section 5.3: for gemini-1.5-pro
        zero-shot, 35% -> 80% is a 69.2% fix rate over the 65% that failed.
        """
        initially_failed = self.n_total - self.n_compiled_initially
        if initially_failed <= 0:
            return 0.0
        rescued = self.n_compiled - self.n_compiled_initially
        return 100.0 * rescued / initially_failed

    def to_row(self) -> dict[str, object]:
        """Row matching ``data/raw/metrics_per_model_strategy.csv``."""
        row: dict[str, object] = {
            "model": self.model,
            "prompt_name": self.strategy,
            "branch_coverage": round(self.branch_coverage, 1),
            "line_coverage": round(self.line_coverage, 1),
            "method_coverage": round(self.method_coverage, 1),
            "mutation_score": round(self.mutation_score, 1),
        }
        for acronym in REPORTED_SMELLS:
            row[acronym] = round(self.smells.get(acronym, 0.0), 2)
        row["CR_initial"] = round(self.cr_initial)
        row["CR_after_fix"] = round(self.cr_after_fix)
        row["num_attempts"] = round(self.num_attempts, 2)
        return row


def aggregate(
    observations: list[ClassObservation], *, model: str, strategy: str
) -> AggregateMetrics:
    """Apply the Section 4.6 protocol to a list of per-class observations."""
    total = len(observations)
    compiled = [obs for obs in observations if obs.compiled]
    result = AggregateMetrics(
        model=model,
        strategy=strategy,
        n_total=total,
        n_compiled=len(compiled),
        n_compiled_initially=sum(1 for obs in observations if obs.compiled_initially),
    )
    if total == 0:
        return result

    for attribute in ("line_coverage", "branch_coverage", "method_coverage", "mutation_score"):
        values = [getattr(obs, attribute) for obs in compiled]
        compiled_only = mean(values) if values else 0.0
        setattr(result, attribute, compiled_only)
        # Pessimistic: same numerator, but divided by the full set.
        setattr(
            result,
            f"{attribute}_pessimistic",
            sum(values) / total if total else 0.0,
        )

    result.smells = {
        acronym: (
            mean([obs.smells.get(acronym, 0) for obs in compiled]) if compiled else 0.0
        )
        for acronym in TEST_SMELLS
    }

    # "If a test class never compiles within the limit, it is excluded from this
    # average to avoid skewing the metric with failures." (Section 4.5)
    attempt_values = [
        obs.attempts for obs in compiled if obs.attempts is not None and obs.attempts > 0
    ]
    result.num_attempts = mean(attempt_values) if attempt_values else 0.0
    return result


def compiled_only_average(values: list[float], build_flags: list[bool]) -> float:
    """Direct implementation of :math:`\\overline{m}` for auditing purposes."""
    if len(values) != len(build_flags):
        raise ValueError("values and build_flags must have the same length")
    selected = [value for value, built in zip(values, build_flags, strict=True) if built]
    return mean(selected) if selected else 0.0


def pessimistic_average(values: list[float], build_flags: list[bool]) -> float:
    """Direct implementation of :math:`\\overline{m}_p`."""
    if len(values) != len(build_flags):
        raise ValueError("values and build_flags must have the same length")
    if not values:
        return 0.0
    total = sum(value for value, built in zip(values, build_flags, strict=True) if built)
    return total / len(values)


def build_rate(build_flags: list[bool]) -> float:
    """Full-set compilation rate :math:`R_{\\mathrm{build}}`, in percent."""
    if not build_flags:
        return 0.0
    return 100.0 * sum(build_flags) / len(build_flags)
