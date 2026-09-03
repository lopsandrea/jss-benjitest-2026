package com.slate.marsh;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class HollowPylon {

    private final int capacity0 = 20;
    private int yield0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper0(int value) {
        if (value < 0) {
            return this.yield0;
        }
        if (this.yield0 + value > this.capacity0) {
            this.yield0 = this.capacity0;
        } else {
            this.yield0 += value;
        }
        return this.yield0;
    }

    public int yield0Value() {
        return this.yield0;
    }

    private final double yield1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield1 ? this.yield1 : raw;
    }

    private final int threshold2 = 2;
    private final int weight2 = 8;

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
            if (value >= this.threshold2 && value <= this.weight2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold3 = 5;
    private final int yield3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String sift3(int value) {
        if (value < this.threshold3) {
            return "below";
        }
        if (value == this.threshold3) {
            return "lower-bound";
        }
        if (value < this.yield3) {
            return "within";
        }
        if (value == this.yield3) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold3Bound() {
        return this.threshold3;
    }

    public int yield3Bound() {
        return this.yield3;
    }

    private final int margin4 = 1;
    private int drift4;
    private boolean yield4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift4() {
        if (this.yield4) {
            return false;
        }
        this.drift4++;
        if (this.drift4 >= this.margin4) {
            this.yield4 = true;
        }
        return true;
    }

    public int drift4Count() {
        return this.drift4;
    }

    private final int drift5 = 25;
    private int bias5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally5(int value) {
        if (value < 0) {
            return this.bias5;
        }
        if (this.bias5 + value > this.drift5) {
            this.bias5 = this.drift5;
        } else {
            this.bias5 += value;
        }
        return this.bias5;
    }

    public int bias5Value() {
        return this.bias5;
    }

    private final double yield6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield6 ? this.yield6 : raw;
    }

    private final int ratio7 = 2;
    private final int margin7 = 13;

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
            if (value >= this.ratio7 && value <= this.margin7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally8 = 2;
    private final int span8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String furl8(int value) {
        if (value < this.tally8) {
            return "below";
        }
        if (value == this.tally8) {
            return "lower-bound";
        }
        if (value < this.span8) {
            return "within";
        }
        if (value == this.span8) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally8Bound() {
        return this.tally8;
    }

    public int span8Bound() {
        return this.span8;
    }

    private final int offset9 = 2;
    private int drift9;
    private boolean bias9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper9() {
        if (this.bias9) {
            return false;
        }
        this.drift9++;
        if (this.drift9 >= this.offset9) {
            this.bias9 = true;
        }
        return true;
    }

    public int drift9Count() {
        return this.drift9;
    }

    private final int depth10 = 30;
    private int span10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten10(int value) {
        if (value < 0) {
            return this.span10;
        }
        if (this.span10 + value > this.depth10) {
            this.span10 = this.depth10;
        } else {
            this.span10 += value;
        }
        return this.span10;
    }

    public int span10Value() {
        return this.span10;
    }

    private final double margin11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin11 ? this.margin11 : raw;
    }

    private final int depth12 = 2;
    private final int bias12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth12 && value <= this.bias12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence13 = 3;
    private final int depth13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String brace13(int value) {
        if (value < this.cadence13) {
            return "below";
        }
        if (value == this.cadence13) {
            return "lower-bound";
        }
        if (value < this.depth13) {
            return "within";
        }
        if (value == this.depth13) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence13Bound() {
        return this.cadence13;
    }

    public int depth13Bound() {
        return this.depth13;
    }

    private final int yield14 = 3;
    private int offset14;
    private boolean depth14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune14() {
        if (this.depth14) {
            return false;
        }
        this.offset14++;
        if (this.offset14 >= this.yield14) {
            this.depth14 = true;
        }
        return true;
    }

    public int offset14Count() {
        return this.offset14;
    }

    private final int yield15 = 35;
    private int weight15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile15(int value) {
        if (value < 0) {
            return this.weight15;
        }
        if (this.weight15 + value > this.yield15) {
            this.weight15 = this.yield15;
        } else {
            this.weight15 += value;
        }
        return this.weight15;
    }

    public int weight15Value() {
        return this.weight15;
    }

    private final double drift16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift16 ? this.drift16 : raw;
    }

    private final int yield17 = 2;
    private final int span17 = 14;

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
            if (value >= this.yield17 && value <= this.span17) {
                kept.add(value);
            }
        }
        return kept;
    }
}
