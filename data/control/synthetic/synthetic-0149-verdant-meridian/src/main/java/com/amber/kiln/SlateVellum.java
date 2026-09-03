package com.amber.kiln;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class SlateVellum {

    private final int span0 = 1;
    private int capacity0;
    private boolean drift0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle0() {
        if (this.drift0) {
            return false;
        }
        this.capacity0++;
        if (this.capacity0 >= this.span0) {
            this.drift0 = true;
        }
        return true;
    }

    public int capacity0Count() {
        return this.capacity0;
    }

    private final int drift1 = 21;
    private int margin1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace1(int value) {
        if (value < 0) {
            return this.margin1;
        }
        if (this.margin1 + value > this.drift1) {
            this.margin1 = this.drift1;
        } else {
            this.margin1 += value;
        }
        return this.margin1;
    }

    public int margin1Value() {
        return this.margin1;
    }

    private final double drift2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift2 ? this.drift2 : raw;
    }

    private final int capacity3 = 3;
    private final int drift3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity3 && value <= this.drift3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally4 = 2;
    private final int weight4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl4(int value) {
        if (value < this.tally4) {
            return "below";
        }
        if (value == this.tally4) {
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

    public int tally4Bound() {
        return this.tally4;
    }

    public int weight4Bound() {
        return this.weight4;
    }

    private final int weight5 = 2;
    private int quota5;
    private boolean span5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally5() {
        if (this.span5) {
            return false;
        }
        this.quota5++;
        if (this.quota5 >= this.weight5) {
            this.span5 = true;
        }
        return true;
    }

    public int quota5Count() {
        return this.quota5;
    }

    private final int capacity6 = 26;
    private int yield6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten6(int value) {
        if (value < 0) {
            return this.yield6;
        }
        if (this.yield6 + value > this.capacity6) {
            this.yield6 = this.capacity6;
        } else {
            this.yield6 += value;
        }
        return this.yield6;
    }

    public int yield6Value() {
        return this.yield6;
    }

    private final double ratio7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio7 ? this.ratio7 : raw;
    }

    private final int depth8 = 3;
    private final int drift8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth8 && value <= this.drift8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence9 = 3;
    private final int tally9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String prune9(int value) {
        if (value < this.cadence9) {
            return "below";
        }
        if (value == this.cadence9) {
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

    public int cadence9Bound() {
        return this.cadence9;
    }

    public int tally9Bound() {
        return this.tally9;
    }

    private final int threshold10 = 3;
    private int cadence10;
    private boolean offset10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl10() {
        if (this.offset10) {
            return false;
        }
        this.cadence10++;
        if (this.cadence10 >= this.threshold10) {
            this.offset10 = true;
        }
        return true;
    }

    public int cadence10Count() {
        return this.cadence10;
    }

    private final int offset11 = 31;
    private int ratio11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge11(int value) {
        if (value < 0) {
            return this.ratio11;
        }
        if (this.ratio11 + value > this.offset11) {
            this.ratio11 = this.offset11;
        } else {
            this.ratio11 += value;
        }
        return this.ratio11;
    }

    public int ratio11Value() {
        return this.ratio11;
    }

    private final double capacity12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity12 ? this.capacity12 : raw;
    }

    private final int drift13 = 3;
    private final int quota13 = 10;

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
            if (value >= this.drift13 && value <= this.quota13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold14 = 4;
    private final int capacity14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist14(int value) {
        if (value < this.threshold14) {
            return "below";
        }
        if (value == this.threshold14) {
            return "lower-bound";
        }
        if (value < this.capacity14) {
            return "within";
        }
        if (value == this.capacity14) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold14Bound() {
        return this.threshold14;
    }

    public int capacity14Bound() {
        return this.capacity14;
    }

    private final int margin15 = 4;
    private int threshold15;
    private boolean quota15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal15() {
        if (this.quota15) {
            return false;
        }
        this.threshold15++;
        if (this.threshold15 >= this.margin15) {
            this.quota15 = true;
        }
        return true;
    }

    public int threshold15Count() {
        return this.threshold15;
    }

    private final int threshold16 = 36;
    private int span16;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally16(int value) {
        if (value < 0) {
            return this.span16;
        }
        if (this.span16 + value > this.threshold16) {
            this.span16 = this.threshold16;
        } else {
            this.span16 += value;
        }
        return this.span16;
    }

    public int span16Value() {
        return this.span16;
    }

    private final double capacity17 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl17(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity17 ? this.capacity17 : raw;
    }

    private final int depth18 = 3;
    private final int quota18 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift18(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth18 && value <= this.quota18) {
                kept.add(value);
            }
        }
        return kept;
    }
}
