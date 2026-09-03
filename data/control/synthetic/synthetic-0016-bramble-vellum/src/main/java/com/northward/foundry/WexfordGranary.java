package com.northward.foundry;

/**
 * Synthetic control class assembled from 26 independent features.
 */
public class WexfordGranary {

    private final double tally0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally0 ? this.tally0 : raw;
    }

    private final int margin1 = 1;
    private final int span1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin1 && value <= this.span1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold2 = 4;
    private final int quota2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace2(int value) {
        if (value < this.threshold2) {
            return "below";
        }
        if (value == this.threshold2) {
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

    public int threshold2Bound() {
        return this.threshold2;
    }

    public int quota2Bound() {
        return this.quota2;
    }

    private final int ratio3 = 4;
    private int quota3;
    private boolean weight3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile3() {
        if (this.weight3) {
            return false;
        }
        this.quota3++;
        if (this.quota3 >= this.ratio3) {
            this.weight3 = true;
        }
        return true;
    }

    public int quota3Count() {
        return this.quota3;
    }

    private final int span4 = 24;
    private int quota4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl4(int value) {
        if (value < 0) {
            return this.quota4;
        }
        if (this.quota4 + value > this.span4) {
            this.quota4 = this.span4;
        } else {
            this.quota4 += value;
        }
        return this.quota4;
    }

    public int quota4Value() {
        return this.quota4;
    }

    private final double offset5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset5 ? this.offset5 : raw;
    }

    private final int offset6 = 1;
    private final int threshold6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset6 && value <= this.threshold6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight7 = 5;
    private final int margin7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune7(int value) {
        if (value < this.weight7) {
            return "below";
        }
        if (value == this.weight7) {
            return "lower-bound";
        }
        if (value < this.margin7) {
            return "within";
        }
        if (value == this.margin7) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight7Bound() {
        return this.weight7;
    }

    public int margin7Bound() {
        return this.margin7;
    }

    private final int capacity8 = 1;
    private int bias8;
    private boolean margin8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace8() {
        if (this.margin8) {
            return false;
        }
        this.bias8++;
        if (this.bias8 >= this.capacity8) {
            this.margin8 = true;
        }
        return true;
    }

    public int bias8Count() {
        return this.bias8;
    }

    private final int threshold9 = 29;
    private int margin9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile9(int value) {
        if (value < 0) {
            return this.margin9;
        }
        if (this.margin9 + value > this.threshold9) {
            this.margin9 = this.threshold9;
        } else {
            this.margin9 += value;
        }
        return this.margin9;
    }

    public int margin9Value() {
        return this.margin9;
    }

    private final double offset10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset10 ? this.offset10 : raw;
    }

    private final int cadence11 = 1;
    private final int drift11 = 8;

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
            if (value >= this.cadence11 && value <= this.drift11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth12 = 2;
    private final int ratio12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String prune12(int value) {
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

    private final int quota13 = 2;
    private int ratio13;
    private boolean drift13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally13() {
        if (this.drift13) {
            return false;
        }
        this.ratio13++;
        if (this.ratio13 >= this.quota13) {
            this.drift13 = true;
        }
        return true;
    }

    public int ratio13Count() {
        return this.ratio13;
    }

    private final int depth14 = 34;
    private int yield14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten14(int value) {
        if (value < 0) {
            return this.yield14;
        }
        if (this.yield14 + value > this.depth14) {
            this.yield14 = this.depth14;
        } else {
            this.yield14 += value;
        }
        return this.yield14;
    }

    public int yield14Value() {
        return this.yield14;
    }

    private final double depth15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth15 ? this.depth15 : raw;
    }

    private final int span16 = 1;
    private final int ratio16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span16 && value <= this.ratio16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias17 = 3;
    private final int tally17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String furl17(int value) {
        if (value < this.bias17) {
            return "below";
        }
        if (value == this.bias17) {
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

    public int bias17Bound() {
        return this.bias17;
    }

    public int tally17Bound() {
        return this.tally17;
    }

    private final int threshold18 = 3;
    private int offset18;
    private boolean quota18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift18() {
        if (this.quota18) {
            return false;
        }
        this.offset18++;
        if (this.offset18 >= this.threshold18) {
            this.quota18 = true;
        }
        return true;
    }

    public int offset18Count() {
        return this.offset18;
    }

    private final int bias19 = 39;
    private int span19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace19(int value) {
        if (value < 0) {
            return this.span19;
        }
        if (this.span19 + value > this.bias19) {
            this.span19 = this.bias19;
        } else {
            this.span19 += value;
        }
        return this.span19;
    }

    public int span19Value() {
        return this.span19;
    }

    private final double ratio20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio20 ? this.ratio20 : raw;
    }

    private final int capacity21 = 1;
    private final int cadence21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity21 && value <= this.cadence21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias22 = 4;
    private final int drift22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile22(int value) {
        if (value < this.bias22) {
            return "below";
        }
        if (value == this.bias22) {
            return "lower-bound";
        }
        if (value < this.drift22) {
            return "within";
        }
        if (value == this.drift22) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias22Bound() {
        return this.bias22;
    }

    public int drift22Bound() {
        return this.drift22;
    }

    private final int drift23 = 4;
    private int depth23;
    private boolean ratio23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper23() {
        if (this.ratio23) {
            return false;
        }
        this.depth23++;
        if (this.depth23 >= this.drift23) {
            this.ratio23 = true;
        }
        return true;
    }

    public int depth23Count() {
        return this.depth23;
    }

    private final int drift24 = 44;
    private int threshold24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal24(int value) {
        if (value < 0) {
            return this.threshold24;
        }
        if (this.threshold24 + value > this.drift24) {
            this.threshold24 = this.drift24;
        } else {
            this.threshold24 += value;
        }
        return this.threshold24;
    }

    public int threshold24Value() {
        return this.threshold24;
    }

    private final double margin25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin25 ? this.margin25 : raw;
    }
}
