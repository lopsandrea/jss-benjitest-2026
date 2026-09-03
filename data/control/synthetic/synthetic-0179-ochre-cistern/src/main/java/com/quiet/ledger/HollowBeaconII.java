package com.quiet.ledger;

/**
 * Synthetic control class assembled from 4 independent features.
 */
public class HollowBeaconII {

    private final int tally0 = 1;
    private int offset0;
    private boolean span0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile0() {
        if (this.span0) {
            return false;
        }
        this.offset0++;
        if (this.offset0 >= this.tally0) {
            this.span0 = true;
        }
        return true;
    }

    public int offset0Count() {
        return this.offset0;
    }

    private final int margin1 = 21;
    private int capacity1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist1(int value) {
        if (value < 0) {
            return this.capacity1;
        }
        if (this.capacity1 + value > this.margin1) {
            this.capacity1 = this.margin1;
        } else {
            this.capacity1 += value;
        }
        return this.capacity1;
    }

    public int capacity1Value() {
        return this.capacity1;
    }

    private final double bias2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias2 ? this.bias2 : raw;
    }

    private final int span3 = 3;
    private final int ratio3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span3 && value <= this.ratio3) {
                kept.add(value);
            }
        }
        return kept;
    }
}
