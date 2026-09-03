"""Agents and crews: prompt construction, parsing, and sequential execution."""

from __future__ import annotations

import json

import pytest
from conftest import FakeLLMLayer

from benjitest.agents.analysis import BlackBoxAgent, ClassAnalyzerAgent, WhiteBoxAgent
from benjitest.agents.base import AgentOutput, AgentSpec, CrewContext, ToolAgent
from benjitest.agents.correction import ClassifierAgent, ErrorInterpreterAgent
from benjitest.agents.developer import TestDeveloperAgent, render_template, template_variables
from benjitest.agents.synthesis import IntermediateRepresentationAgent, PromptEngineerAgent
from benjitest.build.errors import parse_build_log
from benjitest.config.schema import OrchestrationBackend
from benjitest.crews.base import Crew
from benjitest.java.parser import parse_class


@pytest.fixture
def context(sample_class_source):
    cut = parse_class(sample_class_source)
    return CrewContext(
        cut=cut,
        project_types={"OrderRepository": "com.example.repository.OrderRepository"},
        build_metadata=type(
            "Meta", (), {"tool": "maven", "java_version": "17", "test_framework": "JUnit 5",
                         "package_to_artifact": {}}
        )(),
        project_tree="demo/\n  src/main/java/\n    com.example.service/  (1 classes)",
    )


def agent_kwargs(layer, llm, repo_root):
    return {"llm_layer": layer, "llm_config": llm, "prompts_dir": repo_root / "prompts" / "agents"}


class TestClassAnalyzer:
    def test_static_report_is_computed_without_the_llm(self, context, fake_llm_config, repo_root):
        layer = FakeLLMLayer(default='{"responsibility": "Processes orders."}')
        agent = ClassAnalyzerAgent(**agent_kwargs(layer, fake_llm_config, repo_root))

        report = agent.static_report(context)

        assert report["class_name"] == "OrderService"
        assert "processOrder(Order)" in report["testable_methods"]
        assert "OrderRepository" in report["mockable_dependencies"]

    def test_llm_adds_only_the_functional_description(self, context, fake_llm_config, repo_root):
        layer = FakeLLMLayer(default=json.dumps({"responsibility": "Processes orders."}))
        agent = ClassAnalyzerAgent(**agent_kwargs(layer, fake_llm_config, repo_root))

        output = agent.run(context)

        assert output.ok
        assert output.structured["functional_description"]["responsibility"] == "Processes orders."
        # The structural facts still come from the parser.
        assert output.structured["class_name"] == "OrderService"

    def test_survives_an_llm_failure(self, context, fake_llm_config, repo_root):
        class BrokenLayer(FakeLLMLayer):
            def complete(self, *args, **kwargs):
                from benjitest.llm.layer import LLMError

                raise LLMError("provider unavailable")

        agent = ClassAnalyzerAgent(**agent_kwargs(BrokenLayer(), fake_llm_config, repo_root))
        output = agent.run(context)

        assert output.ok, "the structural report must survive an LLM outage"
        assert output.structured["class_name"] == "OrderService"

    def test_task_withholds_method_bodies(self, context, fake_llm_config, repo_root):
        agent = ClassAnalyzerAgent(
            omit_method_bodies=True, **agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root)
        )
        task = agent.build_task(context)
        assert "throw new IllegalArgumentException" not in task


class TestBlackBoxAgent:
    def test_prompt_withholds_the_implementation(self, context, fake_llm_config, repo_root):
        agent = BlackBoxAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "public OrderResult processOrder(Order order);" in task
        assert "total += item.getPrice()" not in task, "black-box must not see the body"
        assert "NOT been shown the implementation" in task

    def test_includes_javadoc(self, context, fake_llm_config, repo_root):
        agent = BlackBoxAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        assert "must not be null" in agent.build_task(context)

    def test_parses_a_scenario_array(self, context, fake_llm_config, repo_root):
        payload = json.dumps(
            [{"name": "processOrder_null_throws", "method": "processOrder", "category": "null-input"}]
        )
        agent = BlackBoxAgent(
            **agent_kwargs(FakeLLMLayer(default=payload), fake_llm_config, repo_root)
        )
        output = agent.run(context)

        assert len(output.structured) == 1
        assert context["black_box_scenarios"][0]["name"] == "processOrder_null_throws"

    def test_parses_a_wrapped_scenario_array(self, context, fake_llm_config, repo_root):
        payload = json.dumps({"scenarios": [{"name": "a"}, {"name": "b"}]})
        agent = BlackBoxAgent(
            **agent_kwargs(FakeLLMLayer(default=payload), fake_llm_config, repo_root)
        )
        assert len(agent.run(context).structured) == 2


class TestWhiteBoxAgent:
    def test_prompt_includes_the_implementation(self, context, fake_llm_config, repo_root):
        agent = WhiteBoxAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "total += item.getPrice()" in task
        assert "cyclomatic complexity" in task

    def test_large_classes_are_chunked(self, fake_llm_config, repo_root):
        methods = "\n".join(
            f"    public void m{i}() {{ if (x > {i}) {{ doThing({i}); }} }}\n" for i in range(200)
        )
        cut = parse_class(f"package a;\npublic class Big {{\n{methods}}}\n")
        context = CrewContext(cut=cut)

        layer = FakeLLMLayer(default=json.dumps([{"name": "t", "condition": "x"}]))
        agent = WhiteBoxAgent(
            chunk_tokens=500, **agent_kwargs(layer, fake_llm_config, repo_root)
        )
        output = agent.run(context)

        assert len(layer.calls) > 1, "a large class must be processed in several chunks"
        assert output.ok
        # Identical scenarios across chunks are deduplicated.
        assert len(output.structured) == 1


class TestPromptEngineer:
    def test_synthesises_upstream_scenarios(self, context, fake_llm_config, repo_root):
        context["black_box_scenarios"] = [{"name": "bb_case", "given": "a null order"}]
        context["white_box_scenarios"] = [{"name": "wb_case", "condition": "items empty"}]
        context["analysis_report"] = {"functional_description": {"responsibility": "Orders."}}

        agent = PromptEngineerAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "bb_case" in task and "wb_case" in task
        assert "Behavioural scenarios (black-box)" in task
        assert "Structural scenarios (white-box)" in task

    def test_no_context_ablation_passes_raw_source(self, context, fake_llm_config, repo_root):
        """Section 4.8: with no upstream analysis, the raw source is passed through."""
        agent = PromptEngineerAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "No preliminary analysis is available" in task
        assert "total += item.getPrice()" in task

    def test_falls_back_deterministically_on_llm_failure(
        self, context, fake_llm_config, repo_root
    ):
        class BrokenLayer(FakeLLMLayer):
            def complete(self, *args, **kwargs):
                from benjitest.llm.layer import LLMError

                raise LLMError("down")

        agent = PromptEngineerAgent(**agent_kwargs(BrokenLayer(), fake_llm_config, repo_root))
        output = agent.run(context)

        assert output.ok
        assert "OrderService" in context["generation_prompt"]


class TestIntermediateRepresentation:
    def test_requests_given_when_then(self, context, fake_llm_config, repo_root):
        agent = IntermediateRepresentationAgent(
            **agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root)
        )
        task = agent.build_task(context)

        assert "GIVEN:" in task and "WHEN:" in task and "THEN:" in task
        assert "Write NO Java" in task

    def test_correction_mode_revises_the_specification(
        self, context, fake_llm_config, repo_root
    ):
        context["faulty_test"] = "class FooTest {}"
        context["diagnosis"] = "assertion expects a value the class never produces"
        context["pseudo_code"] = "TEST: old"

        agent = IntermediateRepresentationAgent(
            **agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root)
        )
        task = agent.build_task(context)

        assert "Previous pseudo-code" in task
        assert "assertion expects a value" in task


class TestTestDeveloper:
    def test_static_prompt_is_used_verbatim(self, context, fake_llm_config, repo_root):
        context["static_prompt"] = "RENDERED TEMPLATE BODY"
        agent = TestDeveloperAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        assert agent.build_task(context) == "RENDERED TEMPLATE BODY"

    def test_pseudo_code_mode(self, context, fake_llm_config, repo_root):
        context["pseudo_code"] = "TEST: processOrder_null_throws"
        agent = TestDeveloperAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "Pseudo-code specification to implement" in task
        assert "processOrder_null_throws" in task

    def test_extracts_and_packages_generated_code(self, context, fake_llm_config, repo_root):
        response = "```java\nclass OrderServiceTest { }\n```"
        agent = TestDeveloperAgent(
            **agent_kwargs(FakeLLMLayer(default=response), fake_llm_config, repo_root)
        )
        output = agent.run(context)

        assert output.ok
        assert context["test_class_name"] == "OrderServiceTest"
        assert context["test_package"] == "com.example.service"
        # A missing package declaration is repaired: without it the test cannot
        # see a package-private class under test.
        assert context["test_code"].startswith("package com.example.service;")

    def test_preserves_an_explicit_package(self, context, fake_llm_config, repo_root):
        response = "```java\npackage other.pkg;\nclass OrderServiceTest {}\n```"
        agent = TestDeveloperAgent(
            **agent_kwargs(FakeLLMLayer(default=response), fake_llm_config, repo_root)
        )
        agent.run(context)
        assert context["test_package"] == "other.pkg"

    def test_reports_failure_when_no_code_is_returned(self, context, fake_llm_config, repo_root):
        agent = TestDeveloperAgent(
            **agent_kwargs(FakeLLMLayer(default="I refuse."), fake_llm_config, repo_root)
        )
        output = agent.run(context)

        assert not output.ok
        assert "no recoverable Java" in output.error

    def test_correction_mode_uses_the_fixer_prompt(self, context, fake_llm_config, repo_root):
        agent = TestDeveloperAgent(
            options={"correction_mode": True},
            **agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root),
        )
        system = agent.system_prompt()
        assert "Test Fixer" in system

    def test_correction_task_explains_the_score(self, context, fake_llm_config, repo_root):
        context.update(
            faulty_test="class FooTest {}",
            error_log="cannot find symbol",
            diagnosis="wrong method name",
            classifier_score=-1,
            attempt=2,
            max_attempts=5,
        )
        agent = TestDeveloperAgent(
            options={"correction_mode": True},
            **agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root),
        )
        task = agent.build_task(context)

        assert "REGRESSION" in task
        assert "attempt 2 of 5" in task


class TestStaticTemplateRendering:
    def test_renders_dollar_placeholders(self, context):
        template = "Class ${class_name} using ${framework_ex}:\n${class_code}"
        rendered = render_template(template, template_variables(context["cut"], context))

        assert "Class OrderService using JUnit 5" in rendered
        assert "public class OrderService" in rendered

    def test_renders_double_brace_placeholders(self, context):
        rendered = render_template(
            "{{class_name}} / {{ package_name }}", template_variables(context["cut"], context)
        )
        assert rendered == "OrderService / com.example.service"

    def test_unknown_placeholder_is_left_visible(self, context):
        rendered = render_template("${nope}", template_variables(context["cut"], context))
        assert rendered == "${nope}"

    def test_released_zero_shot_template_renders(self, context, repo_root):
        template = (repo_root / "prompts" / "zero_shot_java_test.txt").read_text(encoding="utf-8")
        rendered = render_template(template, template_variables(context["cut"], context))

        assert "${" not in rendered, "every placeholder in the released template must resolve"
        assert "OrderService" in rendered


class TestCorrectionAgents:
    def test_error_interpreter_prompt_includes_categorised_errors(
        self, context, fake_llm_config, repo_root
    ):
        log = "[ERROR] /w/FooTest.java:[10,5] cannot find symbol\n[INFO] BUILD FAILURE"
        context.update(
            faulty_test="class FooTest {}",
            error_log=log,
            error_report=parse_build_log(log, compiled=False),
            compiled=False,
        )
        agent = ErrorInterpreterAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "Symbol/Import Mismatch" in task
        assert "during **compilation**" in task

    def test_error_interpreter_renders_a_structured_diagnosis(
        self, context, fake_llm_config, repo_root
    ):
        payload = json.dumps(
            {
                "root_cause": "method findByName does not exist",
                "category": "Symbol/Import Mismatch",
                "fixes": ["rename to findByUsername"],
                "cascading": True,
            }
        )
        context.update(faulty_test="x", error_log="e", compiled=False)
        agent = ErrorInterpreterAgent(
            **agent_kwargs(FakeLLMLayer(default=payload), fake_llm_config, repo_root)
        )
        agent.run(context)

        assert "Root cause: method findByName does not exist" in context["diagnosis"]
        assert "1. rename to findByUsername" in context["diagnosis"]

    def test_classifier_grounds_the_judgement_in_a_diff(
        self, context, fake_llm_config, repo_root
    ):
        before = parse_build_log("[ERROR] /w/F.java:[1,1] cannot find symbol", compiled=False)
        after = parse_build_log("[ERROR] /w/F.java:[2,1] ';' expected", compiled=False)
        context.update(
            previous_error="old", error_log="new",
            previous_error_report=before, error_report=after,
        )
        agent = ClassifierAgent(**agent_kwargs(FakeLLMLayer(), fake_llm_config, repo_root))
        task = agent.build_task(context)

        assert "Deterministic diff" in task
        assert "resolved: 1" in task
        assert "newly introduced: 1" in task

    def test_classifier_falls_back_to_the_heuristic(self, context, fake_llm_config, repo_root):
        """An unusable judgement must never halt the loop by accident."""
        before = parse_build_log("[ERROR] /w/F.java:[1,1] cannot find symbol", compiled=False)
        after = parse_build_log("[ERROR] /w/F.java:[1,1] cannot find symbol", compiled=False)
        context.update(
            previous_error="old", error_log="new",
            previous_error_report=before, error_report=after,
            previous_compiled=False, compiled=False,
        )
        agent = ClassifierAgent(
            **agent_kwargs(FakeLLMLayer(default="I have no idea."), fake_llm_config, repo_root)
        )
        output = agent.run(context)

        assert output.ok
        assert context["classifier_score"] == 0, "identical errors mean no progress"

    def test_heuristic_detects_a_lost_compilation(self, context, fake_llm_config, repo_root):
        before = parse_build_log("[ERROR] F.t:1 expected: <1> but was: <2>", compiled=True)
        after = parse_build_log("[ERROR] /w/F.java:[1,1] ';' expected", compiled=False)
        context.update(
            previous_error="a", error_log="b",
            previous_error_report=before, error_report=after,
            previous_compiled=True, compiled=False,
        )
        agent = ClassifierAgent(
            **agent_kwargs(FakeLLMLayer(default="???"), fake_llm_config, repo_root)
        )
        agent.run(context)

        assert context["classifier_score"] == -1


class TestPromptFiles:
    def test_every_agent_prompt_file_exists(self, repo_root, fake_llm_config):
        """The released prompts are the source of truth; a missing file is a defect."""
        from benjitest.agents.analysis import BlackBoxAgent, ClassAnalyzerAgent, WhiteBoxAgent
        from benjitest.agents.correction import ClassifierAgent, ErrorInterpreterAgent
        from benjitest.agents.developer import TestDeveloperAgent
        from benjitest.agents.repository import RepositoryManagerAgent, RepositoryMinerAgent
        from benjitest.agents.synthesis import (
            IntermediateRepresentationAgent,
            PromptEngineerAgent,
        )

        prompts_dir = repo_root / "prompts" / "agents"
        specs = [
            cls.spec
            for cls in (
                RepositoryManagerAgent, RepositoryMinerAgent, ClassAnalyzerAgent,
                BlackBoxAgent, WhiteBoxAgent, PromptEngineerAgent,
                IntermediateRepresentationAgent, TestDeveloperAgent,
                ErrorInterpreterAgent, ClassifierAgent,
            )
        ]
        missing = [s.prompt_file for s in specs if not (prompts_dir / s.prompt_file).is_file()]
        assert missing == []

    def test_correction_prompt_file_exists(self, repo_root):
        assert (repo_root / "prompts" / "agents" / "test_fixer_agent.txt").is_file()

    def test_prompt_file_overrides_the_builtin_default(
        self, context, fake_llm_config, repo_root, tmp_path
    ):
        custom = tmp_path / "prompts"
        custom.mkdir()
        (custom / "blackbox_agent.txt").write_text("CUSTOM PROMPT", encoding="utf-8")

        agent = BlackBoxAgent(
            llm_layer=FakeLLMLayer(), llm_config=fake_llm_config, prompts_dir=custom
        )
        assert agent.system_prompt() == "CUSTOM PROMPT"


class TestCrewExecution:
    def test_runs_agents_in_order_and_shares_context(self):
        order: list[str] = []

        class Recorder(ToolAgent):
            def __init__(self, name):
                super().__init__()
                self.spec = AgentSpec(name=name, role="", goal="", backstory="")

            def execute(self, context):
                order.append(self.spec.name)
                context[f"{self.spec.name}_ran"] = True
                return AgentOutput(agent=self.spec.name, text="ok", structured="ok")

        crew = Crew("test", [Recorder("first"), Recorder("second")], final_key="second_ran")
        context = CrewContext()
        result = crew.kickoff(context)

        assert order == ["first", "second"]
        assert result.ok and result.final is True
        assert context["first_ran"] and context["second_ran"]

    def test_stop_on_failure_aborts_the_remainder(self):
        class Failing(ToolAgent):
            spec = AgentSpec(name="failing", role="", goal="", backstory="")

            def execute(self, context):
                return AgentOutput(agent="failing", ok=False, error="boom")

        class ShouldNotRun(ToolAgent):
            spec = AgentSpec(name="later", role="", goal="", backstory="")

            def execute(self, context):
                raise AssertionError("must not run")

        crew = Crew("test", [Failing(), ShouldNotRun()], stop_on_failure=True)
        result = crew.kickoff(CrewContext())

        assert not result.ok and "boom" in result.error

    def test_non_fatal_failure_degrades_gracefully(self):
        class Failing(ToolAgent):
            spec = AgentSpec(name="optional", role="", goal="", backstory="")

            def execute(self, context):
                return AgentOutput(agent="optional", ok=False, error="skipped")

        class Producer(ToolAgent):
            spec = AgentSpec(name="producer", role="", goal="", backstory="")

            def execute(self, context):
                context["out"] = "value"
                return AgentOutput(agent="producer", structured="value")

        crew = Crew("test", [Failing(), Producer()], stop_on_failure=False, final_key="out")
        result = crew.kickoff(CrewContext())

        assert result.ok and result.final == "value"
        assert result.failed_agents == ["optional"]

    def test_crewai_backend_falls_back_when_unavailable(self, monkeypatch):
        class Producer(ToolAgent):
            spec = AgentSpec(name="producer", role="", goal="", backstory="")

            def execute(self, context):
                context["out"] = "value"
                return AgentOutput(agent="producer", structured="value")

        crew = Crew(
            "test", [Producer()], backend=OrchestrationBackend.CREWAI, final_key="out"
        )
        # crewai is an optional dependency; the native runner must take over.
        result = crew.kickoff(CrewContext())
        assert result.ok and result.final == "value"

    def test_context_accumulates_token_usage(self):
        context = CrewContext()
        context.record(AgentOutput(agent="a", prompt_tokens=10, completion_tokens=5))
        context.record(AgentOutput(agent="b", prompt_tokens=1, completion_tokens=2))

        assert context.usage == {"prompt_tokens": 11, "completion_tokens": 7, "llm_calls": 2}

    def test_transcript_omits_failed_agents(self):
        context = CrewContext()
        context.record(AgentOutput(agent="ok", text="kept"))
        context.record(AgentOutput(agent="bad", text="dropped", ok=False))

        transcript = context.transcript()
        assert "kept" in transcript and "dropped" not in transcript


class _StubLayer:
    """The factory only needs a layer object to hand to its agents."""

    def complete(self, llm, *, system=None, user, tag="", **overrides):
        raise AssertionError("the factory must not issue calls while composing a crew")


class TestRQ7Arms:
    """The RQ7 arms must be expressible in the crew the factory builds.

    An arm that exists only in the configuration schema is a claim about an
    experiment nobody can run.
    """

    def _factory(self, tmp_path):
        from benjitest.config.loader import load_config
        from benjitest.crews.factory import CrewFactory
        config = load_config("config/experiments/rq7-controls.yaml")
        return CrewFactory(config, _StubLayer()), config

    def _names(self, crew):
        return [a.spec.name for a in crew.agents]

    def test_b_nosplit_replaces_the_pair_with_one_analyst(self, tmp_path):
        factory, config = self._factory(tmp_path)
        arm = next(s for s in config.strategies if s.name == "b-nosplit")
        names = self._names(factory.build_generation_crew(arm, config.llms[0]))
        assert "Joint Analyzer Agent" in names
        assert "Black-box Test Agent" not in names
        assert not any("White-box" in n for n in names)

    def test_b_single_drops_the_prompt_engineer(self, tmp_path):
        factory, config = self._factory(tmp_path)
        arm = next(s for s in config.strategies if s.name == "b-single")
        names = self._names(factory.build_generation_crew(arm, config.llms[0]))
        assert not any("Prompt Engineer" in n for n in names)
        # the analysis still happens; only its composition is removed
        assert "Black-box Test Agent" in names

    def test_the_full_crew_keeps_both_analysts_and_the_engineer(self, tmp_path):
        factory, config = self._factory(tmp_path)
        arm = next(s for s in config.strategies if s.name == "dynamic")
        names = self._names(factory.build_generation_crew(arm, config.llms[0]))
        assert "Black-box Test Agent" in names
        assert any("White-box" in n for n in names)
        assert any("Prompt Engineer" in n for n in names)
        assert "Joint Analyzer Agent" not in names

    def test_the_joint_analyst_feeds_both_downstream_keys(self):
        # the Prompt Engineer reads black-box and white-box scenarios; the arm's
        # point is that both now hold the same jointly derived content
        from benjitest.agents.analysis import JointAnalyzerAgent
        context = {}
        scenarios = JointAnalyzerAgent.parse(
            JointAnalyzerAgent, '[{"name": "a", "method": "m"}]', context)
        assert context["black_box_scenarios"] == scenarios
        assert context["white_box_scenarios"] == scenarios
