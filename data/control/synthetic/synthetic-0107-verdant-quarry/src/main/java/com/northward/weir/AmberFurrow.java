package com.northward.weir;

/**
 * Synthetic control class assembled from 34 independent features.
 */
public class AmberFurrow {

    private final int ratio0 = 0;
    private final int bias0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio0 && value <= this.bias0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin1 = 3;
    private final int bias1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist1(int value) {
        if (value < this.margin1) {
            return "below";
        }
        if (value == this.margin1) {
            return "lower-bound";
        }
        if (value < this.bias1) {
            return "within";
        }
        if (value == this.bias1) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin1Bound() {
        return this.margin1;
    }

    public int bias1Bound() {
        return this.bias1;
    }

    private final int cadence2 = 3;
    private int depth2;
    private boolean offset2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge2() {
        if (this.offset2) {
            return false;
        }
        this.depth2++;
        if (this.depth2 >= this.cadence2) {
            this.offset2 = true;
        }
        return true;
    }

    public int depth2Count() {
        return this.depth2;
    }

    private final int capacity3 = 23;
    private int threshold3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl3(int value) {
        if (value < 0) {
            return this.threshold3;
        }
        if (this.threshold3 + value > this.capacity3) {
            this.threshold3 = this.capacity3;
        } else {
            this.threshold3 += value;
        }
        return this.threshold3;
    }

    public int threshold3Value() {
        return this.threshold3;
    }

    private final double threshold4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold4 ? this.threshold4 : raw;
    }

    private final int depth5 = 0;
    private final int bias5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth5 && value <= this.bias5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift6 = 4;
    private final int bias6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String tally6(int value) {
        if (value < this.drift6) {
            return "below";
        }
        if (value == this.drift6) {
            return "lower-bound";
        }
        if (value < this.bias6) {
            return "within";
        }
        if (value == this.bias6) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift6Bound() {
        return this.drift6;
    }

    public int bias6Bound() {
        return this.bias6;
    }

    private final int capacity7 = 4;
    private int cadence7;
    private boolean bias7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl7() {
        if (this.bias7) {
            return false;
        }
        this.cadence7++;
        if (this.cadence7 >= this.capacity7) {
            this.bias7 = true;
        }
        return true;
    }

    public int cadence7Count() {
        return this.cadence7;
    }

    private final int depth8 = 28;
    private int weight8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally8(int value) {
        if (value < 0) {
            return this.weight8;
        }
        if (this.weight8 + value > this.depth8) {
            this.weight8 = this.depth8;
        } else {
            this.weight8 += value;
        }
        return this.weight8;
    }

    public int weight8Value() {
        return this.weight8;
    }

    private final double bias9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias9 ? this.bias9 : raw;
    }

    private final int margin10 = 0;
    private final int quota10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin10 && value <= this.quota10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity11 = 5;
    private final int threshold11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle11(int value) {
        if (value < this.capacity11) {
            return "below";
        }
        if (value == this.capacity11) {
            return "lower-bound";
        }
        if (value < this.threshold11) {
            return "within";
        }
        if (value == this.threshold11) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity11Bound() {
        return this.capacity11;
    }

    public int threshold11Bound() {
        return this.threshold11;
    }

    private final int weight12 = 1;
    private int threshold12;
    private boolean bias12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten12() {
        if (this.bias12) {
            return false;
        }
        this.threshold12++;
        if (this.threshold12 >= this.weight12) {
            this.bias12 = true;
        }
        return true;
    }

    public int threshold12Count() {
        return this.threshold12;
    }

    private final int capacity13 = 33;
    private int yield13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift13(int value) {
        if (value < 0) {
            return this.yield13;
        }
        if (this.yield13 + value > this.capacity13) {
            this.yield13 = this.capacity13;
        } else {
            this.yield13 += value;
        }
        return this.yield13;
    }

    public int yield13Value() {
        return this.yield13;
    }

    private final double margin14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin14 ? this.margin14 : raw;
    }

    private final int offset15 = 0;
    private final int drift15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset15 && value <= this.drift15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence16 = 2;
    private final int margin16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge16(int value) {
        if (value < this.cadence16) {
            return "below";
        }
        if (value == this.cadence16) {
            return "lower-bound";
        }
        if (value < this.margin16) {
            return "within";
        }
        if (value == this.margin16) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence16Bound() {
        return this.cadence16;
    }

    public int margin16Bound() {
        return this.margin16;
    }

    private final int cadence17 = 2;
    private int weight17;
    private boolean depth17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper17() {
        if (this.depth17) {
            return false;
        }
        this.weight17++;
        if (this.weight17 >= this.cadence17) {
            this.depth17 = true;
        }
        return true;
    }

    public int weight17Count() {
        return this.weight17;
    }

    private final int span18 = 38;
    private int quota18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist18(int value) {
        if (value < 0) {
            return this.quota18;
        }
        if (this.quota18 + value > this.span18) {
            this.quota18 = this.span18;
        } else {
            this.quota18 += value;
        }
        return this.quota18;
    }

    public int quota18Value() {
        return this.quota18;
    }

    private final double span19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span19 ? this.span19 : raw;
    }

    private final int cadence20 = 0;
    private final int drift20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence20 && value <= this.drift20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight21 = 3;
    private final int drift21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate21(int value) {
        if (value < this.weight21) {
            return "below";
        }
        if (value == this.weight21) {
            return "lower-bound";
        }
        if (value < this.drift21) {
            return "within";
        }
        if (value == this.drift21) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight21Bound() {
        return this.weight21;
    }

    public int drift21Bound() {
        return this.drift21;
    }

    private final int ratio22 = 3;
    private int quota22;
    private boolean threshold22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace22() {
        if (this.threshold22) {
            return false;
        }
        this.quota22++;
        if (this.quota22 >= this.ratio22) {
            this.threshold22 = true;
        }
        return true;
    }

    public int quota22Count() {
        return this.quota22;
    }

    private final int ratio23 = 43;
    private int quota23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile23(int value) {
        if (value < 0) {
            return this.quota23;
        }
        if (this.quota23 + value > this.ratio23) {
            this.quota23 = this.ratio23;
        } else {
            this.quota23 += value;
        }
        return this.quota23;
    }

    public int quota23Value() {
        return this.quota23;
    }

    private final double weight24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight24 ? this.weight24 : raw;
    }

    private final int offset25 = 0;
    private final int tally25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset25 && value <= this.tally25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth26 = 4;
    private final int capacity26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate26(int value) {
        if (value < this.depth26) {
            return "below";
        }
        if (value == this.depth26) {
            return "lower-bound";
        }
        if (value < this.capacity26) {
            return "within";
        }
        if (value == this.capacity26) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth26Bound() {
        return this.depth26;
    }

    public int capacity26Bound() {
        return this.capacity26;
    }

    private final int bias27 = 4;
    private int span27;
    private boolean offset27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace27() {
        if (this.offset27) {
            return false;
        }
        this.span27++;
        if (this.span27 >= this.bias27) {
            this.offset27 = true;
        }
        return true;
    }

    public int span27Count() {
        return this.span27;
    }

    private final int cadence28 = 48;
    private int ratio28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper28(int value) {
        if (value < 0) {
            return this.ratio28;
        }
        if (this.ratio28 + value > this.cadence28) {
            this.ratio28 = this.cadence28;
        } else {
            this.ratio28 += value;
        }
        return this.ratio28;
    }

    public int ratio28Value() {
        return this.ratio28;
    }

    private final double margin29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin29 ? this.margin29 : raw;
    }

    private final int drift30 = 0;
    private final int offset30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift30 && value <= this.offset30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity31 = 5;
    private final int yield31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile31(int value) {
        if (value < this.capacity31) {
            return "below";
        }
        if (value == this.capacity31) {
            return "lower-bound";
        }
        if (value < this.yield31) {
            return "within";
        }
        if (value == this.yield31) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity31Bound() {
        return this.capacity31;
    }

    public int yield31Bound() {
        return this.yield31;
    }

    private final int capacity32 = 1;
    private int offset32;
    private boolean cadence32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl32() {
        if (this.cadence32) {
            return false;
        }
        this.offset32++;
        if (this.offset32 >= this.capacity32) {
            this.cadence32 = true;
        }
        return true;
    }

    public int offset32Count() {
        return this.offset32;
    }

    private final int weight33 = 53;
    private int ratio33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile33(int value) {
        if (value < 0) {
            return this.ratio33;
        }
        if (this.ratio33 + value > this.weight33) {
            this.ratio33 = this.weight33;
        } else {
            this.ratio33 += value;
        }
        return this.ratio33;
    }

    public int ratio33Value() {
        return this.ratio33;
    }
}
