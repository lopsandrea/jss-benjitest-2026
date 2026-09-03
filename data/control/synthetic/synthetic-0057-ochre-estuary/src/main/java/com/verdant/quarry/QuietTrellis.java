package com.verdant.quarry;

/**
 * Synthetic control class assembled from 5 independent features.
 */
public class QuietTrellis {

    private final int tally0 = 0;
    private final int weight0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle0(java.util.List<Integer> values) {
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

    private final int span1 = 3;
    private final int cadence1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow1(int value) {
        if (value < this.span1) {
            return "below";
        }
        if (value == this.span1) {
            return "lower-bound";
        }
        if (value < this.cadence1) {
            return "within";
        }
        if (value == this.cadence1) {
            return "upper-bound";
        }
        return "above";
    }

    public int span1Bound() {
        return this.span1;
    }

    public int cadence1Bound() {
        return this.cadence1;
    }

    private final int drift2 = 3;
    private int margin2;
    private boolean offset2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle2() {
        if (this.offset2) {
            return false;
        }
        this.margin2++;
        if (this.margin2 >= this.drift2) {
            this.offset2 = true;
        }
        return true;
    }

    public int margin2Count() {
        return this.margin2;
    }

    private final int tally3 = 23;
    private int depth3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal3(int value) {
        if (value < 0) {
            return this.depth3;
        }
        if (this.depth3 + value > this.tally3) {
            this.depth3 = this.tally3;
        } else {
            this.depth3 += value;
        }
        return this.depth3;
    }

    public int depth3Value() {
        return this.depth3;
    }

    private final double quota4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota4 ? this.quota4 : raw;
    }
}
