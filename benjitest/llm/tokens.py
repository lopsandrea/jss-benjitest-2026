"""Token accounting and truncation helpers.

Used to enforce the context-window controls described under "Agent Orchestration
Details" (Section 3.1): the Repository Miner tree is capped at 2,000 tokens and
classes exceeding 4,000 tokens are split into sequentially processed chunks.
"""

from __future__ import annotations

import re
from collections.abc import Iterator

#: Empirical characters-per-token ratio for Java source under BPE tokenizers.
#: Java is denser than prose because of punctuation and camelCase splitting.
_CHARS_PER_TOKEN = 3.2

_WORD_RE = re.compile(r"\w+|[^\w\s]")


def count_tokens(text: str, model: str | None = None) -> int:
    """Estimate the token count of ``text``.

    Uses the provider's real tokenizer through LiteLLM when available, and falls
    back to a character-ratio heuristic otherwise. The fallback is deliberate:
    truncation limits are coarse budget controls, and requiring a tokenizer
    download for every provider would make the framework unusable offline.
    """
    if not text:
        return 0
    if model:
        try:
            from litellm import token_counter

            return int(token_counter(model=model, text=text))
        except Exception:  # noqa: BLE001 - any tokenizer failure falls back to the heuristic
            # Deliberately broad: LiteLLM raises provider-specific errors when a
            # tokenizer cannot be downloaded, and a token estimate must never be
            # the reason a campaign stops.
            pass
    return max(1, int(len(text) / _CHARS_PER_TOKEN))


def truncate_to_tokens(text: str, max_tokens: int, model: str | None = None) -> str:
    """Truncate ``text`` to approximately ``max_tokens``, on a line boundary.

    A truncation marker is appended so downstream agents (and anyone auditing a
    saved prompt) can tell that content was dropped.
    """
    if max_tokens <= 0:
        return ""
    if count_tokens(text, model) <= max_tokens:
        return text

    lines = text.splitlines()
    kept: list[str] = []
    budget = max_tokens
    for line in lines:
        cost = count_tokens(line + "\n", model)
        if cost > budget:
            break
        kept.append(line)
        budget -= cost

    if not kept:
        # A single line already exceeds the budget: cut it by characters.
        return text[: int(max_tokens * _CHARS_PER_TOKEN)] + "\n... [truncated]"
    dropped = len(lines) - len(kept)
    return "\n".join(kept) + f"\n... [truncated: {dropped} further line(s) omitted]"


def chunk_by_tokens(
    text: str, chunk_tokens: int, model: str | None = None
) -> list[str]:
    """Split ``text`` into chunks of at most ``chunk_tokens``, on line boundaries.

    Returns a single-element list when the text already fits, so callers can use
    the same code path regardless of size.
    """
    if chunk_tokens <= 0:
        raise ValueError("chunk_tokens must be positive")
    if count_tokens(text, model) <= chunk_tokens:
        return [text]

    chunks: list[str] = []
    current: list[str] = []
    budget = chunk_tokens
    for line in text.splitlines():
        cost = count_tokens(line + "\n", model)
        if cost > budget and current:
            chunks.append("\n".join(current))
            current, budget = [], chunk_tokens
        current.append(line)
        budget -= cost
    if current:
        chunks.append("\n".join(current))
    return chunks


def iter_java_chunks(source: str, chunk_tokens: int, model: str | None = None) -> Iterator[str]:
    """Yield source-code chunks, preferring method boundaries over blind splits.

    Splitting mid-method produces chunks that no analysis agent can reason about,
    so the text is first partitioned at top-level closing braces and the pieces
    are then packed into token-budgeted chunks.
    """
    if count_tokens(source, model) <= chunk_tokens:
        yield source
        return

    segments: list[str] = []
    buffer: list[str] = []
    depth = 0
    for line in source.splitlines():
        buffer.append(line)
        depth += line.count("{") - line.count("}")
        # Depth 1 == inside the class body; a return to depth 1 closes a member.
        if depth <= 1 and line.strip().endswith("}"):
            segments.append("\n".join(buffer))
            buffer = []
    if buffer:
        segments.append("\n".join(buffer))

    current: list[str] = []
    budget = chunk_tokens
    for segment in segments:
        cost = count_tokens(segment, model)
        if cost > budget and current:
            yield "\n".join(current)
            current, budget = [], chunk_tokens
        if cost > chunk_tokens:
            # A single member exceeds a whole chunk: fall back to line packing.
            yield from chunk_by_tokens(segment, chunk_tokens, model)
            continue
        current.append(segment)
        budget -= cost
    if current:
        yield "\n".join(current)
