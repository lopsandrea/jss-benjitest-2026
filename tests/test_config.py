"""Configuration loading, including the released experiment YAML."""

from __future__ import annotations

import pytest

from benjitest.config.loader import ConfigError, load_config, load_dataset_config
from benjitest.config.schema import OrchestrationBackend, StrategyType

MINIMAL = """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
    temperature: 0
    seed: 42
strategies:
  - name: dynamic
    type: dynamic
"""


def write(tmp_path, text, name="exp.yaml"):
    path = tmp_path / name
    path.write_text(text, encoding="utf-8")
    return path


class TestReleasedConfiguration:
    """The configuration shipped in the artifact must load unchanged."""

    def test_experiment_config_loads(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )

        assert config.experiment.name == "framework_test-full-evaluation"
        assert len(config.llms) == 9, "the paper evaluates nine LLM backends"
        assert len(config.strategies) == 4

    def test_strategy_types_match_the_paper(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        types = {s.name: s.type for s in config.strategies}

        assert types["zero-shot"] is StrategyType.STATIC
        assert types["few-shot"] is StrategyType.STATIC
        assert types["dynamic"] is StrategyType.DYNAMIC
        assert types["pseudo-code"] is StrategyType.INTERMEDIATE

    def test_static_strategies_point_at_existing_prompt_files(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        for strategy in config.strategies:
            if strategy.type is StrategyType.STATIC:
                assert strategy.prompt_file.is_file(), strategy.prompt_file

    def test_correction_settings(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        assert config.correction.enabled
        assert config.correction.max_attempts == 5
        assert config.build.timeout_seconds == 1800

    def test_pseudo_code_strategy_enables_the_ir_agent(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        pseudo = config.strategy("pseudo-code")

        assert pseudo.agents.intermediate_representation
        # The declared block is authoritative: unlisted agents are off.
        assert not pseudo.agents.black_box_tester
        assert not pseudo.agents.white_box_tester

    def test_dataset_config_loads(self, repo_root):
        dataset = load_dataset_config(
            repo_root / "config" / "dataset" / "classes2test_config.yaml"
        )
        assert dataset.name == "Classes2Test"
        assert dataset.language == "java"
        assert "**/gui/**" in dataset.filters.exclude

    def test_every_model_in_the_paper_is_present(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        assert {llm.name for llm in config.llms} == {
            "gpt-4o-mini", "gpt-4.1", "o3", "o4-mini",
            "gemini-1.5-pro", "gemini-2.5-pro",
            "llama-3.1-70b", "deepseek-r1", "grok-3",
        }

    def test_temperature_is_zero_everywhere(self, repo_root):
        config = load_config(
            repo_root / "config" / "experiments" / "framework_test-full-evaluation.yaml"
        )
        assert all(llm.temperature == 0 for llm in config.llms)


class TestValidation:
    def test_minimal_config_loads(self, tmp_path):
        config = load_config(write(tmp_path, MINIMAL))
        assert config.llms[0].seed == 42
        assert config.orchestration.backend is OrchestrationBackend.NATIVE

    def test_unknown_top_level_key_is_rejected(self, tmp_path):
        with pytest.raises(ConfigError, match="unknown key"):
            load_config(write(tmp_path, MINIMAL + "\ntypoed_section:\n  a: 1\n"))

    def test_unknown_nested_key_is_rejected(self, tmp_path):
        text = MINIMAL + "\ncorrection:\n  enabled: true\n  max_attemps: 5\n"
        with pytest.raises(ConfigError, match="max_attemps"):
            load_config(write(tmp_path, text))

    def test_static_strategy_requires_a_prompt_file(self, tmp_path):
        text = """
experiment: {name: t}
llms: [{name: m, provider: openai, model: gpt-4.1}]
strategies: [{name: zero-shot, type: static}]
"""
        with pytest.raises(ValueError, match="prompt_file"):
            load_config(write(tmp_path, text))

    def test_duplicate_strategy_names_are_rejected(self, tmp_path):
        text = """
experiment: {name: t}
llms: [{name: m, provider: openai, model: gpt-4.1}]
strategies:
  - {name: dynamic, type: dynamic}
  - {name: dynamic, type: dynamic}
"""
        with pytest.raises(ValueError, match="duplicate strategy"):
            load_config(write(tmp_path, text))

    def test_empty_llms_is_rejected(self, tmp_path):
        text = "experiment: {name: t}\nllms: []\nstrategies: [{name: d, type: dynamic}]\n"
        with pytest.raises(ConfigError, match="non-empty"):
            load_config(write(tmp_path, text))

    def test_missing_file_is_reported(self, tmp_path):
        with pytest.raises(ConfigError, match="not found"):
            load_config(tmp_path / "absent.yaml")

    def test_invalid_max_attempts_is_rejected(self, tmp_path):
        text = MINIMAL + "\ncorrection:\n  max_attempts: 0\n"
        with pytest.raises(ValueError, match="max_attempts"):
            load_config(write(tmp_path, text))

    def test_environment_variables_are_expanded(self, tmp_path, monkeypatch):
        monkeypatch.setenv("BENJITEST_MODEL", "gpt-4o-mini")
        text = """
experiment: {name: t}
llms: [{name: m, provider: openai, model: "${env:BENJITEST_MODEL}"}]
strategies: [{name: d, type: dynamic}]
"""
        config = load_config(write(tmp_path, text))
        assert config.llms[0].model == "gpt-4o-mini"

    def test_environment_default_is_used(self, tmp_path):
        text = """
experiment: {name: t}
llms: [{name: m, provider: openai, model: "${env:BENJITEST_ABSENT:gpt-4.1}"}]
strategies: [{name: d, type: dynamic}]
"""
        assert load_config(write(tmp_path, text)).llms[0].model == "gpt-4.1"

    def test_lookup_helpers(self, tmp_path):
        config = load_config(write(tmp_path, MINIMAL))
        assert config.llm("gpt-4.1").model == "gpt-4.1"
        assert config.strategy("dynamic").type is StrategyType.DYNAMIC
        with pytest.raises(KeyError):
            config.llm("absent")

    def test_task_count_per_class(self, tmp_path):
        config = load_config(write(tmp_path, MINIMAL))
        assert config.total_task_count_per_class == 1


class TestAblationExpressibility:
    """Section 4.8: the four arms must be pure configuration."""

    def test_no_blackbox_arm(self, tmp_path):
        text = """
experiment: {name: ablation}
llms: [{name: gpt-4.1, provider: openai, model: gpt-4.1}]
strategies:
  - name: no-blackbox
    type: dynamic
    agents:
      class_analyzer: true
      white_box_tester: true
      prompt_engineer: true
"""
        strategy = load_config(write(tmp_path, text)).strategy("no-blackbox")

        assert strategy.agents.class_analyzer
        assert strategy.agents.white_box_tester
        assert strategy.agents.prompt_engineer
        assert not strategy.agents.black_box_tester

    def test_no_context_arm(self, tmp_path):
        text = """
experiment: {name: ablation}
llms: [{name: gpt-4.1, provider: openai, model: gpt-4.1}]
strategies:
  - name: no-context
    type: dynamic
    agents:
      prompt_engineer: true
"""
        strategy = load_config(write(tmp_path, text)).strategy("no-context")

        assert strategy.agents.prompt_engineer
        assert not strategy.agents.class_analyzer
        assert not strategy.agents.black_box_tester
        assert not strategy.agents.white_box_tester
