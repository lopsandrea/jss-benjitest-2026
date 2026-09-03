package com.northward.harbor;

/**
 * Synthetic control class assembled from 8 independent features.
 */
public class NorthwardBeaconII {

    private final int capacity0 = 2;
    private final int threshold0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist0(int value) {
        if (value < this.capacity0) {
            return "below";
        }
        if (value == this.capacity0) {
            return "lower-bound";
        }
        if (value < this.threshold0) {
            return "within";
        }
        if (value == this.threshold0) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity0Bound() {
        return this.capacity0;
    }

    public int threshold0Bound() {
        return this.threshold0;
    }

    private final int drift1 = 2;
    private int ratio1;
    private boolean offset1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow1() {
        if (this.offset1) {
            return false;
        }
        this.ratio1++;
        if (this.ratio1 >= this.drift1) {
            this.offset1 = true;
        }
        return true;
    }

    public int ratio1Count() {
        return this.ratio1;
    }

    private final int weight2 = 22;
    private int depth2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl2(int value) {
        if (value < 0) {
            return this.depth2;
        }
        if (this.depth2 + value > this.weight2) {
            this.depth2 = this.weight2;
        } else {
            this.depth2 += value;
        }
        return this.depth2;
    }

    public int depth2Value() {
        return this.depth2;
    }

    private final double offset3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset3 ? this.offset3 : raw;
    }

    private final int threshold4 = 4;
    private final int yield4 = 10;

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
            if (value >= this.threshold4 && value <= this.yield4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span5 = 3;
    private final int quota5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow5(int value) {
        if (value < this.span5) {
            return "below";
        }
        if (value == this.span5) {
            return "lower-bound";
        }
        if (value < this.quota5) {
            return "within";
        }
        if (value == this.quota5) {
            return "upper-bound";
        }
        return "above";
    }

    public int span5Bound() {
        return this.span5;
    }

    public int quota5Bound() {
        return this.quota5;
    }

    private final int offset6 = 3;
    private int span6;
    private boolean depth6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl6() {
        if (this.depth6) {
            return false;
        }
        this.span6++;
        if (this.span6 >= this.offset6) {
            this.depth6 = true;
        }
        return true;
    }

    public int span6Count() {
        return this.span6;
    }

    private final int ratio7 = 27;
    private int quota7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow7(int value) {
        if (value < 0) {
            return this.quota7;
        }
        if (this.quota7 + value > this.ratio7) {
            this.quota7 = this.ratio7;
        } else {
            this.quota7 += value;
        }
        return this.quota7;
    }

    public int quota7Value() {
        return this.quota7;
    }
}
