package com.bramble.vellum;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class VerdantBastion {

    private final int margin0 = 1;
    private int tally0;
    private boolean capacity0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle0() {
        if (this.capacity0) {
            return false;
        }
        this.tally0++;
        if (this.tally0 >= this.margin0) {
            this.capacity0 = true;
        }
        return true;
    }

    public int tally0Count() {
        return this.tally0;
    }

    private final int tally1 = 21;
    private int threshold1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace1(int value) {
        if (value < 0) {
            return this.threshold1;
        }
        if (this.threshold1 + value > this.tally1) {
            this.threshold1 = this.tally1;
        } else {
            this.threshold1 += value;
        }
        return this.threshold1;
    }

    public int threshold1Value() {
        return this.threshold1;
    }

    private final double margin2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin2 ? this.margin2 : raw;
    }

    private final int ratio3 = 3;
    private final int offset3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio3 && value <= this.offset3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold4 = 2;
    private final int depth4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String collate4(int value) {
        if (value < this.threshold4) {
            return "below";
        }
        if (value == this.threshold4) {
            return "lower-bound";
        }
        if (value < this.depth4) {
            return "within";
        }
        if (value == this.depth4) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold4Bound() {
        return this.threshold4;
    }

    public int depth4Bound() {
        return this.depth4;
    }

    private final int bias5 = 2;
    private int drift5;
    private boolean weight5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal5() {
        if (this.weight5) {
            return false;
        }
        this.drift5++;
        if (this.drift5 >= this.bias5) {
            this.weight5 = true;
        }
        return true;
    }

    public int drift5Count() {
        return this.drift5;
    }

    private final int yield6 = 26;
    private int quota6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist6(int value) {
        if (value < 0) {
            return this.quota6;
        }
        if (this.quota6 + value > this.yield6) {
            this.quota6 = this.yield6;
        } else {
            this.quota6 += value;
        }
        return this.quota6;
    }

    public int quota6Value() {
        return this.quota6;
    }

    private final double capacity7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity7 ? this.capacity7 : raw;
    }

    private final int weight8 = 3;
    private final int span8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight8 && value <= this.span8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift9 = 3;
    private final int margin9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile9(int value) {
        if (value < this.drift9) {
            return "below";
        }
        if (value == this.drift9) {
            return "lower-bound";
        }
        if (value < this.margin9) {
            return "within";
        }
        if (value == this.margin9) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift9Bound() {
        return this.drift9;
    }

    public int margin9Bound() {
        return this.margin9;
    }
}
