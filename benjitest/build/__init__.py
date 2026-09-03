"""Build System Integration Module: sandboxing, compilation, and execution."""

from .dependencies import InjectionResult, inject, inject_gradle, inject_maven
from .errors import (
    BuildError,
    ErrorCategory,
    ErrorPhase,
    ErrorReport,
    compare_reports,
    parse_build_log,
    parse_compilation_errors,
    parse_test_failures,
)
from .integration import BuildResult, BuildStatus, BuildSystem, BuildSystemError
from .sandbox import Sandbox, SandboxError, create_sandbox, purge_tests, read_original_test

__all__ = [
    "BuildError",
    "BuildResult",
    "BuildStatus",
    "BuildSystem",
    "BuildSystemError",
    "ErrorCategory",
    "ErrorPhase",
    "ErrorReport",
    "InjectionResult",
    "Sandbox",
    "SandboxError",
    "compare_reports",
    "create_sandbox",
    "inject",
    "inject_gradle",
    "inject_maven",
    "parse_build_log",
    "parse_compilation_errors",
    "parse_test_failures",
    "purge_tests",
    "read_original_test",
]
