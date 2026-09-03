"""Test Correction Crew agents (Section 3.1.3, Appendix B).

The Error Interpreter turns raw build logs into an actionable diagnosis; the
Classifier decides, from the second attempt onward, whether the loop is making
progress and is therefore worth continuing.
"""

from __future__ import annotations

import logging

from ..build.errors import ErrorReport, compare_reports
from ..config.schema import CorrectionScore
from ..java.model import JavaClass
from ..llm.parsing import extract_json, extract_score
from ..llm.tokens import truncate_to_tokens
from .base import Agent, AgentOutput, AgentSpec, CrewContext

logger = logging.getLogger(__name__)

ERROR_INTERPRETER = "Error Interpreter"
CLASSIFIER_AGENT = "Classifier Agent"

#: Few-shot examples grounding the Classifier, derived from the Java build-failure
#: taxonomy of Seo et al. (ICSE 2014) as described in Appendix B. Each example
#: pairs a transition between consecutive error logs with its correct score.
CLASSIFIER_FEW_SHOT = """\
Example 1
  Previous: 4 errors -- "cannot find symbol: method getNmae()" (x2), \
"cannot find symbol: class Optionl", "';' expected"
  Current:  1 error  -- "cannot find symbol: method getNmae()"
  Score: +1
  Why: three of four errors were resolved and no new error appeared. The fix is
  working; the loop should continue.

Example 2
  Previous: 2 errors -- "cannot find symbol: class UserRepo"
  Current:  2 errors -- "cannot find symbol: class UserRepo"
  Score: 0
  Why: the identical errors persist. The attempt changed nothing relevant;
  repeating the same approach will not help.

Example 3
  Previous: 1 error  -- "incompatible types: String cannot be converted to Long"
  Current:  7 errors -- "';' expected", "illegal start of expression", \
"reached end of file while parsing"
  Score: -1
  Why: a single type error was replaced by a cascade of syntax errors. The class
  is now structurally broken; this is a regression.

Example 4
  Previous: 3 errors -- assertion failures in testA, testB, testC
  Current:  2 errors -- assertion failure in testA, NullPointerException in testD
  Score: 0
  Why: the error count fell by one, but a new failure of a different kind
  appeared in a previously passing test. Net progress is not established.

Example 5
  Previous: 5 errors -- "package org.junit does not exist" (x5)
  Current:  2 errors -- assertion failures in testA and testB
  Score: +1
  Why: the build now compiles and execution has been reached. Moving from the
  build phase to the test phase is progress even though failures remain.
"""


class ErrorInterpreterAgent(Agent):
    """Diagnoses a build or test failure.

    Appendix B: *"Analyzes the raw build error logs and produces a structured
    report identifying root cause, affected files/lines, technical reasoning, and
    actionable fixes."*

    Section 5.3 attributes the loop's efficiency to precisely this step: feeding
    the Test Developer a structured analysis rather than a raw log is what keeps
    the average attempt count near 1.1--1.5 for the dynamic strategy.

    Context inputs:
        ``cut``, ``faulty_test``, ``error_log``, ``error_report``.

    Context outputs:
        ``diagnosis`` (str), ``diagnosis_structured`` (dict).
    """

    spec = AgentSpec(
        name=ERROR_INTERPRETER,
        role="Expert in build/test error analysis.",
        goal=(
            "Explain why the generated test failed and state the minimal change "
            "that resolves it."
        ),
        backstory=(
            "You read compiler and test-runner output for a living. You "
            "distinguish the one root cause from the dozen downstream symptoms it "
            "produced, and you never propose deleting a test to make an error go "
            "away."
        ),
        prompt_file="error_interpreter_agent.txt",
        returns="A structured textual diagnostic report consumed by the other agents.",
    )

    def __init__(self, *, max_log_tokens: int = 3_000, max_source_tokens: int = 8_000, **kwargs):
        super().__init__(**kwargs)
        self.max_log_tokens = max_log_tokens
        self.max_source_tokens = max_source_tokens

    def build_task(self, context: CrewContext) -> str:
        cut: JavaClass = context["cut"]
        report: ErrorReport | None = context.get("error_report")
        raw_log = truncate_to_tokens(context.get("error_log", ""), self.max_log_tokens)

        categorised = report.summary() if report else "No structured categorisation available."
        phase = "compilation" if not context.get("compiled", False) else "test execution"

        return (
            f"Diagnose the failure of the test class generated for "
            f"`{cut.qualified_name}`.\n\n"
            f"The failure occurred during **{phase}**.\n\n"
            f"## Class under test\n"
            f"```java\n{truncate_to_tokens(cut.source, self.max_source_tokens)}\n```\n\n"
            f"## Failing test code\n```java\n{context.get('faulty_test', '')}\n```\n\n"
            f"## Categorised errors\n{categorised}\n\n"
            f"## Raw build log\n```\n{raw_log}\n```\n\n"
            f"## Your task\n"
            f"Return a JSON object with these keys:\n"
            f'  "root_cause": one sentence naming the single underlying cause;\n'
            f'  "category": one of "Symbol/Import Mismatch", "Syntax Violations", '
            f'"Assertion Failures", "Runtime Exceptions";\n'
            f'  "affected": an array of objects with "file", "line", and "symbol";\n'
            f'  "reasoning": two or three sentences explaining why the code fails, '
            f"referring to the actual API of the class under test;\n"
            f'  "fixes": an ordered array of concrete, minimal edits, each stating '
            f"what to change and what to change it to;\n"
            f'  "cascading": true when most reported errors are downstream '
            f"consequences of one defect, false otherwise.\n\n"
            f"Ground every claim in the source above. If the test calls a method "
            f"that does not exist, say so explicitly and give the correct signature."
        )

    def parse(self, response_text: str, context: CrewContext) -> dict | None:
        payload = extract_json(response_text)
        if isinstance(payload, dict):
            context["diagnosis_structured"] = payload
            context["diagnosis"] = _render_diagnosis(payload)
        else:
            context["diagnosis_structured"] = None
            context["diagnosis"] = response_text.strip()
        return payload if isinstance(payload, dict) else None

    def run(self, context: CrewContext) -> AgentOutput:
        output = super().run(context)
        if not output.ok:
            # The loop must survive a diagnosis failure: fall back to the
            # deterministic categorisation the build module already produced.
            report: ErrorReport | None = context.get("error_report")
            fallback = report.summary() if report else context.get("error_log", "")
            context["diagnosis"] = fallback
            context["diagnosis_structured"] = None
            output.text = fallback
            output.ok = True
        return output


class ClassifierAgent(Agent):
    """Scores the progress made by the previous correction attempt.

    Appendix B: *"Compares old and new error logs framed as in-context learning;
    emits a score S in {-1, 0, +1} (regression / no progress / partial progress)
    ... the Coordinator halts the loop on S = -1."*

    The LLM judgement is grounded with a deterministic diff of the two error
    reports, so the agent reasons over facts rather than over its own reading of
    two long logs.

    Context inputs:
        ``previous_error``, ``error_log``, ``previous_error_report``,
        ``error_report``.

    Context outputs:
        ``classifier_score`` (int), ``classifier_message`` (str).
    """

    spec = AgentSpec(
        name=CLASSIFIER_AGENT,
        role="Test Effectiveness Classifier.",
        goal=(
            "Decide whether the last repair attempt moved the build closer to "
            "success, left it unchanged, or made it worse."
        ),
        backstory=(
            "Compilability comes before correctness. A build that regresses from "
            "one type error to a cascade of syntax errors has moved backwards, "
            "however many errors the count happens to show."
        ),
        prompt_file="classifier_agent.txt",
        returns=(
            "Effectiveness score S and an explanatory message; the Coordinator "
            "halts the loop on S = -1."
        ),
    )

    def __init__(self, *, max_log_tokens: int = 1_500, **kwargs) -> None:
        super().__init__(**kwargs)
        self.max_log_tokens = max_log_tokens

    def build_task(self, context: CrewContext) -> str:
        previous_report: ErrorReport | None = context.get("previous_error_report")
        current_report: ErrorReport | None = context.get("error_report")

        diff_section = ""
        if previous_report is not None and current_report is not None:
            diff = compare_reports(previous_report, current_report)
            diff_section = (
                f"## Deterministic diff of the two error sets\n"
                f"errors before: {diff['previous_count']}\n"
                f"errors now: {diff['current_count']}\n"
                f"resolved: {diff['resolved']}\n"
                f"newly introduced: {diff['introduced']}\n"
                f"persisting unchanged: {diff['persisted']}\n\n"
            )

        previous_log = truncate_to_tokens(
            context.get("previous_error", ""), self.max_log_tokens
        )
        current_log = truncate_to_tokens(context.get("error_log", ""), self.max_log_tokens)

        return (
            f"Score the effectiveness of the last correction attempt.\n\n"
            f"## Scoring rubric\n"
            f"+1 (partial progress): errors were resolved without introducing a "
            f"worse class of failure, or the build advanced from the compilation "
            f"phase to the test phase.\n"
            f" 0 (no progress): the same errors persist, or gains and losses "
            f"cancel out.\n"
            f"-1 (regression): the code is now in a worse state -- for example a "
            f"semantic error was replaced by syntax errors, or a previously "
            f"compiling class no longer compiles.\n\n"
            f"## Calibration examples\n{CLASSIFIER_FEW_SHOT}\n"
            f"{diff_section}"
            f"## Error log BEFORE the attempt (Error_i-1)\n```\n{previous_log}\n```\n\n"
            f"## Error log AFTER the attempt (Error_i)\n```\n{current_log}\n```\n\n"
            f"## Your task\n"
            f'Return a JSON object with the keys "score" (-1, 0, or 1) and '
            f'"message" (one sentence justifying the score). Judge the *kind* of '
            f"error, not only the count: fewer but structurally worse errors is a "
            f"regression."
        )

    def parse(self, response_text: str, context: CrewContext) -> int | None:
        payload = extract_json(response_text)
        message = ""
        score: int | None = None
        if isinstance(payload, dict):
            message = str(payload.get("message", "")).strip()
            raw = payload.get("score")
            try:
                candidate = int(raw)
            except (TypeError, ValueError):
                candidate = None
            if candidate in (-1, 0, 1):
                score = candidate
        if score is None:
            score = extract_score(response_text)

        context["classifier_score"] = score
        context["classifier_message"] = message or response_text.strip()[:300]
        return score

    def run(self, context: CrewContext) -> AgentOutput:
        output = super().run(context)
        if not output.ok or output.structured is None:
            # An unusable classification must never halt the loop by accident:
            # fall back to the deterministic diff, defaulting to "no progress".
            score = _heuristic_score(context)
            context["classifier_score"] = score
            context["classifier_message"] = (
                "Score derived from the deterministic error diff (the Classifier "
                "produced no usable judgement)."
            )
            output.structured = score
            output.text = output.text or context["classifier_message"]
            output.ok = True
        return output


def _heuristic_score(context: CrewContext) -> int:
    """Deterministic fallback score from the error-report diff."""
    previous: ErrorReport | None = context.get("previous_error_report")
    current: ErrorReport | None = context.get("error_report")
    if previous is None or current is None:
        return CorrectionScore.NO_PROGRESS.value

    diff = compare_reports(previous, current)
    previously_compiled = context.get("previous_compiled", False)
    now_compiled = context.get("compiled", False)

    if previously_compiled and not now_compiled:
        # A class that used to compile no longer does: unambiguous regression.
        return CorrectionScore.REGRESSION.value
    if not previously_compiled and now_compiled:
        return CorrectionScore.PARTIAL_PROGRESS.value
    if diff["introduced"] > diff["resolved"] and diff["delta"] > 0:
        return CorrectionScore.REGRESSION.value
    if diff["resolved"] > 0 and diff["introduced"] == 0:
        return CorrectionScore.PARTIAL_PROGRESS.value
    return CorrectionScore.NO_PROGRESS.value


def _render_diagnosis(payload: dict) -> str:
    """Render a structured diagnosis into the text the Test Developer receives."""
    lines = [f"Root cause: {payload.get('root_cause', 'unspecified')}"]
    if payload.get("category"):
        lines.append(f"Category: {payload['category']}")
    affected = payload.get("affected") or []
    if isinstance(affected, list) and affected:
        rendered = []
        for entry in affected:
            if isinstance(entry, dict):
                location = ":".join(
                    str(entry[key]) for key in ("file", "line") if entry.get(key)
                )
                symbol = entry.get("symbol")
                rendered.append(f"{location} {symbol}".strip() or "unspecified")
            else:
                rendered.append(str(entry))
        lines.append("Affected: " + "; ".join(rendered))
    if payload.get("reasoning"):
        lines.append(f"Reasoning: {payload['reasoning']}")
    fixes = payload.get("fixes") or []
    if isinstance(fixes, list) and fixes:
        lines.append("Fixes:")
        lines.extend(f"  {index}. {fix}" for index, fix in enumerate(fixes, start=1))
    if payload.get("cascading"):
        lines.append(
            "Note: most reported errors are downstream consequences of the single "
            "root cause above."
        )
    return "\n".join(lines)
