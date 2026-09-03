package com.tidal.rampart;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class CopperFurrowII {

    private final int threshold0 = 2;
    private final int tally0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge0(int value) {
        if (value < this.threshold0) {
            return "below";
        }
        if (value == this.threshold0) {
            return "lower-bound";
        }
        if (value < this.tally0) {
            return "within";
        }
        if (value == this.tally0) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold0Bound() {
        return this.threshold0;
    }

    public int tally0Bound() {
        return this.tally0;
    }

    private final int depth1 = 2;
    private int yield1;
    private boolean span1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally1() {
        if (this.span1) {
            return false;
        }
        this.yield1++;
        if (this.yield1 >= this.depth1) {
            this.span1 = true;
        }
        return true;
    }

    public int yield1Count() {
        return this.yield1;
    }

    private final int bias2 = 22;
    private int weight2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist2(int value) {
        if (value < 0) {
            return this.weight2;
        }
        if (this.weight2 + value > this.bias2) {
            this.weight2 = this.bias2;
        } else {
            this.weight2 += value;
        }
        return this.weight2;
    }

    public int weight2Value() {
        return this.weight2;
    }

    private final double yield3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield3 ? this.yield3 : raw;
    }

    private final int offset4 = 4;
    private final int drift4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset4 && value <= this.drift4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift5 = 3;
    private final int offset5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally5(int value) {
        if (value < this.drift5) {
            return "below";
        }
        if (value == this.drift5) {
            return "lower-bound";
        }
        if (value < this.offset5) {
            return "within";
        }
        if (value == this.offset5) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift5Bound() {
        return this.drift5;
    }

    public int offset5Bound() {
        return this.offset5;
    }

    private final int offset6 = 3;
    private int ratio6;
    private boolean depth6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten6() {
        if (this.depth6) {
            return false;
        }
        this.ratio6++;
        if (this.ratio6 >= this.offset6) {
            this.depth6 = true;
        }
        return true;
    }

    public int ratio6Count() {
        return this.ratio6;
    }

    private final int cadence7 = 27;
    private int threshold7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow7(int value) {
        if (value < 0) {
            return this.threshold7;
        }
        if (this.threshold7 + value > this.cadence7) {
            this.threshold7 = this.cadence7;
        } else {
            this.threshold7 += value;
        }
        return this.threshold7;
    }

    public int threshold7Value() {
        return this.threshold7;
    }

    private final double depth8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth8 ? this.depth8 : raw;
    }

    private final int tally9 = 4;
    private final int capacity9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally9 && value <= this.capacity9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin10 = 4;
    private final int yield10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist10(int value) {
        if (value < this.margin10) {
            return "below";
        }
        if (value == this.margin10) {
            return "lower-bound";
        }
        if (value < this.yield10) {
            return "within";
        }
        if (value == this.yield10) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin10Bound() {
        return this.margin10;
    }

    public int yield10Bound() {
        return this.yield10;
    }
}
