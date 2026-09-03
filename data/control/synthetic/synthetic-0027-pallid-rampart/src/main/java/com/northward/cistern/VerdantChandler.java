package com.northward.cistern;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class VerdantChandler {

    private final int depth0 = 0;
    private final int threshold0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth0 && value <= this.threshold0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth1 = 3;
    private final int margin1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String brace1(int value) {
        if (value < this.depth1) {
            return "below";
        }
        if (value == this.depth1) {
            return "lower-bound";
        }
        if (value < this.margin1) {
            return "within";
        }
        if (value == this.margin1) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth1Bound() {
        return this.depth1;
    }

    public int margin1Bound() {
        return this.margin1;
    }

    private final int offset2 = 3;
    private int weight2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle2() {
        if (this.drift2) {
            return false;
        }
        this.weight2++;
        if (this.weight2 >= this.offset2) {
            this.drift2 = true;
        }
        return true;
    }

    public int weight2Count() {
        return this.weight2;
    }

    private final int cadence3 = 23;
    private int ratio3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace3(int value) {
        if (value < 0) {
            return this.ratio3;
        }
        if (this.ratio3 + value > this.cadence3) {
            this.ratio3 = this.cadence3;
        } else {
            this.ratio3 += value;
        }
        return this.ratio3;
    }

    public int ratio3Value() {
        return this.ratio3;
    }

    private final double bias4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias4 ? this.bias4 : raw;
    }

    private final int margin5 = 0;
    private final int drift5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin5 && value <= this.drift5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally6 = 4;
    private final int weight6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl6(int value) {
        if (value < this.tally6) {
            return "below";
        }
        if (value == this.tally6) {
            return "lower-bound";
        }
        if (value < this.weight6) {
            return "within";
        }
        if (value == this.weight6) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally6Bound() {
        return this.tally6;
    }

    public int weight6Bound() {
        return this.weight6;
    }

    private final int offset7 = 4;
    private int span7;
    private boolean tally7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate7() {
        if (this.tally7) {
            return false;
        }
        this.span7++;
        if (this.span7 >= this.offset7) {
            this.tally7 = true;
        }
        return true;
    }

    public int span7Count() {
        return this.span7;
    }

    private final int bias8 = 28;
    private int ratio8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten8(int value) {
        if (value < 0) {
            return this.ratio8;
        }
        if (this.ratio8 + value > this.bias8) {
            this.ratio8 = this.bias8;
        } else {
            this.ratio8 += value;
        }
        return this.ratio8;
    }

    public int ratio8Value() {
        return this.ratio8;
    }

    private final double threshold9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold9 ? this.threshold9 : raw;
    }

    private final int bias10 = 0;
    private final int quota10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias10 && value <= this.quota10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold11 = 5;
    private final int yield11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally11(int value) {
        if (value < this.threshold11) {
            return "below";
        }
        if (value == this.threshold11) {
            return "lower-bound";
        }
        if (value < this.yield11) {
            return "within";
        }
        if (value == this.yield11) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold11Bound() {
        return this.threshold11;
    }

    public int yield11Bound() {
        return this.yield11;
    }

    private final int margin12 = 1;
    private int weight12;
    private boolean depth12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist12() {
        if (this.depth12) {
            return false;
        }
        this.weight12++;
        if (this.weight12 >= this.margin12) {
            this.depth12 = true;
        }
        return true;
    }

    public int weight12Count() {
        return this.weight12;
    }

    private final int cadence13 = 33;
    private int margin13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally13(int value) {
        if (value < 0) {
            return this.margin13;
        }
        if (this.margin13 + value > this.cadence13) {
            this.margin13 = this.cadence13;
        } else {
            this.margin13 += value;
        }
        return this.margin13;
    }

    public int margin13Value() {
        return this.margin13;
    }

    private final double bias14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias14 ? this.bias14 : raw;
    }

    private final int depth15 = 0;
    private final int tally15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth15 && value <= this.tally15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset16 = 2;
    private final int quota16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String tally16(int value) {
        if (value < this.offset16) {
            return "below";
        }
        if (value == this.offset16) {
            return "lower-bound";
        }
        if (value < this.quota16) {
            return "within";
        }
        if (value == this.quota16) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset16Bound() {
        return this.offset16;
    }

    public int quota16Bound() {
        return this.quota16;
    }

    private final int yield17 = 2;
    private int cadence17;
    private boolean threshold17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge17() {
        if (this.threshold17) {
            return false;
        }
        this.cadence17++;
        if (this.cadence17 >= this.yield17) {
            this.threshold17 = true;
        }
        return true;
    }

    public int cadence17Count() {
        return this.cadence17;
    }

    private final int offset18 = 38;
    private int capacity18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate18(int value) {
        if (value < 0) {
            return this.capacity18;
        }
        if (this.capacity18 + value > this.offset18) {
            this.capacity18 = this.offset18;
        } else {
            this.capacity18 += value;
        }
        return this.capacity18;
    }

    public int capacity18Value() {
        return this.capacity18;
    }

    private final double ratio19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio19 ? this.ratio19 : raw;
    }
}
