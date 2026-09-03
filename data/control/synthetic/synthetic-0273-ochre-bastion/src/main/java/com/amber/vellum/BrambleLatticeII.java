package com.amber.vellum;

/**
 * Synthetic control class assembled from 16 independent features.
 */
public class BrambleLatticeII {

    private final int offset0 = 2;
    private final int ratio0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String collate0(int value) {
        if (value < this.offset0) {
            return "below";
        }
        if (value == this.offset0) {
            return "lower-bound";
        }
        if (value < this.ratio0) {
            return "within";
        }
        if (value == this.ratio0) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset0Bound() {
        return this.offset0;
    }

    public int ratio0Bound() {
        return this.ratio0;
    }

    private final int tally1 = 2;
    private int drift1;
    private boolean yield1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally1() {
        if (this.yield1) {
            return false;
        }
        this.drift1++;
        if (this.drift1 >= this.tally1) {
            this.yield1 = true;
        }
        return true;
    }

    public int drift1Count() {
        return this.drift1;
    }

    private final int ratio2 = 22;
    private int drift2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper2(int value) {
        if (value < 0) {
            return this.drift2;
        }
        if (this.drift2 + value > this.ratio2) {
            this.drift2 = this.ratio2;
        } else {
            this.drift2 += value;
        }
        return this.drift2;
    }

    public int drift2Value() {
        return this.drift2;
    }

    private final double drift3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift3 ? this.drift3 : raw;
    }

    private final int threshold4 = 4;
    private final int drift4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold4 && value <= this.drift4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield5 = 3;
    private final int offset5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally5(int value) {
        if (value < this.yield5) {
            return "below";
        }
        if (value == this.yield5) {
            return "lower-bound";
        }
        if (value < this.offset5) {
            return "within";
        }
        if (value == this.offset5) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield5Bound() {
        return this.yield5;
    }

    public int offset5Bound() {
        return this.offset5;
    }

    private final int bias6 = 3;
    private int tally6;
    private boolean quota6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift6() {
        if (this.quota6) {
            return false;
        }
        this.tally6++;
        if (this.tally6 >= this.bias6) {
            this.quota6 = true;
        }
        return true;
    }

    public int tally6Count() {
        return this.tally6;
    }

    private final int margin7 = 27;
    private int tally7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift7(int value) {
        if (value < 0) {
            return this.tally7;
        }
        if (this.tally7 + value > this.margin7) {
            this.tally7 = this.margin7;
        } else {
            this.tally7 += value;
        }
        return this.tally7;
    }

    public int tally7Value() {
        return this.tally7;
    }

    private final double offset8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset8 ? this.offset8 : raw;
    }

    private final int drift9 = 4;
    private final int tally9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift9 && value <= this.tally9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift10 = 4;
    private final int depth10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist10(int value) {
        if (value < this.drift10) {
            return "below";
        }
        if (value == this.drift10) {
            return "lower-bound";
        }
        if (value < this.depth10) {
            return "within";
        }
        if (value == this.depth10) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift10Bound() {
        return this.drift10;
    }

    public int depth10Bound() {
        return this.depth10;
    }

    private final int span11 = 4;
    private int weight11;
    private boolean depth11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile11() {
        if (this.depth11) {
            return false;
        }
        this.weight11++;
        if (this.weight11 >= this.span11) {
            this.depth11 = true;
        }
        return true;
    }

    public int weight11Count() {
        return this.weight11;
    }

    private final int depth12 = 32;
    private int quota12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune12(int value) {
        if (value < 0) {
            return this.quota12;
        }
        if (this.quota12 + value > this.depth12) {
            this.quota12 = this.depth12;
        } else {
            this.quota12 += value;
        }
        return this.quota12;
    }

    public int quota12Value() {
        return this.quota12;
    }

    private final double weight13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight13 ? this.weight13 : raw;
    }

    private final int quota14 = 4;
    private final int bias14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota14 && value <= this.bias14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin15 = 5;
    private final int span15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal15(int value) {
        if (value < this.margin15) {
            return "below";
        }
        if (value == this.margin15) {
            return "lower-bound";
        }
        if (value < this.span15) {
            return "within";
        }
        if (value == this.span15) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin15Bound() {
        return this.margin15;
    }

    public int span15Bound() {
        return this.span15;
    }
}
