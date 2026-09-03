"""A port of TestForge's method to Java.

TestForge as published targets Python. Its contribution is not the language
binding but the loop: generate a suite, run it, feed the execution and coverage
report back, and refine against the uncovered lines rather than only against
compilation errors. That loop is what this file reproduces.

The port is released because the RQ6 numbers attributed to TestForge come from
it and not from the authors' implementation, and a reader should be able to
judge the translation rather than take it on faith. Three deviations are worth
naming up front:

1. Coverage feedback comes from JaCoCo rather than coverage.py, and is reported
   to the model as uncovered line ranges within the class under test.
2. The published implementation refines until a coverage target or an iteration
   cap; we keep the iteration cap and drop the target, so that the budget is the
   same for every class and comparable to the budget the other arms receive.
3. Assertion generation is left to the model, as in the original. We do not
   apply BenjiTest's Error Interpreter or Classifier here -- doing so would make
   the arm a variant of our own system rather than a baseline.
"""

from __future__ import annotations

import logging
import re
from pathlib import Path

from .base import BaselineAdapter, BaselineResult

logger = logging.getLogger(__name__)

MAX_ROUNDS = 5

PROMPT_INITIAL = """You are writing a JUnit 5 test class for the Java class below.
Cover its public behaviour. Return only the test class, no prose.

Class under test ({qualified_name}):
```java
{source}
```
"""

PROMPT_REFINE = """The test class you wrote compiles and runs, but these lines of
{qualified_name} are still not covered:

{uncovered}

Extend the test class to reach them. Keep the existing tests. Return only the
full test class, no prose.

Current test class:
```java
{tests}
```
"""

PROMPT_REPAIR = """The test class you wrote does not build. The compiler said:

{errors}

Return a corrected full test class, no prose.

Current test class:
```java
{tests}
```
"""


class TestForgeAdapter(BaselineAdapter):
    """Feedback-driven refinement against execution and coverage."""

    system = "testforge"
    #: pytest would otherwise try to collect this as a test class.
    __test__ = False

    def __init__(self, config, sandbox_root, llm_layer=None, build=None,
                 llm_config=None):
        super().__init__(config, sandbox_root, llm_layer)
        #: BuildSystem, used exactly as the Test Correction Crew uses it.
        self.build = build
        #: Backend the arm was given; RQ6 pins it so the comparison isolates
        #: orchestration rather than model choice.
        self.llm_config = llm_config

    def generate(self, sandbox, qualified_name: str) -> BaselineResult:
        """Refine a suite for ``qualified_name`` inside an existing sandbox."""
        result = BaselineResult(system=self.system, target=qualified_name, test_source=None)
        project = Path(sandbox.path)
        source = self._read_class(project, qualified_name)
        if source is None:
            result.failed = True
            result.error = "class under test not found in %s" % project
            return result

        tests = self._ask(PROMPT_INITIAL.format(qualified_name=qualified_name,
                                                source=source), result)
        path = self._test_path(project, qualified_name)
        test_class = qualified_name + "Test"
        for _ in range(MAX_ROUNDS):
            path.parent.mkdir(parents=True, exist_ok=True)
            path.write_text(tests, encoding="utf-8")
            report = (self.build.compile_and_run(sandbox, test_class, with_coverage=True)
                      if self.build else None)
            if report is not None and not report.compiled:
                tests = self._ask(PROMPT_REPAIR.format(errors=report.log[-4000:],
                                                       tests=tests), result)
                continue
            uncovered = self._uncovered(sandbox, qualified_name)
            if not uncovered:
                break
            tests = self._ask(PROMPT_REFINE.format(qualified_name=qualified_name,
                                                   uncovered=uncovered, tests=tests), result)

        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text(tests, encoding="utf-8")
        result.test_source = tests
        result.test_file = path
        return result

    # -- helpers -----------------------------------------------------------
    def _ask(self, prompt: str, result: BaselineResult) -> str:
        response = self.llm.complete(self.llm_config, user=prompt, tag="testforge")
        result.prompt_tokens += response.prompt_tokens
        result.completion_tokens += response.completion_tokens
        return _strip_fence(response.text)

    def _uncovered(self, sandbox, qualified_name: str) -> str:
        """Uncovered line ranges of the class under test, as the model sees them.

        Read from the JaCoCo report the build has just written, through the same
        parser the main pipeline uses, so the coverage the baseline optimises
        against is the coverage we later report for it.
        """
        from ..metrics.coverage import find_report, parse_report

        report = find_report(sandbox.path)
        if report is None:
            return ""
        metrics = parse_report(report, qualified_name)
        if not metrics.available or not metrics.lines_missed:
            return ""
        lines = sorted(getattr(metrics, "missed_line_numbers", []) or [])
        if not lines:
            # the parser reports counters rather than line numbers for some
            # report formats; fall back to naming the count
            return "  %d lines of %s are not covered" % (
                metrics.lines_missed, qualified_name)
        ranges, start, prev = [], lines[0], lines[0]
        for n in lines[1:]:
            if n != prev + 1:
                ranges.append((start, prev)); start = n
            prev = n
        ranges.append((start, prev))
        return "\n".join("  lines %d-%d" % r if r[0] != r[1] else "  line %d" % r[0]
                         for r in ranges)

    @staticmethod
    def _read_class(project: Path, qualified_name: str) -> str | None:
        pkg, simple = qualified_name.rsplit(".", 1)
        path = project / "src" / "main" / "java" / Path(*pkg.split(".")) / (simple + ".java")
        return path.read_text(encoding="utf-8") if path.is_file() else None


def _strip_fence(text: str) -> str:
    match = re.search(r"```(?:java)?\s*(.*?)```", text, re.S)
    return (match.group(1) if match else text).strip() + "\n"
