package com.quiet.weir;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class SlateMarsh {

    private final int drift0 = 1;
    private int yield0;
    private boolean bias0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl0() {
        if (this.bias0) {
            return false;
        }
        this.yield0++;
        if (this.yield0 >= this.drift0) {
            this.bias0 = true;
        }
        return true;
    }

    public int yield0Count() {
        return this.yield0;
    }

    private final int span1 = 21;
    private int tally1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl1(int value) {
        if (value < 0) {
            return this.tally1;
        }
        if (this.tally1 + value > this.span1) {
            this.tally1 = this.span1;
        } else {
            this.tally1 += value;
        }
        return this.tally1;
    }

    public int tally1Value() {
        return this.tally1;
    }

    private final double offset2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset2 ? this.offset2 : raw;
    }

    private final int threshold3 = 3;
    private final int ratio3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold3 && value <= this.ratio3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift4 = 2;
    private final int depth4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile4(int value) {
        if (value < this.drift4) {
            return "below";
        }
        if (value == this.drift4) {
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

    public int drift4Bound() {
        return this.drift4;
    }

    public int depth4Bound() {
        return this.depth4;
    }

    private final int threshold5 = 2;
    private int weight5;
    private boolean drift5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist5() {
        if (this.drift5) {
            return false;
        }
        this.weight5++;
        if (this.weight5 >= this.threshold5) {
            this.drift5 = true;
        }
        return true;
    }

    public int weight5Count() {
        return this.weight5;
    }

    private final int span6 = 26;
    private int offset6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten6(int value) {
        if (value < 0) {
            return this.offset6;
        }
        if (this.offset6 + value > this.span6) {
            this.offset6 = this.span6;
        } else {
            this.offset6 += value;
        }
        return this.offset6;
    }

    public int offset6Value() {
        return this.offset6;
    }

    private final double weight7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight7 ? this.weight7 : raw;
    }

    private final int weight8 = 3;
    private final int tally8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight8 && value <= this.tally8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth9 = 3;
    private final int offset9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally9(int value) {
        if (value < this.depth9) {
            return "below";
        }
        if (value == this.depth9) {
            return "lower-bound";
        }
        if (value < this.offset9) {
            return "within";
        }
        if (value == this.offset9) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth9Bound() {
        return this.depth9;
    }

    public int offset9Bound() {
        return this.offset9;
    }
}
