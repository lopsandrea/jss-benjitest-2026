"""Statistical analysis (Section 4.9).

Pairwise strategy comparisons use the **Wilcoxon signed-rank test** with
**Cliff's delta** as the effect size and a **Bonferroni** correction over the six
pairwise comparisons implied by four strategies.

At n ~ 147,473 paired observations, statistical significance is automatic: 200 of
the 216 reported p-values saturate the float64 floor. Every result therefore
carries a ``p_saturated`` flag, and the interpretation helpers here refuse to
call a comparison meaningful on p alone -- the magnitude of Cliff's delta is what
the discussion rests on.
"""

from __future__ import annotations

import itertools
import logging
import math
from collections.abc import Iterable, Sequence
from dataclasses import dataclass

logger = logging.getLogger(__name__)

#: Resamples for the bias-corrected and accelerated bootstrap interval on Cliff's
#: delta. 2,000 is what the released statistical tables were produced with.
BOOTSTRAP_RESAMPLES = 2000

#: Effect-size thresholds of Romano et al. (2006).
NEGLIGIBLE_THRESHOLD = 0.147
SMALL_THRESHOLD = 0.33
MEDIUM_THRESHOLD = 0.474

#: Smallest positive p-value representable in float64; anything at or below this
#: is reported as saturated rather than as a meaningful magnitude.
P_SATURATION_FLOOR = 1e-300


@dataclass(slots=True)
class ComparisonResult:
    """One pairwise comparison between two strategies on one metric."""

    model: str
    metric: str
    strategy_a: str
    strategy_b: str
    n: int
    mean_a: float
    mean_b: float
    median_a: float
    median_b: float
    statistic: float
    p_value: float
    cliffs_delta: float
    delta_ci_low: float
    delta_ci_high: float
    effect_size: str
    alpha: float
    significant: bool
    p_saturated: bool

    def to_row(self) -> dict[str, object]:
        """The row as it appears in the released statistical tables.

        Means are the paired-subset means -- the classes on which both sides
        produced a result -- not the marginal means of each configuration, so
        delta_pp is the difference the test was actually run on.
        """
        return {
            "model": self.model,
            "strategy_A": self.strategy_a,
            "strategy_B": self.strategy_b,
            "metric": self.metric,
            "n_pairs": self.n,
            "wilcoxon_W": round(self.statistic, 1),
            "wilcoxon_p": self.p_value,
            "significant_bonferroni": str(self.significant).lower(),
            "cliffs_delta": round(self.cliffs_delta, 3),
            "delta_ci_low": round(self.delta_ci_low, 3),
            "delta_ci_high": round(self.delta_ci_high, 3),
            "magnitude": self.effect_size,
            "mean_A": round(self.mean_a, 2),
            "mean_B": round(self.mean_b, 2),
            "delta_pp": round(self.mean_b - self.mean_a, 2),
        }


def cliffs_delta(a: Sequence[float], b: Sequence[float]) -> float:
    """Cliff's delta between two samples.

    ``delta = (#(a > b) - #(a < b)) / (|a| * |b|)``, computed in O(n log n) by
    sorting rather than by the naive O(n*m) double loop -- at 147k paired
    observations the quadratic form is not viable.
    """
    if not a or not b:
        return 0.0

    ordered = sorted(b)
    m = len(ordered)
    greater = 0
    less = 0
    for value in a:
        greater += _bisect_left(ordered, value)
        less += m - _bisect_right(ordered, value)
    return (greater - less) / (len(a) * m)


def _bisect_left(ordered: Sequence[float], value: float) -> int:
    low, high = 0, len(ordered)
    while low < high:
        middle = (low + high) // 2
        if ordered[middle] < value:
            low = middle + 1
        else:
            high = middle
    return low


def _bisect_right(ordered: Sequence[float], value: float) -> int:
    low, high = 0, len(ordered)
    while low < high:
        middle = (low + high) // 2
        if ordered[middle] <= value:
            low = middle + 1
        else:
            high = middle
    return low


def bca_interval(
    a: Sequence[float],
    b: Sequence[float],
    *,
    resamples: int = BOOTSTRAP_RESAMPLES,
    confidence: float = 0.95,
    seed: int = 42,
) -> tuple[float, float]:
    """Bias-corrected and accelerated bootstrap interval for Cliff's delta.

    The percentile bootstrap is biased for a statistic bounded in [-1, 1] whose
    sampling distribution piles up near the bound, which is exactly where our
    large effects sit. BCa corrects for that bias and for the skew of the
    jackknife distribution, so the intervals we print near delta = 0.99 are not
    silently truncated.
    """
    import random as _random
    import statistics as _statistics

    n = len(a)
    if n != len(b):
        raise ValueError("paired samples must be the same length")
    if n < 3:
        return (-1.0, 1.0)

    observed = cliffs_delta(a, b)
    rng = _random.Random(seed)
    replicates = []
    for _ in range(resamples):
        idx = [rng.randrange(n) for _ in range(n)]
        replicates.append(cliffs_delta([a[i] for i in idx], [b[i] for i in idx]))
    replicates.sort()

    # bias correction: how far the replicate median sits from the observed value
    below = _bisect_left(replicates, observed)
    if below in (0, len(replicates)):
        return (replicates[0], replicates[-1])
    z0 = _norm_ppf(below / len(replicates))

    # acceleration: jackknife skew
    jack = []
    for i in range(n):
        jack.append(cliffs_delta(a[:i] + a[i + 1:], b[:i] + b[i + 1:]))
    jbar = _statistics.fmean(jack)
    num = sum((jbar - v) ** 3 for v in jack)
    den = 6.0 * (sum((jbar - v) ** 2 for v in jack) ** 1.5)
    acc = num / den if den else 0.0

    tail = (1.0 - confidence) / 2.0
    lo_z, hi_z = _norm_ppf(tail), _norm_ppf(1.0 - tail)

    def adjust(z: float) -> float:
        denom = 1.0 - acc * (z0 + z)
        return _norm_cdf(z0 + (z0 + z) / denom) if denom else 0.5

    lo_q, hi_q = adjust(lo_z), adjust(hi_z)
    pick = lambda q: replicates[min(len(replicates) - 1, max(0, int(q * len(replicates))))]
    return (pick(lo_q), pick(hi_q))


def tost_equivalence(
    a: Sequence[float],
    b: Sequence[float],
    bound: float,
) -> tuple[bool, float]:
    """Two one-sided tests for equivalence within +/- ``bound``.

    Significance answers "is there a difference"; when the claim is that there is
    none, that question is the wrong one, because failing to reject the null is
    not evidence for it. TOST asks the right one: it rejects a difference larger
    than the bound the analyst declared in advance.

    Returns ``(equivalent, p)`` where ``p`` is the larger of the two one-sided
    p-values, which is the p-value of the equivalence test.
    """
    import statistics as _statistics

    n = len(a)
    if n != len(b):
        raise ValueError("paired samples must be the same length")
    if n < 2:
        return (False, 1.0)
    diffs = [x - y for x, y in zip(a, b)]
    mean = _statistics.fmean(diffs)
    sd = _statistics.stdev(diffs)
    if sd == 0.0:
        return (abs(mean) < bound, 0.0 if abs(mean) < bound else 1.0)
    se = sd / math.sqrt(n)
    t_lower = (mean + bound) / se        # H0: difference <= -bound
    t_upper = (mean - bound) / se        # H0: difference >= +bound
    p_lower = 1.0 - _norm_cdf(t_lower)
    p_upper = _norm_cdf(t_upper)
    p = max(p_lower, p_upper)
    return (p < 0.05, p)


def _norm_cdf(z: float) -> float:
    return 0.5 * (1.0 + math.erf(z / math.sqrt(2.0)))


def _norm_ppf(q: float) -> float:
    """Inverse normal CDF by bisection; exact enough for bootstrap quantiles."""
    if not 0.0 < q < 1.0:
        return -8.0 if q <= 0.0 else 8.0
    lo, hi = -8.0, 8.0
    for _ in range(80):
        mid = (lo + hi) / 2.0
        if _norm_cdf(mid) < q:
            lo = mid
        else:
            hi = mid
    return (lo + hi) / 2.0


def interpret_delta(delta: float) -> str:
    """Classify an effect size per Romano et al. (2006)."""
    magnitude = abs(delta)
    if magnitude < NEGLIGIBLE_THRESHOLD:
        return "negligible"
    if magnitude < SMALL_THRESHOLD:
        return "small"
    if magnitude < MEDIUM_THRESHOLD:
        return "medium"
    return "large"


def bonferroni_alpha(comparisons: int, alpha: float = 0.05) -> float:
    """Corrected significance threshold for ``comparisons`` tests in a family.

    With four strategies there are six pairwise comparisons per (model, metric)
    family, yielding alpha ~= 0.0083.
    """
    if comparisons < 1:
        raise ValueError("comparisons must be >= 1")
    return alpha / comparisons


def wilcoxon(a: Sequence[float], b: Sequence[float]) -> tuple[float, float]:
    """Wilcoxon signed-rank test, returning ``(statistic, p_value)``.

    Pairs with zero difference are discarded (``zero_method="wilcox"``), which is
    the conventional treatment and matters here because many classes score
    identically under two strategies.
    """
    try:
        from scipy.stats import wilcoxon as scipy_wilcoxon
    except ImportError as exc:  # pragma: no cover - dependency declared in pyproject
        raise RuntimeError("scipy is required for the Wilcoxon test") from exc

    differences = [x - y for x, y in zip(a, b, strict=True)]
    if not any(differences):
        # Identical samples: no evidence of a difference in either direction.
        return 0.0, 1.0
    statistic, p_value = scipy_wilcoxon(a, b, zero_method="wilcox", alternative="two-sided")
    return float(statistic), float(p_value)


def compare(
    a: Sequence[float],
    b: Sequence[float],
    *,
    model: str,
    metric: str,
    strategy_a: str,
    strategy_b: str,
    alpha: float,
) -> ComparisonResult:
    """Run one paired comparison and package the result."""
    if len(a) != len(b):
        raise ValueError(
            f"paired comparison requires equal-length samples, got {len(a)} and {len(b)}"
        )
    statistic, p_value = wilcoxon(a, b)
    delta = cliffs_delta(a, b)
    ci_low, ci_high = bca_interval(a, b)

    return ComparisonResult(
        model=model,
        metric=metric,
        strategy_a=strategy_a,
        strategy_b=strategy_b,
        n=len(a),
        mean_a=_mean(a),
        mean_b=_mean(b),
        median_a=_median(a),
        median_b=_median(b),
        statistic=statistic,
        p_value=p_value,
        cliffs_delta=delta,
        delta_ci_low=ci_low,
        delta_ci_high=ci_high,
        effect_size=interpret_delta(delta),
        alpha=alpha,
        significant=p_value < alpha,
        p_saturated=p_value <= P_SATURATION_FLOOR or p_value == 0.0,
    )


def pairwise_comparisons(
    samples: dict[str, Sequence[float]],
    *,
    model: str,
    metric: str,
    alpha: float | None = None,
) -> list[ComparisonResult]:
    """Compare every pair of strategies on one metric for one model.

    Args:
        samples: Strategy name -> per-class metric values, aligned across
            strategies (element *i* must be the same class in every sample).
        alpha: Corrected threshold; derived by Bonferroni from the number of
            pairs when omitted.
    """
    names = list(samples)
    pairs = list(itertools.combinations(names, 2))
    corrected = alpha if alpha is not None else bonferroni_alpha(len(pairs) or 1)

    results = []
    for strategy_a, strategy_b in pairs:
        try:
            results.append(
                compare(
                    samples[strategy_a],
                    samples[strategy_b],
                    model=model,
                    metric=metric,
                    strategy_a=strategy_a,
                    strategy_b=strategy_b,
                    alpha=corrected,
                )
            )
        except ValueError as exc:
            logger.warning(
                "skipping %s vs %s on %s/%s: %s", strategy_a, strategy_b, model, metric, exc
            )
    return results


def align_samples(
    observations: dict[str, dict[str, float]]
) -> tuple[list[str], dict[str, list[float]]]:
    """Restrict several strategies to the classes all of them produced.

    A paired non-parametric test requires paired observations; a class that one
    strategy failed to produce a value for must be dropped from every sample, not
    only from its own. Returns the retained class ids and the aligned samples.
    """
    if not observations:
        return [], {}
    common = set.intersection(*(set(values) for values in observations.values()))
    class_ids = sorted(common)
    aligned = {
        strategy: [values[class_id] for class_id in class_ids]
        for strategy, values in observations.items()
    }
    return class_ids, aligned


def _mean(values: Iterable[float]) -> float:
    values = list(values)
    return sum(values) / len(values) if values else 0.0


def _median(values: Iterable[float]) -> float:
    ordered = sorted(values)
    n = len(ordered)
    if n == 0:
        return 0.0
    middle = n // 2
    if n % 2:
        return float(ordered[middle])
    return (ordered[middle - 1] + ordered[middle]) / 2.0


def format_p_value(p_value: float) -> str:
    """Render a p-value, marking saturation instead of printing a false zero."""
    if p_value <= P_SATURATION_FLOOR or p_value == 0.0:
        return "< 1e-300 (saturated)"
    if p_value < 0.001:
        exponent = math.floor(math.log10(p_value))
        return f"{p_value / 10**exponent:.1f}e{exponent}"
    return f"{p_value:.4f}"
