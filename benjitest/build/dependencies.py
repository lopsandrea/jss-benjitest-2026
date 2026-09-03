"""Injection of the test and measurement toolchain into a sandbox build file.

Phase 1 of the workflow "ensures standard test libraries (JUnit 5 engine,
Mockito, etc.) are present in the build configuration"; the
``build.inject_dependencies_for_metrics`` flag additionally wires JaCoCo and PIT
so that coverage and mutation score can be computed on projects that never
configured them.

Injection is idempotent and additive: an artifact already declared by the project
is left untouched, so a project's own pinned versions always win over ours.
"""

from __future__ import annotations

import logging
import re
import xml.etree.ElementTree as ET
from dataclasses import dataclass
from pathlib import Path

logger = logging.getLogger(__name__)

_MAVEN_NS = "http://maven.apache.org/POM/4.0.0"
_NS = {"m": _MAVEN_NS}

#: Versions used in the reported campaign. Pinned rather than floating so a
#: replication run resolves the same toolchain.
JUNIT_JUPITER_VERSION = "5.10.2"
MOCKITO_VERSION = "5.11.0"
JACOCO_VERSION = "0.8.11"
PITEST_MAVEN_VERSION = "1.15.8"
PITEST_JUNIT5_VERSION = "1.2.1"
SUREFIRE_VERSION = "3.2.5"


@dataclass(slots=True)
class InjectionResult:
    """What was added to a build file."""

    modified: bool = False
    added_dependencies: list[str] = None  # type: ignore[assignment]
    added_plugins: list[str] = None  # type: ignore[assignment]
    message: str = ""

    def __post_init__(self) -> None:
        if self.added_dependencies is None:
            self.added_dependencies = []
        if self.added_plugins is None:
            self.added_plugins = []


def inject(
    project_root: str | Path,
    *,
    build_tool: str,
    junit_version: int = 5,
    with_coverage: bool = True,
    with_mutation: bool = True,
) -> InjectionResult:
    """Ensure the test and measurement toolchain is available in the sandbox."""
    root = Path(project_root)
    if build_tool == "maven":
        return inject_maven(
            root / "pom.xml",
            junit_version=junit_version,
            with_coverage=with_coverage,
            with_mutation=with_mutation,
        )
    if build_tool == "gradle":
        build_file = next(
            (root / n for n in ("build.gradle", "build.gradle.kts") if (root / n).is_file()),
            None,
        )
        if build_file is None:
            return InjectionResult(message="no Gradle build file found")
        return inject_gradle(
            build_file,
            junit_version=junit_version,
            with_coverage=with_coverage,
            with_mutation=with_mutation,
        )
    return InjectionResult(message=f"unsupported build tool '{build_tool}'")


# ----------------------------------------------------------------------
# Maven
# ----------------------------------------------------------------------
def inject_maven(
    pom_path: str | Path,
    *,
    junit_version: int = 5,
    with_coverage: bool = True,
    with_mutation: bool = True,
) -> InjectionResult:
    """Add JUnit/Mockito dependencies and JaCoCo/PIT plugins to a ``pom.xml``."""
    path = Path(pom_path)
    result = InjectionResult()
    if not path.is_file():
        result.message = f"pom.xml not found at {path}"
        return result

    ET.register_namespace("", _MAVEN_NS)
    try:
        tree = ET.parse(path)
    except ET.ParseError as exc:
        result.message = f"could not parse {path}: {exc}"
        logger.warning(result.message)
        return result

    project = tree.getroot()
    existing = _existing_maven_artifacts(project)

    dependencies = _child(project, "dependencies", create=True)
    wanted: list[tuple[str, str, str, str | None]] = []
    if junit_version >= 5:
        wanted += [
            ("org.junit.jupiter", "junit-jupiter", JUNIT_JUPITER_VERSION, "test"),
            ("org.mockito", "mockito-core", MOCKITO_VERSION, "test"),
            ("org.mockito", "mockito-junit-jupiter", MOCKITO_VERSION, "test"),
        ]
    else:
        wanted += [
            ("junit", "junit", "4.13.2", "test"),
            ("org.mockito", "mockito-core", "4.11.0", "test"),
        ]

    for group_id, artifact_id, version, scope in wanted:
        if (group_id, artifact_id) in existing:
            continue
        _append_dependency(dependencies, group_id, artifact_id, version, scope)
        result.added_dependencies.append(f"{group_id}:{artifact_id}:{version}")
        result.modified = True

    build = _child(project, "build", create=True)
    plugins = _child(build, "plugins", create=True)
    plugin_keys = _existing_maven_plugins(plugins)

    # Surefire 3.x is required to run JUnit 5 tests at all; older projects pin 2.x.
    if ("org.apache.maven.plugins", "maven-surefire-plugin") not in plugin_keys:
        _append_surefire(plugins)
        result.added_plugins.append("maven-surefire-plugin")
        result.modified = True

    if with_coverage and ("org.jacoco", "jacoco-maven-plugin") not in plugin_keys:
        _append_jacoco(plugins)
        result.added_plugins.append("jacoco-maven-plugin")
        result.modified = True

    if with_mutation and ("org.pitest", "pitest-maven") not in plugin_keys:
        _append_pitest(plugins)
        result.added_plugins.append("pitest-maven")
        result.modified = True

    if result.modified:
        _indent(project)
        tree.write(path, encoding="utf-8", xml_declaration=True)
        logger.debug(
            "injected into %s: deps=%s plugins=%s",
            path,
            result.added_dependencies,
            result.added_plugins,
        )
    return result


def _child(parent: ET.Element, tag: str, *, create: bool = False) -> ET.Element:
    element = parent.find(f"m:{tag}", _NS)
    if element is None:
        element = parent.find(tag)  # namespace-less POM
    if element is None and create:
        element = ET.SubElement(parent, f"{{{_MAVEN_NS}}}{tag}")
    return element


def _text_of(parent: ET.Element, tag: str) -> str | None:
    element = parent.find(f"m:{tag}", _NS)
    if element is None:
        element = parent.find(tag)
    return element.text.strip() if element is not None and element.text else None


def _existing_maven_artifacts(project: ET.Element) -> set[tuple[str, str]]:
    """Collect every declared dependency, including managed ones."""
    found: set[tuple[str, str]] = set()
    for container in ("dependencies", "dependencyManagement"):
        parent = _child(project, container)
        if parent is None:
            continue
        for dependency in parent.iter():
            if not dependency.tag.endswith("dependency"):
                continue
            group_id = _text_of(dependency, "groupId")
            artifact_id = _text_of(dependency, "artifactId")
            if group_id and artifact_id:
                found.add((group_id, artifact_id))
                # junit-jupiter-api implies the aggregate is effectively present.
                if artifact_id.startswith("junit-jupiter"):
                    found.add((group_id, "junit-jupiter"))
    return found


def _existing_maven_plugins(plugins: ET.Element) -> set[tuple[str, str]]:
    found: set[tuple[str, str]] = set()
    for plugin in plugins.iter():
        if not plugin.tag.endswith("plugin"):
            continue
        artifact_id = _text_of(plugin, "artifactId")
        group_id = _text_of(plugin, "groupId") or "org.apache.maven.plugins"
        if artifact_id:
            found.add((group_id, artifact_id))
    return found


def _sub(parent: ET.Element, tag: str, text: str | None = None) -> ET.Element:
    element = ET.SubElement(parent, f"{{{_MAVEN_NS}}}{tag}")
    if text is not None:
        element.text = text
    return element


def _append_dependency(
    dependencies: ET.Element,
    group_id: str,
    artifact_id: str,
    version: str,
    scope: str | None,
) -> None:
    dependency = _sub(dependencies, "dependency")
    _sub(dependency, "groupId", group_id)
    _sub(dependency, "artifactId", artifact_id)
    _sub(dependency, "version", version)
    if scope:
        _sub(dependency, "scope", scope)


def _append_surefire(plugins: ET.Element) -> None:
    plugin = _sub(plugins, "plugin")
    _sub(plugin, "groupId", "org.apache.maven.plugins")
    _sub(plugin, "artifactId", "maven-surefire-plugin")
    _sub(plugin, "version", SUREFIRE_VERSION)
    configuration = _sub(plugin, "configuration")
    # A generated suite that fails must not abort the reactor: the framework
    # needs the test report either way, and failure is a measured outcome.
    _sub(configuration, "testFailureIgnore", "true")
    _sub(configuration, "failIfNoTests", "false")


def _append_jacoco(plugins: ET.Element) -> None:
    plugin = _sub(plugins, "plugin")
    _sub(plugin, "groupId", "org.jacoco")
    _sub(plugin, "artifactId", "jacoco-maven-plugin")
    _sub(plugin, "version", JACOCO_VERSION)
    executions = _sub(plugin, "executions")

    prepare = _sub(executions, "execution")
    _sub(prepare, "id", "benjitest-prepare-agent")
    goals = _sub(prepare, "goals")
    _sub(goals, "goal", "prepare-agent")

    report = _sub(executions, "execution")
    _sub(report, "id", "benjitest-report")
    _sub(report, "phase", "test")
    report_goals = _sub(report, "goals")
    _sub(report_goals, "goal", "report")
    configuration = _sub(report, "configuration")
    formats = _sub(configuration, "formats")
    _sub(formats, "format", "XML")


def _append_pitest(plugins: ET.Element) -> None:
    plugin = _sub(plugins, "plugin")
    _sub(plugin, "groupId", "org.pitest")
    _sub(plugin, "artifactId", "pitest-maven")
    _sub(plugin, "version", PITEST_MAVEN_VERSION)
    configuration = _sub(plugin, "configuration")
    output_formats = _sub(configuration, "outputFormats")
    _sub(output_formats, "outputFormat", "XML")
    _sub(configuration, "timestampedReports", "false")
    _sub(configuration, "failWhenNoMutations", "false")
    # PIT needs an explicit JUnit 5 plugin; without it no tests are discovered.
    dependencies = _sub(plugin, "dependencies")
    dependency = _sub(dependencies, "dependency")
    _sub(dependency, "groupId", "org.pitest")
    _sub(dependency, "artifactId", "pitest-junit5-plugin")
    _sub(dependency, "version", PITEST_JUNIT5_VERSION)


def _indent(element: ET.Element, level: int = 0) -> None:
    """Pretty-print in place (``ET.indent`` equivalent, kept for older readers)."""
    padding = "\n" + "  " * level
    if len(element):
        if not (element.text or "").strip():
            element.text = padding + "  "
        for child in element:
            _indent(child, level + 1)
        if not (element[-1].tail or "").strip():
            element[-1].tail = padding
    if level and not (element.tail or "").strip():
        element.tail = padding


# ----------------------------------------------------------------------
# Gradle
# ----------------------------------------------------------------------
_GRADLE_BLOCK_MARKER = "// >>> BenjiTest injected configuration"

_GRADLE_GROOVY_BLOCK = """
{marker}
plugins {{
    id 'jacoco'
}}

dependencies {{
    testImplementation 'org.junit.jupiter:junit-jupiter:{junit}'
    testImplementation 'org.mockito:mockito-core:{mockito}'
    testImplementation 'org.mockito:mockito-junit-jupiter:{mockito}'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}}

test {{
    useJUnitPlatform()
    ignoreFailures = true
    finalizedBy jacocoTestReport
}}

jacoco {{
    toolVersion = '{jacoco}'
}}

jacocoTestReport {{
    dependsOn test
    reports {{
        xml.required = true
        html.required = false
    }}
}}
// <<< BenjiTest injected configuration
"""


def inject_gradle(
    build_file: str | Path,
    *,
    junit_version: int = 5,
    with_coverage: bool = True,
    with_mutation: bool = True,
) -> InjectionResult:
    """Append a BenjiTest configuration block to a Gradle build script.

    Gradle build scripts are executable code rather than data, so they are
    appended to rather than rewritten: any attempt to restructure arbitrary
    Groovy/Kotlin DSL programmatically is far more likely to break the build than
    to fix it.
    """
    path = Path(build_file)
    result = InjectionResult()
    if not path.is_file():
        result.message = f"Gradle build file not found at {path}"
        return result

    text = path.read_text(encoding="utf-8", errors="replace")
    if _GRADLE_BLOCK_MARKER in text:
        result.message = "BenjiTest configuration already present"
        return result

    if junit_version < 5:
        result.message = "JUnit 4 projects are left untouched on Gradle"
        return result

    block = _GRADLE_GROOVY_BLOCK.format(
        marker=_GRADLE_BLOCK_MARKER,
        junit=JUNIT_JUPITER_VERSION,
        mockito=MOCKITO_VERSION,
        jacoco=JACOCO_VERSION,
    )
    if not with_coverage:
        block = re.sub(r"jacoco\w*\s*\{[^}]*\}", "", block)

    path.write_text(text.rstrip() + "\n" + block, encoding="utf-8")
    result.modified = True
    result.added_dependencies = [
        f"org.junit.jupiter:junit-jupiter:{JUNIT_JUPITER_VERSION}",
        f"org.mockito:mockito-core:{MOCKITO_VERSION}",
    ]
    if with_coverage:
        result.added_plugins.append("jacoco")
    if with_mutation:
        # The PIT Gradle plugin must be applied in the plugins{} block at the top
        # of the script, which cannot be done by appending. Mutation analysis on
        # Gradle projects therefore runs through the standalone PIT entry point.
        result.message = "PIT runs standalone on Gradle projects"
    return result
