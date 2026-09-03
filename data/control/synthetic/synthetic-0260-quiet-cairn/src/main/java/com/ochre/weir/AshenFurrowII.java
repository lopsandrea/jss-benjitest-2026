package com.ochre.weir;

/**
 * Synthetic control class assembled from 40 independent features.
 */
public class AshenFurrowII {

    private final int ratio0 = 20;
    private int weight0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle0(int value) {
        if (value < 0) {
            return this.weight0;
        }
        if (this.weight0 + value > this.ratio0) {
            this.weight0 = this.ratio0;
        } else {
            this.weight0 += value;
        }
        return this.weight0;
    }

    public int weight0Value() {
        return this.weight0;
    }

    private final double yield1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield1 ? this.yield1 : raw;
    }

    private final int cadence2 = 2;
    private final int span2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence2 && value <= this.span2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence3 = 5;
    private final int depth3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile3(int value) {
        if (value < this.cadence3) {
            return "below";
        }
        if (value == this.cadence3) {
            return "lower-bound";
        }
        if (value < this.depth3) {
            return "within";
        }
        if (value == this.depth3) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence3Bound() {
        return this.cadence3;
    }

    public int depth3Bound() {
        return this.depth3;
    }

    private final int cadence4 = 1;
    private int capacity4;
    private boolean offset4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune4() {
        if (this.offset4) {
            return false;
        }
        this.capacity4++;
        if (this.capacity4 >= this.cadence4) {
            this.offset4 = true;
        }
        return true;
    }

    public int capacity4Count() {
        return this.capacity4;
    }

    private final int margin5 = 25;
    private int ratio5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift5(int value) {
        if (value < 0) {
            return this.ratio5;
        }
        if (this.ratio5 + value > this.margin5) {
            this.ratio5 = this.margin5;
        } else {
            this.ratio5 += value;
        }
        return this.ratio5;
    }

    public int ratio5Value() {
        return this.ratio5;
    }

    private final double bias6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias6 ? this.bias6 : raw;
    }

    private final int offset7 = 2;
    private final int ratio7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset7 && value <= this.ratio7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth8 = 2;
    private final int quota8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift8(int value) {
        if (value < this.depth8) {
            return "below";
        }
        if (value == this.depth8) {
            return "lower-bound";
        }
        if (value < this.quota8) {
            return "within";
        }
        if (value == this.quota8) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth8Bound() {
        return this.depth8;
    }

    public int quota8Bound() {
        return this.quota8;
    }

    private final int drift9 = 2;
    private int margin9;
    private boolean span9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl9() {
        if (this.span9) {
            return false;
        }
        this.margin9++;
        if (this.margin9 >= this.drift9) {
            this.span9 = true;
        }
        return true;
    }

    public int margin9Count() {
        return this.margin9;
    }

    private final int weight10 = 30;
    private int span10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal10(int value) {
        if (value < 0) {
            return this.span10;
        }
        if (this.span10 + value > this.weight10) {
            this.span10 = this.weight10;
        } else {
            this.span10 += value;
        }
        return this.span10;
    }

    public int span10Value() {
        return this.span10;
    }

    private final double bias11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias11 ? this.bias11 : raw;
    }

    private final int yield12 = 2;
    private final int tally12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield12 && value <= this.tally12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight13 = 3;
    private final int bias13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl13(int value) {
        if (value < this.weight13) {
            return "below";
        }
        if (value == this.weight13) {
            return "lower-bound";
        }
        if (value < this.bias13) {
            return "within";
        }
        if (value == this.bias13) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight13Bound() {
        return this.weight13;
    }

    public int bias13Bound() {
        return this.bias13;
    }

    private final int depth14 = 3;
    private int capacity14;
    private boolean weight14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten14() {
        if (this.weight14) {
            return false;
        }
        this.capacity14++;
        if (this.capacity14 >= this.depth14) {
            this.weight14 = true;
        }
        return true;
    }

    public int capacity14Count() {
        return this.capacity14;
    }

    private final int bias15 = 35;
    private int margin15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle15(int value) {
        if (value < 0) {
            return this.margin15;
        }
        if (this.margin15 + value > this.bias15) {
            this.margin15 = this.bias15;
        } else {
            this.margin15 += value;
        }
        return this.margin15;
    }

    public int margin15Value() {
        return this.margin15;
    }

    private final double span16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span16 ? this.span16 : raw;
    }

    private final int cadence17 = 2;
    private final int tally17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence17 && value <= this.tally17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth18 = 4;
    private final int threshold18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper18(int value) {
        if (value < this.depth18) {
            return "below";
        }
        if (value == this.depth18) {
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

    public int depth18Bound() {
        return this.depth18;
    }

    public int threshold18Bound() {
        return this.threshold18;
    }

    private final int offset19 = 4;
    private int quota19;
    private boolean tally19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist19() {
        if (this.tally19) {
            return false;
        }
        this.quota19++;
        if (this.quota19 >= this.offset19) {
            this.tally19 = true;
        }
        return true;
    }

    public int quota19Count() {
        return this.quota19;
    }

    private final int quota20 = 40;
    private int weight20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten20(int value) {
        if (value < 0) {
            return this.weight20;
        }
        if (this.weight20 + value > this.quota20) {
            this.weight20 = this.quota20;
        } else {
            this.weight20 += value;
        }
        return this.weight20;
    }

    public int weight20Value() {
        return this.weight20;
    }

    private final double ratio21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio21 ? this.ratio21 : raw;
    }

    private final int drift22 = 2;
    private final int weight22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift22 && value <= this.weight22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity23 = 5;
    private final int offset23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String temper23(int value) {
        if (value < this.capacity23) {
            return "below";
        }
        if (value == this.capacity23) {
            return "lower-bound";
        }
        if (value < this.offset23) {
            return "within";
        }
        if (value == this.offset23) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity23Bound() {
        return this.capacity23;
    }

    public int offset23Bound() {
        return this.offset23;
    }

    private final int quota24 = 1;
    private int depth24;
    private boolean yield24;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper24() {
        if (this.yield24) {
            return false;
        }
        this.depth24++;
        if (this.depth24 >= this.quota24) {
            this.yield24 = true;
        }
        return true;
    }

    public int depth24Count() {
        return this.depth24;
    }

    private final int margin25 = 45;
    private int bias25;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace25(int value) {
        if (value < 0) {
            return this.bias25;
        }
        if (this.bias25 + value > this.margin25) {
            this.bias25 = this.margin25;
        } else {
            this.bias25 += value;
        }
        return this.bias25;
    }

    public int bias25Value() {
        return this.bias25;
    }

    private final double depth26 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl26(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth26 ? this.depth26 : raw;
    }

    private final int yield27 = 2;
    private final int drift27 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile27(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield27 && value <= this.drift27) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold28 = 2;
    private final int span28 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift28(int value) {
        if (value < this.threshold28) {
            return "below";
        }
        if (value == this.threshold28) {
            return "lower-bound";
        }
        if (value < this.span28) {
            return "within";
        }
        if (value == this.span28) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold28Bound() {
        return this.threshold28;
    }

    public int span28Bound() {
        return this.span28;
    }

    private final int margin29 = 2;
    private int threshold29;
    private boolean drift29;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally29() {
        if (this.drift29) {
            return false;
        }
        this.threshold29++;
        if (this.threshold29 >= this.margin29) {
            this.drift29 = true;
        }
        return true;
    }

    public int threshold29Count() {
        return this.threshold29;
    }

    private final int bias30 = 50;
    private int offset30;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace30(int value) {
        if (value < 0) {
            return this.offset30;
        }
        if (this.offset30 + value > this.bias30) {
            this.offset30 = this.bias30;
        } else {
            this.offset30 += value;
        }
        return this.offset30;
    }

    public int offset30Value() {
        return this.offset30;
    }

    private final double yield31 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune31(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield31 ? this.yield31 : raw;
    }

    private final int weight32 = 2;
    private final int threshold32 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten32(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight32 && value <= this.threshold32) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity33 = 3;
    private final int margin33 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist33(int value) {
        if (value < this.capacity33) {
            return "below";
        }
        if (value == this.capacity33) {
            return "lower-bound";
        }
        if (value < this.margin33) {
            return "within";
        }
        if (value == this.margin33) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity33Bound() {
        return this.capacity33;
    }

    public int margin33Bound() {
        return this.margin33;
    }

    private final int capacity34 = 3;
    private int weight34;
    private boolean yield34;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally34() {
        if (this.yield34) {
            return false;
        }
        this.weight34++;
        if (this.weight34 >= this.capacity34) {
            this.yield34 = true;
        }
        return true;
    }

    public int weight34Count() {
        return this.weight34;
    }

    private final int offset35 = 55;
    private int weight35;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper35(int value) {
        if (value < 0) {
            return this.weight35;
        }
        if (this.weight35 + value > this.offset35) {
            this.weight35 = this.offset35;
        } else {
            this.weight35 += value;
        }
        return this.weight35;
    }

    public int weight35Value() {
        return this.weight35;
    }

    private final double bias36 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally36(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias36 ? this.bias36 : raw;
    }

    private final int depth37 = 2;
    private final int bias37 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl37(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth37 && value <= this.bias37) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold38 = 4;
    private final int depth38 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile38(int value) {
        if (value < this.threshold38) {
            return "below";
        }
        if (value == this.threshold38) {
            return "lower-bound";
        }
        if (value < this.depth38) {
            return "within";
        }
        if (value == this.depth38) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold38Bound() {
        return this.threshold38;
    }

    public int depth38Bound() {
        return this.depth38;
    }

    private final int threshold39 = 4;
    private int bias39;
    private boolean offset39;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift39() {
        if (this.offset39) {
            return false;
        }
        this.bias39++;
        if (this.bias39 >= this.threshold39) {
            this.offset39 = true;
        }
        return true;
    }

    public int bias39Count() {
        return this.bias39;
    }
}
