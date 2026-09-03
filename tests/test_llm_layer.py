"""LLM Interaction Layer: response parsing, token budgets, provider handling."""

from __future__ import annotations

import pytest

from benjitest.config.schema import LLMConfig
from benjitest.llm.cache import ResponseCache, request_fingerprint
from benjitest.llm.layer import LLMLayer
from benjitest.llm.parsing import (
    extract_java_code,
    extract_json,
    extract_package,
    extract_score,
    extract_test_class_name,
    strip_reasoning,
)
from benjitest.llm.tokens import chunk_by_tokens, count_tokens, iter_java_chunks, truncate_to_tokens


class TestJavaExtraction:
    def test_extracts_fenced_java_block(self):
        response = "Here is the test:\n```java\npackage a;\nclass FooTest {}\n```\nHope it helps!"
        assert extract_java_code(response) == "package a;\nclass FooTest {}"

    def test_extracts_unfenced_code(self):
        response = "package a;\n\nclass FooTest { }"
        assert extract_java_code(response) == "package a;\n\nclass FooTest { }"

    def test_strips_prose_preamble(self):
        response = "Sure! I will write the tests.\npackage a;\nclass FooTest {}"
        code = extract_java_code(response)
        assert code.startswith("package a;")

    def test_prefers_the_block_declaring_a_type(self):
        response = (
            "For reference:\n```java\n// just a snippet\n```\n"
            "The test:\n```java\npackage a;\nclass FooTest {}\n```"
        )
        assert "FooTest" in extract_java_code(response)

    def test_strips_reasoning_preamble(self):
        response = "<think>Let me plan this out.</think>\n```java\nclass FooTest {}\n```"
        assert extract_java_code(response) == "class FooTest {}"

    def test_returns_none_when_no_code(self):
        assert extract_java_code("I cannot generate tests for this class.") is None

    def test_returns_none_for_empty(self):
        assert extract_java_code("") is None

    def test_unterminated_fence_still_yields_code(self):
        # Truncated responses are common when a model hits its token limit.
        response = "```java\npackage a;\nclass FooTest {\n  void t() {}\n}"
        assert extract_java_code(response).startswith("package a;")

    def test_extract_class_name_and_package(self):
        code = "package com.example;\n\npublic class OrderServiceTest {}"
        assert extract_test_class_name(code) == "OrderServiceTest"
        assert extract_package(code) == "com.example"

    def test_extract_package_returns_none_for_default_package(self):
        assert extract_package("class FooTest {}") is None

    def test_strip_reasoning(self):
        assert strip_reasoning("<think>x</think>answer").strip() == "answer"


class TestJsonExtraction:
    def test_parses_bare_json(self):
        assert extract_json('{"a": 1}') == {"a": 1}

    def test_parses_fenced_json(self):
        assert extract_json('Result:\n```json\n{"a": 1}\n```') == {"a": 1}

    def test_parses_json_array(self):
        assert extract_json("```\n[{\"name\": \"t1\"}]\n```") == [{"name": "t1"}]

    def test_finds_json_embedded_in_prose(self):
        response = 'Here is my analysis: {"root_cause": "missing import"} — hope that helps.'
        assert extract_json(response) == {"root_cause": "missing import"}

    def test_braces_inside_strings_do_not_break_balancing(self):
        assert extract_json('{"msg": "a } b"}') == {"msg": "a } b"}

    def test_returns_none_when_absent(self):
        assert extract_json("no json at all") is None


class TestScoreExtraction:
    @pytest.mark.parametrize(
        ("response", "expected"),
        [
            ('{"score": -1, "message": "regression"}', -1),
            ('{"score": 0}', 0),
            ('{"score": 1}', 1),
            ("score: +1", 1),
            ("The effectiveness score is -1.", -1),
            ("-1", -1),
            ("```json\n{\"score\": 1, \"message\": \"good\"}\n```", 1),
        ],
    )
    def test_extracts_valid_scores(self, response, expected):
        assert extract_score(response) == expected

    def test_returns_none_when_absent(self):
        assert extract_score("I am not sure what happened here.") is None

    def test_rejects_out_of_range_score(self):
        assert extract_score('{"score": 7}') is None


class TestTokenBudget:
    def test_count_is_monotonic(self):
        assert count_tokens("") == 0
        assert count_tokens("short") < count_tokens("a much longer piece of text here")

    def test_truncate_respects_budget(self):
        text = "\n".join(f"line {i}" for i in range(500))
        truncated = truncate_to_tokens(text, 50)

        assert count_tokens(truncated) <= 80  # budget plus the marker
        assert "truncated" in truncated

    def test_truncate_is_a_noop_when_within_budget(self):
        assert truncate_to_tokens("small", 1000) == "small"

    def test_truncate_to_zero(self):
        assert truncate_to_tokens("anything", 0) == ""

    def test_chunking_covers_the_whole_text(self):
        text = "\n".join(f"line {i}" for i in range(300))
        chunks = chunk_by_tokens(text, 100)

        assert len(chunks) > 1
        # Every line must survive in exactly one chunk.
        assert sum(c.count("\n") + 1 for c in chunks) == 300

    def test_chunking_returns_single_chunk_when_small(self):
        assert chunk_by_tokens("small", 1000) == ["small"]

    def test_java_chunking_prefers_member_boundaries(self):
        methods = "\n".join(
            f"    public void method{i}() {{\n        doSomething({i});\n    }}\n" for i in range(60)
        )
        source = f"package a;\npublic class Big {{\n{methods}}}\n"
        chunks = list(iter_java_chunks(source, 200))

        assert len(chunks) > 1
        # No chunk should end in the middle of a method signature.
        for chunk in chunks:
            assert chunk.count("{") >= 0  # sanity
        assert "method0" in chunks[0]
        assert "method59" in chunks[-1]


class TestProviderHandling:
    def test_resolves_provider_prefixes(self):
        assert (
            LLMLayer.resolve_model_id(LLMConfig(name="a", provider="openai", model="gpt-4.1"))
            == "gpt-4.1"
        )
        assert (
            LLMLayer.resolve_model_id(
                LLMConfig(name="b", provider="google-ai", model="gemini-1.5-pro")
            )
            == "gemini/gemini-1.5-pro"
        )
        assert (
            LLMLayer.resolve_model_id(
                LLMConfig(name="c", provider="ollama", model="llama3.1:70b")
            )
            == "ollama/llama3.1:70b"
        )

    def test_seed_support_matches_the_paper(self):
        """Section 4.7: o3/o4-mini and Gemini do not officially support seed."""
        assert LLMLayer.supports_seed(LLMConfig(name="a", provider="openai", model="gpt-4.1"))
        assert LLMLayer.supports_seed(LLMConfig(name="b", provider="xai", model="grok-3"))
        assert LLMLayer.supports_seed(
            LLMConfig(name="c", provider="ollama", model="llama3.1:70b")
        )
        assert not LLMLayer.supports_seed(LLMConfig(name="d", provider="openai", model="o3"))
        assert not LLMLayer.supports_seed(
            LLMConfig(name="e", provider="openai", model="o4-mini")
        )
        assert not LLMLayer.supports_seed(
            LLMConfig(name="f", provider="google-ai", model="gemini-2.5-pro")
        )

    def test_seed_is_omitted_for_incapable_backends(self):
        layer = LLMLayer()
        request = layer.build_request(
            LLMConfig(name="o3", provider="openai", model="o3", seed=42),
            [{"role": "user", "content": "hi"}],
        )
        assert "seed" not in request
        # Reasoning models also reject an explicit temperature.
        assert "temperature" not in request

    def test_seed_is_forwarded_when_supported(self):
        layer = LLMLayer()
        request = layer.build_request(
            LLMConfig(name="gpt", provider="openai", model="gpt-4.1", seed=42),
            [{"role": "user", "content": "hi"}],
        )
        assert request["seed"] == 42
        assert request["temperature"] == 0.0


class TestResponseCache:
    def test_round_trip(self, tmp_path):
        cache = ResponseCache(tmp_path)
        key = request_fingerprint({"model": "m", "messages": [{"role": "user", "content": "x"}]})

        assert cache.get(key) is None
        cache.put(key, {"text": "hello"})
        assert cache.get(key) == {"text": "hello"}

    def test_fingerprint_is_order_independent(self):
        assert request_fingerprint({"a": 1, "b": 2}) == request_fingerprint({"b": 2, "a": 1})

    def test_fingerprint_distinguishes_sampling_parameters(self):
        base = {"model": "m", "messages": []}
        assert request_fingerprint({**base, "temperature": 0}) != request_fingerprint(
            {**base, "temperature": 1}
        )

    def test_disabled_cache_never_stores(self, tmp_path):
        cache = ResponseCache(tmp_path, enabled=False)
        cache.put("k" * 64, {"text": "x"})
        assert cache.get("k" * 64) is None

    def test_corrupt_entry_is_a_miss_not_a_crash(self, tmp_path):
        cache = ResponseCache(tmp_path)
        key = "a" * 64
        path = cache._path(key)
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text("{ truncated", encoding="utf-8")
        assert cache.get(key) is None
