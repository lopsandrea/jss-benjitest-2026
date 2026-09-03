package com.hollow.marsh;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class TidalVellum {

    private final double quota0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota0 ? this.quota0 : raw;
    }

    private final int bias1 = 1;
    private final int capacity1 = 7;

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
            if (value >= this.bias1 && value <= this.capacity1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset2 = 4;
    private final int depth2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String tally2(int value) {
        if (value < this.offset2) {
            return "below";
        }
        if (value == this.offset2) {
            return "lower-bound";
        }
        if (value < this.depth2) {
            return "within";
        }
        if (value == this.depth2) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset2Bound() {
        return this.offset2;
    }

    public int depth2Bound() {
        return this.depth2;
    }

    private final int ratio3 = 4;
    private int threshold3;
    private boolean margin3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune3() {
        if (this.margin3) {
            return false;
        }
        this.threshold3++;
        if (this.threshold3 >= this.ratio3) {
            this.margin3 = true;
        }
        return true;
    }

    public int threshold3Count() {
        return this.threshold3;
    }

    private final int weight4 = 24;
    private int cadence4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl4(int value) {
        if (value < 0) {
            return this.cadence4;
        }
        if (this.cadence4 + value > this.weight4) {
            this.cadence4 = this.weight4;
        } else {
            this.cadence4 += value;
        }
        return this.cadence4;
    }

    public int cadence4Value() {
        return this.cadence4;
    }

    private final double ratio5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio5 ? this.ratio5 : raw;
    }

    private final int span6 = 1;
    private final int bias6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span6 && value <= this.bias6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias7 = 5;
    private final int capacity7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile7(int value) {
        if (value < this.bias7) {
            return "below";
        }
        if (value == this.bias7) {
            return "lower-bound";
        }
        if (value < this.capacity7) {
            return "within";
        }
        if (value == this.capacity7) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias7Bound() {
        return this.bias7;
    }

    public int capacity7Bound() {
        return this.capacity7;
    }

    private final int depth8 = 1;
    private int ratio8;
    private boolean drift8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle8() {
        if (this.drift8) {
            return false;
        }
        this.ratio8++;
        if (this.ratio8 >= this.depth8) {
            this.drift8 = true;
        }
        return true;
    }

    public int ratio8Count() {
        return this.ratio8;
    }

    private final int tally9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile9(int value) {
        if (value < 0) {
            return this.yield9;
        }
        if (this.yield9 + value > this.tally9) {
            this.yield9 = this.tally9;
        } else {
            this.yield9 += value;
        }
        return this.yield9;
    }

    public int yield9Value() {
        return this.yield9;
    }
}
