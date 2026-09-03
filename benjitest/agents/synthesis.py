"""Context-synthesis agents: Prompt Engineer and Intermediate Representation.

The Prompt Engineer is what turns a pile of analysis artifacts into the single
Chain-of-Thought instruction set that the Test Developer consumes; it is the
component the *No-Context* ablation of Section 4.8 isolates. The Intermediate
Representation Agent implements the pseudo-code ("Plan-then-Code") strategy of
Section 4.3.
"""

from __future__ import annotations

import logging

from ..java.model import JavaClass
from ..llm.tokens import truncate_to_tokens
from .base import Agent, AgentOutput, AgentSpec, CrewContext

logger = logging.getLogger(__name__)

PROMPT_ENGINEER = "Prompt Engineer"
INTERMEDIATE_REPRESENTATION_AGENT = "Intermediate Representation Agent"


class PromptEngineerAgent(Agent):
    """Synthesises every upstream artifact into one generation prompt.

    Appendix B: *"Synthesizes all upstream artifacts into a single
    Chain-of-Thought instruction set that frees the code-generation model from
    logic analysis and lets it focus on translating the plan into syntactically
    valid Java."*

    Degrades cleanly when upstream agents are disabled, which is exactly what the
    ablation study requires:

    * No black-box agent -> plan built from structure and signatures only.
    * No white-box agent -> plan built from the public contract only.
    * Neither (No-Context) -> the raw source is passed through directly, testing
      whether task decomposition adds anything over the model's own reasoning.

    Context inputs:
        ``cut``, ``analysis_report``, ``black_box_scenarios``,
        ``white_box_scenarios``, ``project_tree``, ``build_metadata``.

    Context outputs:
        ``generation_prompt`` (str).
    """

    spec = AgentSpec(
        name=PROMPT_ENGINEER,
        role="Prompt Expert and Context Synthesiser.",
        goal=(
            "Produce one self-contained instruction set that a code-generation "
            "model can follow without performing any further analysis."
        ),
        backstory=(
            "You are the last reasoning step before code generation. Every "
            "ambiguity you leave becomes a compilation error or a missing "
            "assertion downstream."
        ),
        prompt_file="prompt_engineer_agent.txt",
        returns=(
            "A structured prompt containing class context and a prioritized list "
            "of test scenarios to implement."
        ),
    )

    def __init__(self, *, max_context_tokens: int = 8_000, **kwargs) -> None:
        super().__init__(**kwargs)
        self.max_context_tokens = max_context_tokens

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        black_box = context.get("black_box_scenarios") or []
        white_box = context.get("white_box_scenarios") or []
        report = context.get("analysis_report") or {}
        metadata = context.get("build_metadata")

        has_analysis = bool(report.get("functional_description"))
        no_context = not black_box and not white_box and not has_analysis

        if no_context:
            # No-Context ablation: the synthesiser sees only the raw source.
            body = truncate_to_tokens(cut.source, self.max_context_tokens)
            source_section = (
                "## Source code of the class under test\n"
                f"```java\n{body}\n```\n\n"
                "No preliminary analysis is available. Derive the test plan "
                "yourself from the source above.\n\n"
            )
        else:
            source_section = (
                "## Class under test (signatures and dependencies)\n"
                f"```java\n{cut.signature_summary()}\n```\n\n"
            )

        sections = [
            f"Build a test-generation plan for `{cut.qualified_name}`.\n",
            source_section,
        ]

        if has_analysis:
            functional = report["functional_description"]
            sections.append(
                "## Functional analysis\n"
                f"Responsibility: {functional.get('responsibility', 'n/a')}\n"
                f"State: {functional.get('state', 'n/a')}\n"
                f"Notes: {'; '.join(functional.get('testing_notes', [])) or 'none'}\n\n"
            )

        mockable = report.get("mockable_dependencies") or [
            d.type_name for d in cut.mockable_dependencies
        ]
        sections.append(
            f"## Collaborators to mock\n{', '.join(mockable) or 'none'}\n\n"
        )

        if black_box:
            sections.append(
                "## Behavioural scenarios (black-box)\n"
                + _render_scenarios(black_box)
                + "\n\n"
            )
        if white_box:
            sections.append(
                "## Structural scenarios (white-box)\n"
                + _render_scenarios(white_box)
                + "\n\n"
            )

        framework = getattr(metadata, "test_framework", "JUnit 5")
        java_version = getattr(metadata, "java_version", None) or "unspecified"
        project_tree = context.get("project_tree")
        if project_tree:
            sections.append(f"## Project structure\n```\n{project_tree}\n```\n\n")

        sections.append(
            f"## Project constraints\n"
            f"Testing framework: {framework}\n"
            f"Java version: {java_version}\n"
            f"Target package: {cut.package or '(default package)'}\n"
            f"Required test class name: {cut.name}Test\n\n"
        )

        sections.append(
            "## Your task\n"
            "Write the instruction set that a code-generation model will follow "
            "to produce the test class. Reason step by step and emit, in this "
            "order:\n"
            "1. A one-paragraph summary of what must be tested and why.\n"
            "2. The exact construction recipe for the object under test, naming "
            "every constructor argument and which ones are mocks.\n"
            "3. A numbered, deduplicated, prioritised list of test cases. For "
            "each: the test method name, the arrange/act/assert steps, and the "
            "specific assertion to make. Merge black-box and white-box scenarios "
            "that describe the same behaviour; order them so that the cases "
            "killing the most mutants come first.\n"
            "4. A short list of pitfalls specific to this class (final classes "
            "that cannot be mocked, static calls, time or randomness, checked "
            "exceptions).\n\n"
            "Write the instruction set itself, addressed to the code generator. "
            "Do not write any Java code."
        )
        return "".join(sections)

    def parse(self, response_text: str, context: CrewContext) -> str:
        prompt = response_text.strip()
        context["generation_prompt"] = prompt
        return prompt

    def run(self, context: CrewContext) -> AgentOutput:
        output = super().run(context)
        if not output.ok:
            # Without a synthesised plan the Test Developer still needs context;
            # fall back to a deterministic assembly of whatever is available.
            fallback = self._fallback_prompt(context)
            context["generation_prompt"] = fallback
            output.structured = fallback
            output.text = fallback
            output.ok = True
        return output

    def _fallback_prompt(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        parts = [
            f"Generate a JUnit test class for `{cut.qualified_name}`.",
            "",
            "## Class under test",
            "```java",
            truncate_to_tokens(cut.source, self.max_context_tokens),
            "```",
            "",
            "## Collaborators to mock",
            ", ".join(d.type_name for d in cut.mockable_dependencies) or "none",
        ]
        for label, key in (
            ("Behavioural scenarios", "black_box_scenarios"),
            ("Structural scenarios", "white_box_scenarios"),
        ):
            scenarios = context.get(key) or []
            if scenarios:
                parts += ["", f"## {label}", _render_scenarios(scenarios)]
        return "\n".join(parts)


class IntermediateRepresentationAgent(Agent):
    """Produces the language-agnostic pseudo-code test suite.

    Appendix B: *"Produces a language-agnostic pseudo-code description of the test
    suite (typically GIVEN-WHEN-THEN) to decouple logical design from syntactic
    implementation."*

    This agent is also invoked inside the correction loop when the pseudo-code
    strategy is active, so that a failed suite is repaired at the level of test
    logic rather than syntax.

    Context inputs:
        ``cut``, ``generation_prompt`` or ``analysis_report``; in correction mode
        additionally ``faulty_test`` and ``diagnosis``.

    Context outputs:
        ``pseudo_code`` (str).
    """

    spec = AgentSpec(
        name=INTERMEDIATE_REPRESENTATION_AGENT,
        role="Specialist in test-logic abstraction; enables the pseudo-code strategy.",
        goal=(
            "Express the complete test suite as structured GIVEN-WHEN-THEN "
            "pseudo-code, bound to no particular library."
        ),
        backstory=(
            "Separating what to verify from how to express it in Java reduces the "
            "reasoning load on the code generator and, with it, the rate of "
            "invented APIs."
        ),
        prompt_file="intermediate_representation_agent.txt",
        returns=(
            "A structured pseudo-code representation detailing setup, execution, "
            "and verification, without binding to specific Java libraries."
        ),
    )

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        plan = context.get("generation_prompt")
        report = context.get("analysis_report") or {}

        if plan:
            context_section = f"## Test plan\n{plan}\n\n"
        else:
            # Entered directly from the Class Analyzer (pseudo-code strategy with
            # the Prompt Engineer disabled).
            context_section = (
                "## Class under test\n"
                f"```java\n{cut.signature_summary()}\n```\n\n"
                f"Mockable collaborators: "
                f"{', '.join(report.get('mockable_dependencies', [])) or 'none'}\n\n"
            )

        if context.get("faulty_test"):
            return self._correction_task(context, context_section)

        return (
            f"Design the unit-test suite for `{cut.qualified_name}` as pseudo-code.\n\n"
            f"{context_section}"
            "## Required format\n"
            "For every test case emit exactly:\n\n"
            "TEST: <methodName_stateUnderTest_expectedBehavior>\n"
            "  GIVEN:\n"
            "    - <preconditions, mock configuration, test data>\n"
            "  WHEN:\n"
            "    - <the single action under test>\n"
            "  THEN:\n"
            "    - <the observable outcomes to assert>\n"
            "  EDGE_CASES:\n"
            "    - <boundary conditions worth a separate test, or 'None'>\n\n"
            "## Rules\n"
            "- Cover the nominal path, null inputs, empty collections, boundary "
            "values, declared exceptions, and every branch reachable through the "
            "public API.\n"
            "- One logical assertion per test.\n"
            "- Name concrete values; do not write 'some value'.\n"
            "- Write NO Java and name NO testing library. Describe logic only."
        )

    def _correction_task(self, context: CrewContext, context_section: str) -> str:
        cut: JavaClass = context["cut"]
        return (
            f"The test suite generated for `{cut.qualified_name}` failed. Revise "
            f"the pseudo-code specification so that a correct implementation can "
            f"be derived from it.\n\n"
            f"{context_section}"
            f"## Previous pseudo-code\n{context.get('pseudo_code', '(not available)')}\n\n"
            f"## Failing Java implementation\n"
            f"```java\n{context.get('faulty_test', '')}\n```\n\n"
            f"## Diagnosis\n{context.get('diagnosis', '(not available)')}\n\n"
            f"## Your task\n"
            f"Emit the corrected pseudo-code in the same TEST/GIVEN/WHEN/THEN "
            f"format. Remove or fix any scenario whose premise the diagnosis shows "
            f"to be wrong (for example an assertion expecting a value the class "
            f"does not produce). Keep every scenario that is still valid."
        )

    def parse(self, response_text: str, context: CrewContext) -> str:
        pseudo = response_text.strip()
        context["pseudo_code"] = pseudo
        return pseudo


def _render_scenarios(scenarios: list[dict], limit: int = 40) -> str:
    """Render scenario dictionaries as a compact numbered list."""
    lines: list[str] = []
    for index, scenario in enumerate(scenarios[:limit], start=1):
        name = scenario.get("name") or f"scenario_{index}"
        parts = [f"{index}. {name}"]
        for key in ("method", "category", "condition"):
            value = scenario.get(key)
            if value:
                parts.append(f"   {key}: {value}")
        given = scenario.get("given") or scenario.get("setup")
        when = scenario.get("when")
        then = scenario.get("then") or scenario.get("expected")
        if given:
            parts.append(f"   given: {given}")
        if when:
            parts.append(f"   when: {when}")
        if then:
            parts.append(f"   then: {then}")
        lines.append("\n".join(parts))
    if len(scenarios) > limit:
        lines.append(f"... and {len(scenarios) - limit} further scenario(s)")
    return "\n".join(lines)
