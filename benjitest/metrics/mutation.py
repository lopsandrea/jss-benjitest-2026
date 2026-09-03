"""Mutation score via PIT (Section 4.5).

Two exclusion rules from the paper are implemented here and are the reason the
reported scores are conservative rather than inflated:

1. Mutants PIT reports as ``NON_VIABLE``, ``MEMORY_ERROR``, ``RUN_ERROR`` or
   ``TIMED_OUT`` are removed from the denominator, as they do not correspond to
   executable mutants a test suite could reasonably kill.
2. Duplicate mutants -- the same location and operator reported more than once --
   are collapsed.

Semantically equivalent mutants are *not* removed: detecting equivalence is
undecidable in general, and a mutant is never discarded merely for surviving.
Any equivalent mutants that remain therefore depress the score, which makes the
relative advantage measured between strategies robust to this threat.
"""

from __future__ import annotations

import logging
import xml.etree.ElementTree as ET
from pathlib import Path

from ..build.integration import BuildSystem
from ..build.sandbox import Sandbox
from .model import MutationMetrics

logger = logging.getLogger(__name__)

#: PIT statuses counted as killed.
KILLED_STATUSES = frozenset({"KILLED"})
#: PIT statuses counted as survived (i.e. in the denominator but not killed).
SURVIVED_STATUSES = frozenset({"SURVIVED", "NO_COVERAGE"})
#: PIT statuses excluded from the denominator entirely.
DEFAULT_EXCLUDED_STATUSES = frozenset(
    {"NON_VIABLE", "MEMORY_ERROR", "RUN_ERROR", "TIMED_OUT"}
)

_REPORT_CANDIDATES = (
    "target/pit-reports/mutations.xml",
    "build/reports/pitest/mutations.xml",
)


def find_report(sandbox_path: str | Path) -> Path | None:
    """Locate the PIT XML report inside a sandbox."""
    root = Path(sandbox_path)
    for relative in _REPORT_CANDIDATES:
        candidate = root / relative
        if candidate.is_file():
            return candidate
    matches = sorted(root.glob("**/pit-reports/**/mutations.xml"))
    if not matches:
        matches = sorted(root.glob("**/pitest/**/mutations.xml"))
    return matches[-1] if matches else None


def collect(
    sandbox: Sandbox,
    class_qualified_name: str,
    test_class_qualified_name: str,
    *,
    build_system: BuildSystem,
    threads: int = 4,
    excluded_statuses: frozenset[str] | set[str] | list[str] | None = None,
    deduplicate: bool = True,
    target_only_cut: bool = True,
) -> MutationMetrics:
    """Run PIT against the class under test and parse the resulting score.

    Args:
        class_qualified_name: The class to mutate.
        test_class_qualified_name: The generated suite to run against the mutants.
        target_only_cut: Restrict mutation to the class under test, as done in
            the reported campaign.
    """
    result = _run_pit(
        sandbox,
        class_qualified_name,
        test_class_qualified_name,
        build_system=build_system,
        threads=threads,
        target_only_cut=target_only_cut,
    )
    if result is None:
        return MutationMetrics(available=False)

    report = find_report(sandbox.path)
    if report is None:
        logger.debug("PIT produced no report for %s", class_qualified_name)
        return MutationMetrics(available=False)

    return parse_report(
        report,
        class_qualified_name,
        excluded_statuses=excluded_statuses,
        deduplicate=deduplicate,
    )


def _run_pit(
    sandbox: Sandbox,
    class_qualified_name: str,
    test_class_qualified_name: str,
    *,
    build_system: BuildSystem,
    threads: int,
    target_only_cut: bool,
):
    tool = build_system.resolve_metadata(sandbox.path).tool
    if tool != "maven":
        # The PIT Gradle plugin must be applied in the script's plugins{} block,
        # which the framework cannot do by appending; see build/dependencies.py.
        logger.debug("mutation analysis is only wired for Maven projects")
        return None

    target_classes = class_qualified_name if target_only_cut else f"{_package_of(class_qualified_name)}.*"
    args = [
        "-B",
        "-q",
        "org.pitest:pitest-maven:mutationCoverage",
        f"-DtargetClasses={target_classes}",
        f"-DtargetTests={test_class_qualified_name}",
        "-DoutputFormats=XML",
        f"-Dthreads={threads}",
        "-DtimestampedReports=false",
        "-DfailWhenNoMutations=false",
        # PIT aborts when the existing suite is green-but-empty; we always want
        # the report rather than a hard failure.
        "-DskipFailingTests=true",
    ]
    try:
        return build_system.run_command(sandbox.path, args)
    except Exception as exc:  # noqa: BLE001
        logger.debug("PIT invocation failed: %s", exc)
        return None


def parse_report(
    report_path: str | Path,
    class_qualified_name: str,
    *,
    excluded_statuses: frozenset[str] | set[str] | list[str] | None = None,
    deduplicate: bool = True,
) -> MutationMetrics:
    """Parse a PIT ``mutations.xml`` report into a mutation score."""
    path = Path(report_path)
    excluded = frozenset(excluded_statuses or DEFAULT_EXCLUDED_STATUSES)

    try:
        tree = ET.parse(path)
    except (ET.ParseError, OSError) as exc:
        logger.warning("could not parse PIT report %s: %s", path, exc)
        return MutationMetrics(available=False)

    killed = survived = skipped = 0
    seen: set[tuple[str, str, str, str]] = set()
    duplicates = 0

    for mutation in tree.getroot().iter("mutation"):
        mutated_class = _text(mutation, "mutatedClass")
        if mutated_class and not _matches_class(mutated_class, class_qualified_name):
            continue

        status = (mutation.get("status") or "").upper()

        if deduplicate:
            key = (
                mutated_class or "",
                _text(mutation, "mutatedMethod") or "",
                _text(mutation, "lineNumber") or "",
                _text(mutation, "mutator") or "",
            )
            if key in seen:
                duplicates += 1
                continue
            seen.add(key)

        if status in excluded:
            skipped += 1
        elif status in KILLED_STATUSES:
            killed += 1
        elif status in SURVIVED_STATUSES:
            survived += 1
        else:
            # An unrecognised status is excluded rather than silently counted as
            # survived, which would understate the score for a reason unrelated
            # to the suite.
            logger.debug("unrecognised PIT status '%s'; excluding mutant", status)
            skipped += 1

    total = killed + survived
    score = 100.0 * killed / total if total else 0.0

    return MutationMetrics(
        score=score,
        killed=killed,
        survived=survived,
        excluded=skipped,
        duplicates_removed=duplicates,
        available=total > 0 or skipped > 0,
    )


def _matches_class(mutated_class: str, target: str) -> bool:
    """Whether a mutated class is the target, allowing for inner classes."""
    return mutated_class == target or mutated_class.startswith(f"{target}$")


def _text(element: ET.Element, tag: str) -> str | None:
    child = element.find(tag)
    return child.text.strip() if child is not None and child.text else None


def _package_of(qualified_name: str) -> str:
    return qualified_name.rsplit(".", 1)[0] if "." in qualified_name else ""
