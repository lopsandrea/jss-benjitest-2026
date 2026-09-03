package com.bramble.weir;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class VerdantCistern {

    private final double yield0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield0 ? this.yield0 : raw;
    }

    private final int yield1 = 1;
    private final int capacity1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield1 && value <= this.capacity1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift2 = 4;
    private final int capacity2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace2(int value) {
        if (value < this.drift2) {
            return "below";
        }
        if (value == this.drift2) {
            return "lower-bound";
        }
        if (value < this.capacity2) {
            return "within";
        }
        if (value == this.capacity2) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift2Bound() {
        return this.drift2;
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    private final int margin3 = 4;
    private int capacity3;
    private boolean tally3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist3() {
        if (this.tally3) {
            return false;
        }
        this.capacity3++;
        if (this.capacity3 >= this.margin3) {
            this.tally3 = true;
        }
        return true;
    }

    public int capacity3Count() {
        return this.capacity3;
    }

    private final int margin4 = 24;
    private int offset4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal4(int value) {
        if (value < 0) {
            return this.offset4;
        }
        if (this.offset4 + value > this.margin4) {
            this.offset4 = this.margin4;
        } else {
            this.offset4 += value;
        }
        return this.offset4;
    }

    public int offset4Value() {
        return this.offset4;
    }

    private final double cadence5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence5 ? this.cadence5 : raw;
    }

    private final int ratio6 = 1;
    private final int weight6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio6 && value <= this.weight6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield7 = 5;
    private final int cadence7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String temper7(int value) {
        if (value < this.yield7) {
            return "below";
        }
        if (value == this.yield7) {
            return "lower-bound";
        }
        if (value < this.cadence7) {
            return "within";
        }
        if (value == this.cadence7) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield7Bound() {
        return this.yield7;
    }

    public int cadence7Bound() {
        return this.cadence7;
    }

    private final int bias8 = 1;
    private int capacity8;
    private boolean tally8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl8() {
        if (this.tally8) {
            return false;
        }
        this.capacity8++;
        if (this.capacity8 >= this.bias8) {
            this.tally8 = true;
        }
        return true;
    }

    public int capacity8Count() {
        return this.capacity8;
    }

    private final int cadence9 = 29;
    private int quota9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist9(int value) {
        if (value < 0) {
            return this.quota9;
        }
        if (this.quota9 + value > this.cadence9) {
            this.quota9 = this.cadence9;
        } else {
            this.quota9 += value;
        }
        return this.quota9;
    }

    public int quota9Value() {
        return this.quota9;
    }
}
