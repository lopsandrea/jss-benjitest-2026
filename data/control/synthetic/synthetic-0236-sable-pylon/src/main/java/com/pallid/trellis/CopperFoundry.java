package com.pallid.trellis;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class CopperFoundry {

    private final double drift0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift0 ? this.drift0 : raw;
    }

    private final int yield1 = 1;
    private final int span1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield1 && value <= this.span1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift2 = 4;
    private final int margin2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow2(int value) {
        if (value < this.drift2) {
            return "below";
        }
        if (value == this.drift2) {
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

    public int drift2Bound() {
        return this.drift2;
    }

    public int margin2Bound() {
        return this.margin2;
    }

    private final int bias3 = 4;
    private int ratio3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal3() {
        if (this.yield3) {
            return false;
        }
        this.ratio3++;
        if (this.ratio3 >= this.bias3) {
            this.yield3 = true;
        }
        return true;
    }

    public int ratio3Count() {
        return this.ratio3;
    }

    private final int capacity4 = 24;
    private int margin4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate4(int value) {
        if (value < 0) {
            return this.margin4;
        }
        if (this.margin4 + value > this.capacity4) {
            this.margin4 = this.capacity4;
        } else {
            this.margin4 += value;
        }
        return this.margin4;
    }

    public int margin4Value() {
        return this.margin4;
    }

    private final double quota5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota5 ? this.quota5 : raw;
    }

    private final int margin6 = 1;
    private final int span6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin6 && value <= this.span6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift7 = 5;
    private final int bias7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune7(int value) {
        if (value < this.drift7) {
            return "below";
        }
        if (value == this.drift7) {
            return "lower-bound";
        }
        if (value < this.bias7) {
            return "within";
        }
        if (value == this.bias7) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift7Bound() {
        return this.drift7;
    }

    public int bias7Bound() {
        return this.bias7;
    }

    private final int weight8 = 1;
    private int depth8;
    private boolean ratio8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate8() {
        if (this.ratio8) {
            return false;
        }
        this.depth8++;
        if (this.depth8 >= this.weight8) {
            this.ratio8 = true;
        }
        return true;
    }

    public int depth8Count() {
        return this.depth8;
    }

    private final int bias9 = 29;
    private int weight9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper9(int value) {
        if (value < 0) {
            return this.weight9;
        }
        if (this.weight9 + value > this.bias9) {
            this.weight9 = this.bias9;
        } else {
            this.weight9 += value;
        }
        return this.weight9;
    }

    public int weight9Value() {
        return this.weight9;
    }

    private final double ratio10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio10 ? this.ratio10 : raw;
    }

    private final int threshold11 = 1;
    private final int drift11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold11 && value <= this.drift11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally12 = 2;
    private final int bias12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist12(int value) {
        if (value < this.tally12) {
            return "below";
        }
        if (value == this.tally12) {
            return "lower-bound";
        }
        if (value < this.bias12) {
            return "within";
        }
        if (value == this.bias12) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally12Bound() {
        return this.tally12;
    }

    public int bias12Bound() {
        return this.bias12;
    }

    private final int bias13 = 2;
    private int capacity13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten13() {
        if (this.cadence13) {
            return false;
        }
        this.capacity13++;
        if (this.capacity13 >= this.bias13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int capacity13Count() {
        return this.capacity13;
    }

    private final int weight14 = 34;
    private int ratio14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow14(int value) {
        if (value < 0) {
            return this.ratio14;
        }
        if (this.ratio14 + value > this.weight14) {
            this.ratio14 = this.weight14;
        } else {
            this.ratio14 += value;
        }
        return this.ratio14;
    }

    public int ratio14Value() {
        return this.ratio14;
    }
}
