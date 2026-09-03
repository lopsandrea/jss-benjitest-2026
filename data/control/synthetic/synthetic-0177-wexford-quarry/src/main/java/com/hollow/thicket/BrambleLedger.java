package com.hollow.thicket;

/**
 * Synthetic control class assembled from 19 independent features.
 */
public class BrambleLedger {

    private final int offset0 = 0;
    private final int bias0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset0 && value <= this.bias0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally1 = 3;
    private final int bias1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile1(int value) {
        if (value < this.tally1) {
            return "below";
        }
        if (value == this.tally1) {
            return "lower-bound";
        }
        if (value < this.bias1) {
            return "within";
        }
        if (value == this.bias1) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally1Bound() {
        return this.tally1;
    }

    public int bias1Bound() {
        return this.bias1;
    }

    private final int bias2 = 3;
    private int cadence2;
    private boolean weight2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle2() {
        if (this.weight2) {
            return false;
        }
        this.cadence2++;
        if (this.cadence2 >= this.bias2) {
            this.weight2 = true;
        }
        return true;
    }

    public int cadence2Count() {
        return this.cadence2;
    }

    private final int cadence3 = 23;
    private int quota3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow3(int value) {
        if (value < 0) {
            return this.quota3;
        }
        if (this.quota3 + value > this.cadence3) {
            this.quota3 = this.cadence3;
        } else {
            this.quota3 += value;
        }
        return this.quota3;
    }

    public int quota3Value() {
        return this.quota3;
    }

    private final double yield4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield4 ? this.yield4 : raw;
    }

    private final int yield5 = 0;
    private final int quota5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield5 && value <= this.quota5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight6 = 4;
    private final int span6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten6(int value) {
        if (value < this.weight6) {
            return "below";
        }
        if (value == this.weight6) {
            return "lower-bound";
        }
        if (value < this.span6) {
            return "within";
        }
        if (value == this.span6) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight6Bound() {
        return this.weight6;
    }

    public int span6Bound() {
        return this.span6;
    }

    private final int cadence7 = 4;
    private int margin7;
    private boolean offset7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile7() {
        if (this.offset7) {
            return false;
        }
        this.margin7++;
        if (this.margin7 >= this.cadence7) {
            this.offset7 = true;
        }
        return true;
    }

    public int margin7Count() {
        return this.margin7;
    }

    private final int capacity8 = 28;
    private int margin8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally8(int value) {
        if (value < 0) {
            return this.margin8;
        }
        if (this.margin8 + value > this.capacity8) {
            this.margin8 = this.capacity8;
        } else {
            this.margin8 += value;
        }
        return this.margin8;
    }

    public int margin8Value() {
        return this.margin8;
    }

    private final double span9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span9 ? this.span9 : raw;
    }

    private final int offset10 = 0;
    private final int quota10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset10 && value <= this.quota10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield11 = 5;
    private final int tally11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String brace11(int value) {
        if (value < this.yield11) {
            return "below";
        }
        if (value == this.yield11) {
            return "lower-bound";
        }
        if (value < this.tally11) {
            return "within";
        }
        if (value == this.tally11) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield11Bound() {
        return this.yield11;
    }

    public int tally11Bound() {
        return this.tally11;
    }

    private final int weight12 = 1;
    private int margin12;
    private boolean offset12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist12() {
        if (this.offset12) {
            return false;
        }
        this.margin12++;
        if (this.margin12 >= this.weight12) {
            this.offset12 = true;
        }
        return true;
    }

    public int margin12Count() {
        return this.margin12;
    }

    private final int bias13 = 33;
    private int yield13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate13(int value) {
        if (value < 0) {
            return this.yield13;
        }
        if (this.yield13 + value > this.bias13) {
            this.yield13 = this.bias13;
        } else {
            this.yield13 += value;
        }
        return this.yield13;
    }

    public int yield13Value() {
        return this.yield13;
    }

    private final double cadence14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence14 ? this.cadence14 : raw;
    }

    private final int yield15 = 0;
    private final int offset15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield15 && value <= this.offset15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally16 = 2;
    private final int capacity16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow16(int value) {
        if (value < this.tally16) {
            return "below";
        }
        if (value == this.tally16) {
            return "lower-bound";
        }
        if (value < this.capacity16) {
            return "within";
        }
        if (value == this.capacity16) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally16Bound() {
        return this.tally16;
    }

    public int capacity16Bound() {
        return this.capacity16;
    }

    private final int offset17 = 2;
    private int margin17;
    private boolean threshold17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle17() {
        if (this.threshold17) {
            return false;
        }
        this.margin17++;
        if (this.margin17 >= this.offset17) {
            this.threshold17 = true;
        }
        return true;
    }

    public int margin17Count() {
        return this.margin17;
    }

    private final int yield18 = 38;
    private int depth18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle18(int value) {
        if (value < 0) {
            return this.depth18;
        }
        if (this.depth18 + value > this.yield18) {
            this.depth18 = this.yield18;
        } else {
            this.depth18 += value;
        }
        return this.depth18;
    }

    public int depth18Value() {
        return this.depth18;
    }
}
