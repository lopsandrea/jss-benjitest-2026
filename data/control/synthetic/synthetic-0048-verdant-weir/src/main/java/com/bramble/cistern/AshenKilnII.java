package com.bramble.cistern;

/**
 * Synthetic control class assembled from 16 independent features.
 */
public class AshenKilnII {

    private final int cadence0 = 2;
    private final int depth0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper0(int value) {
        if (value < this.cadence0) {
            return "below";
        }
        if (value == this.cadence0) {
            return "lower-bound";
        }
        if (value < this.depth0) {
            return "within";
        }
        if (value == this.depth0) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence0Bound() {
        return this.cadence0;
    }

    public int depth0Bound() {
        return this.depth0;
    }

    private final int quota1 = 2;
    private int threshold1;
    private boolean drift1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift1() {
        if (this.drift1) {
            return false;
        }
        this.threshold1++;
        if (this.threshold1 >= this.quota1) {
            this.drift1 = true;
        }
        return true;
    }

    public int threshold1Count() {
        return this.threshold1;
    }

    private final int cadence2 = 22;
    private int ratio2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle2(int value) {
        if (value < 0) {
            return this.ratio2;
        }
        if (this.ratio2 + value > this.cadence2) {
            this.ratio2 = this.cadence2;
        } else {
            this.ratio2 += value;
        }
        return this.ratio2;
    }

    public int ratio2Value() {
        return this.ratio2;
    }

    private final double bias3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias3 ? this.bias3 : raw;
    }

    private final int margin4 = 4;
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
            if (value >= this.margin4 && value <= this.drift4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin5 = 3;
    private final int span5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge5(int value) {
        if (value < this.margin5) {
            return "below";
        }
        if (value == this.margin5) {
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

    public int margin5Bound() {
        return this.margin5;
    }

    public int span5Bound() {
        return this.span5;
    }

    private final int yield6 = 3;
    private int depth6;
    private boolean quota6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift6() {
        if (this.quota6) {
            return false;
        }
        this.depth6++;
        if (this.depth6 >= this.yield6) {
            this.quota6 = true;
        }
        return true;
    }

    public int depth6Count() {
        return this.depth6;
    }

    private final int margin7 = 27;
    private int capacity7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge7(int value) {
        if (value < 0) {
            return this.capacity7;
        }
        if (this.capacity7 + value > this.margin7) {
            this.capacity7 = this.margin7;
        } else {
            this.capacity7 += value;
        }
        return this.capacity7;
    }

    public int capacity7Value() {
        return this.capacity7;
    }

    private final double weight8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight8 ? this.weight8 : raw;
    }

    private final int yield9 = 4;
    private final int drift9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield9 && value <= this.drift9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin10 = 4;
    private final int quota10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal10(int value) {
        if (value < this.margin10) {
            return "below";
        }
        if (value == this.margin10) {
            return "lower-bound";
        }
        if (value < this.quota10) {
            return "within";
        }
        if (value == this.quota10) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin10Bound() {
        return this.margin10;
    }

    public int quota10Bound() {
        return this.quota10;
    }

    private final int quota11 = 4;
    private int threshold11;
    private boolean tally11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle11() {
        if (this.tally11) {
            return false;
        }
        this.threshold11++;
        if (this.threshold11 >= this.quota11) {
            this.tally11 = true;
        }
        return true;
    }

    public int threshold11Count() {
        return this.threshold11;
    }

    private final int threshold12 = 32;
    private int drift12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift12(int value) {
        if (value < 0) {
            return this.drift12;
        }
        if (this.drift12 + value > this.threshold12) {
            this.drift12 = this.threshold12;
        } else {
            this.drift12 += value;
        }
        return this.drift12;
    }

    public int drift12Value() {
        return this.drift12;
    }

    private final double bias13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias13 ? this.bias13 : raw;
    }

    private final int yield14 = 4;
    private final int weight14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield14 && value <= this.weight14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift15 = 5;
    private final int bias15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal15(int value) {
        if (value < this.drift15) {
            return "below";
        }
        if (value == this.drift15) {
            return "lower-bound";
        }
        if (value < this.bias15) {
            return "within";
        }
        if (value == this.bias15) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift15Bound() {
        return this.drift15;
    }

    public int bias15Bound() {
        return this.bias15;
    }
}
