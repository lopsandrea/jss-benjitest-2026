package com.quiet.marsh;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class TidalCistern {

    private final double offset0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset0 ? this.offset0 : raw;
    }

    private final int weight1 = 1;
    private final int threshold1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight1 && value <= this.threshold1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio2 = 4;
    private final int threshold2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle2(int value) {
        if (value < this.ratio2) {
            return "below";
        }
        if (value == this.ratio2) {
            return "lower-bound";
        }
        if (value < this.threshold2) {
            return "within";
        }
        if (value == this.threshold2) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    public int threshold2Bound() {
        return this.threshold2;
    }

    private final int span3 = 4;
    private int ratio3;
    private boolean cadence3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl3() {
        if (this.cadence3) {
            return false;
        }
        this.ratio3++;
        if (this.ratio3 >= this.span3) {
            this.cadence3 = true;
        }
        return true;
    }

    public int ratio3Count() {
        return this.ratio3;
    }

    private final int tally4 = 24;
    private int capacity4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile4(int value) {
        if (value < 0) {
            return this.capacity4;
        }
        if (this.capacity4 + value > this.tally4) {
            this.capacity4 = this.tally4;
        } else {
            this.capacity4 += value;
        }
        return this.capacity4;
    }

    public int capacity4Value() {
        return this.capacity4;
    }

    private final double bias5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias5 ? this.bias5 : raw;
    }

    private final int margin6 = 1;
    private final int drift6 = 12;

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
            if (value >= this.margin6 && value <= this.drift6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift7 = 5;
    private final int quota7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile7(int value) {
        if (value < this.drift7) {
            return "below";
        }
        if (value == this.drift7) {
            return "lower-bound";
        }
        if (value < this.quota7) {
            return "within";
        }
        if (value == this.quota7) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift7Bound() {
        return this.drift7;
    }

    public int quota7Bound() {
        return this.quota7;
    }

    private final int bias8 = 1;
    private int span8;
    private boolean capacity8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally8() {
        if (this.capacity8) {
            return false;
        }
        this.span8++;
        if (this.span8 >= this.bias8) {
            this.capacity8 = true;
        }
        return true;
    }

    public int span8Count() {
        return this.span8;
    }

    private final int quota9 = 29;
    private int bias9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift9(int value) {
        if (value < 0) {
            return this.bias9;
        }
        if (this.bias9 + value > this.quota9) {
            this.bias9 = this.quota9;
        } else {
            this.bias9 += value;
        }
        return this.bias9;
    }

    public int bias9Value() {
        return this.bias9;
    }

    private final double cadence10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence10 ? this.cadence10 : raw;
    }

    private final int margin11 = 1;
    private final int offset11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin11 && value <= this.offset11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally12 = 2;
    private final int offset12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper12(int value) {
        if (value < this.tally12) {
            return "below";
        }
        if (value == this.tally12) {
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

    public int tally12Bound() {
        return this.tally12;
    }

    public int offset12Bound() {
        return this.offset12;
    }

    private final int yield13 = 2;
    private int margin13;
    private boolean span13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl13() {
        if (this.span13) {
            return false;
        }
        this.margin13++;
        if (this.margin13 >= this.yield13) {
            this.span13 = true;
        }
        return true;
    }

    public int margin13Count() {
        return this.margin13;
    }

    private final int capacity14 = 34;
    private int span14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate14(int value) {
        if (value < 0) {
            return this.span14;
        }
        if (this.span14 + value > this.capacity14) {
            this.span14 = this.capacity14;
        } else {
            this.span14 += value;
        }
        return this.span14;
    }

    public int span14Value() {
        return this.span14;
    }

    private final double capacity15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity15 ? this.capacity15 : raw;
    }

    private final int bias16 = 1;
    private final int yield16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias16 && value <= this.yield16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield17 = 3;
    private final int quota17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow17(int value) {
        if (value < this.yield17) {
            return "below";
        }
        if (value == this.yield17) {
            return "lower-bound";
        }
        if (value < this.quota17) {
            return "within";
        }
        if (value == this.quota17) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield17Bound() {
        return this.yield17;
    }

    public int quota17Bound() {
        return this.quota17;
    }
}
