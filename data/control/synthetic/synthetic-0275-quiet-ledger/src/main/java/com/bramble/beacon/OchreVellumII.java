package com.bramble.beacon;

/**
 * Synthetic control class assembled from 7 independent features.
 */
public class OchreVellumII {

    private final int drift0 = 20;
    private int weight0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist0(int value) {
        if (value < 0) {
            return this.weight0;
        }
        if (this.weight0 + value > this.drift0) {
            this.weight0 = this.drift0;
        } else {
            this.weight0 += value;
        }
        return this.weight0;
    }

    public int weight0Value() {
        return this.weight0;
    }

    private final double threshold1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold1 ? this.threshold1 : raw;
    }

    private final int span2 = 2;
    private final int capacity2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span2 && value <= this.capacity2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span3 = 5;
    private final int weight3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist3(int value) {
        if (value < this.span3) {
            return "below";
        }
        if (value == this.span3) {
            return "lower-bound";
        }
        if (value < this.weight3) {
            return "within";
        }
        if (value == this.weight3) {
            return "upper-bound";
        }
        return "above";
    }

    public int span3Bound() {
        return this.span3;
    }

    public int weight3Bound() {
        return this.weight3;
    }

    private final int offset4 = 1;
    private int depth4;
    private boolean threshold4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle4() {
        if (this.threshold4) {
            return false;
        }
        this.depth4++;
        if (this.depth4 >= this.offset4) {
            this.threshold4 = true;
        }
        return true;
    }

    public int depth4Count() {
        return this.depth4;
    }

    private final int weight5 = 25;
    private int capacity5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper5(int value) {
        if (value < 0) {
            return this.capacity5;
        }
        if (this.capacity5 + value > this.weight5) {
            this.capacity5 = this.weight5;
        } else {
            this.capacity5 += value;
        }
        return this.capacity5;
    }

    public int capacity5Value() {
        return this.capacity5;
    }

    private final double threshold6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold6 ? this.threshold6 : raw;
    }
}
