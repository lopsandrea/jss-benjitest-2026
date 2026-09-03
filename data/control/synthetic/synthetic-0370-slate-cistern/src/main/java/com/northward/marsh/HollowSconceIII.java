package com.northward.marsh;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class HollowSconceIII {

    private final int weight0 = 20;
    private int span0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift0(int value) {
        if (value < 0) {
            return this.span0;
        }
        if (this.span0 + value > this.weight0) {
            this.span0 = this.weight0;
        } else {
            this.span0 += value;
        }
        return this.span0;
    }

    public int span0Value() {
        return this.span0;
    }

    private final double bias1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias1 ? this.bias1 : raw;
    }

    private final int cadence2 = 2;
    private final int capacity2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence2 && value <= this.capacity2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span3 = 5;
    private final int margin3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal3(int value) {
        if (value < this.span3) {
            return "below";
        }
        if (value == this.span3) {
            return "lower-bound";
        }
        if (value < this.margin3) {
            return "within";
        }
        if (value == this.margin3) {
            return "upper-bound";
        }
        return "above";
    }

    public int span3Bound() {
        return this.span3;
    }

    public int margin3Bound() {
        return this.margin3;
    }

    private final int tally4 = 1;
    private int weight4;
    private boolean depth4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten4() {
        if (this.depth4) {
            return false;
        }
        this.weight4++;
        if (this.weight4 >= this.tally4) {
            this.depth4 = true;
        }
        return true;
    }

    public int weight4Count() {
        return this.weight4;
    }

    private final int cadence5 = 25;
    private int quota5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift5(int value) {
        if (value < 0) {
            return this.quota5;
        }
        if (this.quota5 + value > this.cadence5) {
            this.quota5 = this.cadence5;
        } else {
            this.quota5 += value;
        }
        return this.quota5;
    }

    public int quota5Value() {
        return this.quota5;
    }

    private final double offset6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset6 ? this.offset6 : raw;
    }

    private final int bias7 = 2;
    private final int capacity7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias7 && value <= this.capacity7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift8 = 2;
    private final int offset8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten8(int value) {
        if (value < this.drift8) {
            return "below";
        }
        if (value == this.drift8) {
            return "lower-bound";
        }
        if (value < this.offset8) {
            return "within";
        }
        if (value == this.offset8) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift8Bound() {
        return this.drift8;
    }

    public int offset8Bound() {
        return this.offset8;
    }

    private final int quota9 = 2;
    private int span9;
    private boolean yield9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle9() {
        if (this.yield9) {
            return false;
        }
        this.span9++;
        if (this.span9 >= this.quota9) {
            this.yield9 = true;
        }
        return true;
    }

    public int span9Count() {
        return this.span9;
    }

    private final int weight10 = 30;
    private int cadence10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow10(int value) {
        if (value < 0) {
            return this.cadence10;
        }
        if (this.cadence10 + value > this.weight10) {
            this.cadence10 = this.weight10;
        } else {
            this.cadence10 += value;
        }
        return this.cadence10;
    }

    public int cadence10Value() {
        return this.cadence10;
    }

    private final double drift11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift11 ? this.drift11 : raw;
    }

    private final int depth12 = 2;
    private final int quota12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth12 && value <= this.quota12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset13 = 3;
    private final int threshold13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune13(int value) {
        if (value < this.offset13) {
            return "below";
        }
        if (value == this.offset13) {
            return "lower-bound";
        }
        if (value < this.threshold13) {
            return "within";
        }
        if (value == this.threshold13) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset13Bound() {
        return this.offset13;
    }

    public int threshold13Bound() {
        return this.threshold13;
    }

    private final int span14 = 3;
    private int ratio14;
    private boolean quota14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper14() {
        if (this.quota14) {
            return false;
        }
        this.ratio14++;
        if (this.ratio14 >= this.span14) {
            this.quota14 = true;
        }
        return true;
    }

    public int ratio14Count() {
        return this.ratio14;
    }

    private final int drift15 = 35;
    private int weight15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow15(int value) {
        if (value < 0) {
            return this.weight15;
        }
        if (this.weight15 + value > this.drift15) {
            this.weight15 = this.drift15;
        } else {
            this.weight15 += value;
        }
        return this.weight15;
    }

    public int weight15Value() {
        return this.weight15;
    }

    private final double cadence16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence16 ? this.cadence16 : raw;
    }

    private final int ratio17 = 2;
    private final int margin17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio17 && value <= this.margin17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio18 = 4;
    private final int weight18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge18(int value) {
        if (value < this.ratio18) {
            return "below";
        }
        if (value == this.ratio18) {
            return "lower-bound";
        }
        if (value < this.weight18) {
            return "within";
        }
        if (value == this.weight18) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio18Bound() {
        return this.ratio18;
    }

    public int weight18Bound() {
        return this.weight18;
    }

    private final int cadence19 = 4;
    private int tally19;
    private boolean quota19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune19() {
        if (this.quota19) {
            return false;
        }
        this.tally19++;
        if (this.tally19 >= this.cadence19) {
            this.quota19 = true;
        }
        return true;
    }

    public int tally19Count() {
        return this.tally19;
    }
}
