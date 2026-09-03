"""Shared fixtures and test doubles."""

from __future__ import annotations

import sys
from pathlib import Path

import pytest

REPO_ROOT = Path(__file__).resolve().parent.parent
if str(REPO_ROOT) not in sys.path:
    sys.path.insert(0, str(REPO_ROOT))

# The path insertion above must run before these imports so the suite works from
# a checkout without the package being installed.
from benjitest.config.schema import LLMConfig  # noqa: E402
from benjitest.llm.layer import LLMResponse, UsageAccumulator  # noqa: E402

SAMPLE_CLASS = """\
package com.example.service;

import com.example.repository.OrderRepository;
import com.example.model.Order;
import com.example.model.OrderItem;
import com.example.model.OrderResult;
import java.util.List;

/**
 * Service for managing customer orders.
 */
public class OrderService {

    private final OrderRepository repository;
    public static final int MAX_ITEMS = 100;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    /**
     * Processes an order and returns its outcome.
     * @param order the order to process; must not be null
     * @return the processing result
     * @throws IllegalArgumentException if order is null
     */
    public OrderResult processOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        if (order.getItems().isEmpty()) {
            return OrderResult.empty();
        }
        double total = 0;
        for (OrderItem item : order.getItems()) {
            if (item.getQuantity() <= 0) {
                throw new IllegalStateException("Invalid quantity");
            }
            total += item.getPrice() * item.getQuantity();
        }
        return new OrderResult(total);
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    private void audit(String message) {
        // intentionally empty
    }
}
"""

SAMPLE_TEST = """\
package com.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderServiceTest {

    @Mock
    private OrderRepository repository;

    private OrderService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        service = new OrderService(repository);
    }

    @Test
    void processOrder_nullOrder_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> service.processOrder(null));
    }

    @Test
    void processOrder_singleItem_returnsTotal() {
        Order order = new Order();
        OrderResult result = service.processOrder(order);
        assertEquals(42, result.getTotal());
    }
}
"""


class FakeLLMLayer:
    """A scripted stand-in for the LLM Interaction Layer.

    Responses are keyed by agent tag; a missing key raises so a test never
    silently exercises a path with an empty response.
    """

    def __init__(self, responses: dict[str, str] | None = None, default: str | None = None):
        self.responses = responses or {}
        self.default = default
        self.calls: list[tuple[str, str]] = []
        self.usage = UsageAccumulator()

    def complete(self, llm, *, system=None, user="", tag="", **overrides) -> LLMResponse:
        self.calls.append((tag, user))
        if tag in self.responses:
            text = self.responses[tag]
        elif self.default is not None:
            text = self.default
        else:
            raise AssertionError(f"FakeLLMLayer has no scripted response for tag '{tag}'")
        if callable(text):
            text = text(user)
        response = LLMResponse(text=text, model="fake", prompt_tokens=10, completion_tokens=20)
        self.usage.record(response)
        return response

    def chat(self, llm, messages, *, tag="", **overrides) -> LLMResponse:
        user = messages[-1]["content"] if messages else ""
        return self.complete(llm, user=user, tag=tag)


@pytest.fixture
def sample_class_source() -> str:
    return SAMPLE_CLASS


@pytest.fixture
def sample_test_source() -> str:
    return SAMPLE_TEST


@pytest.fixture
def fake_llm_config() -> LLMConfig:
    return LLMConfig(name="fake", provider="openai", model="gpt-4.1", temperature=0.0, seed=42)


@pytest.fixture
def repo_root() -> Path:
    return REPO_ROOT


@pytest.fixture
def maven_project(tmp_path: Path) -> Path:
    """A minimal but structurally realistic Maven project."""
    root = tmp_path / "demo-project"
    main = root / "src" / "main" / "java" / "com" / "example" / "service"
    test = root / "src" / "test" / "java" / "com" / "example" / "service"
    main.mkdir(parents=True)
    test.mkdir(parents=True)

    (main / "OrderService.java").write_text(SAMPLE_CLASS, encoding="utf-8")
    (test / "OrderServiceTest.java").write_text(SAMPLE_TEST, encoding="utf-8")
    (root / "pom.xml").write_text(
        """<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>demo</artifactId>
  <version>1.0.0</version>
  <properties>
    <maven.compiler.release>17</maven.compiler.release>
  </properties>
  <dependencies>
    <dependency>
      <groupId>com.google.guava</groupId>
      <artifactId>guava</artifactId>
      <version>33.0.0-jre</version>
    </dependency>
  </dependencies>
</project>
""",
        encoding="utf-8",
    )
    return root
