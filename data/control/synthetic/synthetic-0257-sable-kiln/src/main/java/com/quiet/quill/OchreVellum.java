package com.quiet.quill;

/**
 * Synthetic control class assembled from 14 independent features.
 */
public class OchreVellum {

    private final int span0 = 0;
    private final int depth0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span0 && value <= this.depth0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin1 = 3;
    private final int weight1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune1(int value) {
        if (value < this.margin1) {
            return "below";
        }
        if (value == this.margin1) {
            return "lower-bound";
        }
        if (value < this.weight1) {
            return "within";
        }
        if (value == this.weight1) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin1Bound() {
        return this.margin1;
    }

    public int weight1Bound() {
        return this.weight1;
    }

    private final int bias2 = 3;
    private int cadence2;
    private boolean margin2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal2() {
        if (this.margin2) {
            return false;
        }
        this.cadence2++;
        if (this.cadence2 >= this.bias2) {
            this.margin2 = true;
        }
        return true;
    }

    public int cadence2Count() {
        return this.cadence2;
    }

    private final int offset3 = 23;
    private int ratio3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune3(int value) {
        if (value < 0) {
            return this.ratio3;
        }
        if (this.ratio3 + value > this.offset3) {
            this.ratio3 = this.offset3;
        } else {
            this.ratio3 += value;
        }
        return this.ratio3;
    }

    public int ratio3Value() {
        return this.ratio3;
    }

    private final double offset4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset4 ? this.offset4 : raw;
    }

    private final int capacity5 = 0;
    private final int cadence5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity5 && value <= this.cadence5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio6 = 4;
    private final int drift6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal6(int value) {
        if (value < this.ratio6) {
            return "below";
        }
        if (value == this.ratio6) {
            return "lower-bound";
        }
        if (value < this.drift6) {
            return "within";
        }
        if (value == this.drift6) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio6Bound() {
        return this.ratio6;
    }

    public int drift6Bound() {
        return this.drift6;
    }

    private final int cadence7 = 4;
    private int drift7;
    private boolean yield7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten7() {
        if (this.yield7) {
            return false;
        }
        this.drift7++;
        if (this.drift7 >= this.cadence7) {
            this.yield7 = true;
        }
        return true;
    }

    public int drift7Count() {
        return this.drift7;
    }

    private final int yield8 = 28;
    private int depth8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl8(int value) {
        if (value < 0) {
            return this.depth8;
        }
        if (this.depth8 + value > this.yield8) {
            this.depth8 = this.yield8;
        } else {
            this.depth8 += value;
        }
        return this.depth8;
    }

    public int depth8Value() {
        return this.depth8;
    }

    private final double quota9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota9 ? this.quota9 : raw;
    }

    private final int span10 = 0;
    private final int margin10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span10 && value <= this.margin10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset11 = 5;
    private final int span11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally11(int value) {
        if (value < this.offset11) {
            return "below";
        }
        if (value == this.offset11) {
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

    public int offset11Bound() {
        return this.offset11;
    }

    public int span11Bound() {
        return this.span11;
    }

    private final int cadence12 = 1;
    private int weight12;
    private boolean bias12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist12() {
        if (this.bias12) {
            return false;
        }
        this.weight12++;
        if (this.weight12 >= this.cadence12) {
            this.bias12 = true;
        }
        return true;
    }

    public int weight12Count() {
        return this.weight12;
    }

    private final int margin13 = 33;
    private int weight13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace13(int value) {
        if (value < 0) {
            return this.weight13;
        }
        if (this.weight13 + value > this.margin13) {
            this.weight13 = this.margin13;
        } else {
            this.weight13 += value;
        }
        return this.weight13;
    }

    public int weight13Value() {
        return this.weight13;
    }
}
