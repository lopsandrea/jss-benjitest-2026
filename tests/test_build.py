"""Build System Integration: error taxonomy, sandboxing, dependency injection."""

from __future__ import annotations

import xml.etree.ElementTree as ET

from benjitest.build.dependencies import inject_gradle, inject_maven
from benjitest.build.errors import (
    ErrorCategory,
    ErrorPhase,
    classify_compilation_error,
    classify_test_failure,
    compare_reports,
    parse_build_log,
    parse_compilation_errors,
    parse_test_failures,
)
from benjitest.build.sandbox import create_sandbox, purge_tests

MAVEN_COMPILE_LOG = """\
[INFO] Compiling 1 source file to /work/demo/target/test-classes
[ERROR] COMPILATION ERROR :
[ERROR] /work/demo/src/test/java/com/example/OrderServiceTest.java:[23,17] cannot find symbol
  symbol:   method findByName(java.lang.String)
[ERROR] /work/demo/src/test/java/com/example/OrderServiceTest.java:[31,9] ';' expected
[INFO] BUILD FAILURE
"""

JAVAC_LOG = """\
OrderServiceTest.java:12: error: package org.junit.jupiter.api does not exist
import org.junit.jupiter.api.Test;
                            ^
OrderServiceTest.java:40: error: incompatible types: String cannot be converted to Long
"""

SUREFIRE_LOG = """\
[INFO] Running com.example.OrderServiceTest
[ERROR] Tests run: 4, Failures: 1, Errors: 1, Skipped: 0
[ERROR] OrderServiceTest.processOrder_singleItem_returnsTotal:42 expected: <42> but was: <0>
[ERROR] OrderServiceTest.findAll_empty_returnsEmpty:55 NullPointerException: repository is null
"""


class TestCompilationErrorTaxonomy:
    def test_symbol_errors(self):
        for message in (
            "cannot find symbol",
            "package org.junit does not exist",
            "incompatible types: String cannot be converted to Long",
            "constructor Service in class Service cannot be applied to given types",
            "getName() has private access in User",
        ):
            assert classify_compilation_error(message) is ErrorCategory.SYMBOL_IMPORT, message

    def test_syntax_errors(self):
        for message in (
            "';' expected",
            "illegal start of expression",
            "reached end of file while parsing",
            "class, interface, enum, or record expected",
        ):
            assert classify_compilation_error(message) is ErrorCategory.SYNTAX, message

    def test_build_categories_map_to_the_build_phase(self):
        assert ErrorCategory.SYMBOL_IMPORT.phase is ErrorPhase.BUILD
        assert ErrorCategory.SYNTAX.phase is ErrorPhase.BUILD
        assert ErrorCategory.ASSERTION.phase is ErrorPhase.TEST
        assert ErrorCategory.RUNTIME_EXCEPTION.phase is ErrorPhase.TEST


class TestCompilationLogParsing:
    def test_parses_maven_format(self):
        errors = parse_compilation_errors(MAVEN_COMPILE_LOG)

        assert len(errors) == 2
        assert errors[0].line == 23
        assert errors[0].category is ErrorCategory.SYMBOL_IMPORT
        assert errors[1].line == 31
        assert errors[1].category is ErrorCategory.SYNTAX

    def test_parses_javac_format(self):
        errors = parse_compilation_errors(JAVAC_LOG)

        assert {e.line for e in errors} == {12, 40}
        assert all(e.category is ErrorCategory.SYMBOL_IMPORT for e in errors)

    def test_deduplicates_identical_diagnostics(self):
        doubled = MAVEN_COMPILE_LOG + MAVEN_COMPILE_LOG
        assert len(parse_compilation_errors(doubled)) == 2

    def test_summary_line_only_still_records_a_failure(self):
        errors = parse_compilation_errors("[ERROR] COMPILATION ERROR :\n[INFO] BUILD FAILURE")
        assert len(errors) == 1
        assert errors[0].category is ErrorCategory.OTHER

    def test_empty_log_yields_nothing(self):
        assert parse_compilation_errors("") == []


class TestTestFailureParsing:
    def test_distinguishes_assertions_from_runtime_exceptions(self):
        errors = parse_test_failures(SUREFIRE_LOG)
        by_method = {e.test_method: e for e in errors}

        assertion = by_method["OrderServiceTest.processOrder_singleItem_returnsTotal"]
        runtime = by_method["OrderServiceTest.findAll_empty_returnsEmpty"]

        assert assertion.category is ErrorCategory.ASSERTION
        assert runtime.category is ErrorCategory.RUNTIME_EXCEPTION
        assert runtime.exception_type == "NullPointerException"

    def test_classifies_opentest4j_as_assertion(self):
        assert (
            classify_test_failure("expected: <1> but was: <2>", "org.opentest4j.AssertionFailedError")
            is ErrorCategory.ASSERTION
        )

    def test_classifies_mockito_verification_as_assertion(self):
        assert (
            classify_test_failure("Wanted but not invoked: repo.save()", None)
            is ErrorCategory.ASSERTION
        )


class TestErrorReport:
    def test_build_errors_dominate_test_errors(self):
        """A project that does not compile never reaches the test phase."""
        report = parse_build_log(MAVEN_COMPILE_LOG, compiled=False)
        assert report.dominant_category.phase is ErrorPhase.BUILD

    def test_test_phase_report_when_compiled(self):
        report = parse_build_log(SUREFIRE_LOG, compiled=True)
        assert report.dominant_category.phase is ErrorPhase.TEST

    def test_failed_build_always_yields_at_least_one_error(self):
        report = parse_build_log("something went wrong in an unrecognised way", compiled=False)
        assert len(report) == 1

    def test_summary_is_bounded(self):
        report = parse_build_log("\n".join([MAVEN_COMPILE_LOG] * 40), compiled=False)
        assert "more error(s)" in report.summary(limit=1)

    def test_compare_reports_diffs_signatures(self):
        before = parse_build_log(MAVEN_COMPILE_LOG, compiled=False)
        after = parse_build_log(JAVAC_LOG, compiled=False)
        diff = compare_reports(before, after)

        assert diff["previous_count"] == 2
        assert diff["current_count"] == 2
        assert diff["resolved"] == 2
        assert diff["introduced"] == 2
        assert diff["persisted"] == 0

    def test_identical_reports_show_no_progress(self):
        report = parse_build_log(MAVEN_COMPILE_LOG, compiled=False)
        diff = compare_reports(report, report)
        assert diff["resolved"] == 0 and diff["introduced"] == 0 and diff["persisted"] == 2


class TestSandbox:
    def test_creates_isolated_copy(self, maven_project, tmp_path):
        sandbox = create_sandbox(maven_project, workdir=tmp_path / "work")

        assert sandbox.path != maven_project
        assert (sandbox.path / "pom.xml").is_file()
        assert (
            sandbox.path / "src" / "main" / "java" / "com" / "example" / "service" / "OrderService.java"
        ).is_file()

    def test_purges_human_written_tests(self, maven_project, tmp_path):
        sandbox = create_sandbox(maven_project, workdir=tmp_path / "work")

        assert sandbox.purged_tests, "the pre-existing test should have been removed"
        assert not list((sandbox.path / "src" / "test").rglob("*.java"))
        # The origin project is left untouched.
        assert list((maven_project / "src" / "test").rglob("*.java"))

    def test_purge_can_be_disabled(self, maven_project, tmp_path):
        sandbox = create_sandbox(
            maven_project, workdir=tmp_path / "work", purge_existing_tests=False
        )
        assert list((sandbox.path / "src" / "test").rglob("*.java"))

    def test_installs_test_into_the_package_directory(self, maven_project, tmp_path):
        sandbox = create_sandbox(maven_project, workdir=tmp_path / "work")
        installed = sandbox.install_test(
            "package com.example.service;\nclass FooTest {}",
            package="com.example.service",
            class_name="FooTest",
        )

        expected = (
            sandbox.path / "src" / "test" / "java" / "com" / "example" / "service" / "FooTest.java"
        )
        assert installed == expected and expected.is_file()

    def test_remove_installed_test(self, maven_project, tmp_path):
        sandbox = create_sandbox(maven_project, workdir=tmp_path / "work")
        path = sandbox.install_test("class FooTest {}", package=None, class_name="FooTest")
        sandbox.remove_installed_test()

        assert not path.is_file()
        assert sandbox.installed_test is None

    def test_purge_is_idempotent(self, maven_project, tmp_path):
        sandbox = create_sandbox(maven_project, workdir=tmp_path / "work")
        assert purge_tests(sandbox) == []


class TestMavenInjection:
    def test_adds_junit_mockito_and_plugins(self, maven_project):
        result = inject_maven(maven_project / "pom.xml")

        assert result.modified
        assert any("junit-jupiter" in d for d in result.added_dependencies)
        assert any("mockito-core" in d for d in result.added_dependencies)
        assert "jacoco-maven-plugin" in result.added_plugins
        assert "pitest-maven" in result.added_plugins

    def test_produces_valid_xml(self, maven_project):
        inject_maven(maven_project / "pom.xml")
        tree = ET.parse(maven_project / "pom.xml")

        namespace = "{http://maven.apache.org/POM/4.0.0}"
        artifacts = {e.text for e in tree.getroot().iter(f"{namespace}artifactId")}
        assert "junit-jupiter" in artifacts
        assert "jacoco-maven-plugin" in artifacts
        # The project's own dependency survives.
        assert "guava" in artifacts

    def test_is_idempotent(self, maven_project):
        inject_maven(maven_project / "pom.xml")
        second = inject_maven(maven_project / "pom.xml")
        assert not second.modified

    def test_respects_an_existing_pinned_version(self, tmp_path):
        pom = tmp_path / "pom.xml"
        pom.write_text(
            """<?xml version="1.0"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>
  <groupId>g</groupId><artifactId>a</artifactId><version>1</version>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.9.0</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
""",
            encoding="utf-8",
        )
        inject_maven(pom)

        versions = [
            e.text
            for e in ET.parse(pom).getroot().iter("{http://maven.apache.org/POM/4.0.0}version")
        ]
        assert "5.9.0" in versions, "the project's pinned JUnit version must be preserved"

    def test_missing_pom_is_reported_not_raised(self, tmp_path):
        result = inject_maven(tmp_path / "absent.xml")
        assert not result.modified and "not found" in result.message


class TestGradleInjection:
    def test_appends_configuration_block(self, tmp_path):
        build_file = tmp_path / "build.gradle"
        build_file.write_text("apply plugin: 'java'\n", encoding="utf-8")

        result = inject_gradle(build_file)
        content = build_file.read_text(encoding="utf-8")

        assert result.modified
        assert "BenjiTest injected configuration" in content
        assert "useJUnitPlatform()" in content
        assert content.startswith("apply plugin: 'java'")

    def test_is_idempotent(self, tmp_path):
        build_file = tmp_path / "build.gradle"
        build_file.write_text("apply plugin: 'java'\n", encoding="utf-8")

        inject_gradle(build_file)
        assert not inject_gradle(build_file).modified
