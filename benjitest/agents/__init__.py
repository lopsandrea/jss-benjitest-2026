"""The ten BenjiTest agents, specified in Appendix B of the paper.

============================== ==================== =========================
Agent                          Crew                 Flavour
============================== ==================== =========================
Repository Manager             Repository           tool
Repository Miner               Repository           tool
Class Under Test Analyzer      Test Generation      hybrid (static + LLM)
Black-box Test Agent           Test Generation      LLM
White-box Test Agent           Test Generation      LLM
Prompt Engineer                Test Generation      LLM
Intermediate Representation    Test Generation /    LLM
                               Test Correction
Test Developer Agent           Test Generation /    LLM
                               Test Correction
Error Interpreter              Test Correction      LLM
Classifier Agent               Test Correction      LLM
============================== ==================== =========================
"""

from .analysis import (
    BLACK_BOX_AGENT,
    CLASS_ANALYZER,
    WHITE_BOX_AGENT,
    BlackBoxAgent,
    ClassAnalyzerAgent,
    WhiteBoxAgent,
)
from .base import Agent, AgentOutput, AgentRegistry, AgentSpec, CrewContext, ToolAgent
from .correction import (
    CLASSIFIER_AGENT,
    CLASSIFIER_FEW_SHOT,
    ERROR_INTERPRETER,
    ClassifierAgent,
    ErrorInterpreterAgent,
)
from .developer import TEST_DEVELOPER, TestDeveloperAgent, render_template, template_variables
from .repository import (
    REPOSITORY_MANAGER,
    REPOSITORY_MINER,
    RepositoryManagerAgent,
    RepositoryMinerAgent,
)
from .synthesis import (
    INTERMEDIATE_REPRESENTATION_AGENT,
    PROMPT_ENGINEER,
    IntermediateRepresentationAgent,
    PromptEngineerAgent,
)

#: Canonical agent names, in the order they appear in Appendix B.
AGENT_NAMES = (
    REPOSITORY_MANAGER,
    REPOSITORY_MINER,
    CLASS_ANALYZER,
    BLACK_BOX_AGENT,
    WHITE_BOX_AGENT,
    PROMPT_ENGINEER,
    INTERMEDIATE_REPRESENTATION_AGENT,
    TEST_DEVELOPER,
    ERROR_INTERPRETER,
    CLASSIFIER_AGENT,
)

#: Maps the YAML agent toggle keys onto canonical agent names.
TOGGLE_TO_AGENT = {
    "class_analyzer": CLASS_ANALYZER,
    "black_box_tester": BLACK_BOX_AGENT,
    "white_box_tester": WHITE_BOX_AGENT,
    "prompt_engineer": PROMPT_ENGINEER,
    "intermediate_representation": INTERMEDIATE_REPRESENTATION_AGENT,
    "error_interpreter": ERROR_INTERPRETER,
    "classifier": CLASSIFIER_AGENT,
}

__all__ = [
    "AGENT_NAMES",
    "BLACK_BOX_AGENT",
    "CLASSIFIER_AGENT",
    "CLASSIFIER_FEW_SHOT",
    "CLASS_ANALYZER",
    "ERROR_INTERPRETER",
    "INTERMEDIATE_REPRESENTATION_AGENT",
    "PROMPT_ENGINEER",
    "REPOSITORY_MANAGER",
    "REPOSITORY_MINER",
    "TEST_DEVELOPER",
    "TOGGLE_TO_AGENT",
    "WHITE_BOX_AGENT",
    "Agent",
    "AgentOutput",
    "AgentRegistry",
    "AgentSpec",
    "BlackBoxAgent",
    "ClassAnalyzerAgent",
    "ClassifierAgent",
    "CrewContext",
    "ErrorInterpreterAgent",
    "IntermediateRepresentationAgent",
    "PromptEngineerAgent",
    "RepositoryManagerAgent",
    "RepositoryMinerAgent",
    "TestDeveloperAgent",
    "ToolAgent",
    "WhiteBoxAgent",
    "render_template",
    "template_variables",
]
