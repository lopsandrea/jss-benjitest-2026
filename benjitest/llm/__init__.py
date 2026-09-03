"""LLM Interaction Layer: unified access to every evaluated model backend."""

from .cache import ResponseCache, request_fingerprint
from .layer import LLMError, LLMLayer, LLMResponse, UsageAccumulator
from .parsing import (
    extract_java_code,
    extract_json,
    extract_package,
    extract_score,
    extract_test_class_name,
    strip_reasoning,
)
from .tokens import chunk_by_tokens, count_tokens, iter_java_chunks, truncate_to_tokens

__all__ = [
    "LLMError",
    "LLMLayer",
    "LLMResponse",
    "ResponseCache",
    "UsageAccumulator",
    "chunk_by_tokens",
    "count_tokens",
    "extract_java_code",
    "extract_json",
    "extract_package",
    "extract_score",
    "extract_test_class_name",
    "iter_java_chunks",
    "request_fingerprint",
    "strip_reasoning",
    "truncate_to_tokens",
]
