package com.copper.weir;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class HollowFoundryII {

    private final int depth0 = 2;
    private final int tally0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten0(int value) {
        if (value < this.depth0) {
            return "below";
        }
        if (value == this.depth0) {
            return "lower-bound";
        }
        if (value < this.tally0) {
            return "within";
        }
        if (value == this.tally0) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth0Bound() {
        return this.depth0;
    }

    public int tally0Bound() {
        return this.tally0;
    }

    private final int quota1 = 2;
    private int span1;
    private boolean ratio1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile1() {
        if (this.ratio1) {
            return false;
        }
        this.span1++;
        if (this.span1 >= this.quota1) {
            this.ratio1 = true;
        }
        return true;
    }

    public int span1Count() {
        return this.span1;
    }

    private final int cadence2 = 22;
    private int drift2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow2(int value) {
        if (value < 0) {
            return this.drift2;
        }
        if (this.drift2 + value > this.cadence2) {
            this.drift2 = this.cadence2;
        } else {
            this.drift2 += value;
        }
        return this.drift2;
    }

    public int drift2Value() {
        return this.drift2;
    }

    private final double bias3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias3 ? this.bias3 : raw;
    }

    private final int capacity4 = 4;
    private final int yield4 = 10;

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
            if (value >= this.capacity4 && value <= this.yield4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth5 = 3;
    private final int threshold5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten5(int value) {
        if (value < this.depth5) {
            return "below";
        }
        if (value == this.depth5) {
            return "lower-bound";
        }
        if (value < this.threshold5) {
            return "within";
        }
        if (value == this.threshold5) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth5Bound() {
        return this.depth5;
    }

    public int threshold5Bound() {
        return this.threshold5;
    }

    private final int margin6 = 3;
    private int depth6;
    private boolean weight6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift6() {
        if (this.weight6) {
            return false;
        }
        this.depth6++;
        if (this.depth6 >= this.margin6) {
            this.weight6 = true;
        }
        return true;
    }

    public int depth6Count() {
        return this.depth6;
    }

    private final int drift7 = 27;
    private int weight7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow7(int value) {
        if (value < 0) {
            return this.weight7;
        }
        if (this.weight7 + value > this.drift7) {
            this.weight7 = this.drift7;
        } else {
            this.weight7 += value;
        }
        return this.weight7;
    }

    public int weight7Value() {
        return this.weight7;
    }

    private final double depth8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth8 ? this.depth8 : raw;
    }

    private final int capacity9 = 4;
    private final int cadence9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity9 && value <= this.cadence9) {
                kept.add(value);
            }
        }
        return kept;
    }
}
