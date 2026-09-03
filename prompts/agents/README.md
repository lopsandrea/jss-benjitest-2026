# Agent System Prompts

System prompts for the agents of the BenjiTest multi-agent framework. These files
are the **single source of truth**: `benjitest.agents.base.Agent.system_prompt()`
loads the file named in each agent's `AgentSpec` and only falls back to a
built-in default if the file is missing. Editing a prompt here changes what runs.

## The ten agents

Numbering and contracts follow Appendix B of the paper.

| # | Agent | Crew | Prompt file | Flavour |
|---|-------|------|-------------|---------|
| 1 | Repository Manager | Repository | `repository_manager_agent.txt` | tool |
| 2 | Repository Miner | Repository | `repository_miner_agent.txt` | tool |
| 3 | Class Under Test Analyzer | Test Generation | `class_analyzer_agent.txt` | hybrid |
| 4 | Black-box Test Agent | Test Generation | `blackbox_agent.txt` | LLM |
| 5 | White-box Test Agent | Test Generation | `whitebox_agent.txt` | LLM |
| 6 | Prompt Engineer | Test Generation | `prompt_engineer_agent.txt` | LLM |
| 7 | Intermediate Representation Agent | Test Generation / Test Correction | `intermediate_representation_agent.txt` | LLM |
| 8 | Test Developer Agent | Test Generation / Test Correction | `tester_agent.txt` (generation), `test_fixer_agent.txt` (correction) | LLM |
| 9 | Error Interpreter | Test Correction | `error_interpreter_agent.txt` | LLM |
| 10 | Classifier Agent | Test Correction | `classifier_agent.txt` | LLM |

Two further prompts are in this directory but are not part of the ten:

| Agent | Used by | Prompt file | Note |
|---|---|---|---|
| Joint Analyzer | RQ7 arm **B-nosplit** only | `joint_analyzer_agent.txt` | Produces behavioural and structural scenarios in one call, replacing agents 4 and 5. It exists to measure what the black-box / white-box split is worth and takes no part in the four strategies. |
| Manager | legacy | `manager_agent.txt` | Superseded by the deterministic Coordinator; retained so older run configurations still load. See `docs/REPLICATION.md`. |

**Flavours.** *LLM* agents issue a completion through the LLM Interaction Layer.
*Tool* agents perform deterministic filesystem and build work — their prompt
files document the contract but are never sent to a model. The *hybrid* Class
Analyzer computes its structural report with a Java parser and uses the model
only for the functional interpretation, so a hallucinated signature can never
enter the pipeline.

**Agent 8** is one agent with two system prompts. The Test Developer is reused in
correction mode (Appendix B), where `test_fixer_agent.txt` replaces
`tester_agent.txt` as its system message.

## Workflow

**Phase 1 — Repository Crew.** The Repository Manager validates the project,
sandboxes it, purges human-written tests, and injects the test toolchain. The
Repository Miner produces the curated project tree, truncated to 2,000 tokens.

**Phase 2 — Test Generation Crew.** Composition depends on the selected strategy:

- `static` — the Test Developer alone; the analysis agents are bypassed and a
  rendered prompt template is the entire instruction.
- `dynamic` — Class Analyzer → Black-box → White-box → Prompt Engineer → Test
  Developer.
- `intermediate` — Class Analyzer → Intermediate Representation → Test Developer.

**Phase 2b — Test Correction Crew.** On a failed build: Error Interpreter →
Classifier (from attempt 2 onward) → Test Developer, looping until the build
succeeds, the Classifier reports a regression (`S = -1`), or the attempt limit is
reached.

**Phase 3 — Report Generator.** Coverage, mutation score, and smells on success;
a recorded failure with zero metric values otherwise.

## Ablation

The five configurations of Section 4.8 are expressed by toggling agents 3, 4 and
5 in the strategy's `agents:` block — no prompt or code changes:

| Configuration | class_analyzer | black_box_tester | white_box_tester | prompt_engineer |
|---|---|---|---|---|
| Full Crew (baseline) | ✓ | ✓ | ✓ | ✓ |
| No-BlackBox | ✓ | ✗ | ✓ | ✓ |
| No-WhiteBox | ✓ | ✓ | ✗ | ✓ |
| No-Context | ✗ | ✗ | ✗ | ✓ |

## Legacy file

`manager_agent.txt` documents the orchestration policy of the **Coordinator**,
which the paper describes as an architectural module rather than an agent. It is
retained from the first artifact release for continuity and is not loaded by any
agent; the behaviour it describes lives in `benjitest/coordinator.py` and in the
crew composition rules in `benjitest/crews/factory.py`. Note that an earlier
version of this README also listed a *Coverage Analyzer* agent: no such agent
exists in the evaluated framework, and no prompt file for it was ever released.

## Configuration

Which agents are active is declared per strategy in
`config/experiments/*.yaml`; see `benjitest.config.schema.GenerationAgentToggles`.
