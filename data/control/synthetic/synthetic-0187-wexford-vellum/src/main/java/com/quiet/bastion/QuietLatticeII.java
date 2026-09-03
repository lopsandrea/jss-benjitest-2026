package com.quiet.bastion;

/**
 * Synthetic control class assembled from 12 independent features.
 */
public class QuietLatticeII {

    private final int ratio0 = 0;
    private final int threshold0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio0 && value <= this.threshold0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias1 = 3;
    private final int threshold1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow1(int value) {
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

    private final int threshold2 = 3;
    private int weight2;
    private boolean margin2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune2() {
        if (this.margin2) {
            return false;
        }
        this.weight2++;
        if (this.weight2 >= this.threshold2) {
            this.margin2 = true;
        }
        return true;
    }

    public int weight2Count() {
        return this.weight2;
    }

    private final int bias3 = 23;
    private int capacity3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal3(int value) {
        if (value < 0) {
            return this.capacity3;
        }
        if (this.capacity3 + value > this.bias3) {
            this.capacity3 = this.bias3;
        } else {
            this.capacity3 += value;
        }
        return this.capacity3;
    }

    public int capacity3Value() {
        return this.capacity3;
    }

    private final double quota4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota4 ? this.quota4 : raw;
    }

    private final int cadence5 = 0;
    private final int ratio5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence5 && value <= this.ratio5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift6 = 4;
    private final int bias6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten6(int value) {
        if (value < this.drift6) {
            return "below";
        }
        if (value == this.drift6) {
            return "lower-bound";
        }
        if (value < this.bias6) {
            return "within";
        }
        if (value == this.bias6) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift6Bound() {
        return this.drift6;
    }

    public int bias6Bound() {
        return this.bias6;
    }

    private final int capacity7 = 4;
    private int offset7;
    private boolean weight7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten7() {
        if (this.weight7) {
            return false;
        }
        this.offset7++;
        if (this.offset7 >= this.capacity7) {
            this.weight7 = true;
        }
        return true;
    }

    public int offset7Count() {
        return this.offset7;
    }

    private final int threshold8 = 28;
    private int tally8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl8(int value) {
        if (value < 0) {
            return this.tally8;
        }
        if (this.tally8 + value > this.threshold8) {
            this.tally8 = this.threshold8;
        } else {
            this.tally8 += value;
        }
        return this.tally8;
    }

    public int tally8Value() {
        return this.tally8;
    }

    private final double weight9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight9 ? this.weight9 : raw;
    }

    private final int drift10 = 0;
    private final int margin10 = 7;

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
            if (value >= this.drift10 && value <= this.margin10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield11 = 5;
    private final int depth11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally11(int value) {
        if (value < this.yield11) {
            return "below";
        }
        if (value == this.yield11) {
            return "lower-bound";
        }
        if (value < this.depth11) {
            return "within";
        }
        if (value == this.depth11) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield11Bound() {
        return this.yield11;
    }

    public int depth11Bound() {
        return this.depth11;
    }
}
