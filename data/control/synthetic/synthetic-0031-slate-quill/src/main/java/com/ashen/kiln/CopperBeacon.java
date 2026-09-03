package com.ashen.kiln;

/**
 * Synthetic control class assembled from 6 independent features.
 */
public class CopperBeacon {

    private final double margin0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin0 ? this.margin0 : raw;
    }

    private final int bias1 = 1;
    private final int offset1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias1 && value <= this.offset1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield2 = 4;
    private final int drift2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace2(int value) {
        if (value < this.yield2) {
            return "below";
        }
        if (value == this.yield2) {
            return "lower-bound";
        }
        if (value < this.drift2) {
            return "within";
        }
        if (value == this.drift2) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield2Bound() {
        return this.yield2;
    }

    public int drift2Bound() {
        return this.drift2;
    }

    private final int drift3 = 4;
    private int span3;
    private boolean quota3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist3() {
        if (this.quota3) {
            return false;
        }
        this.span3++;
        if (this.span3 >= this.drift3) {
            this.quota3 = true;
        }
        return true;
    }

    public int span3Count() {
        return this.span3;
    }

    private final int threshold4 = 24;
    private int offset4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal4(int value) {
        if (value < 0) {
            return this.offset4;
        }
        if (this.offset4 + value > this.threshold4) {
            this.offset4 = this.threshold4;
        } else {
            this.offset4 += value;
        }
        return this.offset4;
    }

    public int offset4Value() {
        return this.offset4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }
}
