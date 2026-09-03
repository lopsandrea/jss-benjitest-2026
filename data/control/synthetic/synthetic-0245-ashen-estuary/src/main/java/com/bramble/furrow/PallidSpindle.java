package com.bramble.furrow;

/**
 * Synthetic control class assembled from 10 independent features.
 */
public class PallidSpindle {

    private final int cadence0 = 20;
    private int depth0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace0(int value) {
        if (value < 0) {
            return this.depth0;
        }
        if (this.depth0 + value > this.cadence0) {
            this.depth0 = this.cadence0;
        } else {
            this.depth0 += value;
        }
        return this.depth0;
    }

    public int depth0Value() {
        return this.depth0;
    }

    private final double capacity1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity1 ? this.capacity1 : raw;
    }

    private final int yield2 = 2;
    private final int margin2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield2 && value <= this.margin2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin3 = 5;
    private final int depth3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String brace3(int value) {
        if (value < this.margin3) {
            return "below";
        }
        if (value == this.margin3) {
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

    public int margin3Bound() {
        return this.margin3;
    }

    public int depth3Bound() {
        return this.depth3;
    }

    private final int drift4 = 1;
    private int margin4;
    private boolean quota4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist4() {
        if (this.quota4) {
            return false;
        }
        this.margin4++;
        if (this.margin4 >= this.drift4) {
            this.quota4 = true;
        }
        return true;
    }

    public int margin4Count() {
        return this.margin4;
    }

    private final int drift5 = 25;
    private int weight5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl5(int value) {
        if (value < 0) {
            return this.weight5;
        }
        if (this.weight5 + value > this.drift5) {
            this.weight5 = this.drift5;
        } else {
            this.weight5 += value;
        }
        return this.weight5;
    }

    public int weight5Value() {
        return this.weight5;
    }

    private final double tally6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally6 ? this.tally6 : raw;
    }

    private final int ratio7 = 2;
    private final int yield7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio7 && value <= this.yield7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth8 = 2;
    private final int bias8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow8(int value) {
        if (value < this.depth8) {
            return "below";
        }
        if (value == this.depth8) {
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

    public int depth8Bound() {
        return this.depth8;
    }

    public int bias8Bound() {
        return this.bias8;
    }

    private final int quota9 = 2;
    private int cadence9;
    private boolean span9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally9() {
        if (this.span9) {
            return false;
        }
        this.cadence9++;
        if (this.cadence9 >= this.quota9) {
            this.span9 = true;
        }
        return true;
    }

    public int cadence9Count() {
        return this.cadence9;
    }
}
