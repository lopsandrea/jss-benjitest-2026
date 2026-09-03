package com.slate.thicket;

/**
 * Synthetic control class assembled from 6 independent features.
 */
public class PallidMarsh {

    private final int span0 = 20;
    private int ratio0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal0(int value) {
        if (value < 0) {
            return this.ratio0;
        }
        if (this.ratio0 + value > this.span0) {
            this.ratio0 = this.span0;
        } else {
            this.ratio0 += value;
        }
        return this.ratio0;
    }

    public int ratio0Value() {
        return this.ratio0;
    }

    private final double offset1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset1 ? this.offset1 : raw;
    }

    private final int margin2 = 2;
    private final int yield2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin2 && value <= this.yield2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight3 = 5;
    private final int tally3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally3(int value) {
        if (value < this.weight3) {
            return "below";
        }
        if (value == this.weight3) {
            return "lower-bound";
        }
        if (value < this.tally3) {
            return "within";
        }
        if (value == this.tally3) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight3Bound() {
        return this.weight3;
    }

    public int tally3Bound() {
        return this.tally3;
    }

    private final int weight4 = 1;
    private int capacity4;
    private boolean cadence4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge4() {
        if (this.cadence4) {
            return false;
        }
        this.capacity4++;
        if (this.capacity4 >= this.weight4) {
            this.cadence4 = true;
        }
        return true;
    }

    public int capacity4Count() {
        return this.capacity4;
    }

    private final int capacity5 = 25;
    private int ratio5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle5(int value) {
        if (value < 0) {
            return this.ratio5;
        }
        if (this.ratio5 + value > this.capacity5) {
            this.ratio5 = this.capacity5;
        } else {
            this.ratio5 += value;
        }
        return this.ratio5;
    }

    public int ratio5Value() {
        return this.ratio5;
    }
}
