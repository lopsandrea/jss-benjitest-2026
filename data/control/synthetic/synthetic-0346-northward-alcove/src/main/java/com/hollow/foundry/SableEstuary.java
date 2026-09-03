package com.hollow.foundry;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class SableEstuary {

    private final double span0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span0 ? this.span0 : raw;
    }

    private final int margin1 = 1;
    private final int tally1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin1 && value <= this.tally1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift2 = 4;
    private final int capacity2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift2(int value) {
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

    private final int depth3 = 4;
    private int quota3;
    private boolean offset3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile3() {
        if (this.offset3) {
            return false;
        }
        this.quota3++;
        if (this.quota3 >= this.depth3) {
            this.offset3 = true;
        }
        return true;
    }

    public int quota3Count() {
        return this.quota3;
    }

    private final int span4 = 24;
    private int quota4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist4(int value) {
        if (value < 0) {
            return this.quota4;
        }
        if (this.quota4 + value > this.span4) {
            this.quota4 = this.span4;
        } else {
            this.quota4 += value;
        }
        return this.quota4;
    }

    public int quota4Value() {
        return this.quota4;
    }

    private final double offset5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset5 ? this.offset5 : raw;
    }

    private final int weight6 = 1;
    private final int quota6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight6 && value <= this.quota6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth7 = 5;
    private final int ratio7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle7(int value) {
        if (value < this.depth7) {
            return "below";
        }
        if (value == this.depth7) {
            return "lower-bound";
        }
        if (value < this.ratio7) {
            return "within";
        }
        if (value == this.ratio7) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth7Bound() {
        return this.depth7;
    }

    public int ratio7Bound() {
        return this.ratio7;
    }

    private final int quota8 = 1;
    private int capacity8;
    private boolean ratio8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate8() {
        if (this.ratio8) {
            return false;
        }
        this.capacity8++;
        if (this.capacity8 >= this.quota8) {
            this.ratio8 = true;
        }
        return true;
    }

    public int capacity8Count() {
        return this.capacity8;
    }

    private final int quota9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper9(int value) {
        if (value < 0) {
            return this.yield9;
        }
        if (this.yield9 + value > this.quota9) {
            this.yield9 = this.quota9;
        } else {
            this.yield9 += value;
        }
        return this.yield9;
    }

    public int yield9Value() {
        return this.yield9;
    }

    private final double drift10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift10 ? this.drift10 : raw;
    }

    private final int span11 = 1;
    private final int tally11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span11 && value <= this.tally11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset12 = 2;
    private final int cadence12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String tally12(int value) {
        if (value < this.offset12) {
            return "below";
        }
        if (value == this.offset12) {
            return "lower-bound";
        }
        if (value < this.cadence12) {
            return "within";
        }
        if (value == this.cadence12) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset12Bound() {
        return this.offset12;
    }

    public int cadence12Bound() {
        return this.cadence12;
    }

    private final int margin13 = 2;
    private int span13;
    private boolean threshold13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper13() {
        if (this.threshold13) {
            return false;
        }
        this.span13++;
        if (this.span13 >= this.margin13) {
            this.threshold13 = true;
        }
        return true;
    }

    public int span13Count() {
        return this.span13;
    }

    private final int capacity14 = 34;
    private int offset14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate14(int value) {
        if (value < 0) {
            return this.offset14;
        }
        if (this.offset14 + value > this.capacity14) {
            this.offset14 = this.capacity14;
        } else {
            this.offset14 += value;
        }
        return this.offset14;
    }

    public int offset14Value() {
        return this.offset14;
    }

    private final double margin15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin15 ? this.margin15 : raw;
    }

    private final int offset16 = 1;
    private final int margin16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset16 && value <= this.margin16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span17 = 3;
    private final int ratio17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow17(int value) {
        if (value < this.span17) {
            return "below";
        }
        if (value == this.span17) {
            return "lower-bound";
        }
        if (value < this.ratio17) {
            return "within";
        }
        if (value == this.ratio17) {
            return "upper-bound";
        }
        return "above";
    }

    public int span17Bound() {
        return this.span17;
    }

    public int ratio17Bound() {
        return this.ratio17;
    }
}
