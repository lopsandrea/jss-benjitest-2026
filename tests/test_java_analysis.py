"""Static analysis: parsing, dependency categorisation, project introspection."""

from __future__ import annotations

import pytest

from benjitest.java.model import DependencyKind
from benjitest.java.parser import (
    JavaParseError,
    cyclomatic_complexity,
    parse_class,
    resolve_dependencies,
)
from benjitest.java.project import (
    build_project_tree,
    detect_build_metadata,
    detect_layout,
    find_class_file,
    index_project_types,
    list_test_files,
    normalize_java_version,
)


class TestParsing:
    def test_extracts_class_structure(self, sample_class_source):
        cut = parse_class(sample_class_source, target_class="OrderService")

        assert cut.name == "OrderService"
        assert cut.package == "com.example.service"
        assert cut.kind == "class"
        assert not cut.degraded
        assert cut.qualified_name == "com.example.service.OrderService"

    def test_separates_constructors_from_methods(self, sample_class_source):
        cut = parse_class(sample_class_source)

        assert [c.name for c in cut.constructors] == ["OrderService"]
        assert {m.name for m in cut.methods} == {"processOrder", "findAll", "audit"}

    def test_testable_methods_exclude_private(self, sample_class_source):
        cut = parse_class(sample_class_source)
        assert {m.name for m in cut.testable_methods} == {"processOrder", "findAll"}

    def test_captures_javadoc(self, sample_class_source):
        cut = parse_class(sample_class_source)
        process = next(m for m in cut.methods if m.name == "processOrder")

        assert "Processes an order" in process.javadoc
        assert "@throws IllegalArgumentException" in process.javadoc

    def test_method_signature_ordering(self, sample_class_source):
        cut = parse_class(sample_class_source)
        process = next(m for m in cut.methods if m.name == "processOrder")
        assert process.signature == "public OrderResult processOrder(Order order)"

    def test_field_declaration_modifier_order(self, sample_class_source):
        cut = parse_class(sample_class_source)
        constant = next(f for f in cut.fields if f.name == "MAX_ITEMS")
        assert constant.declaration == "public static final int MAX_ITEMS = 100"

    def test_signature_summary_omits_bodies(self, sample_class_source):
        summary = parse_class(sample_class_source).signature_summary()

        assert "public OrderResult processOrder(Order order);" in summary
        assert "throw new IllegalArgumentException" not in summary
        # Private members are not part of the testable surface.
        assert "audit" not in summary

    def test_empty_source_is_rejected(self):
        with pytest.raises(JavaParseError):
            parse_class("   ")

    def test_records_are_parsed(self):
        cut = parse_class("package a; public record Point(int x, int y) { }")
        assert cut.name == "Point"
        assert cut.kind in {"record", "class"}

    def test_regex_fallback_handles_unparseable_source(self):
        # A Java 21 pattern-matching switch that javalang's Java 8 grammar rejects.
        source = """
        package com.example;
        public class Shape {
            public String describe(Object o) {
                return switch (o) {
                    case Integer i when i > 0 -> "positive";
                    case String s -> s;
                    default -> "other";
                };
            }
        }
        """
        cut = parse_class(source, target_class="Shape")

        assert cut.name == "Shape"
        assert cut.degraded, "an unparseable source must be flagged as degraded"
        assert "describe" in {m.name for m in cut.methods}

    def test_interface_is_not_testable(self):
        cut = parse_class("package a; public interface Repo { void save(); }")
        assert not cut.is_testable

    def test_abstract_class_is_not_testable(self):
        cut = parse_class("package a; public abstract class Base { public void go() {} }")
        assert not cut.is_testable


class TestComplexity:
    def test_straight_line_code_has_complexity_one(self):
        assert cyclomatic_complexity("void f() { int x = 1; }") == 1

    def test_counts_branches_and_short_circuits(self):
        source = "void f() { if (a && b) { for (X x : xs) { } } }"
        # 1 base + if + && + for
        assert cyclomatic_complexity(source) == 4

    def test_ignores_keywords_inside_strings_and_comments(self):
        source = 'void f() { String s = "if for while"; /* if */ }'
        assert cyclomatic_complexity(source) == 1

    def test_process_order_complexity(self, sample_class_source):
        cut = parse_class(sample_class_source)
        process = next(m for m in cut.methods if m.name == "processOrder")
        # null guard, empty guard, loop, quantity guard, plus the entry edge.
        assert process.cyclomatic_complexity == 5


class TestDependencyResolution:
    @pytest.fixture
    def resolved(self, sample_class_source):
        cut = parse_class(sample_class_source)
        resolve_dependencies(
            cut,
            project_types={
                "OrderRepository": "com.example.repository.OrderRepository",
                "Order": "com.example.model.Order",
                "OrderItem": "com.example.model.OrderItem",
                "OrderResult": "com.example.model.OrderResult",
            },
            external_artifacts={"com.google.common": "com.google.guava:guava"},
        )
        return cut

    def test_internal_dependencies_detected(self, resolved):
        internal = {d.type_name for d in resolved.internal_dependencies}
        assert {"OrderRepository", "Order", "OrderResult"} <= internal

    def test_constructor_injected_dependency_is_mockable(self, resolved):
        repository = next(d for d in resolved.dependencies if d.type_name == "OrderRepository")
        assert "constructor-injected" in repository.roles
        assert repository.mockable

    def test_jdk_types_are_not_mockable(self, resolved):
        jdk = [d for d in resolved.dependencies if d.kind is DependencyKind.JDK]
        assert jdk, "IllegalArgumentException should be classified as a JDK type"
        assert all(not d.mockable for d in jdk)

    def test_body_only_types_are_surfaced(self, resolved):
        # OrderItem appears only as a for-each loop variable.
        assert "OrderItem" in {d.type_name for d in resolved.dependencies}

    def test_own_type_is_not_a_dependency(self, resolved):
        assert "OrderService" not in {d.type_name for d in resolved.dependencies}


class TestProjectIntrospection:
    def test_detects_maven_layout(self, maven_project):
        layout = detect_layout(maven_project)
        assert layout.primary_main_root == maven_project / "src" / "main" / "java"
        assert layout.primary_test_root == maven_project / "src" / "test" / "java"

    def test_detects_build_metadata(self, maven_project):
        metadata = detect_build_metadata(maven_project)
        assert metadata.tool == "maven"
        assert metadata.java_version == "17"
        assert "com.google.guava:guava" in metadata.dependencies

    def test_normalize_java_version(self):
        assert normalize_java_version("1.8") == 8
        assert normalize_java_version("17") == 17
        assert normalize_java_version("21.0.1") == 21
        assert normalize_java_version(None) is None

    def test_project_tree_lists_packages_not_files(self, maven_project):
        tree = build_project_tree(maven_project)
        assert "com.example.service/" in tree
        # packages_only mode reports counts rather than individual file names.
        assert "OrderService.java" not in tree

    def test_index_project_types(self, maven_project):
        index = index_project_types(maven_project)
        assert index["OrderService"] == "com.example.service.OrderService"

    def test_find_class_file(self, maven_project):
        found = find_class_file(maven_project, "OrderService", package="com.example.service")
        assert found is not None and found.name == "OrderService.java"

    def test_list_test_files(self, maven_project):
        tests = list_test_files(maven_project)
        assert [t.name for t in tests] == ["OrderServiceTest.java"]
