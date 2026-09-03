"""Adapter for EvoSuite, the non-LLM reference point of RQ6.

EvoSuite generates its own assertions from observed behaviour, so its oracle
semantics differ from every other arm. Mutation score is comparable across the
arms; fault detection is not, and the paper says so wherever the two appear
together. The search budget is set from the configuration rather than left at
the default, so that the arm's cost is stated rather than implicit.
"""

from __future__ import annotations

import logging
from pathlib import Path

from .base import BaselineAdapter, BaselineResult

logger = logging.getLogger(__name__)

DEFAULT_BUDGET = 180


class EvoSuiteAdapter(BaselineAdapter):
    system = "evosuite"

    def generate(self, project: Path, qualified_name: str) -> BaselineResult:
        result = BaselineResult(system=self.system, target=qualified_name, test_source=None)
        budget = self.config.search_budget_seconds or DEFAULT_BUDGET
        jar = self.sandbox_root / "tools" / ("evosuite-%s.jar" % (self.config.version or "1.2.0"))
        cmd = ["java", "-jar", str(jar),
               "-class", qualified_name,
               "-projectCP", str(project / "target" / "classes"),
               "-Dsearch_budget=%d" % budget,
               "-Dassertion_strategy=mutation",
               "-Dtest_dir=" + str(project / "src" / "test" / "java")]
        code, out, seconds = self._run(cmd, project, budget * 4)
        result.wall_seconds = seconds
        result.cpu_seconds = float(budget)
        path = self._test_path(project, qualified_name)
        if code != 0 or not path.is_file():
            result.failed = True
            result.error = out[-2000:]
            return result
        result.test_source = path.read_text(encoding="utf-8")
        result.test_file = path
        return result
