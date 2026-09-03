"""Isolated project sandboxes.

Phase 1 of the workflow (Section 3.2) requires each target project to be copied
into a clean, isolated working directory, with the human-written tests purged
from ``src/test/java`` so that the reported metrics reflect only LLM-generated
code. Isolation also guarantees that a failed generation for one
<class, model, strategy> tuple cannot contaminate the next.
"""

from __future__ import annotations

import logging
import shutil
import tempfile
from dataclasses import dataclass, field
from pathlib import Path

from ..java.project import ProjectLayout, detect_layout, list_test_files

logger = logging.getLogger(__name__)

#: Never copied into a sandbox: VCS history and previous build output would make
#: the copy enormous and can carry stale ``.class`` files into the evaluation.
_EXCLUDED = shutil.ignore_patterns(
    ".git", ".svn", ".hg", "target", "build", "out", "bin", ".gradle", ".idea",
    "node_modules", "*.class", "*.jar.tmp", ".DS_Store",
)


class SandboxError(RuntimeError):
    """Raised when a sandbox cannot be created or prepared."""


@dataclass(slots=True)
class Sandbox:
    """An isolated working copy of a target project."""

    path: Path
    origin: Path
    layout: ProjectLayout
    #: Test files removed during preparation, kept for the RQ4 human baseline.
    purged_tests: list[Path] = field(default_factory=list)
    #: Test file currently installed by the framework, if any.
    installed_test: Path | None = None
    _temporary: bool = False

    @property
    def test_root(self) -> Path:
        return self.layout.primary_test_root

    def install_test(
        self,
        java_code: str,
        *,
        package: str | None,
        class_name: str,
    ) -> Path:
        """Write a generated test class into the sandbox's test source root.

        The file is placed in the directory matching its declared package, which
        is what ``javac`` requires; a mismatch is the single most common cause of
        spurious compilation failures.
        """
        target_dir = self.test_root
        if package:
            target_dir = target_dir.joinpath(*package.split("."))
        target_dir.mkdir(parents=True, exist_ok=True)
        target = target_dir / f"{class_name}.java"
        target.write_text(java_code, encoding="utf-8")
        self.installed_test = target
        return target

    def remove_installed_test(self) -> None:
        """Delete the currently installed test file, if present."""
        if self.installed_test and self.installed_test.is_file():
            self.installed_test.unlink()
        self.installed_test = None

    def cleanup(self) -> None:
        """Delete the sandbox directory when it was created as temporary."""
        if self._temporary and self.path.exists():
            shutil.rmtree(self.path, ignore_errors=True)

    def __enter__(self) -> Sandbox:
        return self

    def __exit__(self, *exc_info: object) -> None:
        self.cleanup()


def create_sandbox(
    project_root: str | Path,
    *,
    workdir: str | Path | None = None,
    name: str | None = None,
    purge_existing_tests: bool = True,
    reuse: bool = False,
) -> Sandbox:
    """Create an isolated copy of ``project_root``.

    Args:
        project_root: The project to copy.
        workdir: Parent directory for the sandbox; a temporary directory is used
            when omitted.
        name: Sandbox directory name; defaults to the project directory name.
        purge_existing_tests: Remove human-written tests from the test source
            roots (Phase 1 of the workflow).
        reuse: Reuse an existing sandbox directory instead of recreating it,
            matching ``execution.allow_reuse_project_sandboxes``.

    Raises:
        SandboxError: If the source project does not exist or the copy fails.
    """
    origin = Path(project_root).resolve()
    if not origin.is_dir():
        raise SandboxError(f"project directory not found: {origin}")

    temporary = workdir is None
    parent = Path(workdir) if workdir else Path(tempfile.mkdtemp(prefix="benjitest-"))
    parent.mkdir(parents=True, exist_ok=True)
    destination = parent / (name or origin.name)

    if destination.exists():
        if reuse:
            logger.debug("reusing existing sandbox at %s", destination)
        else:
            shutil.rmtree(destination, ignore_errors=True)
    if not destination.exists():
        try:
            shutil.copytree(origin, destination, ignore=_EXCLUDED, symlinks=True)
        except (OSError, shutil.Error) as exc:
            raise SandboxError(f"failed to copy {origin} into {destination}: {exc}") from exc

    layout = detect_layout(destination)
    sandbox = Sandbox(path=destination, origin=origin, layout=layout, _temporary=temporary)

    if purge_existing_tests:
        sandbox.purged_tests = purge_tests(sandbox)

    # A test source root must exist for generated tests to be compiled.
    sandbox.test_root.mkdir(parents=True, exist_ok=True)
    return sandbox


def purge_tests(sandbox: Sandbox) -> list[Path]:
    """Remove human-written test sources from the sandbox.

    Returns the list of removed paths (relative to the sandbox) so the RQ4
    human-baseline comparison can still locate the original files in ``origin``.
    """
    removed: list[Path] = []
    for test_file in list_test_files(sandbox.path, layout=sandbox.layout):
        try:
            relative = test_file.relative_to(sandbox.path)
        except ValueError:
            relative = test_file
        try:
            test_file.unlink()
        except OSError as exc:
            logger.debug("could not remove %s: %s", test_file, exc)
            continue
        removed.append(relative)

    # Drop the now-empty package directories so build tools do not warn.
    for test_root in sandbox.layout.test_source_roots:
        _prune_empty_dirs(test_root, stop_at=test_root)
    logger.debug("purged %d human-written test file(s) from %s", len(removed), sandbox.path)
    return removed


def _prune_empty_dirs(directory: Path, *, stop_at: Path) -> None:
    if not directory.is_dir():
        return
    for child in list(directory.iterdir()):
        if child.is_dir():
            _prune_empty_dirs(child, stop_at=stop_at)
    if directory != stop_at and not any(directory.iterdir()):
        directory.rmdir()


def read_original_test(sandbox: Sandbox, relative_path: Path) -> str | None:
    """Read a purged test file from the pristine origin project.

    Used by the RQ4 comparison, which needs the human-written suite that Phase 1
    deliberately removed from the sandbox.
    """
    candidate = sandbox.origin / relative_path
    if not candidate.is_file():
        return None
    try:
        return candidate.read_text(encoding="utf-8", errors="replace")
    except OSError:
        return None
