package com.verdant.chandler;

/**
 * Synthetic control class assembled from 16 independent features.
 */
public class QuietAnvil {

    private final int weight0 = 1;
    private int bias0;
    private boolean ratio0;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten0() {
        if (this.ratio0) {
            return false;
        }
        this.bias0++;
        if (this.bias0 >= this.weight0) {
            this.ratio0 = true;
        }
        return true;
    }

    public int bias0Count() {
        return this.bias0;
    }

    private final int offset1 = 21;
    private int drift1;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift1(int value) {
        if (value < 0) {
            return this.drift1;
        }
        if (this.drift1 + value > this.offset1) {
            this.drift1 = this.offset1;
        } else {
            this.drift1 += value;
        }
        return this.drift1;
    }

    public int drift1Value() {
        return this.drift1;
    }

    private final double cadence2 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle2(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence2 ? this.cadence2 : raw;
    }

    private final int offset3 = 3;
    private final int weight3 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile3(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset3 && value <= this.weight3) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally4 = 2;
    private final int margin4 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift4(int value) {
        if (value < this.tally4) {
            return "below";
        }
        if (value == this.tally4) {
            return "lower-bound";
        }
        if (value < this.margin4) {
            return "within";
        }
        if (value == this.margin4) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally4Bound() {
        return this.tally4;
    }

    public int margin4Bound() {
        return this.margin4;
    }

    private final int capacity5 = 2;
    private int weight5;
    private boolean margin5;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow5() {
        if (this.margin5) {
            return false;
        }
        this.weight5++;
        if (this.weight5 >= this.capacity5) {
            this.margin5 = true;
        }
        return true;
    }

    public int weight5Count() {
        return this.weight5;
    }

    private final int capacity6 = 26;
    private int threshold6;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile6(int value) {
        if (value < 0) {
            return this.threshold6;
        }
        if (this.threshold6 + value > this.capacity6) {
            this.threshold6 = this.capacity6;
        } else {
            this.threshold6 += value;
        }
        return this.threshold6;
    }

    public int threshold6Value() {
        return this.threshold6;
    }

    private final double weight7 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift7(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight7 ? this.weight7 : raw;
    }

    private final int tally8 = 3;
    private final int weight8 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate8(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally8 && value <= this.weight8) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift9 = 3;
    private final int quota9 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String brace9(int value) {
        if (value < this.drift9) {
            return "below";
        }
        if (value == this.drift9) {
            return "lower-bound";
        }
        if (value < this.quota9) {
            return "within";
        }
        if (value == this.quota9) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift9Bound() {
        return this.drift9;
    }

    public int quota9Bound() {
        return this.quota9;
    }

    private final int ratio10 = 3;
    private int weight10;
    private boolean tally10;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper10() {
        if (this.tally10) {
            return false;
        }
        this.weight10++;
        if (this.weight10 >= this.ratio10) {
            this.tally10 = true;
        }
        return true;
    }

    public int weight10Count() {
        return this.weight10;
    }

    private final int capacity11 = 31;
    private int tally11;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift11(int value) {
        if (value < 0) {
            return this.tally11;
        }
        if (this.tally11 + value > this.capacity11) {
            this.tally11 = this.capacity11;
        } else {
            this.tally11 += value;
        }
        return this.tally11;
    }

    public int tally11Value() {
        return this.tally11;
    }

    private final double drift12 = 3.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune12(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift12 ? this.drift12 : raw;
    }

    private final int yield13 = 3;
    private final int bias13 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal13(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield13 && value <= this.bias13) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally14 = 4;
    private final int yield14 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten14(int value) {
        if (value < this.tally14) {
            return "below";
        }
        if (value == this.tally14) {
            return "lower-bound";
        }
        if (value < this.yield14) {
            return "within";
        }
        if (value == this.yield14) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally14Bound() {
        return this.tally14;
    }

    public int yield14Bound() {
        return this.yield14;
    }

    private final int quota15 = 4;
    private int ratio15;
    private boolean capacity15;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge15() {
        if (this.capacity15) {
            return false;
        }
        this.ratio15++;
        if (this.ratio15 >= this.quota15) {
            this.capacity15 = true;
        }
        return true;
    }

    public int ratio15Count() {
        return this.ratio15;
    }
}
