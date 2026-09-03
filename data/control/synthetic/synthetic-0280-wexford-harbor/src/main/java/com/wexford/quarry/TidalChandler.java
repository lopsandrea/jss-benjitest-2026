package com.wexford.quarry;

/**
 * Synthetic control class assembled from 9 independent features.
 */
public class TidalChandler {

    private final int cadence0 = 20;
    private int ratio0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten0(int value) {
        if (value < 0) {
            return this.ratio0;
        }
        if (this.ratio0 + value > this.cadence0) {
            this.ratio0 = this.cadence0;
        } else {
            this.ratio0 += value;
        }
        return this.ratio0;
    }

    public int ratio0Value() {
        return this.ratio0;
    }

    private final double capacity1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity1 ? this.capacity1 : raw;
    }

    private final int weight2 = 2;
    private final int tally2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight2 && value <= this.tally2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio3 = 5;
    private final int weight3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge3(int value) {
        if (value < this.ratio3) {
            return "below";
        }
        if (value == this.ratio3) {
            return "lower-bound";
        }
        if (value < this.weight3) {
            return "within";
        }
        if (value == this.weight3) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    public int weight3Bound() {
        return this.weight3;
    }

    private final int yield4 = 1;
    private int threshold4;
    private boolean span4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl4() {
        if (this.span4) {
            return false;
        }
        this.threshold4++;
        if (this.threshold4 >= this.yield4) {
            this.span4 = true;
        }
        return true;
    }

    public int threshold4Count() {
        return this.threshold4;
    }

    private final int capacity5 = 25;
    private int ratio5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate5(int value) {
        if (value < 0) {
            return this.ratio5;
        }
        if (this.ratio5 + value > this.capacity5) {
            this.ratio5 = this.capacity5;
        } else {
            this.ratio5 += value;
        }
        return this.ratio5;
    }

    public int ratio5Value() {
        return this.ratio5;
    }

    private final double weight6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight6 ? this.weight6 : raw;
    }

    private final int capacity7 = 2;
    private final int depth7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity7 && value <= this.depth7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift8 = 2;
    private final int tally8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String temper8(int value) {
        if (value < this.drift8) {
            return "below";
        }
        if (value == this.drift8) {
            return "lower-bound";
        }
        if (value < this.tally8) {
            return "within";
        }
        if (value == this.tally8) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift8Bound() {
        return this.drift8;
    }

    public int tally8Bound() {
        return this.tally8;
    }
}
