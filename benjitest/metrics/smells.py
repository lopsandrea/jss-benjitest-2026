"""Test-smell detection (Section 4.5, Appendix D).

The authoritative detector used in the reported campaign is **tsDetect**
(Peruma et al., 2020), configured for its complete suite of 19 smells. It is
invoked here whenever its JAR is available.

A built-in detector implements the same 19 rules directly on the parsed test
class, so the framework remains usable without an external JAR. Its counts are
close to tsDetect's but not identical, and every result records which detector
produced it (``SmellMetrics.detector``) so the two are never conflated in an
analysis.

Counting semantics follow the reported tables: a smell's value is the number of
**test methods** exhibiting it (class-level smells count 0 or 1), which is what
makes an average such as ``AR = 2.18`` per test class meaningful.
"""

from __future__ import annotations

import csv

from ..util.csvio import rows as _csvrows
import logging
import os
import re
import shutil
import subprocess
import tempfile
from pathlib import Path

from ..java.model import JavaClass, JavaMethod
from ..java.parser import parse_class, strip_comments
from .model import TEST_SMELLS, SmellMetrics

logger = logging.getLogger(__name__)

_ASSERTION_RE = re.compile(
    r"\b(assert\w*|verify|expect(?:ed)?|should\w*|fail)\s*\(", re.IGNORECASE
)
_ASSERT_CALL_RE = re.compile(r"\b(assert\w+|verify|fail)\s*\(")
_TEST_ANNOTATION_RE = re.compile(r"@(Test|ParameterizedTest|RepeatedTest|TestFactory)\b")
_IGNORED_RE = re.compile(r"@(Ignore|Disabled)\b")
_PRINT_RE = re.compile(r"\bSystem\s*\.\s*(out|err)\s*\.\s*print")
_SLEEP_RE = re.compile(r"\b(Thread\s*\.\s*sleep|TimeUnit\.\w+\.sleep)\s*\(")
_TOSTRING_ASSERT_RE = re.compile(r"\bassert\w*\s*\([^;]*\.toString\s*\(\s*\)")
_MYSTERY_GUEST_RE = re.compile(
    r"\b(new\s+File|FileInputStream|FileOutputStream|FileReader|FileWriter|"
    r"Files\s*\.\s*(read|write|newInput|newOutput)|getResourceAsStream|"
    r"DriverManager\s*\.\s*getConnection|new\s+URL|Paths\s*\.\s*get)\b"
)
_FILE_USAGE_RE = re.compile(r"\b(new\s+File\s*\(|Paths\s*\.\s*get\s*\(|Files\s*\.)")
_FILE_CHECK_RE = re.compile(r"\.\s*(exists|isFile|isDirectory|canRead|canWrite|notExists)\s*\(")
_CONDITIONAL_RE = re.compile(r"\b(if|for|while|switch)\s*\(|\bdo\s*\{|\?\s*[^:;]+\s*:")
_TRY_CATCH_RE = re.compile(r"\btry\s*\{|\bcatch\s*\(")
_NUMERIC_LITERAL_RE = re.compile(r"(?<![\w.\"'])-?\d+(?:\.\d+)?[fFdDlL]?(?![\w.])")
_TAUTOLOGY_RE = re.compile(
    r"\bassert(True\s*\(\s*true|False\s*\(\s*false|Null\s*\(\s*null|"
    r"NotNull\s*\(\s*(?:new\s+\w+|\"))",
)
_DEFAULT_TEST_NAMES = frozenset({"ExampleUnitTest", "ExampleInstrumentedTest"})
_SETUP_ANNOTATION_RE = re.compile(r"@(Before|BeforeEach|BeforeAll)\b")

#: Numbers whose literal use carries no magic; excluding them avoids flagging
#: every boundary test as a Magic Number Test.
_BENIGN_NUMBERS = frozenset({"0", "1", "-1", "2", "0.0", "1.0"})


# ----------------------------------------------------------------------
# tsDetect
# ----------------------------------------------------------------------
def resolve_tsdetect_jar(configured: str | Path | None = None) -> Path | None:
    """Locate the tsDetect JAR from configuration, ``$TSDETECT_JAR``, or PATH."""
    for candidate in (configured, os.environ.get("TSDETECT_JAR")):
        if candidate:
            path = Path(candidate).expanduser()
            if path.is_file():
                return path
    located = shutil.which("TestSmellDetector.jar")
    return Path(located) if located else None


def detect_with_tsdetect(
    test_file: str | Path,
    production_file: str | Path | None,
    jar_path: str | Path,
    *,
    app_name: str = "benjitest",
    timeout: int = 300,
) -> SmellMetrics | None:
    """Run tsDetect over one test/production file pair.

    tsDetect takes a CSV manifest of ``appName,testFilePath,productionFilePath``
    triples and writes a result CSV with one boolean column per smell.

    Returns ``None`` when the tool could not be run, so the caller can fall back
    to the built-in detector.
    """
    jar = Path(jar_path)
    if not jar.is_file():
        return None
    if shutil.which("java") is None:
        logger.debug("java is not on PATH; cannot run tsDetect")
        return None

    with tempfile.TemporaryDirectory(prefix="benjitest-tsdetect-") as tmp:
        workdir = Path(tmp)
        manifest = workdir / "input.csv"
        with manifest.open("w", encoding="utf-8", newline="") as handle:
            csv.writer(handle).writerow(
                [app_name, str(Path(test_file).resolve()), str(Path(production_file).resolve()) if production_file else ""]
            )

        try:
            subprocess.run(
                ["java", "-jar", str(jar), str(manifest)],
                cwd=workdir,
                capture_output=True,
                text=True,
                timeout=timeout,
                check=False,
            )
        except (OSError, subprocess.SubprocessError) as exc:
            logger.debug("tsDetect invocation failed: %s", exc)
            return None

        outputs = sorted(workdir.glob("Output_TestSmellDetection*.csv"))
        if not outputs:
            logger.debug("tsDetect produced no output CSV")
            return None
        return _parse_tsdetect_output(outputs[-1])


def _parse_tsdetect_output(path: Path) -> SmellMetrics | None:
    """Map tsDetect's per-smell columns onto the acronyms of Table 3."""
    try:
        with path.open(encoding="utf-8", newline="") as handle:
            rows = list(_csvrows(handle))
    except OSError:
        return None
    if not rows:
        return None

    row = rows[0]
    normalized = {_normalize_column(k): v for k, v in row.items() if k}
    counts: dict[str, int] = {}
    for acronym, name in TEST_SMELLS.items():
        raw = normalized.get(_normalize_column(name))
        counts[acronym] = _to_count(raw)
    return SmellMetrics(counts=counts, detector="tsdetect", available=True)


def _normalize_column(name: str) -> str:
    return re.sub(r"[^a-z]", "", (name or "").lower())


def _to_count(raw: object) -> int:
    """Interpret a tsDetect cell, which may be a boolean or a count."""
    if raw is None:
        return 0
    text = str(raw).strip().lower()
    if text in {"true", "yes"}:
        return 1
    if text in {"false", "no", ""}:
        return 0
    try:
        return max(0, int(float(text)))
    except ValueError:
        return 0


# ----------------------------------------------------------------------
# Built-in detector
# ----------------------------------------------------------------------
def detect_builtin(test_source: str, *, production_class: JavaClass | None = None) -> SmellMetrics:
    """Detect the 19 catalogued smells directly on the test source.

    Args:
        test_source: Source of the generated test class.
        production_class: The class under test, needed by Eager Test and Lazy
            Test which reason about calls into the production API.
    """
    counts = {acronym: 0 for acronym in TEST_SMELLS}
    try:
        test_class = parse_class(test_source, source_path="<generated test>")
    except Exception:  # noqa: BLE001 - unparseable test yields no smell data
        logger.debug("built-in smell detector could not parse the test class")
        return SmellMetrics(counts=counts, detector="builtin", available=False)

    test_methods = [m for m in test_class.methods if _is_test_method(m)]
    production_methods = (
        {m.name for m in production_class.methods} if production_class else set()
    )

    # --- class-level smells -------------------------------------------
    if test_class.constructors:
        counts["CI"] = 1
    if test_class.name in _DEFAULT_TEST_NAMES:
        counts["DT"] = 1
    counts["GF"] = _general_fixture(test_class, test_methods)

    # --- method-level smells ------------------------------------------
    production_call_targets: dict[str, list[str]] = {}

    for method in test_methods:
        body = strip_comments(method.body or "")
        annotations = " ".join(method.annotations)
        assertions = _ASSERT_CALL_RE.findall(body)

        if _IGNORED_RE.search(annotations) or _IGNORED_RE.search(body):
            counts["IT"] += 1

        if _is_empty_body(body):
            counts["EM"] += 1
            # An empty test cannot exhibit any behavioural smell.
            continue

        if not assertions:
            counts["UT"] += 1

        if len(assertions) > 1 and not _assertions_have_messages(body):
            counts["AR"] += 1

        if _has_duplicate_assertions(body):
            counts["DA"] += 1

        if _CONDITIONAL_RE.search(body):
            counts["CTL"] += 1

        # assertThrows is the sanctioned way to test exceptions; a bare try/catch
        # used to pass or fail the test is the smell.
        if (_TRY_CATCH_RE.search(body) or method.throws) and "assertThrows" not in body:
            counts["EH"] += 1

        if _MYSTERY_GUEST_RE.search(body):
            counts["MG"] += 1

        if _FILE_USAGE_RE.search(body) and not _FILE_CHECK_RE.search(body):
            counts["RO"] += 1

        if _PRINT_RE.search(body):
            counts["RP"] += 1

        if _TAUTOLOGY_RE.search(body):
            counts["RA"] += 1

        if _SLEEP_RE.search(body):
            counts["ST"] += 1

        if _TOSTRING_ASSERT_RE.search(body):
            counts["SE"] += 1

        if _has_magic_number(body):
            counts["MNT"] += 1

        called = _called_production_methods(body, production_methods)
        if len(called) > 1:
            counts["EA"] += 1
        for target in called:
            production_call_targets.setdefault(target, []).append(method.name)

    # Lazy Test: several test methods exercising the same production method.
    counts["LT"] = sum(1 for callers in production_call_targets.values() if len(callers) > 1)

    return SmellMetrics(counts=counts, detector="builtin", available=True)


def _is_test_method(method: JavaMethod) -> bool:
    annotations = " ".join(method.annotations)
    if _TEST_ANNOTATION_RE.search(annotations):
        return True
    # JUnit 3 convention, still present in older projects.
    return method.name.startswith("test") and not method.parameters


def _is_empty_body(body: str) -> bool:
    inner = body[body.find("{") + 1 : body.rfind("}")] if "{" in body else ""
    return not inner.strip()


def _assertions_have_messages(body: str) -> bool:
    """Whether every assertion carries an explanatory message.

    Assertion Roulette is about being unable to tell *which* assertion failed;
    a message on each assertion removes the smell.
    """
    calls = _extract_calls(body, _ASSERT_CALL_RE)
    return all(
        any(_looks_like_message(argument) for argument in arguments)
        for _, arguments in calls
    )


def _looks_like_message(argument: str) -> bool:
    stripped = argument.strip()
    return stripped.startswith('"') or stripped.startswith("String.format")


def _has_duplicate_assertions(body: str) -> bool:
    calls = _extract_calls(body, _ASSERT_CALL_RE)
    seen: set[str] = set()
    for name, arguments in calls:
        key = f"{name}({','.join(a.strip() for a in arguments)})"
        if key in seen:
            return True
        seen.add(key)
    return False


def _has_magic_number(body: str) -> bool:
    """A numeric literal used directly as an assertion argument."""
    for name, arguments in _extract_calls(body, _ASSERT_CALL_RE):
        if not name.lower().startswith("assert"):
            continue
        for argument in arguments:
            stripped = argument.strip()
            if stripped in _BENIGN_NUMBERS:
                continue
            if _NUMERIC_LITERAL_RE.fullmatch(stripped):
                return True
    return False


def _called_production_methods(body: str, production_methods: set[str]) -> set[str]:
    """Names of production-class methods invoked in a test body."""
    if not production_methods:
        return set()
    called = set()
    for match in re.finditer(r"\.\s*(\w+)\s*\(", body):
        name = match.group(1)
        if name in production_methods:
            called.add(name)
    return called


def _general_fixture(test_class: JavaClass, test_methods: list[JavaMethod]) -> int:
    """Fields initialised in setup but unused by at least one test method."""
    setup = next(
        (
            m
            for m in test_class.methods
            if _SETUP_ANNOTATION_RE.search(" ".join(m.annotations))
        ),
        None,
    )
    if setup is None or not test_methods:
        return 0

    setup_body = strip_comments(setup.body or "")
    initialised = {
        match.group(1)
        for match in re.finditer(r"\b(?:this\s*\.\s*)?(\w+)\s*=", setup_body)
    }
    initialised &= {field.name for field in test_class.fields}
    if not initialised:
        return 0

    for field_name in initialised:
        pattern = re.compile(rf"\b{re.escape(field_name)}\b")
        if not all(pattern.search(strip_comments(m.body or "")) for m in test_methods):
            return 1
    return 0


def _extract_calls(body: str, pattern: re.Pattern[str]) -> list[tuple[str, list[str]]]:
    """Return ``(name, arguments)`` for each call matching ``pattern``.

    Arguments are split at top-level commas so that nested calls and generics do
    not fragment a single argument.
    """
    calls: list[tuple[str, list[str]]] = []
    for match in pattern.finditer(body):
        name = match.group(1)
        start = match.end()
        depth = 1
        index = start
        in_string = False
        escaped = False
        while index < len(body) and depth > 0:
            char = body[index]
            if in_string:
                if escaped:
                    escaped = False
                elif char == "\\":
                    escaped = True
                elif char == '"':
                    in_string = False
            elif char == '"':
                in_string = True
            elif char in "([{":
                depth += 1
            elif char in ")]}":
                depth -= 1
            index += 1
        calls.append((name, _split_arguments(body[start : index - 1])))
    return calls


def _split_arguments(text: str) -> list[str]:
    arguments: list[str] = []
    depth = 0
    current: list[str] = []
    in_string = False
    escaped = False
    for char in text:
        if in_string:
            current.append(char)
            if escaped:
                escaped = False
            elif char == "\\":
                escaped = True
            elif char == '"':
                in_string = False
            continue
        if char == '"':
            in_string = True
            current.append(char)
            continue
        if char in "([{":
            depth += 1
        elif char in ")]}":
            depth -= 1
        if char == "," and depth == 0:
            arguments.append("".join(current))
            current = []
        else:
            current.append(char)
    if current:
        arguments.append("".join(current))
    return [a for a in arguments if a.strip()]


# ----------------------------------------------------------------------
def collect(
    test_source: str,
    *,
    test_file: str | Path | None = None,
    production_file: str | Path | None = None,
    production_class: JavaClass | None = None,
    tsdetect_jar: str | Path | None = None,
) -> SmellMetrics:
    """Detect test smells, preferring tsDetect and falling back to the built-in rules."""
    jar = resolve_tsdetect_jar(tsdetect_jar)
    if jar is not None and test_file is not None:
        metrics = detect_with_tsdetect(test_file, production_file, jar)
        if metrics is not None:
            return metrics
        logger.debug("tsDetect produced no result; falling back to the built-in detector")
    return detect_builtin(test_source, production_class=production_class)
