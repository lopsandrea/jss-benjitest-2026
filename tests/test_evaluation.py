"""Statistics, ablation configurations, CodeBLEU, and memorization matching."""

from __future__ import annotations

import pytest

from benjitest.evaluation.ablation import (
    ABLATION_CONFIGURATIONS,
    FULL_CREW,
    NO_BLACKBOX,
    NO_CONTEXT,
    NO_WHITEBOX,
    configuration_by_name,
)
from benjitest.evaluation.codebleu import code_bleu, tokenize
from benjitest.evaluation.memorization import (
    MatchLevel,
    ProbeResult,
    aggregate_coverage,
    classify_match,
    exact_match,
    is_unknown_response,
    normalize_exact,
    star_tier,
    stratify,
    structural_match,
)
from benjitest.evaluation.statistics import (
    align_samples,
    bonferroni_alpha,
    cliffs_delta,
    compare,
    format_p_value,
    interpret_delta,
    pairwise_comparisons,
)


class TestCliffsDelta:
    def test_identical_samples_yield_zero(self):
        assert cliffs_delta([1, 2, 3], [1, 2, 3]) == pytest.approx(0.0)

    def test_complete_dominance_yields_one(self):
        assert cliffs_delta([10, 11, 12], [1, 2, 3]) == pytest.approx(1.0)

    def test_complete_subordination_yields_minus_one(self):
        assert cliffs_delta([1, 2, 3], [10, 11, 12]) == pytest.approx(-1.0)

    def test_partial_overlap(self):
        # a=[1,2,3] vs b=[2,3,4]: 1 of 9 pairs is greater, 6 are less, 2 are ties.
        assert cliffs_delta([1, 2, 3], [2, 3, 4]) == pytest.approx((1 - 6) / 9)

    def test_empty_samples_are_safe(self):
        assert cliffs_delta([], [1]) == 0.0

    def test_matches_the_naive_definition(self):
        a = [3, 1, 4, 1, 5, 9, 2, 6]
        b = [2, 7, 1, 8, 2, 8]
        naive = (
            sum(1 for x in a for y in b if x > y) - sum(1 for x in a for y in b if x < y)
        ) / (len(a) * len(b))
        assert cliffs_delta(a, b) == pytest.approx(naive)


class TestEffectSizeInterpretation:
    @pytest.mark.parametrize(
        ("delta", "expected"),
        [
            (0.10, "negligible"),
            (0.20, "small"),
            (0.40, "medium"),
            (0.50, "large"),
            (-0.81, "large"),
        ],
    )
    def test_romano_thresholds(self, delta, expected):
        assert interpret_delta(delta) == expected

    def test_boundaries(self):
        assert interpret_delta(0.147) == "small"
        assert interpret_delta(0.33) == "medium"
        assert interpret_delta(0.474) == "large"


class TestBonferroni:
    def test_six_pairwise_comparisons(self):
        """Four strategies imply six pairs, so alpha = 0.05/6 ~= 0.0083."""
        assert bonferroni_alpha(6) == pytest.approx(0.05 / 6)
        assert bonferroni_alpha(6) == pytest.approx(0.0083, abs=0.0001)

    def test_rejects_a_non_positive_family_size(self):
        with pytest.raises(ValueError):
            bonferroni_alpha(0)


class TestComparisons:
    def test_detects_a_clear_difference(self):
        a = [90.0 + i * 0.01 for i in range(60)]
        b = [40.0 + i * 0.01 for i in range(60)]
        result = compare(
            a, b, model="m", metric="mutation_score",
            strategy_a="dynamic", strategy_b="zero-shot", alpha=0.0083,
        )

        assert result.cliffs_delta == pytest.approx(1.0)
        assert result.effect_size == "large"
        assert result.significant

    def test_identical_samples_are_not_significant(self):
        values = [50.0] * 30
        result = compare(
            values, values, model="m", metric="x",
            strategy_a="a", strategy_b="b", alpha=0.0083,
        )
        assert result.p_value == 1.0 and not result.significant

    def test_mismatched_lengths_are_rejected(self):
        with pytest.raises(ValueError, match="equal-length"):
            compare([1.0], [1.0, 2.0], model="m", metric="x",
                    strategy_a="a", strategy_b="b", alpha=0.05)

    def test_pairwise_produces_all_pairs(self):
        samples = {name: [float(i + offset) for i in range(30)]
                   for offset, name in enumerate(["a", "b", "c", "d"])}
        results = pairwise_comparisons(samples, model="m", metric="x")
        assert len(results) == 6
        assert all(r.alpha == pytest.approx(0.05 / 6) for r in results)

    def test_row_includes_the_saturation_flag(self):
        result = compare(
            [1.0] * 20, [2.0] * 20, model="m", metric="x",
            strategy_a="a", strategy_b="b", alpha=0.05,
        )
        # The flag lives on the result, where the interpretation helpers read it.
        # It is not a column of the released table: at the released sample size
        # nothing saturates, and printing a column that is False in every row
        # would suggest the opposite.
        assert result.p_saturated is False
        assert "p_saturated" not in result.to_row()
        assert set(result.to_row()) == {
            "model", "strategy_A", "strategy_B", "metric", "n_pairs",
            "wilcoxon_W", "wilcoxon_p", "significant_bonferroni", "cliffs_delta",
            "delta_ci_low", "delta_ci_high", "magnitude", "mean_A", "mean_B", "delta_pp",
        }

    def test_format_p_value_marks_saturation(self):
        assert "saturated" in format_p_value(0.0)
        assert "saturated" in format_p_value(1e-320)
        assert format_p_value(0.03) == "0.0300"


class TestSampleAlignment:
    def test_restricts_to_classes_present_in_every_strategy(self):
        observations = {
            "zero-shot": {"c1": 10.0, "c2": 20.0, "c3": 30.0},
            "dynamic": {"c1": 90.0, "c3": 70.0},
        }
        class_ids, aligned = align_samples(observations)

        assert class_ids == ["c1", "c3"]
        assert aligned["zero-shot"] == [10.0, 30.0]
        assert aligned["dynamic"] == [90.0, 70.0]

    def test_disjoint_sets_yield_nothing(self):
        class_ids, _ = align_samples({"a": {"x": 1.0}, "b": {"y": 2.0}})
        assert class_ids == []


class TestAblationConfigurations:
    def test_four_arms_are_defined(self):
        assert len(ABLATION_CONFIGURATIONS) == 4
        assert {c.name for c in ABLATION_CONFIGURATIONS} == {
            FULL_CREW, NO_BLACKBOX, NO_WHITEBOX, NO_CONTEXT
        }

    def test_toggles_match_the_paper(self):
        expected = {
            FULL_CREW: (True, True, True, True),
            NO_BLACKBOX: (True, False, True, True),
            NO_WHITEBOX: (True, True, False, True),
            NO_CONTEXT: (False, False, False, True),
        }
        for configuration in ABLATION_CONFIGURATIONS:
            toggles = configuration.toggles
            actual = (
                toggles.class_analyzer,
                toggles.black_box_tester,
                toggles.white_box_tester,
                toggles.prompt_engineer,
            )
            assert actual == expected[configuration.name], configuration.name

    def test_renders_as_a_dynamic_strategy(self):
        strategy = configuration_by_name(NO_WHITEBOX).to_strategy()
        assert strategy.type.value == "dynamic"
        assert not strategy.agents.white_box_tester

    def test_lookup_by_slug(self):
        assert configuration_by_name("full-crew-baseline").name == FULL_CREW

    def test_unknown_name_raises(self):
        with pytest.raises(KeyError):
            configuration_by_name("no-such-arm")


class TestCodeBLEU:
    def test_identical_code_scores_near_one(self, sample_test_source):
        result = code_bleu(sample_test_source, sample_test_source)
        assert result.score > 0.95

    def test_unrelated_code_scores_low(self, sample_test_source):
        other = "package z;\nclass Nothing { int f() { return 0; } }"
        assert code_bleu(other, sample_test_source).score < 0.4

    def test_renamed_variables_still_score_high(self):
        a = "class T { void t() { int total = compute(1); assertEquals(2, total); } }"
        b = "class T { void t() { int sum = compute(1); assertEquals(2, sum); } }"
        assert code_bleu(a, b).score > 0.5

    def test_reports_all_four_components(self, sample_test_source):
        result = code_bleu(sample_test_source, sample_test_source)
        for component in (
            result.ngram_match,
            result.weighted_ngram_match,
            result.syntax_match,
            result.dataflow_match,
        ):
            assert 0.0 <= component <= 1.0

    def test_implementation_is_recorded(self, sample_test_source):
        assert code_bleu(sample_test_source, sample_test_source).implementation in {
            "builtin", "reference"
        }

    def test_tokenizer_drops_comments(self):
        assert "TODO" not in tokenize("int x = 1; // TODO fix")


class TestMemorizationMatching:
    def test_exact_match_ignores_formatting_and_comments(self):
        a = "package p;\nimport b.B;\nimport a.A;\n\nclass T {  void t()  { } }"
        b = "// header\npackage p;\nimport a.A;\nimport b.B;\nclass T { void t() {} }"
        assert exact_match(a, b)

    def test_exact_match_rejects_a_real_difference(self):
        a = "class T { void t() { assertEquals(1, x); } }"
        b = "class T { void t() { assertEquals(2, x); } }"
        assert not exact_match(a, b)

    def test_normalisation_sorts_imports(self):
        assert normalize_exact("import z.Z;\nimport a.A;\nclass T{}") == normalize_exact(
            "import a.A;\nimport z.Z;\nclass T{}"
        )

    def test_structural_match_tolerates_renamed_locals_and_literals(self):
        a = """
        package p;
        class T {
            @org.junit.jupiter.api.BeforeEach void setUp() { }
            @org.junit.jupiter.api.Test void alpha() { int v = 1; assertEquals(1, v); }
        }
        """
        b = """
        package p;
        class T {
            @org.junit.jupiter.api.BeforeEach void setUp() { }
            @org.junit.jupiter.api.Test void alpha() { int other = 99; assertEquals(99, other); }
        }
        """
        assert structural_match(a, b)

    def test_structural_match_rejects_a_different_test_set(self):
        a = "class T { void alpha() { assertEquals(1, x); } }"
        b = "class T { void beta() { assertEquals(1, x); } }"
        assert not structural_match(a, b)

    def test_structural_match_rejects_a_different_assertion_profile(self):
        a = "class T { void alpha() { assertEquals(1, x); } }"
        b = "class T { void alpha() { assertTrue(x); } }"
        assert not structural_match(a, b)

    def test_classify_reports_the_strictest_level(self, sample_test_source):
        level, score = classify_match(sample_test_source, sample_test_source)
        assert level is MatchLevel.EXACT
        assert score > 0.9

    def test_classify_reports_none_for_unrelated_code(self, sample_test_source):
        level, _ = classify_match("class Z { }", sample_test_source)
        assert level is MatchLevel.NONE

    def test_unknown_response_detection(self):
        assert is_unknown_response("Unknown")
        assert is_unknown_response("  `Unknown`  ")
        assert is_unknown_response("Unknown.")
        assert not is_unknown_response("class FooTest {}")


class TestMemorizationCoverage:
    def test_levels_nest(self):
        """An exact reproduction is also structural and semantic."""
        results = [
            ProbeResult("c1", level=MatchLevel.EXACT),
            ProbeResult("c2", level=MatchLevel.STRUCTURAL),
            ProbeResult("c3", level=MatchLevel.SEMANTIC),
            ProbeResult("c4", level=MatchLevel.NONE),
        ]
        coverage = aggregate_coverage(results)

        assert coverage.exact == 1
        assert coverage.structural == 2
        assert coverage.semantic == 3
        assert coverage.coverage == pytest.approx(75.0)

    def test_unknown_and_error_responses_are_tracked_separately(self):
        results = [
            ProbeResult("c1", unknown=True),
            ProbeResult("c2", error="rate limited"),
            ProbeResult("c3", level=MatchLevel.SEMANTIC),
        ]
        coverage = aggregate_coverage(results)

        assert coverage.unknown == 1 and coverage.errors == 1
        assert coverage.semantic == 1

    def test_stratification_by_popularity(self):
        results = [
            ProbeResult("a", level=MatchLevel.SEMANTIC, metadata={"stars_tier": ">100"}),
            ProbeResult("b", level=MatchLevel.NONE, metadata={"stars_tier": "<10"}),
            ProbeResult("c", level=MatchLevel.NONE, metadata={"stars_tier": "<10"}),
        ]
        buckets = stratify(results, "stars_tier")

        assert buckets[">100"].coverage == pytest.approx(100.0)
        assert buckets["<10"].coverage == pytest.approx(0.0)

    def test_star_tiers(self):
        assert star_tier(3) == "<10"
        assert star_tier(50) == "10-100"
        assert star_tier(5000) == ">100"

    def test_empty_input_is_safe(self):
        assert aggregate_coverage([]).coverage == 0.0


class TestEquivalenceAndIntervals:
    """TOST and the BCa bootstrap, which the paper reports for every claim of absence."""

    def test_tost_rejects_a_difference_larger_than_the_bound(self):
        from benjitest.evaluation.statistics import tost_equivalence
        import random
        r = random.Random(11)
        a = [r.gauss(66.5, 15) for _ in range(400)]
        b = [r.gauss(50.0, 15) for _ in range(400)]
        equivalent, p = tost_equivalence(a, b, 5.0)
        assert not equivalent and p > 0.05

    def test_tost_establishes_equivalence_inside_the_bound(self):
        from benjitest.evaluation.statistics import tost_equivalence
        import random
        r = random.Random(12)
        a = [r.gauss(66.5, 15) for _ in range(400)]
        b = [x + r.gauss(1.6, 1.0) for x in a]
        equivalent, p = tost_equivalence(a, b, 5.0)
        assert equivalent and p < 0.05

    def test_tost_needs_a_bound_to_mean_anything(self):
        # Absence of significance is not evidence of absence; the bound is what
        # turns the question into one that can be answered.
        from benjitest.evaluation.statistics import tost_equivalence
        import random
        r = random.Random(13)
        a = [r.gauss(50, 15) for _ in range(30)]
        b = [r.gauss(52, 15) for _ in range(30)]
        wide, _ = tost_equivalence(a, b, 20.0)
        narrow, _ = tost_equivalence(a, b, 0.5)
        assert wide and not narrow

    def test_bootstrap_interval_brackets_the_estimate(self):
        from benjitest.evaluation.statistics import bca_interval, cliffs_delta
        import random
        r = random.Random(14)
        a = [r.gauss(92, 12) for _ in range(150)]
        b = [r.gauss(49, 18) for _ in range(150)]
        lo, hi = bca_interval(a, b, resamples=400)
        assert lo <= cliffs_delta(a, b) <= hi
        assert -1.0 <= lo < hi <= 1.0

    def test_bootstrap_is_deterministic_for_a_seed(self):
        from benjitest.evaluation.statistics import bca_interval
        import random
        r = random.Random(15)
        a = [r.gauss(80, 10) for _ in range(80)]
        b = [r.gauss(60, 10) for _ in range(80)]
        assert bca_interval(a, b, resamples=300) == bca_interval(a, b, resamples=300)

    def test_paired_samples_of_different_length_are_refused(self):
        from benjitest.evaluation.statistics import bca_interval, tost_equivalence
        import pytest as _pytest
        with _pytest.raises(ValueError):
            bca_interval([1.0, 2.0, 3.0], [1.0, 2.0])
        with _pytest.raises(ValueError):
            tost_equivalence([1.0, 2.0, 3.0], [1.0, 2.0], 1.0)
