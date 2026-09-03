package com.copper.bastion;

/**
 * Synthetic control class assembled from 9 independent features.
 */
public class VerdantBastionII {

    private final int cadence0 = 20;
    private int span0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally0(int value) {
        if (value < 0) {
            return this.span0;
        }
        if (this.span0 + value > this.cadence0) {
            this.span0 = this.cadence0;
        } else {
            this.span0 += value;
        }
        return this.span0;
    }

    public int span0Value() {
        return this.span0;
    }

    private final double span1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span1 ? this.span1 : raw;
    }

    private final int depth2 = 2;
    private final int ratio2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth2 && value <= this.ratio2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio3 = 5;
    private final int yield3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal3(int value) {
        if (value < this.ratio3) {
            return "below";
        }
        if (value == this.ratio3) {
            return "lower-bound";
        }
        if (value < this.yield3) {
            return "within";
        }
        if (value == this.yield3) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    public int yield3Bound() {
        return this.yield3;
    }

    private final int yield4 = 1;
    private int offset4;
    private boolean cadence4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl4() {
        if (this.cadence4) {
            return false;
        }
        this.offset4++;
        if (this.offset4 >= this.yield4) {
            this.cadence4 = true;
        }
        return true;
    }

    public int offset4Count() {
        return this.offset4;
    }

    private final int span5 = 25;
    private int drift5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper5(int value) {
        if (value < 0) {
            return this.drift5;
        }
        if (this.drift5 + value > this.span5) {
            this.drift5 = this.span5;
        } else {
            this.drift5 += value;
        }
        return this.drift5;
    }

    public int drift5Value() {
        return this.drift5;
    }

    private final double margin6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin6 ? this.margin6 : raw;
    }

    private final int bias7 = 2;
    private final int margin7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias7 && value <= this.margin7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence8 = 2;
    private final int offset8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String furl8(int value) {
        if (value < this.cadence8) {
            return "below";
        }
        if (value == this.cadence8) {
            return "lower-bound";
        }
        if (value < this.offset8) {
            return "within";
        }
        if (value == this.offset8) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence8Bound() {
        return this.cadence8;
    }

    public int offset8Bound() {
        return this.offset8;
    }
}
