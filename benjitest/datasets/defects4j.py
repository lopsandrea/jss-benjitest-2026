"""Defects4J external validation (RQ5, Section 5.5).

Implements the differential fault-detection protocol stated in Section 5.5. A bug
counts as **detected** if and only if the generated suite:

1. compiles successfully against the **buggy** version of the project,
2. has at least one test method that **fails** on the buggy version, and
3. **passes** in its entirety when executed against the corresponding **fixed**
   version.

Condition 3 is what makes the result meaningful: without it, a test that fails
for an unrelated reason -- a wrong expected value the model invented -- would be
credited as having found the documented bug.
"""

from __future__ import annotations

import logging
import os
import shutil
import subprocess
from collections.abc import Iterator
from dataclasses import dataclass, field
from pathlib import Path

from ..build.integration import BuildResult, BuildStatus, BuildSystem
from ..build.sandbox import Sandbox, create_sandbox
from .base import Dataset, TargetClass

logger = logging.getLogger(__name__)

#: The 17 projects of Defects4J v3.0.1 used in the reported campaign.
DEFECTS4J_PROJECTS = (
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time",
)


class Defects4JError(RuntimeError):
    """Raised when the Defects4J CLI is unavailable or a command fails."""


@dataclass(slots=True)
class Bug:
    """One Defects4J bug."""

    project: str
    bug_id: int
    #: Classes modified by the bug-fixing patch: the natural targets to test.
    modified_classes: list[str] = field(default_factory=list)
    #: Tests that fail on the buggy version, per the Defects4J metadata.
    trigger_tests: list[str] = field(default_factory=list)

    @property
    def key(self) -> str:
        return f"{self.project}-{self.bug_id}"


@dataclass(slots=True)
class FaultDetectionOutcome:
    """Result of applying the differential protocol to one bug."""

    bug: Bug
    target_class: str
    compiled_on_buggy: bool = False
    failed_on_buggy: bool = False
    passed_on_fixed: bool = False
    #: Names of the test methods that failed on the buggy version.
    failing_tests: list[str] = field(default_factory=list)
    note: str = ""

    @property
    def detected(self) -> bool:
        """The conjunction of the three conditions of Section 5.5."""
        return self.compiled_on_buggy and self.failed_on_buggy and self.passed_on_fixed


def defects4j_executable(home: str | Path | None = None) -> Path:
    """Locate the ``defects4j`` CLI."""
    if home:
        candidate = Path(home) / "framework" / "bin" / "defects4j"
        if candidate.is_file():
            return candidate
    env_home = os.environ.get("DEFECTS4J_HOME")
    if env_home:
        candidate = Path(env_home) / "framework" / "bin" / "defects4j"
        if candidate.is_file():
            return candidate
    located = shutil.which("defects4j")
    if located:
        return Path(located)
    raise Defects4JError(
        "the defects4j CLI was not found; set DEFECTS4J_HOME or add it to PATH"
    )


class Defects4JDataset(Dataset):
    """Checks out Defects4J bugs and exposes their modified classes as targets."""

    name = "Defects4J"

    def __init__(
        self,
        *,
        workdir: str | Path,
        projects: list[str] | None = None,
        home: str | Path | None = None,
        limit_per_project: int | None = None,
    ) -> None:
        self.workdir = Path(workdir)
        self.projects = list(projects or DEFECTS4J_PROJECTS)
        self.executable = defects4j_executable(home)
        self.limit_per_project = limit_per_project
        self.workdir.mkdir(parents=True, exist_ok=True)

    # ------------------------------------------------------------------
    def _run(self, args: list[str], cwd: Path | None = None, timeout: int = 1800) -> str:
        command = [str(self.executable), *args]
        try:
            completed = subprocess.run(
                command,
                cwd=cwd,
                capture_output=True,
                text=True,
                timeout=timeout,
                check=False,
            )
        except (OSError, subprocess.SubprocessError) as exc:
            raise Defects4JError(f"defects4j {' '.join(args)} failed: {exc}") from exc
        if completed.returncode != 0:
            raise Defects4JError(
                f"defects4j {' '.join(args)} exited {completed.returncode}: "
                f"{completed.stderr.strip()[:500]}"
            )
        return completed.stdout

    def active_bug_ids(self, project: str) -> list[int]:
        """Return the active bug ids of ``project``."""
        output = self._run(["bids", "-p", project], timeout=120)
        ids = [int(line.strip()) for line in output.splitlines() if line.strip().isdigit()]
        return ids[: self.limit_per_project] if self.limit_per_project else ids

    def iter_bugs(self) -> Iterator[Bug]:
        for project in self.projects:
            try:
                bug_ids = self.active_bug_ids(project)
            except Defects4JError as exc:
                logger.warning("could not list bugs for %s: %s", project, exc)
                continue
            for bug_id in bug_ids:
                yield Bug(project=project, bug_id=bug_id)

    # ------------------------------------------------------------------
    def checkout(self, bug: Bug, version: str) -> Path:
        """Check out the ``b`` (buggy) or ``f`` (fixed) version of a bug.

        Returns the working directory of the checkout.
        """
        if version not in {"b", "f"}:
            raise ValueError("version must be 'b' (buggy) or 'f' (fixed)")
        destination = self.workdir / f"{bug.key}{version}"
        if destination.is_dir() and any(destination.iterdir()):
            return destination
        destination.parent.mkdir(parents=True, exist_ok=True)
        self._run(
            [
                "checkout",
                "-p", bug.project,
                "-v", f"{bug.bug_id}{version}",
                "-w", str(destination),
            ]
        )
        return destination

    def modified_classes(self, bug: Bug, checkout_dir: Path) -> list[str]:
        """Classes touched by the bug-fixing patch."""
        if bug.modified_classes:
            return bug.modified_classes
        output = self._run(
            ["export", "-p", "classes.modified"], cwd=checkout_dir, timeout=300
        )
        bug.modified_classes = [line.strip() for line in output.splitlines() if line.strip()]
        return bug.modified_classes

    def trigger_tests(self, bug: Bug, checkout_dir: Path) -> list[str]:
        output = self._run(["export", "-p", "tests.trigger"], cwd=checkout_dir, timeout=300)
        bug.trigger_tests = [line.strip() for line in output.splitlines() if line.strip()]
        return bug.trigger_tests

    # ------------------------------------------------------------------
    def iter_projects(self) -> Iterator[tuple[str, Path]]:
        for bug in self.iter_bugs():
            try:
                yield bug.key, self.checkout(bug, "b")
            except Defects4JError as exc:
                logger.warning("checkout failed for %s: %s", bug.key, exc)

    def iter_targets(self) -> Iterator[TargetClass]:
        """Yield the modified class of each bug as the class under test."""
        for bug in self.iter_bugs():
            try:
                buggy = self.checkout(bug, "b")
                classes = self.modified_classes(bug, buggy)
            except Defects4JError as exc:
                logger.warning("skipping %s: %s", bug.key, exc)
                continue

            from ..java.project import find_class_file

            for qualified_name in classes:
                simple = qualified_name.rsplit(".", 1)[-1]
                package = qualified_name.rsplit(".", 1)[0] if "." in qualified_name else None
                source_path = find_class_file(buggy, simple, package=package)
                if source_path is None:
                    logger.debug("could not locate %s in %s", qualified_name, buggy)
                    continue
                yield TargetClass(
                    project_id=bug.key,
                    project_root=buggy,
                    source_path=source_path,
                    qualified_name=qualified_name,
                    metadata={"bug": bug, "defects4j_project": bug.project},
                )


# ----------------------------------------------------------------------
# Differential fault-detection protocol
# ----------------------------------------------------------------------
def evaluate_fault_detection(
    *,
    dataset: Defects4JDataset,
    bug: Bug,
    target_class: str,
    test_code: str,
    test_class_name: str,
    test_package: str | None,
    build_system: BuildSystem,
    workdir: str | Path | None = None,
) -> FaultDetectionOutcome:
    """Apply the three-condition detection protocol to one generated suite.

    The same suite is compiled and executed twice -- once against the buggy
    checkout and once against the fixed one -- and a detection is recorded only
    when it fails on the former and passes on the latter.
    """
    outcome = FaultDetectionOutcome(bug=bug, target_class=target_class)
    qualified_test = f"{test_package}.{test_class_name}" if test_package else test_class_name

    # --- condition 1 and 2: compile and fail on the buggy version ---------
    try:
        buggy_dir = dataset.checkout(bug, "b")
    except Defects4JError as exc:
        outcome.note = f"buggy checkout failed: {exc}"
        return outcome

    buggy_result, buggy_sandbox = _run_suite(
        buggy_dir, test_code, test_class_name, test_package, qualified_test,
        build_system, workdir, f"{bug.key}b",
    )
    outcome.compiled_on_buggy = buggy_result.compiled
    if not outcome.compiled_on_buggy:
        outcome.note = "suite did not compile against the buggy version"
        buggy_sandbox.cleanup()
        return outcome

    outcome.failed_on_buggy = buggy_result.status is BuildStatus.TESTS_FAILED
    outcome.failing_tests = [
        error.test_method for error in buggy_result.report.errors if error.test_method
    ]
    buggy_sandbox.cleanup()

    if not outcome.failed_on_buggy:
        outcome.note = "suite passed on the buggy version: the fault was not triggered"
        return outcome

    # --- condition 3: the same suite must pass on the fixed version -------
    try:
        fixed_dir = dataset.checkout(bug, "f")
    except Defects4JError as exc:
        outcome.note = f"fixed checkout failed: {exc}"
        return outcome

    fixed_result, fixed_sandbox = _run_suite(
        fixed_dir, test_code, test_class_name, test_package, qualified_test,
        build_system, workdir, f"{bug.key}f",
    )
    outcome.passed_on_fixed = fixed_result.status is BuildStatus.SUCCESS
    fixed_sandbox.cleanup()

    if not outcome.passed_on_fixed:
        outcome.note = (
            "suite also fails on the fixed version: the failure is not causally "
            "linked to the documented bug"
        )
    return outcome


def _run_suite(
    project_dir: Path,
    test_code: str,
    test_class_name: str,
    test_package: str | None,
    qualified_test: str,
    build_system: BuildSystem,
    workdir: str | Path | None,
    sandbox_name: str,
) -> tuple[BuildResult, Sandbox]:
    """Install and execute a generated suite against a Defects4J checkout."""
    sandbox = create_sandbox(
        project_dir,
        workdir=workdir,
        name=sandbox_name,
        # Defects4J's own tests must go: only the generated suite may run, or the
        # project's trigger tests would themselves satisfy condition 2.
        purge_existing_tests=True,
    )
    sandbox.install_test(test_code, package=test_package, class_name=test_class_name)
    result = build_system.compile_and_run(sandbox, qualified_test)
    return result, sandbox
