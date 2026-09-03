"""Memorization probing protocol (Section 4.9, Appendix E).

Quantifies how much of a benchmark an LLM can reproduce from memory, adapting the
tabular-data methodology of Di Palma et al. (SIGIR 2025) to the hierarchical
structure of test code.

Three matching levels are applied, from strictest to loosest:

*Exact* -- character-level equality after normalising whitespace, comments, and
import order.

*Structural* -- the same test-method signatures, assertion types and targets, and
setup/teardown blocks, allowing differences in variable names, literals, and
formatting.

*Semantic* -- CodeBLEU above 0.8.

Memorization Coverage is ``|M| / |T|``, where ``M`` is the subset of test classes
whose probe output satisfies at least one criterion. Semantic match is the
primary aggregate metric; the exact-match rate is a character-level lower bound
that cannot be attributed to prompt-induced generation.
"""

from __future__ import annotations

import logging
import re
from collections import Counter
from dataclasses import dataclass, field
from enum import Enum

from ..config.schema import LLMConfig
from ..java.model import JavaClass
from ..java.parser import JavaParseError, parse_class, strip_comments
from ..llm.layer import LLMError, LLMLayer
from ..llm.parsing import extract_java_code
from .codebleu import code_bleu

logger = logging.getLogger(__name__)

#: CodeBLEU threshold defining a semantic match.
SEMANTIC_THRESHOLD = 0.8

#: Marker the probing prompts instruct the model to return when it does not
#: recognise the class. 41.3% of queries returned it in the reported study,
#: which is the evidence that the prompt does not force a positive response.
UNKNOWN_MARKER = "unknown"


class MatchLevel(str, Enum):
    EXACT = "exact"
    STRUCTURAL = "structural"
    SEMANTIC = "semantic"
    NONE = "none"


# ----------------------------------------------------------------------
# Prompt templates (Appendix E, Figures E.1 and E.2)
# ----------------------------------------------------------------------
CLASS_METADATA_SYSTEM_PROMPT = (
    "You are a Java developer who has deep knowledge of open-source GitHub "
    "repositories. When given the fully qualified name of a Java class, respond "
    "with its package declaration, import statements, and public method "
    "signatures. Only respond with the code itself. If the class is unknown, "
    "respond with 'Unknown'. Below are examples. Follow this pattern strictly. "
    "Let's think step by step."
)

TEST_MEMORIZATION_SYSTEM_PROMPT = (
    "You are a Java testing expert. Given the source code of a Java class, "
    "reproduce the exact unit test class as it exists in the project's "
    "repository. Do not generate new tests --- only reproduce what you remember "
    "from the repository. If you do not recognize the class, respond with "
    "'Unknown'. Below are examples. Follow this pattern strictly. Let's think "
    "step by step."
)


@dataclass(slots=True)
class FewShotExample:
    """One demonstrative example. Two are used per template (Appendix E)."""

    user: str
    assistant: str


@dataclass(slots=True)
class ProbeResult:
    """Outcome of probing one test class."""

    class_id: str
    #: What the model returned, after code extraction.
    response: str = ""
    level: MatchLevel = MatchLevel.NONE
    codebleu: float = 0.0
    #: The model explicitly declined to answer.
    unknown: bool = False
    error: str | None = None
    #: Repository stars and test framework, for the stratified tables.
    metadata: dict = field(default_factory=dict)

    @property
    def memorized(self) -> bool:
        return self.level is not MatchLevel.NONE


@dataclass(slots=True)
class MemorizationCoverage:
    """Aggregate coverage over a probed set."""

    total: int = 0
    exact: int = 0
    structural: int = 0
    semantic: int = 0
    unknown: int = 0
    errors: int = 0

    @property
    def any_match(self) -> int:
        """Classes matching at least one criterion.

        Levels nest: an exact match is also structural and semantic, so counting
        the semantic tier alone would double count if the tiers were summed.
        """
        return self.semantic

    def rate(self, level: MatchLevel) -> float:
        if not self.total:
            return 0.0
        counts = {
            MatchLevel.EXACT: self.exact,
            MatchLevel.STRUCTURAL: self.structural,
            MatchLevel.SEMANTIC: self.semantic,
        }
        return 100.0 * counts.get(level, 0) / self.total

    @property
    def coverage(self) -> float:
        """``Cov(T, P_T)``, using semantic match as the primary metric."""
        return self.rate(MatchLevel.SEMANTIC)

    def to_row(self) -> dict[str, object]:
        return {
            "total_probed": self.total,
            "exact_match": self.exact,
            "exact_match_pct": round(self.rate(MatchLevel.EXACT), 1),
            "structural_match": self.structural,
            "structural_match_pct": round(self.rate(MatchLevel.STRUCTURAL), 1),
            "semantic_match": self.semantic,
            "semantic_match_pct": round(self.rate(MatchLevel.SEMANTIC), 1),
            "unknown_responses": self.unknown,
            "unknown_pct": round(100.0 * self.unknown / self.total, 1) if self.total else 0.0,
            "errors": self.errors,
        }


# ----------------------------------------------------------------------
# Normalisation and matching
# ----------------------------------------------------------------------
_IMPORT_RE = re.compile(r"^\s*import\s+(?:static\s+)?[\w.*]+\s*;\s*$", re.MULTILINE)
#: Java token pattern, shared with the CodeBLEU tokenizer.
_TOKEN_RE = re.compile(r"[A-Za-z_$][A-Za-z0-9_$]*|\d+\.?\d*|[^\sA-Za-z0-9_$]")
_ASSERT_CALL_RE = re.compile(r"\b(assert\w+|verify|fail)\s*\(")
_SETUP_ANNOTATION_RE = re.compile(r"@(Before|BeforeEach|BeforeAll|After|AfterEach|AfterAll)\b")


def normalize_exact(code: str) -> str:
    """Normalise for exact matching: comments, whitespace, and import order.

    Section 4.9 defines exact match as "character-level equality after
    whitespace, comment, and import-order normalization".

    Whitespace normalisation is performed by re-joining the token stream rather
    than by collapsing runs of spaces. In Java, whitespace between tokens is
    insignificant, so ``{ }`` and ``{}`` are the same code; collapsing runs alone
    would call them different and understate the exact-match rate. Every token
    itself -- identifiers, literals, operators -- must still match character for
    character, so the criterion remains the strict one.
    """
    without_comments = strip_comments(code or "")
    imports = sorted(match.group(0).strip() for match in _IMPORT_RE.finditer(without_comments))
    body = _IMPORT_RE.sub("", without_comments)
    tokens = _TOKEN_RE.findall(" ".join(imports) + " " + body)
    return " ".join(tokens)


def exact_match(candidate: str, reference: str) -> bool:
    return normalize_exact(candidate) == normalize_exact(reference)


@dataclass(slots=True)
class StructuralFingerprint:
    """The structure exact matching abstracts away from."""

    method_signatures: frozenset[str]
    assertion_kinds: Counter
    #: Which of @BeforeEach/@AfterEach/... the class declares.
    fixture_annotations: frozenset[str]

    @classmethod
    def of(cls, code: str) -> StructuralFingerprint | None:
        try:
            java_class = parse_class(code, source_path="<probe>")
        except (JavaParseError, ValueError):
            return None

        signatures = set()
        assertions: Counter = Counter()
        fixtures = set()

        for method in java_class.methods:
            # Parameter types are retained, names are not: a reproduction that
            # renames arguments is still structurally the same test.
            signatures.add(f"{method.name}({','.join(p.type for p in method.parameters)})")
            annotations = " ".join(method.annotations)
            for match in _SETUP_ANNOTATION_RE.finditer(annotations):
                fixtures.add(match.group(1))
            body = strip_comments(method.body or "")
            for match in _ASSERT_CALL_RE.finditer(body):
                assertions[match.group(1)] += 1

        return cls(
            method_signatures=frozenset(signatures),
            assertion_kinds=assertions,
            fixture_annotations=frozenset(fixtures),
        )


def structural_match(candidate: str, reference: str) -> bool:
    """Same method signatures, assertion profile, and fixture blocks."""
    left = StructuralFingerprint.of(candidate)
    right = StructuralFingerprint.of(reference)
    if left is None or right is None:
        return False
    return (
        left.method_signatures == right.method_signatures
        and left.assertion_kinds == right.assertion_kinds
        and left.fixture_annotations == right.fixture_annotations
    )


def classify_match(
    candidate: str, reference: str, *, semantic_threshold: float = SEMANTIC_THRESHOLD
) -> tuple[MatchLevel, float]:
    """Return the strictest satisfied match level and the CodeBLEU score.

    The levels nest: an exact match is reported as ``EXACT`` but also counts
    toward the structural and semantic tiers in the aggregate, which is why
    :func:`aggregate_coverage` increments all applicable counters.
    """
    score = code_bleu(candidate, reference).score
    if exact_match(candidate, reference):
        return MatchLevel.EXACT, score
    if structural_match(candidate, reference):
        return MatchLevel.STRUCTURAL, score
    if score > semantic_threshold:
        return MatchLevel.SEMANTIC, score
    return MatchLevel.NONE, score


def is_unknown_response(text: str) -> bool:
    """Whether the model declined to reproduce the class."""
    stripped = strip_comments(text or "").strip().strip("`'\" .")
    return stripped.lower() == UNKNOWN_MARKER or stripped.lower().startswith("unknown")


# ----------------------------------------------------------------------
# Probing
# ----------------------------------------------------------------------
class MemorizationProber:
    """Runs the two probing prompts of Appendix E against a model.

    Args:
        llm_layer: The LLM Interaction Layer.
        llm: Backend to probe. Section 4.9 uses temperature 0 and seed 42; the
            configuration is used as given, so the caller controls this.
        examples: Two demonstrative examples, per the protocol.
    """

    def __init__(
        self,
        llm_layer: LLMLayer,
        llm: LLMConfig,
        *,
        examples: list[FewShotExample] | None = None,
        semantic_threshold: float = SEMANTIC_THRESHOLD,
    ) -> None:
        self.llm_layer = llm_layer
        self.llm = llm
        self.examples = examples or []
        self.semantic_threshold = semantic_threshold
        if len(self.examples) not in (0, 2):
            logger.warning(
                "the protocol specifies two demonstrative examples; %d were provided",
                len(self.examples),
            )

    def _messages(self, system: str, user: str) -> list[dict[str, str]]:
        messages = [{"role": "system", "content": system}]
        for example in self.examples:
            messages.append({"role": "user", "content": example.user})
            messages.append({"role": "assistant", "content": example.assistant})
        messages.append({"role": "user", "content": user})
        return messages

    def probe_class_metadata(self, qualified_name: str) -> str:
        """Probe class-metadata memorization (Definition E.1)."""
        response = self.llm_layer.chat(
            self.llm,
            self._messages(CLASS_METADATA_SYSTEM_PROMPT, qualified_name),
            tag="memorization/class-metadata",
        )
        return response.text

    def probe_test_class(
        self,
        production_source: str,
        reference_test: str,
        *,
        class_id: str,
        metadata: dict | None = None,
    ) -> ProbeResult:
        """Probe test-class memorization (Definition E.2) and classify the match."""
        result = ProbeResult(class_id=class_id, metadata=metadata or {})
        try:
            response = self.llm_layer.chat(
                self.llm,
                self._messages(TEST_MEMORIZATION_SYSTEM_PROMPT, production_source),
                tag="memorization/test-class",
            )
        except LLMError as exc:
            result.error = str(exc)
            return result

        result.response = response.text
        if is_unknown_response(response.text):
            result.unknown = True
            return result

        candidate = extract_java_code(response.text)
        if candidate is None:
            result.unknown = True
            return result

        result.level, result.codebleu = classify_match(
            candidate, reference_test, semantic_threshold=self.semantic_threshold
        )
        return result

    def probe_dataset(
        self,
        items: list[tuple[str, JavaClass, str]],
        *,
        metadata_by_class: dict[str, dict] | None = None,
    ) -> list[ProbeResult]:
        """Probe a list of ``(class_id, production_class, reference_test)`` triples."""
        metadata_by_class = metadata_by_class or {}
        results = []
        for class_id, production, reference_test in items:
            results.append(
                self.probe_test_class(
                    production.source,
                    reference_test,
                    class_id=class_id,
                    metadata=metadata_by_class.get(class_id, {}),
                )
            )
        return results


def aggregate_coverage(results: list[ProbeResult]) -> MemorizationCoverage:
    """Compute Memorization Coverage at each of the three levels."""
    coverage = MemorizationCoverage(total=len(results))
    for result in results:
        if result.error:
            coverage.errors += 1
            continue
        if result.unknown:
            coverage.unknown += 1
            continue
        # Levels nest: an exact reproduction is also structural and semantic.
        if result.level is MatchLevel.EXACT:
            coverage.exact += 1
            coverage.structural += 1
            coverage.semantic += 1
        elif result.level is MatchLevel.STRUCTURAL:
            coverage.structural += 1
            coverage.semantic += 1
        elif result.level is MatchLevel.SEMANTIC:
            coverage.semantic += 1
    return coverage


def stratify(
    results: list[ProbeResult], key: str
) -> dict[str, MemorizationCoverage]:
    """Group coverage by a metadata field.

    Used for the popularity (``stars_tier``) and framework (``test_framework``)
    breakdowns of Section 5.6.
    """
    grouped: dict[str, list[ProbeResult]] = {}
    for result in results:
        grouped.setdefault(str(result.metadata.get(key, "unknown")), []).append(result)
    return {bucket: aggregate_coverage(items) for bucket, items in sorted(grouped.items())}


def star_tier(stars: int) -> str:
    """Repository popularity tiers used in the memorization-by-popularity table."""
    if stars < 10:
        return "<10"
    if stars < 100:
        return "10-100"
    return ">100"
