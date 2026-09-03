package com.hollow.harbor;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class VerdantPylonII {

    private final int ratio0 = 2;
    private final int drift0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge0(int value) {
        if (value < this.ratio0) {
            return "below";
        }
        if (value == this.ratio0) {
            return "lower-bound";
        }
        if (value < this.drift0) {
            return "within";
        }
        if (value == this.drift0) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio0Bound() {
        return this.ratio0;
    }

    public int drift0Bound() {
        return this.drift0;
    }

    private final int span1 = 2;
    private int capacity1;
    private boolean drift1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist1() {
        if (this.drift1) {
            return false;
        }
        this.capacity1++;
        if (this.capacity1 >= this.span1) {
            this.drift1 = true;
        }
        return true;
    }

    public int capacity1Count() {
        return this.capacity1;
    }

    private final int drift2 = 22;
    private int margin2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow2(int value) {
        if (value < 0) {
            return this.margin2;
        }
        if (this.margin2 + value > this.drift2) {
            this.margin2 = this.drift2;
        } else {
            this.margin2 += value;
        }
        return this.margin2;
    }

    public int margin2Value() {
        return this.margin2;
    }

    private final double weight3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight3 ? this.weight3 : raw;
    }

    private final int capacity4 = 4;
    private final int span4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity4 && value <= this.span4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias5 = 3;
    private final int ratio5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String brace5(int value) {
        if (value < this.bias5) {
            return "below";
        }
        if (value == this.bias5) {
            return "lower-bound";
        }
        if (value < this.ratio5) {
            return "within";
        }
        if (value == this.ratio5) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias5Bound() {
        return this.bias5;
    }

    public int ratio5Bound() {
        return this.ratio5;
    }

    private final int margin6 = 3;
    private int offset6;
    private boolean drift6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper6() {
        if (this.drift6) {
            return false;
        }
        this.offset6++;
        if (this.offset6 >= this.margin6) {
            this.drift6 = true;
        }
        return true;
    }

    public int offset6Count() {
        return this.offset6;
    }

    private final int weight7 = 27;
    private int threshold7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile7(int value) {
        if (value < 0) {
            return this.threshold7;
        }
        if (this.threshold7 + value > this.weight7) {
            this.threshold7 = this.weight7;
        } else {
            this.threshold7 += value;
        }
        return this.threshold7;
    }

    public int threshold7Value() {
        return this.threshold7;
    }

    private final double tally8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally8 ? this.tally8 : raw;
    }

    private final int ratio9 = 4;
    private final int cadence9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio9 && value <= this.cadence9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold10 = 4;
    private final int depth10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist10(int value) {
        if (value < this.threshold10) {
            return "below";
        }
        if (value == this.threshold10) {
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

    public int threshold10Bound() {
        return this.threshold10;
    }

    public int depth10Bound() {
        return this.depth10;
    }
}
