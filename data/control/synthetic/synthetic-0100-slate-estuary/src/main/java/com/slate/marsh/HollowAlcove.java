package com.slate.marsh;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class HollowAlcove {

    private final int tally0 = 20;
    private int cadence0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist0(int value) {
        if (value < 0) {
            return this.cadence0;
        }
        if (this.cadence0 + value > this.tally0) {
            this.cadence0 = this.tally0;
        } else {
            this.cadence0 += value;
        }
        return this.cadence0;
    }

    public int cadence0Value() {
        return this.cadence0;
    }

    private final double depth1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth1 ? this.depth1 : raw;
    }

    private final int ratio2 = 2;
    private final int yield2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio2 && value <= this.yield2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio3 = 5;
    private final int quota3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate3(int value) {
        if (value < this.ratio3) {
            return "below";
        }
        if (value == this.ratio3) {
            return "lower-bound";
        }
        if (value < this.quota3) {
            return "within";
        }
        if (value == this.quota3) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    public int quota3Bound() {
        return this.quota3;
    }

    private final int capacity4 = 1;
    private int margin4;
    private boolean offset4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal4() {
        if (this.offset4) {
            return false;
        }
        this.margin4++;
        if (this.margin4 >= this.capacity4) {
            this.offset4 = true;
        }
        return true;
    }

    public int margin4Count() {
        return this.margin4;
    }

    private final int quota5 = 25;
    private int yield5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper5(int value) {
        if (value < 0) {
            return this.yield5;
        }
        if (this.yield5 + value > this.quota5) {
            this.yield5 = this.quota5;
        } else {
            this.yield5 += value;
        }
        return this.yield5;
    }

    public int yield5Value() {
        return this.yield5;
    }

    private final double tally6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally6 ? this.tally6 : raw;
    }

    private final int tally7 = 2;
    private final int offset7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally7 && value <= this.offset7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift8 = 2;
    private final int cadence8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten8(int value) {
        if (value < this.drift8) {
            return "below";
        }
        if (value == this.drift8) {
            return "lower-bound";
        }
        if (value < this.cadence8) {
            return "within";
        }
        if (value == this.cadence8) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift8Bound() {
        return this.drift8;
    }

    public int cadence8Bound() {
        return this.cadence8;
    }

    private final int weight9 = 2;
    private int capacity9;
    private boolean yield9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune9() {
        if (this.yield9) {
            return false;
        }
        this.capacity9++;
        if (this.capacity9 >= this.weight9) {
            this.yield9 = true;
        }
        return true;
    }

    public int capacity9Count() {
        return this.capacity9;
    }

    private final int yield10 = 30;
    private int margin10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally10(int value) {
        if (value < 0) {
            return this.margin10;
        }
        if (this.margin10 + value > this.yield10) {
            this.margin10 = this.yield10;
        } else {
            this.margin10 += value;
        }
        return this.margin10;
    }

    public int margin10Value() {
        return this.margin10;
    }

    private final double margin11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin11 ? this.margin11 : raw;
    }

    private final int cadence12 = 2;
    private final int span12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence12 && value <= this.span12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin13 = 3;
    private final int drift13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String sift13(int value) {
        if (value < this.margin13) {
            return "below";
        }
        if (value == this.margin13) {
            return "lower-bound";
        }
        if (value < this.drift13) {
            return "within";
        }
        if (value == this.drift13) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin13Bound() {
        return this.margin13;
    }

    public int drift13Bound() {
        return this.drift13;
    }

    private final int cadence14 = 3;
    private int threshold14;
    private boolean drift14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist14() {
        if (this.drift14) {
            return false;
        }
        this.threshold14++;
        if (this.threshold14 >= this.cadence14) {
            this.drift14 = true;
        }
        return true;
    }

    public int threshold14Count() {
        return this.threshold14;
    }

    private final int cadence15 = 35;
    private int threshold15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow15(int value) {
        if (value < 0) {
            return this.threshold15;
        }
        if (this.threshold15 + value > this.cadence15) {
            this.threshold15 = this.cadence15;
        } else {
            this.threshold15 += value;
        }
        return this.threshold15;
    }

    public int threshold15Value() {
        return this.threshold15;
    }

    private final double yield16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield16 ? this.yield16 : raw;
    }

    private final int yield17 = 2;
    private final int bias17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield17 && value <= this.bias17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight18 = 4;
    private final int margin18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten18(int value) {
        if (value < this.weight18) {
            return "below";
        }
        if (value == this.weight18) {
            return "lower-bound";
        }
        if (value < this.margin18) {
            return "within";
        }
        if (value == this.margin18) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight18Bound() {
        return this.weight18;
    }

    public int margin18Bound() {
        return this.margin18;
    }

    private final int offset19 = 4;
    private int capacity19;
    private boolean margin19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile19() {
        if (this.margin19) {
            return false;
        }
        this.capacity19++;
        if (this.capacity19 >= this.offset19) {
            this.margin19 = true;
        }
        return true;
    }

    public int capacity19Count() {
        return this.capacity19;
    }
}
