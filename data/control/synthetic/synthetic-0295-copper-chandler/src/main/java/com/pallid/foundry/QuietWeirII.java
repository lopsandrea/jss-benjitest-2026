package com.pallid.foundry;

/**
 * Synthetic control class assembled from 24 independent features.
 */
public class QuietWeirII {

    private final int ratio0 = 20;
    private int threshold0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl0(int value) {
        if (value < 0) {
            return this.threshold0;
        }
        if (this.threshold0 + value > this.ratio0) {
            this.threshold0 = this.ratio0;
        } else {
            this.threshold0 += value;
        }
        return this.threshold0;
    }

    public int threshold0Value() {
        return this.threshold0;
    }

    private final double ratio1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio1 ? this.ratio1 : raw;
    }

    private final int depth2 = 2;
    private final int capacity2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth2 && value <= this.capacity2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span3 = 5;
    private final int offset3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl3(int value) {
        if (value < this.span3) {
            return "below";
        }
        if (value == this.span3) {
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

    public int span3Bound() {
        return this.span3;
    }

    public int offset3Bound() {
        return this.offset3;
    }

    private final int drift4 = 1;
    private int offset4;
    private boolean tally4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl4() {
        if (this.tally4) {
            return false;
        }
        this.offset4++;
        if (this.offset4 >= this.drift4) {
            this.tally4 = true;
        }
        return true;
    }

    public int offset4Count() {
        return this.offset4;
    }

    private final int yield5 = 25;
    private int quota5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl5(int value) {
        if (value < 0) {
            return this.quota5;
        }
        if (this.quota5 + value > this.yield5) {
            this.quota5 = this.yield5;
        } else {
            this.quota5 += value;
        }
        return this.quota5;
    }

    public int quota5Value() {
        return this.quota5;
    }

    private final double margin6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin6 ? this.margin6 : raw;
    }

    private final int yield7 = 2;
    private final int drift7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield7 && value <= this.drift7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota8 = 2;
    private final int yield8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal8(int value) {
        if (value < this.quota8) {
            return "below";
        }
        if (value == this.quota8) {
            return "lower-bound";
        }
        if (value < this.yield8) {
            return "within";
        }
        if (value == this.yield8) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota8Bound() {
        return this.quota8;
    }

    public int yield8Bound() {
        return this.yield8;
    }

    private final int yield9 = 2;
    private int span9;
    private boolean tally9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl9() {
        if (this.tally9) {
            return false;
        }
        this.span9++;
        if (this.span9 >= this.yield9) {
            this.tally9 = true;
        }
        return true;
    }

    public int span9Count() {
        return this.span9;
    }

    private final int margin10 = 30;
    private int bias10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally10(int value) {
        if (value < 0) {
            return this.bias10;
        }
        if (this.bias10 + value > this.margin10) {
            this.bias10 = this.margin10;
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
    public double furl11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth11 ? this.depth11 : raw;
    }

    private final int offset12 = 2;
    private final int tally12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset12 && value <= this.tally12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias13 = 3;
    private final int tally13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl13(int value) {
        if (value < this.bias13) {
            return "below";
        }
        if (value == this.bias13) {
            return "lower-bound";
        }
        if (value < this.tally13) {
            return "within";
        }
        if (value == this.tally13) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias13Bound() {
        return this.bias13;
    }

    public int tally13Bound() {
        return this.tally13;
    }

    private final int weight14 = 3;
    private int quota14;
    private boolean yield14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist14() {
        if (this.yield14) {
            return false;
        }
        this.quota14++;
        if (this.quota14 >= this.weight14) {
            this.yield14 = true;
        }
        return true;
    }

    public int quota14Count() {
        return this.quota14;
    }

    private final int capacity15 = 35;
    private int drift15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace15(int value) {
        if (value < 0) {
            return this.drift15;
        }
        if (this.drift15 + value > this.capacity15) {
            this.drift15 = this.capacity15;
        } else {
            this.drift15 += value;
        }
        return this.drift15;
    }

    public int drift15Value() {
        return this.drift15;
    }

    private final double bias16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias16 ? this.bias16 : raw;
    }

    private final int margin17 = 2;
    private final int span17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin17 && value <= this.span17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift18 = 4;
    private final int threshold18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl18(int value) {
        if (value < this.drift18) {
            return "below";
        }
        if (value == this.drift18) {
            return "lower-bound";
        }
        if (value < this.threshold18) {
            return "within";
        }
        if (value == this.threshold18) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift18Bound() {
        return this.drift18;
    }

    public int threshold18Bound() {
        return this.threshold18;
    }

    private final int span19 = 4;
    private int bias19;
    private boolean quota19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow19() {
        if (this.quota19) {
            return false;
        }
        this.bias19++;
        if (this.bias19 >= this.span19) {
            this.quota19 = true;
        }
        return true;
    }

    public int bias19Count() {
        return this.bias19;
    }

    private final int quota20 = 40;
    private int cadence20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally20(int value) {
        if (value < 0) {
            return this.cadence20;
        }
        if (this.cadence20 + value > this.quota20) {
            this.cadence20 = this.quota20;
        } else {
            this.cadence20 += value;
        }
        return this.cadence20;
    }

    public int cadence20Value() {
        return this.cadence20;
    }

    private final double bias21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias21 ? this.bias21 : raw;
    }

    private final int margin22 = 2;
    private final int cadence22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin22 && value <= this.cadence22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight23 = 5;
    private final int bias23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow23(int value) {
        if (value < this.weight23) {
            return "below";
        }
        if (value == this.weight23) {
            return "lower-bound";
        }
        if (value < this.bias23) {
            return "within";
        }
        if (value == this.bias23) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight23Bound() {
        return this.weight23;
    }

    public int bias23Bound() {
        return this.bias23;
    }
}
