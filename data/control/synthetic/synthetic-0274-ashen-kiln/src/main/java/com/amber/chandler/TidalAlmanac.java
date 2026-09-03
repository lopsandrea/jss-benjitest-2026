package com.amber.chandler;

/**
 * Synthetic control class assembled from 9 independent features.
 */
public class TidalAlmanac {

    private final int depth0 = 1;
    private int offset0;
    private boolean quota0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow0() {
        if (this.quota0) {
            return false;
        }
        this.offset0++;
        if (this.offset0 >= this.depth0) {
            this.quota0 = true;
        }
        return true;
    }

    public int offset0Count() {
        return this.offset0;
    }

    private final int yield1 = 21;
    private int quota1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal1(int value) {
        if (value < 0) {
            return this.quota1;
        }
        if (this.quota1 + value > this.yield1) {
            this.quota1 = this.yield1;
        } else {
            this.quota1 += value;
        }
        return this.quota1;
    }

    public int quota1Value() {
        return this.quota1;
    }

    private final double offset2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset2 ? this.offset2 : raw;
    }

    private final int depth3 = 3;
    private final int yield3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth3 && value <= this.yield3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally4 = 2;
    private final int ratio4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist4(int value) {
        if (value < this.tally4) {
            return "below";
        }
        if (value == this.tally4) {
            return "lower-bound";
        }
        if (value < this.ratio4) {
            return "within";
        }
        if (value == this.ratio4) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally4Bound() {
        return this.tally4;
    }

    public int ratio4Bound() {
        return this.ratio4;
    }

    private final int threshold5 = 2;
    private int margin5;
    private boolean depth5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune5() {
        if (this.depth5) {
            return false;
        }
        this.margin5++;
        if (this.margin5 >= this.threshold5) {
            this.depth5 = true;
        }
        return true;
    }

    public int margin5Count() {
        return this.margin5;
    }

    private final int span6 = 26;
    private int drift6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten6(int value) {
        if (value < 0) {
            return this.drift6;
        }
        if (this.drift6 + value > this.span6) {
            this.drift6 = this.span6;
        } else {
            this.drift6 += value;
        }
        return this.drift6;
    }

    public int drift6Value() {
        return this.drift6;
    }

    private final double yield7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield7 ? this.yield7 : raw;
    }

    private final int depth8 = 3;
    private final int drift8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth8 && value <= this.drift8) {
                kept.add(value);
            }
        }
        return kept;
    }
}
