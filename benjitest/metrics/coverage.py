"""Code coverage via JaCoCo (Section 4.5).

Coverage is always attributed to the *class under test*, never to the whole
project: a generated suite that happens to exercise a dozen collaborators would
otherwise report a coverage figure that says nothing about the class it was asked
to test.

Method coverage deliberately counts every method present in the bytecode --
public, protected, package-private and private -- as stated in Section 4.5,
because a good suite reaches private helpers indirectly.
"""

from __future__ import annotations

import logging
import xml.etree.ElementTree as ET
from pathlib import Path

from ..build.integration import BuildResult, BuildSystem
from ..build.sandbox import Sandbox
from .model import CoverageMetrics

logger = logging.getLogger(__name__)

#: Locations JaCoCo writes its XML report to, for Maven and Gradle respectively.
_REPORT_CANDIDATES = (
    "target/site/jacoco/jacoco.xml",
    "target/site/jacoco-ut/jacoco.xml",
    "build/reports/jacoco/test/jacocoTestReport.xml",
    "build/reports/jacoco/jacocoTestReport.xml",
)


def find_report(sandbox_path: str | Path) -> Path | None:
    """Locate the JaCoCo XML report inside a sandbox."""
    root = Path(sandbox_path)
    for relative in _REPORT_CANDIDATES:
        candidate = root / relative
        if candidate.is_file():
            return candidate
    # Multi-module projects write per-module reports.
    matches = sorted(root.glob("**/jacoco*.xml"))
    return matches[0] if matches else None


def collect(
    sandbox: Sandbox,
    class_qualified_name: str,
    *,
    build_system: BuildSystem | None = None,
    already_reported: bool = False,
) -> CoverageMetrics:
    """Compute coverage of ``class_qualified_name`` from the JaCoCo report.

    Args:
        sandbox: The sandbox the tests were executed in.
        class_qualified_name: Fully-qualified name of the class under test.
        build_system: Used to generate the report when it is missing.
        already_reported: Set when the test invocation already ran
            ``jacoco:report``, avoiding a redundant build.
    """
    report_path = find_report(sandbox.path)

    if report_path is None and build_system is not None and not already_reported:
        result = _generate_report(sandbox, build_system)
        if result is not None and not result.failed:
            report_path = find_report(sandbox.path)

    if report_path is None:
        logger.debug("no JaCoCo report found in %s", sandbox.path)
        return CoverageMetrics(available=False)

    return parse_report(report_path, class_qualified_name)


def _generate_report(sandbox: Sandbox, build_system: BuildSystem) -> BuildResult | None:
    tool = build_system.resolve_metadata(sandbox.path).tool
    args = ["-B", "-q", "jacoco:report"] if tool == "maven" else ["--no-daemon", "-q", "jacocoTestReport"]
    try:
        return build_system.run_command(sandbox.path, args)
    except Exception as exc:  # noqa: BLE001
        logger.debug("could not generate JaCoCo report: %s", exc)
        return None


def parse_report(report_path: str | Path, class_qualified_name: str) -> CoverageMetrics:
    """Parse a JaCoCo XML report, extracting the counters for one class."""
    path = Path(report_path)
    try:
        # JaCoCo reports reference a DTD; resolving it would require network
        # access, so entity resolution stays off.
        parser = ET.XMLParser()
        tree = ET.parse(path, parser=parser)
    except (ET.ParseError, OSError) as exc:
        logger.warning("could not parse JaCoCo report %s: %s", path, exc)
        return CoverageMetrics(available=False)

    target = class_qualified_name.replace(".", "/")
    element = None
    for class_element in tree.getroot().iter("class"):
        name = class_element.get("name", "")
        if name == target:
            element = class_element
            break

    if element is None:
        # The class was never loaded: the suite compiled but exercised nothing
        # of it. Zero coverage is the correct, measured answer here.
        logger.debug("class %s absent from %s", class_qualified_name, path)
        return CoverageMetrics(available=True)

    counters = {
        counter.get("type"): (
            int(counter.get("missed", 0)),
            int(counter.get("covered", 0)),
        )
        for counter in element.findall("counter")
    }

    line_missed, line_covered = counters.get("LINE", (0, 0))
    branch_missed, branch_covered = counters.get("BRANCH", (0, 0))
    method_missed, method_covered = counters.get("METHOD", (0, 0))

    return CoverageMetrics(
        line=_percentage(line_covered, line_missed),
        branch=_percentage(branch_covered, branch_missed),
        method=_percentage(method_covered, method_missed),
        lines_covered=line_covered,
        lines_missed=line_missed,
        branches_covered=branch_covered,
        branches_missed=branch_missed,
        methods_covered=method_covered,
        methods_missed=method_missed,
        available=True,
    )


def _percentage(covered: int, missed: int) -> float:
    """Coverage percentage, defined as 100% when there is nothing to cover.

    A class with no branches (e.g. a plain DTO) has full branch coverage by
    definition; reporting 0% would penalise strategies for a property of the
    class rather than of the suite.
    """
    total = covered + missed
    if total == 0:
        return 100.0
    return 100.0 * covered / total
