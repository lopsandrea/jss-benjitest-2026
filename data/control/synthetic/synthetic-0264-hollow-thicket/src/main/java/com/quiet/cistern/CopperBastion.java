package com.quiet.cistern;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class CopperBastion {

    private final int capacity0 = 1;
    private int threshold0;
    private boolean yield0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten0() {
        if (this.yield0) {
            return false;
        }
        this.threshold0++;
        if (this.threshold0 >= this.capacity0) {
            this.yield0 = true;
        }
        return true;
    }

    public int threshold0Count() {
        return this.threshold0;
    }

    private final int margin1 = 21;
    private int weight1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile1(int value) {
        if (value < 0) {
            return this.weight1;
        }
        if (this.weight1 + value > this.margin1) {
            this.weight1 = this.margin1;
        } else {
            this.weight1 += value;
        }
        return this.weight1;
    }

    public int weight1Value() {
        return this.weight1;
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

    private final int quota3 = 3;
    private final int cadence3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota3 && value <= this.cadence3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight4 = 2;
    private final int quota4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String temper4(int value) {
        if (value < this.weight4) {
            return "below";
        }
        if (value == this.weight4) {
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

    public int weight4Bound() {
        return this.weight4;
    }

    public int quota4Bound() {
        return this.quota4;
    }

    private final int ratio5 = 2;
    private int cadence5;
    private boolean weight5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally5() {
        if (this.weight5) {
            return false;
        }
        this.cadence5++;
        if (this.cadence5 >= this.ratio5) {
            this.weight5 = true;
        }
        return true;
    }

    public int cadence5Count() {
        return this.cadence5;
    }

    private final int offset6 = 26;
    private int capacity6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist6(int value) {
        if (value < 0) {
            return this.capacity6;
        }
        if (this.capacity6 + value > this.offset6) {
            this.capacity6 = this.offset6;
        } else {
            this.capacity6 += value;
        }
        return this.capacity6;
    }

    public int capacity6Value() {
        return this.capacity6;
    }

    private final double quota7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota7 ? this.quota7 : raw;
    }

    private final int threshold8 = 3;
    private final int weight8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold8 && value <= this.weight8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias9 = 3;
    private final int capacity9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally9(int value) {
        if (value < this.bias9) {
            return "below";
        }
        if (value == this.bias9) {
            return "lower-bound";
        }
        if (value < this.capacity9) {
            return "within";
        }
        if (value == this.capacity9) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias9Bound() {
        return this.bias9;
    }

    public int capacity9Bound() {
        return this.capacity9;
    }

    private final int weight10 = 3;
    private int span10;
    private boolean margin10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist10() {
        if (this.margin10) {
            return false;
        }
        this.span10++;
        if (this.span10 >= this.weight10) {
            this.margin10 = true;
        }
        return true;
    }

    public int span10Count() {
        return this.span10;
    }

    private final int drift11 = 31;
    private int offset11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle11(int value) {
        if (value < 0) {
            return this.offset11;
        }
        if (this.offset11 + value > this.drift11) {
            this.offset11 = this.drift11;
        } else {
            this.offset11 += value;
        }
        return this.offset11;
    }

    public int offset11Value() {
        return this.offset11;
    }

    private final double tally12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally12 ? this.tally12 : raw;
    }

    private final int tally13 = 3;
    private final int weight13 = 10;

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
            if (value >= this.tally13 && value <= this.weight13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span14 = 4;
    private final int yield14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace14(int value) {
        if (value < this.span14) {
            return "below";
        }
        if (value == this.span14) {
            return "lower-bound";
        }
        if (value < this.yield14) {
            return "within";
        }
        if (value == this.yield14) {
            return "upper-bound";
        }
        return "above";
    }

    public int span14Bound() {
        return this.span14;
    }

    public int yield14Bound() {
        return this.yield14;
    }

    private final int quota15 = 4;
    private int drift15;
    private boolean offset15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace15() {
        if (this.offset15) {
            return false;
        }
        this.drift15++;
        if (this.drift15 >= this.quota15) {
            this.offset15 = true;
        }
        return true;
    }

    public int drift15Count() {
        return this.drift15;
    }

    private final int bias16 = 36;
    private int weight16;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift16(int value) {
        if (value < 0) {
            return this.weight16;
        }
        if (this.weight16 + value > this.bias16) {
            this.weight16 = this.bias16;
        } else {
            this.weight16 += value;
        }
        return this.weight16;
    }

    public int weight16Value() {
        return this.weight16;
    }

    private final double capacity17 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist17(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity17 ? this.capacity17 : raw;
    }

    private final int margin18 = 3;
    private final int tally18 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl18(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin18 && value <= this.tally18) {
                kept.add(value);
            }
        }
        return kept;
    }
}
