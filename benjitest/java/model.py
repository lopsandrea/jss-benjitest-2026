"""Data model for the static analysis of a Java class under test.

These structures are the machine-readable backbone of the Class Under Test
Analyzer's report (Appendix B): the class signature, its members, and the
categorised list of internal vs. external dependencies used to decide what must
be mocked.
"""

from __future__ import annotations

from dataclasses import dataclass, field
from enum import Enum
from typing import Any


class DependencyKind(str, Enum):
    """Categorisation driving the analyzer's mocking guidance.

    ``INTERNAL`` dependencies belong to the project under analysis, so their real
    public signatures and Javadoc can be extracted and injected into the prompt
    to mitigate hallucinated calls. ``EXTERNAL`` dependencies come from
    third-party libraries declared in the build file and are candidates for
    mocking. ``JDK`` types need neither.
    """

    INTERNAL = "internal"
    EXTERNAL = "external"
    JDK = "jdk"
    UNKNOWN = "unknown"


@dataclass(slots=True)
class JavaParameter:
    name: str
    type: str
    annotations: list[str] = field(default_factory=list)
    varargs: bool = False

    def __str__(self) -> str:
        suffix = "..." if self.varargs else ""
        return f"{self.type}{suffix} {self.name}"


@dataclass(slots=True)
class JavaMethod:
    name: str
    return_type: str = "void"
    parameters: list[JavaParameter] = field(default_factory=list)
    modifiers: list[str] = field(default_factory=list)
    throws: list[str] = field(default_factory=list)
    annotations: list[str] = field(default_factory=list)
    javadoc: str | None = None
    type_parameters: list[str] = field(default_factory=list)
    start_line: int | None = None
    end_line: int | None = None
    #: Raw source of the method, populated only when white-box analysis needs it.
    body: str | None = None
    cyclomatic_complexity: int = 1
    is_constructor: bool = False

    @property
    def is_public(self) -> bool:
        return "public" in self.modifiers

    @property
    def is_static(self) -> bool:
        return "static" in self.modifiers

    @property
    def is_abstract(self) -> bool:
        return "abstract" in self.modifiers

    @property
    def visibility(self) -> str:
        for modifier in ("public", "protected", "private"):
            if modifier in self.modifiers:
                return modifier
        return "package-private"

    @property
    def signature(self) -> str:
        """The declaration line, without the body."""
        parts: list[str] = []
        if self.modifiers:
            parts.append(" ".join(sorted(self.modifiers, key=_modifier_rank)))
        if self.type_parameters:
            parts.append(f"<{', '.join(self.type_parameters)}>")
        if not self.is_constructor:
            parts.append(self.return_type)
        params = ", ".join(str(p) for p in self.parameters)
        parts.append(f"{self.name}({params})")
        signature = " ".join(part for part in parts if part)
        if self.throws:
            signature += f" throws {', '.join(self.throws)}"
        return signature

    @property
    def erased_signature(self) -> str:
        """``name(Type, Type)`` -- stable identity for a method within a class."""
        return f"{self.name}({', '.join(p.type for p in self.parameters)})"


@dataclass(slots=True)
class JavaField:
    name: str
    type: str
    modifiers: list[str] = field(default_factory=list)
    annotations: list[str] = field(default_factory=list)
    initializer: str | None = None
    javadoc: str | None = None

    @property
    def is_public(self) -> bool:
        return "public" in self.modifiers

    @property
    def is_constant(self) -> bool:
        return "static" in self.modifiers and "final" in self.modifiers

    @property
    def declaration(self) -> str:
        modifiers = " ".join(sorted(self.modifiers, key=_modifier_rank))
        text = f"{modifiers} {self.type} {self.name}".strip()
        return f"{text} = {self.initializer}" if self.initializer else text


@dataclass(slots=True)
class Dependency:
    """A type referenced by the class under test."""

    type_name: str
    kind: DependencyKind = DependencyKind.UNKNOWN
    #: Fully-qualified name when it could be resolved from the imports.
    qualified_name: str | None = None
    #: Where the dependency shows up: constructor injection, field, parameter...
    roles: list[str] = field(default_factory=list)
    #: Public API of an internal dependency, injected to prevent hallucinations.
    public_api: list[str] = field(default_factory=list)
    #: Build-file coordinate for an external dependency (groupId:artifactId).
    artifact: str | None = None

    @property
    def mockable(self) -> bool:
        """Whether the dependency is a sensible mocking target.

        Final JDK value types (String, primitives boxes) are never worth mocking;
        collaborators injected into the class under test are.
        """
        if self.kind is DependencyKind.JDK:
            return False
        return "constructor-injected" in self.roles or "field" in self.roles


@dataclass(slots=True)
class JavaClass:
    """A parsed Java type declaration."""

    name: str
    package: str | None = None
    modifiers: list[str] = field(default_factory=list)
    kind: str = "class"  # class | interface | enum | record | annotation
    extends: str | None = None
    implements: list[str] = field(default_factory=list)
    type_parameters: list[str] = field(default_factory=list)
    annotations: list[str] = field(default_factory=list)
    javadoc: str | None = None
    imports: list[str] = field(default_factory=list)
    fields: list[JavaField] = field(default_factory=list)
    constructors: list[JavaMethod] = field(default_factory=list)
    methods: list[JavaMethod] = field(default_factory=list)
    nested_classes: list[str] = field(default_factory=list)
    dependencies: list[Dependency] = field(default_factory=list)
    #: Full source text, retained for white-box analysis.
    source: str = ""
    source_path: str | None = None
    #: True when the parser had to fall back to regex extraction, meaning the
    #: structural analysis is best-effort. Recorded so results can be audited.
    degraded: bool = False

    @property
    def qualified_name(self) -> str:
        return f"{self.package}.{self.name}" if self.package else self.name

    @property
    def public_methods(self) -> list[JavaMethod]:
        return [m for m in self.methods if m.is_public]

    @property
    def testable_methods(self) -> list[JavaMethod]:
        """Public and protected non-abstract methods: the black-box surface."""
        return [
            m
            for m in self.methods
            if m.visibility in {"public", "protected"} and not m.is_abstract
        ]

    @property
    def line_count(self) -> int:
        return self.source.count("\n") + 1 if self.source else 0

    @property
    def cyclomatic_complexity(self) -> int:
        """Sum of per-method complexity, as reported in Table 2 of the paper."""
        return sum(m.cyclomatic_complexity for m in self.methods + self.constructors)

    @property
    def is_testable(self) -> bool:
        """Whether generating a unit test for this type makes sense at all.

        Interfaces and annotations have no behaviour to exercise, and a type with
        no reachable members yields a vacuous suite.
        """
        if self.kind in {"interface", "annotation"}:
            return False
        if "abstract" in self.modifiers:
            return False
        return bool(self.testable_methods)

    @property
    def internal_dependencies(self) -> list[Dependency]:
        return [d for d in self.dependencies if d.kind is DependencyKind.INTERNAL]

    @property
    def external_dependencies(self) -> list[Dependency]:
        return [d for d in self.dependencies if d.kind is DependencyKind.EXTERNAL]

    @property
    def mockable_dependencies(self) -> list[Dependency]:
        return [d for d in self.dependencies if d.mockable]

    def signature_summary(self) -> str:
        """A compact, body-free rendering of the class.

        This is the "method signatures and dependency lists without full source
        code duplication" form the Class Analyzer forwards downstream
        (Section 3.1).
        """
        lines: list[str] = []
        if self.package:
            lines.append(f"package {self.package};")
        header = " ".join(filter(None, [" ".join(self.modifiers), self.kind, self.name]))
        if self.type_parameters:
            header += f"<{', '.join(self.type_parameters)}>"
        if self.extends:
            header += f" extends {self.extends}"
        if self.implements:
            header += f" implements {', '.join(self.implements)}"
        lines.append(header + " {")
        for f in self.fields:
            if f.is_public or f.is_constant:
                lines.append(f"    {f.declaration};")
        for c in self.constructors:
            lines.append(f"    {c.signature};")
        for m in self.testable_methods:
            lines.append(f"    {m.signature};")
        lines.append("}")
        return "\n".join(lines)

    def to_dict(self) -> dict[str, Any]:
        return {
            "class_name": self.name,
            "package": self.package,
            "kind": self.kind,
            "modifiers": self.modifiers,
            "extends": self.extends,
            "implements": self.implements,
            "type_parameters": self.type_parameters,
            "annotations": self.annotations,
            "javadoc": self.javadoc,
            "constructors": [
                {
                    "signature": c.signature,
                    "parameters": [{"name": p.name, "type": p.type} for p in c.parameters],
                    "throws": c.throws,
                    "javadoc": c.javadoc,
                }
                for c in self.constructors
            ],
            "methods": [
                {
                    "name": m.name,
                    "signature": m.signature,
                    "return_type": m.return_type,
                    "parameters": [{"name": p.name, "type": p.type} for p in m.parameters],
                    "modifiers": m.modifiers,
                    "throws": m.throws,
                    "annotations": m.annotations,
                    "javadoc": m.javadoc,
                    "cyclomatic_complexity": m.cyclomatic_complexity,
                }
                for m in self.methods
            ],
            "fields": [
                {
                    "name": f.name,
                    "type": f.type,
                    "modifiers": f.modifiers,
                    "value": f.initializer,
                }
                for f in self.fields
            ],
            "dependencies": {
                "internal": [
                    {"type": d.type_name, "qualified_name": d.qualified_name, "roles": d.roles}
                    for d in self.internal_dependencies
                ],
                "external": [
                    {"type": d.type_name, "artifact": d.artifact, "roles": d.roles}
                    for d in self.external_dependencies
                ],
            },
            "degraded_parse": self.degraded,
        }


_MODIFIER_ORDER = [
    "public",
    "protected",
    "private",
    "abstract",
    "static",
    "final",
    "synchronized",
    "native",
    "strictfp",
    "default",
    "transient",
    "volatile",
]


def _modifier_rank(modifier: str) -> int:
    try:
        return _MODIFIER_ORDER.index(modifier)
    except ValueError:
        return len(_MODIFIER_ORDER)
