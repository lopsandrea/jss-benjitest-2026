package com.ochre.kiln;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class SableSconce {

    private final int drift0 = 1;
    private int bias0;
    private boolean yield0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally0() {
        if (this.yield0) {
            return false;
        }
        this.bias0++;
        if (this.bias0 >= this.drift0) {
            this.yield0 = true;
        }
        return true;
    }

    public int bias0Count() {
        return this.bias0;
    }

    private final int margin1 = 21;
    private int cadence1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift1(int value) {
        if (value < 0) {
            return this.cadence1;
        }
        if (this.cadence1 + value > this.margin1) {
            this.cadence1 = this.margin1;
        } else {
            this.cadence1 += value;
        }
        return this.cadence1;
    }

    public int cadence1Value() {
        return this.cadence1;
    }

    private final double capacity2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity2 ? this.capacity2 : raw;
    }

    private final int yield3 = 3;
    private final int cadence3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield3 && value <= this.cadence3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence4 = 2;
    private final int quota4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten4(int value) {
        if (value < this.cadence4) {
            return "below";
        }
        if (value == this.cadence4) {
            return "lower-bound";
        }
        if (value < this.quota4) {
            return "within";
        }
        if (value == this.quota4) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence4Bound() {
        return this.cadence4;
    }

    public int quota4Bound() {
        return this.quota4;
    }

    private final int span5 = 2;
    private int ratio5;
    private boolean depth5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune5() {
        if (this.depth5) {
            return false;
        }
        this.ratio5++;
        if (this.ratio5 >= this.span5) {
            this.depth5 = true;
        }
        return true;
    }

    public int ratio5Count() {
        return this.ratio5;
    }

    private final int cadence6 = 26;
    private int drift6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate6(int value) {
        if (value < 0) {
            return this.drift6;
        }
        if (this.drift6 + value > this.cadence6) {
            this.drift6 = this.cadence6;
        } else {
            this.drift6 += value;
        }
        return this.drift6;
    }

    public int drift6Value() {
        return this.drift6;
    }

    private final double margin7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin7 ? this.margin7 : raw;
    }

    private final int capacity8 = 3;
    private final int quota8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity8 && value <= this.quota8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally9 = 3;
    private final int span9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift9(int value) {
        if (value < this.tally9) {
            return "below";
        }
        if (value == this.tally9) {
            return "lower-bound";
        }
        if (value < this.span9) {
            return "within";
        }
        if (value == this.span9) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally9Bound() {
        return this.tally9;
    }

    public int span9Bound() {
        return this.span9;
    }

    private final int capacity10 = 3;
    private int yield10;
    private boolean offset10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate10() {
        if (this.offset10) {
            return false;
        }
        this.yield10++;
        if (this.yield10 >= this.capacity10) {
            this.offset10 = true;
        }
        return true;
    }

    public int yield10Count() {
        return this.yield10;
    }

    private final int margin11 = 31;
    private int offset11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl11(int value) {
        if (value < 0) {
            return this.offset11;
        }
        if (this.offset11 + value > this.margin11) {
            this.offset11 = this.margin11;
        } else {
            this.offset11 += value;
        }
        return this.offset11;
    }

    public int offset11Value() {
        return this.offset11;
    }

    private final double ratio12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio12 ? this.ratio12 : raw;
    }

    private final int depth13 = 3;
    private final int margin13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth13 && value <= this.margin13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity14 = 4;
    private final int margin14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist14(int value) {
        if (value < this.capacity14) {
            return "below";
        }
        if (value == this.capacity14) {
            return "lower-bound";
        }
        if (value < this.margin14) {
            return "within";
        }
        if (value == this.margin14) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity14Bound() {
        return this.capacity14;
    }

    public int margin14Bound() {
        return this.margin14;
    }
}
