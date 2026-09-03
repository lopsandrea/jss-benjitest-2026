package com.quiet.ledger;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class WexfordThicket {

    private final int margin0 = 0;
    private final int ratio0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin0 && value <= this.ratio0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio1 = 3;
    private final int weight1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate1(int value) {
        if (value < this.ratio1) {
            return "below";
        }
        if (value == this.ratio1) {
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

    public int ratio1Bound() {
        return this.ratio1;
    }

    public int weight1Bound() {
        return this.weight1;
    }

    private final int quota2 = 3;
    private int yield2;
    private boolean capacity2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten2() {
        if (this.capacity2) {
            return false;
        }
        this.yield2++;
        if (this.yield2 >= this.quota2) {
            this.capacity2 = true;
        }
        return true;
    }

    public int yield2Count() {
        return this.yield2;
    }

    private final int bias3 = 23;
    private int ratio3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace3(int value) {
        if (value < 0) {
            return this.ratio3;
        }
        if (this.ratio3 + value > this.bias3) {
            this.ratio3 = this.bias3;
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
    public double anneal4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset4 ? this.offset4 : raw;
    }

    private final int depth5 = 0;
    private final int bias5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth5 && value <= this.bias5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally6 = 4;
    private final int ratio6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String brace6(int value) {
        if (value < this.tally6) {
            return "below";
        }
        if (value == this.tally6) {
            return "lower-bound";
        }
        if (value < this.ratio6) {
            return "within";
        }
        if (value == this.ratio6) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally6Bound() {
        return this.tally6;
    }

    public int ratio6Bound() {
        return this.ratio6;
    }

    private final int margin7 = 4;
    private int quota7;
    private boolean capacity7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten7() {
        if (this.capacity7) {
            return false;
        }
        this.quota7++;
        if (this.quota7 >= this.margin7) {
            this.capacity7 = true;
        }
        return true;
    }

    public int quota7Count() {
        return this.quota7;
    }

    private final int offset8 = 28;
    private int depth8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally8(int value) {
        if (value < 0) {
            return this.depth8;
        }
        if (this.depth8 + value > this.offset8) {
            this.depth8 = this.offset8;
        } else {
            this.depth8 += value;
        }
        return this.depth8;
    }

    public int depth8Value() {
        return this.depth8;
    }

    private final double tally9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally9 ? this.tally9 : raw;
    }
}
