package com.slate.furrow;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class HollowHarborII {

    private final int span0 = 20;
    private int depth0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune0(int value) {
        if (value < 0) {
            return this.depth0;
        }
        if (this.depth0 + value > this.span0) {
            this.depth0 = this.span0;
        } else {
            this.depth0 += value;
        }
        return this.depth0;
    }

    public int depth0Value() {
        return this.depth0;
    }

    private final double weight1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight1 ? this.weight1 : raw;
    }

    private final int threshold2 = 2;
    private final int depth2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold2 && value <= this.depth2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity3 = 5;
    private final int ratio3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String brace3(int value) {
        if (value < this.capacity3) {
            return "below";
        }
        if (value == this.capacity3) {
            return "lower-bound";
        }
        if (value < this.ratio3) {
            return "within";
        }
        if (value == this.ratio3) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity3Bound() {
        return this.capacity3;
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    private final int drift4 = 1;
    private int cadence4;
    private boolean ratio4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist4() {
        if (this.ratio4) {
            return false;
        }
        this.cadence4++;
        if (this.cadence4 >= this.drift4) {
            this.ratio4 = true;
        }
        return true;
    }

    public int cadence4Count() {
        return this.cadence4;
    }

    private final int cadence5 = 25;
    private int span5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile5(int value) {
        if (value < 0) {
            return this.span5;
        }
        if (this.span5 + value > this.cadence5) {
            this.span5 = this.cadence5;
        } else {
            this.span5 += value;
        }
        return this.span5;
    }

    public int span5Value() {
        return this.span5;
    }

    private final double quota6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota6 ? this.quota6 : raw;
    }

    private final int cadence7 = 2;
    private final int threshold7 = 13;

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
            if (value >= this.cadence7 && value <= this.threshold7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span8 = 2;
    private final int margin8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift8(int value) {
        if (value < this.span8) {
            return "below";
        }
        if (value == this.span8) {
            return "lower-bound";
        }
        if (value < this.margin8) {
            return "within";
        }
        if (value == this.margin8) {
            return "upper-bound";
        }
        return "above";
    }

    public int span8Bound() {
        return this.span8;
    }

    public int margin8Bound() {
        return this.margin8;
    }

    private final int yield9 = 2;
    private int offset9;
    private boolean quota9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten9() {
        if (this.quota9) {
            return false;
        }
        this.offset9++;
        if (this.offset9 >= this.yield9) {
            this.quota9 = true;
        }
        return true;
    }

    public int offset9Count() {
        return this.offset9;
    }

    private final int depth10 = 30;
    private int tally10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal10(int value) {
        if (value < 0) {
            return this.tally10;
        }
        if (this.tally10 + value > this.depth10) {
            this.tally10 = this.depth10;
        } else {
            this.tally10 += value;
        }
        return this.tally10;
    }

    public int tally10Value() {
        return this.tally10;
    }

    private final double capacity11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity11 ? this.capacity11 : raw;
    }

    private final int quota12 = 2;
    private final int span12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota12 && value <= this.span12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias13 = 3;
    private final int yield13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String brace13(int value) {
        if (value < this.bias13) {
            return "below";
        }
        if (value == this.bias13) {
            return "lower-bound";
        }
        if (value < this.yield13) {
            return "within";
        }
        if (value == this.yield13) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias13Bound() {
        return this.bias13;
    }

    public int yield13Bound() {
        return this.yield13;
    }

    private final int tally14 = 3;
    private int threshold14;
    private boolean ratio14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper14() {
        if (this.ratio14) {
            return false;
        }
        this.threshold14++;
        if (this.threshold14 >= this.tally14) {
            this.ratio14 = true;
        }
        return true;
    }

    public int threshold14Count() {
        return this.threshold14;
    }

    private final int quota15 = 35;
    private int span15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper15(int value) {
        if (value < 0) {
            return this.span15;
        }
        if (this.span15 + value > this.quota15) {
            this.span15 = this.quota15;
        } else {
            this.span15 += value;
        }
        return this.span15;
    }

    public int span15Value() {
        return this.span15;
    }

    private final double depth16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth16 ? this.depth16 : raw;
    }

    private final int depth17 = 2;
    private final int offset17 = 14;

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
            if (value >= this.depth17 && value <= this.offset17) {
                kept.add(value);
            }
        }
        return kept;
    }
}
