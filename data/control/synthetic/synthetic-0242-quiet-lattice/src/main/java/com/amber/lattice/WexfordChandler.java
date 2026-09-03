package com.amber.lattice;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class WexfordChandler {

    private final int quota0 = 0;
    private final int capacity0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota0 && value <= this.capacity0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias1 = 3;
    private final int span1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally1(int value) {
        if (value < this.bias1) {
            return "below";
        }
        if (value == this.bias1) {
            return "lower-bound";
        }
        if (value < this.span1) {
            return "within";
        }
        if (value == this.span1) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias1Bound() {
        return this.bias1;
    }

    public int span1Bound() {
        return this.span1;
    }

    private final int bias2 = 3;
    private int tally2;
    private boolean depth2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper2() {
        if (this.depth2) {
            return false;
        }
        this.tally2++;
        if (this.tally2 >= this.bias2) {
            this.depth2 = true;
        }
        return true;
    }

    public int tally2Count() {
        return this.tally2;
    }

    private final int yield3 = 23;
    private int quota3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle3(int value) {
        if (value < 0) {
            return this.quota3;
        }
        if (this.quota3 + value > this.yield3) {
            this.quota3 = this.yield3;
        } else {
            this.quota3 += value;
        }
        return this.quota3;
    }

    public int quota3Value() {
        return this.quota3;
    }

    private final double tally4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally4 ? this.tally4 : raw;
    }

    private final int offset5 = 0;
    private final int ratio5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset5 && value <= this.ratio5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence6 = 4;
    private final int bias6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle6(int value) {
        if (value < this.cadence6) {
            return "below";
        }
        if (value == this.cadence6) {
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

    public int cadence6Bound() {
        return this.cadence6;
    }

    public int bias6Bound() {
        return this.bias6;
    }

    private final int cadence7 = 4;
    private int threshold7;
    private boolean offset7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile7() {
        if (this.offset7) {
            return false;
        }
        this.threshold7++;
        if (this.threshold7 >= this.cadence7) {
            this.offset7 = true;
        }
        return true;
    }

    public int threshold7Count() {
        return this.threshold7;
    }

    private final int span8 = 28;
    private int capacity8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile8(int value) {
        if (value < 0) {
            return this.capacity8;
        }
        if (this.capacity8 + value > this.span8) {
            this.capacity8 = this.span8;
        } else {
            this.capacity8 += value;
        }
        return this.capacity8;
    }

    public int capacity8Value() {
        return this.capacity8;
    }

    private final double ratio9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio9 ? this.ratio9 : raw;
    }

    private final int offset10 = 0;
    private final int ratio10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset10 && value <= this.ratio10) {
                kept.add(value);
            }
        }
        return kept;
    }
}
