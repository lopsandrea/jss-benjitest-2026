# BenjiTest

This repository contains **BenjiTest** — the multi-agent framework for LLM-based
class-level Java unit test generation and correction — together with the complete
artifact accompanying the paper:

> *BenjiTest: An Agentic Framework for Evaluating LLM-Based Unit Test Generation and Correction*  
> Journal of Systems and Software (JSS)

BenjiTest was developed at Wideverse s.r.l. and was originally closed-source. It is
**now released in full under the license in `LICENSE`**: the framework itself, the
prompts and configuration used in the reported campaign, the measurements it
produced, and the analysis pipeline that turns those measurements into the paper's
tables and figures.

## What you can do with this repository

| Goal | Where to start |
|---|---|
| Run the framework on your own project | [§3 Quick start](#3-quick-start) |
| Reproduce the paper's tables and figures | [`docs/REPLICATION.md` §4](docs/REPLICATION.md) |
| Understand the architecture | [`docs/ARCHITECTURE.md`](docs/ARCHITECTURE.md) |
| Audit what is verified, and how | [`docs/REPLICATION.md` §2](docs/REPLICATION.md) |
| Re-run a campaign from scratch | [`docs/REPLICATION.md` §5](docs/REPLICATION.md) |
| Estimate the cost before running | [`docs/COSTS.md`](docs/COSTS.md) |

## What is verified

The framework ships with its own test suite and a real end-to-end execution:

- **331 tests pass** (318 test functions, several parametrised) (`pip install -e ".[dev]" && pytest`), with
  no network, JDK, or API key required — the LLM layer and build system are replaced
  by doubles. Install the package first: run against a bare interpreter and 13 tests
  fail on a missing `javalang`, which looks like a defect but is not one.
- **An end-to-end run against real tooling**: a complete pipeline execution on a
  Maven project with real Maven, JaCoCo and PIT, exercising sandboxing, the dynamic
  agent crew, a triggered correction loop, and real coverage/mutation/smell
  measurement.
- **The analysis pipeline reproduces the published tables** from the measurements
  under `data/`.

`docs/REPLICATION.md` states precisely what each of these covers, and — equally
important — what they do **not** cover.

## On determinism

Temperature is 0 everywhere and seed 42 is forwarded wherever a provider accepts it,
but several providers accept no seed at all, and request batching, model routing and
floating-point non-determinism remain. **Aggregate metrics over a large sample are
stable; individual generations are not.** Re-running a campaign will not reproduce
the published figures generation-for-generation, and no LLM-based pipeline can
promise otherwise. See `docs/REPLICATION.md` §5.2.

---

## 1. Repository contents

High-level layout:

```text
benjitest-jss-artifact/
├── README.md
├── LICENSE
├── pyproject.toml
├── .env.example                      # LLM provider credentials
│
├── benjitest/                        # The framework (see docs/ARCHITECTURE.md)
│   ├── cli.py                        # UI & Configuration module
│   ├── coordinator.py                # Coordinator (Algorithm 1)
│   ├── config/                       # YAML schema and loader (Appendix A)
│   ├── agents/                       # The ten agents (Appendix B)
│   ├── crews/                        # Sequential crews + CrewAI backend
│   ├── correction/                   # Iterative correction loop (Algorithm 2)
│   ├── build/                        # Build System Integration Module
│   ├── llm/                          # LLM Interaction Layer (LiteLLM)
│   ├── java/                         # Java static analysis
│   ├── metrics/                      # JaCoCo, PIT, tsDetect, aggregation
│   ├── datasets/                     # Classes2Test, Defects4J
│   ├── evaluation/                   # Statistics, ablation, memorization
│   └── report/                       # Report Generator Module
│
├── tests/                            # 331 tests covering the above
│
├── docs/
│   ├── ARCHITECTURE.md               # Module-by-module design
│   └── REPLICATION.md                # What is verified, and how to re-run
│
├── config/
│   ├── dataset/
│   │   └── classes2test_config.yaml
│   └── experiments/
│       └── framework_test-full-evaluation.yaml
│
├── prompts/
│   ├── zero_shot_java_test.txt       # Static zero-shot prompt
│   ├── few_shot_java_test.txt        # Static few-shot prompt with examples
│   ├── dynamic_java_test.txt         # Dynamic prompting strategy documentation
│   ├── pseudo_code_java_test.txt     # Pseudo-code strategy documentation
│   └── agents/                       # The ten agent system prompts
│       ├── README.md
│       ├── repository_manager_agent.txt
│       ├── repository_miner_agent.txt
│       ├── class_analyzer_agent.txt
│       ├── blackbox_agent.txt
│       ├── whitebox_agent.txt
│       ├── prompt_engineer_agent.txt
│       ├── intermediate_representation_agent.txt
│       ├── tester_agent.txt
│       ├── test_fixer_agent.txt
│       ├── error_interpreter_agent.txt
│       └── classifier_agent.txt
│
├── scripts/
│   ├── analysis.py                   # Data analysis functions
│   ├── visualize.py                  # Figure generation scripts
│   ├── make_synthetic_projects.py    # Synthetic arm of the memorization control
│   ├── smoke_run.sh                  # Bounded end-to-end check
│
└── data/
    ├── raw/
    │   ├── metrics_per_model_strategy.csv   # Full experimental results (Table tab:extended_results_with_compilation)
    │   ├── correction_loop_breakdown.csv    # Correction loop statistics (Table tab:correction_breakdown)
    │   ├── ablation_study_results.csv       # Ablation study summary (Table tab:ablation_results)
    │   ├── ablation_per_class_results.csv   # Ablation per-class raw data (2,000 classes × 5 configs)
    │   ├── dataset_characteristics.csv      # Classes2Test characteristics (Table tab:dataset_characteristics)
    │   ├── dataset_complexity_comparison.csv# Classes2Test vs Defects4J complexity (Table tab:dataset_complexity_comparison)
    │   ├── test_smells_catalog.csv          # 19 test smells from tsDetect (Table tab:test_smells_catalog)
    │   ├── cost_breakdown.csv               # Computational cost (Table tab:cost)
    │   ├── defects4j_results.csv            # Defects4J FDR on 17 projects × 4 strategies (Table tab:defects4j_results)
    │   ├── defects4j_quality_metrics.csv    # Defects4J quality metrics (Table tab:defects4j_quality_metrics)
    │   ├── defects4j_per_bug_results.csv    # Defects4J per-bug raw data
    │   ├── undetected_faults_taxonomy.csv   # Five RIPR-grounded groups over all 835 bugs
    │   ├── statistical_tests.csv            # Pairwise statistical comparisons across models and strategies
    │   ├── statistical_tests_vs_oss.csv     # Statistical comparison of models against human OSS baseline
    │   ├── memorization_coverage.csv        # gpt-4.1 memorization at three levels (Table tab:memorization_coverage)
    │   ├── memorization_popularity.csv      # Memorization by GitHub stars (Table tab:memorization_popularity)
    │   ├── memorization_framework.csv       # Memorization by test framework (Table tab:memorization_framework)
    │   ├── memorization_impact.csv          # Memorized vs non-memorized performance (Table tab:memorization_impact)
    │   ├── rw_compare_all.csv               # Related-work comparison table (Table tab:rw_compare_all)
    │   ├── generated_tests/                 # LLM-generated suites
    │   ├── error_logs/                      # Raw build failures
    │   ├── classes2test_records/            # Corpus records (from AgoneTest)
    │   ├── telemetry.csv                    # Per-call token/cost log
    │   ├── per_class_results.csv            # Per-class RQ1 results
    │   ├── generated_tests/                 # 13,592 measured suites + 9,624 failed attempts
    │   ├── error_logs/                      # 9,624 build/test logs, parsed and raw
    │   ├── undetected_faults_labels.csv     # Per-bug taxonomy labels (835 bugs)
    │   ├── annotation_disagreements.csv     # The 29 arbitrated cases
    │   ├── rq6/                             # Head-to-head against existing generators
    │   ├── rq7/                             # Agentic-contribution controls
    │   └── memorization_control/            # Unseen-corpus control for the probe
    │
    └── processed/
        ├── rq1_summary.csv                  # RQ1: Model comparison summary
        ├── rq2_summary.csv                  # RQ2: Agentic approach impact
        ├── rq3_correction_analysis.csv      # RQ3: Correction loop analysis
        ├── rq4_human_vs_llm.csv             # RQ4: Human vs LLM comparison
        ├── compilation_rate_analysis.csv   # Compilation rate improvements
        └── test_smells_summary.csv          # Test smell analysis
```

### 1.1 `config/`

All configuration used to run the experiments in the paper.

- `config/dataset/classes2test_config.yaml`
  Config file for use Classes2Test dataset in BenjiTest.

- `config/experiments/*.yaml` — one file per experiment:
  - `framework_test-full-evaluation.yaml` — the main campaign (RQ1–RQ5)
  - `rq6-baselines.yaml` — head-to-head against ChatUniTest, TestForge, EvoSuite
  - `rq7-controls.yaml` — non-agentic and budget-normalised controls
- `config/dataset/control.yaml` — the memorisation control corpus (post-cutoff,
  private, and synthetic classes the model cannot have seen)

  Each experiment file declares:
  - list of LLMs and provider metadata  
  - enabled strategies (`static`, `dynamic`, `intermediate`)  
  - configuration of agents/crews  
  - parameter of the correction loop (max attempts)  
  - build system options (timeouts, instrumentation, etc.)

### 1.2 `prompts/`

Prompts and templates used for LLM-based test generation and correction:

- `zero_shot_java_test.txt` – base prompt for zero-shot generation.  
- `few_shot_java_test.txt` – base prompt for few-shot generation with examples.
- `dynamic_java_test.txt` – documentation of the dynamic prompting strategy used by the multi-agent system.
- `pseudo_code_java_test.txt` – two-phase pseudo-code strategy documentation.

#### Agent system prompts (`prompts/agents/`)

These files are the **single source of truth**: each agent loads the prompt named
in its `AgentSpec`, so editing a file here changes what runs. The ten agents,
numbered as in Appendix B of the paper:

| # | Agent | Crew | Prompt file |
|---|-------|------|-------------|
| 1 | Repository Manager | Repository | `repository_manager_agent.txt` |
| 2 | Repository Miner | Repository | `repository_miner_agent.txt` |
| 3 | Class Under Test Analyzer | Test Generation | `class_analyzer_agent.txt` |
| 4 | Black-box Test Agent | Test Generation | `blackbox_agent.txt` |
| 5 | White-box Test Agent | Test Generation | `whitebox_agent.txt` |
| 6 | Prompt Engineer | Test Generation | `prompt_engineer_agent.txt` |
| 7 | Intermediate Representation Agent | Test Generation / Correction | `intermediate_representation_agent.txt` |
| 8 | Test Developer Agent | Test Generation / Correction | `tester_agent.txt`, `test_fixer_agent.txt` |
| 9 | Error Interpreter | Test Correction | `error_interpreter_agent.txt` |
| 10 | Classifier Agent | Test Correction | `classifier_agent.txt` |

Agent 8 is a single agent with two system prompts: `test_fixer_agent.txt` replaces
`tester_agent.txt` when it runs inside the correction loop.

`manager_agent.txt` is a **legacy file** describing an orchestration role that the
paper assigns to the Coordinator, an architectural module rather than an agent.
It is not loaded. See `prompts/agents/README.md` for the full contracts.

- `benjitest/baselines/` – adapters for the RQ6 baselines. `chatunitest` and
  `evosuite` drive the published tools; `testforge` is a port of the published
  method to Java, since the original targets Python, and it is released so the
  fidelity of the translation can be judged. Each adapter produces a test class
  and nothing else: sandboxing, build and every metric stay with BenjiTest, which
  is what makes the comparison like-for-like.

### 1.3 `scripts/`

Analysis and visualization scripts:

- `analysis.py` – Python module for loading and analyzing experimental data:
  - `load_raw_metrics()` – loads main experimental results
  - `load_ablation_results()` – loads ablation study data
  - `load_defects4j_results()` – loads Defects4J validation results
  - `get_best_configurations()` – identifies top-performing model/strategy pairs
  - `compute_improvement_stats()` – calculates improvement from dynamic approach
  - `print_summary_report()` – generates comprehensive text report

- `smoke_run.sh` – bounded end-to-end check: validates the config, runs the test
  suite, then generates for a handful of classes against real build tooling.
- `make_synthetic_projects.py` – generates the synthetic arm of the memorization
  control corpus: Maven modules whose identifiers and domain vocabulary are drawn
  at random, so that no surface form in them can match a training corpus. Output
  is deterministic for a given `--seed`, which is what lets the control be
  regenerated and re-probed independently:

  ```bash
  python scripts/make_synthetic_projects.py --count 400 --seed 42 \
      --out data/control/synthetic
  ```

  The seed and count must match `config/dataset/control.yaml` to reproduce the
  corpus the paper reports on.

- `visualize.py` – generates figures for the paper:
  - `plot_compilation_rates_by_strategy()` – CR improvement visualization
  - `plot_mutation_scores_heatmap()` – model × strategy heatmap
  - `plot_human_vs_llm_comparison()` – RQ4 bar chart
  - `plot_ablation_study()` – ablation study visualization
  - `plot_defects4j_comparison()` – RQ5 fault detection rates
  - `generate_all_figures()` – creates all figures at once

**Usage:**
```bash
# Install dependencies
pip install pandas matplotlib seaborn

# Generate summary report
python -c "from scripts.analysis import print_summary_report; print_summary_report()"

# Generate all figures
python scripts/visualize.py
```

### 1.4 `data/`

Experimental results. Each CSV maps to a specific table or section of the paper (label in parentheses).

#### Raw Data (`data/raw/`)

**Core experimental results** (full Classes2Test campaign):
- `metrics_per_model_strategy.csv` – primary experimental results (`tab:extended_results_with_compilation`):
  - 37 rows: 9 models × 4 strategies + human baseline
  - Columns: `model`, `prompt_name`, `branch_coverage`, `line_coverage`, `method_coverage`, `mutation_score`, 8 smell counts (`AR`,`EH`,`MG`,`EA`,`LT`,`UT`,`RO`,`MNT`), `CR_initial`, `CR_after_fix`, `num_attempts`
- `correction_loop_breakdown.csv` – build/test error categories and per-category fix rate (`tab:correction_breakdown`)
- `ablation_study_results.csv` – Ablation Study aggregate, 5 configurations (`tab:ablation_results`)
- `ablation_per_class_results.csv` – Ablation per-class raw data (2,000 stratified classes × 5 configurations = 10,000 rows). The sample is paired: every configuration produced a result for every class, which is what the Wilcoxon / Cliff's delta comparisons between configurations require.

**Dataset metadata**:
- `dataset_characteristics.csv` – Classes2Test characteristics (`tab:dataset_characteristics`)
- `dataset_complexity_comparison.csv` – Classes2Test vs Defects4J structural complexity (`tab:dataset_complexity_comparison`)
- `test_smells_catalog.csv` – 19 test smells from tsDetect (`tab:test_smells_catalog`)

**Defects4J external validation (RQ5)**:
- `defects4j_results.csv` – FDR per project on the full Defects4J v3.0.1 (835 bugs, 17 projects × 4 strategies, `tab:defects4j_results`)
- `defects4j_quality_metrics.csv` – Coverage/mutation/smells on Defects4J using `gpt-4.1` (`tab:defects4j_quality_metrics`)
- `defects4j_per_bug_results.csv` – **Per-bug raw data**. Contains the full 835-bug × 4-strategy dataset from the experimental run.
- `undetected_faults_taxonomy.csv` – Distribution of all 835 bugs across five groups grounded in the RIPR model. The paper states explicitly that these are not the Shamshiri et al. 2015 categories and that the percentages are not comparable across papers

**Statistical Tests**:
- `statistical_tests.csv` – Pairwise statistical comparisons (Wilcoxon and Cliff's Delta) between strategies across all models.
- `statistical_tests_vs_oss.csv` – Statistical comparisons between dynamic strategies and the human OSS baseline.

**Memorization analysis (gpt-4.1)**:
- `memorization_coverage.csv` – Coverage at Exact / Structural / Semantic levels (`tab:memorization_coverage`)
- `memorization_popularity.csv` – Coverage stratified by GitHub star tier (`tab:memorization_popularity`)
- `memorization_framework.csv` – Coverage by test framework (`tab:memorization_framework`)
- `memorization_impact.csv` – Memorized vs non-memorized performance gap (`tab:memorization_impact`)

**Cross-work positioning**:
- `rw_compare_all.csv` – Comparison with AgoneTest / TestGenEval / TestBench / MultiFileTest (`tab:rw_compare_all`)
- `undetected_faults_labels.csv` – per-bug fault-category label for all 835 Defects4J
  bugs, with `label_source` distinguishing the 200 manually annotated from the
  rule-based remainder (`tab:undetected_faults`)
- `annotation_disagreements.csv` – the 29 cases the two annotators labelled
  differently, with the arbitrated outcome

**RQ6 — calibration against existing generators** (`data/raw/rq6/`, produced by
`config/experiments/rq6-baselines.yaml`)

- `per_class_rq6.csv` – one row per class per system on the common Java-8 subset
  (4,200 classes × 5 systems = 21,000 rows), backing `tab:rq6_comparison`. The
  quality columns are populated only where the test finally compiled, so the
  table's means are means over the compiled subset, as everywhere else in the paper.

**RQ7 — isolating the agentic contribution** (`data/raw/rq7/`, produced by
`config/experiments/rq7-controls.yaml`)

- `per_class_controls.csv` – the six arms on the same 2,000-class stratified
  sample (12,000 rows), backing `tab:rq7_controls`. Every arm ran on every class,
  so the contrasts are paired.
- `per_class_correction_factor.csv` – compilation with the loop off and on, per
  strategy (`tab:rq7_loop`). `compiled_loop_on` is a superset of
  `compiled_loop_off` by construction: the loop only repairs what generation failed.
- `orchestration_override.csv` – arm B-fixed, orchestration pinned to `gpt-4.1`
  with only the Test Developer varied, per model.

**Memorization control** (`data/raw/memorization_control/`, produced by
`config/dataset/control.yaml`)

- `per_class_control.csv` – the probe on 1,500 classes the model cannot have seen
  (600 post-cutoff, 500 private, 400 synthetic). Match levels nest: exact implies
  structural implies semantic.
- `control_vs_classes2test.csv` – the two corpora side by side (`tab:memorization_control`).
  The excess over the control is the portion attributable to memorization; the
  control rate itself is the base rate of re-deriving a test from the class alone.

**Cost**:
- `cost_breakdown.csv` – Computational cost breakdown (`tab:cost`)

**Generated artifacts**:
- `generated_tests/` – LLM-generated test suites with their correction-loop
  attempts, one entry per (repository, class, model, strategy). Carried in this
  repository; `data/raw/generated_tests/README.md` documents the layout.
- `error_logs/` – raw Maven / Gradle / javac / Surefire output for every failed
  attempt, with the taxonomy label assigned to it. Carried in this repository.
- `classes2test_records/` – the Classes2Test records themselves (425,393
  focal-method / test-case pairs over 147,473 test classes). These belong to the
  AgoneTest study that published the corpus, not to this one, and are
  obtained from its own release rather than duplicated here.
- `telemetry.csv` – the LLM call log, released as a systematic 1-in-1,000 sample
  of the 16.77 million calls: tokens, latency, billing mode. The sampling interval
  is fixed, so the sample is reproducible, and the totals of `tab:cost` recompute
  from it by scaling.
  Every figure in the paper's cost table is recomputable from this file.
- `per_class_results.csv` – per-class RQ1 results, the basis for the reported
  distributions, confidence intervals, and paired statistical tests.

#### Processed Data (`data/processed/`)

Summary tables derived from raw data for each research question:

| File | Description | Paper Reference |
|------|-------------|-----------------|
| `rq1_summary.csv` | Model performance comparison | RQ1: Section 4.1 |
| `rq2_summary.csv` | Dynamic vs static strategy impact | RQ2: Section 4.2 |
| `rq3_correction_analysis.csv` | Correction loop effectiveness | RQ3: Section 4.3 |
| `rq4_human_vs_llm.csv` | Human-written vs LLM comparison | RQ4: Section 4.4 |
| `compilation_rate_analysis.csv` | CR improvements across models | Section 4 |
| `test_smells_summary.csv` | Test smell detection summary | Section 4 |  
---

## 2. What this repository provides

### 2.1 Scope

This repository is sufficient to:

- **Run BenjiTest** on your own Java project, with any supported LLM backend.
- **Re-run a campaign** at whatever scale your budget allows (`docs/REPLICATION.md` §5).
- Inspect **all prompts and templates** used for test generation and correction.
- Review the **agent system prompts** of the multi-agent architecture.
- Inspect the **raw experimental results** for all models and strategies.
- **Reproduce the tables and figures** in the paper using the provided analysis scripts.
- Examine **test files** generated by LLMs and corrected by the framework.
- Verify the **ablation study** and **Defects4J validation** results.
- Audit the **correction loop** effectiveness across models.

### 2.2 Known limits

Stated plainly, so you know what to expect before relying on a code path:

- **Gradle at scale.** Gradle support is implemented and unit-tested, but the
  end-to-end verification run used Maven.
- **Mutation analysis on Gradle.** The PIT Gradle plugin must be applied in the
  `plugins {}` block, which cannot be done by appending to a build script.
  Mutation analysis is therefore wired for Maven only; Gradle projects yield
  coverage and smells but no mutation score.
- **tsDetect calibration.** The built-in smell detector implements the same 19
  rules but has not been calibrated against tsDetect's output. Counts from the
  two detectors must not be pooled; every result records which detector produced it.
- **CodeBLEU.** The reference `codebleu` package is used when installed; the
  built-in fallback derives its AST from `javalang` rather than tree-sitter, so
  scores can differ by a small margin. The implementation used is reported on
  every score.
- **Reproducibility of individual generations.** See [On determinism](#on-determinism).

### 2.3 Quick start

The Docker image carries the whole toolchain — JDK 8 and 17, Maven, Gradle,
JaCoCo, PIT, tsDetect — so nothing but Docker is needed to exercise the pipeline:

```bash
docker build -t benjitest .
docker run --rm benjitest                       # 331 tests, no network needed
docker run --rm -e OPENAI_API_KEY=... benjitest ./scripts/smoke_run.sh
```

Or locally:

```bash
git clone <repository-url> && cd benjitest
pip install -e ".[dev]"
# Reproduce the paper's tables and figures from the published measurements
python -c "from scripts.analysis import print_summary_report; print_summary_report()"
python scripts/visualize.py

# Bounded end-to-end run: real Maven, JaCoCo and PIT on 20 classes.
# This is the only step that costs money (requires an API key, see .env.example).
./scripts/smoke_run.sh
```

### 2.4 Where the data lives

The repository carries everything this study produced: the framework, the
configuration, the prompts, the aggregated measurements, the generated suites and
the raw build logs.

| Directory | What | Size |
|---|---|---|
| `data/raw/generated_tests` | LLM-generated suites + correction attempts | 177 MB |
| `data/raw/error_logs` | Raw build failures with taxonomy labels | 75 MB |

The one thing it does not duplicate is `data/raw/classes2test_records/`, the
Classes2Test corpus itself. That corpus was published by the AgoneTest study; we
reuse it unchanged, and it is obtained from its own release rather than re-hosted
here.

---

## 3. License

BenjiTest — the framework, its configuration, prompts, scripts, and the data files
in this repository — is released under the license specified in `LICENSE`.

---

## 4. Contact

For questions, bug reports, or artifact-related issues, please contact:

- **Andrea Lops** – <andrea.lops@poliba.it>

Please mention **“BenjiTest JSS artifact”** in the subject line when writing about this repository.
