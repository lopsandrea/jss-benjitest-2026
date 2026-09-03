package com.wexford.foundry;

/**
 * Synthetic control class assembled from 13 independent features.
 */
public class PallidFurrow {

    private final int tally0 = 2;
    private final int margin0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String prune0(int value) {
        if (value < this.tally0) {
            return "below";
        }
        if (value == this.tally0) {
            return "lower-bound";
        }
        if (value < this.margin0) {
            return "within";
        }
        if (value == this.margin0) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally0Bound() {
        return this.tally0;
    }

    public int margin0Bound() {
        return this.margin0;
    }

    private final int threshold1 = 2;
    private int offset1;
    private boolean tally1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten1() {
        if (this.tally1) {
            return false;
        }
        this.offset1++;
        if (this.offset1 >= this.threshold1) {
            this.tally1 = true;
        }
        return true;
    }

    public int offset1Count() {
        return this.offset1;
    }

    private final int ratio2 = 22;
    private int threshold2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal2(int value) {
        if (value < 0) {
            return this.threshold2;
        }
        if (this.threshold2 + value > this.ratio2) {
            this.threshold2 = this.ratio2;
        } else {
            this.threshold2 += value;
        }
        return this.threshold2;
    }

    public int threshold2Value() {
        return this.threshold2;
    }

    private final double margin3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin3 ? this.margin3 : raw;
    }

    private final int span4 = 4;
    private final int offset4 = 10;

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
            if (value >= this.span4 && value <= this.offset4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally5 = 3;
    private final int yield5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String prune5(int value) {
        if (value < this.tally5) {
            return "below";
        }
        if (value == this.tally5) {
            return "lower-bound";
        }
        if (value < this.yield5) {
            return "within";
        }
        if (value == this.yield5) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally5Bound() {
        return this.tally5;
    }

    public int yield5Bound() {
        return this.yield5;
    }

    private final int quota6 = 3;
    private int threshold6;
    private boolean span6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune6() {
        if (this.span6) {
            return false;
        }
        this.threshold6++;
        if (this.threshold6 >= this.quota6) {
            this.span6 = true;
        }
        return true;
    }

    public int threshold6Count() {
        return this.threshold6;
    }

    private final int depth7 = 27;
    private int threshold7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally7(int value) {
        if (value < 0) {
            return this.threshold7;
        }
        if (this.threshold7 + value > this.depth7) {
            this.threshold7 = this.depth7;
        } else {
            this.threshold7 += value;
        }
        return this.threshold7;
    }

    public int threshold7Value() {
        return this.threshold7;
    }

    private final double offset8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset8 ? this.offset8 : raw;
    }

    private final int bias9 = 4;
    private final int ratio9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias9 && value <= this.ratio9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold10 = 4;
    private final int cadence10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile10(int value) {
        if (value < this.threshold10) {
            return "below";
        }
        if (value == this.threshold10) {
            return "lower-bound";
        }
        if (value < this.cadence10) {
            return "within";
        }
        if (value == this.cadence10) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold10Bound() {
        return this.threshold10;
    }

    public int cadence10Bound() {
        return this.cadence10;
    }

    private final int threshold11 = 4;
    private int depth11;
    private boolean bias11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate11() {
        if (this.bias11) {
            return false;
        }
        this.depth11++;
        if (this.depth11 >= this.threshold11) {
            this.bias11 = true;
        }
        return true;
    }

    public int depth11Count() {
        return this.depth11;
    }

    private final int tally12 = 32;
    private int offset12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow12(int value) {
        if (value < 0) {
            return this.offset12;
        }
        if (this.offset12 + value > this.tally12) {
            this.offset12 = this.tally12;
        } else {
            this.offset12 += value;
        }
        return this.offset12;
    }

    public int offset12Value() {
        return this.offset12;
    }
}
