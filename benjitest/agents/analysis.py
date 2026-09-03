"""Analysis agents of the Test Generation Crew (Section 3.1.2, Appendix B).

Three agents build the context that distinguishes the dynamic strategy from a
static prompt:

* **Class Under Test Analyzer** -- static structure plus internal/external
  dependency categorisation.
* **Black-box Test Agent** -- behavioural scenarios from the public contract only.
* **White-box Test Agent** -- structural scenarios from the implementation.

The black-box and white-box agents are mutually independent: neither consumes the
other's output, which is what makes the "in parallel" execution noted in
Appendix B possible and what makes the ablation configurations of Section 4.8
meaningful.
"""

from __future__ import annotations

import logging

from ..java.model import JavaClass
from ..java.parser import resolve_dependencies
from ..llm.parsing import extract_json
from ..llm.tokens import count_tokens, iter_java_chunks
from .base import Agent, AgentOutput, AgentSpec, CrewContext

logger = logging.getLogger(__name__)

CLASS_ANALYZER = "Class Under Test Analyzer"
BLACK_BOX_AGENT = "Black-box Test Agent"
WHITE_BOX_AGENT = "White-box Test Agent"


class ClassAnalyzerAgent(Agent):
    """Static analysis of the class under test, enriched with functional inference.

    Appendix B: *"Performs static analysis of the class under test; distinguishes
    internal dependencies (extracts public method signatures and Javadoc to
    mitigate hallucinated calls) from external third-party dependencies
    (cross-referenced with the build files to inform mocking decisions)."*

    The structural half is computed deterministically by
    :mod:`benjitest.java.parser`; the language model contributes only the
    *inferred functional description* mentioned in Section 4.3. Keeping the
    structural facts out of the model's hands is what prevents a hallucinated
    signature from propagating into every downstream agent.

    Context inputs:
        ``cut`` (:class:`~benjitest.java.model.JavaClass`), ``project_types``,
        ``build_metadata``.

    Context outputs:
        ``analysis_report`` (dict), and ``cut.dependencies`` populated in place.
    """

    spec = AgentSpec(
        name=CLASS_ANALYZER,
        role="Code analyst specialized in object-oriented principles.",
        goal=(
            "Describe what the class under test does and which of its "
            "collaborators are project-internal versus third-party."
        ),
        backstory=(
            "You receive an authoritative structural analysis produced by a Java "
            "parser. You never restate or alter it; you add the functional "
            "interpretation that a parser cannot provide."
        ),
        prompt_file="class_analyzer_agent.txt",
        returns=(
            "A structured report listing the class under test (name, methods, "
            "signatures) and a categorized list of internal vs. external dependencies."
        ),
    )

    def __init__(self, *, omit_method_bodies: bool = True, **kwargs) -> None:
        super().__init__(**kwargs)
        self.omit_method_bodies = omit_method_bodies

    def static_report(self, context: CrewContext) -> dict:
        """Compute the deterministic half of the analysis report."""
        cut: JavaClass = context["cut"]
        metadata = context.get("build_metadata")
        resolve_dependencies(
            cut,
            project_types=context.get("project_types") or {},
            external_artifacts=getattr(metadata, "package_to_artifact", None) or {},
        )
        report = cut.to_dict()
        report["testable_methods"] = [m.erased_signature for m in cut.testable_methods]
        report["mockable_dependencies"] = [d.type_name for d in cut.mockable_dependencies]
        report["build"] = {
            "tool": getattr(metadata, "tool", None),
            "java_version": getattr(metadata, "java_version", None),
            "test_framework": getattr(metadata, "test_framework", "JUnit 5"),
        }
        return report

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        report = context.setdefault("analysis_report", self.static_report(context))

        internal = ", ".join(d.type_name for d in cut.internal_dependencies) or "none"
        external = ", ".join(
            f"{d.type_name} ({d.artifact})" if d.artifact else d.type_name
            for d in cut.external_dependencies
        ) or "none"

        # Per Section 3.1 the analyzer's downstream output is limited to
        # signatures and dependency lists rather than duplicating full source.
        body = cut.signature_summary() if self.omit_method_bodies else cut.source

        return (
            f"Analyse the following class under test and describe its behaviour.\n\n"
            f"## Class\n`{cut.qualified_name}` ({cut.kind})\n\n"
            f"## Structural analysis (authoritative -- do not contradict it)\n"
            f"```java\n{body}\n```\n\n"
            f"Internal project dependencies: {internal}\n"
            f"External third-party dependencies: {external}\n"
            f"Mockable collaborators: "
            f"{', '.join(report['mockable_dependencies']) or 'none'}\n\n"
            f"## Your task\n"
            f"Return a JSON object with exactly these keys:\n"
            f'  "responsibility": one sentence stating what the class is for;\n'
            f'  "method_descriptions": an object mapping each method signature to '
            f"a one-sentence description of its contract;\n"
            f'  "state": a short description of the mutable state the class holds;\n'
            f'  "testing_notes": an array of short strings noting preconditions, '
            f"nullability, invariants, and anything that complicates instantiation.\n"
            f"Do not invent methods or dependencies that are absent from the "
            f"structural analysis above."
        )

    def parse(self, response_text: str, context: CrewContext) -> dict:
        report = dict(context.get("analysis_report") or self.static_report(context))
        payload = extract_json(response_text)
        if isinstance(payload, dict):
            report["functional_description"] = payload
        else:
            logger.debug("%s: no JSON payload in response", self.spec.name)
            report["functional_description"] = {"responsibility": response_text.strip()[:500]}
        context["analysis_report"] = report
        return report

    def run(self, context: CrewContext) -> AgentOutput:
        # The structural report must exist even when no LLM backend is available,
        # because the No-Context ablation and the pseudo-code path both rely on it.
        context.setdefault("analysis_report", self.static_report(context))
        output = super().run(context)
        if not output.ok:
            output.structured = context["analysis_report"]
            output.text = _render_report(context["analysis_report"])
            output.ok = True
            output.error = None
        return output


class BlackBoxAgent(Agent):
    """Derives behavioural test scenarios from the public contract alone.

    Appendix B: *"Produces natural-language test scenarios focused on input/output
    behavior, simulating an API consumer and avoiding implementation-biased
    tests."* The implementation is deliberately withheld from this agent: its
    value in the ablation study comes precisely from not seeing it.

    Context inputs:
        ``cut``, ``analysis_report``.

    Context outputs:
        ``black_box_scenarios`` (list of scenario dicts).
    """

    spec = AgentSpec(
        name=BLACK_BOX_AGENT,
        role="Black-box Test Strategist and Specification Analyst.",
        goal=(
            "Enumerate the observable behaviours a consumer of this API must be "
            "able to rely on, including failure modes."
        ),
        backstory=(
            "You see only signatures and documentation. You reason about "
            "contracts, not implementations, which keeps your scenarios free of "
            "the bias that comes from reading the code."
        ),
        prompt_file="blackbox_agent.txt",
        returns="A structured list of textual test-case descriptions.",
    )

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        report = context.get("analysis_report") or {}
        functional = report.get("functional_description") or {}

        javadoc_block = _javadoc_block(cut)
        responsibility = functional.get("responsibility", "not available")

        return (
            f"Derive black-box test scenarios for `{cut.qualified_name}`.\n\n"
            f"## Stated responsibility\n{responsibility}\n\n"
            f"## Public contract (signatures and documentation only)\n"
            f"```java\n{cut.signature_summary()}\n```\n\n"
            f"{javadoc_block}"
            f"## Your task\n"
            f"You have NOT been shown the implementation, and you must not "
            f"speculate about it. Working only from the contract above, list the "
            f"test scenarios an API consumer would need.\n\n"
            f"For every public method cover, where applicable: the nominal case, "
            f"null and empty inputs, boundary values, documented exceptions, and "
            f"any documented postcondition.\n\n"
            f"Return a JSON array. Each element must have the keys "
            f'"name" (methodName_stateUnderTest_expectedBehavior), '
            f'"method" (the method under test), '
            f'"given", "when", "then" (one sentence each), and '
            f'"category" (one of: happy-path, null-input, empty-collection, '
            f"boundary, exception, postcondition)."
        )

    def parse(self, response_text: str, context: CrewContext) -> list[dict]:
        scenarios = _parse_scenarios(response_text)
        context["black_box_scenarios"] = scenarios
        return scenarios


class WhiteBoxAgent(Agent):
    """Derives structural test scenarios from the implementation.

    Appendix B: *"Identifies complex logic paths, boundary conditions, and
    internal state transitions not visible from the public interface; targets edge
    cases that black-box analysis would miss."*

    Classes whose source exceeds ``chunk_tokens`` are split and processed
    sequentially, as specified in Section 3.1.

    Context inputs:
        ``cut``.

    Context outputs:
        ``white_box_scenarios`` (list of scenario dicts).
    """

    spec = AgentSpec(
        name=WHITE_BOX_AGENT,
        role="White-box Test Engineer.",
        goal=(
            "Expose the branches, loops, exception paths, and state transitions "
            "that a contract-level reading cannot reveal."
        ),
        backstory=(
            "You read the implementation to find what the specification omits: "
            "the guard clause nobody documented, the loop that behaves "
            "differently on an empty collection, the swallowed exception."
        ),
        prompt_file="whitebox_agent.txt",
        returns=(
            "Additional textual test-case descriptions focused on internal logic "
            "and branch coverage."
        ),
    )

    def __init__(self, *, chunk_tokens: int = 4_000, **kwargs) -> None:
        super().__init__(**kwargs)
        self.chunk_tokens = chunk_tokens

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        chunk = context.get("_white_box_chunk", cut.source)
        chunk_note = context.get("_white_box_chunk_note", "")

        complexity_hint = "\n".join(
            f"- {m.name}: cyclomatic complexity {m.cyclomatic_complexity}"
            for m in sorted(
                cut.methods, key=lambda m: m.cyclomatic_complexity, reverse=True
            )[:10]
        )

        return (
            f"Perform a white-box analysis of `{cut.qualified_name}`.\n"
            f"{chunk_note}\n"
            f"## Implementation\n```java\n{chunk}\n```\n\n"
            f"## Measured complexity\n{complexity_hint or '- not available'}\n\n"
            f"## Your task\n"
            f"Identify every decision point that a test suite must exercise: "
            f"if/else and switch branches, loop boundaries (zero, one, many "
            f"iterations), try/catch paths, early returns, and internal state "
            f"transitions.\n\n"
            f"Return a JSON array. Each element must have the keys "
            f'"name" (methodName_stateUnderTest_expectedBehavior), '
            f'"method", "line" (integer or null), '
            f'"condition" (the branch condition or loop bound being targeted), '
            f'"setup" (how to drive execution down that path), '
            f'"expected" (the observable outcome), and '
            f'"category" (one of: branch, loop, exception-path, early-return, '
            f"state-transition).\n"
            f"Target only behaviour reachable through the public API."
        )

    def parse(self, response_text: str, context: CrewContext) -> list[dict]:
        return _parse_scenarios(response_text)

    def run(self, context: CrewContext) -> AgentOutput:
        cut: JavaClass = context["cut"]
        source = cut.source or ""

        if count_tokens(source) <= self.chunk_tokens:
            output = super().run(context)
            context["white_box_scenarios"] = output.structured or []
            return output

        # Large class: process chunks sequentially and merge the scenarios.
        chunks = list(iter_java_chunks(source, self.chunk_tokens))
        logger.debug(
            "%s: class %s exceeds %d tokens; processing %d chunks",
            self.spec.name,
            cut.name,
            self.chunk_tokens,
            len(chunks),
        )

        merged: list[dict] = []
        texts: list[str] = []
        prompt_tokens = completion_tokens = 0
        failures: list[str] = []

        for index, chunk in enumerate(chunks, start=1):
            context["_white_box_chunk"] = chunk
            context["_white_box_chunk_note"] = (
                f"\nThis is chunk {index} of {len(chunks)} of a class too large to "
                f"fit in one request. Analyse only what is shown; other members "
                f"are covered by the remaining chunks.\n"
            )
            output = super().run(context)
            prompt_tokens += output.prompt_tokens
            completion_tokens += output.completion_tokens
            if output.ok:
                texts.append(output.text)
                merged.extend(output.structured or [])
            else:
                failures.append(output.error or "unknown error")

        context.pop("_white_box_chunk", None)
        context.pop("_white_box_chunk_note", None)

        merged = _deduplicate_scenarios(merged)
        context["white_box_scenarios"] = merged
        return AgentOutput(
            agent=self.spec.name,
            text="\n\n".join(texts),
            structured=merged,
            ok=bool(merged) or not failures,
            error="; ".join(failures) or None,
            prompt_tokens=prompt_tokens,
            completion_tokens=completion_tokens,
        )


# ----------------------------------------------------------------------
# Helpers
# ----------------------------------------------------------------------
def _parse_scenarios(response_text: str) -> list[dict]:
    """Parse a scenario list, tolerating an object wrapper around the array."""
    payload = extract_json(response_text)
    if isinstance(payload, list):
        return [item for item in payload if isinstance(item, dict)]
    if isinstance(payload, dict):
        for key in ("scenarios", "test_cases", "tests", "cases"):
            value = payload.get(key)
            if isinstance(value, list):
                return [item for item in value if isinstance(item, dict)]
        # A single scenario returned unwrapped.
        if "name" in payload:
            return [payload]
    return []


def _deduplicate_scenarios(scenarios: list[dict]) -> list[dict]:
    """Drop scenarios repeated across chunks, keyed on name plus condition."""
    seen: set[tuple[str, str]] = set()
    unique: list[dict] = []
    for scenario in scenarios:
        key = (
            str(scenario.get("name", "")).strip().lower(),
            str(scenario.get("condition", scenario.get("when", ""))).strip().lower(),
        )
        if key in seen:
            continue
        seen.add(key)
        unique.append(scenario)
    return unique


def _javadoc_block(cut: JavaClass) -> str:
    """Render the class and method documentation available to a black-box reader."""
    entries: list[str] = []
    if cut.javadoc:
        entries.append(f"Class: {cut.javadoc}")
    for method in cut.testable_methods:
        if method.javadoc:
            entries.append(f"{method.erased_signature}: {method.javadoc}")
    if not entries:
        return "## Documentation\nNo Javadoc is available for this class.\n\n"
    return "## Documentation\n" + "\n\n".join(entries) + "\n\n"


def _render_report(report: dict) -> str:
    """Human-readable rendering of the analysis report for the shared context."""
    lines = [
        f"Class: {report.get('package', '')}.{report.get('class_name', '')}".strip("."),
        f"Kind: {report.get('kind', 'class')}",
        f"Testable methods: {', '.join(report.get('testable_methods', [])) or 'none'}",
    ]
    dependencies = report.get("dependencies", {})
    internal = ", ".join(d["type"] for d in dependencies.get("internal", [])) or "none"
    external = ", ".join(d["type"] for d in dependencies.get("external", [])) or "none"
    lines.append(f"Internal dependencies: {internal}")
    lines.append(f"External dependencies: {external}")
    lines.append(
        f"Mockable collaborators: {', '.join(report.get('mockable_dependencies', [])) or 'none'}"
    )
    functional = report.get("functional_description") or {}
    if functional.get("responsibility"):
        lines.append(f"Responsibility: {functional['responsibility']}")
    return "\n".join(lines)


JOINT_ANALYZER_AGENT = "Joint Analyzer Agent"


class JointAnalyzerAgent(Agent):
    """One analysis agent in place of the black-box/white-box pair (arm B-nosplit).

    It sees everything both of them see and returns one report. The arm exists to
    separate the effect of *splitting* the analysis from the effect of performing
    it at all: the crew still analyses the class, but nobody holds the
    specification view apart from the implementation view, so nothing prevents
    the scenarios from being derived from the code rather than the contract.

    Context inputs:
        ``cut``, ``analysis_report``.

    Context outputs:
        ``black_box_scenarios`` and ``white_box_scenarios``, both set from the
        single report, so the Prompt Engineer downstream needs no special case.
    """

    spec = AgentSpec(
        name=JOINT_ANALYZER_AGENT,
        role="Test Strategist working from contract and implementation together.",
        goal=(
            "Enumerate the scenarios a test suite for this class must cover, "
            "using both its public contract and its implementation."
        ),
        backstory=(
            "You see the signatures, the documentation and the body. You are the "
            "control condition for whether separating those views matters."
        ),
        prompt_file="joint_analyzer_agent.txt",
        returns="A structured list of textual test-case descriptions.",
    )

    def __init__(self, *, chunk_tokens: int = 4000, **kwargs):
        super().__init__(**kwargs)
        self.chunk_tokens = chunk_tokens

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        report = context.get("analysis_report") or {}
        functional = report.get("functional_description") or {}
        responsibility = functional.get("responsibility", "not available")
        source = cut.source or ""
        return (
            f"Derive test scenarios for `{cut.qualified_name}`.\n\n"
            f"## Stated responsibility\n{responsibility}\n\n"
            f"## Public contract\n```java\n{cut.signature_summary()}\n```\n\n"
            f"## Implementation\n```java\n{source[: self.chunk_tokens * 4]}\n```\n\n"
            f"## Your task\n"
            f"Working from both views above, list the scenarios the suite must "
            f"cover: the nominal cases, the boundaries, the documented "
            f"exceptions, and the branches the implementation contains.\n\n"
            f"Return a JSON array. Each element must have the keys "
            f'"name", "method", "given", "when", "then", and '
            f'"category" (one of: happy-path, null-input, empty-collection, '
            f"boundary, exception, branch)."
        )

    def parse(self, response_text: str, context: CrewContext) -> list[dict]:
        scenarios = _parse_scenarios(response_text)
        # the downstream Prompt Engineer reads both keys; the arm's whole point
        # is that they now hold the same, jointly derived content
        context["black_box_scenarios"] = scenarios
        context["white_box_scenarios"] = scenarios
        context["joint_scenarios"] = scenarios
        return scenarios
