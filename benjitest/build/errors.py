"""Structured parsing and categorisation of build and test failures.

The Error Interpreter receives raw build logs, but the framework also needs a
deterministic categorisation to populate the correction-loop breakdown reported
in Table 8, which splits errors into a **Build** phase (Symbol/Import Mismatch,
Syntax Violations) and a **Test** phase (Assertion Failures, Runtime Exceptions).

Categorisation here is rule-based rather than LLM-based on purpose: the reported
frequencies and per-category fix rates must be reproducible from the raw logs.
"""

from __future__ import annotations

import re
from dataclasses import dataclass, field
from enum import Enum


class ErrorPhase(str, Enum):
    BUILD = "Build"
    TEST = "Test"
    UNKNOWN = "Unknown"


class ErrorCategory(str, Enum):
    """The four categories reported in Table 8, plus a catch-all."""

    SYMBOL_IMPORT = "Symbol/Import Mismatch"
    SYNTAX = "Syntax Violations"
    ASSERTION = "Assertion Failures"
    RUNTIME_EXCEPTION = "Runtime Exceptions"
    OTHER = "Other"

    @property
    def phase(self) -> ErrorPhase:
        if self in (ErrorCategory.SYMBOL_IMPORT, ErrorCategory.SYNTAX):
            return ErrorPhase.BUILD
        if self in (ErrorCategory.ASSERTION, ErrorCategory.RUNTIME_EXCEPTION):
            return ErrorPhase.TEST
        return ErrorPhase.UNKNOWN


@dataclass(slots=True)
class BuildError:
    """A single diagnosed error extracted from a build or test log."""

    category: ErrorCategory
    message: str
    file: str | None = None
    line: int | None = None
    column: int | None = None
    #: Test method for test-phase failures.
    test_method: str | None = None
    #: Exception type for runtime failures.
    exception_type: str | None = None
    raw: str = ""

    @property
    def phase(self) -> ErrorPhase:
        return self.category.phase

    @property
    def signature(self) -> str:
        """Stable identity used to tell whether an error persisted across attempts."""
        location = f"{self.file}:{self.line}" if self.file else ""
        return f"{self.category.value}|{location}|{_normalize_message(self.message)}"

    def __str__(self) -> str:
        location = ""
        if self.file:
            location = f"{self.file}"
            if self.line:
                location += f":{self.line}"
            location += " "
        return f"[{self.category.value}] {location}{self.message}"


@dataclass(slots=True)
class ErrorReport:
    """All errors extracted from one build/test invocation."""

    errors: list[BuildError] = field(default_factory=list)
    raw_log: str = ""

    def __bool__(self) -> bool:
        return bool(self.errors)

    def __len__(self) -> int:
        return len(self.errors)

    @property
    def categories(self) -> list[ErrorCategory]:
        return [e.category for e in self.errors]

    @property
    def dominant_category(self) -> ErrorCategory | None:
        """The most frequent category, used to attribute an attempt in Table 8."""
        if not self.errors:
            return None
        counts: dict[ErrorCategory, int] = {}
        for error in self.errors:
            counts[error.category] = counts.get(error.category, 0) + 1
        # Build-phase errors dominate: a project that does not compile never
        # reaches the test phase, so a compile error outranks any test failure.
        build = {c: n for c, n in counts.items() if c.phase is ErrorPhase.BUILD}
        pool = build or counts
        return max(pool.items(), key=lambda item: item[1])[0]

    @property
    def signatures(self) -> set[str]:
        return {e.signature for e in self.errors}

    def summary(self, limit: int = 25) -> str:
        """Compact rendering handed to the Error Interpreter and the Classifier."""
        if not self.errors:
            return "No structured errors were extracted from the build log."
        lines = [str(error) for error in self.errors[:limit]]
        if len(self.errors) > limit:
            lines.append(f"... and {len(self.errors) - limit} more error(s)")
        return "\n".join(lines)


# ----------------------------------------------------------------------
# Compilation errors
# ----------------------------------------------------------------------
#: Maven compiler plugin: "/abs/path/Foo.java:[12,34] cannot find symbol"
_MAVEN_ERROR_RE = re.compile(
    r"^\[?ERROR\]?\s*(?P<file>[^\s:\[]+\.java):\[(?P<line>\d+),(?P<col>\d+)\]\s*(?P<message>.+)$",
    re.MULTILINE,
)
#: javac / Gradle: "Foo.java:12: error: cannot find symbol"
_JAVAC_ERROR_RE = re.compile(
    r"^(?P<file>[^\s:]+\.java):(?P<line>\d+):\s*error:\s*(?P<message>.+)$",
    re.MULTILINE,
)
#: Gradle also emits "e: file:///path/Foo.java:12:5 message" for some toolchains.
_GRADLE_ERROR_RE = re.compile(
    r"^e:\s*(?:file://)?(?P<file>[^\s:]+\.java):(?P<line>\d+):(?P<col>\d+)\s*(?P<message>.+)$",
    re.MULTILINE,
)

_SYMBOL_PATTERNS = (
    "cannot find symbol",
    # javac interpolates the package name: "package org.junit does not exist".
    "does not exist",
    "cannot access",
    "symbol not found",
    "incompatible types",
    "cannot be applied to given types",
    "constructor",
    "has private access",
    "no suitable method found",
    "method does not override",
    "is not abstract and does not override",
    "cannot be referenced from a static context",
    "unreported exception",
    "already defined",
    "is not public",
    "bad operand types",
    "array required",
    "not a statement",
    "might not have been initialized",
    "ambiguous",
)
_SYNTAX_PATTERNS = (
    "expected",
    "illegal start",
    "reached end of file while parsing",
    "class, interface, enum, or record expected",
    "unclosed string literal",
    "unclosed comment",
    "invalid method declaration",
    "malformed",
    "not a valid",
    "illegal character",
)


def classify_compilation_error(message: str) -> ErrorCategory:
    """Map a compiler message onto a Table 8 build-phase category."""
    lowered = message.lower()
    # Syntax is checked first: "';' expected" also contains no symbol keyword,
    # but "cannot find symbol" never contains a syntax marker, so ordering only
    # matters for messages such as "<identifier> expected".
    if any(pattern in lowered for pattern in _SYNTAX_PATTERNS):
        return ErrorCategory.SYNTAX
    if any(pattern in lowered for pattern in _SYMBOL_PATTERNS):
        return ErrorCategory.SYMBOL_IMPORT
    return ErrorCategory.OTHER


def parse_compilation_errors(log: str) -> list[BuildError]:
    """Extract compiler diagnostics from a Maven, Gradle, or javac log."""
    if not log:
        return []

    errors: list[BuildError] = []
    seen: set[tuple[str | None, int | None, str]] = set()

    for pattern in (_MAVEN_ERROR_RE, _JAVAC_ERROR_RE, _GRADLE_ERROR_RE):
        for match in pattern.finditer(log):
            groups = match.groupdict()
            message = groups["message"].strip()
            file_name = groups.get("file")
            line = int(groups["line"]) if groups.get("line") else None
            key = (file_name, line, _normalize_message(message))
            if key in seen:
                continue
            seen.add(key)
            errors.append(
                BuildError(
                    category=classify_compilation_error(message),
                    message=message,
                    file=file_name,
                    line=line,
                    column=int(groups["col"]) if groups.get("col") else None,
                    raw=match.group(0).strip(),
                )
            )

    # Some toolchains report only a summary line; keep the phase correct even
    # when no per-diagnostic detail is available.
    if not errors and re.search(
        r"COMPILATION ERROR|compileJava.*FAILED|compileTestJava.*FAILED", log
    ):
            errors.append(
                BuildError(
                    category=ErrorCategory.OTHER,
                    message="Compilation failed without per-diagnostic output.",
                    raw=_tail(log, 40),
                )
            )
    return errors


# ----------------------------------------------------------------------
# Test failures
# ----------------------------------------------------------------------
#: Surefire summary: "[ERROR] FooTest.bar:23 expected:<1> but was:<2>"
_SUREFIRE_FAILURE_RE = re.compile(
    r"^\[?ERROR\]?\s+(?P<class>[\w.$]+)\.(?P<method>\w+):(?P<line>\d+)\s*(?P<message>.*)$",
    re.MULTILINE,
)
#: JUnit 5 console / Gradle: "FooTest > bar() FAILED"
_GRADLE_TEST_FAILURE_RE = re.compile(
    r"^(?P<class>[\w.$]+)\s*>\s*(?P<method>[\w$]+)\(\)?\s*FAILED\s*$",
    re.MULTILINE,
)
_EXCEPTION_RE = re.compile(r"\b((?:[\w$]+\.)*[A-Z][\w$]*(?:Exception|Error))\b")

_ASSERTION_TYPES = (
    "AssertionFailedError",
    "AssertionError",
    "ComparisonFailure",
    "MultipleFailuresError",
    "opentest4j",
)
_ASSERTION_MESSAGE_MARKERS = (
    "expected:",
    "expected <",
    "expecting",
    "assertion failed",
    "was not equal",
    "wanted but not invoked",
    "never wanted here",
    "argument(s) are different",
)


def classify_test_failure(message: str, exception_type: str | None) -> ErrorCategory:
    """Distinguish an assertion failure from a genuine runtime exception.

    Table 8 separates the two because their fix rates differ sharply (41% vs.
    55%): an assertion failure means the model misunderstood the behaviour, while
    a runtime exception is usually a setup defect.
    """
    haystack = f"{exception_type or ''} {message or ''}"
    if any(marker in haystack for marker in _ASSERTION_TYPES):
        return ErrorCategory.ASSERTION
    lowered = (message or "").lower()
    if any(marker in lowered for marker in _ASSERTION_MESSAGE_MARKERS):
        return ErrorCategory.ASSERTION
    if exception_type:
        return ErrorCategory.RUNTIME_EXCEPTION
    return ErrorCategory.OTHER


def parse_test_failures(log: str) -> list[BuildError]:
    """Extract test-phase failures from a Surefire or Gradle test log."""
    if not log:
        return []

    errors: list[BuildError] = []
    seen: set[tuple[str | None, str]] = set()

    for match in _SUREFIRE_FAILURE_RE.finditer(log):
        message = match.group("message").strip()
        # The Surefire pattern also matches stack-trace-like lines; require some
        # indication that this is a reported failure rather than a frame.
        if message.startswith("at ") or not message:
            continue
        exception_match = _EXCEPTION_RE.search(message)
        exception_type = exception_match.group(1) if exception_match else None
        method = f"{match.group('class')}.{match.group('method')}"
        key = (method, _normalize_message(message))
        if key in seen:
            continue
        seen.add(key)
        errors.append(
            BuildError(
                category=classify_test_failure(message, exception_type),
                message=message,
                test_method=method,
                line=int(match.group("line")),
                exception_type=exception_type,
                raw=match.group(0).strip(),
            )
        )

    for match in _GRADLE_TEST_FAILURE_RE.finditer(log):
        method = f"{match.group('class')}.{match.group('method')}"
        # Gradle prints the cause on the following lines.
        tail = log[match.end() : match.end() + 500]
        exception_match = _EXCEPTION_RE.search(tail)
        exception_type = exception_match.group(1) if exception_match else None
        message = tail.strip().splitlines()[0].strip() if tail.strip() else "test failed"
        key = (method, _normalize_message(message))
        if key in seen:
            continue
        seen.add(key)
        errors.append(
            BuildError(
                category=classify_test_failure(message, exception_type),
                message=message,
                test_method=method,
                exception_type=exception_type,
                raw=match.group(0).strip(),
            )
        )

    if not errors and re.search(r"Tests run:.*Failures: [1-9]|Errors: [1-9]", log):
        exception_match = _EXCEPTION_RE.search(log)
        exception_type = exception_match.group(1) if exception_match else None
        errors.append(
            BuildError(
                category=classify_test_failure(log, exception_type),
                message="Test execution reported failures without per-test detail.",
                exception_type=exception_type,
                raw=_tail(log, 40),
            )
        )
    return errors


def parse_build_log(log: str, *, compiled: bool) -> ErrorReport:
    """Parse a full build log into an :class:`ErrorReport`.

    Args:
        log: Combined stdout/stderr of the build invocation.
        compiled: Whether a valid ``.class`` file was produced. When ``False`` the
            log is scanned for compiler diagnostics; when ``True`` it is scanned
            for test-phase failures.
    """
    errors = parse_compilation_errors(log) if not compiled else parse_test_failures(log)
    if not errors and not compiled:
        # Compilation failed for a reason we could not attribute (e.g. a plugin
        # crash). Record it rather than reporting an empty, misleading report.
        errors = [
            BuildError(
                category=ErrorCategory.OTHER,
                message="Build failed; no compiler diagnostic could be extracted.",
                raw=_tail(log, 60),
            )
        ]
    return ErrorReport(errors=errors, raw_log=log)


def _normalize_message(message: str) -> str:
    """Collapse whitespace and drop volatile paths so signatures stay comparable."""
    normalized = re.sub(r"\s+", " ", message or "").strip().lower()
    return re.sub(r"/[\w./\-]+/", "", normalized)


def _tail(text: str, lines: int) -> str:
    return "\n".join((text or "").splitlines()[-lines:])


def compare_reports(previous: ErrorReport, current: ErrorReport) -> dict[str, int]:
    """Diff two error reports.

    Provides the Classifier Agent with a deterministic view of what changed
    between ``Error_{i-1}`` and ``Error_i``, alongside the raw logs it reasons
    over.
    """
    previous_signatures = previous.signatures
    current_signatures = current.signatures
    return {
        "previous_count": len(previous),
        "current_count": len(current),
        "resolved": len(previous_signatures - current_signatures),
        "introduced": len(current_signatures - previous_signatures),
        "persisted": len(previous_signatures & current_signatures),
        "delta": len(current) - len(previous),
    }
