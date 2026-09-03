package com.copper.cistern;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class WexfordEstuary {

    private final int offset0 = 1;
    private int bias0;
    private boolean ratio0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge0() {
        if (this.ratio0) {
            return false;
        }
        this.bias0++;
        if (this.bias0 >= this.offset0) {
            this.ratio0 = true;
        }
        return true;
    }

    public int bias0Count() {
        return this.bias0;
    }

    private final int ratio1 = 21;
    private int bias1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal1(int value) {
        if (value < 0) {
            return this.bias1;
        }
        if (this.bias1 + value > this.ratio1) {
            this.bias1 = this.ratio1;
        } else {
            this.bias1 += value;
        }
        return this.bias1;
    }

    public int bias1Value() {
        return this.bias1;
    }

    private final double tally2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally2 ? this.tally2 : raw;
    }

    private final int yield3 = 3;
    private final int drift3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield3 && value <= this.drift3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota4 = 2;
    private final int offset4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String collate4(int value) {
        if (value < this.quota4) {
            return "below";
        }
        if (value == this.quota4) {
            return "lower-bound";
        }
        if (value < this.offset4) {
            return "within";
        }
        if (value == this.offset4) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota4Bound() {
        return this.quota4;
    }

    public int offset4Bound() {
        return this.offset4;
    }

    private final int weight5 = 2;
    private int cadence5;
    private boolean threshold5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle5() {
        if (this.threshold5) {
            return false;
        }
        this.cadence5++;
        if (this.cadence5 >= this.weight5) {
            this.threshold5 = true;
        }
        return true;
    }

    public int cadence5Count() {
        return this.cadence5;
    }

    private final int drift6 = 26;
    private int weight6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge6(int value) {
        if (value < 0) {
            return this.weight6;
        }
        if (this.weight6 + value > this.drift6) {
            this.weight6 = this.drift6;
        } else {
            this.weight6 += value;
        }
        return this.weight6;
    }

    public int weight6Value() {
        return this.weight6;
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

    private final int threshold8 = 3;
    private final int cadence8 = 14;

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
            if (value >= this.threshold8 && value <= this.cadence8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio9 = 3;
    private final int threshold9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl9(int value) {
        if (value < this.ratio9) {
            return "below";
        }
        if (value == this.ratio9) {
            return "lower-bound";
        }
        if (value < this.threshold9) {
            return "within";
        }
        if (value == this.threshold9) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio9Bound() {
        return this.ratio9;
    }

    public int threshold9Bound() {
        return this.threshold9;
    }

    private final int span10 = 3;
    private int margin10;
    private boolean depth10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge10() {
        if (this.depth10) {
            return false;
        }
        this.margin10++;
        if (this.margin10 >= this.span10) {
            this.depth10 = true;
        }
        return true;
    }

    public int margin10Count() {
        return this.margin10;
    }
}
