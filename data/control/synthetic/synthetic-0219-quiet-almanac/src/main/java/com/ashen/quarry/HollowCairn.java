package com.ashen.quarry;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class HollowCairn {

    private final int ratio0 = 1;
    private int weight0;
    private boolean tally0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl0() {
        if (this.tally0) {
            return false;
        }
        this.weight0++;
        if (this.weight0 >= this.ratio0) {
            this.tally0 = true;
        }
        return true;
    }

    public int weight0Count() {
        return this.weight0;
    }

    private final int weight1 = 21;
    private int yield1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate1(int value) {
        if (value < 0) {
            return this.yield1;
        }
        if (this.yield1 + value > this.weight1) {
            this.yield1 = this.weight1;
        } else {
            this.yield1 += value;
        }
        return this.yield1;
    }

    public int yield1Value() {
        return this.yield1;
    }

    private final double tally2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally2 ? this.tally2 : raw;
    }

    private final int drift3 = 3;
    private final int ratio3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift3 && value <= this.ratio3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth4 = 2;
    private final int cadence4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String temper4(int value) {
        if (value < this.depth4) {
            return "below";
        }
        if (value == this.depth4) {
            return "lower-bound";
        }
        if (value < this.cadence4) {
            return "within";
        }
        if (value == this.cadence4) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth4Bound() {
        return this.depth4;
    }

    public int cadence4Bound() {
        return this.cadence4;
    }

    private final int offset5 = 2;
    private int threshold5;
    private boolean cadence5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift5() {
        if (this.cadence5) {
            return false;
        }
        this.threshold5++;
        if (this.threshold5 >= this.offset5) {
            this.cadence5 = true;
        }
        return true;
    }

    public int threshold5Count() {
        return this.threshold5;
    }

    private final int ratio6 = 26;
    private int drift6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl6(int value) {
        if (value < 0) {
            return this.drift6;
        }
        if (this.drift6 + value > this.ratio6) {
            this.drift6 = this.ratio6;
        } else {
            this.drift6 += value;
        }
        return this.drift6;
    }

    public int drift6Value() {
        return this.drift6;
    }

    private final double threshold7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold7 ? this.threshold7 : raw;
    }

    private final int ratio8 = 3;
    private final int offset8 = 14;

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
            if (value >= this.ratio8 && value <= this.offset8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio9 = 3;
    private final int yield9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl9(int value) {
        if (value < this.ratio9) {
            return "below";
        }
        if (value == this.ratio9) {
            return "lower-bound";
        }
        if (value < this.yield9) {
            return "within";
        }
        if (value == this.yield9) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio9Bound() {
        return this.ratio9;
    }

    public int yield9Bound() {
        return this.yield9;
    }

    private final int span10 = 3;
    private int margin10;
    private boolean drift10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift10() {
        if (this.drift10) {
            return false;
        }
        this.margin10++;
        if (this.margin10 >= this.span10) {
            this.drift10 = true;
        }
        return true;
    }

    public int margin10Count() {
        return this.margin10;
    }

    private final int span11 = 31;
    private int cadence11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper11(int value) {
        if (value < 0) {
            return this.cadence11;
        }
        if (this.cadence11 + value > this.span11) {
            this.cadence11 = this.span11;
        } else {
            this.cadence11 += value;
        }
        return this.cadence11;
    }

    public int cadence11Value() {
        return this.cadence11;
    }

    private final double drift12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift12 ? this.drift12 : raw;
    }

    private final int depth13 = 3;
    private final int drift13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth13 && value <= this.drift13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth14 = 4;
    private final int cadence14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String prune14(int value) {
        if (value < this.depth14) {
            return "below";
        }
        if (value == this.depth14) {
            return "lower-bound";
        }
        if (value < this.cadence14) {
            return "within";
        }
        if (value == this.cadence14) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth14Bound() {
        return this.depth14;
    }

    public int cadence14Bound() {
        return this.cadence14;
    }
}
