"""Analyses built on top of a campaign's results.

* :mod:`~benjitest.evaluation.statistics` -- Wilcoxon / Cliff's delta / Bonferroni
* :mod:`~benjitest.evaluation.ablation` -- the four crew configurations of RQ2
* :mod:`~benjitest.evaluation.memorization` -- the contamination probing protocol
* :mod:`~benjitest.evaluation.codebleu` -- the semantic-match criterion
"""

from .ablation import (
    ABLATION_CONFIGURATIONS,
    FULL_CREW,
    NO_BLACKBOX,
    NO_CONTEXT,
    NO_WHITEBOX,
    AblationConfiguration,
    build_ablation_config,
    configuration_by_name,
)
from .codebleu import CodeBLEUScore, code_bleu
from .memorization import (
    SEMANTIC_THRESHOLD,
    MatchLevel,
    MemorizationCoverage,
    MemorizationProber,
    ProbeResult,
    aggregate_coverage,
    classify_match,
    exact_match,
    stratify,
    structural_match,
)
from .statistics import (
    ComparisonResult,
    align_samples,
    bonferroni_alpha,
    cliffs_delta,
    compare,
    interpret_delta,
    pairwise_comparisons,
    wilcoxon,
)

__all__ = [
    "ABLATION_CONFIGURATIONS",
    "FULL_CREW",
    "NO_BLACKBOX",
    "NO_CONTEXT",
    "NO_WHITEBOX",
    "SEMANTIC_THRESHOLD",
    "AblationConfiguration",
    "CodeBLEUScore",
    "ComparisonResult",
    "MatchLevel",
    "MemorizationCoverage",
    "MemorizationProber",
    "ProbeResult",
    "aggregate_coverage",
    "align_samples",
    "bonferroni_alpha",
    "build_ablation_config",
    "classify_match",
    "cliffs_delta",
    "code_bleu",
    "compare",
    "configuration_by_name",
    "exact_match",
    "interpret_delta",
    "pairwise_comparisons",
    "stratify",
    "structural_match",
    "wilcoxon",
]
