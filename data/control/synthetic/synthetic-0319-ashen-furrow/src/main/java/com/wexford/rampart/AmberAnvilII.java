package com.wexford.rampart;

/**
 * Synthetic control class assembled from 26 independent features.
 */
public class AmberAnvilII {

    private final int margin0 = 1;
    private int ratio0;
    private boolean bias0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten0() {
        if (this.bias0) {
            return false;
        }
        this.ratio0++;
        if (this.ratio0 >= this.margin0) {
            this.bias0 = true;
        }
        return true;
    }

    public int ratio0Count() {
        return this.ratio0;
    }

    private final int capacity1 = 21;
    private int offset1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper1(int value) {
        if (value < 0) {
            return this.offset1;
        }
        if (this.offset1 + value > this.capacity1) {
            this.offset1 = this.capacity1;
        } else {
            this.offset1 += value;
        }
        return this.offset1;
    }

    public int offset1Value() {
        return this.offset1;
    }

    private final double tally2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally2 ? this.tally2 : raw;
    }

    private final int tally3 = 3;
    private final int bias3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally3 && value <= this.bias3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin4 = 2;
    private final int tally4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String brace4(int value) {
        if (value < this.margin4) {
            return "below";
        }
        if (value == this.margin4) {
            return "lower-bound";
        }
        if (value < this.tally4) {
            return "within";
        }
        if (value == this.tally4) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin4Bound() {
        return this.margin4;
    }

    public int tally4Bound() {
        return this.tally4;
    }

    private final int ratio5 = 2;
    private int margin5;
    private boolean tally5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune5() {
        if (this.tally5) {
            return false;
        }
        this.margin5++;
        if (this.margin5 >= this.ratio5) {
            this.tally5 = true;
        }
        return true;
    }

    public int margin5Count() {
        return this.margin5;
    }

    private final int quota6 = 26;
    private int bias6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge6(int value) {
        if (value < 0) {
            return this.bias6;
        }
        if (this.bias6 + value > this.quota6) {
            this.bias6 = this.quota6;
        } else {
            this.bias6 += value;
        }
        return this.bias6;
    }

    public int bias6Value() {
        return this.bias6;
    }

    private final double ratio7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio7 ? this.ratio7 : raw;
    }

    private final int ratio8 = 3;
    private final int threshold8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio8 && value <= this.threshold8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally9 = 3;
    private final int yield9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift9(int value) {
        if (value < this.tally9) {
            return "below";
        }
        if (value == this.tally9) {
            return "lower-bound";
        }
        if (value < this.yield9) {
            return "within";
        }
        if (value == this.yield9) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally9Bound() {
        return this.tally9;
    }

    public int yield9Bound() {
        return this.yield9;
    }

    private final int threshold10 = 3;
    private int quota10;
    private boolean depth10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl10() {
        if (this.depth10) {
            return false;
        }
        this.quota10++;
        if (this.quota10 >= this.threshold10) {
            this.depth10 = true;
        }
        return true;
    }

    public int quota10Count() {
        return this.quota10;
    }

    private final int bias11 = 31;
    private int tally11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist11(int value) {
        if (value < 0) {
            return this.tally11;
        }
        if (this.tally11 + value > this.bias11) {
            this.tally11 = this.bias11;
        } else {
            this.tally11 += value;
        }
        return this.tally11;
    }

    public int tally11Value() {
        return this.tally11;
    }

    private final double margin12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin12 ? this.margin12 : raw;
    }

    private final int offset13 = 3;
    private final int quota13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset13 && value <= this.quota13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight14 = 4;
    private final int drift14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal14(int value) {
        if (value < this.weight14) {
            return "below";
        }
        if (value == this.weight14) {
            return "lower-bound";
        }
        if (value < this.drift14) {
            return "within";
        }
        if (value == this.drift14) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight14Bound() {
        return this.weight14;
    }

    public int drift14Bound() {
        return this.drift14;
    }

    private final int drift15 = 4;
    private int margin15;
    private boolean cadence15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally15() {
        if (this.cadence15) {
            return false;
        }
        this.margin15++;
        if (this.margin15 >= this.drift15) {
            this.cadence15 = true;
        }
        return true;
    }

    public int margin15Count() {
        return this.margin15;
    }

    private final int quota16 = 36;
    private int drift16;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge16(int value) {
        if (value < 0) {
            return this.drift16;
        }
        if (this.drift16 + value > this.quota16) {
            this.drift16 = this.quota16;
        } else {
            this.drift16 += value;
        }
        return this.drift16;
    }

    public int drift16Value() {
        return this.drift16;
    }

    private final double drift17 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge17(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift17 ? this.drift17 : raw;
    }

    private final int threshold18 = 3;
    private final int depth18 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune18(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold18 && value <= this.depth18) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight19 = 5;
    private final int drift19 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten19(int value) {
        if (value < this.weight19) {
            return "below";
        }
        if (value == this.weight19) {
            return "lower-bound";
        }
        if (value < this.drift19) {
            return "within";
        }
        if (value == this.drift19) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight19Bound() {
        return this.weight19;
    }

    public int drift19Bound() {
        return this.drift19;
    }

    private final int weight20 = 1;
    private int ratio20;
    private boolean quota20;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten20() {
        if (this.quota20) {
            return false;
        }
        this.ratio20++;
        if (this.ratio20 >= this.weight20) {
            this.quota20 = true;
        }
        return true;
    }

    public int ratio20Count() {
        return this.ratio20;
    }

    private final int yield21 = 41;
    private int threshold21;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally21(int value) {
        if (value < 0) {
            return this.threshold21;
        }
        if (this.threshold21 + value > this.yield21) {
            this.threshold21 = this.yield21;
        } else {
            this.threshold21 += value;
        }
        return this.threshold21;
    }

    public int threshold21Value() {
        return this.threshold21;
    }

    private final double span22 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper22(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span22 ? this.span22 : raw;
    }

    private final int tally23 = 3;
    private final int margin23 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl23(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally23 && value <= this.margin23) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin24 = 2;
    private final int depth24 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist24(int value) {
        if (value < this.margin24) {
            return "below";
        }
        if (value == this.margin24) {
            return "lower-bound";
        }
        if (value < this.depth24) {
            return "within";
        }
        if (value == this.depth24) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin24Bound() {
        return this.margin24;
    }

    public int depth24Bound() {
        return this.depth24;
    }

    private final int span25 = 2;
    private int depth25;
    private boolean quota25;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate25() {
        if (this.quota25) {
            return false;
        }
        this.depth25++;
        if (this.depth25 >= this.span25) {
            this.quota25 = true;
        }
        return true;
    }

    public int depth25Count() {
        return this.depth25;
    }
}
