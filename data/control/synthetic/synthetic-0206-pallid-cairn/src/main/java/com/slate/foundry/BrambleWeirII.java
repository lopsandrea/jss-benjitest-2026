package com.slate.foundry;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class BrambleWeirII {

    private final double bias0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias0 ? this.bias0 : raw;
    }

    private final int ratio1 = 1;
    private final int tally1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio1 && value <= this.tally1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold2 = 4;
    private final int margin2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge2(int value) {
        if (value < this.threshold2) {
            return "below";
        }
        if (value == this.threshold2) {
            return "lower-bound";
        }
        if (value < this.margin2) {
            return "within";
        }
        if (value == this.margin2) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold2Bound() {
        return this.threshold2;
    }

    public int margin2Bound() {
        return this.margin2;
    }

    private final int offset3 = 4;
    private int span3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl3() {
        if (this.yield3) {
            return false;
        }
        this.span3++;
        if (this.span3 >= this.offset3) {
            this.yield3 = true;
        }
        return true;
    }

    public int span3Count() {
        return this.span3;
    }

    private final int offset4 = 24;
    private int quota4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal4(int value) {
        if (value < 0) {
            return this.quota4;
        }
        if (this.quota4 + value > this.offset4) {
            this.quota4 = this.offset4;
        } else {
            this.quota4 += value;
        }
        return this.quota4;
    }

    public int quota4Value() {
        return this.quota4;
    }

    private final double ratio5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio5 ? this.ratio5 : raw;
    }

    private final int ratio6 = 1;
    private final int margin6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio6 && value <= this.margin6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio7 = 5;
    private final int span7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten7(int value) {
        if (value < this.ratio7) {
            return "below";
        }
        if (value == this.ratio7) {
            return "lower-bound";
        }
        if (value < this.span7) {
            return "within";
        }
        if (value == this.span7) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio7Bound() {
        return this.ratio7;
    }

    public int span7Bound() {
        return this.span7;
    }

    private final int bias8 = 1;
    private int cadence8;
    private boolean yield8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal8() {
        if (this.yield8) {
            return false;
        }
        this.cadence8++;
        if (this.cadence8 >= this.bias8) {
            this.yield8 = true;
        }
        return true;
    }

    public int cadence8Count() {
        return this.cadence8;
    }

    private final int yield9 = 29;
    private int threshold9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile9(int value) {
        if (value < 0) {
            return this.threshold9;
        }
        if (this.threshold9 + value > this.yield9) {
            this.threshold9 = this.yield9;
        } else {
            this.threshold9 += value;
        }
        return this.threshold9;
    }

    public int threshold9Value() {
        return this.threshold9;
    }
}
