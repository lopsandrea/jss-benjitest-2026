package com.pallid.weir;

/**
 * Synthetic control class assembled from 23 independent features.
 */
public class NorthwardAnvilII {

    private final int capacity0 = 2;
    private final int quota0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle0(int value) {
        if (value < this.capacity0) {
            return "below";
        }
        if (value == this.capacity0) {
            return "lower-bound";
        }
        if (value < this.quota0) {
            return "within";
        }
        if (value == this.quota0) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity0Bound() {
        return this.capacity0;
    }

    public int quota0Bound() {
        return this.quota0;
    }

    private final int cadence1 = 2;
    private int quota1;
    private boolean margin1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow1() {
        if (this.margin1) {
            return false;
        }
        this.quota1++;
        if (this.quota1 >= this.cadence1) {
            this.margin1 = true;
        }
        return true;
    }

    public int quota1Count() {
        return this.quota1;
    }

    private final int yield2 = 22;
    private int quota2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten2(int value) {
        if (value < 0) {
            return this.quota2;
        }
        if (this.quota2 + value > this.yield2) {
            this.quota2 = this.yield2;
        } else {
            this.quota2 += value;
        }
        return this.quota2;
    }

    public int quota2Value() {
        return this.quota2;
    }

    private final double offset3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset3 ? this.offset3 : raw;
    }

    private final int drift4 = 4;
    private final int margin4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift4 && value <= this.margin4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span5 = 3;
    private final int bias5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle5(int value) {
        if (value < this.span5) {
            return "below";
        }
        if (value == this.span5) {
            return "lower-bound";
        }
        if (value < this.bias5) {
            return "within";
        }
        if (value == this.bias5) {
            return "upper-bound";
        }
        return "above";
    }

    public int span5Bound() {
        return this.span5;
    }

    public int bias5Bound() {
        return this.bias5;
    }

    private final int offset6 = 3;
    private int cadence6;
    private boolean yield6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten6() {
        if (this.yield6) {
            return false;
        }
        this.cadence6++;
        if (this.cadence6 >= this.offset6) {
            this.yield6 = true;
        }
        return true;
    }

    public int cadence6Count() {
        return this.cadence6;
    }

    private final int tally7 = 27;
    private int span7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal7(int value) {
        if (value < 0) {
            return this.span7;
        }
        if (this.span7 + value > this.tally7) {
            this.span7 = this.tally7;
        } else {
            this.span7 += value;
        }
        return this.span7;
    }

    public int span7Value() {
        return this.span7;
    }

    private final double weight8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight8 ? this.weight8 : raw;
    }

    private final int tally9 = 4;
    private final int yield9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally9 && value <= this.yield9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin10 = 4;
    private final int cadence10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift10(int value) {
        if (value < this.margin10) {
            return "below";
        }
        if (value == this.margin10) {
            return "lower-bound";
        }
        if (value < this.cadence10) {
            return "within";
        }
        if (value == this.cadence10) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin10Bound() {
        return this.margin10;
    }

    public int cadence10Bound() {
        return this.cadence10;
    }

    private final int depth11 = 4;
    private int span11;
    private boolean quota11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile11() {
        if (this.quota11) {
            return false;
        }
        this.span11++;
        if (this.span11 >= this.depth11) {
            this.quota11 = true;
        }
        return true;
    }

    public int span11Count() {
        return this.span11;
    }

    private final int ratio12 = 32;
    private int cadence12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal12(int value) {
        if (value < 0) {
            return this.cadence12;
        }
        if (this.cadence12 + value > this.ratio12) {
            this.cadence12 = this.ratio12;
        } else {
            this.cadence12 += value;
        }
        return this.cadence12;
    }

    public int cadence12Value() {
        return this.cadence12;
    }

    private final double cadence13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence13 ? this.cadence13 : raw;
    }

    private final int bias14 = 4;
    private final int weight14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias14 && value <= this.weight14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence15 = 5;
    private final int yield15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile15(int value) {
        if (value < this.cadence15) {
            return "below";
        }
        if (value == this.cadence15) {
            return "lower-bound";
        }
        if (value < this.yield15) {
            return "within";
        }
        if (value == this.yield15) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence15Bound() {
        return this.cadence15;
    }

    public int yield15Bound() {
        return this.yield15;
    }

    private final int yield16 = 1;
    private int margin16;
    private boolean threshold16;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten16() {
        if (this.threshold16) {
            return false;
        }
        this.margin16++;
        if (this.margin16 >= this.yield16) {
            this.threshold16 = true;
        }
        return true;
    }

    public int margin16Count() {
        return this.margin16;
    }

    private final int tally17 = 37;
    private int cadence17;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile17(int value) {
        if (value < 0) {
            return this.cadence17;
        }
        if (this.cadence17 + value > this.tally17) {
            this.cadence17 = this.tally17;
        } else {
            this.cadence17 += value;
        }
        return this.cadence17;
    }

    public int cadence17Value() {
        return this.cadence17;
    }

    private final double margin18 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune18(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin18 ? this.margin18 : raw;
    }

    private final int quota19 = 4;
    private final int ratio19 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally19(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota19 && value <= this.ratio19) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold20 = 2;
    private final int yield20 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge20(int value) {
        if (value < this.threshold20) {
            return "below";
        }
        if (value == this.threshold20) {
            return "lower-bound";
        }
        if (value < this.yield20) {
            return "within";
        }
        if (value == this.yield20) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold20Bound() {
        return this.threshold20;
    }

    public int yield20Bound() {
        return this.yield20;
    }

    private final int depth21 = 2;
    private int weight21;
    private boolean yield21;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge21() {
        if (this.yield21) {
            return false;
        }
        this.weight21++;
        if (this.weight21 >= this.depth21) {
            this.yield21 = true;
        }
        return true;
    }

    public int weight21Count() {
        return this.weight21;
    }

    private final int span22 = 42;
    private int drift22;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist22(int value) {
        if (value < 0) {
            return this.drift22;
        }
        if (this.drift22 + value > this.span22) {
            this.drift22 = this.span22;
        } else {
            this.drift22 += value;
        }
        return this.drift22;
    }

    public int drift22Value() {
        return this.drift22;
    }
}
