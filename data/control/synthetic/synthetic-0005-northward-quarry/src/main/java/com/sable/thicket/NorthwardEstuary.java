package com.sable.thicket;

/**
 * Synthetic control class assembled from 13 independent features.
 */
public class NorthwardEstuary {

    private final int quota0 = 20;
    private int drift0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate0(int value) {
        if (value < 0) {
            return this.drift0;
        }
        if (this.drift0 + value > this.quota0) {
            this.drift0 = this.quota0;
        } else {
            this.drift0 += value;
        }
        return this.drift0;
    }

    public int drift0Value() {
        return this.drift0;
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

    private final int margin2 = 2;
    private final int capacity2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin2 && value <= this.capacity2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span3 = 5;
    private final int ratio3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift3(int value) {
        if (value < this.span3) {
            return "below";
        }
        if (value == this.span3) {
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

    public int span3Bound() {
        return this.span3;
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    private final int bias4 = 1;
    private int drift4;
    private boolean quota4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge4() {
        if (this.quota4) {
            return false;
        }
        this.drift4++;
        if (this.drift4 >= this.bias4) {
            this.quota4 = true;
        }
        return true;
    }

    public int drift4Count() {
        return this.drift4;
    }

    private final int span5 = 25;
    private int threshold5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally5(int value) {
        if (value < 0) {
            return this.threshold5;
        }
        if (this.threshold5 + value > this.span5) {
            this.threshold5 = this.span5;
        } else {
            this.threshold5 += value;
        }
        return this.threshold5;
    }

    public int threshold5Value() {
        return this.threshold5;
    }

    private final double tally6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally6 ? this.tally6 : raw;
    }

    private final int tally7 = 2;
    private final int bias7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally7 && value <= this.bias7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin8 = 2;
    private final int drift8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle8(int value) {
        if (value < this.margin8) {
            return "below";
        }
        if (value == this.margin8) {
            return "lower-bound";
        }
        if (value < this.drift8) {
            return "within";
        }
        if (value == this.drift8) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin8Bound() {
        return this.margin8;
    }

    public int drift8Bound() {
        return this.drift8;
    }

    private final int yield9 = 2;
    private int margin9;
    private boolean quota9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten9() {
        if (this.quota9) {
            return false;
        }
        this.margin9++;
        if (this.margin9 >= this.yield9) {
            this.quota9 = true;
        }
        return true;
    }

    public int margin9Count() {
        return this.margin9;
    }

    private final int bias10 = 30;
    private int offset10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile10(int value) {
        if (value < 0) {
            return this.offset10;
        }
        if (this.offset10 + value > this.bias10) {
            this.offset10 = this.bias10;
        } else {
            this.offset10 += value;
        }
        return this.offset10;
    }

    public int offset10Value() {
        return this.offset10;
    }

    private final double capacity11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity11 ? this.capacity11 : raw;
    }

    private final int capacity12 = 2;
    private final int yield12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity12 && value <= this.yield12) {
                kept.add(value);
            }
        }
        return kept;
    }
}
