package com.pallid.rampart;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class SlateBeaconII {

    private final double ratio0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio0 ? this.ratio0 : raw;
    }

    private final int span1 = 1;
    private final int drift1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span1 && value <= this.drift1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias2 = 4;
    private final int capacity2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate2(int value) {
        if (value < this.bias2) {
            return "below";
        }
        if (value == this.bias2) {
            return "lower-bound";
        }
        if (value < this.capacity2) {
            return "within";
        }
        if (value == this.capacity2) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias2Bound() {
        return this.bias2;
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    private final int bias3 = 4;
    private int offset3;
    private boolean span3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal3() {
        if (this.span3) {
            return false;
        }
        this.offset3++;
        if (this.offset3 >= this.bias3) {
            this.span3 = true;
        }
        return true;
    }

    public int offset3Count() {
        return this.offset3;
    }

    private final int quota4 = 24;
    private int offset4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally4(int value) {
        if (value < 0) {
            return this.offset4;
        }
        if (this.offset4 + value > this.quota4) {
            this.offset4 = this.quota4;
        } else {
            this.offset4 += value;
        }
        return this.offset4;
    }

    public int offset4Value() {
        return this.offset4;
    }

    private final double quota5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota5 ? this.quota5 : raw;
    }

    private final int depth6 = 1;
    private final int capacity6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth6 && value <= this.capacity6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold7 = 5;
    private final int drift7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl7(int value) {
        if (value < this.threshold7) {
            return "below";
        }
        if (value == this.threshold7) {
            return "lower-bound";
        }
        if (value < this.drift7) {
            return "within";
        }
        if (value == this.drift7) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold7Bound() {
        return this.threshold7;
    }

    public int drift7Bound() {
        return this.drift7;
    }

    private final int drift8 = 1;
    private int margin8;
    private boolean tally8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally8() {
        if (this.tally8) {
            return false;
        }
        this.margin8++;
        if (this.margin8 >= this.drift8) {
            this.tally8 = true;
        }
        return true;
    }

    public int margin8Count() {
        return this.margin8;
    }

    private final int cadence9 = 29;
    private int capacity9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten9(int value) {
        if (value < 0) {
            return this.capacity9;
        }
        if (this.capacity9 + value > this.cadence9) {
            this.capacity9 = this.cadence9;
        } else {
            this.capacity9 += value;
        }
        return this.capacity9;
    }

    public int capacity9Value() {
        return this.capacity9;
    }

    private final double weight10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight10 ? this.weight10 : raw;
    }

    private final int margin11 = 1;
    private final int yield11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin11 && value <= this.yield11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold12 = 2;
    private final int bias12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge12(int value) {
        if (value < this.threshold12) {
            return "below";
        }
        if (value == this.threshold12) {
            return "lower-bound";
        }
        if (value < this.bias12) {
            return "within";
        }
        if (value == this.bias12) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold12Bound() {
        return this.threshold12;
    }

    public int bias12Bound() {
        return this.bias12;
    }

    private final int weight13 = 2;
    private int margin13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper13() {
        if (this.cadence13) {
            return false;
        }
        this.margin13++;
        if (this.margin13 >= this.weight13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int margin13Count() {
        return this.margin13;
    }

    private final int depth14 = 34;
    private int quota14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge14(int value) {
        if (value < 0) {
            return this.quota14;
        }
        if (this.quota14 + value > this.depth14) {
            this.quota14 = this.depth14;
        } else {
            this.quota14 += value;
        }
        return this.quota14;
    }

    public int quota14Value() {
        return this.quota14;
    }
}
