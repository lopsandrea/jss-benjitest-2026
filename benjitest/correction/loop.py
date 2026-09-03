"""Iterative correction loop -- Algorithm 2 of the paper.

The loop is activated by the Coordinator only when the Build System Integration
Module reports a compilation or runtime failure. Each iteration:

1. The **Error Interpreter** produces a structured diagnosis of the failure.
2. From the second attempt onward the **Classifier** scores progress against the
   previous error log and emits ``S in {-1, 0, +1}``; ``S = -1`` halts the loop.
3. A correction prompt combining class context, faulty code, diagnosis and (when
   available) the effectiveness score goes back to the **Test Developer** -- or,
   in pseudo-code mode, first to the **Intermediate Representation Agent**.
4. The build system recompiles and re-runs.

Termination: successful build, regression score, or the configured attempt limit.

At attempt *i* the Error Interpreter diagnoses the current failure ``Error_i``,
while the Classifier compares the consecutive pair ``(Error_{i-1}, Error_i)``.
"""

from __future__ import annotations

import logging
from dataclasses import dataclass, field

from ..agents.base import CrewContext
from ..build.errors import ErrorCategory, ErrorReport
from ..build.integration import BuildResult, BuildStatus, BuildSystem
from ..build.sandbox import Sandbox
from ..config.schema import CorrectionConfig, CorrectionScore
from ..crews.factory import CorrectionAgents
from ..java.model import JavaClass

logger = logging.getLogger(__name__)


class TerminationReason(str):
    """Why the loop stopped -- recorded for the RQ3 analysis."""

    SUCCESS = "success"
    REGRESSION = "regression"
    MAX_ATTEMPTS = "max_attempts"
    GENERATION_FAILED = "generation_failed"
    NOT_ATTEMPTED = "not_attempted"


@dataclass(slots=True)
class CorrectionAttempt:
    """Record of one iteration, feeding the correction-loop breakdown of Table 8."""

    attempt: int
    #: Category of the error this attempt tried to repair.
    category: ErrorCategory | None
    phase: str
    error_count: int
    #: Classifier score, ``None`` on the first attempt.
    score: int | None = None
    score_message: str = ""
    diagnosis: str = ""
    #: Whether the Test Developer produced usable code this iteration.
    regenerated: bool = False
    #: Build status observed after applying the fix.
    resulting_status: BuildStatus | None = None
    resolved: bool = False


@dataclass(slots=True)
class CorrectionResult:
    """Outcome of the whole loop."""

    test_code: str
    build_result: BuildResult
    #: Total generation attempts, counting the initial generation as attempt 1.
    total_attempts: int = 1
    attempts: list[CorrectionAttempt] = field(default_factory=list)
    termination: str = TerminationReason.NOT_ATTEMPTED

    @property
    def fixed(self) -> bool:
        """Whether the loop ended with a compiling test class."""
        return self.build_result.compiled

    @property
    def fully_passing(self) -> bool:
        return self.build_result.status is BuildStatus.SUCCESS

    @property
    def correction_iterations(self) -> int:
        return len(self.attempts)


def run_correction_loop(
    *,
    test_code: str,
    cut: JavaClass,
    build_result: BuildResult,
    sandbox: Sandbox,
    build_system: BuildSystem,
    agents: CorrectionAgents,
    config: CorrectionConfig,
    context: CrewContext,
    test_class_name: str,
    test_package: str | None,
) -> CorrectionResult:
    """Execute Algorithm 2.

    Args:
        test_code: The failing test class.
        cut: The class under test.
        build_result: The build result that triggered the loop.
        sandbox: Sandbox holding the installed test.
        build_system: Used to recompile and re-run after each fix.
        agents: The Test Correction Crew's members.
        config: Correction settings (``max_attempts``, agent toggles).
        context: The shared crew context, carried over from generation so the
            correction agents see the analysis performed upstream.
        test_class_name: Simple name of the generated test class.
        test_package: Package the test class is installed into.

    Returns:
        The final test code and build result, plus a per-attempt record.
    """
    result = CorrectionResult(test_code=test_code, build_result=build_result)

    if not config.enabled:
        result.termination = TerminationReason.NOT_ATTEMPTED
        return result
    if not build_result.failed:
        result.termination = TerminationReason.SUCCESS
        return result
    if build_result.compiled and not config.correct_test_failures:
        # The suite compiles; only runtime/assertion failures remain and the
        # configuration asks us not to chase those.
        result.termination = TerminationReason.NOT_ATTEMPTED
        return result

    previous_error: str = build_result.error
    previous_report: ErrorReport = build_result.report
    previous_compiled: bool = build_result.compiled
    current = build_result
    attempt = 1

    while attempt <= config.max_attempts and current.failed:
        record = CorrectionAttempt(
            attempt=attempt,
            category=current.report.dominant_category,
            phase=current.phase,
            error_count=len(current.report),
        )

        # --- populate the shared context for this iteration ---------------
        context["cut"] = cut
        context["faulty_test"] = result.test_code
        context["error_log"] = current.error
        context["error_report"] = current.report
        context["compiled"] = current.compiled
        context["previous_error"] = previous_error
        context["previous_error_report"] = previous_report
        context["previous_compiled"] = previous_compiled
        context["attempt"] = attempt
        context["max_attempts"] = config.max_attempts
        context["classifier_score"] = None

        # --- step 1: diagnosis --------------------------------------------
        if agents.error_interpreter is not None:
            diagnosis_output = agents.error_interpreter.run(context)
            context.record(diagnosis_output)
            record.diagnosis = context.get("diagnosis", "")
        else:
            context["diagnosis"] = current.report.summary()
            record.diagnosis = context["diagnosis"]

        # --- step 2: progress classification (from attempt 2 onward) -------
        if attempt >= 2 and agents.classifier is not None:
            classifier_output = agents.classifier.run(context)
            context.record(classifier_output)
            score = context.get("classifier_score")
            record.score = score
            record.score_message = context.get("classifier_message", "")

            if score == CorrectionScore.REGRESSION.value and config.halt_on_regression:
                logger.info(
                    "correction halted on regression at attempt %d for %s",
                    attempt,
                    cut.qualified_name,
                )
                result.attempts.append(record)
                result.termination = TerminationReason.REGRESSION
                return result

        # --- step 3: regenerate --------------------------------------------
        # In pseudo-code mode the specification is revised first, so the repair
        # happens at the level of test logic rather than syntax.
        if agents.intermediate_representation is not None:
            ir_output = agents.intermediate_representation.run(context)
            context.record(ir_output)

        developer_output = agents.test_developer.run(context)
        context.record(developer_output)

        if not developer_output.ok or not developer_output.structured:
            logger.info(
                "correction attempt %d produced no usable code for %s",
                attempt,
                cut.qualified_name,
            )
            result.attempts.append(record)
            result.termination = TerminationReason.GENERATION_FAILED
            return result

        result.test_code = developer_output.structured
        record.regenerated = True
        result.total_attempts += 1

        # --- step 4: rebuild ------------------------------------------------
        previous_error = current.error
        previous_report = current.report
        previous_compiled = current.compiled

        sandbox.install_test(
            result.test_code,
            package=test_package,
            class_name=test_class_name,
        )
        qualified_test = f"{test_package}.{test_class_name}" if test_package else test_class_name
        current = build_system.compile_and_run(sandbox, qualified_test)

        record.resulting_status = current.status
        record.resolved = not current.failed
        result.attempts.append(record)
        result.build_result = current

        attempt += 1

    if not current.failed:
        result.termination = TerminationReason.SUCCESS
    elif result.termination == TerminationReason.NOT_ATTEMPTED:
        result.termination = TerminationReason.MAX_ATTEMPTS
    return result
