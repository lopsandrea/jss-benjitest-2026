"""Extraction of structured payloads from free-form LLM responses.

Even with explicit "return only code" instructions, models wrap output in
markdown fences, prepend explanations, or emit reasoning preambles. The
extractors here are deliberately forgiving: a generation counted as a
compilation failure because of a stray fence would bias the reported
compilation rate.
"""

from __future__ import annotations

import json
import re

_FENCE_RE = re.compile(
    r"```(?P<lang>[A-Za-z0-9_+-]*)[ \t]*\r?\n(?P<body>.*?)(?:```|\Z)",
    re.DOTALL,
)
_PACKAGE_RE = re.compile(r"^\s*package\s+[\w.]+\s*;", re.MULTILINE)
_TYPE_DECL_RE = re.compile(
    r"^\s*(?:@\w+[^\n]*\s*)*(?:public\s+|final\s+|abstract\s+)*"
    r"(?:class|interface|enum|record)\s+(\w+)",
    re.MULTILINE,
)
#: Reasoning models emit a <think>...</think> preamble that must not reach javac.
_THINK_RE = re.compile(r"<think>.*?</think>", re.DOTALL | re.IGNORECASE)


def strip_reasoning(text: str) -> str:
    """Remove ``<think>`` blocks emitted by reasoning-tuned models (e.g. DeepSeek-R1)."""
    return _THINK_RE.sub("", text)


def _fenced_blocks(text: str) -> list[tuple[str, str]]:
    return [(m.group("lang").lower(), m.group("body")) for m in _FENCE_RE.finditer(text)]


def extract_java_code(response: str) -> str | None:
    """Return the Java test class contained in ``response``, or ``None``.

    Resolution order:

    1. A fenced block tagged ``java``.
    2. Any fenced block that looks like Java (has a package or type declaration).
    3. The raw response, trimmed to start at its ``package``/``import``/type
       declaration, when it looks like Java on its own.
    """
    text = strip_reasoning(response or "").strip()
    if not text:
        return None

    blocks = _fenced_blocks(text)
    java_blocks = [body for lang, body in blocks if lang in {"java", "jav"}]
    candidates = java_blocks or [body for _, body in blocks if _looks_like_java(body)]
    if candidates:
        # Prefer the block that actually declares a type; some responses open
        # with a fenced snippet of the class under test for reference.
        typed = [b for b in candidates if _TYPE_DECL_RE.search(b)]
        chosen = max(typed or candidates, key=len)
        return _trim_to_source_start(chosen).strip() or None

    if _looks_like_java(text):
        return _trim_to_source_start(text).strip() or None
    return None


def _looks_like_java(text: str) -> bool:
    return bool(_PACKAGE_RE.search(text) or _TYPE_DECL_RE.search(text))


def _trim_to_source_start(code: str) -> str:
    """Drop any prose preceding the first ``package``/``import``/type declaration."""
    starts = [m.start() for m in (_PACKAGE_RE.search(code),) if m]
    import_match = re.search(r"^\s*import\s+[\w.*]+\s*;", code, re.MULTILINE)
    if import_match:
        starts.append(import_match.start())
    type_match = _TYPE_DECL_RE.search(code)
    if type_match:
        starts.append(type_match.start())
    return code[min(starts):] if starts else code


def extract_test_class_name(java_code: str) -> str | None:
    """Return the name of the first declared type in ``java_code``."""
    match = _TYPE_DECL_RE.search(java_code or "")
    return match.group(1) if match else None


def extract_package(java_code: str) -> str | None:
    """Return the declared package of ``java_code``, or ``None`` for the default package."""
    match = re.search(r"^\s*package\s+([\w.]+)\s*;", java_code or "", re.MULTILINE)
    return match.group(1) if match else None


def extract_json(response: str) -> dict | list | None:
    """Return the first JSON document embedded in ``response``.

    Tries fenced ``json`` blocks first, then any fenced block, then a brace-
    balanced scan of the raw text.
    """
    text = strip_reasoning(response or "").strip()
    if not text:
        return None

    blocks = _fenced_blocks(text)
    ordered = [body for lang, body in blocks if lang == "json"]
    ordered += [body for lang, body in blocks if lang != "json"]
    ordered.append(text)

    for candidate in ordered:
        parsed = _try_parse_json(candidate)
        if parsed is not None:
            return parsed
    return None


def _try_parse_json(text: str) -> dict | list | None:
    text = text.strip()
    if not text:
        return None
    try:
        parsed = json.loads(text)
    except json.JSONDecodeError:
        pass
    else:
        return parsed if isinstance(parsed, (dict, list)) else None

    for opener, closer in (("{", "}"), ("[", "]")):
        start = text.find(opener)
        if start == -1:
            continue
        depth, in_string, escaped = 0, False, False
        for index in range(start, len(text)):
            char = text[index]
            if in_string:
                if escaped:
                    escaped = False
                elif char == "\\":
                    escaped = True
                elif char == '"':
                    in_string = False
                continue
            if char == '"':
                in_string = True
            elif char == opener:
                depth += 1
            elif char == closer:
                depth -= 1
                if depth == 0:
                    try:
                        return json.loads(text[start : index + 1])
                    except json.JSONDecodeError:
                        break
    return None


def extract_score(response: str) -> int | None:
    """Extract the Classifier Agent's effectiveness score ``S`` in {-1, 0, +1}.

    Accepts a bare integer, a JSON object with a ``score`` key, or the score
    embedded in prose (``"score: -1"``).
    """
    text = strip_reasoning(response or "").strip()
    if not text:
        return None

    payload = extract_json(text)
    if isinstance(payload, dict):
        for key in ("score", "effectiveness_score", "S"):
            if key in payload:
                try:
                    value = int(payload[key])
                except (TypeError, ValueError):
                    continue
                if value in (-1, 0, 1):
                    return value

    match = re.search(
        r"(?:score|effectiveness)\D{0,20}?(-1|\+1|[01])", text, re.IGNORECASE
    )
    if match:
        return int(match.group(1).replace("+", ""))

    stripped = text.strip().strip(".`\"' ")
    if stripped in {"-1", "0", "1", "+1"}:
        return int(stripped.replace("+", ""))
    return None
