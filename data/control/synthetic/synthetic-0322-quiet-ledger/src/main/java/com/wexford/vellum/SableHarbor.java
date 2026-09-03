package com.wexford.vellum;

/**
 * Synthetic control class assembled from 7 independent features.
 */
public class SableHarbor {

    private final int tally0 = 0;
    private final int offset0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally0 && value <= this.offset0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity1 = 3;
    private final int bias1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow1(int value) {
        if (value < this.capacity1) {
            return "below";
        }
        if (value == this.capacity1) {
            return "lower-bound";
        }
        if (value < this.bias1) {
            return "within";
        }
        if (value == this.bias1) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity1Bound() {
        return this.capacity1;
    }

    public int bias1Bound() {
        return this.bias1;
    }

    private final int margin2 = 3;
    private int bias2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally2() {
        if (this.drift2) {
            return false;
        }
        this.bias2++;
        if (this.bias2 >= this.margin2) {
            this.drift2 = true;
        }
        return true;
    }

    public int bias2Count() {
        return this.bias2;
    }

    private final int quota3 = 23;
    private int threshold3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten3(int value) {
        if (value < 0) {
            return this.threshold3;
        }
        if (this.threshold3 + value > this.quota3) {
            this.threshold3 = this.quota3;
        } else {
            this.threshold3 += value;
        }
        return this.threshold3;
    }

    public int threshold3Value() {
        return this.threshold3;
    }

    private final double weight4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight4 ? this.weight4 : raw;
    }

    private final int weight5 = 0;
    private final int cadence5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight5 && value <= this.cadence5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift6 = 4;
    private final int bias6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper6(int value) {
        if (value < this.drift6) {
            return "below";
        }
        if (value == this.drift6) {
            return "lower-bound";
        }
        if (value < this.bias6) {
            return "within";
        }
        if (value == this.bias6) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift6Bound() {
        return this.drift6;
    }

    public int bias6Bound() {
        return this.bias6;
    }
}
