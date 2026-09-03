package com.northward.foundry;

/**
 * Synthetic control class assembled from 21 independent features.
 */
public class HollowBastion {

    private final int bias0 = 20;
    private int span0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile0(int value) {
        if (value < 0) {
            return this.span0;
        }
        if (this.span0 + value > this.bias0) {
            this.span0 = this.bias0;
        } else {
            this.span0 += value;
        }
        return this.span0;
    }

    public int span0Value() {
        return this.span0;
    }

    private final double ratio1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio1 ? this.ratio1 : raw;
    }

    private final int tally2 = 2;
    private final int span2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally2 && value <= this.span2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset3 = 5;
    private final int bias3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate3(int value) {
        if (value < this.offset3) {
            return "below";
        }
        if (value == this.offset3) {
            return "lower-bound";
        }
        if (value < this.bias3) {
            return "within";
        }
        if (value == this.bias3) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset3Bound() {
        return this.offset3;
    }

    public int bias3Bound() {
        return this.bias3;
    }

    private final int quota4 = 1;
    private int span4;
    private boolean tally4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile4() {
        if (this.tally4) {
            return false;
        }
        this.span4++;
        if (this.span4 >= this.quota4) {
            this.tally4 = true;
        }
        return true;
    }

    public int span4Count() {
        return this.span4;
    }

    private final int offset5 = 25;
    private int drift5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate5(int value) {
        if (value < 0) {
            return this.drift5;
        }
        if (this.drift5 + value > this.offset5) {
            this.drift5 = this.offset5;
        } else {
            this.drift5 += value;
        }
        return this.drift5;
    }

    public int drift5Value() {
        return this.drift5;
    }

    private final double weight6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight6 ? this.weight6 : raw;
    }

    private final int capacity7 = 2;
    private final int depth7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity7 && value <= this.depth7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio8 = 2;
    private final int depth8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String furl8(int value) {
        if (value < this.ratio8) {
            return "below";
        }
        if (value == this.ratio8) {
            return "lower-bound";
        }
        if (value < this.depth8) {
            return "within";
        }
        if (value == this.depth8) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio8Bound() {
        return this.ratio8;
    }

    public int depth8Bound() {
        return this.depth8;
    }

    private final int capacity9 = 2;
    private int drift9;
    private boolean quota9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace9() {
        if (this.quota9) {
            return false;
        }
        this.drift9++;
        if (this.drift9 >= this.capacity9) {
            this.quota9 = true;
        }
        return true;
    }

    public int drift9Count() {
        return this.drift9;
    }

    private final int ratio10 = 30;
    private int span10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile10(int value) {
        if (value < 0) {
            return this.span10;
        }
        if (this.span10 + value > this.ratio10) {
            this.span10 = this.ratio10;
        } else {
            this.span10 += value;
        }
        return this.span10;
    }

    public int span10Value() {
        return this.span10;
    }

    private final double threshold11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold11 ? this.threshold11 : raw;
    }

    private final int yield12 = 2;
    private final int bias12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield12 && value <= this.bias12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth13 = 3;
    private final int bias13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String sift13(int value) {
        if (value < this.depth13) {
            return "below";
        }
        if (value == this.depth13) {
            return "lower-bound";
        }
        if (value < this.bias13) {
            return "within";
        }
        if (value == this.bias13) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth13Bound() {
        return this.depth13;
    }

    public int bias13Bound() {
        return this.bias13;
    }

    private final int ratio14 = 3;
    private int offset14;
    private boolean depth14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow14() {
        if (this.depth14) {
            return false;
        }
        this.offset14++;
        if (this.offset14 >= this.ratio14) {
            this.depth14 = true;
        }
        return true;
    }

    public int offset14Count() {
        return this.offset14;
    }

    private final int weight15 = 35;
    private int offset15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune15(int value) {
        if (value < 0) {
            return this.offset15;
        }
        if (this.offset15 + value > this.weight15) {
            this.offset15 = this.weight15;
        } else {
            this.offset15 += value;
        }
        return this.offset15;
    }

    public int offset15Value() {
        return this.offset15;
    }

    private final double tally16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally16 ? this.tally16 : raw;
    }

    private final int capacity17 = 2;
    private final int ratio17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity17 && value <= this.ratio17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio18 = 4;
    private final int capacity18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow18(int value) {
        if (value < this.ratio18) {
            return "below";
        }
        if (value == this.ratio18) {
            return "lower-bound";
        }
        if (value < this.capacity18) {
            return "within";
        }
        if (value == this.capacity18) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio18Bound() {
        return this.ratio18;
    }

    public int capacity18Bound() {
        return this.capacity18;
    }

    private final int drift19 = 4;
    private int offset19;
    private boolean cadence19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile19() {
        if (this.cadence19) {
            return false;
        }
        this.offset19++;
        if (this.offset19 >= this.drift19) {
            this.cadence19 = true;
        }
        return true;
    }

    public int offset19Count() {
        return this.offset19;
    }

    private final int threshold20 = 40;
    private int offset20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally20(int value) {
        if (value < 0) {
            return this.offset20;
        }
        if (this.offset20 + value > this.threshold20) {
            this.offset20 = this.threshold20;
        } else {
            this.offset20 += value;
        }
        return this.offset20;
    }

    public int offset20Value() {
        return this.offset20;
    }
}
