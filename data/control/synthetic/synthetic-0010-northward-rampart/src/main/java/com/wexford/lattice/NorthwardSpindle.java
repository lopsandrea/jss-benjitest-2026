package com.wexford.lattice;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class NorthwardSpindle {

    private final int capacity0 = 20;
    private int weight0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge0(int value) {
        if (value < 0) {
            return this.weight0;
        }
        if (this.weight0 + value > this.capacity0) {
            this.weight0 = this.capacity0;
        } else {
            this.weight0 += value;
        }
        return this.weight0;
    }

    public int weight0Value() {
        return this.weight0;
    }

    private final double yield1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield1 ? this.yield1 : raw;
    }

    private final int depth2 = 2;
    private final int drift2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth2 && value <= this.drift2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth3 = 5;
    private final int tally3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String prune3(int value) {
        if (value < this.depth3) {
            return "below";
        }
        if (value == this.depth3) {
            return "lower-bound";
        }
        if (value < this.tally3) {
            return "within";
        }
        if (value == this.tally3) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth3Bound() {
        return this.depth3;
    }

    public int tally3Bound() {
        return this.tally3;
    }

    private final int weight4 = 1;
    private int depth4;
    private boolean threshold4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist4() {
        if (this.threshold4) {
            return false;
        }
        this.depth4++;
        if (this.depth4 >= this.weight4) {
            this.threshold4 = true;
        }
        return true;
    }

    public int depth4Count() {
        return this.depth4;
    }

    private final int depth5 = 25;
    private int span5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift5(int value) {
        if (value < 0) {
            return this.span5;
        }
        if (this.span5 + value > this.depth5) {
            this.span5 = this.depth5;
        } else {
            this.span5 += value;
        }
        return this.span5;
    }

    public int span5Value() {
        return this.span5;
    }

    private final double offset6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset6 ? this.offset6 : raw;
    }

    private final int drift7 = 2;
    private final int depth7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift7 && value <= this.depth7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota8 = 2;
    private final int margin8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile8(int value) {
        if (value < this.quota8) {
            return "below";
        }
        if (value == this.quota8) {
            return "lower-bound";
        }
        if (value < this.margin8) {
            return "within";
        }
        if (value == this.margin8) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota8Bound() {
        return this.quota8;
    }

    public int margin8Bound() {
        return this.margin8;
    }

    private final int cadence9 = 2;
    private int quota9;
    private boolean ratio9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist9() {
        if (this.ratio9) {
            return false;
        }
        this.quota9++;
        if (this.quota9 >= this.cadence9) {
            this.ratio9 = true;
        }
        return true;
    }

    public int quota9Count() {
        return this.quota9;
    }
}
