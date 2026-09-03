# BenjiTest Architecture

Maps the design described in Section 3 of the paper onto the code. Every section
below names the paper element it implements.

> This is a reference implementation built against the paper's specification; see
> [REPLICATION.md](REPLICATION.md) for what is verified and where choices had to
> be made.

---

## 1. Overview

```
                 ┌────────────────────────┐
   user ────────▶│  UI & Configuration    │  cli.py, config/
                 └───────────┬────────────┘
                             │ BenjiTestConfig
                             ▼
   ┌─────────────────────────────────────────────────┐
   │              Coordinator                        │  coordinator.py
   │   for each ⟨project, class, model, strategy⟩    │  (Algorithm 1)
   └──┬───────────────┬───────────────┬──────────────┘
      │               │               │
      ▼               ▼               ▼
 ┌──────────┐   ┌────────────┐   ┌────────────┐
 │Repository│──▶│    Test    │──▶│    Test    │        agents/, crews/
 │   Crew   │   │ Generation │   │ Correction │
 └────┬─────┘   │    Crew    │   │    Crew    │
      │         └──────┬─────┘   └──────▲─────┘
      │                │                │
      │                ▼                │ failure
      │      ┌──────────────────────────┴───────┐
      └─────▶│  Build System Integration Module │        build/
             └──────────────┬───────────────────┘
                            │ result
                            ▼
             ┌──────────────────────────────────┐
             │      Report Generator Module     │        report/, metrics/
             └──────────────────────────────────┘

        LLM Interaction Layer (llm/) spans every LLM-backed agent.
```

The Coordinator forwards **only the final structured output** of each crew to the
next, never the full agent conversation. This is the mechanism that keeps context
growth bounded across a pipeline of ten agents.

---

## 2. UI & Configuration — `cli.py`, `config/`

A benchmarking run is fully declared in YAML: target dataset, LLM backends and
their API parameters, the enabled strategies and their per-strategy agent
activations, correction-loop settings, build options, and metric flags. The
schema is Appendix A.

- `config/schema.py` — typed dataclasses, one per YAML section, each field
  carrying the default used in the reported campaign.
- `config/loader.py` — parsing and validation. **Unknown keys are rejected**
  rather than ignored: a typo in an experiment configuration would otherwise
  silently change what is measured.
- `cli.py` — subcommands `validate`, `run`, `generate`, `ablation`, `report`,
  `stats`, `defects4j`.

`${env:VAR}` and `${env:VAR:default}` references are expanded at load time so
credentials never live in a committed file.

### The ablation study is configuration, not code

The four arms of Section 4.8 differ only in a strategy's `agents:` block:

```yaml
strategies:
  - name: no-whitebox
    type: dynamic
    agents:
      class_analyzer: true
      black_box_tester: true
      prompt_engineer: true      # white_box_tester omitted ⇒ disabled
```

A declared `agents:` block is authoritative: any agent not listed is off. That
rule is what makes *No-Context* (only the Prompt Engineer) expressible at all.

---

## 3. Coordinator — `coordinator.py`

Algorithm 1. For each project it runs the Repository Crew once, then iterates
over every ⟨class, model, strategy⟩ combination.

**Sandbox pool.** The Repository Crew prepares one sandbox per project.
Running tasks concurrently inside it would let one generated test collide with
another's compilation output, so `SandboxPool` hands each worker its own copy,
cloned from the already-prepared template. Validation, test purging and
dependency injection are therefore paid for once per project rather than once per
task.

**Resumption.** With `execution.resume` on (the default), completed tuples are
read back from the output CSV and skipped. At 5.3M tasks an interrupted run that
had to restart would be unusable.

**Failure isolation.** A task that raises is recorded as a failed
`GenerationRecord` and the campaign continues. One malformed class must not end a
run measured in days.

---

## 4. Agent Crews — `agents/`, `crews/`

### Sequential process

`crews/base.py` implements CrewAI's sequential-process semantics: agents execute
in a predefined order, each output appended to a shared `CrewContext`. Two
interchangeable backends produce the same `CrewResult`:

- **`native`** (default) — runs the ordered agents directly on the LLM
  Interaction Layer. No dependency beyond LiteLLM, and every prompt and parse
  step is inspectable.
- **`crewai`** — delegates to the CrewAI library used in the reported campaign,
  mapping each `AgentSpec` onto a CrewAI `Agent` and each task description onto a
  `Task` under `Process.sequential`. Task descriptions are still built by our own
  agents, so prompts are identical across backends.

Select with `orchestration.backend`. If `crewai` is requested but not installed,
the native runner takes over with a warning rather than failing the run.

### The ten agents

Appendix B, in three crews. Two *flavours*:

- **LLM agents** issue a completion.
- **Tool agents** (Repository Manager, Repository Miner) do deterministic
  filesystem and build work. They are crew members with declared contracts, but
  routing sandbox creation or directory traversal through a model would add
  nondeterminism to the one part of the pipeline that underpins every
  measurement.

| Agent | Crew | Flavour | Notes |
|---|---|---|---|
| Repository Manager | Repository | tool | validates, sandboxes, purges tests, injects the toolchain |
| Repository Miner | Repository | tool | curated project tree, capped at 2,000 tokens |
| Class Under Test Analyzer | Generation | hybrid | parser computes structure; the model adds only interpretation |
| Black-box Test Agent | Generation | LLM | sees signatures and Javadoc, never the implementation |
| White-box Test Agent | Generation | LLM | sees the implementation; chunks classes over 4,000 tokens |
| Prompt Engineer | Generation | LLM | synthesises one Chain-of-Thought instruction set |
| Intermediate Representation | Generation / Correction | LLM | GIVEN-WHEN-THEN pseudo-code |
| Test Developer | Generation / Correction | LLM | the single code-generation step |
| Error Interpreter | Correction | LLM | structured diagnosis from raw build logs |
| Classifier | Correction | LLM | effectiveness score S ∈ {−1, 0, +1} |

**The Class Analyzer is deliberately hybrid.** Its structural report — signatures,
members, internal/external dependency split — comes from `java/parser.py`. The
model contributes only the *inferred functional description*. A hallucinated
signature therefore cannot enter the pipeline at the point where every downstream
agent would trust it.

**Black-box and white-box are mutually independent.** Neither consumes the
other's output. That is what makes the "in parallel" execution noted in
Appendix B possible, and what makes the ablation arms meaningful.

### Prompts live on disk

Each agent loads its system prompt from `prompts/agents/`, falling back to a
built-in default only if the file is missing. The released prompts are what runs.

### Graceful degradation

An analysis agent failing degrades the context rather than losing the generation:

- Class Analyzer fails → the structural report is still produced and used.
- Prompt Engineer fails → a deterministic assembly of the available artifacts.
- Error Interpreter fails → the rule-based error categorisation is used instead.
- Classifier returns nothing usable → a deterministic diff-based score, biased
  toward `0`, because a false regression discards a repair that was working.

Only the Test Developer failing means the task produced nothing.

---

## 5. Strategies

Composition of the Test Generation Crew, chosen per strategy (`crews/factory.py`):

| Strategy | Sequence |
|---|---|
| `static` | Test Developer alone; the rendered template is the whole instruction |
| `dynamic` | Class Analyzer → Black-box → White-box → Prompt Engineer → Test Developer |
| `intermediate` | Class Analyzer → Intermediate Representation → Test Developer |

The Test Developer is the same agent in all three. Only its *input* varies, which
is what makes the strategies comparable.

---

## 6. Correction loop — `correction/loop.py`

Algorithm 2. Triggered by the Coordinator only when the build fails.

```
attempt ← 1
while attempt ≤ maxAttempts and buildResult.failed:
    diagnosis ← ErrorInterpreter.analyze(test, currentError, cut)
    if attempt ≥ 2:
        score ← Classifier.evaluate(Error_{i-1}, Error_i)
        if score = -1: return (test, buildResult)      # regression: stop
    test ← TestDeveloper.generate(correctionPrompt(cut, test, diagnosis, score))
    buildResult ← BuildSystem.compileAndRun(test)
    attempt ← attempt + 1
```

Termination is one of: successful build, regression verdict, attempt limit, or a
Test Developer that produced no usable code. Each iteration is recorded — error
category, phase, score, resulting status — which is what populates the Table 8
breakdown.

The Classifier's gating is the interesting part: it runs only from the second
attempt, because before that there is no previous attempt to score.

---

## 7. Build System Integration Module — `build/`

- `sandbox.py` — isolated copies; purges human-written tests so metrics reflect
  only LLM-generated code; installs a test into the directory matching its
  declared package (a mismatch is the most common cause of spurious compilation
  failure).
- `dependencies.py` — additive, idempotent injection of JUnit 5, Mockito, JaCoCo
  and PIT. A version the project already pins always wins. Gradle scripts are
  appended to rather than rewritten: programmatically restructuring arbitrary
  Groovy DSL is far more likely to break a build than to fix it.
- `integration.py` — Maven/Gradle invocation with timeouts, preferring the
  project's own wrapper so the exact expected tool version is used.
- `errors.py` — the Table 8 taxonomy.

### What counts as "compiled"

Section 4.5 defines a test class as compilable when it produces a valid `.class`
file, regardless of whether its tests pass. The implementation treats the
`.class` file on disk as authoritative and consults the log only when the
artifact cannot be located.

### The error taxonomy is rule-based on purpose

| Phase | Category | Recognised by |
|---|---|---|
| Build | Symbol/Import Mismatch | `cannot find symbol`, `does not exist`, `incompatible types`, … |
| Build | Syntax Violations | `';' expected`, `illegal start of expression`, … |
| Test | Assertion Failures | `AssertionFailedError`, `expected: … but was:`, Mockito verification |
| Test | Runtime Exceptions | any other exception escaping a test |

The reported frequencies and per-category fix rates must be reproducible from the
raw logs, so no LLM is involved in the categorisation.

---

## 8. LLM Interaction Layer — `llm/`

One entry point to every backend through LiteLLM.

**Sampling parameters follow Section 4.7.** `seed` is forwarded only to providers
that accept it; `o3`/`o4-mini` and the Gemini family get temperature-0 only, and
the reasoning models get no explicit temperature at all (they reject it).

**Response parsing is deliberately forgiving** (`parsing.py`). A generation
counted as a compilation failure because of a stray markdown fence or a
`<think>` preamble would bias the reported compilation rate. The extractor
handles fenced blocks, unfenced code, prose preambles, truncated fences, and
reasoning-model output.

**Caching** is keyed on the full request fingerprint — model, sampling
parameters, and message content — so a resumed run never returns a response
produced under different settings.

**Token budgets** (`tokens.py`) enforce the Section 3.1 limits: the project tree
is capped at 2,000 tokens, and classes over 4,000 tokens are chunked at member
boundaries rather than blind line offsets.

---

## 9. Report Generator Module — `report/`, `metrics/`

**Coverage** (JaCoCo) is attributed to the class under test, never the project.
Method coverage counts every method in the bytecode — public through private —
as Section 4.5 specifies, because a good suite reaches private helpers
indirectly. A class with no branches reports 100% branch coverage: reporting 0%
would penalise the suite for a property of the class.

**Mutation score** (PIT) applies both exclusions from Section 4.5: `NON_VIABLE`,
`MEMORY_ERROR`, `RUN_ERROR` and `TIMED_OUT` mutants leave the denominator, and
duplicates are collapsed. Semantically equivalent mutants are *not* removed —
equivalence is undecidable, and a mutant is never discarded merely for surviving.
Any that remain depress the score, which makes the measured advantage between
strategies robust to this threat.

**Test smells**: tsDetect when its JAR is available, otherwise a built-in
detector implementing the same 19 rules. Which detector produced a result is
always recorded (`SmellMetrics.detector`) so the two are never conflated.

**Aggregation** (`metrics/aggregate.py`) implements Section 4.6: the
compiled-only average, the pessimistic average that scores non-compiled classes
as zero, and the full-set compilation rate. Both are reported because
compiled-only averaging favours strategies that compile rarely — only the easy
classes reach the average.

Rows are streamed to disk as they are produced, not buffered until the end.

---

## 10. Datasets — `datasets/`

**Classes2Test** loads either from a directory tree (one checkout per repository)
or from a JSON/CSV index enumerating production/test class pairs. Untestable
targets — interfaces, annotations, abstract classes, classes with no reachable
methods — are skipped: a vacuous suite would distort every average.

**Defects4J** implements the three-condition differential protocol of
Section 5.5. A bug counts as detected only when the suite compiles on the buggy
version, fails there, **and passes on the fixed version**. The third condition is
what prevents crediting a test that fails for an unrelated reason.

---

## 11. Evaluation — `evaluation/`

- `statistics.py` — Wilcoxon signed-rank, Cliff's delta (computed in O(n log n);
  the naive double loop is not viable at 147k paired observations), Bonferroni
  correction. Every result carries a `p_saturated` flag, because at this sample
  size 200 of 216 p-values hit the float64 floor and the interpretation must rest
  on effect size.
- `ablation.py` — the four arms as data.
- `memorization.py` — the probing protocol of Appendix E, with the three nested
  match levels.
- `codebleu.py` — the semantic-match criterion. Uses the reference `codebleu`
  package when installed; otherwise a built-in implementation of the same
  four-component definition over a `javalang` AST. Which one produced a score is
  reported.

---

## 12. Extending the framework

**A new agent**: subclass `Agent`, declare an `AgentSpec` (including its prompt
file), implement `build_task` and `parse`, then add it to a crew in
`crews/factory.py`.

**A new strategy**: add a `StrategyType` and a branch in
`CrewFactory.build_generation_crew`.

**A new metric**: add a collector under `metrics/`, wire it into
`ReportGenerator.compute_metrics`, and extend `GenerationRecord.to_row`.

**A new dataset**: implement `Dataset.iter_targets` and `iter_projects`, then
pass the instance to `Coordinator(config, dataset=...)`.
