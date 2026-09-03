"""Algorithm 1: end-to-end orchestration, with the build system stubbed.

The build system is replaced by a scripted double so the suite runs without
Maven, a JDK, or network access. Everything above it -- crew composition, the
strategy paths, the correction hand-off, metric recording, resumption -- is the
real implementation.
"""

from __future__ import annotations

import csv

import pytest
from conftest import FakeLLMLayer

from benjitest.build.errors import parse_build_log
from benjitest.build.integration import BuildResult, BuildStatus
from benjitest.config.loader import load_config
from benjitest.coordinator import Coordinator
from benjitest.datasets.base import Dataset, TargetClass
from benjitest.metrics.model import TestMetrics

GENERATED_TEST = """```java
package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderServiceTest {
    @Test
    void processOrder_null_throws() {
        assertThrows(IllegalArgumentException.class, () -> new OrderService(null).processOrder(null));
    }
}
```"""

COMPILE_ERROR_LOG = "[ERROR] /w/OrderServiceTest.java:[9,5] cannot find symbol\n[INFO] BUILD FAILURE"


def make_config(tmp_path, repo_root, *, strategies: str, correction: bool = True):
    text = f"""
experiment:
  name: smoke
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
    temperature: 0
    seed: 42
strategies:
{strategies}
correction:
  enabled: {str(correction).lower()}
  max_attempts: 3
build:
  skip_initial_validation: true
  inject_dependencies_for_metrics: false
metrics:
  coverage: {{line: false, branch: false, method: false}}
  mutation: {{enabled: false}}
  smells: {{enabled: true}}
reporting:
  output_dir: {tmp_path / 'out'}
logging:
  save_llm_responses: false
execution:
  parallel_jobs: 1
"""
    path = tmp_path / "exp.yaml"
    path.write_text(text, encoding="utf-8")
    config = load_config(path)
    # Prompt files resolve against the repository, not the temporary directory.
    for strategy in config.strategies:
        if strategy.prompt_file is not None:
            strategy.prompt_file = repo_root / "prompts" / strategy.prompt_file.name
    return config


class SingleClassDataset(Dataset):
    name = "stub"

    def __init__(self, project_root, source_path):
        self.project_root = project_root
        self.source_path = source_path

    def iter_projects(self):
        yield self.project_root.name, self.project_root

    def iter_targets(self):
        yield TargetClass(
            project_id=self.project_root.name,
            project_root=self.project_root,
            source_path=self.source_path,
            qualified_name="com.example.service.OrderService",
        )


class ScriptedBuildSystem:
    """Returns scripted build results and records the invocations."""

    def __init__(self, results, metadata):
        self.results = list(results)
        self.metadata = metadata
        self.calls = 0

    def resolve_metadata(self, project_root):
        return self.metadata

    def validate(self, project_root):
        return BuildResult(status=BuildStatus.SUCCESS, compiled=True, tests_passed=True)

    def compile_and_run(self, sandbox, test_class, **kwargs):
        result = self.results[min(self.calls, len(self.results) - 1)]
        self.calls += 1
        return result

    def run_command(self, project_root, args):
        return BuildResult(status=BuildStatus.SUCCESS, compiled=True, tests_passed=True)


def success() -> BuildResult:
    return BuildResult(status=BuildStatus.SUCCESS, compiled=True, tests_passed=True, tests_run=1)


def compile_error() -> BuildResult:
    result = BuildResult(status=BuildStatus.COMPILE_ERROR, compiled=False, log=COMPILE_ERROR_LOG)
    result.report = parse_build_log(COMPILE_ERROR_LOG, compiled=False)
    return result


@pytest.fixture
def wired(tmp_path, repo_root, maven_project, monkeypatch):
    """Build a Coordinator whose LLM layer and build system are doubles."""

    def _build(strategies: str, build_results, llm_responses, correction=True):
        config = make_config(tmp_path, repo_root, strategies=strategies, correction=correction)
        layer = FakeLLMLayer(default=llm_responses) if isinstance(llm_responses, str) else FakeLLMLayer(llm_responses)

        dataset = SingleClassDataset(
            maven_project,
            maven_project / "src" / "main" / "java" / "com" / "example" / "service" / "OrderService.java",
        )
        coordinator = Coordinator(
            config, dataset=dataset, llm_layer=layer, workdir=tmp_path / "sandboxes"
        )

        from benjitest.java.project import detect_build_metadata

        stub = ScriptedBuildSystem(build_results, detect_build_metadata(maven_project))
        coordinator.build_system = stub
        coordinator.reporter.build_system = stub
        # The Repository Crew builds its own BuildSystem; hand it the stub too.
        monkeypatch.setattr(
            coordinator.crew_factory,
            "build_repository_crew",
            lambda _bs: type(coordinator.crew_factory).build_repository_crew(
                coordinator.crew_factory, stub
            ),
        )
        # Metric collection needs neither JaCoCo nor PIT in this test.
        monkeypatch.setattr(
            coordinator.reporter,
            "compute_metrics",
            lambda **kwargs: TestMetrics(),
        )
        return coordinator, layer, stub

    return _build


DYNAMIC = """  - name: dynamic
    type: dynamic
    agents:
      class_analyzer: true
      black_box_tester: true
      white_box_tester: true
      prompt_engineer: true
"""

ZERO_SHOT = """  - name: zero-shot
    type: static
    prompt_file: prompts/zero_shot_java_test.txt
"""

PSEUDO = """  - name: pseudo-code
    type: intermediate
    agents:
      class_analyzer: true
      intermediate_representation: true
"""


class TestDynamicPath:
    def test_full_crew_runs_and_records(self, wired):
        coordinator, layer, _ = wired(DYNAMIC, [success()], GENERATED_TEST)
        summary = coordinator.run()

        assert summary.projects_processed == 1
        assert summary.tasks_executed == 1
        assert summary.tasks_failed == 0

        record = coordinator.reporter.records[0]
        assert record.compiled and record.compiled_initially
        assert record.model == "gpt-4.1" and record.strategy == "dynamic"
        assert record.attempts == 1

    def test_every_analysis_agent_is_invoked(self, wired):
        coordinator, layer, _ = wired(DYNAMIC, [success()], GENERATED_TEST)
        coordinator.run()

        tags = {tag for tag, _ in layer.calls}
        assert tags == {
            "Class Under Test Analyzer",
            "Black-box Test Agent",
            "White-box Test Agent",
            "Prompt Engineer",
            "Test Developer Agent",
        }

    def test_agents_run_in_the_specified_order(self, wired):
        coordinator, layer, _ = wired(DYNAMIC, [success()], GENERATED_TEST)
        coordinator.run()

        assert [tag for tag, _ in layer.calls] == [
            "Class Under Test Analyzer",
            "Black-box Test Agent",
            "White-box Test Agent",
            "Prompt Engineer",
            "Test Developer Agent",
        ]


class TestStaticPath:
    def test_analysis_agents_are_bypassed(self, wired):
        """Section 3.2: the static path tasks the Test Developer directly."""
        coordinator, layer, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()

        assert [tag for tag, _ in layer.calls] == ["Test Developer Agent"]

    def test_template_is_rendered_with_the_class(self, wired):
        coordinator, layer, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()

        _, prompt = layer.calls[0]
        assert "public class OrderService" in prompt
        assert "${" not in prompt


class TestPseudoCodePath:
    def test_ir_agent_sits_between_analyzer_and_developer(self, wired):
        coordinator, layer, _ = wired(PSEUDO, [success()], GENERATED_TEST)
        coordinator.run()

        assert [tag for tag, _ in layer.calls] == [
            "Class Under Test Analyzer",
            "Intermediate Representation Agent",
            "Test Developer Agent",
        ]


class TestAblationComposition:
    def test_no_whitebox_arm_omits_the_agent(self, wired):
        strategies = """  - name: no-whitebox
    type: dynamic
    agents:
      class_analyzer: true
      black_box_tester: true
      prompt_engineer: true
"""
        coordinator, layer, _ = wired(strategies, [success()], GENERATED_TEST)
        coordinator.run()

        tags = {tag for tag, _ in layer.calls}
        assert "White-box Test Agent" not in tags
        assert "Black-box Test Agent" in tags

    def test_no_context_arm_runs_only_the_synthesiser(self, wired):
        strategies = """  - name: no-context
    type: dynamic
    agents:
      prompt_engineer: true
"""
        coordinator, layer, _ = wired(strategies, [success()], GENERATED_TEST)
        coordinator.run()

        assert [tag for tag, _ in layer.calls] == ["Prompt Engineer", "Test Developer Agent"]


class TestCorrectionIntegration:
    def test_failed_build_triggers_the_loop(self, wired):
        coordinator, layer, stub = wired(
            ZERO_SHOT, [compile_error(), success()], GENERATED_TEST
        )
        coordinator.run()

        record = coordinator.reporter.records[0]
        assert not record.compiled_initially
        assert record.compiled
        assert record.correction_iterations == 1
        assert record.correction_termination == "success"
        assert record.initial_error_category == "Symbol/Import Mismatch"
        assert record.error_resolved

    def test_exhausted_attempts_are_recorded(self, wired):
        coordinator, _, _ = wired(ZERO_SHOT, [compile_error()], GENERATED_TEST)
        coordinator.run()

        record = coordinator.reporter.records[0]
        assert not record.compiled
        assert record.correction_termination == "max_attempts"
        assert record.attempts is None, "never-compiled classes contribute no attempt count"

    def test_correction_can_be_disabled(self, wired):
        coordinator, _, stub = wired(
            ZERO_SHOT, [compile_error()], GENERATED_TEST, correction=False
        )
        coordinator.run()

        record = coordinator.reporter.records[0]
        assert record.correction_termination == "not_attempted"
        assert stub.calls == 1, "no rebuild should be attempted"


class TestFailureHandling:
    def test_unusable_llm_output_is_recorded_not_raised(self, wired):
        coordinator, _, _ = wired(ZERO_SHOT, [success()], "I cannot help with that.")
        summary = coordinator.run()

        assert summary.tasks_executed == 1
        record = coordinator.reporter.records[0]
        assert not record.compiled and record.error

    def test_a_project_that_cannot_be_prepared_is_skipped(self, tmp_path, repo_root):
        config = make_config(tmp_path, repo_root, strategies=ZERO_SHOT)
        empty = tmp_path / "not-a-java-project"
        empty.mkdir()

        dataset = SingleClassDataset(empty, empty / "Nothing.java")
        coordinator = Coordinator(
            config,
            dataset=dataset,
            llm_layer=FakeLLMLayer(default=GENERATED_TEST),
            workdir=tmp_path / "sandboxes",
        )
        summary = coordinator.run()

        assert summary.projects_skipped == 1
        assert summary.tasks_executed == 0


class TestReporting:
    def test_per_class_csv_is_written(self, wired, tmp_path):
        coordinator, _, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()

        path = tmp_path / "out" / "per_class_results.csv"
        rows = list(csv.DictReader(path.open(encoding="utf-8")))

        assert len(rows) == 1
        assert rows[0]["model"] == "gpt-4.1"
        assert rows[0]["qualified_name"] == "com.example.service.OrderService"
        assert rows[0]["compiled"] == "1"

    def test_aggregate_csv_matches_the_published_layout(self, wired, tmp_path):
        from benjitest.report.generator import AGGREGATE_COLUMNS

        coordinator, _, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()

        path = tmp_path / "out" / "metrics_per_model_strategy.csv"
        with path.open(encoding="utf-8") as handle:
            reader = csv.DictReader(handle)
            assert reader.fieldnames == AGGREGATE_COLUMNS
            rows = list(reader)
        assert rows[0]["model"] == "gpt-4.1"

    def test_correction_breakdown_is_written(self, wired, tmp_path):
        coordinator, _, _ = wired(ZERO_SHOT, [compile_error(), success()], GENERATED_TEST)
        coordinator.run()

        rows = list(
            csv.DictReader((tmp_path / "out" / "correction_loop_breakdown.csv").open(encoding="utf-8"))
        )
        symbol = next(r for r in rows if r["error_type"] == "Symbol/Import Mismatch")
        assert symbol["phase"] == "Build"
        assert float(symbol["fix_rate_percent"]) == 100.0

    def test_candidate_test_file_is_saved(self, wired, tmp_path):
        coordinator, _, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()

        saved = list((tmp_path / "out" / "generated_tests").rglob("*.java"))
        assert len(saved) == 1
        assert "class OrderServiceTest" in saved[0].read_text(encoding="utf-8")

    def test_error_log_is_saved_on_failure(self, wired, tmp_path):
        coordinator, _, _ = wired(ZERO_SHOT, [compile_error()], GENERATED_TEST)
        coordinator.run()

        logs = list((tmp_path / "out" / "error_logs").rglob("*.log"))
        assert len(logs) == 1
        assert "cannot find symbol" in logs[0].read_text(encoding="utf-8")


class TestResumption:
    def test_completed_tasks_are_skipped_on_a_second_run(self, wired, tmp_path):
        coordinator, _, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        coordinator.run()
        assert len(coordinator.reporter.records) == 1

        # A fresh Coordinator over the same output directory must not redo the work.
        second, layer, _ = wired(ZERO_SHOT, [success()], GENERATED_TEST)
        summary = second.run()

        assert summary.tasks_executed == 0
        assert layer.calls == [], "no LLM call should be issued for a completed task"
