package com.bramble.cairn;

/**
 * Synthetic control class assembled from 13 independent features.
 */
public class WexfordBastionII {

    private final int cadence0 = 2;
    private final int depth0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal0(int value) {
        if (value < this.cadence0) {
            return "below";
        }
        if (value == this.cadence0) {
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

    public int cadence0Bound() {
        return this.cadence0;
    }

    public int depth0Bound() {
        return this.depth0;
    }

    private final int margin1 = 2;
    private int span1;
    private boolean ratio1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace1() {
        if (this.ratio1) {
            return false;
        }
        this.span1++;
        if (this.span1 >= this.margin1) {
            this.ratio1 = true;
        }
        return true;
    }

    public int span1Count() {
        return this.span1;
    }

    private final int drift2 = 22;
    private int bias2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle2(int value) {
        if (value < 0) {
            return this.bias2;
        }
        if (this.bias2 + value > this.drift2) {
            this.bias2 = this.drift2;
        } else {
            this.bias2 += value;
        }
        return this.bias2;
    }

    public int bias2Value() {
        return this.bias2;
    }

    private final double threshold3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold3 ? this.threshold3 : raw;
    }

    private final int margin4 = 4;
    private final int capacity4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin4 && value <= this.capacity4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias5 = 3;
    private final int depth5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String sift5(int value) {
        if (value < this.bias5) {
            return "below";
        }
        if (value == this.bias5) {
            return "lower-bound";
        }
        if (value < this.depth5) {
            return "within";
        }
        if (value == this.depth5) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias5Bound() {
        return this.bias5;
    }

    public int depth5Bound() {
        return this.depth5;
    }

    private final int cadence6 = 3;
    private int tally6;
    private boolean drift6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten6() {
        if (this.drift6) {
            return false;
        }
        this.tally6++;
        if (this.tally6 >= this.cadence6) {
            this.drift6 = true;
        }
        return true;
    }

    public int tally6Count() {
        return this.tally6;
    }

    private final int offset7 = 27;
    private int margin7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge7(int value) {
        if (value < 0) {
            return this.margin7;
        }
        if (this.margin7 + value > this.offset7) {
            this.margin7 = this.offset7;
        } else {
            this.margin7 += value;
        }
        return this.margin7;
    }

    public int margin7Value() {
        return this.margin7;
    }

    private final double bias8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias8 ? this.bias8 : raw;
    }

    private final int capacity9 = 4;
    private final int depth9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity9 && value <= this.depth9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span10 = 4;
    private final int tally10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String prune10(int value) {
        if (value < this.span10) {
            return "below";
        }
        if (value == this.span10) {
            return "lower-bound";
        }
        if (value < this.tally10) {
            return "within";
        }
        if (value == this.tally10) {
            return "upper-bound";
        }
        return "above";
    }

    public int span10Bound() {
        return this.span10;
    }

    public int tally10Bound() {
        return this.tally10;
    }

    private final int drift11 = 4;
    private int ratio11;
    private boolean threshold11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist11() {
        if (this.threshold11) {
            return false;
        }
        this.ratio11++;
        if (this.ratio11 >= this.drift11) {
            this.threshold11 = true;
        }
        return true;
    }

    public int ratio11Count() {
        return this.ratio11;
    }

    private final int tally12 = 32;
    private int offset12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl12(int value) {
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
