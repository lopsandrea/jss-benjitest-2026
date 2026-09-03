# Memorization control corpus

1,500 classes the model under test cannot have seen, used in Section 5.6.5 to
establish how much of the 24.1% "memorization" measured on Classes2Test is
recall and how much is re-derivation. Three arms, and they are not equally
releasable.

| Arm | n | In this repository | Why |
|---|---|---|---|
| synthetic | 400 | **yes** — `synthetic/` | generated here, so it can simply be shipped |
| post-cutoff | 600 | **manifest only** — `post_cutoff_manifest.csv` | the sources are public GitHub repositories; we release the pinned commit for each so the arm can be rebuilt exactly |
| private | 500 | **no** | industrial code owned by third parties and covered by the agreements under which it was made available |

The per-class verdicts for all three arms are released in full, in
`../raw/memorization_control/per_class_control.csv`, so every number the paper
reports for the control is recomputable even where the source is not.

## Rebuilding the synthetic arm

```bash
python scripts/make_synthetic_projects.py --count 400 --seed 42 \
    --out data/control/synthetic
```

Deterministic under the seed: the same 400 projects come back.

## Rebuilding the post-cutoff arm

`post_cutoff_manifest.csv` gives, per class, the repository, the commit SHA the
class was taken at, and the file path. All 600 repositories had their first
commit after the training cutoff of every model in the panel.

## The private arm

It cannot be released, and we do not claim otherwise. Its 500 verdicts are in
the per-class file and can be dropped from any recomputation: Section 5.6.5
reports the control rate per arm precisely so that a reader who discards this
arm still has 1,000 classes and a rate to compare against.
