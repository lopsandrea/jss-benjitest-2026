package com.tidal.weir;

/**
 * Synthetic control class assembled from 29 independent features.
 */
public class WexfordQuarry {

    private final double tally0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally0 ? this.tally0 : raw;
    }

    private final int yield1 = 1;
    private final int quota1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield1 && value <= this.quota1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight2 = 4;
    private final int offset2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge2(int value) {
        if (value < this.weight2) {
            return "below";
        }
        if (value == this.weight2) {
            return "lower-bound";
        }
        if (value < this.offset2) {
            return "within";
        }
        if (value == this.offset2) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight2Bound() {
        return this.weight2;
    }

    public int offset2Bound() {
        return this.offset2;
    }

    private final int span3 = 4;
    private int margin3;
    private boolean weight3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow3() {
        if (this.weight3) {
            return false;
        }
        this.margin3++;
        if (this.margin3 >= this.span3) {
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
    public int temper4(int value) {
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

    private final double yield5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield5 ? this.yield5 : raw;
    }

    private final int drift6 = 1;
    private final int bias6 = 12;

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
            if (value >= this.drift6 && value <= this.bias6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota7 = 5;
    private final int weight7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle7(int value) {
        if (value < this.quota7) {
            return "below";
        }
        if (value == this.quota7) {
            return "lower-bound";
        }
        if (value < this.weight7) {
            return "within";
        }
        if (value == this.weight7) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota7Bound() {
        return this.quota7;
    }

    public int weight7Bound() {
        return this.weight7;
    }

    private final int offset8 = 1;
    private int threshold8;
    private boolean ratio8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge8() {
        if (this.ratio8) {
            return false;
        }
        this.threshold8++;
        if (this.threshold8 >= this.offset8) {
            this.ratio8 = true;
        }
        return true;
    }

    public int threshold8Count() {
        return this.threshold8;
    }

    private final int capacity9 = 29;
    private int depth9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle9(int value) {
        if (value < 0) {
            return this.depth9;
        }
        if (this.depth9 + value > this.capacity9) {
            this.depth9 = this.capacity9;
        } else {
            this.depth9 += value;
        }
        return this.depth9;
    }

    public int depth9Value() {
        return this.depth9;
    }

    private final double quota10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota10 ? this.quota10 : raw;
    }

    private final int span11 = 1;
    private final int offset11 = 8;

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
            if (value >= this.span11 && value <= this.offset11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias12 = 2;
    private final int ratio12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl12(int value) {
        if (value < this.bias12) {
            return "below";
        }
        if (value == this.bias12) {
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

    public int bias12Bound() {
        return this.bias12;
    }

    public int ratio12Bound() {
        return this.ratio12;
    }

    private final int tally13 = 2;
    private int drift13;
    private boolean offset13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift13() {
        if (this.offset13) {
            return false;
        }
        this.drift13++;
        if (this.drift13 >= this.tally13) {
            this.offset13 = true;
        }
        return true;
    }

    public int drift13Count() {
        return this.drift13;
    }

    private final int capacity14 = 34;
    private int tally14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist14(int value) {
        if (value < 0) {
            return this.tally14;
        }
        if (this.tally14 + value > this.capacity14) {
            this.tally14 = this.capacity14;
        } else {
            this.tally14 += value;
        }
        return this.tally14;
    }

    public int tally14Value() {
        return this.tally14;
    }

    private final double cadence15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence15 ? this.cadence15 : raw;
    }

    private final int margin16 = 1;
    private final int threshold16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin16 && value <= this.threshold16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence17 = 3;
    private final int margin17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten17(int value) {
        if (value < this.cadence17) {
            return "below";
        }
        if (value == this.cadence17) {
            return "lower-bound";
        }
        if (value < this.margin17) {
            return "within";
        }
        if (value == this.margin17) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence17Bound() {
        return this.cadence17;
    }

    public int margin17Bound() {
        return this.margin17;
    }

    private final int cadence18 = 3;
    private int bias18;
    private boolean margin18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow18() {
        if (this.margin18) {
            return false;
        }
        this.bias18++;
        if (this.bias18 >= this.cadence18) {
            this.margin18 = true;
        }
        return true;
    }

    public int bias18Count() {
        return this.bias18;
    }

    private final int drift19 = 39;
    private int capacity19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate19(int value) {
        if (value < 0) {
            return this.capacity19;
        }
        if (this.capacity19 + value > this.drift19) {
            this.capacity19 = this.drift19;
        } else {
            this.capacity19 += value;
        }
        return this.capacity19;
    }

    public int capacity19Value() {
        return this.capacity19;
    }

    private final double weight20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight20 ? this.weight20 : raw;
    }

    private final int ratio21 = 1;
    private final int yield21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio21 && value <= this.yield21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth22 = 4;
    private final int yield22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle22(int value) {
        if (value < this.depth22) {
            return "below";
        }
        if (value == this.depth22) {
            return "lower-bound";
        }
        if (value < this.yield22) {
            return "within";
        }
        if (value == this.yield22) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth22Bound() {
        return this.depth22;
    }

    public int yield22Bound() {
        return this.yield22;
    }

    private final int weight23 = 4;
    private int offset23;
    private boolean bias23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal23() {
        if (this.bias23) {
            return false;
        }
        this.offset23++;
        if (this.offset23 >= this.weight23) {
            this.bias23 = true;
        }
        return true;
    }

    public int offset23Count() {
        return this.offset23;
    }

    private final int quota24 = 44;
    private int depth24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate24(int value) {
        if (value < 0) {
            return this.depth24;
        }
        if (this.depth24 + value > this.quota24) {
            this.depth24 = this.quota24;
        } else {
            this.depth24 += value;
        }
        return this.depth24;
    }

    public int depth24Value() {
        return this.depth24;
    }

    private final double cadence25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence25 ? this.cadence25 : raw;
    }

    private final int margin26 = 1;
    private final int threshold26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin26 && value <= this.threshold26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield27 = 5;
    private final int drift27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String prune27(int value) {
        if (value < this.yield27) {
            return "below";
        }
        if (value == this.yield27) {
            return "lower-bound";
        }
        if (value < this.drift27) {
            return "within";
        }
        if (value == this.drift27) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield27Bound() {
        return this.yield27;
    }

    public int drift27Bound() {
        return this.drift27;
    }

    private final int cadence28 = 1;
    private int quota28;
    private boolean drift28;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift28() {
        if (this.drift28) {
            return false;
        }
        this.quota28++;
        if (this.quota28 >= this.cadence28) {
            this.drift28 = true;
        }
        return true;
    }

    public int quota28Count() {
        return this.quota28;
    }
}
