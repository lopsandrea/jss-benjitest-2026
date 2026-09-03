"""On-disk response cache for the LLM Interaction Layer.

A campaign of this size re-issues identical prompts whenever a run is resumed
after an interruption. Caching on the full request fingerprint (model, sampling
parameters, and message content) makes resumption cheap without ever returning a
response produced under different settings.
"""

from __future__ import annotations

import hashlib
import json
import threading
from dataclasses import asdict, is_dataclass
from pathlib import Path
from typing import Any


def request_fingerprint(payload: dict[str, Any]) -> str:
    """Return a stable SHA-256 fingerprint for a request payload."""
    canonical = json.dumps(payload, sort_keys=True, ensure_ascii=False, default=_default)
    return hashlib.sha256(canonical.encode("utf-8")).hexdigest()


def _default(value: Any) -> Any:
    if is_dataclass(value) and not isinstance(value, type):
        return asdict(value)
    return str(value)


class ResponseCache:
    """Content-addressed cache of LLM completions, sharded over two nibble levels."""

    def __init__(self, directory: str | Path, *, enabled: bool = True) -> None:
        self.directory = Path(directory)
        self.enabled = enabled
        self._lock = threading.Lock()
        self.hits = 0
        self.misses = 0
        if self.enabled:
            self.directory.mkdir(parents=True, exist_ok=True)

    def _path(self, key: str) -> Path:
        return self.directory / key[:2] / key[2:4] / f"{key}.json"

    def get(self, key: str) -> dict[str, Any] | None:
        if not self.enabled:
            return None
        path = self._path(key)
        if not path.is_file():
            with self._lock:
                self.misses += 1
            return None
        try:
            payload = json.loads(path.read_text(encoding="utf-8"))
        except (json.JSONDecodeError, OSError):
            # A truncated entry (e.g. killed mid-write) must not fail the run.
            with self._lock:
                self.misses += 1
            return None
        with self._lock:
            self.hits += 1
        return payload

    def put(self, key: str, value: dict[str, Any]) -> None:
        if not self.enabled:
            return
        path = self._path(key)
        path.parent.mkdir(parents=True, exist_ok=True)
        # Write through a temporary file so a crash cannot leave a partial entry.
        temp = path.with_suffix(".tmp")
        temp.write_text(json.dumps(value, ensure_ascii=False), encoding="utf-8")
        temp.replace(path)

    @property
    def stats(self) -> dict[str, int]:
        with self._lock:
            return {"hits": self.hits, "misses": self.misses}
