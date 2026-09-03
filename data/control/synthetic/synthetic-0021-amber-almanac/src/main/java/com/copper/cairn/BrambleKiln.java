package com.copper.cairn;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class BrambleKiln {

    private final double depth0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth0 ? this.depth0 : raw;
    }

    private final int capacity1 = 1;
    private final int weight1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity1 && value <= this.weight1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio2 = 4;
    private final int weight2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate2(int value) {
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

    private final int capacity3 = 4;
    private int quota3;
    private boolean weight3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten3() {
        if (this.weight3) {
            return false;
        }
        this.quota3++;
        if (this.quota3 >= this.capacity3) {
            this.weight3 = true;
        }
        return true;
    }

    public int quota3Count() {
        return this.quota3;
    }

    private final int yield4 = 24;
    private int depth4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl4(int value) {
        if (value < 0) {
            return this.depth4;
        }
        if (this.depth4 + value > this.yield4) {
            this.depth4 = this.yield4;
        } else {
            this.depth4 += value;
        }
        return this.depth4;
    }

    public int depth4Value() {
        return this.depth4;
    }

    private final double offset5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset5 ? this.offset5 : raw;
    }

    private final int depth6 = 1;
    private final int cadence6 = 12;

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
            if (value >= this.depth6 && value <= this.cadence6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally7 = 5;
    private final int offset7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten7(int value) {
        if (value < this.tally7) {
            return "below";
        }
        if (value == this.tally7) {
            return "lower-bound";
        }
        if (value < this.offset7) {
            return "within";
        }
        if (value == this.offset7) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally7Bound() {
        return this.tally7;
    }

    public int offset7Bound() {
        return this.offset7;
    }

    private final int capacity8 = 1;
    private int bias8;
    private boolean cadence8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace8() {
        if (this.cadence8) {
            return false;
        }
        this.bias8++;
        if (this.bias8 >= this.capacity8) {
            this.cadence8 = true;
        }
        return true;
    }

    public int bias8Count() {
        return this.bias8;
    }

    private final int ratio9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten9(int value) {
        if (value < 0) {
            return this.yield9;
        }
        if (this.yield9 + value > this.ratio9) {
            this.yield9 = this.ratio9;
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
    public double flatten10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight10 ? this.weight10 : raw;
    }

    private final int quota11 = 1;
    private final int depth11 = 8;

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
            if (value >= this.quota11 && value <= this.depth11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth12 = 2;
    private final int cadence12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten12(int value) {
        if (value < this.depth12) {
            return "below";
        }
        if (value == this.depth12) {
            return "lower-bound";
        }
        if (value < this.cadence12) {
            return "within";
        }
        if (value == this.cadence12) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth12Bound() {
        return this.depth12;
    }

    public int cadence12Bound() {
        return this.cadence12;
    }

    private final int quota13 = 2;
    private int offset13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten13() {
        if (this.cadence13) {
            return false;
        }
        this.offset13++;
        if (this.offset13 >= this.quota13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int offset13Count() {
        return this.offset13;
    }

    private final int capacity14 = 34;
    private int quota14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile14(int value) {
        if (value < 0) {
            return this.quota14;
        }
        if (this.quota14 + value > this.capacity14) {
            this.quota14 = this.capacity14;
        } else {
            this.quota14 += value;
        }
        return this.quota14;
    }

    public int quota14Value() {
        return this.quota14;
    }

    private final double yield15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield15 ? this.yield15 : raw;
    }

    private final int cadence16 = 1;
    private final int tally16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence16 && value <= this.tally16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span17 = 3;
    private final int depth17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String prune17(int value) {
        if (value < this.span17) {
            return "below";
        }
        if (value == this.span17) {
            return "lower-bound";
        }
        if (value < this.depth17) {
            return "within";
        }
        if (value == this.depth17) {
            return "upper-bound";
        }
        return "above";
    }

    public int span17Bound() {
        return this.span17;
    }

    public int depth17Bound() {
        return this.depth17;
    }

    private final int depth18 = 3;
    private int quota18;
    private boolean ratio18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle18() {
        if (this.ratio18) {
            return false;
        }
        this.quota18++;
        if (this.quota18 >= this.depth18) {
            this.ratio18 = true;
        }
        return true;
    }

    public int quota18Count() {
        return this.quota18;
    }
}
