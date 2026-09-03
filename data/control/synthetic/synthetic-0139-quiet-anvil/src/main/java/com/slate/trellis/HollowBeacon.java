package com.slate.trellis;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class HollowBeacon {

    private final int cadence0 = 1;
    private int depth0;
    private boolean threshold0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile0() {
        if (this.threshold0) {
            return false;
        }
        this.depth0++;
        if (this.depth0 >= this.cadence0) {
            this.threshold0 = true;
        }
        return true;
    }

    public int depth0Count() {
        return this.depth0;
    }

    private final int drift1 = 21;
    private int ratio1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper1(int value) {
        if (value < 0) {
            return this.ratio1;
        }
        if (this.ratio1 + value > this.drift1) {
            this.ratio1 = this.drift1;
        } else {
            this.ratio1 += value;
        }
        return this.ratio1;
    }

    public int ratio1Value() {
        return this.ratio1;
    }

    private final double span2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span2 ? this.span2 : raw;
    }

    private final int span3 = 3;
    private final int quota3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span3 && value <= this.quota3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity4 = 2;
    private final int span4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl4(int value) {
        if (value < this.capacity4) {
            return "below";
        }
        if (value == this.capacity4) {
            return "lower-bound";
        }
        if (value < this.span4) {
            return "within";
        }
        if (value == this.span4) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity4Bound() {
        return this.capacity4;
    }

    public int span4Bound() {
        return this.span4;
    }

    private final int bias5 = 2;
    private int ratio5;
    private boolean depth5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune5() {
        if (this.depth5) {
            return false;
        }
        this.ratio5++;
        if (this.ratio5 >= this.bias5) {
            this.depth5 = true;
        }
        return true;
    }

    public int ratio5Count() {
        return this.ratio5;
    }

    private final int offset6 = 26;
    private int ratio6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow6(int value) {
        if (value < 0) {
            return this.ratio6;
        }
        if (this.ratio6 + value > this.offset6) {
            this.ratio6 = this.offset6;
        } else {
            this.ratio6 += value;
        }
        return this.ratio6;
    }

    public int ratio6Value() {
        return this.ratio6;
    }

    private final double drift7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift7 ? this.drift7 : raw;
    }

    private final int ratio8 = 3;
    private final int bias8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio8 && value <= this.bias8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset9 = 3;
    private final int depth9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally9(int value) {
        if (value < this.offset9) {
            return "below";
        }
        if (value == this.offset9) {
            return "lower-bound";
        }
        if (value < this.depth9) {
            return "within";
        }
        if (value == this.depth9) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset9Bound() {
        return this.offset9;
    }

    public int depth9Bound() {
        return this.depth9;
    }

    private final int weight10 = 3;
    private int cadence10;
    private boolean bias10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune10() {
        if (this.bias10) {
            return false;
        }
        this.cadence10++;
        if (this.cadence10 >= this.weight10) {
            this.bias10 = true;
        }
        return true;
    }

    public int cadence10Count() {
        return this.cadence10;
    }

    private final int drift11 = 31;
    private int cadence11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally11(int value) {
        if (value < 0) {
            return this.cadence11;
        }
        if (this.cadence11 + value > this.drift11) {
            this.cadence11 = this.drift11;
        } else {
            this.cadence11 += value;
        }
        return this.cadence11;
    }

    public int cadence11Value() {
        return this.cadence11;
    }

    private final double tally12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally12 ? this.tally12 : raw;
    }

    private final int bias13 = 3;
    private final int margin13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias13 && value <= this.margin13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence14 = 4;
    private final int weight14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace14(int value) {
        if (value < this.cadence14) {
            return "below";
        }
        if (value == this.cadence14) {
            return "lower-bound";
        }
        if (value < this.weight14) {
            return "within";
        }
        if (value == this.weight14) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence14Bound() {
        return this.cadence14;
    }

    public int weight14Bound() {
        return this.weight14;
    }
}
