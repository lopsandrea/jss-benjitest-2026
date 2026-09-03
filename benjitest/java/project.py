"""Java project introspection: layout, build metadata, and the project tree.

Backs the Repository Crew (Section 3.1.1). The Repository Manager relies on
:func:`detect_build_metadata` to determine the build tool and required JDK; the
Repository Miner relies on :func:`build_project_tree` to produce the curated
textual tree that is forwarded downstream under a strict token budget.
"""

from __future__ import annotations

import logging
import re
from dataclasses import dataclass, field
from pathlib import Path

logger = logging.getLogger(__name__)

#: Conventional Maven/Gradle source roots, tried before falling back to a scan.
_STANDARD_MAIN_ROOTS = (
    "src/main/java",
    "src/java",
    "java",
    "src",
)
_STANDARD_TEST_ROOTS = (
    "src/test/java",
    "test/java",
    "tests",
    "test",
)

#: Directories never worth scanning: build output, VCS metadata, IDE state.
_IGNORED_DIRS = frozenset(
    {
        ".git", ".svn", ".hg", ".idea", ".vscode", ".settings", ".gradle", ".mvn",
        "target", "build", "out", "bin", "node_modules", "__pycache__", ".venv",
        "generated", "generated-sources", "dist",
    }
)

_JUNIT5_MARKERS = ("org.junit.jupiter", "junit-jupiter", "junit5")
_JUNIT4_MARKERS = ("junit:junit", "org.junit.Test", "junit4")
_TESTNG_MARKERS = ("org.testng", "testng")


@dataclass(slots=True)
class BuildMetadata:
    """Everything the framework needs to know about a project's build."""

    tool: str = "maven"  # maven | gradle | unknown
    build_file: Path | None = None
    java_version: str | None = None
    test_framework: str = "JUnit 5"
    #: groupId:artifactId coordinates declared in the build file.
    dependencies: list[str] = field(default_factory=list)
    #: Package prefix -> coordinate, for classifying external dependencies.
    package_to_artifact: dict[str, str] = field(default_factory=dict)
    has_wrapper: bool = False
    is_multi_module: bool = False
    modules: list[str] = field(default_factory=list)

    @property
    def junit_version(self) -> int:
        return 4 if "4" in self.test_framework else 5


@dataclass(slots=True)
class ProjectLayout:
    """Resolved source roots of a project."""

    root: Path
    main_source_roots: list[Path] = field(default_factory=list)
    test_source_roots: list[Path] = field(default_factory=list)

    @property
    def primary_main_root(self) -> Path:
        return self.main_source_roots[0] if self.main_source_roots else self.root

    @property
    def primary_test_root(self) -> Path:
        if self.test_source_roots:
            return self.test_source_roots[0]
        # Mirror the main root's convention when no test root exists yet.
        main = self.primary_main_root
        if main.name == "java" and main.parent.name == "main":
            return main.parent.parent / "test" / "java"
        return self.root / "src" / "test" / "java"


def detect_layout(project_root: str | Path) -> ProjectLayout:
    """Resolve a project's main and test source roots.

    Standard Maven/Gradle layouts are matched directly; non-standard layouts fall
    back to locating the directories that actually contain ``.java`` files with
    package declarations.
    """
    root = Path(project_root)
    layout = ProjectLayout(root=root)

    for module in _module_roots(root):
        for candidate in _STANDARD_MAIN_ROOTS:
            path = module / candidate
            if path.is_dir() and _contains_java(path):
                layout.main_source_roots.append(path)
                break
        for candidate in _STANDARD_TEST_ROOTS:
            path = module / candidate
            if path.is_dir() and _contains_java(path):
                layout.test_source_roots.append(path)
                break

    if not layout.main_source_roots:
        layout.main_source_roots = _infer_source_roots(root)

    return layout


def _module_roots(root: Path) -> list[Path]:
    """Return the root plus any Maven/Gradle sub-module directories."""
    roots = [root]
    for build_file in ("pom.xml", "build.gradle", "build.gradle.kts"):
        for path in root.glob(f"*/{build_file}"):
            if path.parent.name not in _IGNORED_DIRS:
                roots.append(path.parent)
    return roots


def _contains_java(path: Path) -> bool:
    return any(_iter_java_files(path, limit=1))


def _iter_java_files(root: Path, *, limit: int | None = None):
    """Yield ``.java`` files under ``root``, skipping build and VCS directories."""
    count = 0
    stack = [root]
    while stack:
        current = stack.pop()
        try:
            entries = list(current.iterdir())
        except (OSError, PermissionError):
            continue
        for entry in entries:
            if entry.name.startswith(".") or entry.name in _IGNORED_DIRS:
                continue
            if entry.is_dir():
                stack.append(entry)
            elif entry.suffix == ".java":
                yield entry
                count += 1
                if limit is not None and count >= limit:
                    return


def _infer_source_roots(root: Path) -> list[Path]:
    """Locate source roots by matching a file's package against its directory."""
    candidates: set[Path] = set()
    for java_file in _iter_java_files(root, limit=400):
        try:
            head = java_file.read_text(encoding="utf-8", errors="replace")[:2000]
        except OSError:
            continue
        match = re.search(r"^\s*package\s+([\w.]+)\s*;", head, re.MULTILINE)
        if not match:
            continue
        depth = len(match.group(1).split("."))
        source_root = java_file.parent
        for _ in range(depth):
            source_root = source_root.parent
        if source_root.is_dir():
            candidates.add(source_root)
    if not candidates:
        return [root]
    # Shallowest roots first: they subsume the deeper ones.
    return sorted(candidates, key=lambda p: len(p.parts))[:4]


# ----------------------------------------------------------------------
# Build metadata
# ----------------------------------------------------------------------
def detect_build_metadata(project_root: str | Path) -> BuildMetadata:
    """Inspect ``pom.xml`` / ``build.gradle`` to recover build tool and JDK version."""
    root = Path(project_root)
    pom = root / "pom.xml"
    if pom.is_file():
        metadata = _parse_pom(pom)
    else:
        gradle = next(
            (root / name for name in ("build.gradle", "build.gradle.kts") if (root / name).is_file()),
            None,
        )
        metadata = _parse_gradle(gradle) if gradle else BuildMetadata(tool="unknown")

    metadata.has_wrapper = any(
        (root / name).is_file() for name in ("mvnw", "mvnw.cmd", "gradlew", "gradlew.bat")
    )
    if metadata.test_framework == "unknown":
        metadata.test_framework = _sniff_test_framework(root)
    return metadata


def _parse_pom(pom: Path) -> BuildMetadata:
    metadata = BuildMetadata(tool="maven", build_file=pom)
    try:
        text = pom.read_text(encoding="utf-8", errors="replace")
    except OSError:
        return metadata

    # Namespaces make ElementTree tag matching awkward; regex is adequate here
    # because we only need a handful of well-known fields.
    metadata.java_version = _first_group(
        text,
        r"<maven\.compiler\.release>\s*([\d.]+)\s*</maven\.compiler\.release>",
        r"<maven\.compiler\.source>\s*([\d.]+)\s*</maven\.compiler\.source>",
        r"<java\.version>\s*([\d.]+)\s*</java\.version>",
        r"<release>\s*([\d.]+)\s*</release>",
        r"<source>\s*([\d.]+)\s*</source>",
    )

    for match in re.finditer(
        r"<dependency>(.*?)</dependency>", text, re.DOTALL | re.IGNORECASE
    ):
        block = match.group(1)
        group_id = _first_group(block, r"<groupId>\s*([^<\s]+)\s*</groupId>")
        artifact_id = _first_group(block, r"<artifactId>\s*([^<\s]+)\s*</artifactId>")
        if group_id and artifact_id:
            coordinate = f"{group_id}:{artifact_id}"
            metadata.dependencies.append(coordinate)
            metadata.package_to_artifact[group_id] = coordinate

    modules = re.findall(r"<module>\s*([^<\s]+)\s*</module>", text)
    metadata.modules = modules
    metadata.is_multi_module = bool(modules)
    metadata.test_framework = _framework_from_text(text)
    return metadata


def _parse_gradle(build_file: Path) -> BuildMetadata:
    metadata = BuildMetadata(tool="gradle", build_file=build_file)
    try:
        text = build_file.read_text(encoding="utf-8", errors="replace")
    except OSError:
        return metadata

    metadata.java_version = _first_group(
        text,
        r"sourceCompatibility\s*=?\s*['\"]?(?:JavaVersion\.VERSION_)?([\d._]+)",
        r"targetCompatibility\s*=?\s*['\"]?(?:JavaVersion\.VERSION_)?([\d._]+)",
        r"languageVersion\s*=\s*JavaLanguageVersion\.of\((\d+)\)",
        r"release\s*=\s*(\d+)",
    )
    if metadata.java_version:
        metadata.java_version = metadata.java_version.replace("_", ".")

    for match in re.finditer(
        r"""(?:implementation|api|compile|testImplementation|testCompile|runtimeOnly)"""
        r"""[\s(]+['"]([\w.\-]+):([\w.\-]+)(?::[^'"]*)?['"]""",
        text,
    ):
        group_id, artifact_id = match.group(1), match.group(2)
        coordinate = f"{group_id}:{artifact_id}"
        metadata.dependencies.append(coordinate)
        metadata.package_to_artifact[group_id] = coordinate

    settings = build_file.parent / "settings.gradle"
    settings_kts = build_file.parent / "settings.gradle.kts"
    for candidate in (settings, settings_kts):
        if candidate.is_file():
            content = candidate.read_text(encoding="utf-8", errors="replace")
            modules = re.findall(r"include\s*\(?\s*['\"]:?([\w.\-]+)", content)
            if modules:
                metadata.modules = modules
                metadata.is_multi_module = True
            break

    metadata.test_framework = _framework_from_text(text)
    return metadata


def _framework_from_text(text: str) -> str:
    lowered = text.lower()
    if any(marker in lowered for marker in _JUNIT5_MARKERS):
        return "JUnit 5"
    if any(marker.lower() in lowered for marker in _JUNIT4_MARKERS):
        return "JUnit 4"
    if any(marker in lowered for marker in _TESTNG_MARKERS):
        return "TestNG"
    return "unknown"


def _sniff_test_framework(root: Path) -> str:
    """Infer the framework from the imports of existing test sources."""
    layout = detect_layout(root)
    for test_root in layout.test_source_roots:
        for java_file in _iter_java_files(test_root, limit=25):
            try:
                head = java_file.read_text(encoding="utf-8", errors="replace")[:4000]
            except OSError:
                continue
            if "org.junit.jupiter" in head:
                return "JUnit 5"
            if "org.junit.Test" in head or "org.junit.Assert" in head:
                return "JUnit 4"
            if "org.testng" in head:
                return "TestNG"
    # JUnit 5 is the default the Test Developer Agent is instructed to target.
    return "JUnit 5"


def _first_group(text: str, *patterns: str) -> str | None:
    for pattern in patterns:
        match = re.search(pattern, text, re.IGNORECASE)
        if match:
            return match.group(1).strip()
    return None


def normalize_java_version(version: str | None) -> int | None:
    """Map ``1.8``/``8``/``17`` onto the major release number."""
    if not version:
        return None
    cleaned = version.strip().strip('"\'')
    cleaned = cleaned.removeprefix("1.")
    match = re.match(r"(\d+)", cleaned)
    return int(match.group(1)) if match else None


# ----------------------------------------------------------------------
# Repository Miner: the curated project tree
# ----------------------------------------------------------------------
def build_project_tree(
    project_root: str | Path,
    *,
    layout: ProjectLayout | None = None,
    max_depth: int = 4,
    max_entries: int = 400,
    packages_only: bool = True,
) -> str:
    """Produce the curated, indented textual project tree.

    Per Appendix B, the Repository Miner "scans source roots and packages
    (Maven/Gradle and non-standard layouts), produces a curated indented textual
    project tree, and filters out binaries, build artifacts, and hidden files to
    reduce the downstream context window".

    Args:
        packages_only: When ``True`` (the default, matching the 2,000-token budget
            of Section 3.1) only the package structure is emitted, with a per-
            package class count instead of individual file names.
    """
    root = Path(project_root)
    layout = layout or detect_layout(root)
    lines: list[str] = [f"{root.name}/"]
    emitted = 0

    for source_root in layout.main_source_roots + layout.test_source_roots:
        try:
            relative = source_root.relative_to(root)
        except ValueError:
            relative = source_root
        lines.append(f"  {relative}/")

        packages = _package_index(source_root)
        for package, classes in sorted(packages.items()):
            if emitted >= max_entries:
                lines.append("    ... [tree truncated]")
                return "\n".join(lines)
            depth = package.count(".") + 1
            if depth > max_depth:
                continue
            indent = "    "
            if packages_only:
                lines.append(f"{indent}{package or '<default>'}/  ({len(classes)} classes)")
                emitted += 1
            else:
                lines.append(f"{indent}{package or '<default>'}/")
                emitted += 1
                for class_name in sorted(classes)[:20]:
                    lines.append(f"{indent}  {class_name}.java")
                    emitted += 1

    return "\n".join(lines)


def _package_index(source_root: Path) -> dict[str, list[str]]:
    """Map package name -> class names for every ``.java`` file under a root."""
    packages: dict[str, list[str]] = {}
    for java_file in _iter_java_files(source_root):
        try:
            relative = java_file.relative_to(source_root)
        except ValueError:
            continue
        package = ".".join(relative.parent.parts) if relative.parent.parts else ""
        packages.setdefault(package, []).append(java_file.stem)
    return packages


def index_project_types(
    project_root: str | Path, *, layout: ProjectLayout | None = None
) -> dict[str, str]:
    """Map every project type's simple name to its fully-qualified name.

    Consumed by :func:`benjitest.java.parser.resolve_dependencies` to decide
    whether a referenced type is internal project code or a third-party library.
    """
    root = Path(project_root)
    layout = layout or detect_layout(root)
    index: dict[str, str] = {}
    for source_root in layout.main_source_roots:
        for package, classes in _package_index(source_root).items():
            for class_name in classes:
                qualified = f"{package}.{class_name}" if package else class_name
                # First definition wins; duplicates across modules are rare and
                # the qualified name is only used for classification.
                index.setdefault(class_name, qualified)
    return index


def find_class_file(
    project_root: str | Path,
    class_name: str,
    *,
    package: str | None = None,
    layout: ProjectLayout | None = None,
) -> Path | None:
    """Locate the source file declaring ``class_name``."""
    root = Path(project_root)
    layout = layout or detect_layout(root)
    candidates: list[Path] = []
    for source_root in layout.main_source_roots:
        if package:
            direct = source_root.joinpath(*package.split("."), f"{class_name}.java")
            if direct.is_file():
                return direct
        candidates.extend(
            path for path in _iter_java_files(source_root) if path.stem == class_name
        )
    return candidates[0] if candidates else None


def list_test_files(project_root: str | Path, *, layout: ProjectLayout | None = None) -> list[Path]:
    """Return every ``.java`` file under the project's test source roots."""
    root = Path(project_root)
    layout = layout or detect_layout(root)
    files: list[Path] = []
    for test_root in layout.test_source_roots:
        files.extend(_iter_java_files(test_root))
    return files


def list_main_classes(
    project_root: str | Path, *, layout: ProjectLayout | None = None
) -> list[Path]:
    """Return every ``.java`` file under the project's main source roots."""
    root = Path(project_root)
    layout = layout or detect_layout(root)
    files: list[Path] = []
    for source_root in layout.main_source_roots:
        files.extend(_iter_java_files(source_root))
    return files
