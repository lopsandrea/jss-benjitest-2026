"""The RQ6 and RQ7 configurations, and the schema sections they introduced.

Both files describe experiments the paper reports on, so a schema that cannot
express them is a defect: the artifact would ship configurations that document
the protocol but do not load.
"""

from __future__ import annotations

import pytest

from benjitest.config.loader import ConfigError, load_config
from benjitest.config.schema import StrategyType



def write(tmp_path, text, name="exp.yaml"):
    path = tmp_path / name
    path.write_text(text, encoding="utf-8")
    return path


class TestReleasedRQConfigurations:
    def test_rq6_baselines_loads(self, repo_root):
        config = load_config(repo_root / "config" / "experiments" / "rq6-baselines.yaml")

        names = [b.name for b in config.external_baselines]
        assert names == ["chatunitest", "testforge", "evosuite"]
        by_name = {b.name: b for b in config.external_baselines}
        # The two LLM baselines must run on our backend, or the comparison
        # measures model choice rather than orchestration.
        assert by_name["chatunitest"].backend == "gpt-4.1"
        assert by_name["testforge"].backend == "gpt-4.1"
        assert by_name["evosuite"].kind == "search-based"
        assert by_name["evosuite"].search_budget_seconds == 180
        assert config.build.force_jdk == 8, "the common subset is pinned to JDK 8"
        assert config.metrics.cost.track_tokens

    def test_rq7_controls_loads(self, repo_root):
        config = load_config(repo_root / "config" / "experiments" / "rq7-controls.yaml")

        arms = {s.name: s for s in config.strategies}
        # The four reference strategies are all declared, because all four appear
        # in the correction-loop factor table this config also produces.
        assert set(arms) == {
            "zero-shot",
            "few-shot",
            "pseudo-code",
            "dynamic",
            "b-rag",
            "b-single",
            "b-nosplit",
            "b-budget",
        }
        # B-rag builds its context without a model call.
        assert arms["b-rag"].context is not None
        assert arms["b-rag"].context.deterministic
        # B-single sees the same analysis, in one call.
        assert arms["b-single"].collapse_to_single_call
        assert not arms["b-single"].agents.prompt_engineer
        # B-nosplit merges the black-box/white-box pair.
        assert arms["b-nosplit"].agents.joint_analyzer
        assert not arms["b-nosplit"].agents.black_box_tester
        assert not arms["b-nosplit"].agents.white_box_tester
        # B-budget matches the dynamic strategy's spend.
        assert arms["b-budget"].repeat_sampling.samples == 6
        assert arms["b-budget"].repeat_sampling.match_budget_of == "dynamic"

    def test_rq7_sample_is_paired(self, repo_root):
        sample = load_config(
            repo_root / "config" / "experiments" / "rq7-controls.yaml"
        ).experiment.sample

        assert sample is not None
        assert sample.kind == "stratified"
        assert sample.size == 2000
        assert sample.require_paired, "arms must be compared on one population"
        assert sample.seed == 42

    def test_rq7_correction_arms(self, repo_root):
        correction = load_config(
            repo_root / "config" / "experiments" / "rq7-controls.yaml"
        ).correction

        arms = {a.name: a for a in correction.ablate}
        assert set(arms) == {"loop-off", "loop-on-no-classifier"}
        assert not arms["loop-off"].enabled
        # An arm states only what it changes; the rest is inherited.
        assert arms["loop-on-no-classifier"].enabled
        assert not arms["loop-on-no-classifier"].agents.classifier
        assert arms["loop-on-no-classifier"].agents.error_interpreter

    def test_rq7_orchestration_override(self, repo_root):
        override = load_config(
            repo_root / "config" / "experiments" / "rq7-controls.yaml"
        ).orchestration_override

        assert override.enabled
        assert override.pinned_model == "gpt-4.1"
        assert "class_analyzer" in override.pinned_agents
        assert "error_interpreter" in override.pinned_agents
        assert len(override.vary_generator_across) == 9


BASE = """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: dynamic
    type: dynamic
"""


class TestNewSectionValidation:
    def test_llm_baseline_without_backend_is_rejected(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
external_baselines:
  - name: chatunitest
    kind: llm
""",
        )
        with pytest.raises(ConfigError, match="backend"):
            load_config(path)

    def test_unknown_baseline_kind_is_rejected(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
external_baselines:
  - name: x
    kind: symbolic
    backend: gpt-4.1
""",
        )
        with pytest.raises(ConfigError, match="kind"):
            load_config(path)

    def test_duplicate_baseline_names_are_rejected(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
external_baselines:
  - name: x
    backend: gpt-4.1
  - name: x
    backend: gpt-4.1
""",
        )
        with pytest.raises(ConfigError, match="unique"):
            load_config(path)

    def test_joint_analyzer_alongside_the_pair_is_rejected(self, tmp_path):
        # Enabling all three measures neither the split nor the merged arm.
        path = write(
            tmp_path,
            """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: b-nosplit
    type: dynamic
    agents:
      class_analyzer: true
      joint_analyzer: true
      black_box_tester: true
      prompt_engineer: true
""",
        )
        with pytest.raises(ConfigError, match="joint_analyzer"):
            load_config(path)

    def test_override_without_generators_is_rejected(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
orchestration_override:
  enabled: true
  pinned_model: gpt-4.1
""",
        )
        with pytest.raises(ConfigError, match="vary_generator_across"):
            load_config(path)

    def test_override_cannot_pin_an_unknown_agent(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
orchestration_override:
  enabled: true
  pinned_model: gpt-4.1
  pinned_agents: [class_analyzer, repository_miner]
  vary_generator_across: [gpt-4.1]
""",
        )
        with pytest.raises(ConfigError, match="unknown agent"):
            load_config(path)

    def test_stratified_sample_needs_strata(self, tmp_path):
        path = write(
            tmp_path,
            """
experiment:
  name: t
  sample:
    kind: stratified
    size: 100
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: dynamic
    type: dynamic
""",
        )
        with pytest.raises(ConfigError, match="strata"):
            load_config(path)

    def test_repeat_sampling_selector_is_checked(self, tmp_path):
        path = write(
            tmp_path,
            """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: b-budget
    type: static
    prompt_file: prompts/zero_shot_java_test.txt
    repeat_sampling:
      samples: 6
      select: whichever_looks_best
""",
        )
        with pytest.raises(ConfigError, match="select"):
            load_config(path)

    def test_duplicate_correction_arm_names_are_rejected(self, tmp_path):
        path = write(
            tmp_path,
            BASE
            + """
correction:
  ablate:
    - {name: loop-off, enabled: false}
    - {name: loop-off, enabled: true}
""",
        )
        with pytest.raises(ConfigError, match="unique"):
            load_config(path)

    def test_collapse_requires_a_dynamic_strategy(self, tmp_path):
        path = write(
            tmp_path,
            """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: x
    type: static
    prompt_file: prompts/zero_shot_java_test.txt
    collapse_to_single_call: true
""",
        )
        with pytest.raises(ConfigError, match="collapse_to_single_call"):
            load_config(path)

    def test_static_strategy_may_still_be_plain(self, tmp_path):
        config = load_config(
            write(
                tmp_path,
                """
experiment:
  name: t
llms:
  - name: gpt-4.1
    provider: openai
    model: gpt-4.1
strategies:
  - name: zero-shot
    type: static
    prompt_file: prompts/zero_shot_java_test.txt
""",
            )
        )
        strategy = config.strategies[0]
        assert strategy.type is StrategyType.STATIC
        assert strategy.context is None
        assert strategy.repeat_sampling is None
        assert not strategy.collapse_to_single_call
        assert config.external_baselines == []
        assert not config.orchestration_override.enabled


class TestDatasetDescriptors:
    """The two dataset descriptors the replication guide tells a reader to run.

    A descriptor the framework's own loader rejects documents nothing.
    """

    def test_control_corpus_descriptor_loads(self, repo_root):
        from benjitest.config.loader import load_dataset_config
        d = load_dataset_config(repo_root / "config" / "dataset" / "control.yaml")
        assert [(s.name, s.kind, s.count) for s in d.sources] == [
            ("post-cutoff", "github", 600),
            ("private", "local", 500),
            ("synthetic", "generated", 400),
        ]
        assert sum(s.count for s in d.sources) == 1500

    def test_the_generated_arm_names_the_generator_that_produces_it(self, repo_root):
        from benjitest.config.loader import load_dataset_config
        d = load_dataset_config(repo_root / "config" / "dataset" / "control.yaml")
        synthetic = next(s for s in d.sources if s.kind == "generated")
        assert synthetic.generator == "scripts/make_synthetic_projects.py"
        assert (repo_root / synthetic.generator).is_file()
        assert synthetic.seed == 42

    def test_a_generated_arm_without_a_generator_is_refused(self):
        from benjitest.config.schema import ControlSourceConfig
        with pytest.raises(ValueError, match="generator"):
            ControlSourceConfig(name="synthetic", kind="generated", count=400)

    def test_the_control_declares_what_it_is_matched_on(self, repo_root):
        from benjitest.config.loader import load_dataset_config
        d = load_dataset_config(repo_root / "config" / "dataset" / "control.yaml")
        assert d.matching.enabled
        assert set(d.matching.match_on) == {"loc", "cyclomatic_complexity", "test_framework"}

    def test_matching_without_variables_is_refused(self):
        # An unmatched control could simply be easier, and a lower reproduction
        # rate would then say nothing about memorization.
        from benjitest.config.schema import MatchingConfig
        with pytest.raises(ValueError, match="match_on"):
            MatchingConfig(enabled=True, match_on=[])

    def test_the_probe_matches_the_one_run_on_classes2test(self, repo_root):
        from benjitest.config.loader import load_dataset_config
        d = load_dataset_config(repo_root / "config" / "dataset" / "control.yaml")
        assert d.probing.protocol == "memorization"
        assert d.probing.semantic_threshold == 0.8
        assert d.probing.temperature == 0.0
        assert d.probing.match_levels == ["exact", "structural", "semantic"]

    def test_an_unknown_match_level_is_refused(self):
        from benjitest.config.schema import ProbingConfig
        with pytest.raises(ValueError, match="match_levels"):
            ProbingConfig(match_levels=["exact", "vibes"])

    def test_classes2test_descriptor_loads(self, repo_root):
        from benjitest.config.loader import load_dataset_config
        assert load_dataset_config(
            repo_root / "config" / "dataset" / "classes2test_config.yaml").name == "Classes2Test"
