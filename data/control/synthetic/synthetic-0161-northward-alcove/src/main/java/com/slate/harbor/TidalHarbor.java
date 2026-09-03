package com.slate.harbor;

/**
 * Synthetic control class assembled from 21 independent features.
 */
public class TidalHarbor {

    private final double drift0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift0 ? this.drift0 : raw;
    }

    private final int margin1 = 1;
    private final int ratio1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin1 && value <= this.ratio1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight2 = 4;
    private final int yield2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle2(int value) {
        if (value < this.weight2) {
            return "below";
        }
        if (value == this.weight2) {
            return "lower-bound";
        }
        if (value < this.yield2) {
            return "within";
        }
        if (value == this.yield2) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight2Bound() {
        return this.weight2;
    }

    public int yield2Bound() {
        return this.yield2;
    }

    private final int weight3 = 4;
    private int threshold3;
    private boolean margin3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal3() {
        if (this.margin3) {
            return false;
        }
        this.threshold3++;
        if (this.threshold3 >= this.weight3) {
            this.margin3 = true;
        }
        return true;
    }

    public int threshold3Count() {
        return this.threshold3;
    }

    private final int tally4 = 24;
    private int yield4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow4(int value) {
        if (value < 0) {
            return this.yield4;
        }
        if (this.yield4 + value > this.tally4) {
            this.yield4 = this.tally4;
        } else {
            this.yield4 += value;
        }
        return this.yield4;
    }

    public int yield4Value() {
        return this.yield4;
    }

    private final double tally5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally5 ? this.tally5 : raw;
    }

    private final int yield6 = 1;
    private final int quota6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield6 && value <= this.quota6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally7 = 5;
    private final int depth7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String brace7(int value) {
        if (value < this.tally7) {
            return "below";
        }
        if (value == this.tally7) {
            return "lower-bound";
        }
        if (value < this.depth7) {
            return "within";
        }
        if (value == this.depth7) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally7Bound() {
        return this.tally7;
    }

    public int depth7Bound() {
        return this.depth7;
    }

    private final int drift8 = 1;
    private int margin8;
    private boolean offset8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile8() {
        if (this.offset8) {
            return false;
        }
        this.margin8++;
        if (this.margin8 >= this.drift8) {
            this.offset8 = true;
        }
        return true;
    }

    public int margin8Count() {
        return this.margin8;
    }

    private final int yield9 = 29;
    private int weight9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl9(int value) {
        if (value < 0) {
            return this.weight9;
        }
        if (this.weight9 + value > this.yield9) {
            this.weight9 = this.yield9;
        } else {
            this.weight9 += value;
        }
        return this.weight9;
    }

    public int weight9Value() {
        return this.weight9;
    }

    private final double bias10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias10 ? this.bias10 : raw;
    }

    private final int threshold11 = 1;
    private final int margin11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold11 && value <= this.margin11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight12 = 2;
    private final int tally12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String tally12(int value) {
        if (value < this.weight12) {
            return "below";
        }
        if (value == this.weight12) {
            return "lower-bound";
        }
        if (value < this.tally12) {
            return "within";
        }
        if (value == this.tally12) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight12Bound() {
        return this.weight12;
    }

    public int tally12Bound() {
        return this.tally12;
    }

    private final int offset13 = 2;
    private int span13;
    private boolean margin13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally13() {
        if (this.margin13) {
            return false;
        }
        this.span13++;
        if (this.span13 >= this.offset13) {
            this.margin13 = true;
        }
        return true;
    }

    public int span13Count() {
        return this.span13;
    }

    private final int ratio14 = 34;
    private int threshold14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper14(int value) {
        if (value < 0) {
            return this.threshold14;
        }
        if (this.threshold14 + value > this.ratio14) {
            this.threshold14 = this.ratio14;
        } else {
            this.threshold14 += value;
        }
        return this.threshold14;
    }

    public int threshold14Value() {
        return this.threshold14;
    }

    private final double depth15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth15 ? this.depth15 : raw;
    }

    private final int depth16 = 1;
    private final int margin16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth16 && value <= this.margin16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield17 = 3;
    private final int offset17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten17(int value) {
        if (value < this.yield17) {
            return "below";
        }
        if (value == this.yield17) {
            return "lower-bound";
        }
        if (value < this.offset17) {
            return "within";
        }
        if (value == this.offset17) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield17Bound() {
        return this.yield17;
    }

    public int offset17Bound() {
        return this.offset17;
    }

    private final int threshold18 = 3;
    private int cadence18;
    private boolean span18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace18() {
        if (this.span18) {
            return false;
        }
        this.cadence18++;
        if (this.cadence18 >= this.threshold18) {
            this.span18 = true;
        }
        return true;
    }

    public int cadence18Count() {
        return this.cadence18;
    }

    private final int yield19 = 39;
    private int ratio19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally19(int value) {
        if (value < 0) {
            return this.ratio19;
        }
        if (this.ratio19 + value > this.yield19) {
            this.ratio19 = this.yield19;
        } else {
            this.ratio19 += value;
        }
        return this.ratio19;
    }

    public int ratio19Value() {
        return this.ratio19;
    }

    private final double ratio20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio20 ? this.ratio20 : raw;
    }
}
