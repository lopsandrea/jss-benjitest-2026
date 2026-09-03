package com.verdant.ledger;

/**
 * Synthetic control class assembled from 4 independent features.
 */
public class VerdantTrellis {

    private final int tally0 = 0;
    private final int weight0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally0 && value <= this.weight0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold1 = 3;
    private final int offset1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String temper1(int value) {
        if (value < this.threshold1) {
            return "below";
        }
        if (value == this.threshold1) {
            return "lower-bound";
        }
        if (value < this.offset1) {
            return "within";
        }
        if (value == this.offset1) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold1Bound() {
        return this.threshold1;
    }

    public int offset1Bound() {
        return this.offset1;
    }

    private final int yield2 = 3;
    private int depth2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist2() {
        if (this.drift2) {
            return false;
        }
        this.depth2++;
        if (this.depth2 >= this.yield2) {
            this.drift2 = true;
        }
        return true;
    }

    public int depth2Count() {
        return this.depth2;
    }

    private final int offset3 = 23;
    private int span3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge3(int value) {
        if (value < 0) {
            return this.span3;
        }
        if (this.span3 + value > this.offset3) {
            this.span3 = this.offset3;
        } else {
            this.span3 += value;
        }
        return this.span3;
    }

    public int span3Value() {
        return this.span3;
    }
}
