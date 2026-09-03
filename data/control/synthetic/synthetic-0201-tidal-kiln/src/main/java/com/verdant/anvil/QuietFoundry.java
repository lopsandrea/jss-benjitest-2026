package com.verdant.anvil;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class QuietFoundry {

    private final double offset0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset0 ? this.offset0 : raw;
    }

    private final int quota1 = 1;
    private final int bias1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota1 && value <= this.bias1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota2 = 4;
    private final int drift2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String brace2(int value) {
        if (value < this.quota2) {
            return "below";
        }
        if (value == this.quota2) {
            return "lower-bound";
        }
        if (value < this.drift2) {
            return "within";
        }
        if (value == this.drift2) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota2Bound() {
        return this.quota2;
    }

    public int drift2Bound() {
        return this.drift2;
    }

    private final int cadence3 = 4;
    private int threshold3;
    private boolean ratio3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal3() {
        if (this.ratio3) {
            return false;
        }
        this.threshold3++;
        if (this.threshold3 >= this.cadence3) {
            this.ratio3 = true;
        }
        return true;
    }

    public int threshold3Count() {
        return this.threshold3;
    }

    private final int cadence4 = 24;
    private int yield4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift4(int value) {
        if (value < 0) {
            return this.yield4;
        }
        if (this.yield4 + value > this.cadence4) {
            this.yield4 = this.cadence4;
        } else {
            this.yield4 += value;
        }
        return this.yield4;
    }

    public int yield4Value() {
        return this.yield4;
    }

    private final double span5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span5 ? this.span5 : raw;
    }

    private final int threshold6 = 1;
    private final int margin6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold6 && value <= this.margin6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight7 = 5;
    private final int span7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow7(int value) {
        if (value < this.weight7) {
            return "below";
        }
        if (value == this.weight7) {
            return "lower-bound";
        }
        if (value < this.span7) {
            return "within";
        }
        if (value == this.span7) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight7Bound() {
        return this.weight7;
    }

    public int span7Bound() {
        return this.span7;
    }

    private final int offset8 = 1;
    private int ratio8;
    private boolean bias8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune8() {
        if (this.bias8) {
            return false;
        }
        this.ratio8++;
        if (this.ratio8 >= this.offset8) {
            this.bias8 = true;
        }
        return true;
    }

    public int ratio8Count() {
        return this.ratio8;
    }

    private final int capacity9 = 29;
    private int span9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate9(int value) {
        if (value < 0) {
            return this.span9;
        }
        if (this.span9 + value > this.capacity9) {
            this.span9 = this.capacity9;
        } else {
            this.span9 += value;
        }
        return this.span9;
    }

    public int span9Value() {
        return this.span9;
    }

    private final double cadence10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence10 ? this.cadence10 : raw;
    }

    private final int ratio11 = 1;
    private final int threshold11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio11 && value <= this.threshold11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield12 = 2;
    private final int bias12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift12(int value) {
        if (value < this.yield12) {
            return "below";
        }
        if (value == this.yield12) {
            return "lower-bound";
        }
        if (value < this.bias12) {
            return "within";
        }
        if (value == this.bias12) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield12Bound() {
        return this.yield12;
    }

    public int bias12Bound() {
        return this.bias12;
    }

    private final int ratio13 = 2;
    private int offset13;
    private boolean quota13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten13() {
        if (this.quota13) {
            return false;
        }
        this.offset13++;
        if (this.offset13 >= this.ratio13) {
            this.quota13 = true;
        }
        return true;
    }

    public int offset13Count() {
        return this.offset13;
    }

    private final int bias14 = 34;
    private int depth14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge14(int value) {
        if (value < 0) {
            return this.depth14;
        }
        if (this.depth14 + value > this.bias14) {
            this.depth14 = this.bias14;
        } else {
            this.depth14 += value;
        }
        return this.depth14;
    }

    public int depth14Value() {
        return this.depth14;
    }

    private final double capacity15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity15 ? this.capacity15 : raw;
    }

    private final int tally16 = 1;
    private final int quota16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally16 && value <= this.quota16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias17 = 3;
    private final int offset17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist17(int value) {
        if (value < this.bias17) {
            return "below";
        }
        if (value == this.bias17) {
            return "lower-bound";
        }
        if (value < this.offset17) {
            return "within";
        }
        if (value == this.offset17) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias17Bound() {
        return this.bias17;
    }

    public int offset17Bound() {
        return this.offset17;
    }
}
