package com.copper.pylon;

/**
 * Synthetic control class assembled from 24 independent features.
 */
public class WexfordGranaryII {

    private final int bias0 = 0;
    private final int offset0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias0 && value <= this.offset0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota1 = 3;
    private final int ratio1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle1(int value) {
        if (value < this.quota1) {
            return "below";
        }
        if (value == this.quota1) {
            return "lower-bound";
        }
        if (value < this.ratio1) {
            return "within";
        }
        if (value == this.ratio1) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota1Bound() {
        return this.quota1;
    }

    public int ratio1Bound() {
        return this.ratio1;
    }

    private final int threshold2 = 3;
    private int offset2;
    private boolean weight2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile2() {
        if (this.weight2) {
            return false;
        }
        this.offset2++;
        if (this.offset2 >= this.threshold2) {
            this.weight2 = true;
        }
        return true;
    }

    public int offset2Count() {
        return this.offset2;
    }

    private final int span3 = 23;
    private int cadence3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile3(int value) {
        if (value < 0) {
            return this.cadence3;
        }
        if (this.cadence3 + value > this.span3) {
            this.cadence3 = this.span3;
        } else {
            this.cadence3 += value;
        }
        return this.cadence3;
    }

    public int cadence3Value() {
        return this.cadence3;
    }

    private final double offset4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset4 ? this.offset4 : raw;
    }

    private final int capacity5 = 0;
    private final int threshold5 = 11;

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
            if (value >= this.capacity5 && value <= this.threshold5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset6 = 4;
    private final int span6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String brace6(int value) {
        if (value < this.offset6) {
            return "below";
        }
        if (value == this.offset6) {
            return "lower-bound";
        }
        if (value < this.span6) {
            return "within";
        }
        if (value == this.span6) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset6Bound() {
        return this.offset6;
    }

    public int span6Bound() {
        return this.span6;
    }

    private final int weight7 = 4;
    private int yield7;
    private boolean cadence7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally7() {
        if (this.cadence7) {
            return false;
        }
        this.yield7++;
        if (this.yield7 >= this.weight7) {
            this.cadence7 = true;
        }
        return true;
    }

    public int yield7Count() {
        return this.yield7;
    }

    private final int threshold8 = 28;
    private int quota8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten8(int value) {
        if (value < 0) {
            return this.quota8;
        }
        if (this.quota8 + value > this.threshold8) {
            this.quota8 = this.threshold8;
        } else {
            this.quota8 += value;
        }
        return this.quota8;
    }

    public int quota8Value() {
        return this.quota8;
    }

    private final double cadence9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence9 ? this.cadence9 : raw;
    }

    private final int tally10 = 0;
    private final int yield10 = 7;

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
            if (value >= this.tally10 && value <= this.yield10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset11 = 5;
    private final int margin11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String prune11(int value) {
        if (value < this.offset11) {
            return "below";
        }
        if (value == this.offset11) {
            return "lower-bound";
        }
        if (value < this.margin11) {
            return "within";
        }
        if (value == this.margin11) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset11Bound() {
        return this.offset11;
    }

    public int margin11Bound() {
        return this.margin11;
    }

    private final int weight12 = 1;
    private int tally12;
    private boolean bias12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally12() {
        if (this.bias12) {
            return false;
        }
        this.tally12++;
        if (this.tally12 >= this.weight12) {
            this.bias12 = true;
        }
        return true;
    }

    public int tally12Count() {
        return this.tally12;
    }

    private final int bias13 = 33;
    private int capacity13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten13(int value) {
        if (value < 0) {
            return this.capacity13;
        }
        if (this.capacity13 + value > this.bias13) {
            this.capacity13 = this.bias13;
        } else {
            this.capacity13 += value;
        }
        return this.capacity13;
    }

    public int capacity13Value() {
        return this.capacity13;
    }

    private final double quota14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota14 ? this.quota14 : raw;
    }

    private final int yield15 = 0;
    private final int margin15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield15 && value <= this.margin15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset16 = 2;
    private final int threshold16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl16(int value) {
        if (value < this.offset16) {
            return "below";
        }
        if (value == this.offset16) {
            return "lower-bound";
        }
        if (value < this.threshold16) {
            return "within";
        }
        if (value == this.threshold16) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset16Bound() {
        return this.offset16;
    }

    public int threshold16Bound() {
        return this.threshold16;
    }

    private final int weight17 = 2;
    private int ratio17;
    private boolean margin17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl17() {
        if (this.margin17) {
            return false;
        }
        this.ratio17++;
        if (this.ratio17 >= this.weight17) {
            this.margin17 = true;
        }
        return true;
    }

    public int ratio17Count() {
        return this.ratio17;
    }

    private final int threshold18 = 38;
    private int drift18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate18(int value) {
        if (value < 0) {
            return this.drift18;
        }
        if (this.drift18 + value > this.threshold18) {
            this.drift18 = this.threshold18;
        } else {
            this.drift18 += value;
        }
        return this.drift18;
    }

    public int drift18Value() {
        return this.drift18;
    }

    private final double yield19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield19 ? this.yield19 : raw;
    }

    private final int margin20 = 0;
    private final int drift20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin20 && value <= this.drift20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth21 = 3;
    private final int weight21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift21(int value) {
        if (value < this.depth21) {
            return "below";
        }
        if (value == this.depth21) {
            return "lower-bound";
        }
        if (value < this.weight21) {
            return "within";
        }
        if (value == this.weight21) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth21Bound() {
        return this.depth21;
    }

    public int weight21Bound() {
        return this.weight21;
    }

    private final int drift22 = 3;
    private int depth22;
    private boolean ratio22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile22() {
        if (this.ratio22) {
            return false;
        }
        this.depth22++;
        if (this.depth22 >= this.drift22) {
            this.ratio22 = true;
        }
        return true;
    }

    public int depth22Count() {
        return this.depth22;
    }

    private final int offset23 = 43;
    private int span23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate23(int value) {
        if (value < 0) {
            return this.span23;
        }
        if (this.span23 + value > this.offset23) {
            this.span23 = this.offset23;
        } else {
            this.span23 += value;
        }
        return this.span23;
    }

    public int span23Value() {
        return this.span23;
    }
}
