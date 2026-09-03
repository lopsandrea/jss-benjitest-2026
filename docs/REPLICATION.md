# Replication

How the code maps onto the paper, what the test suite covers, and how to run a
campaign.

---

## 1. Where each part of the paper lives in the code

Use this table to go from a claim in the paper to the code that implements it.

| Paper | Code |
|---|---|
| §3 — module decomposition, crew composition, workflow phases, context limits | `benjitest/coordinator.py`, `benjitest/crews/` |
| §4 — strategies, metric definitions, evaluation protocol, sampling | `benjitest/evaluation/`, `benjitest/metrics/` |
| Appendix A — configuration schema | `benjitest/config/` |
| Appendix B — per-agent role / called-by / input / behaviour / returns | `benjitest/agents/`, `prompts/agents/` |
| Appendix C — Algorithms 1 and 2 | `benjitest/coordinator.py`, `benjitest/correction/` |
| Appendix E — memorization probing prompts and matching criteria | `benjitest/evaluation/memorization.py` |
| Tables and figures | `scripts/analysis.py`, `scripts/visualize.py`, `data/` |

The prompts in `prompts/` and the configuration in `config/` are the ones used in
the reported campaign, unchanged. The CSVs in `data/` are its measurements.

## 2. What is verified

### 2.1 Automated test suite — 346 tests

```bash
pip install -e ".[dev]"    # required first: see the note below
pytest
```

Expected output: `346 passed`.

No network, JDK, or API key is required — the LLM layer and the build system are
replaced by doubles — but the package's own dependencies **are** required.
Running `pytest` against a bare interpreter produces 13 failures in
`test_java_analysis.py` and `test_metrics.py`, all of them caused by a missing
`javalang`: without it the Java parser silently falls back to a regex path that
does not recover Javadoc or the full smell set. The failures are a missing
dependency, not a defect, but they look like one, so install the package first.

| Area | Verified |
|---|---|
| Java analysis | Parsing, Javadoc capture, testability, cyclomatic complexity, internal/external dependency split, the regex fallback for post-Java-8 syntax |
| Response parsing | Fenced/unfenced code, prose preambles, truncated fences, `<think>` preambles, JSON in prose, score extraction |
| Provider handling | Seed forwarded exactly where Section 4.7 says it is; temperature omitted for reasoning models |
| Error taxonomy | All seven Table 13 categories over real Maven, javac, Gradle and Surefire log formats; build-phase precedence; the diff between consecutive attempts |
| Sandboxing | Isolated copies, test purging, package-directory placement, origin left untouched |
| Dependency injection | Valid XML, idempotence, an existing pinned version preserved |
| Coverage / mutation | Attribution to the class under test only, the Section 4.5 mutant exclusions, deduplication, inner classes |
| Smells | 13 of the 19 rules exercised individually, plus the no-false-positive case |
| Evaluation protocol | Compiled-only vs pessimistic averaging, both compilation rates, attempts excluding never-compiled classes, and the worked Section 5.3 example (35% → 80% ⇒ 69.2% fix rate) |
| Algorithm 2 | Every termination path; the Classifier gated to attempt ≥ 2; a regression halting the loop before regeneration; the Error Interpreter receiving the current failure and the Classifier the consecutive pair |
| Algorithm 1 | All three strategy paths with the exact agent sequence; the five ablation arms; correction hand-off; CSV output; resumption |
| Statistics | Cliff's delta against the naive definition, Romano thresholds, Bonferroni α = 0.05/6 |
| Memorization | Exact / structural / semantic matching, nested level counting, stratification |
| Configuration | The released `framework_test-full-evaluation.yaml` loads unchanged with all nine models and four strategies |

### 2.2 End-to-end run against real tooling

A complete pipeline execution on a small Maven project, with a scripted LLM but
**real** Maven, JaCoCo and PIT. Observed:

```
Repository Crew:  project validated, sandboxed, human test purged,
                  JUnit 5 + Mockito + JaCoCo + PIT injected
Generation:       dynamic crew ran all six generation calls in order
Attempt 1:        compile error, categorised Symbol/Import Mismatch
Correction:       1 iteration → success
Final:            3 tests run, all passing
JaCoCo:           line 100.0%  branch 100.0%  method 100.0%
PIT:              5 mutants, 5 killed, 0 survived, 0 excluded → 100.0%
Smells:           built-in detector, LT=1 MNT=2
```

The emitted `metrics_per_model_strategy.csv` header is byte-identical to the
published one.

### 2.3 Outside the test suite's coverage

Useful to know before relying on these paths:

- **Gradle at scale.** The end-to-end run used Maven. Gradle support is
  implemented and unit-tested but has not been exercised against a real Gradle
  project.
- **tsDetect calibration.** The built-in smell detector implements the same 19
  rules but has not been calibrated against tsDetect's output. Counts from the
  two detectors should not be pooled; `SmellMetrics.detector` records which one
  produced each result.
- **The CrewAI backend.** Implemented against the library's documented API, but
  exercised in the test suite only through its fallback path.

---

## 3. Implementation notes

Design decisions worth knowing about before relying on a code path, and the
reasoning behind each.

### 3.1 Repository Manager and Repository Miner are tool agents

Appendix B gives both full agent contracts, but their behaviour — copying a
directory, inspecting a build file, running a wrapper, walking source roots — is
entirely deterministic. They are therefore *tool agents*: crew members with
declared contracts, executed directly rather than through a model. Their prompt
files document the contracts but are never sent to an LLM. This costs nothing in
fidelity and removes two model calls per project from every run.

### 3.2 The Class Analyzer is hybrid

Its structural report is computed by a Java parser; the model contributes only the
*inferred functional description* of §4.3. This is deliberate: it prevents a
hallucinated signature from entering the pipeline at exactly the point where every
downstream agent would trust it.

### 3.3 The built-in smell detector

The paper uses tsDetect. That JAR is invoked whenever available; when it is not,
a built-in detector implementing the same 19 rules is used so the framework
remains usable. The two are not equivalent and every result records which one
produced it.

### 3.4 CodeBLEU

The reference `codebleu` package is used when installed. The built-in fallback
implements the same four-component definition but derives its AST from
`javalang` rather than tree-sitter, so scores can differ by a small margin. The
implementation used is reported on every score.

### 3.5 Mutation analysis on Gradle

The PIT Gradle plugin must be applied in the `plugins {}` block at the top of the
build script, which cannot be done by appending. Mutation analysis is therefore
wired for Maven only; Gradle projects yield coverage and smells but no mutation
score.

### 3.6 Legacy prompt files

`manager_agent.txt` describes a *Manager* agent whose responsibilities are those
of the Coordinator, which the paper classifies as an architectural module rather
than an agent. An earlier draft of `prompts/agents/README.md` also listed a
*Coverage Analyzer*. Neither is part of the evaluated framework, neither appears
in Appendix B, and neither is loaded. The file is kept only so that the repository
history stays intelligible.

---

## 4. Reproducing the published tables and figures

The data files are the original measurements, so the analysis pipeline
reproduces the paper's tables exactly:

```bash
pip install pandas matplotlib seaborn
python -c "from scripts.analysis import print_summary_report; print_summary_report()"
python scripts/visualize.py
```

---

## 5. Running a fresh campaign

### 5.1 Start small

```bash
benjitest validate config/experiments/framework_test-full-evaluation.yaml
benjitest run config/experiments/framework_test-full-evaluation.yaml \
    --models gpt-4.1 --strategies dynamic --limit 20 --jobs 4
```

Inspect `data/raw/per_class_results.csv` before scaling up. Check that classes
are being found, that the compilation rate is not near zero (which usually means
a toolchain problem rather than a model problem), and that
`data/raw/error_logs/` contains what you expect.

### 5.2 Determinism

Temperature is 0 everywhere and seed 42 is forwarded wherever a provider accepts
it. This does not guarantee identical outputs: request batching, model routing
and floating-point nondeterminism all remain, and several providers do not accept
a seed at all (Section 4.7). Aggregate metrics over a large sample are stable;
individual generations are not.

### 5.3 Cost

Scale the run to a budget before launching it. The full campaign is 77.21B
generation tokens plus 22.77B correction tokens
(`data/raw/cost_breakdown.csv`). `--limit`, `--models` and `--strategies` bound
the work; the response cache means a resumed run does not re-pay for completed
tasks.

### 5.4 Dataset layout

Either point `dataset.source_root` at a directory of checked-out repositories:

```
dataset/source/
├── 47405371/          # one directory per repository
│   ├── pom.xml
│   └── src/main/java/...
└── 58314354/
```

or supply `dataset.index_file`, a JSON/JSONL/CSV file with `repo_id`,
`source_path`, and optionally `qualified_name` and `test_path` per row. The index
form is faster on the full corpus and makes the class-to-test mapping available
directly, which the RQ4 human-baseline comparison needs.

### 5.5 External tools

- **tsDetect** — set `TSDETECT_JAR` or `metrics.smells.tsdetect_jar`. Without it
  the built-in detector is used and every row is labelled accordingly.
- **Defects4J** — set `DEFECTS4J_HOME` or put `defects4j` on `PATH`.
- **JDK versions** — projects declaring a specific release are built against a
  matching JDK when one can be located via `JAVA_HOME_<major>`, macOS
  `java_home`, or the usual Linux install roots; otherwise the default JDK is
  used and a debug message is logged.

---

## 6. Reporting a discrepancy

If you find a place where the code and the paper disagree, please open an issue
quoting the section or appendix. Discrepancies between what is described and what
runs are the most useful thing you can report.
