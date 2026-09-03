"""Dataset abstractions.

A dataset yields :class:`TargetClass` records: the unit of work the Coordinator
iterates over. Keeping this behind a small interface is what allows the same
crews to be re-instantiated on a different corpus, which Section 4 states as an
explicit design goal.
"""

from __future__ import annotations

from abc import ABC, abstractmethod
from collections.abc import Iterator
from dataclasses import dataclass, field
from pathlib import Path


@dataclass(slots=True)
class TargetClass:
    """One class under test, together with the project that contains it."""

    #: Identifier of the containing repository (the Classes2Test repo id).
    project_id: str
    #: Root of the project on disk.
    project_root: Path
    #: Source file of the class under test.
    source_path: Path
    #: Fully-qualified name, when already known.
    qualified_name: str | None = None
    #: Path of the human-written test class, for the RQ4 comparison.
    reference_test_path: Path | None = None
    metadata: dict = field(default_factory=dict)

    @property
    def class_name(self) -> str:
        return self.source_path.stem

    @property
    def key(self) -> str:
        """Stable identity used for resumption and reporting."""
        return f"{self.project_id}::{self.qualified_name or self.class_name}"


class Dataset(ABC):
    """A source of :class:`TargetClass` records."""

    name: str = "dataset"

    @abstractmethod
    def iter_targets(self) -> Iterator[TargetClass]:
        """Yield every class under test in the dataset."""

    @abstractmethod
    def iter_projects(self) -> Iterator[tuple[str, Path]]:
        """Yield ``(project_id, project_root)`` pairs."""

    def targets_by_project(self) -> dict[str, list[TargetClass]]:
        """Group targets by project, the order the Coordinator processes them in.

        Grouping matters: sandbox creation and the initial validation build are
        per-project costs, so all classes of a project are handled before moving
        on.
        """
        grouped: dict[str, list[TargetClass]] = {}
        for target in self.iter_targets():
            grouped.setdefault(target.project_id, []).append(target)
        return grouped
