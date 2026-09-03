package com.sable.harbor;

/**
 * Synthetic control class assembled from 8 independent features.
 */
public class SlateSconce {

    private final int depth0 = 20;
    private int bias0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate0(int value) {
        if (value < 0) {
            return this.bias0;
        }
        if (this.bias0 + value > this.depth0) {
            this.bias0 = this.depth0;
        } else {
            this.bias0 += value;
        }
        return this.bias0;
    }

    public int bias0Value() {
        return this.bias0;
    }

    private final double margin1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin1 ? this.margin1 : raw;
    }

    private final int tally2 = 2;
    private final int depth2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally2 && value <= this.depth2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold3 = 5;
    private final int capacity3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge3(int value) {
        if (value < this.threshold3) {
            return "below";
        }
        if (value == this.threshold3) {
            return "lower-bound";
        }
        if (value < this.capacity3) {
            return "within";
        }
        if (value == this.capacity3) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold3Bound() {
        return this.threshold3;
    }

    public int capacity3Bound() {
        return this.capacity3;
    }

    private final int capacity4 = 1;
    private int bias4;
    private boolean cadence4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper4() {
        if (this.cadence4) {
            return false;
        }
        this.bias4++;
        if (this.bias4 >= this.capacity4) {
            this.cadence4 = true;
        }
        return true;
    }

    public int bias4Count() {
        return this.bias4;
    }

    private final int bias5 = 25;
    private int capacity5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile5(int value) {
        if (value < 0) {
            return this.capacity5;
        }
        if (this.capacity5 + value > this.bias5) {
            this.capacity5 = this.bias5;
        } else {
            this.capacity5 += value;
        }
        return this.capacity5;
    }

    public int capacity5Value() {
        return this.capacity5;
    }

    private final double depth6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth6 ? this.depth6 : raw;
    }

    private final int depth7 = 2;
    private final int yield7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth7 && value <= this.yield7) {
                kept.add(value);
            }
        }
        return kept;
    }
}
