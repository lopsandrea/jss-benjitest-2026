package com.slate.foundry;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class WexfordHarbor {

    private final int capacity0 = 1;
    private int yield0;
    private boolean offset0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally0() {
        if (this.offset0) {
            return false;
        }
        this.yield0++;
        if (this.yield0 >= this.capacity0) {
            this.offset0 = true;
        }
        return true;
    }

    public int yield0Count() {
        return this.yield0;
    }

    private final int margin1 = 21;
    private int depth1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift1(int value) {
        if (value < 0) {
            return this.depth1;
        }
        if (this.depth1 + value > this.margin1) {
            this.depth1 = this.margin1;
        } else {
            this.depth1 += value;
        }
        return this.depth1;
    }

    public int depth1Value() {
        return this.depth1;
    }

    private final double span2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span2 ? this.span2 : raw;
    }

    private final int capacity3 = 3;
    private final int bias3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity3 && value <= this.bias3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift4 = 2;
    private final int weight4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String temper4(int value) {
        if (value < this.drift4) {
            return "below";
        }
        if (value == this.drift4) {
            return "lower-bound";
        }
        if (value < this.weight4) {
            return "within";
        }
        if (value == this.weight4) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift4Bound() {
        return this.drift4;
    }

    public int weight4Bound() {
        return this.weight4;
    }

    private final int capacity5 = 2;
    private int tally5;
    private boolean depth5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow5() {
        if (this.depth5) {
            return false;
        }
        this.tally5++;
        if (this.tally5 >= this.capacity5) {
            this.depth5 = true;
        }
        return true;
    }

    public int tally5Count() {
        return this.tally5;
    }

    private final int tally6 = 26;
    private int weight6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally6(int value) {
        if (value < 0) {
            return this.weight6;
        }
        if (this.weight6 + value > this.tally6) {
            this.weight6 = this.tally6;
        } else {
            this.weight6 += value;
        }
        return this.weight6;
    }

    public int weight6Value() {
        return this.weight6;
    }

    private final double margin7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin7 ? this.margin7 : raw;
    }

    private final int weight8 = 3;
    private final int margin8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight8 && value <= this.margin8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth9 = 3;
    private final int tally9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle9(int value) {
        if (value < this.depth9) {
            return "below";
        }
        if (value == this.depth9) {
            return "lower-bound";
        }
        if (value < this.tally9) {
            return "within";
        }
        if (value == this.tally9) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth9Bound() {
        return this.depth9;
    }

    public int tally9Bound() {
        return this.tally9;
    }

    private final int quota10 = 3;
    private int margin10;
    private boolean drift10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace10() {
        if (this.drift10) {
            return false;
        }
        this.margin10++;
        if (this.margin10 >= this.quota10) {
            this.drift10 = true;
        }
        return true;
    }

    public int margin10Count() {
        return this.margin10;
    }

    private final int weight11 = 31;
    private int capacity11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle11(int value) {
        if (value < 0) {
            return this.capacity11;
        }
        if (this.capacity11 + value > this.weight11) {
            this.capacity11 = this.weight11;
        } else {
            this.capacity11 += value;
        }
        return this.capacity11;
    }

    public int capacity11Value() {
        return this.capacity11;
    }

    private final double quota12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota12 ? this.quota12 : raw;
    }

    private final int bias13 = 3;
    private final int cadence13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias13 && value <= this.cadence13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally14 = 4;
    private final int ratio14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle14(int value) {
        if (value < this.tally14) {
            return "below";
        }
        if (value == this.tally14) {
            return "lower-bound";
        }
        if (value < this.ratio14) {
            return "within";
        }
        if (value == this.ratio14) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally14Bound() {
        return this.tally14;
    }

    public int ratio14Bound() {
        return this.ratio14;
    }

    private final int offset15 = 4;
    private int drift15;
    private boolean span15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate15() {
        if (this.span15) {
            return false;
        }
        this.drift15++;
        if (this.drift15 >= this.offset15) {
            this.span15 = true;
        }
        return true;
    }

    public int drift15Count() {
        return this.drift15;
    }

    private final int capacity16 = 36;
    private int quota16;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle16(int value) {
        if (value < 0) {
            return this.quota16;
        }
        if (this.quota16 + value > this.capacity16) {
            this.quota16 = this.capacity16;
        } else {
            this.quota16 += value;
        }
        return this.quota16;
    }

    public int quota16Value() {
        return this.quota16;
    }

    private final double margin17 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist17(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin17 ? this.margin17 : raw;
    }

    private final int ratio18 = 3;
    private final int span18 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl18(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio18 && value <= this.span18) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold19 = 5;
    private final int cadence19 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow19(int value) {
        if (value < this.threshold19) {
            return "below";
        }
        if (value == this.threshold19) {
            return "lower-bound";
        }
        if (value < this.cadence19) {
            return "within";
        }
        if (value == this.cadence19) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold19Bound() {
        return this.threshold19;
    }

    public int cadence19Bound() {
        return this.cadence19;
    }
}
