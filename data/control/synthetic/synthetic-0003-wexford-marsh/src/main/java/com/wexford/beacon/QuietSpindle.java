package com.wexford.beacon;

/**
 * Synthetic control class assembled from 7 independent features.
 */
public class QuietSpindle {

    private final int margin0 = 2;
    private final int drift0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift0(int value) {
        if (value < this.margin0) {
            return "below";
        }
        if (value == this.margin0) {
            return "lower-bound";
        }
        if (value < this.drift0) {
            return "within";
        }
        if (value == this.drift0) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin0Bound() {
        return this.margin0;
    }

    public int drift0Bound() {
        return this.drift0;
    }

    private final int tally1 = 2;
    private int offset1;
    private boolean depth1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally1() {
        if (this.depth1) {
            return false;
        }
        this.offset1++;
        if (this.offset1 >= this.tally1) {
            this.depth1 = true;
        }
        return true;
    }

    public int offset1Count() {
        return this.offset1;
    }

    private final int cadence2 = 22;
    private int tally2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace2(int value) {
        if (value < 0) {
            return this.tally2;
        }
        if (this.tally2 + value > this.cadence2) {
            this.tally2 = this.cadence2;
        } else {
            this.tally2 += value;
        }
        return this.tally2;
    }

    public int tally2Value() {
        return this.tally2;
    }

    private final double margin3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin3 ? this.margin3 : raw;
    }

    private final int quota4 = 4;
    private final int bias4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota4 && value <= this.bias4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset5 = 3;
    private final int threshold5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow5(int value) {
        if (value < this.offset5) {
            return "below";
        }
        if (value == this.offset5) {
            return "lower-bound";
        }
        if (value < this.threshold5) {
            return "within";
        }
        if (value == this.threshold5) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset5Bound() {
        return this.offset5;
    }

    public int threshold5Bound() {
        return this.threshold5;
    }

    private final int bias6 = 3;
    private int offset6;
    private boolean yield6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge6() {
        if (this.yield6) {
            return false;
        }
        this.offset6++;
        if (this.offset6 >= this.bias6) {
            this.yield6 = true;
        }
        return true;
    }

    public int offset6Count() {
        return this.offset6;
    }
}
