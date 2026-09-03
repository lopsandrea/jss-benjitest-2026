"""Adapters for the third-party generators compared against in RQ6.

Each adapter has one job: produce a test class for a target. Sandboxing, the
build, and every metric stay on BenjiTest's side, so a difference in the reported
numbers cannot come from a difference in how they were measured. That is the
whole point of running the comparison inside one harness rather than quoting
figures across papers.

``chatunitest`` and ``evosuite`` drive the published tools. ``testforge`` is a
port of the published method to Java rather than the authors' implementation,
which targets Python; the port is here so its fidelity can be judged rather than
assumed, and the paper says so wherever the RQ6 numbers appear.
"""

from .base import BaselineAdapter, BaselineResult
from .chatunitest import ChatUniTestAdapter
from .evosuite import EvoSuiteAdapter
from .testforge import TestForgeAdapter

ADAPTERS = {
    "chatunitest": ChatUniTestAdapter,
    "evosuite": EvoSuiteAdapter,
    "testforge": TestForgeAdapter,
}


def adapter_for(config):
    """Return the adapter class named by an ``external_baselines`` entry."""
    try:
        return ADAPTERS[config.name]
    except KeyError:
        raise ValueError(
            "no adapter for external baseline '%s'; known adapters are %s"
            % (config.name, ", ".join(sorted(ADAPTERS)))
        ) from None


__all__ = ["BaselineAdapter", "BaselineResult", "ADAPTERS", "adapter_for",
           "ChatUniTestAdapter", "EvoSuiteAdapter", "TestForgeAdapter"]
