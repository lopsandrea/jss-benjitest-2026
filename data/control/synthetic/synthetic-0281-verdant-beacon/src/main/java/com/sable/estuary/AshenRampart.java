package com.sable.estuary;

/**
 * Synthetic control class assembled from 13 independent features.
 */
public class AshenRampart {

    private final double depth0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth0 ? this.depth0 : raw;
    }

    private final int quota1 = 1;
    private final int yield1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota1 && value <= this.yield1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin2 = 4;
    private final int offset2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate2(int value) {
        if (value < this.margin2) {
            return "below";
        }
        if (value == this.margin2) {
            return "lower-bound";
        }
        if (value < this.offset2) {
            return "within";
        }
        if (value == this.offset2) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin2Bound() {
        return this.margin2;
    }

    public int offset2Bound() {
        return this.offset2;
    }

    private final int drift3 = 4;
    private int quota3;
    private boolean yield3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile3() {
        if (this.yield3) {
            return false;
        }
        this.quota3++;
        if (this.quota3 >= this.drift3) {
            this.yield3 = true;
        }
        return true;
    }

    public int quota3Count() {
        return this.quota3;
    }

    private final int cadence4 = 24;
    private int capacity4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile4(int value) {
        if (value < 0) {
            return this.capacity4;
        }
        if (this.capacity4 + value > this.cadence4) {
            this.capacity4 = this.cadence4;
        } else {
            this.capacity4 += value;
        }
        return this.capacity4;
    }

    public int capacity4Value() {
        return this.capacity4;
    }

    private final double bias5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias5 ? this.bias5 : raw;
    }

    private final int offset6 = 1;
    private final int yield6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset6 && value <= this.yield6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold7 = 5;
    private final int depth7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle7(int value) {
        if (value < this.threshold7) {
            return "below";
        }
        if (value == this.threshold7) {
            return "lower-bound";
        }
        if (value < this.depth7) {
            return "within";
        }
        if (value == this.depth7) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold7Bound() {
        return this.threshold7;
    }

    public int depth7Bound() {
        return this.depth7;
    }

    private final int weight8 = 1;
    private int span8;
    private boolean capacity8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist8() {
        if (this.capacity8) {
            return false;
        }
        this.span8++;
        if (this.span8 >= this.weight8) {
            this.capacity8 = true;
        }
        return true;
    }

    public int span8Count() {
        return this.span8;
    }

    private final int drift9 = 29;
    private int capacity9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate9(int value) {
        if (value < 0) {
            return this.capacity9;
        }
        if (this.capacity9 + value > this.drift9) {
            this.capacity9 = this.drift9;
        } else {
            this.capacity9 += value;
        }
        return this.capacity9;
    }

    public int capacity9Value() {
        return this.capacity9;
    }

    private final double ratio10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio10 ? this.ratio10 : raw;
    }

    private final int offset11 = 1;
    private final int yield11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset11 && value <= this.yield11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset12 = 2;
    private final int capacity12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle12(int value) {
        if (value < this.offset12) {
            return "below";
        }
        if (value == this.offset12) {
            return "lower-bound";
        }
        if (value < this.capacity12) {
            return "within";
        }
        if (value == this.capacity12) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset12Bound() {
        return this.offset12;
    }

    public int capacity12Bound() {
        return this.capacity12;
    }
}
