"""Adapter for ChatUniTest, driven through its Maven plugin.

The tool is used as published. We supply the backend so that the comparison
isolates orchestration rather than model choice, and we take its output without
post-processing: BenjiTest's correction loop is not applied here.
"""

from __future__ import annotations

import logging
from pathlib import Path

from .base import BaselineAdapter, BaselineResult

logger = logging.getLogger(__name__)

TIMEOUT = 900


class ChatUniTestAdapter(BaselineAdapter):
    system = "chatunitest"

    def generate(self, project: Path, qualified_name: str) -> BaselineResult:
        result = BaselineResult(system=self.system, target=qualified_name, test_source=None)
        cmd = ["mvn", "-B", "chatunitest:class",
               "-DselectClass=" + qualified_name,
               "-DapiKey=${env:OPENAI_API_KEY}",
               "-Dmodel=" + (self.config.backend or "")]
        code, out, seconds = self._run(cmd, project, TIMEOUT)
        result.wall_seconds = seconds
        path = self._test_path(project, qualified_name)
        if code != 0 or not path.is_file():
            result.failed = True
            result.error = out[-2000:]
            return result
        result.test_source = path.read_text(encoding="utf-8")
        result.test_file = path
        result.prompt_tokens, result.completion_tokens = _tokens_from_log(out)
        return result


def _tokens_from_log(output: str) -> tuple[int, int]:
    """ChatUniTest prints its usage; fall back to zero when it does not."""
    prompt = completion = 0
    for line in output.splitlines():
        if "prompt_tokens" in line:
            prompt += _int_after(line, "prompt_tokens")
        if "completion_tokens" in line:
            completion += _int_after(line, "completion_tokens")
    return prompt, completion


def _int_after(line: str, key: str) -> int:
    tail = line.split(key, 1)[1]
    digits = "".join(c for c in tail if c.isdigit() or c == " ").split()
    return int(digits[0]) if digits else 0
