"""Algorithm 2: the iterative correction loop."""

from __future__ import annotations

from dataclasses import dataclass, field

import pytest

from benjitest.agents.base import AgentOutput, CrewContext
from benjitest.build.errors import ErrorCategory, parse_build_log
from benjitest.build.integration import BuildResult, BuildStatus
from benjitest.config.schema import CorrectionConfig
from benjitest.correction.loop import TerminationReason, run_correction_loop
from benjitest.crews.factory import CorrectionAgents
from benjitest.java.parser import parse_class

COMPILE_ERROR_LOG = (
    "[ERROR] /w/FooTest.java:[10,5] cannot find symbol\n[INFO] BUILD FAILURE"
)
SYNTAX_ERROR_LOG = (
    "[ERROR] /w/FooTest.java:[12,1] ';' expected\n"
    "[ERROR] /w/FooTest.java:[13,1] illegal start of expression\n"
    "[INFO] BUILD FAILURE"
)
ASSERTION_LOG = (
    "[ERROR] Tests run: 2, Failures: 1, Errors: 0, Skipped: 0\n"
    "[ERROR] FooTest.t:20 expected: <1> but was: <2>"
)


def make_result(status: BuildStatus, log: str = "") -> BuildResult:
    compiled = status in {BuildStatus.SUCCESS, BuildStatus.TESTS_FAILED}
    result = BuildResult(
        status=status,
        compiled=compiled,
        tests_passed=status is BuildStatus.SUCCESS,
        log=log,
    )
    if result.failed:
        result.report = parse_build_log(log, compiled=compiled)
    return result


class StubAgent:
    """An agent returning scripted outputs and recording its invocations."""

    def __init__(self, name, outputs, context_updates=None):
        self.spec = type("Spec", (), {"name": name})()
        self.outputs = list(outputs)
        self.context_updates = context_updates or {}
        self.calls = 0

    def run(self, context):
        self.calls += 1
        value = self.outputs[min(self.calls - 1, len(self.outputs) - 1)]
        for key, values in self.context_updates.items():
            context[key] = values[min(self.calls - 1, len(values) - 1)]
        return AgentOutput(agent=self.spec.name, text=str(value), structured=value)


@dataclass
class StubSandbox:
    """Records installed test code without touching the filesystem."""

    installed: list[str] = field(default_factory=list)
    installed_test = None

    def install_test(self, code, *, package, class_name):
        self.installed.append(code)

    def remove_installed_test(self):
        pass


class StubBuildSystem:
    """Returns a scripted sequence of build results."""

    def __init__(self, results):
        self.results = list(results)
        self.calls = 0

    def compile_and_run(self, sandbox, test_class, **kwargs):
        result = self.results[min(self.calls, len(self.results) - 1)]
        self.calls += 1
        return result


@pytest.fixture
def cut(sample_class_source):
    return parse_class(sample_class_source)


def build_agents(*, interpreter=None, classifier=None, developer=None, ir=None):
    return CorrectionAgents(
        error_interpreter=interpreter
        or StubAgent("Error Interpreter", [{"root_cause": "missing symbol"}],
                     {"diagnosis": ["Root cause: missing symbol"]}),
        classifier=classifier,
        intermediate_representation=ir,
        test_developer=developer or StubAgent("Test Developer Agent", ["class FooTest { /* v2 */ }"]),
    )


def run(cut, *, initial, build_results, agents, config=None, context=None):
    return run_correction_loop(
        test_code="class FooTest { /* v1 */ }",
        cut=cut,
        build_result=initial,
        sandbox=StubSandbox(),
        build_system=StubBuildSystem(build_results),
        agents=agents,
        config=config or CorrectionConfig(enabled=True, max_attempts=5),
        context=context if context is not None else CrewContext(),
        test_class_name="FooTest",
        test_package="com.example.service",
    )


class TestTermination:
    def test_returns_immediately_when_the_build_succeeded(self, cut):
        result = run(
            cut,
            initial=make_result(BuildStatus.SUCCESS),
            build_results=[],
            agents=build_agents(),
        )
        assert result.termination == TerminationReason.SUCCESS
        assert result.correction_iterations == 0
        assert result.total_attempts == 1

    def test_returns_immediately_when_disabled(self, cut):
        result = run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[],
            agents=build_agents(),
            config=CorrectionConfig(enabled=False),
        )
        assert result.termination == TerminationReason.NOT_ATTEMPTED

    def test_stops_on_first_successful_rebuild(self, cut):
        result = run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(),
        )

        assert result.termination == TerminationReason.SUCCESS
        assert result.fixed
        assert result.correction_iterations == 1
        # Initial generation plus one correction.
        assert result.total_attempts == 2

    def test_respects_the_attempt_limit(self, cut):
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        result = run(
            cut,
            initial=failure,
            build_results=[failure] * 10,
            agents=build_agents(),
            config=CorrectionConfig(enabled=True, max_attempts=3),
        )

        assert result.termination == TerminationReason.MAX_ATTEMPTS
        assert result.correction_iterations == 3
        assert not result.fixed

    def test_stops_when_the_developer_produces_nothing(self, cut):
        developer = StubAgent("Test Developer Agent", [None])
        result = run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(developer=developer),
        )
        assert result.termination == TerminationReason.GENERATION_FAILED


class TestClassifierGating:
    def test_classifier_does_not_run_on_the_first_attempt(self, cut):
        """Appendix B: triggered only on the second or subsequent attempt."""
        classifier = StubAgent("Classifier Agent", [1], {"classifier_score": [1]})
        run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(classifier=classifier),
        )
        assert classifier.calls == 0

    def test_classifier_runs_from_the_second_attempt(self, cut):
        classifier = StubAgent("Classifier Agent", [1, 1], {"classifier_score": [1, 1]})
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        run(
            cut,
            initial=failure,
            build_results=[failure, failure, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(classifier=classifier),
        )
        assert classifier.calls == 2

    def test_regression_halts_the_loop(self, cut):
        """S = -1 must stop the loop before another regeneration."""
        classifier = StubAgent("Classifier Agent", [-1], {"classifier_score": [-1]})
        developer = StubAgent("Test Developer Agent", ["class FooTest { /* v2 */ }"])
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)

        result = run(
            cut,
            initial=failure,
            build_results=[make_result(BuildStatus.COMPILE_ERROR, SYNTAX_ERROR_LOG)] * 5,
            agents=build_agents(classifier=classifier, developer=developer),
        )

        assert result.termination == TerminationReason.REGRESSION
        assert classifier.calls == 1
        # One regeneration on attempt 1, none after the regression verdict.
        assert developer.calls == 1

    def test_regression_halt_can_be_disabled(self, cut):
        classifier = StubAgent("Classifier Agent", [-1], {"classifier_score": [-1]})
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)

        result = run(
            cut,
            initial=failure,
            build_results=[failure] * 5,
            agents=build_agents(classifier=classifier),
            config=CorrectionConfig(enabled=True, max_attempts=3, halt_on_regression=False),
        )
        assert result.termination == TerminationReason.MAX_ATTEMPTS

    def test_score_is_recorded_per_attempt(self, cut):
        classifier = StubAgent("Classifier Agent", [0, 1], {"classifier_score": [0, 1]})
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)

        result = run(
            cut,
            initial=failure,
            build_results=[failure, failure, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(classifier=classifier),
        )
        assert [a.score for a in result.attempts] == [None, 0, 1]


class TestErrorInterpreterInput:
    def test_diagnoses_the_current_failure(self, cut):
        """At attempt i the interpreter receives ``Error_i`` (Algorithm 2)."""
        seen: list[str] = []

        class RecordingInterpreter(StubAgent):
            def run(self, context):
                seen.append(context["error_log"])
                context["diagnosis"] = "d"
                return AgentOutput(agent="Error Interpreter", text="d", structured={})

        interpreter = RecordingInterpreter("Error Interpreter", [{}])
        first = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        second = make_result(BuildStatus.COMPILE_ERROR, SYNTAX_ERROR_LOG)

        run(
            cut,
            initial=first,
            build_results=[second, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(interpreter=interpreter,
                                classifier=StubAgent("Classifier Agent", [1],
                                                     {"classifier_score": [1]})),
        )

        assert seen[0] == first.error
        assert seen[1] == second.error, "attempt 2 must diagnose the attempt-2 error"

    def test_classifier_receives_the_consecutive_error_pair(self, cut):
        pairs: list[tuple[str, str]] = []

        class RecordingClassifier(StubAgent):
            def run(self, context):
                pairs.append((context["previous_error"], context["error_log"]))
                context["classifier_score"] = 1
                return AgentOutput(agent="Classifier Agent", text="1", structured=1)

        first = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        second = make_result(BuildStatus.COMPILE_ERROR, SYNTAX_ERROR_LOG)

        run(
            cut,
            initial=first,
            build_results=[second, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(classifier=RecordingClassifier("Classifier Agent", [1])),
        )

        assert pairs == [(first.error, second.error)]

    def test_loop_survives_a_failing_interpreter(self, cut):
        class BrokenInterpreter(StubAgent):
            def run(self, context):
                return AgentOutput(agent="Error Interpreter", ok=False, error="LLM down")

        result = run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(interpreter=BrokenInterpreter("Error Interpreter", [None])),
        )
        assert result.fixed


class TestPseudoCodeMode:
    def test_ir_agent_revises_before_regeneration(self, cut):
        ir = StubAgent("Intermediate Representation Agent", ["TEST: revised"])
        result = run(
            cut,
            initial=make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(ir=ir),
        )
        assert ir.calls == 1 and result.fixed


class TestTestFailureHandling:
    def test_assertion_failures_are_corrected_by_default(self, cut):
        result = run(
            cut,
            initial=make_result(BuildStatus.TESTS_FAILED, ASSERTION_LOG),
            build_results=[make_result(BuildStatus.SUCCESS)],
            agents=build_agents(),
        )
        assert result.correction_iterations == 1
        assert result.attempts[0].category is ErrorCategory.ASSERTION
        assert result.attempts[0].phase == "test"

    def test_test_failure_correction_can_be_disabled(self, cut):
        result = run(
            cut,
            initial=make_result(BuildStatus.TESTS_FAILED, ASSERTION_LOG),
            build_results=[],
            agents=build_agents(),
            config=CorrectionConfig(enabled=True, correct_test_failures=False),
        )
        assert result.termination == TerminationReason.NOT_ATTEMPTED
        # It already compiles, so the compilation rate is unaffected.
        assert result.fixed


class TestBookkeeping:
    def test_records_the_error_category_per_attempt(self, cut):
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        result = run(
            cut,
            initial=failure,
            build_results=[failure, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(
                classifier=StubAgent("Classifier Agent", [1], {"classifier_score": [1]})
            ),
        )
        assert [a.category for a in result.attempts] == [
            ErrorCategory.SYMBOL_IMPORT,
            ErrorCategory.SYMBOL_IMPORT,
        ]

    def test_final_code_is_the_last_generated_version(self, cut):
        developer = StubAgent("Test Developer Agent", ["v2", "v3"])
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        result = run(
            cut,
            initial=failure,
            build_results=[failure, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(
                developer=developer,
                classifier=StubAgent("Classifier Agent", [1], {"classifier_score": [1]}),
            ),
        )
        assert result.test_code == "v3"

    def test_attempt_counter_matches_the_generations_performed(self, cut):
        failure = make_result(BuildStatus.COMPILE_ERROR, COMPILE_ERROR_LOG)
        result = run(
            cut,
            initial=failure,
            build_results=[failure, failure, make_result(BuildStatus.SUCCESS)],
            agents=build_agents(
                classifier=StubAgent("Classifier Agent", [1, 1], {"classifier_score": [1, 1]})
            ),
        )
        # 1 initial + 3 corrections.
        assert result.total_attempts == 4
        assert result.correction_iterations == 3
