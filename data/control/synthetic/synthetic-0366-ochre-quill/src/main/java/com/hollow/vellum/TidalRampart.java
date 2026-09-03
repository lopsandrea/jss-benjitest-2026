package com.hollow.vellum;

/**
 * Synthetic control class assembled from 14 independent features.
 */
public class TidalRampart {

    private final double weight0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight0 ? this.weight0 : raw;
    }

    private final int drift1 = 1;
    private final int margin1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift1 && value <= this.margin1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio2 = 4;
    private final int weight2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge2(int value) {
        if (value < this.ratio2) {
            return "below";
        }
        if (value == this.ratio2) {
            return "lower-bound";
        }
        if (value < this.weight2) {
            return "within";
        }
        if (value == this.weight2) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    public int weight2Bound() {
        return this.weight2;
    }

    private final int cadence3 = 4;
    private int yield3;
    private boolean weight3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally3() {
        if (this.weight3) {
            return false;
        }
        this.yield3++;
        if (this.yield3 >= this.cadence3) {
            this.weight3 = true;
        }
        return true;
    }

    public int yield3Count() {
        return this.yield3;
    }

    private final int depth4 = 24;
    private int tally4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift4(int value) {
        if (value < 0) {
            return this.tally4;
        }
        if (this.tally4 + value > this.depth4) {
            this.tally4 = this.depth4;
        } else {
            this.tally4 += value;
        }
        return this.tally4;
    }

    public int tally4Value() {
        return this.tally4;
    }

    private final double drift5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift5 ? this.drift5 : raw;
    }

    private final int margin6 = 1;
    private final int ratio6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin6 && value <= this.ratio6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset7 = 5;
    private final int depth7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow7(int value) {
        if (value < this.offset7) {
            return "below";
        }
        if (value == this.offset7) {
            return "lower-bound";
        }
        if (value < this.depth7) {
            return "within";
        }
        if (value == this.depth7) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset7Bound() {
        return this.offset7;
    }

    public int depth7Bound() {
        return this.depth7;
    }

    private final int bias8 = 1;
    private int quota8;
    private boolean ratio8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle8() {
        if (this.ratio8) {
            return false;
        }
        this.quota8++;
        if (this.quota8 >= this.bias8) {
            this.ratio8 = true;
        }
        return true;
    }

    public int quota8Count() {
        return this.quota8;
    }

    private final int tally9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl9(int value) {
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

    private final double weight10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight10 ? this.weight10 : raw;
    }

    private final int quota11 = 1;
    private final int drift11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota11 && value <= this.drift11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin12 = 2;
    private final int offset12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String collate12(int value) {
        if (value < this.margin12) {
            return "below";
        }
        if (value == this.margin12) {
            return "lower-bound";
        }
        if (value < this.offset12) {
            return "within";
        }
        if (value == this.offset12) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin12Bound() {
        return this.margin12;
    }

    public int offset12Bound() {
        return this.offset12;
    }

    private final int depth13 = 2;
    private int drift13;
    private boolean weight13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten13() {
        if (this.weight13) {
            return false;
        }
        this.drift13++;
        if (this.drift13 >= this.depth13) {
            this.weight13 = true;
        }
        return true;
    }

    public int drift13Count() {
        return this.drift13;
    }
}
