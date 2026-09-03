package com.wexford.cistern;

/**
 * Synthetic control class assembled from 17 independent features.
 */
public class SableVellum {

    private final double span0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span0 ? this.span0 : raw;
    }

    private final int depth1 = 1;
    private final int margin1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth1 && value <= this.margin1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias2 = 4;
    private final int ratio2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String temper2(int value) {
        if (value < this.bias2) {
            return "below";
        }
        if (value == this.bias2) {
            return "lower-bound";
        }
        if (value < this.ratio2) {
            return "within";
        }
        if (value == this.ratio2) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias2Bound() {
        return this.bias2;
    }

    public int ratio2Bound() {
        return this.ratio2;
    }

    private final int margin3 = 4;
    private int tally3;
    private boolean drift3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow3() {
        if (this.drift3) {
            return false;
        }
        this.tally3++;
        if (this.tally3 >= this.margin3) {
            this.drift3 = true;
        }
        return true;
    }

    public int tally3Count() {
        return this.tally3;
    }

    private final int cadence4 = 24;
    private int bias4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow4(int value) {
        if (value < 0) {
            return this.bias4;
        }
        if (this.bias4 + value > this.cadence4) {
            this.bias4 = this.cadence4;
        } else {
            this.bias4 += value;
        }
        return this.bias4;
    }

    public int bias4Value() {
        return this.bias4;
    }

    private final double capacity5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity5 ? this.capacity5 : raw;
    }

    private final int weight6 = 1;
    private final int span6 = 12;

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
            if (value >= this.weight6 && value <= this.span6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset7 = 5;
    private final int drift7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate7(int value) {
        if (value < this.offset7) {
            return "below";
        }
        if (value == this.offset7) {
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

    public int offset7Bound() {
        return this.offset7;
    }

    public int drift7Bound() {
        return this.drift7;
    }

    private final int ratio8 = 1;
    private int capacity8;
    private boolean depth8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten8() {
        if (this.depth8) {
            return false;
        }
        this.capacity8++;
        if (this.capacity8 >= this.ratio8) {
            this.depth8 = true;
        }
        return true;
    }

    public int capacity8Count() {
        return this.capacity8;
    }

    private final int weight9 = 29;
    private int bias9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle9(int value) {
        if (value < 0) {
            return this.bias9;
        }
        if (this.bias9 + value > this.weight9) {
            this.bias9 = this.weight9;
        } else {
            this.bias9 += value;
        }
        return this.bias9;
    }

    public int bias9Value() {
        return this.bias9;
    }

    private final double drift10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift10 ? this.drift10 : raw;
    }

    private final int drift11 = 1;
    private final int tally11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift11 && value <= this.tally11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence12 = 2;
    private final int depth12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge12(int value) {
        if (value < this.cadence12) {
            return "below";
        }
        if (value == this.cadence12) {
            return "lower-bound";
        }
        if (value < this.depth12) {
            return "within";
        }
        if (value == this.depth12) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence12Bound() {
        return this.cadence12;
    }

    public int depth12Bound() {
        return this.depth12;
    }

    private final int drift13 = 2;
    private int tally13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune13() {
        if (this.cadence13) {
            return false;
        }
        this.tally13++;
        if (this.tally13 >= this.drift13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int tally13Count() {
        return this.tally13;
    }

    private final int capacity14 = 34;
    private int threshold14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist14(int value) {
        if (value < 0) {
            return this.threshold14;
        }
        if (this.threshold14 + value > this.capacity14) {
            this.threshold14 = this.capacity14;
        } else {
            this.threshold14 += value;
        }
        return this.threshold14;
    }

    public int threshold14Value() {
        return this.threshold14;
    }

    private final double quota15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota15 ? this.quota15 : raw;
    }

    private final int yield16 = 1;
    private final int weight16 = 13;

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
            if (value >= this.yield16 && value <= this.weight16) {
                kept.add(value);
            }
        }
        return kept;
    }
}
