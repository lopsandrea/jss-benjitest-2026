# Generated test suites

The output of the campaign: one entry per `(repository, class, model, strategy)`,
with the correction-loop attempts that produced it.

- **13,592** measured suites (`final.java`), one per configuration that compiled
- **9,624** failed attempts (`attempt_N.java`), each carrying the defect its
  recorded error category names
- **400** classes under test (`focal/`), so every suite can actually be compiled

Class and repository identifiers are anonymised, consistently with
`data/raw/per_class_results.csv`.

## Layout

```text
generated_tests/
├── pom.xml                              # JUnit 5 + Mockito, for compiling any suite
└── classes2test/
    └── <repo_id>/
        └── <QualifiedClassName>/
            ├── focal/<Class>.java       # the class under test
            └── <model>__<strategy>/
                ├── attempt_1.java       # present when the correction loop ran
                ├── final.java           # the suite that was measured
                └── meta.json
```

`final.java` is absent where the configuration never produced a compiling suite;
`meta.json` then records `"outcome": "did_not_compile"`.

## `meta.json`

Carries the row of `per_class_results.csv` this suite corresponds to: model,
strategy, attempts, correction iterations and termination reason, token counts,
wall-clock, and — for measured suites — coverage, mutation score, and the smell
counts tsDetect reported for it (`smells_recorded`). The `focal_api` field lists the
signatures the suite exercises, so a reader can follow the assertions without
opening the class.

## Compiling a suite

```bash
cd data/raw/generated_tests
CP=$(mvn -q dependency:build-classpath -Dmdep.outputFile=/dev/stdout -o 2>/dev/null | tail -1)
javac -cp "$CP" -d /tmp/out \
    classes2test/repo_000/com.example.p0.Class000/focal/Class000.java \
    classes2test/repo_000/com.example.p0.Class000/gpt-4.1__dynamic/final.java
```

Every `final.java` in the directory compiles against its own `focal/` class. The
`attempt_N.java` files do not, except for the `assertion_failure` and
`runtime_exception` categories, which compile and fail when executed — which is
what makes them those categories.

## Recomputing the smell columns

`meta.json` carries the per-suite smell counts as tsDetect reported them
(`smells_recorded`), which are the values aggregated into the smell columns of
`per_class_results.csv`. To recheck a configuration, run tsDetect over its
`final.java` and compare.
