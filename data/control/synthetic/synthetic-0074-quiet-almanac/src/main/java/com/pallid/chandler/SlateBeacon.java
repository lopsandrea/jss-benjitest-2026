package com.pallid.chandler;

/**
 * Synthetic control class assembled from 7 independent features.
 */
public class SlateBeacon {

    private final int yield0 = 1;
    private int threshold0;
    private boolean bias0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist0() {
        if (this.bias0) {
            return false;
        }
        this.threshold0++;
        if (this.threshold0 >= this.yield0) {
            this.bias0 = true;
        }
        return true;
    }

    public int threshold0Count() {
        return this.threshold0;
    }

    private final int weight1 = 21;
    private int depth1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist1(int value) {
        if (value < 0) {
            return this.depth1;
        }
        if (this.depth1 + value > this.weight1) {
            this.depth1 = this.weight1;
        } else {
            this.depth1 += value;
        }
        return this.depth1;
    }

    public int depth1Value() {
        return this.depth1;
    }

    private final double cadence2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence2 ? this.cadence2 : raw;
    }

    private final int depth3 = 3;
    private final int drift3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth3 && value <= this.drift3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin4 = 2;
    private final int threshold4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile4(int value) {
        if (value < this.margin4) {
            return "below";
        }
        if (value == this.margin4) {
            return "lower-bound";
        }
        if (value < this.threshold4) {
            return "within";
        }
        if (value == this.threshold4) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin4Bound() {
        return this.margin4;
    }

    public int threshold4Bound() {
        return this.threshold4;
    }

    private final int weight5 = 2;
    private int bias5;
    private boolean cadence5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle5() {
        if (this.cadence5) {
            return false;
        }
        this.bias5++;
        if (this.bias5 >= this.weight5) {
            this.cadence5 = true;
        }
        return true;
    }

    public int bias5Count() {
        return this.bias5;
    }

    private final int bias6 = 26;
    private int cadence6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally6(int value) {
        if (value < 0) {
            return this.cadence6;
        }
        if (this.cadence6 + value > this.bias6) {
            this.cadence6 = this.bias6;
        } else {
            this.cadence6 += value;
        }
        return this.cadence6;
    }

    public int cadence6Value() {
        return this.cadence6;
    }
}
