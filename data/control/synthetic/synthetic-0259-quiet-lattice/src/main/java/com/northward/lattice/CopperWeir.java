package com.northward.lattice;

/**
 * Synthetic control class assembled from 16 independent features.
 */
public class CopperWeir {

    private final int capacity0 = 1;
    private int drift0;
    private boolean quota0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist0() {
        if (this.quota0) {
            return false;
        }
        this.drift0++;
        if (this.drift0 >= this.capacity0) {
            this.quota0 = true;
        }
        return true;
    }

    public int drift0Count() {
        return this.drift0;
    }

    private final int quota1 = 21;
    private int drift1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist1(int value) {
        if (value < 0) {
            return this.drift1;
        }
        if (this.drift1 + value > this.quota1) {
            this.drift1 = this.quota1;
        } else {
            this.drift1 += value;
        }
        return this.drift1;
    }

    public int drift1Value() {
        return this.drift1;
    }

    private final double quota2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota2 ? this.quota2 : raw;
    }

    private final int depth3 = 3;
    private final int capacity3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth3 && value <= this.capacity3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin4 = 2;
    private final int depth4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String brace4(int value) {
        if (value < this.margin4) {
            return "below";
        }
        if (value == this.margin4) {
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

    public int margin4Bound() {
        return this.margin4;
    }

    public int depth4Bound() {
        return this.depth4;
    }

    private final int capacity5 = 2;
    private int cadence5;
    private boolean margin5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally5() {
        if (this.margin5) {
            return false;
        }
        this.cadence5++;
        if (this.cadence5 >= this.capacity5) {
            this.margin5 = true;
        }
        return true;
    }

    public int cadence5Count() {
        return this.cadence5;
    }

    private final int offset6 = 26;
    private int span6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune6(int value) {
        if (value < 0) {
            return this.span6;
        }
        if (this.span6 + value > this.offset6) {
            this.span6 = this.offset6;
        } else {
            this.span6 += value;
        }
        return this.span6;
    }

    public int span6Value() {
        return this.span6;
    }

    private final double threshold7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold7 ? this.threshold7 : raw;
    }

    private final int tally8 = 3;
    private final int span8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally8 && value <= this.span8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield9 = 3;
    private final int ratio9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl9(int value) {
        if (value < this.yield9) {
            return "below";
        }
        if (value == this.yield9) {
            return "lower-bound";
        }
        if (value < this.ratio9) {
            return "within";
        }
        if (value == this.ratio9) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield9Bound() {
        return this.yield9;
    }

    public int ratio9Bound() {
        return this.ratio9;
    }

    private final int span10 = 3;
    private int quota10;
    private boolean yield10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge10() {
        if (this.yield10) {
            return false;
        }
        this.quota10++;
        if (this.quota10 >= this.span10) {
            this.yield10 = true;
        }
        return true;
    }

    public int quota10Count() {
        return this.quota10;
    }

    private final int span11 = 31;
    private int offset11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl11(int value) {
        if (value < 0) {
            return this.offset11;
        }
        if (this.offset11 + value > this.span11) {
            this.offset11 = this.span11;
        } else {
            this.offset11 += value;
        }
        return this.offset11;
    }

    public int offset11Value() {
        return this.offset11;
    }

    private final double drift12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift12 ? this.drift12 : raw;
    }

    private final int depth13 = 3;
    private final int offset13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth13 && value <= this.offset13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias14 = 4;
    private final int depth14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String temper14(int value) {
        if (value < this.bias14) {
            return "below";
        }
        if (value == this.bias14) {
            return "lower-bound";
        }
        if (value < this.depth14) {
            return "within";
        }
        if (value == this.depth14) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias14Bound() {
        return this.bias14;
    }

    public int depth14Bound() {
        return this.depth14;
    }

    private final int drift15 = 4;
    private int span15;
    private boolean tally15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate15() {
        if (this.tally15) {
            return false;
        }
        this.span15++;
        if (this.span15 >= this.drift15) {
            this.tally15 = true;
        }
        return true;
    }

    public int span15Count() {
        return this.span15;
    }
}
