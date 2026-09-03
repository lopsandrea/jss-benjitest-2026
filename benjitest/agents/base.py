"""Agent abstractions shared by the three BenjiTest crews.

Each agent follows the role / input / what-it-does / returns contract tabulated in
Appendix B of the paper. Two flavours exist:

* **LLM agents** (Class Analyzer, Black-box, White-box, Prompt Engineer,
  Intermediate Representation, Test Developer, Error Interpreter, Classifier)
  issue a completion through the LLM Interaction Layer.
* **Tool agents** (Repository Manager, Repository Miner) perform deterministic
  filesystem and build-system work. They are agents in the architectural sense --
  they are crew members with a declared contract -- but delegating sandbox
  creation or directory walking to a language model would add nondeterminism
  without adding capability.
"""

from __future__ import annotations

import logging
import time
from abc import ABC, abstractmethod
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any

from ..config.schema import LLMConfig
from ..llm.layer import LLMError, LLMLayer

logger = logging.getLogger(__name__)


@dataclass(frozen=True, slots=True)
class AgentSpec:
    """The declared contract of an agent, mirroring Appendix B.

    ``role``, ``goal`` and ``backstory`` follow the CrewAI agent vocabulary, so
    the same specification drives both orchestration backends.
    """

    name: str
    role: str
    goal: str
    backstory: str
    #: File under ``prompts/agents/`` holding the authoritative system prompt.
    #: When present it overrides ``backstory`` for the system message, which
    #: keeps the released prompts the single source of truth.
    prompt_file: str | None = None
    #: Human-readable description of the agent's return value.
    returns: str = ""

    def default_system_prompt(self) -> str:
        return (
            f"You are the {self.name}.\n\n"
            f"## Role\n{self.role}\n\n"
            f"## Goal\n{self.goal}\n\n"
            f"## Background\n{self.backstory}\n"
        )


@dataclass(slots=True)
class AgentOutput:
    """Result of one agent execution."""

    agent: str
    text: str = ""
    #: Parsed representation when the agent emits structured output.
    structured: Any = None
    ok: bool = True
    error: str | None = None
    prompt_tokens: int = 0
    completion_tokens: int = 0
    latency_seconds: float = 0.0
    cached: bool = False

    @property
    def total_tokens(self) -> int:
        return self.prompt_tokens + self.completion_tokens

    def summary(self, limit: int = 400) -> str:
        """Short rendering appended to the crew's shared context memory."""
        text = self.text.strip()
        return text if len(text) <= limit else text[:limit] + " ..."


class CrewContext(dict):
    """Shared context memory passed along a crew's sequential process.

    CrewAI's sequential mode appends each agent's output to a shared context; this
    class is that context. It behaves as a dictionary and additionally keeps the
    ordered list of agent outputs so a crew can expose either the full transcript
    or only its final structured result (Section 3.1: the Coordinator forwards
    only the latter between crews).
    """

    def __init__(self, *args: Any, **kwargs: Any) -> None:
        super().__init__(*args, **kwargs)
        self.outputs: list[AgentOutput] = []

    def record(self, output: AgentOutput) -> None:
        self.outputs.append(output)
        self[output.agent] = output

    def output_of(self, agent_name: str) -> AgentOutput | None:
        value = self.get(agent_name)
        return value if isinstance(value, AgentOutput) else None

    def text_of(self, agent_name: str, default: str = "") -> str:
        output = self.output_of(agent_name)
        return output.text if output and output.ok else default

    def structured_of(self, agent_name: str, default: Any = None) -> Any:
        output = self.output_of(agent_name)
        return output.structured if output and output.ok else default

    def transcript(self, limit: int = 400) -> str:
        """Render the accumulated agent outputs as shared context."""
        blocks = [f"### {o.agent}\n{o.summary(limit)}" for o in self.outputs if o.ok]
        return "\n\n".join(blocks)

    @property
    def usage(self) -> dict[str, int]:
        return {
            "prompt_tokens": sum(o.prompt_tokens for o in self.outputs),
            "completion_tokens": sum(o.completion_tokens for o in self.outputs),
            "llm_calls": sum(1 for o in self.outputs if o.total_tokens > 0),
        }


class Agent(ABC):
    """Base class for every BenjiTest agent."""

    spec: AgentSpec

    def __init__(
        self,
        *,
        llm_layer: LLMLayer | None = None,
        llm_config: LLMConfig | None = None,
        prompts_dir: str | Path | None = None,
        options: dict[str, Any] | None = None,
    ) -> None:
        self.llm_layer = llm_layer
        self.llm_config = llm_config
        self.prompts_dir = Path(prompts_dir) if prompts_dir else None
        self.options = options or {}
        self._system_prompt_cache: str | None = None

    # ------------------------------------------------------------------
    # Prompt assembly
    # ------------------------------------------------------------------
    def system_prompt(self) -> str:
        """Return the agent's system message.

        Prefers the released prompt file so that what is published under
        ``prompts/agents/`` is exactly what runs.
        """
        if self._system_prompt_cache is not None:
            return self._system_prompt_cache

        prompt = None
        if self.prompts_dir and self.spec.prompt_file:
            candidate = self.prompts_dir / self.spec.prompt_file
            if candidate.is_file():
                prompt = candidate.read_text(encoding="utf-8").strip()
            else:
                logger.debug("prompt file %s not found; using built-in default", candidate)
        self._system_prompt_cache = prompt or self.spec.default_system_prompt()
        return self._system_prompt_cache

    @abstractmethod
    def build_task(self, context: CrewContext) -> str:
        """Return the user message describing this agent's task."""

    def parse(self, response_text: str, context: CrewContext) -> Any:
        """Convert a raw response into the agent's structured return value."""
        return response_text

    # ------------------------------------------------------------------
    # Execution
    # ------------------------------------------------------------------
    def run(self, context: CrewContext) -> AgentOutput:
        """Execute the agent against the shared context."""
        if self.llm_layer is None or self.llm_config is None:
            return AgentOutput(
                agent=self.spec.name,
                ok=False,
                error="agent requires an LLM backend but none was configured",
            )

        try:
            task = self.build_task(context)
        except Exception as exc:
            logger.exception("%s failed to build its task", self.spec.name)
            return AgentOutput(agent=self.spec.name, ok=False, error=f"task build failed: {exc}")

        started = time.monotonic()
        try:
            response = self.llm_layer.complete(
                self.llm_config,
                system=self.system_prompt(),
                user=task,
                tag=self.spec.name,
            )
        except LLMError as exc:
            logger.warning("%s: %s", self.spec.name, exc)
            return AgentOutput(
                agent=self.spec.name,
                ok=False,
                error=str(exc),
                latency_seconds=time.monotonic() - started,
            )

        output = AgentOutput(
            agent=self.spec.name,
            text=response.text,
            prompt_tokens=response.prompt_tokens,
            completion_tokens=response.completion_tokens,
            latency_seconds=response.latency_seconds,
            cached=response.cached,
        )
        try:
            output.structured = self.parse(response.text, context)
        except Exception as exc:  # noqa: BLE001
            logger.warning("%s: could not parse response (%s)", self.spec.name, exc)
            output.structured = None
        return output


class ToolAgent(Agent):
    """An agent whose work is deterministic and requires no LLM call."""

    def build_task(self, context: CrewContext) -> str:  # pragma: no cover - unused
        return ""

    @abstractmethod
    def execute(self, context: CrewContext) -> AgentOutput:
        """Perform the deterministic work and return the output."""

    def run(self, context: CrewContext) -> AgentOutput:
        started = time.monotonic()
        try:
            output = self.execute(context)
        except Exception as exc:
            logger.exception("%s failed", self.spec.name)
            return AgentOutput(agent=self.spec.name, ok=False, error=str(exc))
        output.latency_seconds = output.latency_seconds or (time.monotonic() - started)
        return output


@dataclass(slots=True)
class AgentRegistry:
    """Lookup of instantiated agents by canonical name, used by the crews."""

    agents: dict[str, Agent] = field(default_factory=dict)

    def register(self, agent: Agent) -> None:
        self.agents[agent.spec.name] = agent

    def get(self, name: str) -> Agent | None:
        return self.agents.get(name)

    def __contains__(self, name: object) -> bool:
        return name in self.agents
