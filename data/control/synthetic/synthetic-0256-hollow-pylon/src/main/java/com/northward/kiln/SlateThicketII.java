package com.northward.kiln;

/**
 * Synthetic control class assembled from 9 independent features.
 */
public class SlateThicketII {

    private final double tally0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally0 ? this.tally0 : raw;
    }

    private final int threshold1 = 1;
    private final int ratio1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold1 && value <= this.ratio1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity2 = 4;
    private final int depth2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String tally2(int value) {
        if (value < this.capacity2) {
            return "below";
        }
        if (value == this.capacity2) {
            return "lower-bound";
        }
        if (value < this.depth2) {
            return "within";
        }
        if (value == this.depth2) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    public int depth2Bound() {
        return this.depth2;
    }

    private final int capacity3 = 4;
    private int margin3;
    private boolean quota3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl3() {
        if (this.quota3) {
            return false;
        }
        this.margin3++;
        if (this.margin3 >= this.capacity3) {
            this.quota3 = true;
        }
        return true;
    }

    public int margin3Count() {
        return this.margin3;
    }

    private final int drift4 = 24;
    private int weight4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle4(int value) {
        if (value < 0) {
            return this.weight4;
        }
        if (this.weight4 + value > this.drift4) {
            this.weight4 = this.drift4;
        } else {
            this.weight4 += value;
        }
        return this.weight4;
    }

    public int weight4Value() {
        return this.weight4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }

    private final int quota6 = 1;
    private final int span6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota6 && value <= this.span6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity7 = 5;
    private final int tally7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge7(int value) {
        if (value < this.capacity7) {
            return "below";
        }
        if (value == this.capacity7) {
            return "lower-bound";
        }
        if (value < this.tally7) {
            return "within";
        }
        if (value == this.tally7) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity7Bound() {
        return this.capacity7;
    }

    public int tally7Bound() {
        return this.tally7;
    }

    private final int cadence8 = 1;
    private int quota8;
    private boolean tally8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow8() {
        if (this.tally8) {
            return false;
        }
        this.quota8++;
        if (this.quota8 >= this.cadence8) {
            this.tally8 = true;
        }
        return true;
    }

    public int quota8Count() {
        return this.quota8;
    }
}
