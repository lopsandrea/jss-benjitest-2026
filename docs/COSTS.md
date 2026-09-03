# Estimating the cost before you run

The full campaign is not something most groups will want to repeat: 99.98B tokens
and roughly eight weeks of wall-clock across 512 concurrent tasks. This page is
how to work out what a smaller run costs before starting it, and what the full
one came to.

## What the full campaign cost

| Component | Volume |
|---|---|
| Generation, zero-shot | 7.67B tokens |
| Generation, few-shot | 12.17B tokens |
| Generation, pseudo-code | 15.08B tokens |
| Generation, dynamic | 42.29B tokens |
| Correction loop (3.54M iterations) | 22.77B tokens |
| **Total** | **99.98B tokens over 16.81M calls** |

In money, at the prices in force during the campaign:

| | Amount |
|---|---|
| List price, all cloud calls billed synchronously | $434,801 |
| Less batch-endpoint pricing (56% of cloud calls, 50% rate) | −$122,921 |
| Notional cost at billed rates | $311,880 |
| Less free promotional and trial credit (Azure, Google Cloud, xAI) | −$310,942 |
| **Direct expenditure by the authors** | **$938** |

Every figure above recomputes from `data/raw/telemetry.csv`, which carries the
per-call token counts, the billing mode and the waiver flag. The log is a
systematic 1-in-1,000 sample, so multiply any aggregate by 1,000.

## Estimating a smaller run

Cost scales with the number of `(class, model, strategy)` tasks. Per class and
model, one strategy costs:

| Strategy | Tokens per class | LLM calls |
|---|---|---|
| zero-shot | 5,800 | 1 |
| few-shot | 9,200 | 1 |
| pseudo-code | 11,400 | 2 |
| dynamic | 31,900 | 6 |
| correction loop | 6,400 per iteration | 1 per iteration |

The loop runs on the classes that do not succeed on the first attempt, which is
between 5% (dynamic, strong backend) and 45% (zero-shot, weak backend). Budget
0.3 iterations per class for dynamic and 1.0 for zero-shot and you will not be
far out.

A worked example: 200 classes, one model, the dynamic strategy, loop enabled.

```text
generation   200 x 31,900                  =  6.38M tokens
correction   200 x 0.3 x 6,400             =  0.38M tokens
                                              ------------
                                              6.76M tokens
at $3.40 per M tokens (gpt-4.1, 76% prompt) =  $23
```

`tab:lowcost` in the paper gives three such configurations and what to expect
from each.

## Bounding the work before you start

```bash
benjitest validate config/experiments/framework_test-full-evaluation.yaml
```

prints the task count per class, which multiplied by your class count is the
number of generations. Then bound the run:

```bash
benjitest run config/experiments/framework_test-full-evaluation.yaml \
    --models gpt-4.1 --strategies dynamic --limit 200 --jobs 8
```

`--limit` caps the classes, `--models` and `--strategies` cut the grid, and the
response cache in `benjitest/llm/cache.py` means a resumed run does not re-pay
for tasks that already completed. Build and metric time is CPU, not tokens: JaCoCo
and PIT together took about 5,200 CPU-hours over the measured sample, roughly
0.35 CPU-hours per measured class; the build and test execution that precedes them
ran corpus-wide and cost 349,000, which is what dominates if you have credit but
not cores.
