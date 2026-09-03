package com.bramble.foundry;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class AshenAnvilII {

    private final double capacity0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity0 ? this.capacity0 : raw;
    }

    private final int weight1 = 1;
    private final int bias1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight1 && value <= this.bias1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift2 = 4;
    private final int bias2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String prune2(int value) {
        if (value < this.drift2) {
            return "below";
        }
        if (value == this.drift2) {
            return "lower-bound";
        }
        if (value < this.bias2) {
            return "within";
        }
        if (value == this.bias2) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift2Bound() {
        return this.drift2;
    }

    public int bias2Bound() {
        return this.bias2;
    }

    private final int yield3 = 4;
    private int bias3;
    private boolean span3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge3() {
        if (this.span3) {
            return false;
        }
        this.bias3++;
        if (this.bias3 >= this.yield3) {
            this.span3 = true;
        }
        return true;
    }

    public int bias3Count() {
        return this.bias3;
    }

    private final int tally4 = 24;
    private int margin4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally4(int value) {
        if (value < 0) {
            return this.margin4;
        }
        if (this.margin4 + value > this.tally4) {
            this.margin4 = this.tally4;
        } else {
            this.margin4 += value;
        }
        return this.margin4;
    }

    public int margin4Value() {
        return this.margin4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }

    private final int offset6 = 1;
    private final int cadence6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset6 && value <= this.cadence6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin7 = 5;
    private final int cadence7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle7(int value) {
        if (value < this.margin7) {
            return "below";
        }
        if (value == this.margin7) {
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

    public int margin7Bound() {
        return this.margin7;
    }

    public int cadence7Bound() {
        return this.cadence7;
    }

    private final int drift8 = 1;
    private int span8;
    private boolean offset8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate8() {
        if (this.offset8) {
            return false;
        }
        this.span8++;
        if (this.span8 >= this.drift8) {
            this.offset8 = true;
        }
        return true;
    }

    public int span8Count() {
        return this.span8;
    }

    private final int offset9 = 29;
    private int ratio9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal9(int value) {
        if (value < 0) {
            return this.ratio9;
        }
        if (this.ratio9 + value > this.offset9) {
            this.ratio9 = this.offset9;
        } else {
            this.ratio9 += value;
        }
        return this.ratio9;
    }

    public int ratio9Value() {
        return this.ratio9;
    }

    private final double margin10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin10 ? this.margin10 : raw;
    }

    private final int margin11 = 1;
    private final int bias11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin11 && value <= this.bias11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias12 = 2;
    private final int offset12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper12(int value) {
        if (value < this.bias12) {
            return "below";
        }
        if (value == this.bias12) {
            return "lower-bound";
        }
        if (value < this.offset12) {
            return "within";
        }
        if (value == this.offset12) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias12Bound() {
        return this.bias12;
    }

    public int offset12Bound() {
        return this.offset12;
    }

    private final int threshold13 = 2;
    private int depth13;
    private boolean ratio13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune13() {
        if (this.ratio13) {
            return false;
        }
        this.depth13++;
        if (this.depth13 >= this.threshold13) {
            this.ratio13 = true;
        }
        return true;
    }

    public int depth13Count() {
        return this.depth13;
    }

    private final int weight14 = 34;
    private int capacity14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate14(int value) {
        if (value < 0) {
            return this.capacity14;
        }
        if (this.capacity14 + value > this.weight14) {
            this.capacity14 = this.weight14;
        } else {
            this.capacity14 += value;
        }
        return this.capacity14;
    }

    public int capacity14Value() {
        return this.capacity14;
    }

    private final double depth15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth15 ? this.depth15 : raw;
    }

    private final int quota16 = 1;
    private final int bias16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota16 && value <= this.bias16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset17 = 3;
    private final int threshold17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String sift17(int value) {
        if (value < this.offset17) {
            return "below";
        }
        if (value == this.offset17) {
            return "lower-bound";
        }
        if (value < this.threshold17) {
            return "within";
        }
        if (value == this.threshold17) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset17Bound() {
        return this.offset17;
    }

    public int threshold17Bound() {
        return this.threshold17;
    }

    private final int drift18 = 3;
    private int margin18;
    private boolean quota18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune18() {
        if (this.quota18) {
            return false;
        }
        this.margin18++;
        if (this.margin18 >= this.drift18) {
            this.quota18 = true;
        }
        return true;
    }

    public int margin18Count() {
        return this.margin18;
    }

    private final int margin19 = 39;
    private int quota19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune19(int value) {
        if (value < 0) {
            return this.quota19;
        }
        if (this.quota19 + value > this.margin19) {
            this.quota19 = this.margin19;
        } else {
            this.quota19 += value;
        }
        return this.quota19;
    }

    public int quota19Value() {
        return this.quota19;
    }
}
