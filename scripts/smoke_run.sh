#!/usr/bin/env bash
# Bounded end-to-end check: exercises the whole pipeline on a handful of classes
# so the framework can be verified without committing to a campaign's cost.
#
#   ./scripts/smoke_run.sh              # 20 classes, gpt-4.1, dynamic
#   MODEL=gpt-4o-mini LIMIT=5 ./scripts/smoke_run.sh
#
# Requires: an API key for the chosen provider (see .env.example). Everything
# else -- JDK, Maven, JaCoCo, PIT -- is exercised for real.
set -euo pipefail

MODEL="${MODEL:-gpt-4.1}"
STRATEGY="${STRATEGY:-dynamic}"
LIMIT="${LIMIT:-20}"
JOBS="${JOBS:-4}"
CONFIG="${CONFIG:-config/experiments/framework_test-full-evaluation.yaml}"
OUT="${OUT:-data/raw/smoke}"

echo "=== 1/4  configuration validates ==="
benjitest validate "$CONFIG"

echo
echo "=== 2/4  offline test suite ==="
pytest -q

echo
echo "=== 3/4  campaign: $LIMIT classes, $MODEL, $STRATEGY ==="
echo "     (this is the only step that spends money)"
benjitest run "$CONFIG" \
    --models "$MODEL" \
    --strategies "$STRATEGY" \
    --limit "$LIMIT" \
    --jobs "$JOBS" \
    --output-dir "$OUT"

echo
echo "=== 4/4  results ==="
if [ -f "$OUT/per_class_results.csv" ]; then
    python3 - "$OUT/per_class_results.csv" <<'PY'
import csv, sys
rows = list(csv.DictReader(open(sys.argv[1])))
if not rows:
    print("  no rows written -- check data/raw/error_logs/"); raise SystemExit(1)
def mean(k):
    v=[float(r[k]) for r in rows if r.get(k) not in (None,"","NA")]
    return sum(v)/len(v) if v else float("nan")
print(f"  classes attempted : {len(rows)}")
for k in ("compiled","line_coverage","branch_coverage","mutation_score"):
    if k in rows[0]: print(f"  {k:<18}: {mean(k):.1f}")
PY
else
    echo "  expected $OUT/per_class_results.csv -- not written."
    echo "  A compilation rate near zero usually means a toolchain problem"
    echo "  rather than a model problem. Check $OUT/error_logs/."
    exit 1
fi
echo
echo "Smoke run complete."
