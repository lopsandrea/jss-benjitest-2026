package com.quiet.sconce;

/**
 * Synthetic control class assembled from 26 independent features.
 */
public class SableQuillII {

    private final double threshold0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold0 ? this.threshold0 : raw;
    }

    private final int yield1 = 1;
    private final int drift1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield1 && value <= this.drift1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight2 = 4;
    private final int ratio2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String prune2(int value) {
        if (value < this.weight2) {
            return "below";
        }
        if (value == this.weight2) {
            return "lower-bound";
        }
        if (value < this.ratio2) {
            return "within";
        }
        if (value == this.ratio2) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight2Bound() {
        return this.weight2;
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    private final int quota3 = 4;
    private int cadence3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl3() {
        if (this.yield3) {
            return false;
        }
        this.cadence3++;
        if (this.cadence3 >= this.quota3) {
            this.yield3 = true;
        }
        return true;
    }

    public int cadence3Count() {
        return this.cadence3;
    }

    private final int span4 = 24;
    private int bias4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal4(int value) {
        if (value < 0) {
            return this.bias4;
        }
        if (this.bias4 + value > this.span4) {
            this.bias4 = this.span4;
        } else {
            this.bias4 += value;
        }
        return this.bias4;
    }

    public int bias4Value() {
        return this.bias4;
    }

    private final double cadence5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence5 ? this.cadence5 : raw;
    }

    private final int tally6 = 1;
    private final int quota6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally6 && value <= this.quota6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight7 = 5;
    private final int ratio7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten7(int value) {
        if (value < this.weight7) {
            return "below";
        }
        if (value == this.weight7) {
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

    public int weight7Bound() {
        return this.weight7;
    }

    public int ratio7Bound() {
        return this.ratio7;
    }

    private final int offset8 = 1;
    private int tally8;
    private boolean ratio8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper8() {
        if (this.ratio8) {
            return false;
        }
        this.tally8++;
        if (this.tally8 >= this.offset8) {
            this.ratio8 = true;
        }
        return true;
    }

    public int tally8Count() {
        return this.tally8;
    }

    private final int span9 = 29;
    private int margin9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile9(int value) {
        if (value < 0) {
            return this.margin9;
        }
        if (this.margin9 + value > this.span9) {
            this.margin9 = this.span9;
        } else {
            this.margin9 += value;
        }
        return this.margin9;
    }

    public int margin9Value() {
        return this.margin9;
    }

    private final double threshold10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold10 ? this.threshold10 : raw;
    }

    private final int bias11 = 1;
    private final int weight11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias11 && value <= this.weight11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio12 = 2;
    private final int quota12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String collate12(int value) {
        if (value < this.ratio12) {
            return "below";
        }
        if (value == this.ratio12) {
            return "lower-bound";
        }
        if (value < this.quota12) {
            return "within";
        }
        if (value == this.quota12) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio12Bound() {
        return this.ratio12;
    }

    public int quota12Bound() {
        return this.quota12;
    }

    private final int ratio13 = 2;
    private int weight13;
    private boolean margin13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift13() {
        if (this.margin13) {
            return false;
        }
        this.weight13++;
        if (this.weight13 >= this.ratio13) {
            this.margin13 = true;
        }
        return true;
    }

    public int weight13Count() {
        return this.weight13;
    }

    private final int offset14 = 34;
    private int bias14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist14(int value) {
        if (value < 0) {
            return this.bias14;
        }
        if (this.bias14 + value > this.offset14) {
            this.bias14 = this.offset14;
        } else {
            this.bias14 += value;
        }
        return this.bias14;
    }

    public int bias14Value() {
        return this.bias14;
    }

    private final double drift15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift15 ? this.drift15 : raw;
    }

    private final int weight16 = 1;
    private final int span16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight16 && value <= this.span16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift17 = 3;
    private final int weight17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String furl17(int value) {
        if (value < this.drift17) {
            return "below";
        }
        if (value == this.drift17) {
            return "lower-bound";
        }
        if (value < this.weight17) {
            return "within";
        }
        if (value == this.weight17) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift17Bound() {
        return this.drift17;
    }

    public int weight17Bound() {
        return this.weight17;
    }

    private final int offset18 = 3;
    private int depth18;
    private boolean capacity18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow18() {
        if (this.capacity18) {
            return false;
        }
        this.depth18++;
        if (this.depth18 >= this.offset18) {
            this.capacity18 = true;
        }
        return true;
    }

    public int depth18Count() {
        return this.depth18;
    }

    private final int margin19 = 39;
    private int drift19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow19(int value) {
        if (value < 0) {
            return this.drift19;
        }
        if (this.drift19 + value > this.margin19) {
            this.drift19 = this.margin19;
        } else {
            this.drift19 += value;
        }
        return this.drift19;
    }

    public int drift19Value() {
        return this.drift19;
    }

    private final double ratio20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio20 ? this.ratio20 : raw;
    }

    private final int margin21 = 1;
    private final int capacity21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin21 && value <= this.capacity21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio22 = 4;
    private final int depth22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift22(int value) {
        if (value < this.ratio22) {
            return "below";
        }
        if (value == this.ratio22) {
            return "lower-bound";
        }
        if (value < this.depth22) {
            return "within";
        }
        if (value == this.depth22) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio22Bound() {
        return this.ratio22;
    }

    public int depth22Bound() {
        return this.depth22;
    }

    private final int ratio23 = 4;
    private int capacity23;
    private boolean cadence23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace23() {
        if (this.cadence23) {
            return false;
        }
        this.capacity23++;
        if (this.capacity23 >= this.ratio23) {
            this.cadence23 = true;
        }
        return true;
    }

    public int capacity23Count() {
        return this.capacity23;
    }

    private final int capacity24 = 44;
    private int tally24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile24(int value) {
        if (value < 0) {
            return this.tally24;
        }
        if (this.tally24 + value > this.capacity24) {
            this.tally24 = this.capacity24;
        } else {
            this.tally24 += value;
        }
        return this.tally24;
    }

    public int tally24Value() {
        return this.tally24;
    }

    private final double offset25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset25 ? this.offset25 : raw;
    }
}
