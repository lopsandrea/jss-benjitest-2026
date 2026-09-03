package com.northward.trellis;

/**
 * Synthetic control class assembled from 21 independent features.
 */
public class AmberAnvil {

    private final int depth0 = 0;
    private final int drift0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth0 && value <= this.drift0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias1 = 3;
    private final int threshold1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten1(int value) {
        if (value < this.bias1) {
            return "below";
        }
        if (value == this.bias1) {
            return "lower-bound";
        }
        if (value < this.threshold1) {
            return "within";
        }
        if (value == this.threshold1) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias1Bound() {
        return this.bias1;
    }

    public int threshold1Bound() {
        return this.threshold1;
    }

    private final int capacity2 = 3;
    private int drift2;
    private boolean tally2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune2() {
        if (this.tally2) {
            return false;
        }
        this.drift2++;
        if (this.drift2 >= this.capacity2) {
            this.tally2 = true;
        }
        return true;
    }

    public int drift2Count() {
        return this.drift2;
    }

    private final int yield3 = 23;
    private int weight3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle3(int value) {
        if (value < 0) {
            return this.weight3;
        }
        if (this.weight3 + value > this.yield3) {
            this.weight3 = this.yield3;
        } else {
            this.weight3 += value;
        }
        return this.weight3;
    }

    public int weight3Value() {
        return this.weight3;
    }

    private final double cadence4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence4 ? this.cadence4 : raw;
    }

    private final int quota5 = 0;
    private final int bias5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota5 && value <= this.bias5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota6 = 4;
    private final int tally6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle6(int value) {
        if (value < this.quota6) {
            return "below";
        }
        if (value == this.quota6) {
            return "lower-bound";
        }
        if (value < this.tally6) {
            return "within";
        }
        if (value == this.tally6) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota6Bound() {
        return this.quota6;
    }

    public int tally6Bound() {
        return this.tally6;
    }

    private final int threshold7 = 4;
    private int quota7;
    private boolean span7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl7() {
        if (this.span7) {
            return false;
        }
        this.quota7++;
        if (this.quota7 >= this.threshold7) {
            this.span7 = true;
        }
        return true;
    }

    public int quota7Count() {
        return this.quota7;
    }

    private final int margin8 = 28;
    private int bias8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift8(int value) {
        if (value < 0) {
            return this.bias8;
        }
        if (this.bias8 + value > this.margin8) {
            this.bias8 = this.margin8;
        } else {
            this.bias8 += value;
        }
        return this.bias8;
    }

    public int bias8Value() {
        return this.bias8;
    }

    private final double quota9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota9 ? this.quota9 : raw;
    }

    private final int tally10 = 0;
    private final int depth10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally10 && value <= this.depth10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift11 = 5;
    private final int quota11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow11(int value) {
        if (value < this.drift11) {
            return "below";
        }
        if (value == this.drift11) {
            return "lower-bound";
        }
        if (value < this.quota11) {
            return "within";
        }
        if (value == this.quota11) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift11Bound() {
        return this.drift11;
    }

    public int quota11Bound() {
        return this.quota11;
    }

    private final int bias12 = 1;
    private int ratio12;
    private boolean yield12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift12() {
        if (this.yield12) {
            return false;
        }
        this.ratio12++;
        if (this.ratio12 >= this.bias12) {
            this.yield12 = true;
        }
        return true;
    }

    public int ratio12Count() {
        return this.ratio12;
    }

    private final int margin13 = 33;
    private int cadence13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune13(int value) {
        if (value < 0) {
            return this.cadence13;
        }
        if (this.cadence13 + value > this.margin13) {
            this.cadence13 = this.margin13;
        } else {
            this.cadence13 += value;
        }
        return this.cadence13;
    }

    public int cadence13Value() {
        return this.cadence13;
    }

    private final double margin14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin14 ? this.margin14 : raw;
    }

    private final int depth15 = 0;
    private final int drift15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth15 && value <= this.drift15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth16 = 2;
    private final int ratio16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal16(int value) {
        if (value < this.depth16) {
            return "below";
        }
        if (value == this.depth16) {
            return "lower-bound";
        }
        if (value < this.ratio16) {
            return "within";
        }
        if (value == this.ratio16) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth16Bound() {
        return this.depth16;
    }

    public int ratio16Bound() {
        return this.ratio16;
    }

    private final int margin17 = 2;
    private int drift17;
    private boolean weight17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune17() {
        if (this.weight17) {
            return false;
        }
        this.drift17++;
        if (this.drift17 >= this.margin17) {
            this.weight17 = true;
        }
        return true;
    }

    public int drift17Count() {
        return this.drift17;
    }

    private final int cadence18 = 38;
    private int quota18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune18(int value) {
        if (value < 0) {
            return this.quota18;
        }
        if (this.quota18 + value > this.cadence18) {
            this.quota18 = this.cadence18;
        } else {
            this.quota18 += value;
        }
        return this.quota18;
    }

    public int quota18Value() {
        return this.quota18;
    }

    private final double bias19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias19 ? this.bias19 : raw;
    }

    private final int weight20 = 0;
    private final int drift20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight20 && value <= this.drift20) {
                kept.add(value);
            }
        }
        return kept;
    }
}
