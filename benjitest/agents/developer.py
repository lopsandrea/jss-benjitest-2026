"""Test Developer Agent: the single code-generation step of the framework.

Appendix B: *"Translates the input into complete Java unit-test code consistent
with the project's Java version and testing framework; in correction mode,
applies the Error Interpreter's diagnosis to produce a revised test class."*

The same agent serves all three strategies and the correction loop, which is what
makes the strategies comparable: the only thing that varies between a zero-shot
run and a dynamic run is the *input* this agent receives.
"""

from __future__ import annotations

import logging
import re
from pathlib import Path

from ..java.model import JavaClass
from ..llm.parsing import extract_java_code, extract_package, extract_test_class_name
from ..llm.tokens import truncate_to_tokens
from .base import Agent, AgentOutput, AgentSpec, CrewContext

logger = logging.getLogger(__name__)

TEST_DEVELOPER = "Test Developer Agent"

#: Placeholders supported in static prompt templates. Both the ``${name}`` form
#: used by the released prompt files and the ``{{name}}`` form quoted in
#: Section 4.3 are accepted.
_DOLLAR_PLACEHOLDER_RE = re.compile(r"\$\{(\w+)\}")
_BRACE_PLACEHOLDER_RE = re.compile(r"\{\{\s*(\w+)\s*\}\}")


def render_template(template: str, variables: dict[str, str]) -> str:
    """Substitute ``${name}`` and ``{{name}}`` placeholders in a static template.

    Unknown placeholders are left verbatim rather than raising: a template
    carrying an unrecognised variable should still produce a usable prompt, and
    the leftover marker makes the omission visible in the saved transcript.
    """

    def _replace(match: re.Match[str]) -> str:
        return str(variables.get(match.group(1), match.group(0)))

    rendered = _DOLLAR_PLACEHOLDER_RE.sub(_replace, template)
    return _BRACE_PLACEHOLDER_RE.sub(_replace, rendered)


def template_variables(cut: JavaClass, context: CrewContext) -> dict[str, str]:
    """Values available to a static prompt template."""
    metadata = context.get("build_metadata")
    framework = getattr(metadata, "test_framework", "JUnit 5")
    return {
        "class_code": cut.source,
        "source_code": cut.source,
        "class_name": cut.name,
        "qualified_class_name": cut.qualified_name,
        "package_name": cut.package or "",
        "package": cut.package or "",
        "class_signature": cut.signature_summary(),
        "framework_ex": framework,
        "framework": framework,
        "java_version": str(getattr(metadata, "java_version", "") or ""),
        "test_class_name": f"{cut.name}Test",
        "project_tree": context.get("project_tree", ""),
    }


class TestDeveloperAgent(Agent):
    """Generates -- and, in correction mode, repairs -- the Java test class.

    Operating modes, selected from the context:

    ``static``
        A user-supplied template is rendered and sent verbatim (``static_prompt``).
    ``dynamic``
        The Prompt Engineer's synthesised instruction set (``generation_prompt``).
    ``pseudo-code``
        The Intermediate Representation Agent's specification (``pseudo_code``).
    ``correction``
        ``faulty_test`` plus the Error Interpreter's ``diagnosis``.

    Context outputs:
        ``test_code``, ``test_class_name``, ``test_package``.
    """

    spec = AgentSpec(
        name=TEST_DEVELOPER,
        role="Test Developer producing executable unit tests.",
        goal=(
            "Emit one complete, compilable Java test class that implements the "
            "requested plan against the real API of the class under test."
        ),
        backstory=(
            "You write code, not analysis. Every symbol you use must exist in the "
            "class under test or in a declared dependency; inventing a method is "
            "the single most common cause of failure in this pipeline."
        ),
        prompt_file="tester_agent.txt",
        returns="A Java test class file.",
    )

    #: System prompt used when repairing rather than generating.
    correction_prompt_file = "test_fixer_agent.txt"

    #: The class name begins with "Test", which makes pytest try to collect it
    #: whenever a test module imports it. It is production code, not a test.
    __test__ = False

    def __init__(self, *, max_source_tokens: int = 12_000, **kwargs) -> None:
        super().__init__(**kwargs)
        self.max_source_tokens = max_source_tokens
        self._correction_system_cache: str | None = None

    # ------------------------------------------------------------------
    def system_prompt(self) -> str:
        """Swap in the repair-oriented system prompt while in correction mode."""
        if not self.options.get("correction_mode"):
            return super().system_prompt()

        if self._correction_system_cache is None:
            prompt = None
            if self.prompts_dir:
                candidate = Path(self.prompts_dir) / self.correction_prompt_file
                if candidate.is_file():
                    prompt = candidate.read_text(encoding="utf-8").strip()
            self._correction_system_cache = prompt or (
                "You are the Test Fixer. You repair compilation and execution "
                "errors in generated JUnit test code while preserving the intent "
                "of every test. Apply the minimal change that resolves each "
                "reported error. Never delete a test to make the build pass."
            )
        return self._correction_system_cache

    # ------------------------------------------------------------------
    def build_task(self, context: CrewContext) -> str:
        if context.get("faulty_test"):
            return self._correction_task(context)

        cut: JavaClass = context["cut"]
        static_prompt = context.get("static_prompt")
        if static_prompt:
            # Static strategy: the rendered template is the whole instruction.
            return static_prompt

        pseudo_code = context.get("pseudo_code")
        plan = context.get("generation_prompt")
        metadata = context.get("build_metadata")
        framework = getattr(metadata, "test_framework", "JUnit 5")
        java_version = getattr(metadata, "java_version", None) or "unspecified"
        source = truncate_to_tokens(cut.source, self.max_source_tokens)

        if pseudo_code:
            instruction_section = (
                f"## Pseudo-code specification to implement\n{pseudo_code}\n\n"
                f"Implement every TEST block above as one test method. Do not add "
                f"tests that are absent from the specification, and do not drop "
                f"any that are present.\n\n"
            )
        elif plan:
            instruction_section = f"## Test plan to implement\n{plan}\n\n"
        else:
            instruction_section = (
                "## Task\nDesign and implement a thorough test suite for the "
                "class below.\n\n"
            )

        return (
            f"Write the unit-test class for `{cut.qualified_name}`.\n\n"
            f"{instruction_section}"
            f"## Class under test\n```java\n{source}\n```\n\n"
            f"## Requirements\n"
            f"- Testing framework: {framework}. Java version: {java_version}.\n"
            f"- Package: `{cut.package or '(default package)'}`; "
            f"class name: `{cut.name}Test`.\n"
            f"- Mock these collaborators with Mockito: "
            f"{', '.join(d.type_name for d in cut.mockable_dependencies) or 'none'}.\n"
            f"- Never mock the class under test itself.\n"
            f"- Call only methods that exist in the source above.\n"
            f"- Use strict assertions; never assert a tautology.\n\n"
            f"## Output\n"
            f"Return ONLY the Java source of the test class, with all required "
            f"imports and the package declaration. No prose, no markdown fences."
        )

    def _correction_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        attempt = context.get("attempt", 1)
        max_attempts = context.get("max_attempts", 5)
        diagnosis = context.get("diagnosis") or "(no structured diagnosis available)"
        score = context.get("classifier_score")
        score_section = ""
        if score is not None:
            interpretation = {
                -1: (
                    "REGRESSION: your previous change made things worse. Discard "
                    "that approach and reconsider from the original error."
                ),
                0: (
                    "NO PROGRESS: your previous change resolved nothing. Do not "
                    "repeat it; attack a different root cause."
                ),
                1: (
                    "PARTIAL PROGRESS: your previous change resolved some errors. "
                    "Keep it and fix what remains."
                ),
            }.get(score, "")
            score_section = (
                f"## Effectiveness of the previous attempt (score {score:+d})\n"
                f"{interpretation}\n\n"
            )

        return (
            f"Repair the failing test class for `{cut.qualified_name}`.\n"
            f"This is correction attempt {attempt} of {max_attempts}.\n\n"
            f"## Class under test\n"
            f"```java\n{truncate_to_tokens(cut.source, self.max_source_tokens)}\n```\n\n"
            f"## Failing test code\n```java\n{context['faulty_test']}\n```\n\n"
            f"## Build/test errors\n```\n{context.get('error_log', '')}\n```\n\n"
            f"## Diagnosis\n{diagnosis}\n\n"
            f"{score_section}"
            f"## Rules\n"
            f"- Fix every reported error.\n"
            f"- Preserve test method names and assertions; do not delete tests to "
            f"silence a failure. If a test targets a method that does not exist, "
            f"correct it to the real API rather than removing it.\n"
            f"- Verify each symbol you use against the class under test above.\n\n"
            f"## Output\n"
            f"Return ONLY the complete corrected Java test class. No prose, no "
            f"markdown fences."
        )

    # ------------------------------------------------------------------
    def parse(self, response_text: str, context: CrewContext) -> str | None:
        cut: JavaClass = context["cut"]
        code = extract_java_code(response_text)
        if code is None:
            return None

        code = _ensure_package(code, cut.package)
        context["test_code"] = code
        context["test_class_name"] = extract_test_class_name(code) or f"{cut.name}Test"
        context["test_package"] = extract_package(code) or cut.package
        return code

    def run(self, context: CrewContext) -> AgentOutput:
        output = super().run(context)
        if output.ok and not output.structured:
            output.ok = False
            output.error = "response contained no recoverable Java source"
            logger.debug(
                "%s: no Java code extracted from response (%d chars)",
                self.spec.name,
                len(output.text),
            )
        return output


def _ensure_package(code: str, package: str | None) -> str:
    """Insert the expected package declaration when the model omitted it.

    A missing package declaration puts the test in the default package, from
    which it cannot see a package-private class under test -- a compilation
    failure that has nothing to do with the model's test-writing ability.
    """
    if not package:
        return code
    if re.search(r"^\s*package\s+[\w.]+\s*;", code, re.MULTILINE):
        return code
    return f"package {package};\n\n{code}"
