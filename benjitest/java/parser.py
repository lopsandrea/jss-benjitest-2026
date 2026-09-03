"""Java source parsing backing the analysis agents.

The primary parser is ``javalang``. Because ``javalang`` targets Java 8 grammar
and the Classes2Test corpus spans Java 8 through 21+ (records, sealed types,
switch expressions, text blocks), a regex-based extractor takes over whenever the
AST parse fails. Degraded parses are flagged on :class:`JavaClass.degraded` so a
downstream analysis is never silently based on partial structure.
"""

from __future__ import annotations

import logging
import re
from pathlib import Path

from .model import (
    Dependency,
    DependencyKind,
    JavaClass,
    JavaField,
    JavaMethod,
    JavaParameter,
)

logger = logging.getLogger(__name__)

_PACKAGE_RE = re.compile(r"^\s*package\s+([\w.]+)\s*;", re.MULTILINE)
_IMPORT_RE = re.compile(r"^\s*import\s+(static\s+)?([\w.*]+)\s*;", re.MULTILINE)
_TYPE_DECL_RE = re.compile(
    r"(?P<modifiers>(?:(?:public|protected|private|abstract|final|static|sealed|non-sealed)\s+)*)"
    r"(?P<kind>class|interface|enum|record|@interface)\s+"
    r"(?P<name>\w+)",
)
_METHOD_RE = re.compile(
    r"^[ \t]*(?P<modifiers>(?:(?:public|protected|private|static|final|abstract|synchronized|"
    r"native|default|strictfp)\s+)*)"
    r"(?P<generics><[^{;=]*?>\s+)?"
    r"(?P<return>[\w.$<>\[\], ?]+?)\s+"
    r"(?P<name>\w+)\s*\((?P<params>[^)]*)\)"
    r"(?P<throws>\s*throws\s+[\w.,\s]+?)?\s*(?P<end>\{|;)",
    re.MULTILINE,
)
_FIELD_RE = re.compile(
    r"^[ \t]*(?P<modifiers>(?:(?:public|protected|private|static|final|transient|volatile)\s+)+)"
    r"(?P<type>[\w.$<>\[\], ?]+?)\s+(?P<name>\w+)\s*(?:=\s*(?P<init>[^;]+))?;",
    re.MULTILINE,
)
_JAVADOC_RE = re.compile(r"/\*\*(.*?)\*/", re.DOTALL)
_ANNOTATION_RE = re.compile(r"@(\w+)(?:\([^)]*\))?")
_LINE_COMMENT_RE = re.compile(r"//[^\n]*")
_BLOCK_COMMENT_RE = re.compile(r"/\*.*?\*/", re.DOTALL)
_STRING_RE = re.compile(r'"""(?:.|\n)*?"""|"(?:\\.|[^"\\])*"|\'(?:\\.|[^\'\\])*\'')

#: Java language keywords and control constructs that must never be mistaken for
#: a method name or a dependency type by the regex fallback.
_KEYWORDS = frozenset(
    {
        "if", "for", "while", "switch", "catch", "return", "new", "throw", "do",
        "else", "try", "finally", "synchronized", "assert", "case", "default",
        "instanceof", "super", "this", "yield", "record", "sealed", "permits",
    }
)

#: Package prefixes considered part of the JDK rather than project or 3rd-party.
_JDK_PREFIXES = ("java.", "javax.", "jakarta.annotation", "sun.", "jdk.")

#: Types the JDK provides without an import; treated as JDK dependencies.
_JAVA_LANG_TYPES = frozenset(
    {
        "String", "Integer", "Long", "Double", "Float", "Boolean", "Byte", "Short",
        "Character", "Object", "Number", "Math", "System", "Thread", "Runnable",
        "Exception", "RuntimeException", "Error", "Throwable", "Class", "Enum",
        "Iterable", "Comparable", "CharSequence", "StringBuilder", "StringBuffer",
        "IllegalArgumentException", "IllegalStateException", "NullPointerException",
        "UnsupportedOperationException", "IndexOutOfBoundsException", "Void",
    }
)

_PRIMITIVES = frozenset(
    {"int", "long", "double", "float", "boolean", "byte", "short", "char", "void", "var"}
)

class JavaParseError(ValueError):
    """Raised when a source file cannot be parsed by any available strategy."""


def parse_class(
    source: str,
    *,
    source_path: str | Path | None = None,
    target_class: str | None = None,
) -> JavaClass:
    """Parse ``source`` and return the primary (or named) type declaration.

    Args:
        source: Java source text.
        source_path: Path recorded on the result, used for reporting.
        target_class: Return this type instead of the first top-level one, for
            files declaring several types.

    Raises:
        JavaParseError: If no type declaration can be recovered.
    """
    if not source or not source.strip():
        raise JavaParseError("empty source")

    parsed = _parse_with_javalang(source, target_class)
    if parsed is None:
        parsed = _parse_with_regex(source, target_class)
    if parsed is None:
        raise JavaParseError(
            f"no type declaration found in {source_path or '<source>'}"
        )

    parsed.source = source
    parsed.source_path = str(source_path) if source_path else None
    if not parsed.package:
        match = _PACKAGE_RE.search(source)
        parsed.package = match.group(1) if match else None
    if not parsed.imports:
        parsed.imports = [m.group(2) for m in _IMPORT_RE.finditer(source)]
    return parsed


def parse_file(path: str | Path, *, target_class: str | None = None) -> JavaClass:
    """Parse a ``.java`` file from disk."""
    file_path = Path(path)
    source = file_path.read_text(encoding="utf-8", errors="replace")
    return parse_class(
        source,
        source_path=file_path,
        target_class=target_class or file_path.stem,
    )


# ----------------------------------------------------------------------
# javalang-backed parsing
# ----------------------------------------------------------------------
def _parse_with_javalang(source: str, target_class: str | None) -> JavaClass | None:
    try:
        import javalang
    except ImportError:  # pragma: no cover - optional at import time
        logger.debug("javalang not installed; using regex fallback")
        return None

    try:
        tree = javalang.parse.parse(source)
    except Exception as exc:  # noqa: BLE001 - javalang raises many error types
        logger.debug("javalang parse failed (%s); using regex fallback", exc)
        return None

    declarations = [
        node
        for node in getattr(tree, "types", [])
        if node.__class__.__name__
        in {
            "ClassDeclaration",
            "InterfaceDeclaration",
            "EnumDeclaration",
            "RecordDeclaration",
            "AnnotationDeclaration",
        }
    ]
    if not declarations:
        return None

    declaration = _select_declaration(declarations, target_class, lambda n: n.name)
    lines = source.splitlines()

    java_class = JavaClass(
        name=declaration.name,
        package=tree.package.name if tree.package else None,
        modifiers=sorted(declaration.modifiers or []),
        kind=_javalang_kind(declaration),
        javadoc=_clean_javadoc(getattr(declaration, "documentation", None)),
        annotations=[_annotation_name(a) for a in getattr(declaration, "annotations", []) or []],
        imports=[imp.path for imp in (tree.imports or [])],
        type_parameters=[
            tp.name for tp in (getattr(declaration, "type_parameters", None) or [])
        ],
    )

    extends = getattr(declaration, "extends", None)
    if extends is not None:
        if isinstance(extends, list):  # interfaces may extend several types
            java_class.implements.extend(_type_name(e) for e in extends)
        else:
            java_class.extends = _type_name(extends)
    java_class.implements.extend(
        _type_name(i) for i in (getattr(declaration, "implements", None) or [])
    )

    for member in getattr(declaration, "body", None) or []:
        cls_name = member.__class__.__name__
        if cls_name == "MethodDeclaration":
            java_class.methods.append(_javalang_method(member, lines))
        elif cls_name == "ConstructorDeclaration":
            java_class.constructors.append(_javalang_method(member, lines, constructor=True))
        elif cls_name == "FieldDeclaration":
            java_class.fields.extend(_javalang_fields(member))
        elif cls_name in {"ClassDeclaration", "InterfaceDeclaration", "EnumDeclaration"}:
            java_class.nested_classes.append(member.name)

    # Records expose their components as accessors; surface them as fields so
    # the black-box view of a record is not empty.
    for component in getattr(declaration, "fields", None) or []:
        if component.__class__.__name__ == "RecordComponent":
            java_class.fields.append(
                JavaField(name=component.name, type=_type_name(component.type),
                          modifiers=["private", "final"])
            )

    return java_class


def _select_declaration(declarations, target_class, name_of):
    if target_class:
        for declaration in declarations:
            if name_of(declaration) == target_class:
                return declaration
    # Prefer a public type; otherwise the first declared one.
    for declaration in declarations:
        if "public" in (getattr(declaration, "modifiers", None) or set()):
            return declaration
    return declarations[0]


def _javalang_kind(declaration) -> str:
    return {
        "ClassDeclaration": "class",
        "InterfaceDeclaration": "interface",
        "EnumDeclaration": "enum",
        "RecordDeclaration": "record",
        "AnnotationDeclaration": "annotation",
    }.get(declaration.__class__.__name__, "class")


def _javalang_method(node, lines: list[str], *, constructor: bool = False) -> JavaMethod:
    parameters = [
        JavaParameter(
            name=p.name,
            type=_type_name(p.type),
            annotations=[_annotation_name(a) for a in (p.annotations or [])],
            varargs=bool(getattr(p, "varargs", False)),
        )
        for p in (node.parameters or [])
    ]
    start_line = node.position.line if node.position else None
    body = _extract_member_source(lines, start_line) if start_line else None

    return JavaMethod(
        name=node.name,
        return_type="" if constructor else _type_name(getattr(node, "return_type", None)),
        parameters=parameters,
        modifiers=sorted(node.modifiers or []),
        throws=list(node.throws or []),
        annotations=[_annotation_name(a) for a in (node.annotations or [])],
        javadoc=_clean_javadoc(getattr(node, "documentation", None)),
        type_parameters=[tp.name for tp in (getattr(node, "type_parameters", None) or [])],
        start_line=start_line,
        end_line=(start_line + body.count("\n")) if (start_line and body) else None,
        body=body,
        cyclomatic_complexity=cyclomatic_complexity(body or ""),
        is_constructor=constructor,
    )


def _javalang_fields(node) -> list[JavaField]:
    modifiers = sorted(node.modifiers or [])
    annotations = [_annotation_name(a) for a in (node.annotations or [])]
    javadoc = _clean_javadoc(getattr(node, "documentation", None))
    type_name = _type_name(node.type)
    fields = []
    for declarator in node.declarators:
        initializer = None
        if declarator.initializer is not None:
            initializer = _literal_value(declarator.initializer)
        fields.append(
            JavaField(
                name=declarator.name,
                type=type_name,
                modifiers=modifiers,
                annotations=annotations,
                initializer=initializer,
                javadoc=javadoc,
            )
        )
    return fields


def _type_name(node) -> str:
    """Render a javalang type node back to source-like text."""
    if node is None:
        return "void"
    if isinstance(node, str):
        return node
    name = getattr(node, "name", None) or node.__class__.__name__
    arguments = getattr(node, "arguments", None)
    if arguments:
        rendered = []
        for argument in arguments:
            if getattr(argument, "type", None) is not None:
                rendered.append(_type_name(argument.type))
            else:
                rendered.append("?")
        name = f"{name}<{', '.join(rendered)}>"
    dimensions = getattr(node, "dimensions", None)
    if dimensions:
        name += "[]" * len(dimensions)
    sub_type = getattr(node, "sub_type", None)
    if sub_type is not None:
        name = f"{name}.{_type_name(sub_type)}"
    return name


def _annotation_name(node) -> str:
    name = getattr(node, "name", None)
    return f"@{name}" if name else "@?"


def _literal_value(node) -> str | None:
    value = getattr(node, "value", None)
    return str(value) if value is not None else None


def _clean_javadoc(raw: str | None) -> str | None:
    """Strip Javadoc comment syntax, keeping the prose and tags."""
    if not raw:
        return None
    text = raw.strip()
    text = text.removeprefix("/**")
    text = text.removesuffix("*/")
    lines = []
    for line in text.splitlines():
        stripped = line.strip()
        if stripped.startswith("*"):
            stripped = stripped[1:].strip()
        lines.append(stripped)
    cleaned = "\n".join(lines).strip()
    return cleaned or None


def _extract_member_source(lines: list[str], start_line: int) -> str | None:
    """Return the source of the member starting at ``start_line`` (1-indexed)."""
    index = start_line - 1
    if index < 0 or index >= len(lines):
        return None
    depth = 0
    started = False
    collected: list[str] = []
    for line in lines[index:]:
        collected.append(line)
        # Ignore braces inside strings and comments when tracking depth.
        sanitized = _strip_literals(line)
        depth += sanitized.count("{") - sanitized.count("}")
        if "{" in sanitized:
            started = True
        if started and depth <= 0:
            break
        if not started and sanitized.rstrip().endswith(";"):
            break  # abstract or interface method: no body
    return "\n".join(collected)


def _strip_literals(text: str) -> str:
    text = _STRING_RE.sub('""', text)
    text = _LINE_COMMENT_RE.sub("", text)
    return text


def strip_comments(source: str) -> str:
    """Remove comments and string literals -- used before structural scanning."""
    without_strings = _STRING_RE.sub('""', source)
    without_block = _BLOCK_COMMENT_RE.sub("", without_strings)
    return _LINE_COMMENT_RE.sub("", without_block)


def cyclomatic_complexity(source: str) -> int:
    """McCabe complexity of a code fragment.

    Counts decision points (``if``, ``for``, ``while``, ``case``, ``catch``), the
    short-circuit operators, and ternaries, plus one for the entry edge. Comments
    and string literals are removed first so that a ``"?"`` inside a message does
    not inflate the count.
    """
    if not source:
        return 1
    sanitized = strip_comments(source)
    # Ternaries: count '?' occurrences, ignoring '?.' and generic wildcards.
    decisions = len(re.findall(r"\b(?:if|for|while|case|catch)\b", sanitized))
    decisions += sanitized.count("&&") + sanitized.count("||")
    decisions += len(re.findall(r"\?(?![.:])", sanitized.replace("<?", "<")))
    return decisions + 1


# ----------------------------------------------------------------------
# Regex fallback
# ----------------------------------------------------------------------
def _parse_with_regex(source: str, target_class: str | None) -> JavaClass | None:
    """Best-effort structural extraction for sources javalang cannot parse."""
    sanitized = strip_comments(source)
    declarations = list(_TYPE_DECL_RE.finditer(sanitized))
    if not declarations:
        return None

    declaration = None
    if target_class:
        declaration = next(
            (d for d in declarations if d.group("name") == target_class), None
        )
    if declaration is None:
        declaration = next(
            (d for d in declarations if "public" in d.group("modifiers")), declarations[0]
        )

    kind = declaration.group("kind")
    java_class = JavaClass(
        name=declaration.group("name"),
        modifiers=sorted(declaration.group("modifiers").split()),
        kind="annotation" if kind == "@interface" else kind,
        degraded=True,
    )

    header_end = sanitized.find("{", declaration.end())
    header = sanitized[declaration.end() : header_end if header_end != -1 else len(sanitized)]
    extends_match = re.search(r"\bextends\s+([\w.<>, ]+?)(?:\bimplements\b|$)", header)
    if extends_match:
        java_class.extends = extends_match.group(1).strip()
    implements_match = re.search(r"\bimplements\s+([\w.<>, ]+)$", header.strip())
    if implements_match:
        java_class.implements = [
            part.strip() for part in implements_match.group(1).split(",") if part.strip()
        ]

    body_start = header_end + 1 if header_end != -1 else 0
    body = sanitized[body_start:]
    original_lines = source.splitlines()

    for match in _METHOD_RE.finditer(body):
        name = match.group("name")
        return_type = match.group("return").strip()
        if name in _KEYWORDS or return_type.split()[-1] in _KEYWORDS:
            continue
        modifiers = sorted(match.group("modifiers").split())
        is_constructor = name == java_class.name
        throws_group = match.group("throws")
        method = JavaMethod(
            name=name,
            return_type="" if is_constructor else return_type,
            parameters=_parse_parameters(match.group("params")),
            modifiers=modifiers,
            throws=(
                [t.strip() for t in throws_group.replace("throws", "").split(",") if t.strip()]
                if throws_group
                else []
            ),
            is_constructor=is_constructor,
        )
        # Recover the real source line so white-box hints keep line references.
        line_number = body[: match.start()].count("\n") + sanitized[:body_start].count("\n") + 1
        method.start_line = line_number
        method.body = _extract_member_source(original_lines, line_number)
        method.cyclomatic_complexity = cyclomatic_complexity(method.body or "")
        if is_constructor:
            java_class.constructors.append(method)
        else:
            java_class.methods.append(method)

    for match in _FIELD_RE.finditer(body):
        java_class.fields.append(
            JavaField(
                name=match.group("name"),
                type=match.group("type").strip(),
                modifiers=sorted(match.group("modifiers").split()),
                initializer=(match.group("init") or "").strip() or None,
            )
        )

    java_class.javadoc = _clean_javadoc(_leading_javadoc(source, declaration.start()))
    return java_class


def _leading_javadoc(source: str, position: int) -> str | None:
    """Return the Javadoc block immediately preceding ``position``, if any."""
    preceding = source[:position]
    matches = list(_JAVADOC_RE.finditer(preceding))
    if not matches:
        return None
    last = matches[-1]
    between = preceding[last.end():]
    # Only accept it if nothing but whitespace and annotations sits in between.
    if re.fullmatch(r"[\s]*(?:@\w+(?:\([^)]*\))?\s*)*", between):
        return last.group(0)
    return None


def _parse_parameters(text: str) -> list[JavaParameter]:
    """Parse a parameter list, respecting generics nesting."""
    text = text.strip()
    if not text:
        return []

    parts, depth, current = [], 0, []
    for char in text:
        if char in "<([":
            depth += 1
        elif char in ">)]":
            depth -= 1
        if char == "," and depth == 0:
            parts.append("".join(current))
            current = []
        else:
            current.append(char)
    if current:
        parts.append("".join(current))

    parameters: list[JavaParameter] = []
    for part in parts:
        part = part.strip()
        if not part:
            continue
        annotations = [f"@{m.group(1)}" for m in _ANNOTATION_RE.finditer(part)]
        part = _ANNOTATION_RE.sub("", part).strip()
        part = re.sub(r"\bfinal\s+", "", part).strip()
        varargs = "..." in part
        part = part.replace("...", "")
        tokens = part.rsplit(" ", 1)
        if len(tokens) != 2:
            continue
        parameters.append(
            JavaParameter(
                name=tokens[1].strip(),
                type=tokens[0].strip(),
                annotations=annotations,
                varargs=varargs,
            )
        )
    return parameters


# ----------------------------------------------------------------------
# Dependency resolution
# ----------------------------------------------------------------------
def resolve_dependencies(
    java_class: JavaClass,
    *,
    project_types: dict[str, str] | None = None,
    external_artifacts: dict[str, str] | None = None,
) -> list[Dependency]:
    """Categorise every type referenced by ``java_class``.

    This implements the Class Under Test Analyzer's core duty (Appendix B):
    separating **internal** project dependencies -- whose public signatures can be
    extracted to mitigate hallucinated calls -- from **external** third-party
    libraries, which inform mocking decisions.

    Args:
        java_class: The parsed class under test.
        project_types: Map of simple type name -> fully-qualified name for every
            type in the project, as produced by the Repository Miner.
        external_artifacts: Map of package prefix -> build coordinate, derived
            from the project's build file.

    Returns:
        The dependency list, also assigned to ``java_class.dependencies``.
    """
    project_types = project_types or {}
    external_artifacts = external_artifacts or {}
    import_map = _import_map(java_class.imports)

    found: dict[str, Dependency] = {}

    def register(type_name: str, role: str) -> None:
        for simple in _base_type_names(type_name):
            if simple in _PRIMITIVES or not simple or simple[0].islower():
                continue
            if simple == java_class.name:
                continue
            dependency = found.get(simple)
            if dependency is None:
                qualified = import_map.get(simple) or project_types.get(simple)
                dependency = Dependency(
                    type_name=simple,
                    qualified_name=qualified,
                    kind=_classify(simple, qualified, java_class.package, project_types),
                )
                if dependency.kind is DependencyKind.EXTERNAL and qualified:
                    dependency.artifact = _match_artifact(qualified, external_artifacts)
                found[simple] = dependency
            if role not in dependency.roles:
                dependency.roles.append(role)

    for field_ in java_class.fields:
        register(field_.type, "field")
    for constructor in java_class.constructors:
        for parameter in constructor.parameters:
            register(parameter.type, "constructor-injected")
        for thrown in constructor.throws:
            register(thrown, "throws")
    for method in java_class.methods:
        register(method.return_type, "return-type")
        for parameter in method.parameters:
            register(parameter.type, "parameter")
        for thrown in method.throws:
            register(thrown, "throws")
    if java_class.extends:
        register(java_class.extends, "superclass")
    for interface in java_class.implements:
        register(interface, "interface")
    for annotation in java_class.annotations:
        register(annotation.lstrip("@"), "annotation")

    # Types that only appear inside method bodies (locals, instantiations, static
    # calls) still matter: they are exactly the symbols a model is most likely to
    # hallucinate, so the analyzer surfaces them too.
    for method in java_class.methods + java_class.constructors:
        for type_name in _body_referenced_types(method.body):
            register(type_name, "body-reference")

    dependencies = sorted(found.values(), key=lambda d: (d.kind.value, d.type_name))
    java_class.dependencies = dependencies
    return dependencies


def _import_map(imports: list[str]) -> dict[str, str]:
    mapping: dict[str, str] = {}
    for path in imports:
        if path.endswith(".*"):
            continue
        mapping[path.rsplit(".", 1)[-1]] = path
    return mapping


def _classify(
    simple: str,
    qualified: str | None,
    package: str | None,
    project_types: dict[str, str],
) -> DependencyKind:
    if simple in _JAVA_LANG_TYPES:
        return DependencyKind.JDK
    if qualified:
        if qualified.startswith(_JDK_PREFIXES):
            return DependencyKind.JDK
        if simple in project_types and project_types[simple] == qualified:
            return DependencyKind.INTERNAL
        # Same top-level package as the class under test: still project code.
        if package and _shares_root_package(qualified, package):
            return DependencyKind.INTERNAL
        return DependencyKind.EXTERNAL
    if simple in project_types:
        return DependencyKind.INTERNAL
    # No import and not a known project type: same-package project class.
    return DependencyKind.INTERNAL if package else DependencyKind.UNKNOWN


def _shares_root_package(qualified: str, package: str) -> bool:
    """Whether two packages share a meaningful root (e.g. ``com.example``)."""
    a = qualified.split(".")
    b = package.split(".")
    depth = 3 if a[:1] in (["com"], ["org"], ["net"], ["io"]) else 2
    return a[:depth] == b[:depth]


def _match_artifact(qualified: str, artifacts: dict[str, str]) -> str | None:
    best: tuple[int, str] | None = None
    for prefix, coordinate in artifacts.items():
        if qualified.startswith(prefix) and (best is None or len(prefix) > best[0]):
            best = (len(prefix), coordinate)
    return best[1] if best else None


#: Type references recoverable from a method body without full type inference:
#: instantiations, local declarations, static calls, catch clauses, and casts.
_BODY_TYPE_PATTERNS = (
    re.compile(r"\bnew\s+([A-Z]\w*)\s*[(<]"),
    re.compile(r"\bcatch\s*\(\s*(?:final\s+)?([A-Z][\w.]*(?:\s*\|\s*[A-Z][\w.]*)*)\s+\w+\s*\)"),
    re.compile(r"^\s*(?:final\s+)?([A-Z][\w.]*(?:<[^;=]*>)?)\s+\w+\s*[=;]", re.MULTILINE),
    re.compile(r"\b([A-Z]\w*)\.\w+\s*\("),
    re.compile(r"\bthrow\s+new\s+([A-Z]\w*)"),
    # for-each loop variable: for (OrderItem item : order.getItems())
    re.compile(r"\bfor\s*\(\s*(?:final\s+)?([A-Z][\w.]*(?:<[^)]*>)?)\s+\w+\s*:"),
)


def _body_referenced_types(body: str | None) -> list[str]:
    """Extract type names referenced inside a method body."""
    if not body:
        return []
    sanitized = strip_comments(body)
    names: list[str] = []
    for pattern in _BODY_TYPE_PATTERNS:
        for match in pattern.finditer(sanitized):
            names.extend(_base_type_names(match.group(1).replace("|", " ")))
    return names


def _base_type_names(type_name: str) -> list[str]:
    """Split a possibly generic/array type into its constituent simple names.

    ``Map<String, List<Order>>[]`` yields ``['Map', 'String', 'List', 'Order']``.
    """
    if not type_name:
        return []
    cleaned = type_name.replace("[]", "").replace("...", "")
    tokens = re.split(r"[<>,\s]+", cleaned)
    names = []
    for token in tokens:
        token = token.strip().lstrip("?").strip()
        if not token or token in {"extends", "super"}:
            continue
        # Keep only the simple name of a qualified reference.
        names.append(token.rsplit(".", 1)[-1])
    return names
