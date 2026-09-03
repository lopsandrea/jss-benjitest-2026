#!/usr/bin/env python3
"""Generate the synthetic arm of the memorization control corpus.

The control corpus exists to answer a question the similarity threshold cannot:
when GPT-4.1 reproduces a test class from the production class alone, is it
recalling the original or re-deriving it? Post-cutoff and private repositories
answer that for real code. This script supplies the third arm, where the answer
is unambiguous: classes that never existed until the seed was fixed, with
identifiers and domain vocabulary drawn at random, so no surface form in them
can match anything in a training corpus.

Size matters as much as novelty. The control is claimed to be matched to
Classes2Test on lines of code and cyclomatic complexity, so each class is
assembled from as many independent features as it takes to reach a LOC target
drawn from the corpus distribution (mean 1,178, IQR 420-1,960). A corpus of
50-line toys would be easier to reproduce than the corpus it controls for, and
would bias the control rate in the direction that flatters the paper.

    python scripts/make_synthetic_projects.py --count 400 --seed 42 \
        --out data/control/synthetic

Determinism: for a given ``--seed`` and ``--count`` the output is byte-identical,
which is what lets the control be regenerated and re-probed independently.

Referenced from ``config/dataset/control.yaml`` (source ``synthetic``).
"""
from __future__ import annotations

import argparse
import json
import random
import shutil
import sys
from pathlib import Path

# Randomised vocabulary. The words are real English so the code reads naturally
# to a model -- an obviously mangled identifier would make the class atypical in
# a way that could itself depress reproducibility -- but the combinations are
# drawn fresh, so the resulting names occur nowhere.
DOMAIN_NOUNS = [
    "Ledger", "Beacon", "Quarry", "Harbor", "Lattice", "Foundry", "Cistern",
    "Meridian", "Almanac", "Trellis", "Kiln", "Alcove", "Pylon", "Estuary",
    "Cairn", "Bastion", "Furrow", "Granary", "Spindle", "Weir", "Thicket",
    "Rampart", "Chandler", "Marsh", "Anvil", "Quill", "Sconce", "Vellum",
]
DOMAIN_QUALIFIERS = [
    "Tidal", "Amber", "Northward", "Copper", "Quiet", "Bramble", "Slate",
    "Verdant", "Hollow", "Wexford", "Ashen", "Pallid", "Ochre", "Sable",
]
ACTION_VERBS = [
    "reconcile", "tally", "flatten", "anneal", "winnow", "collate", "prune",
    "hoist", "brace", "temper", "sift", "kindle", "furl", "gauge",
]
FIELD_NOUNS = [
    "threshold", "margin", "cadence", "tally", "offset", "capacity", "ratio",
    "quota", "span", "weight", "depth", "bias", "drift", "yield",
]
# Appended when the qualifier x noun grid runs out.
_SUFFIXES = ["II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"]

# Each shape fixes the control flow one feature contributes, so a class spans a
# realistic complexity range instead of repeating one trivial pattern.
# (name, cyclomatic complexity of its method)
SHAPES = [
    ("guarded_accumulator", 4),
    ("bounded_ratio", 3),
    ("staged_filter", 5),
    ("range_classifier", 6),
    ("retry_budget", 4),
]

POM = """<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 \
http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>{group}</groupId>
  <artifactId>{artifact}</artifactId>
  <version>1.0.0</version>
  <properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.10.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
"""


def _camel(rng):
    return rng.choice(DOMAIN_QUALIFIERS) + rng.choice(DOMAIN_NOUNS)


def _lower(rng):
    return rng.choice(DOMAIN_QUALIFIERS).lower() + "-" + rng.choice(DOMAIN_NOUNS).lower()


def _feature_body(shape, n, a, b, c, verb):
    """One self-contained feature: its own state, its own method, no constructor.

    Features must compose, so nothing here touches a shared constructor; each
    keeps its configuration in an initialised final field and validates its own
    argument.
    """
    if shape == "guarded_accumulator":
        return f"""
    private final int {a} = {20 + n % 40};
    private int {b};

    /** Adds {{@code value}} without exceeding the cap, ignoring negatives. */
    public int {verb}(int value) {{
        if (value < 0) {{
            return this.{b};
        }}
        if (this.{b} + value > this.{a}) {{
            this.{b} = this.{a};
        }} else {{
            this.{b} += value;
        }}
        return this.{b};
    }}

    public int {b}Value() {{
        return this.{b};
    }}
"""
    if shape == "bounded_ratio":
        return f"""
    private final double {a} = {1 + n % 5}.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double {verb}(double numerator, double denominator) {{
        if (denominator == 0.0) {{
            throw new ArithmeticException("denominator must be non-zero");
        }}
        double raw = numerator / denominator;
        return raw > this.{a} ? this.{a} : raw;
    }}
"""
    if shape == "staged_filter":
        return f"""
    private final int {a} = {n % 5};
    private final int {b} = {6 + n % 9};

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> {verb}(java.util.List<Integer> values) {{
        if (values == null) {{
            return java.util.Collections.emptyList();
        }}
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {{
            if (value == null) {{
                continue;
            }}
            if (value >= this.{a} && value <= this.{b}) {{
                kept.add(value);
            }}
        }}
        return kept;
    }}
"""
    if shape == "range_classifier":
        return f"""
    private final int {a} = {2 + n % 4};
    private final int {b} = {7 + n % 6};

    /** Where {{@code value}} falls relative to the configured range. */
    public String {verb}(int value) {{
        if (value < this.{a}) {{
            return "below";
        }}
        if (value == this.{a}) {{
            return "lower-bound";
        }}
        if (value < this.{b}) {{
            return "within";
        }}
        if (value == this.{b}) {{
            return "upper-bound";
        }}
        return "above";
    }}

    public int {a}Bound() {{
        return this.{a};
    }}

    public int {b}Bound() {{
        return this.{b};
    }}
"""
    return f"""
    private final int {a} = {1 + n % 4};
    private int {b};
    private boolean {c};

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean {verb}() {{
        if (this.{c}) {{
            return false;
        }}
        this.{b}++;
        if (this.{b} >= this.{a}) {{
            this.{c} = true;
        }}
        return true;
    }}

    public int {b}Count() {{
        return this.{b};
    }}
"""


def _feature_test(shape, n, cls, a, b, c, verb):
    """The developer-style tests exercising one feature."""
    cap, bound, lo, hi, budget = 20 + n % 40, 1 + n % 5, n % 5, 6 + n % 9, 1 + n % 4
    rlo, rhi = 2 + n % 4, 7 + n % 6
    A = a[0].upper() + a[1:]
    if shape == "guarded_accumulator":
        return f"""
    @Test
    void accumulatesBelowTheCap{A}() {{
        {cls} subject = new {cls}();
        assertEquals(1, subject.{verb}(1));
        assertEquals(3, subject.{verb}(2));
    }}

    @Test
    void saturatesAtTheCap{A}() {{
        {cls} subject = new {cls}();
        subject.{verb}({cap});
        assertEquals({cap}, subject.{verb}(5));
    }}

    @Test
    void ignoresNegativeValues{A}() {{
        {cls} subject = new {cls}();
        subject.{verb}(3);
        assertEquals(3, subject.{verb}(-2));
        assertEquals(3, subject.{b}Value());
    }}
"""
    if shape == "bounded_ratio":
        return f"""
    @Test
    void rejectsZeroDenominator{A}() {{
        {cls} subject = new {cls}();
        assertThrows(ArithmeticException.class, () -> subject.{verb}(1.0, 0.0));
    }}

    @Test
    void returnsTheRatioBelowTheBound{A}() {{
        assertEquals(0.5, new {cls}().{verb}(1.0, 2.0), 1e-9);
    }}

    @Test
    void clampsAtTheBound{A}() {{
        assertEquals({bound}.0, new {cls}().{verb}(1000.0, 1.0), 1e-9);
    }}
"""
    if shape == "staged_filter":
        return f"""
    @Test
    void returnsEmptyForNull{A}() {{
        assertTrue(new {cls}().{verb}(null).isEmpty());
    }}

    @Test
    void keepsOnlyValuesInRange{A}() {{
        assertEquals(java.util.Arrays.asList({lo}, {hi}),
                new {cls}().{verb}(java.util.Arrays.asList({lo} - 1, {lo}, {hi}, {hi} + 1)));
    }}

    @Test
    void skipsNullElements{A}() {{
        assertEquals(java.util.Arrays.asList({hi}),
                new {cls}().{verb}(java.util.Arrays.asList(null, {hi}, null)));
    }}
"""
    if shape == "range_classifier":
        return f"""
    @Test
    void classifiesBelowTheLowerBound{A}() {{
        assertEquals("below", new {cls}().{verb}({rlo} - 1));
    }}

    @Test
    void classifiesTheBounds{A}() {{
        {cls} subject = new {cls}();
        assertEquals("lower-bound", subject.{verb}({rlo}));
        assertEquals("upper-bound", subject.{verb}({rhi}));
    }}

    @Test
    void classifiesWithinAndAbove{A}() {{
        {cls} subject = new {cls}();
        assertEquals("within", subject.{verb}({rlo} + 1));
        assertEquals("above", subject.{verb}({rhi} + 1));
    }}
"""
    return f"""
    @Test
    void allowsAttemptsUpToTheBudget{A}() {{
        {cls} subject = new {cls}();
        for (int i = 0; i < {budget}; i++) {{
            assertTrue(subject.{verb}());
        }}
        assertEquals({budget}, subject.{b}Count());
    }}

    @Test
    void refusesOnceExhausted{A}() {{
        {cls} subject = new {cls}();
        for (int i = 0; i < {budget}; i++) {{
            subject.{verb}();
        }}
        assertFalse(subject.{verb}());
    }}
"""


def _target_loc(rng):
    """A LOC target drawn to match Classes2Test: mean 1,178, IQR 420-1,960."""
    import math
    sigma = 0.9
    median = 1178 / math.exp(sigma * sigma / 2)
    return int(min(20000, max(60, round(median * math.exp(sigma * rng.gauss(0, 1))))))


def generate(out_dir: Path, count: int, seed: int) -> list[dict]:
    rng = random.Random(seed)
    manifest: list[dict] = []
    seen: set[str] = set()

    for index in range(count):
        cls = _camel(rng)
        if cls in seen:
            base = cls
            for sfx in _SUFFIXES:
                cls = base + sfx
                if cls not in seen:
                    break
            else:
                raise RuntimeError(
                    f"could not find a unique name for '{base}'; reduce --count "
                    "or extend the vocabulary lists"
                )
        seen.add(cls)

        pkg = "com.%s.%s" % (rng.choice(DOMAIN_QUALIFIERS).lower(),
                             rng.choice(DOMAIN_NOUNS).lower())
        artifact = _lower(rng)
        target = _target_loc(rng)

        # Add features until the class reaches its LOC target. Each contributes
        # ~22 lines of production code and its own complexity.
        bodies, tests, complexity, n_feat = [], [], 0, 0
        loc = 6
        while loc < target and n_feat < 400:
            shape, cc = SHAPES[(index + n_feat) % len(SHAPES)]
            sfx = str(n_feat)
            a, b, c = (f + sfx for f in rng.sample(FIELD_NOUNS, 3))
            verb = rng.choice(ACTION_VERBS) + sfx
            body = _feature_body(shape, n_feat, a, b, c, verb)
            bodies.append(body)
            tests.append(_feature_test(shape, n_feat, cls, a, b, c, verb))
            loc += len(body.splitlines())
            complexity += cc
            n_feat += 1

        production = (
            f"package {pkg};\n\n"
            f"/**\n * Synthetic control class assembled from {n_feat} independent features.\n */\n"
            f"public class {cls} {{\n" + "".join(bodies) + "}\n"
        )
        test = (
            f"package {pkg};\n\n"
            "import static org.junit.jupiter.api.Assertions.*;\n\n"
            "import org.junit.jupiter.api.Test;\n\n"
            f"class {cls}Test {{\n" + "".join(tests) + "}\n"
        )

        project = out_dir / f"synthetic-{index:04d}-{artifact}"
        src = project / "src" / "main" / "java" / Path(*pkg.split("."))
        tst = project / "src" / "test" / "java" / Path(*pkg.split("."))
        src.mkdir(parents=True, exist_ok=True)
        tst.mkdir(parents=True, exist_ok=True)
        (project / "pom.xml").write_text(POM.format(group=pkg, artifact=artifact), encoding="utf-8")
        (src / f"{cls}.java").write_text(production, encoding="utf-8")
        (tst / f"{cls}Test.java").write_text(test, encoding="utf-8")

        manifest.append({
            "project": project.name, "package": pkg, "class_name": cls,
            "test_class": f"{cls}Test", "features": n_feat,
            "cyclomatic_complexity": complexity,
            "loc": len(production.splitlines()), "test_loc": len(test.splitlines()),
            "test_framework": "junit5", "build_system": "maven",
        })
    return manifest


def main(argv=None) -> int:
    parser = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    parser.add_argument("--count", type=int, default=400,
                        help="number of projects (the paper's control uses 400)")
    parser.add_argument("--seed", type=int, default=42,
                        help="must match config/dataset/control.yaml to reproduce")
    parser.add_argument("--out", type=Path, default=Path("data/control/synthetic"))
    parser.add_argument("--force", action="store_true",
                        help="overwrite an existing output directory")
    args = parser.parse_args(argv)

    if args.count < 1:
        parser.error("--count must be at least 1")
    if args.out.exists():
        if not args.force:
            parser.error(f"{args.out} exists; pass --force to regenerate it")
        shutil.rmtree(args.out)
    args.out.mkdir(parents=True)

    manifest = generate(args.out, args.count, args.seed)
    (args.out / "manifest.json").write_text(json.dumps(manifest, indent=2) + "\n", encoding="utf-8")
    locs = sorted(m["loc"] for m in manifest)
    mean = sum(locs) / len(locs)
    q1, q3 = locs[len(locs) // 4], locs[3 * len(locs) // 4]
    print(f"{len(manifest)} synthetic projects written to {args.out}")
    print(f"LOC mean {mean:.0f}, IQR {q1}-{q3} (Classes2Test: 1178, 420-1960)")
    print(f"manifest: {args.out / 'manifest.json'}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
