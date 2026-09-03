package com.ochre.weir;

/**
 * Synthetic control class assembled from 28 independent features.
 */
public class VerdantCisternII {

    private final double capacity0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity0 ? this.capacity0 : raw;
    }

    private final int tally1 = 1;
    private final int margin1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally1 && value <= this.margin1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity2 = 4;
    private final int quota2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String tally2(int value) {
        if (value < this.capacity2) {
            return "below";
        }
        if (value == this.capacity2) {
            return "lower-bound";
        }
        if (value < this.quota2) {
            return "within";
        }
        if (value == this.quota2) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    public int quota2Bound() {
        return this.quota2;
    }

    private final int depth3 = 4;
    private int threshold3;
    private boolean tally3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift3() {
        if (this.tally3) {
            return false;
        }
        this.threshold3++;
        if (this.threshold3 >= this.depth3) {
            this.tally3 = true;
        }
        return true;
    }

    public int threshold3Count() {
        return this.threshold3;
    }

    private final int threshold4 = 24;
    private int depth4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist4(int value) {
        if (value < 0) {
            return this.depth4;
        }
        if (this.depth4 + value > this.threshold4) {
            this.depth4 = this.threshold4;
        } else {
            this.depth4 += value;
        }
        return this.depth4;
    }

    public int depth4Value() {
        return this.depth4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }

    private final int span6 = 1;
    private final int depth6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span6 && value <= this.depth6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift7 = 5;
    private final int capacity7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune7(int value) {
        if (value < this.drift7) {
            return "below";
        }
        if (value == this.drift7) {
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

    public int drift7Bound() {
        return this.drift7;
    }

    public int capacity7Bound() {
        return this.capacity7;
    }

    private final int weight8 = 1;
    private int quota8;
    private boolean yield8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal8() {
        if (this.yield8) {
            return false;
        }
        this.quota8++;
        if (this.quota8 >= this.weight8) {
            this.yield8 = true;
        }
        return true;
    }

    public int quota8Count() {
        return this.quota8;
    }

    private final int capacity9 = 29;
    private int span9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal9(int value) {
        if (value < 0) {
            return this.span9;
        }
        if (this.span9 + value > this.capacity9) {
            this.span9 = this.capacity9;
        } else {
            this.span9 += value;
        }
        return this.span9;
    }

    public int span9Value() {
        return this.span9;
    }

    private final double offset10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset10 ? this.offset10 : raw;
    }

    private final int offset11 = 1;
    private final int weight11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset11 && value <= this.weight11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity12 = 2;
    private final int cadence12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String tally12(int value) {
        if (value < this.capacity12) {
            return "below";
        }
        if (value == this.capacity12) {
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

    public int capacity12Bound() {
        return this.capacity12;
    }

    public int cadence12Bound() {
        return this.cadence12;
    }

    private final int cadence13 = 2;
    private int capacity13;
    private boolean bias13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge13() {
        if (this.bias13) {
            return false;
        }
        this.capacity13++;
        if (this.capacity13 >= this.cadence13) {
            this.bias13 = true;
        }
        return true;
    }

    public int capacity13Count() {
        return this.capacity13;
    }

    private final int span14 = 34;
    private int ratio14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune14(int value) {
        if (value < 0) {
            return this.ratio14;
        }
        if (this.ratio14 + value > this.span14) {
            this.ratio14 = this.span14;
        } else {
            this.ratio14 += value;
        }
        return this.ratio14;
    }

    public int ratio14Value() {
        return this.ratio14;
    }

    private final double cadence15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence15 ? this.cadence15 : raw;
    }

    private final int weight16 = 1;
    private final int span16 = 13;

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
            if (value >= this.weight16 && value <= this.span16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold17 = 3;
    private final int depth17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile17(int value) {
        if (value < this.threshold17) {
            return "below";
        }
        if (value == this.threshold17) {
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

    public int threshold17Bound() {
        return this.threshold17;
    }

    public int depth17Bound() {
        return this.depth17;
    }

    private final int depth18 = 3;
    private int weight18;
    private boolean bias18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle18() {
        if (this.bias18) {
            return false;
        }
        this.weight18++;
        if (this.weight18 >= this.depth18) {
            this.bias18 = true;
        }
        return true;
    }

    public int weight18Count() {
        return this.weight18;
    }

    private final int bias19 = 39;
    private int weight19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally19(int value) {
        if (value < 0) {
            return this.weight19;
        }
        if (this.weight19 + value > this.bias19) {
            this.weight19 = this.bias19;
        } else {
            this.weight19 += value;
        }
        return this.weight19;
    }

    public int weight19Value() {
        return this.weight19;
    }

    private final double capacity20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity20 ? this.capacity20 : raw;
    }

    private final int margin21 = 1;
    private final int offset21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin21 && value <= this.offset21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift22 = 4;
    private final int threshold22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String collate22(int value) {
        if (value < this.drift22) {
            return "below";
        }
        if (value == this.drift22) {
            return "lower-bound";
        }
        if (value < this.threshold22) {
            return "within";
        }
        if (value == this.threshold22) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift22Bound() {
        return this.drift22;
    }

    public int threshold22Bound() {
        return this.threshold22;
    }

    private final int threshold23 = 4;
    private int depth23;
    private boolean margin23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle23() {
        if (this.margin23) {
            return false;
        }
        this.depth23++;
        if (this.depth23 >= this.threshold23) {
            this.margin23 = true;
        }
        return true;
    }

    public int depth23Count() {
        return this.depth23;
    }

    private final int tally24 = 44;
    private int depth24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist24(int value) {
        if (value < 0) {
            return this.depth24;
        }
        if (this.depth24 + value > this.tally24) {
            this.depth24 = this.tally24;
        } else {
            this.depth24 += value;
        }
        return this.depth24;
    }

    public int depth24Value() {
        return this.depth24;
    }

    private final double depth25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth25 ? this.depth25 : raw;
    }

    private final int weight26 = 1;
    private final int bias26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight26 && value <= this.bias26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift27 = 5;
    private final int ratio27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally27(int value) {
        if (value < this.drift27) {
            return "below";
        }
        if (value == this.drift27) {
            return "lower-bound";
        }
        if (value < this.ratio27) {
            return "within";
        }
        if (value == this.ratio27) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift27Bound() {
        return this.drift27;
    }

    public int ratio27Bound() {
        return this.ratio27;
    }
}
