package com.hollow.quill;

/**
 * Synthetic control class assembled from 25 independent features.
 */
public class BrambleMeridianII {

    private final double capacity0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity0 ? this.capacity0 : raw;
    }

    private final int depth1 = 1;
    private final int cadence1 = 7;

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
            if (value >= this.depth1 && value <= this.cadence1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold2 = 4;
    private final int depth2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift2(int value) {
        if (value < this.threshold2) {
            return "below";
        }
        if (value == this.threshold2) {
            return "lower-bound";
        }
        if (value < this.depth2) {
            return "within";
        }
        if (value == this.depth2) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold2Bound() {
        return this.threshold2;
    }

    public int depth2Bound() {
        return this.depth2;
    }

    private final int drift3 = 4;
    private int threshold3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow3() {
        if (this.yield3) {
            return false;
        }
        this.threshold3++;
        if (this.threshold3 >= this.drift3) {
            this.yield3 = true;
        }
        return true;
    }

    public int threshold3Count() {
        return this.threshold3;
    }

    private final int quota4 = 24;
    private int threshold4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle4(int value) {
        if (value < 0) {
            return this.threshold4;
        }
        if (this.threshold4 + value > this.quota4) {
            this.threshold4 = this.quota4;
        } else {
            this.threshold4 += value;
        }
        return this.threshold4;
    }

    public int threshold4Value() {
        return this.threshold4;
    }

    private final double margin5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin5 ? this.margin5 : raw;
    }

    private final int tally6 = 1;
    private final int offset6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally6 && value <= this.offset6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth7 = 5;
    private final int capacity7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally7(int value) {
        if (value < this.depth7) {
            return "below";
        }
        if (value == this.depth7) {
            return "lower-bound";
        }
        if (value < this.capacity7) {
            return "within";
        }
        if (value == this.capacity7) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth7Bound() {
        return this.depth7;
    }

    public int capacity7Bound() {
        return this.capacity7;
    }

    private final int margin8 = 1;
    private int weight8;
    private boolean bias8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl8() {
        if (this.bias8) {
            return false;
        }
        this.weight8++;
        if (this.weight8 >= this.margin8) {
            this.bias8 = true;
        }
        return true;
    }

    public int weight8Count() {
        return this.weight8;
    }

    private final int weight9 = 29;
    private int span9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper9(int value) {
        if (value < 0) {
            return this.span9;
        }
        if (this.span9 + value > this.weight9) {
            this.span9 = this.weight9;
        } else {
            this.span9 += value;
        }
        return this.span9;
    }

    public int span9Value() {
        return this.span9;
    }

    private final double bias10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias10 ? this.bias10 : raw;
    }

    private final int margin11 = 1;
    private final int span11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin11 && value <= this.span11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity12 = 2;
    private final int span12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle12(int value) {
        if (value < this.capacity12) {
            return "below";
        }
        if (value == this.capacity12) {
            return "lower-bound";
        }
        if (value < this.span12) {
            return "within";
        }
        if (value == this.span12) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity12Bound() {
        return this.capacity12;
    }

    public int span12Bound() {
        return this.span12;
    }

    private final int quota13 = 2;
    private int drift13;
    private boolean offset13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune13() {
        if (this.offset13) {
            return false;
        }
        this.drift13++;
        if (this.drift13 >= this.quota13) {
            this.offset13 = true;
        }
        return true;
    }

    public int drift13Count() {
        return this.drift13;
    }

    private final int ratio14 = 34;
    private int margin14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle14(int value) {
        if (value < 0) {
            return this.margin14;
        }
        if (this.margin14 + value > this.ratio14) {
            this.margin14 = this.ratio14;
        } else {
            this.margin14 += value;
        }
        return this.margin14;
    }

    public int margin14Value() {
        return this.margin14;
    }

    private final double offset15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset15 ? this.offset15 : raw;
    }

    private final int margin16 = 1;
    private final int span16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin16 && value <= this.span16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth17 = 3;
    private final int ratio17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist17(int value) {
        if (value < this.depth17) {
            return "below";
        }
        if (value == this.depth17) {
            return "lower-bound";
        }
        if (value < this.ratio17) {
            return "within";
        }
        if (value == this.ratio17) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth17Bound() {
        return this.depth17;
    }

    public int ratio17Bound() {
        return this.ratio17;
    }

    private final int depth18 = 3;
    private int threshold18;
    private boolean offset18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle18() {
        if (this.offset18) {
            return false;
        }
        this.threshold18++;
        if (this.threshold18 >= this.depth18) {
            this.offset18 = true;
        }
        return true;
    }

    public int threshold18Count() {
        return this.threshold18;
    }

    private final int quota19 = 39;
    private int bias19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune19(int value) {
        if (value < 0) {
            return this.bias19;
        }
        if (this.bias19 + value > this.quota19) {
            this.bias19 = this.quota19;
        } else {
            this.bias19 += value;
        }
        return this.bias19;
    }

    public int bias19Value() {
        return this.bias19;
    }

    private final double ratio20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio20 ? this.ratio20 : raw;
    }

    private final int drift21 = 1;
    private final int ratio21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift21 && value <= this.ratio21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias22 = 4;
    private final int weight22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle22(int value) {
        if (value < this.bias22) {
            return "below";
        }
        if (value == this.bias22) {
            return "lower-bound";
        }
        if (value < this.weight22) {
            return "within";
        }
        if (value == this.weight22) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias22Bound() {
        return this.bias22;
    }

    public int weight22Bound() {
        return this.weight22;
    }

    private final int capacity23 = 4;
    private int bias23;
    private boolean cadence23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate23() {
        if (this.cadence23) {
            return false;
        }
        this.bias23++;
        if (this.bias23 >= this.capacity23) {
            this.cadence23 = true;
        }
        return true;
    }

    public int bias23Count() {
        return this.bias23;
    }

    private final int ratio24 = 44;
    private int capacity24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper24(int value) {
        if (value < 0) {
            return this.capacity24;
        }
        if (this.capacity24 + value > this.ratio24) {
            this.capacity24 = this.ratio24;
        } else {
            this.capacity24 += value;
        }
        return this.capacity24;
    }

    public int capacity24Value() {
        return this.capacity24;
    }
}
