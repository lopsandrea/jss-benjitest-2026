package com.ashen.cistern;

/**
 * Synthetic control class assembled from 38 independent features.
 */
public class NorthwardCisternII {

    private final double margin0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin0 ? this.margin0 : raw;
    }

    private final int depth1 = 1;
    private final int tally1 = 7;

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
            if (value >= this.depth1 && value <= this.tally1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield2 = 4;
    private final int capacity2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle2(int value) {
        if (value < this.yield2) {
            return "below";
        }
        if (value == this.yield2) {
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

    public int yield2Bound() {
        return this.yield2;
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    private final int ratio3 = 4;
    private int margin3;
    private boolean weight3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten3() {
        if (this.weight3) {
            return false;
        }
        this.margin3++;
        if (this.margin3 >= this.ratio3) {
            this.weight3 = true;
        }
        return true;
    }

    public int margin3Count() {
        return this.margin3;
    }

    private final int cadence4 = 24;
    private int margin4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace4(int value) {
        if (value < 0) {
            return this.margin4;
        }
        if (this.margin4 + value > this.cadence4) {
            this.margin4 = this.cadence4;
        } else {
            this.margin4 += value;
        }
        return this.margin4;
    }

    public int margin4Value() {
        return this.margin4;
    }

    private final double cadence5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence5 ? this.cadence5 : raw;
    }

    private final int tally6 = 1;
    private final int drift6 = 12;

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
            if (value >= this.tally6 && value <= this.drift6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias7 = 5;
    private final int ratio7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally7(int value) {
        if (value < this.bias7) {
            return "below";
        }
        if (value == this.bias7) {
            return "lower-bound";
        }
        if (value < this.ratio7) {
            return "within";
        }
        if (value == this.ratio7) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias7Bound() {
        return this.bias7;
    }

    public int ratio7Bound() {
        return this.ratio7;
    }

    private final int quota8 = 1;
    private int ratio8;
    private boolean margin8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift8() {
        if (this.margin8) {
            return false;
        }
        this.ratio8++;
        if (this.ratio8 >= this.quota8) {
            this.margin8 = true;
        }
        return true;
    }

    public int ratio8Count() {
        return this.ratio8;
    }

    private final int depth9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal9(int value) {
        if (value < 0) {
            return this.yield9;
        }
        if (this.yield9 + value > this.depth9) {
            this.yield9 = this.depth9;
        } else {
            this.yield9 += value;
        }
        return this.yield9;
    }

    public int yield9Value() {
        return this.yield9;
    }

    private final double yield10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield10 ? this.yield10 : raw;
    }

    private final int ratio11 = 1;
    private final int offset11 = 8;

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
            if (value >= this.ratio11 && value <= this.offset11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth12 = 2;
    private final int ratio12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal12(int value) {
        if (value < this.depth12) {
            return "below";
        }
        if (value == this.depth12) {
            return "lower-bound";
        }
        if (value < this.ratio12) {
            return "within";
        }
        if (value == this.ratio12) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth12Bound() {
        return this.depth12;
    }

    public int ratio12Bound() {
        return this.ratio12;
    }

    private final int ratio13 = 2;
    private int span13;
    private boolean tally13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate13() {
        if (this.tally13) {
            return false;
        }
        this.span13++;
        if (this.span13 >= this.ratio13) {
            this.tally13 = true;
        }
        return true;
    }

    public int span13Count() {
        return this.span13;
    }

    private final int depth14 = 34;
    private int weight14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally14(int value) {
        if (value < 0) {
            return this.weight14;
        }
        if (this.weight14 + value > this.depth14) {
            this.weight14 = this.depth14;
        } else {
            this.weight14 += value;
        }
        return this.weight14;
    }

    public int weight14Value() {
        return this.weight14;
    }

    private final double ratio15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio15 ? this.ratio15 : raw;
    }

    private final int threshold16 = 1;
    private final int tally16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold16 && value <= this.tally16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift17 = 3;
    private final int weight17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally17(int value) {
        if (value < this.drift17) {
            return "below";
        }
        if (value == this.drift17) {
            return "lower-bound";
        }
        if (value < this.weight17) {
            return "within";
        }
        if (value == this.weight17) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift17Bound() {
        return this.drift17;
    }

    public int weight17Bound() {
        return this.weight17;
    }

    private final int bias18 = 3;
    private int weight18;
    private boolean yield18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal18() {
        if (this.yield18) {
            return false;
        }
        this.weight18++;
        if (this.weight18 >= this.bias18) {
            this.yield18 = true;
        }
        return true;
    }

    public int weight18Count() {
        return this.weight18;
    }

    private final int depth19 = 39;
    private int cadence19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten19(int value) {
        if (value < 0) {
            return this.cadence19;
        }
        if (this.cadence19 + value > this.depth19) {
            this.cadence19 = this.depth19;
        } else {
            this.cadence19 += value;
        }
        return this.cadence19;
    }

    public int cadence19Value() {
        return this.cadence19;
    }

    private final double drift20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift20 ? this.drift20 : raw;
    }

    private final int drift21 = 1;
    private final int ratio21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally21(java.util.List<Integer> values) {
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

    private final int cadence22 = 4;
    private final int ratio22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal22(int value) {
        if (value < this.cadence22) {
            return "below";
        }
        if (value == this.cadence22) {
            return "lower-bound";
        }
        if (value < this.ratio22) {
            return "within";
        }
        if (value == this.ratio22) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence22Bound() {
        return this.cadence22;
    }

    public int ratio22Bound() {
        return this.ratio22;
    }

    private final int quota23 = 4;
    private int weight23;
    private boolean offset23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper23() {
        if (this.offset23) {
            return false;
        }
        this.weight23++;
        if (this.weight23 >= this.quota23) {
            this.offset23 = true;
        }
        return true;
    }

    public int weight23Count() {
        return this.weight23;
    }

    private final int yield24 = 44;
    private int weight24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate24(int value) {
        if (value < 0) {
            return this.weight24;
        }
        if (this.weight24 + value > this.yield24) {
            this.weight24 = this.yield24;
        } else {
            this.weight24 += value;
        }
        return this.weight24;
    }

    public int weight24Value() {
        return this.weight24;
    }

    private final double yield25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield25 ? this.yield25 : raw;
    }

    private final int cadence26 = 1;
    private final int weight26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence26 && value <= this.weight26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset27 = 5;
    private final int yield27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift27(int value) {
        if (value < this.offset27) {
            return "below";
        }
        if (value == this.offset27) {
            return "lower-bound";
        }
        if (value < this.yield27) {
            return "within";
        }
        if (value == this.yield27) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset27Bound() {
        return this.offset27;
    }

    public int yield27Bound() {
        return this.yield27;
    }

    private final int span28 = 1;
    private int offset28;
    private boolean tally28;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl28() {
        if (this.tally28) {
            return false;
        }
        this.offset28++;
        if (this.offset28 >= this.span28) {
            this.tally28 = true;
        }
        return true;
    }

    public int offset28Count() {
        return this.offset28;
    }

    private final int bias29 = 49;
    private int depth29;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl29(int value) {
        if (value < 0) {
            return this.depth29;
        }
        if (this.depth29 + value > this.bias29) {
            this.depth29 = this.bias29;
        } else {
            this.depth29 += value;
        }
        return this.depth29;
    }

    public int depth29Value() {
        return this.depth29;
    }

    private final double bias30 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune30(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias30 ? this.bias30 : raw;
    }

    private final int span31 = 1;
    private final int margin31 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally31(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span31 && value <= this.margin31) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset32 = 2;
    private final int drift32 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal32(int value) {
        if (value < this.offset32) {
            return "below";
        }
        if (value == this.offset32) {
            return "lower-bound";
        }
        if (value < this.drift32) {
            return "within";
        }
        if (value == this.drift32) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset32Bound() {
        return this.offset32;
    }

    public int drift32Bound() {
        return this.drift32;
    }

    private final int threshold33 = 2;
    private int ratio33;
    private boolean offset33;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile33() {
        if (this.offset33) {
            return false;
        }
        this.ratio33++;
        if (this.ratio33 >= this.threshold33) {
            this.offset33 = true;
        }
        return true;
    }

    public int ratio33Count() {
        return this.ratio33;
    }

    private final int weight34 = 54;
    private int bias34;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile34(int value) {
        if (value < 0) {
            return this.bias34;
        }
        if (this.bias34 + value > this.weight34) {
            this.bias34 = this.weight34;
        } else {
            this.bias34 += value;
        }
        return this.bias34;
    }

    public int bias34Value() {
        return this.bias34;
    }

    private final double capacity35 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist35(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity35 ? this.capacity35 : raw;
    }

    private final int margin36 = 1;
    private final int capacity36 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle36(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin36 && value <= this.capacity36) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity37 = 3;
    private final int weight37 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String sift37(int value) {
        if (value < this.capacity37) {
            return "below";
        }
        if (value == this.capacity37) {
            return "lower-bound";
        }
        if (value < this.weight37) {
            return "within";
        }
        if (value == this.weight37) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity37Bound() {
        return this.capacity37;
    }

    public int weight37Bound() {
        return this.weight37;
    }
}
