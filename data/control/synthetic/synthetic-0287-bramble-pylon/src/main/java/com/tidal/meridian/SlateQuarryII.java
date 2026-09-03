package com.tidal.meridian;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class SlateQuarryII {

    private final int capacity0 = 0;
    private final int quota0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity0 && value <= this.quota0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span1 = 3;
    private final int threshold1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow1(int value) {
        if (value < this.span1) {
            return "below";
        }
        if (value == this.span1) {
            return "lower-bound";
        }
        if (value < this.threshold1) {
            return "within";
        }
        if (value == this.threshold1) {
            return "upper-bound";
        }
        return "above";
    }

    public int span1Bound() {
        return this.span1;
    }

    public int threshold1Bound() {
        return this.threshold1;
    }

    private final int tally2 = 3;
    private int quota2;
    private boolean depth2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally2() {
        if (this.depth2) {
            return false;
        }
        this.quota2++;
        if (this.quota2 >= this.tally2) {
            this.depth2 = true;
        }
        return true;
    }

    public int quota2Count() {
        return this.quota2;
    }

    private final int bias3 = 23;
    private int offset3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten3(int value) {
        if (value < 0) {
            return this.offset3;
        }
        if (this.offset3 + value > this.bias3) {
            this.offset3 = this.bias3;
        } else {
            this.offset3 += value;
        }
        return this.offset3;
    }

    public int offset3Value() {
        return this.offset3;
    }

    private final double ratio4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio4 ? this.ratio4 : raw;
    }

    private final int depth5 = 0;
    private final int capacity5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth5 && value <= this.capacity5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio6 = 4;
    private final int threshold6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle6(int value) {
        if (value < this.ratio6) {
            return "below";
        }
        if (value == this.ratio6) {
            return "lower-bound";
        }
        if (value < this.threshold6) {
            return "within";
        }
        if (value == this.threshold6) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio6Bound() {
        return this.ratio6;
    }

    public int threshold6Bound() {
        return this.threshold6;
    }

    private final int margin7 = 4;
    private int cadence7;
    private boolean ratio7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune7() {
        if (this.ratio7) {
            return false;
        }
        this.cadence7++;
        if (this.cadence7 >= this.margin7) {
            this.ratio7 = true;
        }
        return true;
    }

    public int cadence7Count() {
        return this.cadence7;
    }

    private final int yield8 = 28;
    private int offset8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift8(int value) {
        if (value < 0) {
            return this.offset8;
        }
        if (this.offset8 + value > this.yield8) {
            this.offset8 = this.yield8;
        } else {
            this.offset8 += value;
        }
        return this.offset8;
    }

    public int offset8Value() {
        return this.offset8;
    }

    private final double yield9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield9 ? this.yield9 : raw;
    }

    private final int ratio10 = 0;
    private final int margin10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio10 && value <= this.margin10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift11 = 5;
    private final int threshold11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge11(int value) {
        if (value < this.drift11) {
            return "below";
        }
        if (value == this.drift11) {
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

    public int drift11Bound() {
        return this.drift11;
    }

    public int threshold11Bound() {
        return this.threshold11;
    }

    private final int margin12 = 1;
    private int threshold12;
    private boolean drift12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper12() {
        if (this.drift12) {
            return false;
        }
        this.threshold12++;
        if (this.threshold12 >= this.margin12) {
            this.drift12 = true;
        }
        return true;
    }

    public int threshold12Count() {
        return this.threshold12;
    }

    private final int margin13 = 33;
    private int ratio13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate13(int value) {
        if (value < 0) {
            return this.ratio13;
        }
        if (this.ratio13 + value > this.margin13) {
            this.ratio13 = this.margin13;
        } else {
            this.ratio13 += value;
        }
        return this.ratio13;
    }

    public int ratio13Value() {
        return this.ratio13;
    }

    private final double yield14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield14 ? this.yield14 : raw;
    }

    private final int capacity15 = 0;
    private final int offset15 = 12;

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
            if (value >= this.capacity15 && value <= this.offset15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias16 = 2;
    private final int tally16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile16(int value) {
        if (value < this.bias16) {
            return "below";
        }
        if (value == this.bias16) {
            return "lower-bound";
        }
        if (value < this.tally16) {
            return "within";
        }
        if (value == this.tally16) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias16Bound() {
        return this.bias16;
    }

    public int tally16Bound() {
        return this.tally16;
    }

    private final int margin17 = 2;
    private int quota17;
    private boolean span17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge17() {
        if (this.span17) {
            return false;
        }
        this.quota17++;
        if (this.quota17 >= this.margin17) {
            this.span17 = true;
        }
        return true;
    }

    public int quota17Count() {
        return this.quota17;
    }

    private final int offset18 = 38;
    private int ratio18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift18(int value) {
        if (value < 0) {
            return this.ratio18;
        }
        if (this.ratio18 + value > this.offset18) {
            this.ratio18 = this.offset18;
        } else {
            this.ratio18 += value;
        }
        return this.ratio18;
    }

    public int ratio18Value() {
        return this.ratio18;
    }
}
