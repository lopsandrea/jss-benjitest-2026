# Build and test error logs

One log per failed build or test attempt, keyed by `(repository, class, model,
strategy, attempt)`. **9,624** attempts are recorded here, covering every error
event in `data/raw/per_class_results.csv`.

## Layout

```text
error_logs/
└── <repo_id>/
    └── <QualifiedClassName>/
        └── <model>__<strategy>/
            ├── attempt_1.log         # raw Maven / Surefire / javac output
            ├── attempt_1.json        # parsed: phase, category, resolution
            └── attempt_2.log
```

## `attempt_N.json`

```json
{
  "phase": "compilation",
  "category": "hallucinated_symbol",
  "attempt": 1,
  "resolved": true,
  "classifier_score": 1,
  "affected_file": "src/test/java/com/example/p0/Class000Test.java"
}
```

`category` is one of the seven the correction-loop breakdown uses:
`hallucinated_symbol`, `missing_import`, `type_mismatch`, `syntax_violation`,
`mock_setup` (build phase) and `runtime_exception`, `assertion_failure` (test
phase). Aggregating these files reproduces Table 8 — both the frequency column
and the fix rate — so the taxonomy can be recomputed from the raw logs rather
than taken on trust.

The failing source that produced each log is the corresponding `attempt_N.java`
under `data/raw/generated_tests/`, so a log and the code that caused it can be
read side by side.
