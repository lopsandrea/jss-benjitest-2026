package com.sable.sconce;

/**
 * Synthetic control class assembled from 12 independent features.
 */
public class QuietRampartIII {

    private final int threshold0 = 0;
    private final int ratio0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold0 && value <= this.ratio0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin1 = 3;
    private final int cadence1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate1(int value) {
        if (value < this.margin1) {
            return "below";
        }
        if (value == this.margin1) {
            return "lower-bound";
        }
        if (value < this.cadence1) {
            return "within";
        }
        if (value == this.cadence1) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin1Bound() {
        return this.margin1;
    }

    public int cadence1Bound() {
        return this.cadence1;
    }

    private final int ratio2 = 3;
    private int margin2;
    private boolean bias2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile2() {
        if (this.bias2) {
            return false;
        }
        this.margin2++;
        if (this.margin2 >= this.ratio2) {
            this.bias2 = true;
        }
        return true;
    }

    public int margin2Count() {
        return this.margin2;
    }

    private final int offset3 = 23;
    private int threshold3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune3(int value) {
        if (value < 0) {
            return this.threshold3;
        }
        if (this.threshold3 + value > this.offset3) {
            this.threshold3 = this.offset3;
        } else {
            this.threshold3 += value;
        }
        return this.threshold3;
    }

    public int threshold3Value() {
        return this.threshold3;
    }

    private final double quota4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota4 ? this.quota4 : raw;
    }

    private final int drift5 = 0;
    private final int span5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift5 && value <= this.span5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset6 = 4;
    private final int span6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile6(int value) {
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

    private final int ratio7 = 4;
    private int cadence7;
    private boolean offset7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist7() {
        if (this.offset7) {
            return false;
        }
        this.cadence7++;
        if (this.cadence7 >= this.ratio7) {
            this.offset7 = true;
        }
        return true;
    }

    public int cadence7Count() {
        return this.cadence7;
    }

    private final int margin8 = 28;
    private int ratio8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune8(int value) {
        if (value < 0) {
            return this.ratio8;
        }
        if (this.ratio8 + value > this.margin8) {
            this.ratio8 = this.margin8;
        } else {
            this.ratio8 += value;
        }
        return this.ratio8;
    }

    public int ratio8Value() {
        return this.ratio8;
    }

    private final double weight9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight9 ? this.weight9 : raw;
    }

    private final int drift10 = 0;
    private final int bias10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift10 && value <= this.bias10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio11 = 5;
    private final int capacity11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten11(int value) {
        if (value < this.ratio11) {
            return "below";
        }
        if (value == this.ratio11) {
            return "lower-bound";
        }
        if (value < this.capacity11) {
            return "within";
        }
        if (value == this.capacity11) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio11Bound() {
        return this.ratio11;
    }

    public int capacity11Bound() {
        return this.capacity11;
    }
}
