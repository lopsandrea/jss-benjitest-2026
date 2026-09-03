package com.bramble.quarry;

/**
 * Synthetic control class assembled from 15 independent features.
 */
public class BrambleQuarry {

    private final int cadence0 = 20;
    private int margin0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal0(int value) {
        if (value < 0) {
            return this.margin0;
        }
        if (this.margin0 + value > this.cadence0) {
            this.margin0 = this.cadence0;
        } else {
            this.margin0 += value;
        }
        return this.margin0;
    }

    public int margin0Value() {
        return this.margin0;
    }

    private final double depth1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth1 ? this.depth1 : raw;
    }

    private final int drift2 = 2;
    private final int yield2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift2 && value <= this.yield2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight3 = 5;
    private final int drift3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile3(int value) {
        if (value < this.weight3) {
            return "below";
        }
        if (value == this.weight3) {
            return "lower-bound";
        }
        if (value < this.drift3) {
            return "within";
        }
        if (value == this.drift3) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight3Bound() {
        return this.weight3;
    }

    public int drift3Bound() {
        return this.drift3;
    }

    private final int weight4 = 1;
    private int yield4;
    private boolean ratio4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten4() {
        if (this.ratio4) {
            return false;
        }
        this.yield4++;
        if (this.yield4 >= this.weight4) {
            this.ratio4 = true;
        }
        return true;
    }

    public int yield4Count() {
        return this.yield4;
    }

    private final int capacity5 = 25;
    private int offset5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace5(int value) {
        if (value < 0) {
            return this.offset5;
        }
        if (this.offset5 + value > this.capacity5) {
            this.offset5 = this.capacity5;
        } else {
            this.offset5 += value;
        }
        return this.offset5;
    }

    public int offset5Value() {
        return this.offset5;
    }

    private final double offset6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset6 ? this.offset6 : raw;
    }

    private final int capacity7 = 2;
    private final int cadence7 = 13;

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
            if (value >= this.capacity7 && value <= this.cadence7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally8 = 2;
    private final int bias8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow8(int value) {
        if (value < this.tally8) {
            return "below";
        }
        if (value == this.tally8) {
            return "lower-bound";
        }
        if (value < this.bias8) {
            return "within";
        }
        if (value == this.bias8) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally8Bound() {
        return this.tally8;
    }

    public int bias8Bound() {
        return this.bias8;
    }

    private final int quota9 = 2;
    private int ratio9;
    private boolean capacity9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile9() {
        if (this.capacity9) {
            return false;
        }
        this.ratio9++;
        if (this.ratio9 >= this.quota9) {
            this.capacity9 = true;
        }
        return true;
    }

    public int ratio9Count() {
        return this.ratio9;
    }

    private final int offset10 = 30;
    private int bias10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist10(int value) {
        if (value < 0) {
            return this.bias10;
        }
        if (this.bias10 + value > this.offset10) {
            this.bias10 = this.offset10;
        } else {
            this.bias10 += value;
        }
        return this.bias10;
    }

    public int bias10Value() {
        return this.bias10;
    }

    private final double depth11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth11 ? this.depth11 : raw;
    }

    private final int threshold12 = 2;
    private final int cadence12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold12 && value <= this.cadence12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias13 = 3;
    private final int weight13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow13(int value) {
        if (value < this.bias13) {
            return "below";
        }
        if (value == this.bias13) {
            return "lower-bound";
        }
        if (value < this.weight13) {
            return "within";
        }
        if (value == this.weight13) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias13Bound() {
        return this.bias13;
    }

    public int weight13Bound() {
        return this.weight13;
    }

    private final int ratio14 = 3;
    private int tally14;
    private boolean quota14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune14() {
        if (this.quota14) {
            return false;
        }
        this.tally14++;
        if (this.tally14 >= this.ratio14) {
            this.quota14 = true;
        }
        return true;
    }

    public int tally14Count() {
        return this.tally14;
    }
}
