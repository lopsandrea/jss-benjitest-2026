package com.copper.estuary;

/**
 * Synthetic control class assembled from 33 independent features.
 */
public class WexfordGranaryIV {

    private final double offset0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset0 ? this.offset0 : raw;
    }

    private final int weight1 = 1;
    private final int threshold1 = 7;

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
            if (value >= this.weight1 && value <= this.threshold1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span2 = 4;
    private final int yield2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String prune2(int value) {
        if (value < this.span2) {
            return "below";
        }
        if (value == this.span2) {
            return "lower-bound";
        }
        if (value < this.yield2) {
            return "within";
        }
        if (value == this.yield2) {
            return "upper-bound";
        }
        return "above";
    }

    public int span2Bound() {
        return this.span2;
    }

    public int yield2Bound() {
        return this.yield2;
    }

    private final int quota3 = 4;
    private int capacity3;
    private boolean margin3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge3() {
        if (this.margin3) {
            return false;
        }
        this.capacity3++;
        if (this.capacity3 >= this.quota3) {
            this.margin3 = true;
        }
        return true;
    }

    public int capacity3Count() {
        return this.capacity3;
    }

    private final int span4 = 24;
    private int capacity4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally4(int value) {
        if (value < 0) {
            return this.capacity4;
        }
        if (this.capacity4 + value > this.span4) {
            this.capacity4 = this.span4;
        } else {
            this.capacity4 += value;
        }
        return this.capacity4;
    }

    public int capacity4Value() {
        return this.capacity4;
    }

    private final double margin5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin5 ? this.margin5 : raw;
    }

    private final int ratio6 = 1;
    private final int threshold6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio6 && value <= this.threshold6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight7 = 5;
    private final int drift7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge7(int value) {
        if (value < this.weight7) {
            return "below";
        }
        if (value == this.weight7) {
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

    public int weight7Bound() {
        return this.weight7;
    }

    public int drift7Bound() {
        return this.drift7;
    }

    private final int ratio8 = 1;
    private int tally8;
    private boolean offset8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal8() {
        if (this.offset8) {
            return false;
        }
        this.tally8++;
        if (this.tally8 >= this.ratio8) {
            this.offset8 = true;
        }
        return true;
    }

    public int tally8Count() {
        return this.tally8;
    }

    private final int drift9 = 29;
    private int margin9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile9(int value) {
        if (value < 0) {
            return this.margin9;
        }
        if (this.margin9 + value > this.drift9) {
            this.margin9 = this.drift9;
        } else {
            this.margin9 += value;
        }
        return this.margin9;
    }

    public int margin9Value() {
        return this.margin9;
    }

    private final double depth10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth10 ? this.depth10 : raw;
    }

    private final int weight11 = 1;
    private final int cadence11 = 8;

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
            if (value >= this.weight11 && value <= this.cadence11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold12 = 2;
    private final int cadence12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String brace12(int value) {
        if (value < this.threshold12) {
            return "below";
        }
        if (value == this.threshold12) {
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

    public int threshold12Bound() {
        return this.threshold12;
    }

    public int cadence12Bound() {
        return this.cadence12;
    }

    private final int yield13 = 2;
    private int capacity13;
    private boolean ratio13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate13() {
        if (this.ratio13) {
            return false;
        }
        this.capacity13++;
        if (this.capacity13 >= this.yield13) {
            this.ratio13 = true;
        }
        return true;
    }

    public int capacity13Count() {
        return this.capacity13;
    }

    private final int drift14 = 34;
    private int yield14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal14(int value) {
        if (value < 0) {
            return this.yield14;
        }
        if (this.yield14 + value > this.drift14) {
            this.yield14 = this.drift14;
        } else {
            this.yield14 += value;
        }
        return this.yield14;
    }

    public int yield14Value() {
        return this.yield14;
    }

    private final double drift15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift15 ? this.drift15 : raw;
    }

    private final int quota16 = 1;
    private final int drift16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota16 && value <= this.drift16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth17 = 3;
    private final int tally17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String prune17(int value) {
        if (value < this.depth17) {
            return "below";
        }
        if (value == this.depth17) {
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

    public int depth17Bound() {
        return this.depth17;
    }

    public int tally17Bound() {
        return this.tally17;
    }

    private final int quota18 = 3;
    private int bias18;
    private boolean span18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist18() {
        if (this.span18) {
            return false;
        }
        this.bias18++;
        if (this.bias18 >= this.quota18) {
            this.span18 = true;
        }
        return true;
    }

    public int bias18Count() {
        return this.bias18;
    }

    private final int margin19 = 39;
    private int weight19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge19(int value) {
        if (value < 0) {
            return this.weight19;
        }
        if (this.weight19 + value > this.margin19) {
            this.weight19 = this.margin19;
        } else {
            this.weight19 += value;
        }
        return this.weight19;
    }

    public int weight19Value() {
        return this.weight19;
    }

    private final double ratio20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio20 ? this.ratio20 : raw;
    }

    private final int span21 = 1;
    private final int quota21 = 9;

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
            if (value >= this.span21 && value <= this.quota21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold22 = 4;
    private final int margin22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow22(int value) {
        if (value < this.threshold22) {
            return "below";
        }
        if (value == this.threshold22) {
            return "lower-bound";
        }
        if (value < this.margin22) {
            return "within";
        }
        if (value == this.margin22) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold22Bound() {
        return this.threshold22;
    }

    public int margin22Bound() {
        return this.margin22;
    }

    private final int depth23 = 4;
    private int threshold23;
    private boolean cadence23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate23() {
        if (this.cadence23) {
            return false;
        }
        this.threshold23++;
        if (this.threshold23 >= this.depth23) {
            this.cadence23 = true;
        }
        return true;
    }

    public int threshold23Count() {
        return this.threshold23;
    }

    private final int yield24 = 44;
    private int offset24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate24(int value) {
        if (value < 0) {
            return this.offset24;
        }
        if (this.offset24 + value > this.yield24) {
            this.offset24 = this.yield24;
        } else {
            this.offset24 += value;
        }
        return this.offset24;
    }

    public int offset24Value() {
        return this.offset24;
    }

    private final double threshold25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold25 ? this.threshold25 : raw;
    }

    private final int offset26 = 1;
    private final int weight26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset26 && value <= this.weight26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias27 = 5;
    private final int yield27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift27(int value) {
        if (value < this.bias27) {
            return "below";
        }
        if (value == this.bias27) {
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

    public int bias27Bound() {
        return this.bias27;
    }

    public int yield27Bound() {
        return this.yield27;
    }

    private final int weight28 = 1;
    private int yield28;
    private boolean span28;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge28() {
        if (this.span28) {
            return false;
        }
        this.yield28++;
        if (this.yield28 >= this.weight28) {
            this.span28 = true;
        }
        return true;
    }

    public int yield28Count() {
        return this.yield28;
    }

    private final int tally29 = 49;
    private int weight29;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune29(int value) {
        if (value < 0) {
            return this.weight29;
        }
        if (this.weight29 + value > this.tally29) {
            this.weight29 = this.tally29;
        } else {
            this.weight29 += value;
        }
        return this.weight29;
    }

    public int weight29Value() {
        return this.weight29;
    }

    private final double depth30 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace30(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth30 ? this.depth30 : raw;
    }

    private final int span31 = 1;
    private final int quota31 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow31(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span31 && value <= this.quota31) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio32 = 2;
    private final int margin32 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal32(int value) {
        if (value < this.ratio32) {
            return "below";
        }
        if (value == this.ratio32) {
            return "lower-bound";
        }
        if (value < this.margin32) {
            return "within";
        }
        if (value == this.margin32) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio32Bound() {
        return this.ratio32;
    }

    public int margin32Bound() {
        return this.margin32;
    }
}
