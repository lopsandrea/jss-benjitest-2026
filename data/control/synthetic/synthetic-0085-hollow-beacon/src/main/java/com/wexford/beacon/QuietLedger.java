package com.wexford.beacon;

/**
 * Synthetic control class assembled from 5 independent features.
 */
public class QuietLedger {

    private final int depth0 = 20;
    private int capacity0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten0(int value) {
        if (value < 0) {
            return this.capacity0;
        }
        if (this.capacity0 + value > this.depth0) {
            this.capacity0 = this.depth0;
        } else {
            this.capacity0 += value;
        }
        return this.capacity0;
    }

    public int capacity0Value() {
        return this.capacity0;
    }

    private final double threshold1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold1 ? this.threshold1 : raw;
    }

    private final int capacity2 = 2;
    private final int ratio2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity2 && value <= this.ratio2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift3 = 5;
    private final int weight3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate3(int value) {
        if (value < this.drift3) {
            return "below";
        }
        if (value == this.drift3) {
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

    public int drift3Bound() {
        return this.drift3;
    }

    public int weight3Bound() {
        return this.weight3;
    }

    private final int yield4 = 1;
    private int margin4;
    private boolean cadence4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal4() {
        if (this.cadence4) {
            return false;
        }
        this.margin4++;
        if (this.margin4 >= this.yield4) {
            this.cadence4 = true;
        }
        return true;
    }

    public int margin4Count() {
        return this.margin4;
    }
}
