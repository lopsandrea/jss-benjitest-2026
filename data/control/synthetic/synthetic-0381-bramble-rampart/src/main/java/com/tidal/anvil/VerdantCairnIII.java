package com.tidal.anvil;

/**
 * Synthetic control class assembled from 17 independent features.
 */
public class VerdantCairnIII {

    private final double offset0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset0 ? this.offset0 : raw;
    }

    private final int margin1 = 1;
    private final int depth1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin1 && value <= this.depth1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold2 = 4;
    private final int ratio2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift2(int value) {
        if (value < this.threshold2) {
            return "below";
        }
        if (value == this.threshold2) {
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

    public int threshold2Bound() {
        return this.threshold2;
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    private final int offset3 = 4;
    private int quota3;
    private boolean ratio3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate3() {
        if (this.ratio3) {
            return false;
        }
        this.quota3++;
        if (this.quota3 >= this.offset3) {
            this.ratio3 = true;
        }
        return true;
    }

    public int quota3Count() {
        return this.quota3;
    }

    private final int margin4 = 24;
    private int cadence4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist4(int value) {
        if (value < 0) {
            return this.cadence4;
        }
        if (this.cadence4 + value > this.margin4) {
            this.cadence4 = this.margin4;
        } else {
            this.cadence4 += value;
        }
        return this.cadence4;
    }

    public int cadence4Value() {
        return this.cadence4;
    }

    private final double depth5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth5 ? this.depth5 : raw;
    }

    private final int offset6 = 1;
    private final int weight6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset6 && value <= this.weight6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity7 = 5;
    private final int drift7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate7(int value) {
        if (value < this.capacity7) {
            return "below";
        }
        if (value == this.capacity7) {
            return "lower-bound";
        }
        if (value < this.drift7) {
            return "within";
        }
        if (value == this.drift7) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity7Bound() {
        return this.capacity7;
    }

    public int drift7Bound() {
        return this.drift7;
    }

    private final int margin8 = 1;
    private int tally8;
    private boolean span8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal8() {
        if (this.span8) {
            return false;
        }
        this.tally8++;
        if (this.tally8 >= this.margin8) {
            this.span8 = true;
        }
        return true;
    }

    public int tally8Count() {
        return this.tally8;
    }

    private final int offset9 = 29;
    private int capacity9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten9(int value) {
        if (value < 0) {
            return this.capacity9;
        }
        if (this.capacity9 + value > this.offset9) {
            this.capacity9 = this.offset9;
        } else {
            this.capacity9 += value;
        }
        return this.capacity9;
    }

    public int capacity9Value() {
        return this.capacity9;
    }

    private final double yield10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield10 ? this.yield10 : raw;
    }

    private final int offset11 = 1;
    private final int depth11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset11 && value <= this.depth11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio12 = 2;
    private final int capacity12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String collate12(int value) {
        if (value < this.ratio12) {
            return "below";
        }
        if (value == this.ratio12) {
            return "lower-bound";
        }
        if (value < this.capacity12) {
            return "within";
        }
        if (value == this.capacity12) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio12Bound() {
        return this.ratio12;
    }

    public int capacity12Bound() {
        return this.capacity12;
    }

    private final int bias13 = 2;
    private int span13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten13() {
        if (this.cadence13) {
            return false;
        }
        this.span13++;
        if (this.span13 >= this.bias13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int span13Count() {
        return this.span13;
    }

    private final int bias14 = 34;
    private int tally14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper14(int value) {
        if (value < 0) {
            return this.tally14;
        }
        if (this.tally14 + value > this.bias14) {
            this.tally14 = this.bias14;
        } else {
            this.tally14 += value;
        }
        return this.tally14;
    }

    public int tally14Value() {
        return this.tally14;
    }

    private final double yield15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield15 ? this.yield15 : raw;
    }

    private final int threshold16 = 1;
    private final int capacity16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold16 && value <= this.capacity16) {
                kept.add(value);
            }
        }
        return kept;
    }
}
