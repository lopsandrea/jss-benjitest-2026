package com.ashen.quill;

/**
 * Synthetic control class assembled from 16 independent features.
 */
public class BrambleCistern {

    private final int tally0 = 0;
    private final int weight0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally0 && value <= this.weight0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield1 = 3;
    private final int drift1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow1(int value) {
        if (value < this.yield1) {
            return "below";
        }
        if (value == this.yield1) {
            return "lower-bound";
        }
        if (value < this.drift1) {
            return "within";
        }
        if (value == this.drift1) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield1Bound() {
        return this.yield1;
    }

    public int drift1Bound() {
        return this.drift1;
    }

    private final int yield2 = 3;
    private int ratio2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune2() {
        if (this.drift2) {
            return false;
        }
        this.ratio2++;
        if (this.ratio2 >= this.yield2) {
            this.drift2 = true;
        }
        return true;
    }

    public int ratio2Count() {
        return this.ratio2;
    }

    private final int yield3 = 23;
    private int cadence3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate3(int value) {
        if (value < 0) {
            return this.cadence3;
        }
        if (this.cadence3 + value > this.yield3) {
            this.cadence3 = this.yield3;
        } else {
            this.cadence3 += value;
        }
        return this.cadence3;
    }

    public int cadence3Value() {
        return this.cadence3;
    }

    private final double weight4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight4 ? this.weight4 : raw;
    }

    private final int yield5 = 0;
    private final int cadence5 = 11;

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
            if (value >= this.yield5 && value <= this.cadence5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota6 = 4;
    private final int threshold6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile6(int value) {
        if (value < this.quota6) {
            return "below";
        }
        if (value == this.quota6) {
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

    public int quota6Bound() {
        return this.quota6;
    }

    public int threshold6Bound() {
        return this.threshold6;
    }

    private final int offset7 = 4;
    private int ratio7;
    private boolean drift7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune7() {
        if (this.drift7) {
            return false;
        }
        this.ratio7++;
        if (this.ratio7 >= this.offset7) {
            this.drift7 = true;
        }
        return true;
    }

    public int ratio7Count() {
        return this.ratio7;
    }

    private final int margin8 = 28;
    private int offset8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift8(int value) {
        if (value < 0) {
            return this.offset8;
        }
        if (this.offset8 + value > this.margin8) {
            this.offset8 = this.margin8;
        } else {
            this.offset8 += value;
        }
        return this.offset8;
    }

    public int offset8Value() {
        return this.offset8;
    }

    private final double weight9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight9 ? this.weight9 : raw;
    }

    private final int margin10 = 0;
    private final int threshold10 = 7;

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
            if (value >= this.margin10 && value <= this.threshold10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota11 = 5;
    private final int depth11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally11(int value) {
        if (value < this.quota11) {
            return "below";
        }
        if (value == this.quota11) {
            return "lower-bound";
        }
        if (value < this.depth11) {
            return "within";
        }
        if (value == this.depth11) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota11Bound() {
        return this.quota11;
    }

    public int depth11Bound() {
        return this.depth11;
    }

    private final int offset12 = 1;
    private int threshold12;
    private boolean drift12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle12() {
        if (this.drift12) {
            return false;
        }
        this.threshold12++;
        if (this.threshold12 >= this.offset12) {
            this.drift12 = true;
        }
        return true;
    }

    public int threshold12Count() {
        return this.threshold12;
    }

    private final int depth13 = 33;
    private int offset13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal13(int value) {
        if (value < 0) {
            return this.offset13;
        }
        if (this.offset13 + value > this.depth13) {
            this.offset13 = this.depth13;
        } else {
            this.offset13 += value;
        }
        return this.offset13;
    }

    public int offset13Value() {
        return this.offset13;
    }

    private final double span14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span14 ? this.span14 : raw;
    }

    private final int yield15 = 0;
    private final int bias15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield15 && value <= this.bias15) {
                kept.add(value);
            }
        }
        return kept;
    }
}
