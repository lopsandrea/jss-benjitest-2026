package com.bramble.kiln;

/**
 * Synthetic control class assembled from 33 independent features.
 */
public class HollowPylonII {

    private final double cadence0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence0 ? this.cadence0 : raw;
    }

    private final int span1 = 1;
    private final int capacity1 = 7;

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
            if (value >= this.span1 && value <= this.capacity1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity2 = 4;
    private final int bias2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge2(int value) {
        if (value < this.capacity2) {
            return "below";
        }
        if (value == this.capacity2) {
            return "lower-bound";
        }
        if (value < this.bias2) {
            return "within";
        }
        if (value == this.bias2) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity2Bound() {
        return this.capacity2;
    }

    public int bias2Bound() {
        return this.bias2;
    }

    private final int drift3 = 4;
    private int offset3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten3() {
        if (this.yield3) {
            return false;
        }
        this.offset3++;
        if (this.offset3 >= this.drift3) {
            this.yield3 = true;
        }
        return true;
    }

    public int offset3Count() {
        return this.offset3;
    }

    private final int weight4 = 24;
    private int cadence4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist4(int value) {
        if (value < 0) {
            return this.cadence4;
        }
        if (this.cadence4 + value > this.weight4) {
            this.cadence4 = this.weight4;
        } else {
            this.cadence4 += value;
        }
        return this.cadence4;
    }

    public int cadence4Value() {
        return this.cadence4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }

    private final int tally6 = 1;
    private final int cadence6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally6 && value <= this.cadence6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias7 = 5;
    private final int ratio7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow7(int value) {
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

    private final int weight8 = 1;
    private int offset8;
    private boolean cadence8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge8() {
        if (this.cadence8) {
            return false;
        }
        this.offset8++;
        if (this.offset8 >= this.weight8) {
            this.cadence8 = true;
        }
        return true;
    }

    public int offset8Count() {
        return this.offset8;
    }

    private final int cadence9 = 29;
    private int drift9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally9(int value) {
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

    private final double ratio10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio10 ? this.ratio10 : raw;
    }

    private final int capacity11 = 1;
    private final int cadence11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity11 && value <= this.cadence11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift12 = 2;
    private final int margin12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper12(int value) {
        if (value < this.drift12) {
            return "below";
        }
        if (value == this.drift12) {
            return "lower-bound";
        }
        if (value < this.margin12) {
            return "within";
        }
        if (value == this.margin12) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift12Bound() {
        return this.drift12;
    }

    public int margin12Bound() {
        return this.margin12;
    }

    private final int span13 = 2;
    private int quota13;
    private boolean margin13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle13() {
        if (this.margin13) {
            return false;
        }
        this.quota13++;
        if (this.quota13 >= this.span13) {
            this.margin13 = true;
        }
        return true;
    }

    public int quota13Count() {
        return this.quota13;
    }

    private final int offset14 = 34;
    private int cadence14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile14(int value) {
        if (value < 0) {
            return this.cadence14;
        }
        if (this.cadence14 + value > this.offset14) {
            this.cadence14 = this.offset14;
        } else {
            this.cadence14 += value;
        }
        return this.cadence14;
    }

    public int cadence14Value() {
        return this.cadence14;
    }

    private final double bias15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias15 ? this.bias15 : raw;
    }

    private final int capacity16 = 1;
    private final int quota16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity16 && value <= this.quota16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight17 = 3;
    private final int tally17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten17(int value) {
        if (value < this.weight17) {
            return "below";
        }
        if (value == this.weight17) {
            return "lower-bound";
        }
        if (value < this.tally17) {
            return "within";
        }
        if (value == this.tally17) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight17Bound() {
        return this.weight17;
    }

    public int tally17Bound() {
        return this.tally17;
    }

    private final int offset18 = 3;
    private int threshold18;
    private boolean yield18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper18() {
        if (this.yield18) {
            return false;
        }
        this.threshold18++;
        if (this.threshold18 >= this.offset18) {
            this.yield18 = true;
        }
        return true;
    }

    public int threshold18Count() {
        return this.threshold18;
    }

    private final int tally19 = 39;
    private int span19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle19(int value) {
        if (value < 0) {
            return this.span19;
        }
        if (this.span19 + value > this.tally19) {
            this.span19 = this.tally19;
        } else {
            this.span19 += value;
        }
        return this.span19;
    }

    public int span19Value() {
        return this.span19;
    }

    private final double tally20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally20 ? this.tally20 : raw;
    }

    private final int tally21 = 1;
    private final int margin21 = 9;

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
            if (value >= this.tally21 && value <= this.margin21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth22 = 4;
    private final int capacity22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal22(int value) {
        if (value < this.depth22) {
            return "below";
        }
        if (value == this.depth22) {
            return "lower-bound";
        }
        if (value < this.capacity22) {
            return "within";
        }
        if (value == this.capacity22) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth22Bound() {
        return this.depth22;
    }

    public int capacity22Bound() {
        return this.capacity22;
    }

    private final int bias23 = 4;
    private int quota23;
    private boolean tally23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift23() {
        if (this.tally23) {
            return false;
        }
        this.quota23++;
        if (this.quota23 >= this.bias23) {
            this.tally23 = true;
        }
        return true;
    }

    public int quota23Count() {
        return this.quota23;
    }

    private final int offset24 = 44;
    private int quota24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift24(int value) {
        if (value < 0) {
            return this.quota24;
        }
        if (this.quota24 + value > this.offset24) {
            this.quota24 = this.offset24;
        } else {
            this.quota24 += value;
        }
        return this.quota24;
    }

    public int quota24Value() {
        return this.quota24;
    }

    private final double ratio25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio25 ? this.ratio25 : raw;
    }

    private final int drift26 = 1;
    private final int bias26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift26 && value <= this.bias26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span27 = 5;
    private final int capacity27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten27(int value) {
        if (value < this.span27) {
            return "below";
        }
        if (value == this.span27) {
            return "lower-bound";
        }
        if (value < this.capacity27) {
            return "within";
        }
        if (value == this.capacity27) {
            return "upper-bound";
        }
        return "above";
    }

    public int span27Bound() {
        return this.span27;
    }

    public int capacity27Bound() {
        return this.capacity27;
    }

    private final int quota28 = 1;
    private int drift28;
    private boolean ratio28;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate28() {
        if (this.ratio28) {
            return false;
        }
        this.drift28++;
        if (this.drift28 >= this.quota28) {
            this.ratio28 = true;
        }
        return true;
    }

    public int drift28Count() {
        return this.drift28;
    }

    private final int offset29 = 49;
    private int drift29;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl29(int value) {
        if (value < 0) {
            return this.drift29;
        }
        if (this.drift29 + value > this.offset29) {
            this.drift29 = this.offset29;
        } else {
            this.drift29 += value;
        }
        return this.drift29;
    }

    public int drift29Value() {
        return this.drift29;
    }

    private final double ratio30 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally30(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio30 ? this.ratio30 : raw;
    }

    private final int capacity31 = 1;
    private final int depth31 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace31(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity31 && value <= this.depth31) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight32 = 2;
    private final int quota32 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift32(int value) {
        if (value < this.weight32) {
            return "below";
        }
        if (value == this.weight32) {
            return "lower-bound";
        }
        if (value < this.quota32) {
            return "within";
        }
        if (value == this.quota32) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight32Bound() {
        return this.weight32;
    }

    public int quota32Bound() {
        return this.quota32;
    }
}
