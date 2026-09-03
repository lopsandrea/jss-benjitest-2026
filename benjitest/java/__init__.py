"""Java static analysis: source parsing and project introspection."""

from .model import (
    Dependency,
    DependencyKind,
    JavaClass,
    JavaField,
    JavaMethod,
    JavaParameter,
)
from .parser import (
    JavaParseError,
    cyclomatic_complexity,
    parse_class,
    parse_file,
    resolve_dependencies,
    strip_comments,
)
from .project import (
    BuildMetadata,
    ProjectLayout,
    build_project_tree,
    detect_build_metadata,
    detect_layout,
    find_class_file,
    index_project_types,
    list_main_classes,
    list_test_files,
    normalize_java_version,
)

__all__ = [
    "BuildMetadata",
    "Dependency",
    "DependencyKind",
    "JavaClass",
    "JavaField",
    "JavaMethod",
    "JavaParameter",
    "JavaParseError",
    "ProjectLayout",
    "build_project_tree",
    "cyclomatic_complexity",
    "detect_build_metadata",
    "detect_layout",
    "find_class_file",
    "index_project_types",
    "list_main_classes",
    "list_test_files",
    "normalize_java_version",
    "parse_class",
    "parse_file",
    "resolve_dependencies",
    "strip_comments",
]
