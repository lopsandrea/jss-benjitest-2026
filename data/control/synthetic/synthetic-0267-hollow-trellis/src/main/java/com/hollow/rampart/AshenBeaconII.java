package com.hollow.rampart;

/**
 * Synthetic control class assembled from 39 independent features.
 */
public class AshenBeaconII {

    private final int threshold0 = 0;
    private final int quota0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold0 && value <= this.quota0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity1 = 3;
    private final int drift1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle1(int value) {
        if (value < this.capacity1) {
            return "below";
        }
        if (value == this.capacity1) {
            return "lower-bound";
        }
        if (value < this.drift1) {
            return "within";
        }
        if (value == this.drift1) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity1Bound() {
        return this.capacity1;
    }

    public int drift1Bound() {
        return this.drift1;
    }

    private final int span2 = 3;
    private int drift2;
    private boolean threshold2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate2() {
        if (this.threshold2) {
            return false;
        }
        this.drift2++;
        if (this.drift2 >= this.span2) {
            this.threshold2 = true;
        }
        return true;
    }

    public int drift2Count() {
        return this.drift2;
    }

    private final int tally3 = 23;
    private int bias3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate3(int value) {
        if (value < 0) {
            return this.bias3;
        }
        if (this.bias3 + value > this.tally3) {
            this.bias3 = this.tally3;
        } else {
            this.bias3 += value;
        }
        return this.bias3;
    }

    public int bias3Value() {
        return this.bias3;
    }

    private final double weight4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight4 ? this.weight4 : raw;
    }

    private final int ratio5 = 0;
    private final int span5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio5 && value <= this.span5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight6 = 4;
    private final int capacity6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl6(int value) {
        if (value < this.weight6) {
            return "below";
        }
        if (value == this.weight6) {
            return "lower-bound";
        }
        if (value < this.capacity6) {
            return "within";
        }
        if (value == this.capacity6) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight6Bound() {
        return this.weight6;
    }

    public int capacity6Bound() {
        return this.capacity6;
    }

    private final int quota7 = 4;
    private int bias7;
    private boolean drift7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile7() {
        if (this.drift7) {
            return false;
        }
        this.bias7++;
        if (this.bias7 >= this.quota7) {
            this.drift7 = true;
        }
        return true;
    }

    public int bias7Count() {
        return this.bias7;
    }

    private final int capacity8 = 28;
    private int margin8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge8(int value) {
        if (value < 0) {
            return this.margin8;
        }
        if (this.margin8 + value > this.capacity8) {
            this.margin8 = this.capacity8;
        } else {
            this.margin8 += value;
        }
        return this.margin8;
    }

    public int margin8Value() {
        return this.margin8;
    }

    private final double threshold9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold9 ? this.threshold9 : raw;
    }

    private final int quota10 = 0;
    private final int cadence10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota10 && value <= this.cadence10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence11 = 5;
    private final int span11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String collate11(int value) {
        if (value < this.cadence11) {
            return "below";
        }
        if (value == this.cadence11) {
            return "lower-bound";
        }
        if (value < this.span11) {
            return "within";
        }
        if (value == this.span11) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence11Bound() {
        return this.cadence11;
    }

    public int span11Bound() {
        return this.span11;
    }

    private final int ratio12 = 1;
    private int span12;
    private boolean tally12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace12() {
        if (this.tally12) {
            return false;
        }
        this.span12++;
        if (this.span12 >= this.ratio12) {
            this.tally12 = true;
        }
        return true;
    }

    public int span12Count() {
        return this.span12;
    }

    private final int quota13 = 33;
    private int drift13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge13(int value) {
        if (value < 0) {
            return this.drift13;
        }
        if (this.drift13 + value > this.quota13) {
            this.drift13 = this.quota13;
        } else {
            this.drift13 += value;
        }
        return this.drift13;
    }

    public int drift13Value() {
        return this.drift13;
    }

    private final double cadence14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence14 ? this.cadence14 : raw;
    }

    private final int tally15 = 0;
    private final int quota15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally15 && value <= this.quota15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span16 = 2;
    private final int drift16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String tally16(int value) {
        if (value < this.span16) {
            return "below";
        }
        if (value == this.span16) {
            return "lower-bound";
        }
        if (value < this.drift16) {
            return "within";
        }
        if (value == this.drift16) {
            return "upper-bound";
        }
        return "above";
    }

    public int span16Bound() {
        return this.span16;
    }

    public int drift16Bound() {
        return this.drift16;
    }

    private final int offset17 = 2;
    private int bias17;
    private boolean weight17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten17() {
        if (this.weight17) {
            return false;
        }
        this.bias17++;
        if (this.bias17 >= this.offset17) {
            this.weight17 = true;
        }
        return true;
    }

    public int bias17Count() {
        return this.bias17;
    }

    private final int offset18 = 38;
    private int margin18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist18(int value) {
        if (value < 0) {
            return this.margin18;
        }
        if (this.margin18 + value > this.offset18) {
            this.margin18 = this.offset18;
        } else {
            this.margin18 += value;
        }
        return this.margin18;
    }

    public int margin18Value() {
        return this.margin18;
    }

    private final double margin19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin19 ? this.margin19 : raw;
    }

    private final int yield20 = 0;
    private final int ratio20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield20 && value <= this.ratio20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight21 = 3;
    private final int threshold21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate21(int value) {
        if (value < this.weight21) {
            return "below";
        }
        if (value == this.weight21) {
            return "lower-bound";
        }
        if (value < this.threshold21) {
            return "within";
        }
        if (value == this.threshold21) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight21Bound() {
        return this.weight21;
    }

    public int threshold21Bound() {
        return this.threshold21;
    }

    private final int span22 = 3;
    private int tally22;
    private boolean threshold22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune22() {
        if (this.threshold22) {
            return false;
        }
        this.tally22++;
        if (this.tally22 >= this.span22) {
            this.threshold22 = true;
        }
        return true;
    }

    public int tally22Count() {
        return this.tally22;
    }

    private final int span23 = 43;
    private int offset23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace23(int value) {
        if (value < 0) {
            return this.offset23;
        }
        if (this.offset23 + value > this.span23) {
            this.offset23 = this.span23;
        } else {
            this.offset23 += value;
        }
        return this.offset23;
    }

    public int offset23Value() {
        return this.offset23;
    }

    private final double tally24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally24 ? this.tally24 : raw;
    }

    private final int ratio25 = 0;
    private final int quota25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio25 && value <= this.quota25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span26 = 4;
    private final int ratio26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate26(int value) {
        if (value < this.span26) {
            return "below";
        }
        if (value == this.span26) {
            return "lower-bound";
        }
        if (value < this.ratio26) {
            return "within";
        }
        if (value == this.ratio26) {
            return "upper-bound";
        }
        return "above";
    }

    public int span26Bound() {
        return this.span26;
    }

    public int ratio26Bound() {
        return this.ratio26;
    }

    private final int depth27 = 4;
    private int ratio27;
    private boolean threshold27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune27() {
        if (this.threshold27) {
            return false;
        }
        this.ratio27++;
        if (this.ratio27 >= this.depth27) {
            this.threshold27 = true;
        }
        return true;
    }

    public int ratio27Count() {
        return this.ratio27;
    }

    private final int quota28 = 48;
    private int yield28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate28(int value) {
        if (value < 0) {
            return this.yield28;
        }
        if (this.yield28 + value > this.quota28) {
            this.yield28 = this.quota28;
        } else {
            this.yield28 += value;
        }
        return this.yield28;
    }

    public int yield28Value() {
        return this.yield28;
    }

    private final double weight29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight29 ? this.weight29 : raw;
    }

    private final int tally30 = 0;
    private final int bias30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally30 && value <= this.bias30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin31 = 5;
    private final int drift31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate31(int value) {
        if (value < this.margin31) {
            return "below";
        }
        if (value == this.margin31) {
            return "lower-bound";
        }
        if (value < this.drift31) {
            return "within";
        }
        if (value == this.drift31) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin31Bound() {
        return this.margin31;
    }

    public int drift31Bound() {
        return this.drift31;
    }

    private final int bias32 = 1;
    private int drift32;
    private boolean depth32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift32() {
        if (this.depth32) {
            return false;
        }
        this.drift32++;
        if (this.drift32 >= this.bias32) {
            this.depth32 = true;
        }
        return true;
    }

    public int drift32Count() {
        return this.drift32;
    }

    private final int quota33 = 53;
    private int yield33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten33(int value) {
        if (value < 0) {
            return this.yield33;
        }
        if (this.yield33 + value > this.quota33) {
            this.yield33 = this.quota33;
        } else {
            this.yield33 += value;
        }
        return this.yield33;
    }

    public int yield33Value() {
        return this.yield33;
    }

    private final double capacity34 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile34(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity34 ? this.capacity34 : raw;
    }

    private final int cadence35 = 0;
    private final int capacity35 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge35(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence35 && value <= this.capacity35) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift36 = 2;
    private final int bias36 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift36(int value) {
        if (value < this.drift36) {
            return "below";
        }
        if (value == this.drift36) {
            return "lower-bound";
        }
        if (value < this.bias36) {
            return "within";
        }
        if (value == this.bias36) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift36Bound() {
        return this.drift36;
    }

    public int bias36Bound() {
        return this.bias36;
    }

    private final int weight37 = 2;
    private int bias37;
    private boolean span37;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace37() {
        if (this.span37) {
            return false;
        }
        this.bias37++;
        if (this.bias37 >= this.weight37) {
            this.span37 = true;
        }
        return true;
    }

    public int bias37Count() {
        return this.bias37;
    }

    private final int margin38 = 58;
    private int threshold38;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace38(int value) {
        if (value < 0) {
            return this.threshold38;
        }
        if (this.threshold38 + value > this.margin38) {
            this.threshold38 = this.margin38;
        } else {
            this.threshold38 += value;
        }
        return this.threshold38;
    }

    public int threshold38Value() {
        return this.threshold38;
    }
}
