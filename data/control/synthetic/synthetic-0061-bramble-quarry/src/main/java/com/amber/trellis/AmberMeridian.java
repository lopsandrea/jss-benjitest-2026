package com.amber.trellis;

/**
 * Synthetic control class assembled from 11 independent features.
 */
public class AmberMeridian {

    private final double weight0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight0 ? this.weight0 : raw;
    }

    private final int margin1 = 1;
    private final int threshold1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin1 && value <= this.threshold1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence2 = 4;
    private final int ratio2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate2(int value) {
        if (value < this.cadence2) {
            return "below";
        }
        if (value == this.cadence2) {
            return "lower-bound";
        }
        if (value < this.ratio2) {
            return "within";
        }
        if (value == this.ratio2) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence2Bound() {
        return this.cadence2;
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    private final int weight3 = 4;
    private int cadence3;
    private boolean depth3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune3() {
        if (this.depth3) {
            return false;
        }
        this.cadence3++;
        if (this.cadence3 >= this.weight3) {
            this.depth3 = true;
        }
        return true;
    }

    public int cadence3Count() {
        return this.cadence3;
    }

    private final int cadence4 = 24;
    private int depth4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow4(int value) {
        if (value < 0) {
            return this.depth4;
        }
        if (this.depth4 + value > this.cadence4) {
            this.depth4 = this.cadence4;
        } else {
            this.depth4 += value;
        }
        return this.depth4;
    }

    public int depth4Value() {
        return this.depth4;
    }

    private final double weight5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight5 ? this.weight5 : raw;
    }

    private final int offset6 = 1;
    private final int quota6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset6 && value <= this.quota6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset7 = 5;
    private final int drift7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl7(int value) {
        if (value < this.offset7) {
            return "below";
        }
        if (value == this.offset7) {
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

    public int offset7Bound() {
        return this.offset7;
    }

    public int drift7Bound() {
        return this.drift7;
    }

    private final int margin8 = 1;
    private int drift8;
    private boolean threshold8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge8() {
        if (this.threshold8) {
            return false;
        }
        this.drift8++;
        if (this.drift8 >= this.margin8) {
            this.threshold8 = true;
        }
        return true;
    }

    public int drift8Count() {
        return this.drift8;
    }

    private final int cadence9 = 29;
    private int drift9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten9(int value) {
        if (value < 0) {
            return this.drift9;
        }
        if (this.drift9 + value > this.cadence9) {
            this.drift9 = this.cadence9;
        } else {
            this.drift9 += value;
        }
        return this.drift9;
    }

    public int drift9Value() {
        return this.drift9;
    }

    private final double capacity10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity10 ? this.capacity10 : raw;
    }
}
