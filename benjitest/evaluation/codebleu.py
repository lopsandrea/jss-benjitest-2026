"""CodeBLEU, used as the semantic-match criterion of the memorization protocol.

CodeBLEU (Ren et al., EMNLP 2020) combines four components with equal weight:

* n-gram match (standard BLEU),
* weighted n-gram match, which up-weights language keywords,
* syntactic AST match,
* data-flow match over variable definition/use chains.

If the reference ``codebleu`` package is installed it is used directly. Otherwise
the implementation below is used: it follows the same four-component definition
but derives the AST from ``javalang`` rather than tree-sitter, so scores can
differ from the reference implementation by a small margin. Which path produced a
score is always reported, so the two are never silently mixed.
"""

from __future__ import annotations

import logging
import math
import re
from collections import Counter
from dataclasses import dataclass

logger = logging.getLogger(__name__)

#: Equal weighting of the four components, as in the original paper.
DEFAULT_WEIGHTS = (0.25, 0.25, 0.25, 0.25)

JAVA_KEYWORDS = frozenset(
    ["abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "var", "record", "sealed", "yield", "true", "false", "null"]
)

_TOKEN_RE = re.compile(r"[A-Za-z_$][A-Za-z0-9_$]*|\d+\.?\d*|[^\sA-Za-z0-9_$]")
_COMMENT_RE = re.compile(r"//[^\n]*|/\*.*?\*/", re.DOTALL)


@dataclass(slots=True)
class CodeBLEUScore:
    """A CodeBLEU score and its four components."""

    score: float
    ngram_match: float = 0.0
    weighted_ngram_match: float = 0.0
    syntax_match: float = 0.0
    dataflow_match: float = 0.0
    #: ``reference`` when the official package computed it, ``builtin`` otherwise.
    implementation: str = "builtin"


def tokenize(code: str) -> list[str]:
    """Tokenise Java source, dropping comments."""
    return _TOKEN_RE.findall(_COMMENT_RE.sub(" ", code or ""))


def code_bleu(
    candidate: str,
    reference: str,
    *,
    weights: tuple[float, float, float, float] = DEFAULT_WEIGHTS,
    prefer_reference_impl: bool = True,
) -> CodeBLEUScore:
    """Compute CodeBLEU between a candidate and a reference test class."""
    if prefer_reference_impl:
        official = _try_reference_implementation(candidate, reference, weights)
        if official is not None:
            return official

    ngram = _ngram_match(candidate, reference)
    weighted = _weighted_ngram_match(candidate, reference)
    syntax = _syntax_match(candidate, reference)
    dataflow = _dataflow_match(candidate, reference)

    score = (
        weights[0] * ngram
        + weights[1] * weighted
        + weights[2] * syntax
        + weights[3] * dataflow
    )
    return CodeBLEUScore(
        score=score,
        ngram_match=ngram,
        weighted_ngram_match=weighted,
        syntax_match=syntax,
        dataflow_match=dataflow,
        implementation="builtin",
    )


def _try_reference_implementation(
    candidate: str, reference: str, weights: tuple[float, float, float, float]
) -> CodeBLEUScore | None:
    try:
        from codebleu import calc_codebleu  # type: ignore[import-not-found]
    except ImportError:
        return None
    try:
        result = calc_codebleu([reference], [candidate], lang="java", weights=weights)
    except Exception as exc:  # noqa: BLE001 - tree-sitter grammar may be missing
        logger.debug("reference CodeBLEU implementation failed: %s", exc)
        return None
    return CodeBLEUScore(
        score=float(result.get("codebleu", 0.0)),
        ngram_match=float(result.get("ngram_match_score", 0.0)),
        weighted_ngram_match=float(result.get("weighted_ngram_match_score", 0.0)),
        syntax_match=float(result.get("syntax_match_score", 0.0)),
        dataflow_match=float(result.get("dataflow_match_score", 0.0)),
        implementation="reference",
    )


# ----------------------------------------------------------------------
# Components
# ----------------------------------------------------------------------
def _ngram_match(candidate: str, reference: str, max_n: int = 4) -> float:
    """Standard BLEU-4 with a brevity penalty."""
    candidate_tokens = tokenize(candidate)
    reference_tokens = tokenize(reference)
    if not candidate_tokens or not reference_tokens:
        return 0.0

    precisions = []
    for n in range(1, max_n + 1):
        candidate_ngrams = Counter(_ngrams(candidate_tokens, n))
        reference_ngrams = Counter(_ngrams(reference_tokens, n))
        if not candidate_ngrams:
            precisions.append(0.0)
            continue
        overlap = sum((candidate_ngrams & reference_ngrams).values())
        precisions.append(overlap / sum(candidate_ngrams.values()))

    if all(p == 0 for p in precisions):
        return 0.0
    # Smoothing keeps a single missing n-gram order from zeroing the whole score.
    log_mean = sum(math.log(p if p > 0 else 1e-9) for p in precisions) / max_n
    brevity = _brevity_penalty(len(candidate_tokens), len(reference_tokens))
    return brevity * math.exp(log_mean)


def _weighted_ngram_match(candidate: str, reference: str, max_n: int = 4) -> float:
    """BLEU with Java keywords weighted more heavily than identifiers."""
    candidate_tokens = tokenize(candidate)
    reference_tokens = tokenize(reference)
    if not candidate_tokens or not reference_tokens:
        return 0.0

    def weight(ngram: tuple[str, ...]) -> float:
        # Keywords carry the structure; identifier names are the part a
        # structurally identical reproduction is allowed to differ on.
        return 1.0 + 4.0 * sum(1 for token in ngram if token in JAVA_KEYWORDS) / len(ngram)

    precisions = []
    for n in range(1, max_n + 1):
        candidate_ngrams = Counter(_ngrams(candidate_tokens, n))
        reference_ngrams = Counter(_ngrams(reference_tokens, n))
        if not candidate_ngrams:
            precisions.append(0.0)
            continue
        matched = 0.0
        total = 0.0
        for ngram, count in candidate_ngrams.items():
            w = weight(ngram)
            total += w * count
            matched += w * min(count, reference_ngrams.get(ngram, 0))
        precisions.append(matched / total if total else 0.0)

    if all(p == 0 for p in precisions):
        return 0.0
    log_mean = sum(math.log(p if p > 0 else 1e-9) for p in precisions) / max_n
    brevity = _brevity_penalty(len(candidate_tokens), len(reference_tokens))
    return brevity * math.exp(log_mean)


def _syntax_match(candidate: str, reference: str) -> float:
    """Overlap of AST subtree shapes, ignoring identifier names."""
    candidate_subtrees = Counter(_ast_subtrees(candidate))
    reference_subtrees = Counter(_ast_subtrees(reference))
    if not candidate_subtrees or not reference_subtrees:
        return 0.0
    overlap = sum((candidate_subtrees & reference_subtrees).values())
    return overlap / sum(candidate_subtrees.values())


def _dataflow_match(candidate: str, reference: str) -> float:
    """Overlap of variable definition/use chains."""
    candidate_flows = Counter(_dataflow_edges(candidate))
    reference_flows = Counter(_dataflow_edges(reference))
    if not candidate_flows:
        # No data flow to compare: treat as a match rather than penalising a
        # short, assertion-only test class.
        return 1.0 if not reference_flows else 0.0
    overlap = sum((candidate_flows & reference_flows).values())
    return overlap / sum(candidate_flows.values())


# ----------------------------------------------------------------------
def _ngrams(tokens: list[str], n: int) -> list[tuple[str, ...]]:
    return [tuple(tokens[i : i + n]) for i in range(len(tokens) - n + 1)]


def _brevity_penalty(candidate_length: int, reference_length: int) -> float:
    if candidate_length >= reference_length:
        return 1.0
    if candidate_length == 0:
        return 0.0
    return math.exp(1 - reference_length / candidate_length)


def _ast_subtrees(code: str, depth: int = 2) -> list[str]:
    """Node-type paths of length ``depth`` through the AST.

    Falls back to a bracket-structure abstraction when the source cannot be
    parsed, so an unparseable candidate still contributes a comparable signal
    instead of scoring zero for the wrong reason.
    """
    try:
        import javalang

        tree = javalang.parse.parse(code)
    except Exception:  # noqa: BLE001
        return _structural_fallback(code)

    paths: list[str] = []
    for path, node in tree:
        types = [type(item).__name__ for item in path if not isinstance(item, (list, tuple))]
        types.append(type(node).__name__)
        if len(types) >= depth:
            paths.append("/".join(types[-depth:]))
    return paths


def _structural_fallback(code: str) -> list[str]:
    """Abstract structure from punctuation when parsing is impossible."""
    tokens = tokenize(code)
    abstracted = [
        token if (token in JAVA_KEYWORDS or not token.isidentifier()) else "ID"
        for token in tokens
    ]
    return ["/".join(gram) for gram in _ngrams(abstracted, 3)]


_DECLARATION_RE = re.compile(
    r"\b(?:final\s+)?([A-Za-z_$][\w.$<>\[\], ]*?)\s+([a-z_$]\w*)\s*=\s*([^;]+);"
)


def _dataflow_edges(code: str) -> list[str]:
    """Definition/use edges: which variables feed the initialiser of which others.

    A full data-flow graph would require type resolution; the approximation here
    -- local declarations and the identifiers appearing in their initialisers --
    captures the chains CodeBLEU's data-flow component is designed to reward.
    """
    stripped = _COMMENT_RE.sub(" ", code or "")
    definitions: dict[str, list[str]] = {}
    for match in _DECLARATION_RE.finditer(stripped):
        name = match.group(2)
        used = [
            token
            for token in _TOKEN_RE.findall(match.group(3))
            if token.isidentifier() and token not in JAVA_KEYWORDS
        ]
        definitions.setdefault(name, []).extend(used)

    edges: list[str] = []
    for name, used in definitions.items():
        if not used:
            edges.append(f"{name}<-literal")
            continue
        for source in used:
            # Name-independent edge label: what matters is the shape of the flow,
            # not the identifiers a reproduction happened to choose.
            kind = "def" if source in definitions else "ext"
            edges.append(f"{kind}->use")
    return edges
