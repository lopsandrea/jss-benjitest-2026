package com.ashen.granary;

/**
 * Synthetic control class assembled from 18 independent features.
 */
public class AmberCairn {

    private final int depth0 = 2;
    private final int ratio0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle0(int value) {
        if (value < this.depth0) {
            return "below";
        }
        if (value == this.depth0) {
            return "lower-bound";
        }
        if (value < this.ratio0) {
            return "within";
        }
        if (value == this.ratio0) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth0Bound() {
        return this.depth0;
    }

    public int ratio0Bound() {
        return this.ratio0;
    }

    private final int margin1 = 2;
    private int weight1;
    private boolean drift1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle1() {
        if (this.drift1) {
            return false;
        }
        this.weight1++;
        if (this.weight1 >= this.margin1) {
            this.drift1 = true;
        }
        return true;
    }

    public int weight1Count() {
        return this.weight1;
    }

    private final int weight2 = 22;
    private int margin2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune2(int value) {
        if (value < 0) {
            return this.margin2;
        }
        if (this.margin2 + value > this.weight2) {
            this.margin2 = this.weight2;
        } else {
            this.margin2 += value;
        }
        return this.margin2;
    }

    public int margin2Value() {
        return this.margin2;
    }

    private final double cadence3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence3 ? this.cadence3 : raw;
    }

    private final int offset4 = 4;
    private final int depth4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset4 && value <= this.depth4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias5 = 3;
    private final int cadence5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal5(int value) {
        if (value < this.bias5) {
            return "below";
        }
        if (value == this.bias5) {
            return "lower-bound";
        }
        if (value < this.cadence5) {
            return "within";
        }
        if (value == this.cadence5) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias5Bound() {
        return this.bias5;
    }

    public int cadence5Bound() {
        return this.cadence5;
    }

    private final int ratio6 = 3;
    private int drift6;
    private boolean depth6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace6() {
        if (this.depth6) {
            return false;
        }
        this.drift6++;
        if (this.drift6 >= this.ratio6) {
            this.depth6 = true;
        }
        return true;
    }

    public int drift6Count() {
        return this.drift6;
    }

    private final int offset7 = 27;
    private int cadence7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace7(int value) {
        if (value < 0) {
            return this.cadence7;
        }
        if (this.cadence7 + value > this.offset7) {
            this.cadence7 = this.offset7;
        } else {
            this.cadence7 += value;
        }
        return this.cadence7;
    }

    public int cadence7Value() {
        return this.cadence7;
    }

    private final double yield8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield8 ? this.yield8 : raw;
    }

    private final int weight9 = 4;
    private final int quota9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight9 && value <= this.quota9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota10 = 4;
    private final int weight10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge10(int value) {
        if (value < this.quota10) {
            return "below";
        }
        if (value == this.quota10) {
            return "lower-bound";
        }
        if (value < this.weight10) {
            return "within";
        }
        if (value == this.weight10) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota10Bound() {
        return this.quota10;
    }

    public int weight10Bound() {
        return this.weight10;
    }

    private final int weight11 = 4;
    private int threshold11;
    private boolean margin11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge11() {
        if (this.margin11) {
            return false;
        }
        this.threshold11++;
        if (this.threshold11 >= this.weight11) {
            this.margin11 = true;
        }
        return true;
    }

    public int threshold11Count() {
        return this.threshold11;
    }

    private final int threshold12 = 32;
    private int cadence12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge12(int value) {
        if (value < 0) {
            return this.cadence12;
        }
        if (this.cadence12 + value > this.threshold12) {
            this.cadence12 = this.threshold12;
        } else {
            this.cadence12 += value;
        }
        return this.cadence12;
    }

    public int cadence12Value() {
        return this.cadence12;
    }

    private final double yield13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield13 ? this.yield13 : raw;
    }

    private final int drift14 = 4;
    private final int threshold14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift14 && value <= this.threshold14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight15 = 5;
    private final int capacity15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle15(int value) {
        if (value < this.weight15) {
            return "below";
        }
        if (value == this.weight15) {
            return "lower-bound";
        }
        if (value < this.capacity15) {
            return "within";
        }
        if (value == this.capacity15) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight15Bound() {
        return this.weight15;
    }

    public int capacity15Bound() {
        return this.capacity15;
    }

    private final int depth16 = 1;
    private int cadence16;
    private boolean threshold16;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal16() {
        if (this.threshold16) {
            return false;
        }
        this.cadence16++;
        if (this.cadence16 >= this.depth16) {
            this.threshold16 = true;
        }
        return true;
    }

    public int cadence16Count() {
        return this.cadence16;
    }

    private final int span17 = 37;
    private int depth17;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten17(int value) {
        if (value < 0) {
            return this.depth17;
        }
        if (this.depth17 + value > this.span17) {
            this.depth17 = this.span17;
        } else {
            this.depth17 += value;
        }
        return this.depth17;
    }

    public int depth17Value() {
        return this.depth17;
    }
}
