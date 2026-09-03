"""LLM Interaction Layer (Section 3.1, module 4 of the architecture).

Provides a single unified entry point to every evaluated backend through
LiteLLM, so that OpenAI, Google AI, xAI and locally hosted Ollama models are
driven by identical code. The layer owns prompt dispatch, sampling-parameter
normalisation, retries, response caching, and token accounting.
"""

from __future__ import annotations

import logging
import os
import random
import re
import threading
import time
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any

from ..config.schema import LLMConfig
from .cache import ResponseCache, request_fingerprint

logger = logging.getLogger(__name__)

#: Providers whose API accepts a `seed` parameter. Per Section 4.7, the OpenAI
#: reasoning models (o3, o4-mini) and the Gemini family do not officially
#: support it, so only temperature=0 is applied for those.
_SEED_CAPABLE_PROVIDERS = {"openai", "azure", "ollama", "xai", "openrouter", "together"}
_SEED_INCAPABLE_MODEL_RE = re.compile(r"^(o1|o3|o4|gemini)", re.IGNORECASE)

#: Reasoning models reject an explicit `temperature`; sending one is a 400.
_TEMPERATURE_INCAPABLE_MODEL_RE = re.compile(r"^(o1|o3|o4)", re.IGNORECASE)

#: Maps the `provider` field of the YAML onto the LiteLLM route prefix.
_PROVIDER_PREFIX = {
    "openai": "",
    "google-ai": "gemini/",
    "google": "gemini/",
    "gemini": "gemini/",
    "vertex-ai": "vertex_ai/",
    "ollama": "ollama/",
    "xai": "xai/",
    "anthropic": "anthropic/",
    "azure": "azure/",
    "openrouter": "openrouter/",
    "together": "together_ai/",
}


class LLMError(RuntimeError):
    """Raised when a completion cannot be obtained after all retries."""


@dataclass(slots=True)
class LLMResponse:
    """A single completion, with the accounting needed for the cost table."""

    text: str
    model: str
    prompt_tokens: int = 0
    completion_tokens: int = 0
    latency_seconds: float = 0.0
    cached: bool = False
    finish_reason: str | None = None
    raw: dict[str, Any] | None = None

    @property
    def total_tokens(self) -> int:
        return self.prompt_tokens + self.completion_tokens


@dataclass(slots=True)
class UsageAccumulator:
    """Thread-safe running totals feeding the computational-cost breakdown."""

    calls: int = 0
    cached_calls: int = 0
    prompt_tokens: int = 0
    completion_tokens: int = 0
    failures: int = 0
    seconds: float = 0.0
    _lock: threading.Lock = field(default_factory=threading.Lock, repr=False)

    def record(self, response: LLMResponse) -> None:
        with self._lock:
            self.calls += 1
            if response.cached:
                self.cached_calls += 1
            self.prompt_tokens += response.prompt_tokens
            self.completion_tokens += response.completion_tokens
            self.seconds += response.latency_seconds

    def record_failure(self) -> None:
        with self._lock:
            self.failures += 1

    def snapshot(self) -> dict[str, float | int]:
        with self._lock:
            return {
                "calls": self.calls,
                "cached_calls": self.cached_calls,
                "prompt_tokens": self.prompt_tokens,
                "completion_tokens": self.completion_tokens,
                "total_tokens": self.prompt_tokens + self.completion_tokens,
                "failures": self.failures,
                "seconds": round(self.seconds, 2),
            }


class LLMLayer:
    """Unified interface to every configured LLM backend.

    Args:
        cache_dir: Directory backing the response cache; ``None`` disables it.
        max_retries: Attempts per request before raising :class:`LLMError`.
        transcript_dir: When set, every prompt/response pair is written here
            (``logging.save_llm_responses`` in the YAML), which is what makes a
            run auditable after the fact.
    """

    def __init__(
        self,
        *,
        cache_dir: str | Path | None = None,
        max_retries: int = 5,
        base_backoff: float = 2.0,
        transcript_dir: str | Path | None = None,
        request_timeout: int = 600,
    ) -> None:
        self.cache = ResponseCache(cache_dir, enabled=cache_dir is not None) if cache_dir else None
        self.max_retries = max_retries
        self.base_backoff = base_backoff
        self.request_timeout = request_timeout
        self.transcript_dir = Path(transcript_dir) if transcript_dir else None
        if self.transcript_dir:
            self.transcript_dir.mkdir(parents=True, exist_ok=True)
        self.usage = UsageAccumulator()
        self._transcript_lock = threading.Lock()
        self._completion = None

    # ------------------------------------------------------------------
    # Request construction
    # ------------------------------------------------------------------
    @staticmethod
    def resolve_model_id(llm: LLMConfig) -> str:
        """Return the LiteLLM route for ``llm`` (e.g. ``gemini/gemini-1.5-pro``)."""
        model = llm.model
        # An explicit prefix in the model string always wins.
        if "/" in model and model.split("/", 1)[0] in {
            p.rstrip("/") for p in _PROVIDER_PREFIX.values() if p
        }:
            return model
        prefix = _PROVIDER_PREFIX.get((llm.provider or "").lower())
        if prefix is None:
            # Unknown provider: pass through and let LiteLLM route it.
            return model
        return f"{prefix}{model}"

    @classmethod
    def supports_seed(cls, llm: LLMConfig) -> bool:
        """Whether ``seed`` is forwarded for this backend (Section 4.7)."""
        if _SEED_INCAPABLE_MODEL_RE.match(llm.model.split("/")[-1]):
            return False
        return (llm.provider or "").lower() in _SEED_CAPABLE_PROVIDERS

    @classmethod
    def supports_temperature(cls, llm: LLMConfig) -> bool:
        return not _TEMPERATURE_INCAPABLE_MODEL_RE.match(llm.model.split("/")[-1])

    def build_request(
        self,
        llm: LLMConfig,
        messages: list[dict[str, str]],
        **overrides: Any,
    ) -> dict[str, Any]:
        """Assemble the LiteLLM keyword arguments for a completion request."""
        request: dict[str, Any] = {
            "model": self.resolve_model_id(llm),
            "messages": messages,
        }
        if self.supports_temperature(llm):
            request["temperature"] = llm.temperature
        if llm.seed is not None and self.supports_seed(llm):
            request["seed"] = llm.seed
        if llm.max_tokens:
            request["max_tokens"] = llm.max_tokens
        if (llm.provider or "").lower() == "ollama":
            base = llm.extra.get("api_base") or os.environ.get("OLLAMA_API_BASE")
            if base:
                request["api_base"] = base
        request.update(llm.extra)
        request.update(overrides)
        return request

    # ------------------------------------------------------------------
    # Completion
    # ------------------------------------------------------------------
    def complete(
        self,
        llm: LLMConfig,
        *,
        system: str | None = None,
        user: str,
        tag: str = "",
        **overrides: Any,
    ) -> LLMResponse:
        """Run a single-turn completion.

        Args:
            llm: Backend configuration.
            system: Optional system message (an agent's role/goal/backstory).
            user: The task prompt.
            tag: Short label recorded in the transcript, e.g. ``"test_developer"``.

        Raises:
            LLMError: If every retry failed.
        """
        messages: list[dict[str, str]] = []
        if system:
            messages.append({"role": "system", "content": system})
        messages.append({"role": "user", "content": user})
        return self.chat(llm, messages, tag=tag, **overrides)

    def chat(
        self,
        llm: LLMConfig,
        messages: list[dict[str, str]],
        *,
        tag: str = "",
        **overrides: Any,
    ) -> LLMResponse:
        """Run a multi-turn completion with caching and retries."""
        request = self.build_request(llm, messages, **overrides)
        key = request_fingerprint(request)

        if self.cache is not None:
            hit = self.cache.get(key)
            if hit is not None:
                response = LLMResponse(
                    text=hit.get("text", ""),
                    model=request["model"],
                    prompt_tokens=hit.get("prompt_tokens", 0),
                    completion_tokens=hit.get("completion_tokens", 0),
                    cached=True,
                    finish_reason=hit.get("finish_reason"),
                )
                self.usage.record(response)
                return response

        response = self._call_with_retries(request, tag=tag)

        if self.cache is not None:
            self.cache.put(
                key,
                {
                    "text": response.text,
                    "prompt_tokens": response.prompt_tokens,
                    "completion_tokens": response.completion_tokens,
                    "finish_reason": response.finish_reason,
                },
            )
        self.usage.record(response)
        self._write_transcript(tag, llm, messages, response)
        return response

    def _call_with_retries(self, request: dict[str, Any], *, tag: str) -> LLMResponse:
        completion = self._load_completion()
        last_error: Exception | None = None

        for attempt in range(1, self.max_retries + 1):
            started = time.monotonic()
            try:
                raw = completion(timeout=self.request_timeout, **request)
            except Exception as exc:  # noqa: BLE001 - provider errors are opaque
                last_error = exc
                self.usage.record_failure()
                if attempt == self.max_retries or not _is_retryable(exc):
                    break
                delay = self.base_backoff ** attempt + random.uniform(0, 1)
                logger.warning(
                    "LLM call failed (%s, attempt %d/%d): %s; retrying in %.1fs",
                    tag or request["model"],
                    attempt,
                    self.max_retries,
                    exc,
                    delay,
                )
                time.sleep(delay)
                continue

            elapsed = time.monotonic() - started
            return _to_response(raw, request["model"], elapsed)

        raise LLMError(
            f"LLM request for '{tag or request['model']}' failed after "
            f"{self.max_retries} attempt(s): {last_error}"
        ) from last_error

    def _load_completion(self):
        if self._completion is None:
            try:
                from litellm import completion
            except ImportError as exc:  # pragma: no cover - dependency missing
                raise LLMError(
                    "litellm is required for LLM calls; install it with 'pip install litellm'"
                ) from exc
            self._completion = completion
        return self._completion

    def _write_transcript(
        self,
        tag: str,
        llm: LLMConfig,
        messages: list[dict[str, str]],
        response: LLMResponse,
    ) -> None:
        if self.transcript_dir is None:
            return
        import json
        from datetime import datetime, timezone

        record = {
            "timestamp": datetime.now(timezone.utc).isoformat(),
            "tag": tag,
            "llm": llm.name,
            "model": response.model,
            "messages": messages,
            "response": response.text,
            "prompt_tokens": response.prompt_tokens,
            "completion_tokens": response.completion_tokens,
            "latency_seconds": round(response.latency_seconds, 3),
        }
        path = self.transcript_dir / f"{llm.name}.jsonl"
        with self._transcript_lock, path.open("a", encoding="utf-8") as handle:
            handle.write(json.dumps(record, ensure_ascii=False) + "\n")


def _to_response(raw: Any, model: str, elapsed: float) -> LLMResponse:
    """Normalise a LiteLLM ``ModelResponse`` into an :class:`LLMResponse`."""
    text = ""
    finish_reason = None
    try:
        choice = raw.choices[0]
        text = (getattr(choice.message, "content", None) or "").strip()
        finish_reason = getattr(choice, "finish_reason", None)
    except (AttributeError, IndexError, TypeError):
        text = str(raw)

    usage = getattr(raw, "usage", None)
    prompt_tokens = int(getattr(usage, "prompt_tokens", 0) or 0)
    completion_tokens = int(getattr(usage, "completion_tokens", 0) or 0)

    return LLMResponse(
        text=text,
        model=model,
        prompt_tokens=prompt_tokens,
        completion_tokens=completion_tokens,
        latency_seconds=elapsed,
        finish_reason=finish_reason,
    )


def _is_retryable(exc: Exception) -> bool:
    """Whether a provider error is worth retrying.

    Rate limits, timeouts, and 5xx responses are transient. Authentication and
    malformed-request errors are not: retrying them burns quota and delays the
    failure the operator needs to see.
    """
    name = type(exc).__name__.lower()
    if any(token in name for token in ("auth", "permission", "notfound", "badrequest")):
        return False
    if any(token in name for token in ("ratelimit", "timeout", "serviceunavailable", "apiconnection", "internalserver", "overloaded")):
        return True
    status = getattr(exc, "status_code", None)
    if isinstance(status, int):
        return status == 429 or status >= 500
    return True
