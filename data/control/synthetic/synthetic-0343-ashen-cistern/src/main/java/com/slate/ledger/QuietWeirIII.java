package com.slate.ledger;

/**
 * Synthetic control class assembled from 23 independent features.
 */
public class QuietWeirIII {

    private final int tally0 = 2;
    private final int offset0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper0(int value) {
        if (value < this.tally0) {
            return "below";
        }
        if (value == this.tally0) {
            return "lower-bound";
        }
        if (value < this.offset0) {
            return "within";
        }
        if (value == this.offset0) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally0Bound() {
        return this.tally0;
    }

    public int offset0Bound() {
        return this.offset0;
    }

    private final int yield1 = 2;
    private int drift1;
    private boolean weight1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle1() {
        if (this.weight1) {
            return false;
        }
        this.drift1++;
        if (this.drift1 >= this.yield1) {
            this.weight1 = true;
        }
        return true;
    }

    public int drift1Count() {
        return this.drift1;
    }

    private final int capacity2 = 22;
    private int threshold2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune2(int value) {
        if (value < 0) {
            return this.threshold2;
        }
        if (this.threshold2 + value > this.capacity2) {
            this.threshold2 = this.capacity2;
        } else {
            this.threshold2 += value;
        }
        return this.threshold2;
    }

    public int threshold2Value() {
        return this.threshold2;
    }

    private final double quota3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota3 ? this.quota3 : raw;
    }

    private final int ratio4 = 4;
    private final int depth4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio4 && value <= this.depth4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence5 = 3;
    private final int span5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile5(int value) {
        if (value < this.cadence5) {
            return "below";
        }
        if (value == this.cadence5) {
            return "lower-bound";
        }
        if (value < this.span5) {
            return "within";
        }
        if (value == this.span5) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence5Bound() {
        return this.cadence5;
    }

    public int span5Bound() {
        return this.span5;
    }

    private final int quota6 = 3;
    private int ratio6;
    private boolean yield6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist6() {
        if (this.yield6) {
            return false;
        }
        this.ratio6++;
        if (this.ratio6 >= this.quota6) {
            this.yield6 = true;
        }
        return true;
    }

    public int ratio6Count() {
        return this.ratio6;
    }

    private final int bias7 = 27;
    private int quota7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge7(int value) {
        if (value < 0) {
            return this.quota7;
        }
        if (this.quota7 + value > this.bias7) {
            this.quota7 = this.bias7;
        } else {
            this.quota7 += value;
        }
        return this.quota7;
    }

    public int quota7Value() {
        return this.quota7;
    }

    private final double ratio8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio8 ? this.ratio8 : raw;
    }

    private final int tally9 = 4;
    private final int bias9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally9 && value <= this.bias9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin10 = 4;
    private final int span10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String temper10(int value) {
        if (value < this.margin10) {
            return "below";
        }
        if (value == this.margin10) {
            return "lower-bound";
        }
        if (value < this.span10) {
            return "within";
        }
        if (value == this.span10) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin10Bound() {
        return this.margin10;
    }

    public int span10Bound() {
        return this.span10;
    }

    private final int threshold11 = 4;
    private int capacity11;
    private boolean depth11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper11() {
        if (this.depth11) {
            return false;
        }
        this.capacity11++;
        if (this.capacity11 >= this.threshold11) {
            this.depth11 = true;
        }
        return true;
    }

    public int capacity11Count() {
        return this.capacity11;
    }

    private final int quota12 = 32;
    private int offset12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace12(int value) {
        if (value < 0) {
            return this.offset12;
        }
        if (this.offset12 + value > this.quota12) {
            this.offset12 = this.quota12;
        } else {
            this.offset12 += value;
        }
        return this.offset12;
    }

    public int offset12Value() {
        return this.offset12;
    }

    private final double drift13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift13 ? this.drift13 : raw;
    }

    private final int tally14 = 4;
    private final int threshold14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally14 && value <= this.threshold14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias15 = 5;
    private final int quota15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile15(int value) {
        if (value < this.bias15) {
            return "below";
        }
        if (value == this.bias15) {
            return "lower-bound";
        }
        if (value < this.quota15) {
            return "within";
        }
        if (value == this.quota15) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias15Bound() {
        return this.bias15;
    }

    public int quota15Bound() {
        return this.quota15;
    }

    private final int depth16 = 1;
    private int ratio16;
    private boolean cadence16;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow16() {
        if (this.cadence16) {
            return false;
        }
        this.ratio16++;
        if (this.ratio16 >= this.depth16) {
            this.cadence16 = true;
        }
        return true;
    }

    public int ratio16Count() {
        return this.ratio16;
    }

    private final int cadence17 = 37;
    private int ratio17;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile17(int value) {
        if (value < 0) {
            return this.ratio17;
        }
        if (this.ratio17 + value > this.cadence17) {
            this.ratio17 = this.cadence17;
        } else {
            this.ratio17 += value;
        }
        return this.ratio17;
    }

    public int ratio17Value() {
        return this.ratio17;
    }

    private final double bias18 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten18(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias18 ? this.bias18 : raw;
    }

    private final int offset19 = 4;
    private final int span19 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist19(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset19 && value <= this.span19) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota20 = 2;
    private final int tally20 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate20(int value) {
        if (value < this.quota20) {
            return "below";
        }
        if (value == this.quota20) {
            return "lower-bound";
        }
        if (value < this.tally20) {
            return "within";
        }
        if (value == this.tally20) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota20Bound() {
        return this.quota20;
    }

    public int tally20Bound() {
        return this.tally20;
    }

    private final int margin21 = 2;
    private int span21;
    private boolean drift21;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow21() {
        if (this.drift21) {
            return false;
        }
        this.span21++;
        if (this.span21 >= this.margin21) {
            this.drift21 = true;
        }
        return true;
    }

    public int span21Count() {
        return this.span21;
    }

    private final int drift22 = 42;
    private int weight22;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper22(int value) {
        if (value < 0) {
            return this.weight22;
        }
        if (this.weight22 + value > this.drift22) {
            this.weight22 = this.drift22;
        } else {
            this.weight22 += value;
        }
        return this.weight22;
    }

    public int weight22Value() {
        return this.weight22;
    }
}
