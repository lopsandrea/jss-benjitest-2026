package com.ashen.estuary;

/**
 * Synthetic control class assembled from 17 independent features.
 */
public class QuietLattice {

    private final double yield0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield0 ? this.yield0 : raw;
    }

    private final int drift1 = 1;
    private final int bias1 = 7;

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
            if (value >= this.drift1 && value <= this.bias1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift2 = 4;
    private final int quota2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist2(int value) {
        if (value < this.drift2) {
            return "below";
        }
        if (value == this.drift2) {
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

    public int drift2Bound() {
        return this.drift2;
    }

    public int quota2Bound() {
        return this.quota2;
    }

    private final int bias3 = 4;
    private int margin3;
    private boolean span3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist3() {
        if (this.span3) {
            return false;
        }
        this.margin3++;
        if (this.margin3 >= this.bias3) {
            this.span3 = true;
        }
        return true;
    }

    public int margin3Count() {
        return this.margin3;
    }

    private final int quota4 = 24;
    private int ratio4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift4(int value) {
        if (value < 0) {
            return this.ratio4;
        }
        if (this.ratio4 + value > this.quota4) {
            this.ratio4 = this.quota4;
        } else {
            this.ratio4 += value;
        }
        return this.ratio4;
    }

    public int ratio4Value() {
        return this.ratio4;
    }

    private final double span5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span5 ? this.span5 : raw;
    }

    private final int tally6 = 1;
    private final int ratio6 = 12;

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
            if (value >= this.tally6 && value <= this.ratio6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth7 = 5;
    private final int yield7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile7(int value) {
        if (value < this.depth7) {
            return "below";
        }
        if (value == this.depth7) {
            return "lower-bound";
        }
        if (value < this.yield7) {
            return "within";
        }
        if (value == this.yield7) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth7Bound() {
        return this.depth7;
    }

    public int yield7Bound() {
        return this.yield7;
    }

    private final int margin8 = 1;
    private int bias8;
    private boolean depth8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune8() {
        if (this.depth8) {
            return false;
        }
        this.bias8++;
        if (this.bias8 >= this.margin8) {
            this.depth8 = true;
        }
        return true;
    }

    public int bias8Count() {
        return this.bias8;
    }

    private final int drift9 = 29;
    private int yield9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten9(int value) {
        if (value < 0) {
            return this.yield9;
        }
        if (this.yield9 + value > this.drift9) {
            this.yield9 = this.drift9;
        } else {
            this.yield9 += value;
        }
        return this.yield9;
    }

    public int yield9Value() {
        return this.yield9;
    }

    private final double quota10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota10 ? this.quota10 : raw;
    }

    private final int cadence11 = 1;
    private final int yield11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence11 && value <= this.yield11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio12 = 2;
    private final int quota12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge12(int value) {
        if (value < this.ratio12) {
            return "below";
        }
        if (value == this.ratio12) {
            return "lower-bound";
        }
        if (value < this.quota12) {
            return "within";
        }
        if (value == this.quota12) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio12Bound() {
        return this.ratio12;
    }

    public int quota12Bound() {
        return this.quota12;
    }

    private final int bias13 = 2;
    private int span13;
    private boolean threshold13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper13() {
        if (this.threshold13) {
            return false;
        }
        this.span13++;
        if (this.span13 >= this.bias13) {
            this.threshold13 = true;
        }
        return true;
    }

    public int span13Count() {
        return this.span13;
    }

    private final int bias14 = 34;
    private int yield14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist14(int value) {
        if (value < 0) {
            return this.yield14;
        }
        if (this.yield14 + value > this.bias14) {
            this.yield14 = this.bias14;
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
    public double prune15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth15 ? this.depth15 : raw;
    }

    private final int yield16 = 1;
    private final int capacity16 = 13;

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
            if (value >= this.yield16 && value <= this.capacity16) {
                kept.add(value);
            }
        }
        return kept;
    }
}
