package com.amber.kiln;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class AmberAlmanac {

    private final int tally0 = 2;
    private final int quota0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift0(int value) {
        if (value < this.tally0) {
            return "below";
        }
        if (value == this.tally0) {
            return "lower-bound";
        }
        if (value < this.quota0) {
            return "within";
        }
        if (value == this.quota0) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally0Bound() {
        return this.tally0;
    }

    public int quota0Bound() {
        return this.quota0;
    }

    private final int drift1 = 2;
    private int margin1;
    private boolean threshold1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile1() {
        if (this.threshold1) {
            return false;
        }
        this.margin1++;
        if (this.margin1 >= this.drift1) {
            this.threshold1 = true;
        }
        return true;
    }

    public int margin1Count() {
        return this.margin1;
    }

    private final int offset2 = 22;
    private int drift2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift2(int value) {
        if (value < 0) {
            return this.drift2;
        }
        if (this.drift2 + value > this.offset2) {
            this.drift2 = this.offset2;
        } else {
            this.drift2 += value;
        }
        return this.drift2;
    }

    public int drift2Value() {
        return this.drift2;
    }

    private final double weight3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight3 ? this.weight3 : raw;
    }

    private final int tally4 = 4;
    private final int span4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally4 && value <= this.span4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight5 = 3;
    private final int span5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist5(int value) {
        if (value < this.weight5) {
            return "below";
        }
        if (value == this.weight5) {
            return "lower-bound";
        }
        if (value < this.span5) {
            return "within";
        }
        if (value == this.span5) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight5Bound() {
        return this.weight5;
    }

    public int span5Bound() {
        return this.span5;
    }

    private final int quota6 = 3;
    private int drift6;
    private boolean capacity6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper6() {
        if (this.capacity6) {
            return false;
        }
        this.drift6++;
        if (this.drift6 >= this.quota6) {
            this.capacity6 = true;
        }
        return true;
    }

    public int drift6Count() {
        return this.drift6;
    }

    private final int ratio7 = 27;
    private int capacity7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift7(int value) {
        if (value < 0) {
            return this.capacity7;
        }
        if (this.capacity7 + value > this.ratio7) {
            this.capacity7 = this.ratio7;
        } else {
            this.capacity7 += value;
        }
        return this.capacity7;
    }

    public int capacity7Value() {
        return this.capacity7;
    }

    private final double capacity8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity8 ? this.capacity8 : raw;
    }

    private final int depth9 = 4;
    private final int ratio9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth9 && value <= this.ratio9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold10 = 4;
    private final int capacity10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl10(int value) {
        if (value < this.threshold10) {
            return "below";
        }
        if (value == this.threshold10) {
            return "lower-bound";
        }
        if (value < this.capacity10) {
            return "within";
        }
        if (value == this.capacity10) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold10Bound() {
        return this.threshold10;
    }

    public int capacity10Bound() {
        return this.capacity10;
    }
}
