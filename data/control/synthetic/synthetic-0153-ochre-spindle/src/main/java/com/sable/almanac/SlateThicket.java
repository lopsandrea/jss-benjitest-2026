package com.sable.almanac;

/**
 * Synthetic control class assembled from 8 independent features.
 */
public class SlateThicket {

    private final int bias0 = 2;
    private final int depth0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge0(int value) {
        if (value < this.bias0) {
            return "below";
        }
        if (value == this.bias0) {
            return "lower-bound";
        }
        if (value < this.depth0) {
            return "within";
        }
        if (value == this.depth0) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias0Bound() {
        return this.bias0;
    }

    public int depth0Bound() {
        return this.depth0;
    }

    private final int depth1 = 2;
    private int span1;
    private boolean margin1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate1() {
        if (this.margin1) {
            return false;
        }
        this.span1++;
        if (this.span1 >= this.depth1) {
            this.margin1 = true;
        }
        return true;
    }

    public int span1Count() {
        return this.span1;
    }

    private final int threshold2 = 22;
    private int tally2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl2(int value) {
        if (value < 0) {
            return this.tally2;
        }
        if (this.tally2 + value > this.threshold2) {
            this.tally2 = this.threshold2;
        } else {
            this.tally2 += value;
        }
        return this.tally2;
    }

    public int tally2Value() {
        return this.tally2;
    }

    private final double threshold3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold3 ? this.threshold3 : raw;
    }

    private final int weight4 = 4;
    private final int cadence4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight4 && value <= this.cadence4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset5 = 3;
    private final int threshold5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile5(int value) {
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

    private final int tally6 = 3;
    private int threshold6;
    private boolean span6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift6() {
        if (this.span6) {
            return false;
        }
        this.threshold6++;
        if (this.threshold6 >= this.tally6) {
            this.span6 = true;
        }
        return true;
    }

    public int threshold6Count() {
        return this.threshold6;
    }

    private final int span7 = 27;
    private int threshold7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift7(int value) {
        if (value < 0) {
            return this.threshold7;
        }
        if (this.threshold7 + value > this.span7) {
            this.threshold7 = this.span7;
        } else {
            this.threshold7 += value;
        }
        return this.threshold7;
    }

    public int threshold7Value() {
        return this.threshold7;
    }
}
