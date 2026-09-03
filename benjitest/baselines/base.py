"""The contract every RQ6 baseline adapter satisfies."""

from __future__ import annotations

import logging
import subprocess
import time
from abc import ABC, abstractmethod
from dataclasses import dataclass, field
from pathlib import Path

logger = logging.getLogger(__name__)


@dataclass(slots=True)
class BaselineResult:
    """What an adapter returns: a test class and what it cost to get it.

    Coverage, mutation score and smells are deliberately absent. They are
    computed afterwards by the same pipeline that measures BenjiTest's own
    output, which is what makes the comparison like-for-like.
    """

    system: str
    target: str
    test_source: str | None
    test_file: Path | None = None
    prompt_tokens: int = 0
    completion_tokens: int = 0
    cpu_seconds: float = 0.0
    wall_seconds: float = 0.0
    failed: bool = False
    error: str = ""

    @property
    def tokens(self) -> int:
        return self.prompt_tokens + self.completion_tokens


class BaselineAdapter(ABC):
    """Drives one external generator over a sandboxed project copy."""

    #: Set by subclasses; used only for logging and for the released records.
    system: str = ""

    def __init__(self, config, sandbox_root: Path, llm_layer=None):
        self.config = config
        self.sandbox_root = Path(sandbox_root)
        self.llm = llm_layer
        if config.kind == "llm" and llm_layer is None:
            raise ValueError(
                "%s is an LLM baseline and needs the LLM Interaction Layer, so that "
                "it runs on the same backend as everything else" % config.name
            )

    @abstractmethod
    def generate(self, project: Path, qualified_name: str) -> BaselineResult:
        """Produce a test class for ``qualified_name`` inside ``project``."""

    # -- shared helpers ----------------------------------------------------
    def _run(self, cmd: list[str], cwd: Path, timeout: int) -> tuple[int, str, float]:
        """Run a subprocess, returning (exit code, combined output, seconds)."""
        started = time.monotonic()
        try:
            proc = subprocess.run(
                cmd, cwd=str(cwd), capture_output=True, text=True, timeout=timeout
            )
        except subprocess.TimeoutExpired:
            return 124, "timed out after %ds" % timeout, time.monotonic() - started
        out = (proc.stdout or "") + (proc.stderr or "")
        return proc.returncode, out, time.monotonic() - started

    @staticmethod
    def _test_path(project: Path, qualified_name: str) -> Path:
        pkg, simple = qualified_name.rsplit(".", 1)
        return project / "src" / "test" / "java" / Path(*pkg.split(".")) / (simple + "Test.java")
