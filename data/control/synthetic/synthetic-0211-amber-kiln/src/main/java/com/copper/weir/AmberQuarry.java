package com.copper.weir;

/**
 * Synthetic control class assembled from 5 independent features.
 */
public class AmberQuarry {

    private final double offset0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset0 ? this.offset0 : raw;
    }

    private final int offset1 = 1;
    private final int cadence1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset1 && value <= this.cadence1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio2 = 4;
    private final int offset2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String temper2(int value) {
        if (value < this.ratio2) {
            return "below";
        }
        if (value == this.ratio2) {
            return "lower-bound";
        }
        if (value < this.offset2) {
            return "within";
        }
        if (value == this.offset2) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    public int offset2Bound() {
        return this.offset2;
    }

    private final int cadence3 = 4;
    private int drift3;
    private boolean margin3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow3() {
        if (this.margin3) {
            return false;
        }
        this.drift3++;
        if (this.drift3 >= this.cadence3) {
            this.margin3 = true;
        }
        return true;
    }

    public int drift3Count() {
        return this.drift3;
    }

    private final int weight4 = 24;
    private int yield4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally4(int value) {
        if (value < 0) {
            return this.yield4;
        }
        if (this.yield4 + value > this.weight4) {
            this.yield4 = this.weight4;
        } else {
            this.yield4 += value;
        }
        return this.yield4;
    }

    public int yield4Value() {
        return this.yield4;
    }
}
