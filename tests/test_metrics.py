"""Metrics: JaCoCo/PIT report parsing, smell detection, and the Section 4.6 protocol."""

from __future__ import annotations

import pytest

from benjitest.metrics.aggregate import (
    ClassObservation,
    aggregate,
    build_rate,
    compiled_only_average,
    pessimistic_average,
)
from benjitest.metrics.coverage import parse_report as parse_jacoco
from benjitest.metrics.model import REPORTED_SMELLS, TEST_SMELLS
from benjitest.metrics.mutation import parse_report as parse_pit
from benjitest.metrics.smells import detect_builtin

JACOCO_XML = """<?xml version="1.0" encoding="UTF-8"?>
<report name="demo">
  <package name="com/example/service">
    <class name="com/example/service/OrderService" sourcefilename="OrderService.java">
      <counter type="INSTRUCTION" missed="10" covered="90"/>
      <counter type="BRANCH" missed="2" covered="8"/>
      <counter type="LINE" missed="5" covered="45"/>
      <counter type="METHOD" missed="1" covered="3"/>
    </class>
    <class name="com/example/service/Other" sourcefilename="Other.java">
      <counter type="LINE" missed="100" covered="0"/>
    </class>
  </package>
</report>
"""

PIT_XML = """<?xml version="1.0" encoding="UTF-8"?>
<mutations>
  <mutation detected="true" status="KILLED">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>processOrder</mutatedMethod>
    <lineNumber>20</lineNumber>
    <mutator>ConditionalsBoundaryMutator</mutator>
  </mutation>
  <mutation detected="true" status="KILLED">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>processOrder</mutatedMethod>
    <lineNumber>22</lineNumber>
    <mutator>NegateConditionalsMutator</mutator>
  </mutation>
  <mutation detected="false" status="SURVIVED">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>findAll</mutatedMethod>
    <lineNumber>30</lineNumber>
    <mutator>ReturnValsMutator</mutator>
  </mutation>
  <mutation detected="false" status="NON_VIABLE">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>processOrder</mutatedMethod>
    <lineNumber>25</lineNumber>
    <mutator>VoidMethodCallMutator</mutator>
  </mutation>
  <mutation detected="false" status="TIMED_OUT">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>processOrder</mutatedMethod>
    <lineNumber>26</lineNumber>
    <mutator>IncrementsMutator</mutator>
  </mutation>
  <mutation detected="true" status="KILLED">
    <mutatedClass>com.example.service.OrderService</mutatedClass>
    <mutatedMethod>processOrder</mutatedMethod>
    <lineNumber>20</lineNumber>
    <mutator>ConditionalsBoundaryMutator</mutator>
  </mutation>
  <mutation detected="true" status="KILLED">
    <mutatedClass>com.example.service.Unrelated</mutatedClass>
    <mutatedMethod>x</mutatedMethod>
    <lineNumber>1</lineNumber>
    <mutator>ReturnValsMutator</mutator>
  </mutation>
</mutations>
"""


class TestCoverageParsing:
    def test_extracts_counters_for_the_target_class(self, tmp_path):
        path = tmp_path / "jacoco.xml"
        path.write_text(JACOCO_XML, encoding="utf-8")

        metrics = parse_jacoco(path, "com.example.service.OrderService")

        assert metrics.available
        assert metrics.line == pytest.approx(90.0)
        assert metrics.branch == pytest.approx(80.0)
        assert metrics.method == pytest.approx(75.0)

    def test_ignores_other_classes(self, tmp_path):
        """Coverage is attributed to the class under test, not to the project."""
        path = tmp_path / "jacoco.xml"
        path.write_text(JACOCO_XML, encoding="utf-8")

        metrics = parse_jacoco(path, "com.example.service.OrderService")
        assert metrics.lines_missed == 5, "the unrelated class must not contribute"

    def test_absent_class_reports_zero_but_available(self, tmp_path):
        path = tmp_path / "jacoco.xml"
        path.write_text(JACOCO_XML, encoding="utf-8")

        metrics = parse_jacoco(path, "com.example.service.NeverLoaded")
        assert metrics.available and metrics.line == 0.0

    def test_class_without_branches_is_fully_covered(self, tmp_path):
        path = tmp_path / "jacoco.xml"
        path.write_text(
            '<report><package name="p"><class name="p/Dto">'
            '<counter type="LINE" missed="0" covered="4"/>'
            "</class></package></report>",
            encoding="utf-8",
        )
        metrics = parse_jacoco(path, "p.Dto")
        # A DTO has no branches; reporting 0% would penalise the suite for a
        # property of the class.
        assert metrics.branch == 100.0

    def test_malformed_report_is_unavailable_not_fatal(self, tmp_path):
        path = tmp_path / "jacoco.xml"
        path.write_text("<report", encoding="utf-8")
        assert not parse_jacoco(path, "p.C").available


class TestMutationParsing:
    @pytest.fixture
    def metrics(self, tmp_path):
        path = tmp_path / "mutations.xml"
        path.write_text(PIT_XML, encoding="utf-8")
        return parse_pit(path, "com.example.service.OrderService")

    def test_excludes_non_viable_and_timed_out(self, metrics):
        """Section 4.5: these are not mutants a suite could reasonably kill."""
        assert metrics.excluded == 2

    def test_deduplicates_repeated_mutants(self, metrics):
        assert metrics.duplicates_removed == 1

    def test_ignores_other_classes(self, metrics):
        # Two killed (after dedup) and one survived, all on the target class.
        assert metrics.killed == 2
        assert metrics.survived == 1

    def test_score_uses_the_reduced_denominator(self, metrics):
        assert metrics.total_valid == 3
        assert metrics.score == pytest.approx(200 / 3)

    def test_inner_classes_count_toward_the_target(self, tmp_path):
        path = tmp_path / "mutations.xml"
        path.write_text(
            "<mutations><mutation status='KILLED'>"
            "<mutatedClass>p.C$Inner</mutatedClass><mutatedMethod>m</mutatedMethod>"
            "<lineNumber>1</lineNumber><mutator>M</mutator>"
            "</mutation></mutations>",
            encoding="utf-8",
        )
        assert parse_pit(path, "p.C").killed == 1


class TestSmellDetection:
    def test_catalog_has_nineteen_smells(self):
        assert len(TEST_SMELLS) == 19
        assert set(REPORTED_SMELLS) <= set(TEST_SMELLS)

    def test_detects_assertion_roulette(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() {
                assertEquals(1, x);
                assertEquals(2, y);
                assertTrue(z);
            }
        }
        """
        assert detect_builtin(source).counts["AR"] == 1

    def test_messages_suppress_assertion_roulette(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() {
                assertEquals(1, x, "x should be one");
                assertEquals(2, y, "y should be two");
            }
        }
        """
        assert detect_builtin(source).counts["AR"] == 0

    def test_detects_unknown_test(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void noAssertions() { service.doWork(); }
        }
        """
        assert detect_builtin(source).counts["UT"] == 1

    def test_detects_empty_test(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void empty() { }
        }
        """
        counts = detect_builtin(source).counts
        assert counts["EM"] == 1
        # An empty test must not also be reported as Unknown Test.
        assert counts["UT"] == 0

    def test_detects_sleepy_and_redundant_print(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() throws Exception {
                System.out.println("debug");
                Thread.sleep(1000);
                assertEquals(1, x);
            }
        }
        """
        counts = detect_builtin(source).counts
        assert counts["RP"] == 1
        assert counts["ST"] == 1

    def test_detects_conditional_logic_and_exception_handling(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() {
                try {
                    if (flag) { assertEquals(1, x); }
                } catch (Exception e) { fail(); }
            }
        }
        """
        counts = detect_builtin(source).counts
        assert counts["CTL"] == 1
        assert counts["EH"] == 1

    def test_assert_throws_is_not_exception_handling(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() {
                assertThrows(IllegalArgumentException.class, () -> service.go(null));
            }
        }
        """
        assert detect_builtin(source).counts["EH"] == 0

    def test_detects_magic_number(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() { assertEquals(4207, service.total()); }
        }
        """
        assert detect_builtin(source).counts["MNT"] == 1

    def test_benign_numbers_are_not_magic(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() { assertEquals(0, service.total()); }
        }
        """
        assert detect_builtin(source).counts["MNT"] == 0

    def test_detects_mystery_guest_and_resource_optimism(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void t() {
                File f = new File("/tmp/data.csv");
                assertEquals(1, service.load(f));
            }
        }
        """
        counts = detect_builtin(source).counts
        assert counts["MG"] == 1
        assert counts["RO"] == 1

    def test_detects_redundant_assertion_and_sensitive_equality(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            @Test
            void tautology() { assertTrue(true); }
            @Test
            void sensitive() { assertEquals("Order[1]", order.toString()); }
        }
        """
        counts = detect_builtin(source).counts
        assert counts["RA"] == 1
        assert counts["SE"] == 1

    def test_detects_constructor_initialization(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        class FooTest {
            private Service s;
            FooTest() { s = new Service(); }
            @Test
            void t() { assertNotNull(s); }
        }
        """
        assert detect_builtin(source).counts["CI"] == 1

    def test_detects_ignored_test(self):
        source = """
        package a;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.Disabled;
        class FooTest {
            @Disabled("flaky")
            @Test
            void t() { assertEquals(1, x); }
        }
        """
        assert detect_builtin(source).counts["IT"] == 1

    def test_clean_test_has_no_smells(self, sample_test_source):
        metrics = detect_builtin(sample_test_source)
        # The sample uses a magic number in one assertion; nothing else should fire.
        noisy = {k: v for k, v in metrics.counts.items() if v and k != "MNT"}
        assert noisy == {}, f"unexpected smells: {noisy}"

    def test_detector_is_reported(self):
        assert detect_builtin("class FooTest {}").detector == "builtin"

    def test_unparseable_test_is_unavailable(self):
        assert not detect_builtin("this is not java at all !!!").available


class TestEvaluationProtocol:
    """Section 4.6: compiled-only vs pessimistic averaging."""

    @pytest.fixture
    def observations(self):
        # Three of five classes compiled, scoring 90, 80 and 70.
        return [
            ClassObservation("c1", compiled=True, compiled_initially=True, attempts=1, mutation_score=90.0),
            ClassObservation("c2", compiled=True, compiled_initially=False, attempts=3, mutation_score=80.0),
            ClassObservation("c3", compiled=True, compiled_initially=False, attempts=2, mutation_score=70.0),
            ClassObservation("c4", compiled=False, compiled_initially=False),
            ClassObservation("c5", compiled=False, compiled_initially=False),
        ]

    def test_compiled_only_average(self, observations):
        result = aggregate(observations, model="m", strategy="s")
        assert result.mutation_score == pytest.approx(80.0)

    def test_pessimistic_average_counts_failures_as_zero(self, observations):
        result = aggregate(observations, model="m", strategy="s")
        assert result.mutation_score_pessimistic == pytest.approx(48.0)

    def test_compilation_rates(self, observations):
        result = aggregate(observations, model="m", strategy="s")
        assert result.cr_initial == pytest.approx(20.0)
        assert result.cr_after_fix == pytest.approx(60.0)

    def test_attempts_exclude_never_compiled_classes(self, observations):
        """Section 4.5: never-compiled classes are excluded from the average."""
        result = aggregate(observations, model="m", strategy="s")
        assert result.num_attempts == pytest.approx(2.0)

    def test_correction_fix_rate(self, observations):
        result = aggregate(observations, model="m", strategy="s")
        # 4 initially failed, 2 were rescued.
        assert result.correction_fix_rate == pytest.approx(50.0)

    def test_gemini_zero_shot_worked_example(self):
        """Section 5.3: 35% -> 80% is a 69.2% fix rate over the 65% that failed."""
        observations = (
            [ClassObservation(f"i{i}", compiled=True, compiled_initially=True) for i in range(35)]
            + [ClassObservation(f"f{i}", compiled=True, compiled_initially=False) for i in range(45)]
            + [ClassObservation(f"x{i}", compiled=False) for i in range(20)]
        )
        result = aggregate(observations, model="gemini-1.5-pro", strategy="zero-shot")

        assert result.cr_initial == pytest.approx(35.0)
        assert result.cr_after_fix == pytest.approx(80.0)
        assert result.correction_fix_rate == pytest.approx(69.2, abs=0.1)

    def test_helper_functions_agree_with_aggregate(self):
        values = [90.0, 80.0, 70.0, 0.0, 0.0]
        flags = [True, True, True, False, False]

        assert compiled_only_average(values, flags) == pytest.approx(80.0)
        assert pessimistic_average(values, flags) == pytest.approx(48.0)
        assert build_rate(flags) == pytest.approx(60.0)

    def test_empty_input_is_safe(self):
        result = aggregate([], model="m", strategy="s")
        assert result.n_total == 0 and result.cr_after_fix == 0.0

    def test_row_matches_the_published_column_layout(self, observations):
        row = aggregate(observations, model="gpt-4.1", strategy="dynamic").to_row()
        expected = [
            "model", "prompt_name", "branch_coverage", "line_coverage",
            "method_coverage", "mutation_score", *REPORTED_SMELLS,
            "CR_initial", "CR_after_fix", "num_attempts",
        ]
        assert list(row.keys()) == expected
