"""The RQ6 baseline adapters.

The comparison in RQ6 only means what the paper says it means if every arm is
measured by the same pipeline. These tests hold the adapters to that: they
produce a test class and nothing else, and an LLM baseline cannot run without
being told which backend it was given.
"""

from __future__ import annotations

from pathlib import Path

import pytest

from benjitest.baselines import ADAPTERS, BaselineAdapter, BaselineResult, adapter_for
from benjitest.baselines.testforge import TestForgeAdapter, _strip_fence
from benjitest.config.schema import ExternalBaselineConfig


class FakeResponse:
    def __init__(self, text):
        self.text = text
        self.prompt_tokens = 100
        self.completion_tokens = 50


class FakeLLM:
    """Stands in for the LLM Interaction Layer, with its real signature."""

    def __init__(self, replies):
        self.replies = list(replies)
        self.prompts = []

    def complete(self, llm, *, system=None, user, tag="", **overrides):
        self.prompts.append(user)
        return FakeResponse(self.replies.pop(0) if self.replies else "class T {}")


class FakeReport:
    def __init__(self, compiled, log=""):
        self.compiled = compiled
        self.log = log


class FakeSandbox:
    def __init__(self, path):
        self.path = path


class FakeBuild:
    """Stands in for BuildSystem, with the method the correction loop calls."""

    def __init__(self, reports):
        self.reports = list(reports)
        self.calls = []

    def compile_and_run(self, sandbox, test_class, *, with_coverage=False):
        self.calls.append((test_class, with_coverage))
        return self.reports.pop(0) if self.reports else FakeReport(True)


def make_project(tmp_path: Path) -> Path:
    src = tmp_path / "src" / "main" / "java" / "com" / "example"
    src.mkdir(parents=True)
    (src / "Widget.java").write_text(
        "package com.example;\npublic class Widget { public int f(int x){ return x; } }\n",
        encoding="utf-8")
    return tmp_path


class TestRegistry:
    def test_every_adapter_is_a_baseline_adapter(self):
        assert set(ADAPTERS) == {"chatunitest", "evosuite", "testforge"}
        for cls in ADAPTERS.values():
            assert issubclass(cls, BaselineAdapter)

    def test_adapter_resolves_by_configured_name(self):
        cfg = ExternalBaselineConfig(name="evosuite", kind="search-based", version="1.2.0")
        assert adapter_for(cfg) is ADAPTERS["evosuite"]

    def test_unknown_baseline_is_refused_by_name(self):
        cfg = ExternalBaselineConfig(name="randoop", kind="search-based")
        with pytest.raises(ValueError, match="randoop"):
            adapter_for(cfg)

    def test_llm_baseline_without_a_backend_cannot_be_constructed(self, tmp_path):
        # An LLM baseline run on its own default backend would confound
        # orchestration with model choice, which is what RQ6 exists to separate.
        cfg = ExternalBaselineConfig(name="testforge", kind="llm", backend="gpt-4.1")
        with pytest.raises(ValueError, match="LLM Interaction Layer"):
            TestForgeAdapter(cfg, tmp_path, llm_layer=None)


class TestForgePort:
    def cfg(self):
        return ExternalBaselineConfig(name="testforge", kind="llm", backend="gpt-4.1")

    def test_writes_a_test_class_for_the_target(self, tmp_path):
        project = make_project(tmp_path)
        llm = FakeLLM(["```java\nclass WidgetTest { }\n```"])
        a = TestForgeAdapter(self.cfg(), tmp_path, llm, FakeBuild([FakeReport(True)]))
        r = a.generate(FakeSandbox(project), "com.example.Widget")
        assert not r.failed
        assert r.test_file == project / "src" / "test" / "java" / "com" / "example" / "WidgetTest.java"
        assert r.test_file.read_text(encoding="utf-8").strip() == "class WidgetTest { }"

    def test_refines_against_uncovered_lines_then_stops(self, tmp_path):
        project = make_project(tmp_path)
        llm = FakeLLM(["class WidgetTest { }", "class WidgetTest { /* more */ }"])
        a = TestForgeAdapter(self.cfg(), tmp_path, llm,
                             FakeBuild([FakeReport(True), FakeReport(True)]))
        r = a.generate(FakeSandbox(project), "com.example.Widget")
        # with no JaCoCo report present the loop stops after one round rather
        # than refining against a gap it cannot see
        assert len(llm.prompts) == 1
        assert a.build.calls and a.build.calls[0][1] is True

    def test_repairs_before_refining_when_the_suite_does_not_build(self, tmp_path):
        project = make_project(tmp_path)
        llm = FakeLLM(["class Broken {", "class WidgetTest { }"])
        a = TestForgeAdapter(self.cfg(), tmp_path, llm,
                             FakeBuild([FakeReport(False, "';' expected"), FakeReport(True)]))
        r = a.generate(FakeSandbox(project), "com.example.Widget")
        assert "';' expected" in llm.prompts[1]
        assert not r.failed

    def test_counts_the_tokens_it_spent(self, tmp_path):
        project = make_project(tmp_path)
        llm = FakeLLM(["class WidgetTest { }", "class WidgetTest { }"])
        a = TestForgeAdapter(self.cfg(), tmp_path, llm,
                             FakeBuild([FakeReport(False, "boom"), FakeReport(True)]))
        r = a.generate(FakeSandbox(project), "com.example.Widget")
        assert r.prompt_tokens == 200 and r.completion_tokens == 100
        assert r.tokens == 300

    def test_missing_class_under_test_is_reported_not_raised(self, tmp_path):
        a = TestForgeAdapter(self.cfg(), tmp_path, FakeLLM([]))
        r = a.generate(FakeSandbox(tmp_path), "com.example.Absent")
        assert r.failed and "not found" in r.error

    def test_the_result_carries_no_quality_metrics(self, tmp_path):
        # Coverage, mutation and smells are the harness's job, not the adapter's;
        # that is what makes the RQ6 comparison like-for-like.
        r = BaselineResult(system="testforge", target="com.example.Widget", test_source="x")
        assert not hasattr(r, "line_coverage")
        assert not hasattr(r, "mutation_score")


class TestFenceStripping:
    @pytest.mark.parametrize("raw,expected", [
        ("```java\nclass A {}\n```", "class A {}"),
        ("```\nclass A {}\n```", "class A {}"),
        ("class A {}", "class A {}"),
        ("Here you go:\n```java\nclass A {}\n```\nHope that helps.", "class A {}"),
    ])
    def test_model_prose_is_removed(self, raw, expected):
        assert _strip_fence(raw).strip() == expected
