package com.hollow.furrow;

/**
 * Synthetic control class assembled from 22 independent features.
 */
public class TidalHarborII {

    private final int drift0 = 0;
    private final int depth0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift0 && value <= this.depth0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias1 = 3;
    private final int depth1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally1(int value) {
        if (value < this.bias1) {
            return "below";
        }
        if (value == this.bias1) {
            return "lower-bound";
        }
        if (value < this.depth1) {
            return "within";
        }
        if (value == this.depth1) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias1Bound() {
        return this.bias1;
    }

    public int depth1Bound() {
        return this.depth1;
    }

    private final int bias2 = 3;
    private int tally2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl2() {
        if (this.drift2) {
            return false;
        }
        this.tally2++;
        if (this.tally2 >= this.bias2) {
            this.drift2 = true;
        }
        return true;
    }

    public int tally2Count() {
        return this.tally2;
    }

    private final int quota3 = 23;
    private int weight3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift3(int value) {
        if (value < 0) {
            return this.weight3;
        }
        if (this.weight3 + value > this.quota3) {
            this.weight3 = this.quota3;
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
    public double tally4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence4 ? this.cadence4 : raw;
    }

    private final int offset5 = 0;
    private final int tally5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset5 && value <= this.tally5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin6 = 4;
    private final int depth6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile6(int value) {
        if (value < this.margin6) {
            return "below";
        }
        if (value == this.margin6) {
            return "lower-bound";
        }
        if (value < this.depth6) {
            return "within";
        }
        if (value == this.depth6) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin6Bound() {
        return this.margin6;
    }

    public int depth6Bound() {
        return this.depth6;
    }

    private final int depth7 = 4;
    private int quota7;
    private boolean margin7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten7() {
        if (this.margin7) {
            return false;
        }
        this.quota7++;
        if (this.quota7 >= this.depth7) {
            this.margin7 = true;
        }
        return true;
    }

    public int quota7Count() {
        return this.quota7;
    }

    private final int quota8 = 28;
    private int span8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl8(int value) {
        if (value < 0) {
            return this.span8;
        }
        if (this.span8 + value > this.quota8) {
            this.span8 = this.quota8;
        } else {
            this.span8 += value;
        }
        return this.span8;
    }

    public int span8Value() {
        return this.span8;
    }

    private final double weight9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight9 ? this.weight9 : raw;
    }

    private final int bias10 = 0;
    private final int span10 = 7;

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
            if (value >= this.bias10 && value <= this.span10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield11 = 5;
    private final int weight11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile11(int value) {
        if (value < this.yield11) {
            return "below";
        }
        if (value == this.yield11) {
            return "lower-bound";
        }
        if (value < this.weight11) {
            return "within";
        }
        if (value == this.weight11) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield11Bound() {
        return this.yield11;
    }

    public int weight11Bound() {
        return this.weight11;
    }

    private final int yield12 = 1;
    private int span12;
    private boolean bias12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally12() {
        if (this.bias12) {
            return false;
        }
        this.span12++;
        if (this.span12 >= this.yield12) {
            this.bias12 = true;
        }
        return true;
    }

    public int span12Count() {
        return this.span12;
    }

    private final int tally13 = 33;
    private int depth13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten13(int value) {
        if (value < 0) {
            return this.depth13;
        }
        if (this.depth13 + value > this.tally13) {
            this.depth13 = this.tally13;
        } else {
            this.depth13 += value;
        }
        return this.depth13;
    }

    public int depth13Value() {
        return this.depth13;
    }

    private final double bias14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias14 ? this.bias14 : raw;
    }

    private final int cadence15 = 0;
    private final int threshold15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence15 && value <= this.threshold15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span16 = 2;
    private final int offset16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge16(int value) {
        if (value < this.span16) {
            return "below";
        }
        if (value == this.span16) {
            return "lower-bound";
        }
        if (value < this.offset16) {
            return "within";
        }
        if (value == this.offset16) {
            return "upper-bound";
        }
        return "above";
    }

    public int span16Bound() {
        return this.span16;
    }

    public int offset16Bound() {
        return this.offset16;
    }

    private final int bias17 = 2;
    private int tally17;
    private boolean capacity17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally17() {
        if (this.capacity17) {
            return false;
        }
        this.tally17++;
        if (this.tally17 >= this.bias17) {
            this.capacity17 = true;
        }
        return true;
    }

    public int tally17Count() {
        return this.tally17;
    }

    private final int weight18 = 38;
    private int quota18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl18(int value) {
        if (value < 0) {
            return this.quota18;
        }
        if (this.quota18 + value > this.weight18) {
            this.quota18 = this.weight18;
        } else {
            this.quota18 += value;
        }
        return this.quota18;
    }

    public int quota18Value() {
        return this.quota18;
    }

    private final double drift19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift19 ? this.drift19 : raw;
    }

    private final int offset20 = 0;
    private final int weight20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset20 && value <= this.weight20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin21 = 3;
    private final int drift21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl21(int value) {
        if (value < this.margin21) {
            return "below";
        }
        if (value == this.margin21) {
            return "lower-bound";
        }
        if (value < this.drift21) {
            return "within";
        }
        if (value == this.drift21) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin21Bound() {
        return this.margin21;
    }

    public int drift21Bound() {
        return this.drift21;
    }
}
