"""BenjiTest -- an agentic framework for evaluating LLM-based unit test
generation and correction.

BenjiTest is an *extensible evaluation platform*, not a test-generation tool
competing with classical or LLM-based generators. Its purpose is the systematic,
reproducible measurement of what LLMs and agentic workflows achieve at the class
level in realistic Java projects.

Architecture (Section 3.1 of the paper)::

    UI & Configuration -> Coordinator -> Agent Crews -> Build System Integration
                              |              |                    |
                              |         LLM Interaction Layer     |
                              +--------> Report Generator <-------+

Typical use:

.. code-block:: python

    from benjitest import Coordinator, load_config

    config = load_config("config/experiments/framework_test-full-evaluation.yaml")
    summary = Coordinator(config).run()
    print(summary.report)
"""

from __future__ import annotations

__version__ = "1.0.0"

from .config import BenjiTestConfig, load_config, load_dataset_config
from .coordinator import Coordinator, RunSummary, Task

__all__ = [
    "BenjiTestConfig",
    "Coordinator",
    "RunSummary",
    "Task",
    "__version__",
    "load_config",
    "load_dataset_config",
]
