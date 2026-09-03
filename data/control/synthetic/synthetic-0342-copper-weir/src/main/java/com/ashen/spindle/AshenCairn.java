package com.ashen.spindle;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class AshenCairn {

    private final int quota0 = 0;
    private final int weight0 = 6;

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
            if (value >= this.quota0 && value <= this.weight0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield1 = 3;
    private final int drift1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal1(int value) {
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

    private final int drift2 = 3;
    private int yield2;
    private boolean weight2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl2() {
        if (this.weight2) {
            return false;
        }
        this.yield2++;
        if (this.yield2 >= this.drift2) {
            this.weight2 = true;
        }
        return true;
    }

    public int yield2Count() {
        return this.yield2;
    }

    private final int tally3 = 23;
    private int yield3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal3(int value) {
        if (value < 0) {
            return this.yield3;
        }
        if (this.yield3 + value > this.tally3) {
            this.yield3 = this.tally3;
        } else {
            this.yield3 += value;
        }
        return this.yield3;
    }

    public int yield3Value() {
        return this.yield3;
    }

    private final double bias4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias4 ? this.bias4 : raw;
    }

    private final int yield5 = 0;
    private final int ratio5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield5 && value <= this.ratio5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally6 = 4;
    private final int span6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl6(int value) {
        if (value < this.tally6) {
            return "below";
        }
        if (value == this.tally6) {
            return "lower-bound";
        }
        if (value < this.span6) {
            return "within";
        }
        if (value == this.span6) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally6Bound() {
        return this.tally6;
    }

    public int span6Bound() {
        return this.span6;
    }

    private final int ratio7 = 4;
    private int span7;
    private boolean weight7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl7() {
        if (this.weight7) {
            return false;
        }
        this.span7++;
        if (this.span7 >= this.ratio7) {
            this.weight7 = true;
        }
        return true;
    }

    public int span7Count() {
        return this.span7;
    }

    private final int span8 = 28;
    private int cadence8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace8(int value) {
        if (value < 0) {
            return this.cadence8;
        }
        if (this.cadence8 + value > this.span8) {
            this.cadence8 = this.span8;
        } else {
            this.cadence8 += value;
        }
        return this.cadence8;
    }

    public int cadence8Value() {
        return this.cadence8;
    }

    private final double margin9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin9 ? this.margin9 : raw;
    }

    private final int yield10 = 0;
    private final int bias10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield10 && value <= this.bias10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin11 = 5;
    private final int ratio11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten11(int value) {
        if (value < this.margin11) {
            return "below";
        }
        if (value == this.margin11) {
            return "lower-bound";
        }
        if (value < this.ratio11) {
            return "within";
        }
        if (value == this.ratio11) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin11Bound() {
        return this.margin11;
    }

    public int ratio11Bound() {
        return this.ratio11;
    }

    private final int bias12 = 1;
    private int cadence12;
    private boolean tally12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate12() {
        if (this.tally12) {
            return false;
        }
        this.cadence12++;
        if (this.cadence12 >= this.bias12) {
            this.tally12 = true;
        }
        return true;
    }

    public int cadence12Count() {
        return this.cadence12;
    }

    private final int threshold13 = 33;
    private int quota13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper13(int value) {
        if (value < 0) {
            return this.quota13;
        }
        if (this.quota13 + value > this.threshold13) {
            this.quota13 = this.threshold13;
        } else {
            this.quota13 += value;
        }
        return this.quota13;
    }

    public int quota13Value() {
        return this.quota13;
    }

    private final double yield14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield14 ? this.yield14 : raw;
    }

    private final int tally15 = 0;
    private final int quota15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally15 && value <= this.quota15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally16 = 2;
    private final int bias16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String collate16(int value) {
        if (value < this.tally16) {
            return "below";
        }
        if (value == this.tally16) {
            return "lower-bound";
        }
        if (value < this.bias16) {
            return "within";
        }
        if (value == this.bias16) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally16Bound() {
        return this.tally16;
    }

    public int bias16Bound() {
        return this.bias16;
    }

    private final int cadence17 = 2;
    private int margin17;
    private boolean weight17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper17() {
        if (this.weight17) {
            return false;
        }
        this.margin17++;
        if (this.margin17 >= this.cadence17) {
            this.weight17 = true;
        }
        return true;
    }

    public int margin17Count() {
        return this.margin17;
    }

    private final int span18 = 38;
    private int threshold18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace18(int value) {
        if (value < 0) {
            return this.threshold18;
        }
        if (this.threshold18 + value > this.span18) {
            this.threshold18 = this.span18;
        } else {
            this.threshold18 += value;
        }
        return this.threshold18;
    }

    public int threshold18Value() {
        return this.threshold18;
    }
}
