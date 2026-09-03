"""The Classes2Test dataset (Section 4.2).

147,473 test classes linked to their corresponding production classes across
9,410 unique repositories, introduced by Lops et al. (ICST 2025). The loader
supports two layouts:

*Directory layout* -- ``<source_root>/<repo_id>/`` holds a checked-out project;
classes under test are discovered by scanning its main source roots.

*Index layout* -- a JSON or CSV file enumerating the production/test class pairs
explicitly, which is faster on the full corpus and is what makes the
class-to-test mapping (needed for the RQ4 human baseline) available without
re-deriving it.
"""

from __future__ import annotations

import csv

from ..util.csvio import rows as _csvrows
import json
import logging
from collections.abc import Iterator
from fnmatch import fnmatch
from pathlib import Path

from ..config.schema import DatasetConfig
from ..java.parser import JavaParseError, parse_file
from ..java.project import detect_layout, list_main_classes
from .base import Dataset, TargetClass

logger = logging.getLogger(__name__)


class Classes2TestDataset(Dataset):
    """Loader for the Classes2Test corpus.

    Args:
        config: Dataset section of the experiment configuration.
        skip_untestable: Skip interfaces, annotations, abstract classes, and
            classes with no reachable methods. Generating a suite for those
            produces a vacuous result that would distort every average.
    """

    name = "Classes2Test"

    def __init__(self, config: DatasetConfig, *, skip_untestable: bool = True) -> None:
        self.config = config
        self.skip_untestable = skip_untestable
        self.source_root = Path(config.source_root)

    # ------------------------------------------------------------------
    def iter_projects(self) -> Iterator[tuple[str, Path]]:
        if not self.source_root.is_dir():
            logger.warning("dataset source root does not exist: %s", self.source_root)
            return
        for entry in sorted(self.source_root.iterdir()):
            if entry.is_dir() and not entry.name.startswith("."):
                yield entry.name, entry

    def iter_targets(self) -> Iterator[TargetClass]:
        if self.config.index_file and Path(self.config.index_file).is_file():
            iterator = self._iter_from_index(Path(self.config.index_file))
        else:
            iterator = self._iter_from_directories()

        for emitted, target in enumerate(iterator):
            if self.config.limit is not None and emitted >= self.config.limit:
                return
            yield target

    # ------------------------------------------------------------------
    def _iter_from_directories(self) -> Iterator[TargetClass]:
        for project_id, project_root in self.iter_projects():
            layout = detect_layout(project_root)
            for source_path in list_main_classes(project_root, layout=layout):
                if not self._passes_filters(source_path, project_root):
                    continue
                target = self._make_target(project_id, project_root, source_path)
                if target is not None:
                    yield target

    def _iter_from_index(self, index_path: Path) -> Iterator[TargetClass]:
        for record in _read_index(index_path):
            project_id = str(
                record.get("repo_id") or record.get("project_id") or record.get("repository") or ""
            )
            project_root = record.get("project_root") or record.get("project_path")
            source = record.get("source_path") or record.get("class_path") or record.get("focal_path")
            if not source:
                continue

            source_path = Path(source)
            if not source_path.is_absolute():
                base = Path(project_root) if project_root else (self.source_root / project_id)
                source_path = base / source_path
            root = Path(project_root) if project_root else self.source_root / project_id
            if not source_path.is_file():
                logger.debug("index entry points at a missing file: %s", source_path)
                continue

            reference = record.get("test_path") or record.get("reference_test")
            reference_path = None
            if reference:
                candidate = Path(reference)
                reference_path = candidate if candidate.is_absolute() else root / candidate

            target = self._make_target(
                project_id,
                root,
                source_path,
                qualified_name=record.get("qualified_name") or record.get("focal_class"),
                reference_test_path=reference_path,
            )
            if target is not None:
                yield target

    # ------------------------------------------------------------------
    def _passes_filters(self, source_path: Path, project_root: Path) -> bool:
        try:
            relative = source_path.relative_to(project_root).as_posix()
        except ValueError:
            relative = source_path.as_posix()

        includes = self.config.filters.include or ["**/*.java"]
        if not any(fnmatch(relative, pattern) for pattern in includes):
            return False
        return not any(fnmatch(relative, pattern) for pattern in self.config.filters.exclude)

    def _make_target(
        self,
        project_id: str,
        project_root: Path,
        source_path: Path,
        *,
        qualified_name: str | None = None,
        reference_test_path: Path | None = None,
    ) -> TargetClass | None:
        if self.skip_untestable:
            try:
                java_class = parse_file(source_path)
            except (JavaParseError, OSError) as exc:
                logger.debug("skipping unparseable %s: %s", source_path, exc)
                return None
            if not java_class.is_testable:
                logger.debug(
                    "skipping %s: %s with no reachable methods",
                    source_path.name,
                    java_class.kind,
                )
                return None
            qualified_name = qualified_name or java_class.qualified_name

        return TargetClass(
            project_id=project_id,
            project_root=project_root,
            source_path=source_path,
            qualified_name=qualified_name,
            reference_test_path=reference_test_path or _guess_reference_test(
                project_root, source_path
            ),
        )


def _read_index(path: Path) -> Iterator[dict]:
    """Read a JSON (array or JSONL) or CSV index file."""
    suffix = path.suffix.lower()
    if suffix == ".csv":
        with path.open(encoding="utf-8", newline="") as handle:
            yield from _csvrows(handle)
        return

    text = path.read_text(encoding="utf-8")
    stripped = text.lstrip()
    if stripped.startswith("["):
        payload = json.loads(text)
        for record in payload:
            if isinstance(record, dict):
                yield record
        return

    for line in text.splitlines():
        line = line.strip()
        if not line:
            continue
        try:
            record = json.loads(line)
        except json.JSONDecodeError:
            continue
        if isinstance(record, dict):
            yield record


def _guess_reference_test(project_root: Path, source_path: Path) -> Path | None:
    """Locate the human-written test for a production class, by convention.

    Used by the RQ4 comparison against the OSS baseline. Only the standard
    ``FooTest`` / ``TestFoo`` naming conventions are attempted; anything more
    speculative risks pairing a class with a test that does not target it.
    """
    layout = detect_layout(project_root)
    stem = source_path.stem
    candidates = (f"{stem}Test", f"{stem}Tests", f"Test{stem}", f"{stem}TestCase")
    for test_root in layout.test_source_roots:
        for name in candidates:
            matches = list(test_root.rglob(f"{name}.java"))
            if matches:
                return matches[0]
    return None
