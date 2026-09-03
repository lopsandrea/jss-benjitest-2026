"""Build System Integration Module (Section 3.1, module 3).

Compiles generated test code, executes it, and captures build/test results. The
feedback produced here is what powers the Test Correction Crew: without a precise
notion of "did this produce a valid ``.class`` file?", neither the compilation
rate nor the correction loop would be well defined.

Per Section 4.5, a test class counts as *compilable* when it yields a valid
``.class`` file, irrespective of whether its test cases pass at execution time.
"""

from __future__ import annotations

import logging
import os
import re
import shutil
import subprocess
import time
from dataclasses import dataclass, field
from enum import Enum
from pathlib import Path

from ..config.schema import BuildConfig
from ..java.project import BuildMetadata, detect_build_metadata, normalize_java_version
from .errors import ErrorReport, parse_build_log
from .sandbox import Sandbox

logger = logging.getLogger(__name__)

_SUREFIRE_SUMMARY_RE = re.compile(
    r"Tests run:\s*(\d+),\s*Failures:\s*(\d+),\s*Errors:\s*(\d+),\s*Skipped:\s*(\d+)"
)
_COMPILE_FAILURE_MARKERS = (
    "COMPILATION ERROR",
    "BUILD FAILURE",
    "compileTestJava FAILED",
    "Compilation failed",
    "error: cannot find symbol",
)


class BuildStatus(str, Enum):
    """Outcome of a build/test invocation."""

    #: Compiled and every test passed.
    SUCCESS = "success"
    #: Compiled but at least one test failed or errored at runtime.
    TESTS_FAILED = "tests_failed"
    #: No valid ``.class`` file was produced.
    COMPILE_ERROR = "compile_error"
    #: The invocation exceeded ``build.timeout_seconds``.
    TIMEOUT = "timeout"
    #: Infrastructure failure (build tool missing, sandbox unusable, ...).
    ERROR = "error"


@dataclass(slots=True)
class BuildResult:
    """Structured result of one build/test invocation."""

    status: BuildStatus
    compiled: bool = False
    tests_passed: bool = False
    tests_run: int = 0
    failures: int = 0
    errors_count: int = 0
    skipped: int = 0
    log: str = ""
    command: list[str] = field(default_factory=list)
    duration_seconds: float = 0.0
    report: ErrorReport = field(default_factory=ErrorReport)
    test_class_file: Path | None = None

    @property
    def failed(self) -> bool:
        """Whether the correction loop should be triggered (Algorithm 1)."""
        return self.status is not BuildStatus.SUCCESS

    @property
    def error(self) -> str:
        """Raw error text handed to the Error Interpreter and the Classifier."""
        if self.report.errors:
            return self.report.summary()
        return _tail(self.log, 80)

    @property
    def phase(self) -> str:
        return "build" if not self.compiled else "test"


class BuildSystemError(RuntimeError):
    """Raised when no usable build tool can be located."""


class BuildSystem:
    """Drives Maven or Gradle over a sandbox.

    Args:
        config: Build settings from the experiment YAML.
        metadata: Pre-computed build metadata; detected on demand when omitted.
    """

    def __init__(self, config: BuildConfig | None = None, *, metadata: BuildMetadata | None = None):
        self.config = config or BuildConfig()
        self.metadata = metadata

    # ------------------------------------------------------------------
    # Tool resolution
    # ------------------------------------------------------------------
    def resolve_metadata(self, project_root: Path) -> BuildMetadata:
        if self.metadata is None:
            self.metadata = detect_build_metadata(project_root)
        return self.metadata

    def _tool(self, project_root: Path) -> str:
        if self.config.force_tool:
            return self.config.force_tool.value
        return self.resolve_metadata(project_root).tool

    def _executable(self, project_root: Path, tool: str) -> list[str]:
        """Return the command prefix, preferring the project's own wrapper.

        A wrapper pins the exact build-tool version the project expects, which is
        precisely the "isolating the evaluation from local OS differences"
        requirement of the Repository Manager (Appendix B).
        """
        if self.config.prefer_wrapper:
            wrapper = "mvnw" if tool == "maven" else "gradlew"
            candidate = project_root / (wrapper if os.name != "nt" else f"{wrapper}.cmd")
            if candidate.is_file():
                if os.name != "nt":
                    candidate.chmod(candidate.stat().st_mode | 0o111)
                return [str(candidate)]

        binary = shutil.which("mvn" if tool == "maven" else "gradle")
        if binary is None:
            raise BuildSystemError(
                f"neither a {tool} wrapper nor a '{tool}' binary is available on PATH"
            )
        return [binary]

    def _env(self, project_root: Path) -> dict[str, str]:
        """Environment for the build, honouring the project's required JDK."""
        env = dict(os.environ)
        env.setdefault("MAVEN_OPTS", "-Xmx2g")
        # Batch mode everywhere: interactive prompts would hang the campaign.
        env.setdefault("GRADLE_OPTS", "-Dorg.gradle.daemon=false -Xmx2g")

        metadata = self.resolve_metadata(project_root)
        major = normalize_java_version(metadata.java_version)
        if major:
            java_home = _find_java_home(major)
            if java_home:
                env["JAVA_HOME"] = str(java_home)
            else:
                logger.debug(
                    "project requests Java %s but no matching JDK was found; using default",
                    major,
                )
        return env

    # ------------------------------------------------------------------
    # Invocations
    # ------------------------------------------------------------------
    def validate(self, project_root: str | Path) -> BuildResult:
        """Verify the project compiles in its original state.

        Run by the Repository Manager before any generation: a project that does
        not build untouched cannot yield an interpretable compilation rate.
        """
        root = Path(project_root)
        if self.config.skip_initial_validation:
            return BuildResult(status=BuildStatus.SUCCESS, compiled=True, tests_passed=True)

        tool = self._tool(root)
        if tool == "maven":
            args = ["-B", "-q", "compile", "-DskipTests"]
        else:
            args = ["--no-daemon", "-q", "compileJava"]
        return self._invoke(root, args, expect_tests=False)

    def compile_tests(self, sandbox: Sandbox) -> BuildResult:
        """Compile the sandbox's test sources without executing them."""
        tool = self._tool(sandbox.path)
        if tool == "maven":
            args = ["-B", "test-compile", "-DskipTests"]
        else:
            args = ["--no-daemon", "compileTestJava"]
        return self._invoke(sandbox.path, args, expect_tests=False, sandbox=sandbox)

    def compile_and_run(
        self,
        sandbox: Sandbox,
        test_class: str,
        *,
        with_coverage: bool = False,
    ) -> BuildResult:
        """Compile and execute a single generated test class.

        This is ``BuildSystem.compileAndRun`` from Algorithm 1. ``test_class`` is
        the fully-qualified name of the generated test.

        Args:
            with_coverage: Also produce a JaCoCo XML report in the same run,
                avoiding a second full test execution.
        """
        tool = self._tool(sandbox.path)
        if tool == "maven":
            args = [
                "-B",
                "test",
                f"-Dtest={test_class}",
                "-DfailIfNoTests=false",
                "-Dsurefire.failIfNoSpecifiedTests=false",
                # Failures are a measured outcome, not a reason to abort.
                "-Dmaven.test.failure.ignore=true",
            ]
            if with_coverage:
                args.append("jacoco:report")
        else:
            args = ["--no-daemon", "test", "--tests", test_class, "--continue"]
            if with_coverage:
                args.append("jacocoTestReport")

        return self._invoke(sandbox.path, args, expect_tests=True, sandbox=sandbox)

    def run_command(self, project_root: str | Path, args: list[str]) -> BuildResult:
        """Run an arbitrary build-tool invocation (used by the metric collectors)."""
        return self._invoke(Path(project_root), args, expect_tests=False)

    # ------------------------------------------------------------------
    def _invoke(
        self,
        project_root: Path,
        args: list[str],
        *,
        expect_tests: bool,
        sandbox: Sandbox | None = None,
    ) -> BuildResult:
        try:
            command = self._executable(project_root, self._tool(project_root)) + args
        except BuildSystemError as exc:
            return BuildResult(status=BuildStatus.ERROR, log=str(exc))
        command += self.config.extra_args

        started = time.monotonic()
        try:
            completed = subprocess.run(
                command,
                cwd=project_root,
                capture_output=True,
                text=True,
                errors="replace",
                timeout=self.config.timeout_seconds,
                env=self._env(project_root),
                check=False,
            )
            log = (completed.stdout or "") + "\n" + (completed.stderr or "")
            returncode = completed.returncode
            timed_out = False
        except subprocess.TimeoutExpired as exc:
            log = _decode(exc.stdout) + "\n" + _decode(exc.stderr)
            returncode = -1
            timed_out = True
        except OSError as exc:
            return BuildResult(
                status=BuildStatus.ERROR,
                log=f"failed to launch build: {exc}",
                command=command,
                duration_seconds=time.monotonic() - started,
            )

        duration = time.monotonic() - started

        if timed_out:
            result = BuildResult(
                status=BuildStatus.TIMEOUT,
                log=log,
                command=command,
                duration_seconds=duration,
            )
            result.report = parse_build_log(log, compiled=False)
            return result

        class_file = self._locate_test_class_file(sandbox) if sandbox else None
        compiled = self._determine_compiled(log, returncode, class_file, expect_tests)
        tests_run, failures, errors_count, skipped = _parse_test_counts(log)

        if not compiled:
            status = BuildStatus.COMPILE_ERROR
            tests_passed = False
        elif expect_tests and (failures or errors_count):
            status = BuildStatus.TESTS_FAILED
            tests_passed = False
        elif returncode != 0 and not expect_tests:
            status = BuildStatus.COMPILE_ERROR
            tests_passed = False
            compiled = False
        else:
            status = BuildStatus.SUCCESS
            tests_passed = True

        result = BuildResult(
            status=status,
            compiled=compiled,
            tests_passed=tests_passed,
            tests_run=tests_run,
            failures=failures,
            errors_count=errors_count,
            skipped=skipped,
            log=log,
            command=command,
            duration_seconds=duration,
            test_class_file=class_file,
        )
        if result.failed:
            result.report = parse_build_log(log, compiled=compiled)
        return result

    @staticmethod
    def _determine_compiled(
        log: str,
        returncode: int,
        class_file: Path | None,
        expect_tests: bool,
    ) -> bool:
        """Decide whether a valid ``.class`` file was produced.

        The compiled ``.class`` file on disk is the authoritative signal, since it
        is exactly the criterion stated in Section 4.5. The log is only consulted
        when the artifact cannot be located (e.g. a non-standard output directory).
        """
        if class_file is not None:
            return True
        if any(marker in log for marker in _COMPILE_FAILURE_MARKERS):
            return False
        if expect_tests and _SUREFIRE_SUMMARY_RE.search(log):
            # Tests ran, therefore the test sources compiled.
            return True
        return returncode == 0

    @staticmethod
    def _locate_test_class_file(sandbox: Sandbox) -> Path | None:
        """Find the ``.class`` file produced for the installed test source."""
        if sandbox.installed_test is None:
            return None
        stem = sandbox.installed_test.stem
        for output_dir in (
            sandbox.path / "target" / "test-classes",
            sandbox.path / "build" / "classes" / "java" / "test",
        ):
            if not output_dir.is_dir():
                continue
            matches = list(output_dir.rglob(f"{stem}.class"))
            if matches:
                return matches[0]
        return None


def _parse_test_counts(log: str) -> tuple[int, int, int, int]:
    """Aggregate the Surefire ``Tests run:`` summaries appearing in a log."""
    totals = [0, 0, 0, 0]
    matches = _SUREFIRE_SUMMARY_RE.findall(log or "")
    if not matches:
        return 0, 0, 0, 0
    # The final line is Maven's grand total; per-class lines precede it. Taking
    # the maximum per column avoids double counting either way.
    for match in matches:
        for index, value in enumerate(match):
            totals[index] = max(totals[index], int(value))
    return totals[0], totals[1], totals[2], totals[3]


def _find_java_home(major: int) -> Path | None:
    """Locate an installed JDK matching ``major``.

    Checks ``JAVA_HOME_<major>`` (the convention used by CI images), then the
    macOS ``java_home`` helper, then common Linux install roots.
    """
    explicit = os.environ.get(f"JAVA_HOME_{major}")
    if explicit and Path(explicit).is_dir():
        return Path(explicit)

    helper = Path("/usr/libexec/java_home")
    if helper.is_file():
        try:
            completed = subprocess.run(
                [str(helper), "-v", str(major)],
                capture_output=True,
                text=True,
                timeout=15,
                check=False,
            )
        except (OSError, subprocess.SubprocessError):
            completed = None
        if completed and completed.returncode == 0:
            path = Path(completed.stdout.strip())
            if path.is_dir():
                return path

    for base in (Path("/usr/lib/jvm"), Path("/opt/java")):
        if not base.is_dir():
            continue
        for candidate in sorted(base.iterdir()):
            if re.search(rf"(?<!\d){major}(?!\d)", candidate.name) and candidate.is_dir():
                return candidate
    return None


def _decode(value: object) -> str:
    if value is None:
        return ""
    if isinstance(value, bytes):
        return value.decode("utf-8", errors="replace")
    return str(value)


def _tail(text: str, lines: int) -> str:
    return "\n".join((text or "").splitlines()[-lines:])
