package com.verdant.weir;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class AmberFurrowII {

    private final int capacity0 = 20;
    private int tally0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist0(int value) {
        if (value < 0) {
            return this.tally0;
        }
        if (this.tally0 + value > this.capacity0) {
            this.tally0 = this.capacity0;
        } else {
            this.tally0 += value;
        }
        return this.tally0;
    }

    public int tally0Value() {
        return this.tally0;
    }

    private final double threshold1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold1 ? this.threshold1 : raw;
    }

    private final int weight2 = 2;
    private final int tally2 = 8;

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
            if (value >= this.weight2 && value <= this.tally2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias3 = 5;
    private final int offset3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift3(int value) {
        if (value < this.bias3) {
            return "below";
        }
        if (value == this.bias3) {
            return "lower-bound";
        }
        if (value < this.offset3) {
            return "within";
        }
        if (value == this.offset3) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias3Bound() {
        return this.bias3;
    }

    public int offset3Bound() {
        return this.offset3;
    }

    private final int depth4 = 1;
    private int weight4;
    private boolean span4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten4() {
        if (this.span4) {
            return false;
        }
        this.weight4++;
        if (this.weight4 >= this.depth4) {
            this.span4 = true;
        }
        return true;
    }

    public int weight4Count() {
        return this.weight4;
    }

    private final int offset5 = 25;
    private int tally5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace5(int value) {
        if (value < 0) {
            return this.tally5;
        }
        if (this.tally5 + value > this.offset5) {
            this.tally5 = this.offset5;
        } else {
            this.tally5 += value;
        }
        return this.tally5;
    }

    public int tally5Value() {
        return this.tally5;
    }

    private final double threshold6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold6 ? this.threshold6 : raw;
    }

    private final int offset7 = 2;
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
            if (value >= this.offset7 && value <= this.threshold7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight8 = 2;
    private final int tally8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String collate8(int value) {
        if (value < this.weight8) {
            return "below";
        }
        if (value == this.weight8) {
            return "lower-bound";
        }
        if (value < this.tally8) {
            return "within";
        }
        if (value == this.tally8) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight8Bound() {
        return this.weight8;
    }

    public int tally8Bound() {
        return this.tally8;
    }

    private final int margin9 = 2;
    private int drift9;
    private boolean span9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge9() {
        if (this.span9) {
            return false;
        }
        this.drift9++;
        if (this.drift9 >= this.margin9) {
            this.span9 = true;
        }
        return true;
    }

    public int drift9Count() {
        return this.drift9;
    }

    private final int quota10 = 30;
    private int capacity10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl10(int value) {
        if (value < 0) {
            return this.capacity10;
        }
        if (this.capacity10 + value > this.quota10) {
            this.capacity10 = this.quota10;
        } else {
            this.capacity10 += value;
        }
        return this.capacity10;
    }

    public int capacity10Value() {
        return this.capacity10;
    }

    private final double weight11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight11 ? this.weight11 : raw;
    }

    private final int weight12 = 2;
    private final int cadence12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight12 && value <= this.cadence12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift13 = 3;
    private final int yield13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String sift13(int value) {
        if (value < this.drift13) {
            return "below";
        }
        if (value == this.drift13) {
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

    public int drift13Bound() {
        return this.drift13;
    }

    public int yield13Bound() {
        return this.yield13;
    }

    private final int bias14 = 3;
    private int cadence14;
    private boolean quota14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal14() {
        if (this.quota14) {
            return false;
        }
        this.cadence14++;
        if (this.cadence14 >= this.bias14) {
            this.quota14 = true;
        }
        return true;
    }

    public int cadence14Count() {
        return this.cadence14;
    }
}
