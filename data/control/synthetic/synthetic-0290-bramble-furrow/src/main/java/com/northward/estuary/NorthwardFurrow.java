package com.northward.estuary;

/**
 * Synthetic control class assembled from 20 independent features.
 */
public class NorthwardFurrow {

    private final int drift0 = 20;
    private int threshold0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow0(int value) {
        if (value < 0) {
            return this.threshold0;
        }
        if (this.threshold0 + value > this.drift0) {
            this.threshold0 = this.drift0;
        } else {
            this.threshold0 += value;
        }
        return this.threshold0;
    }

    public int threshold0Value() {
        return this.threshold0;
    }

    private final double span1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span1 ? this.span1 : raw;
    }

    private final int capacity2 = 2;
    private final int depth2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity2 && value <= this.depth2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight3 = 5;
    private final int yield3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String tally3(int value) {
        if (value < this.weight3) {
            return "below";
        }
        if (value == this.weight3) {
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

    public int weight3Bound() {
        return this.weight3;
    }

    public int yield3Bound() {
        return this.yield3;
    }

    private final int capacity4 = 1;
    private int drift4;
    private boolean span4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle4() {
        if (this.span4) {
            return false;
        }
        this.drift4++;
        if (this.drift4 >= this.capacity4) {
            this.span4 = true;
        }
        return true;
    }

    public int drift4Count() {
        return this.drift4;
    }

    private final int offset5 = 25;
    private int tally5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift5(int value) {
        if (value < 0) {
            return this.tally5;
        }
        if (this.tally5 + value > this.offset5) {
            this.tally5 = this.offset5;
        } else {
            this.tally5 += value;
        }
        return this.tally5;
    }

    public int tally5Value() {
        return this.tally5;
    }

    private final double capacity6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity6 ? this.capacity6 : raw;
    }

    private final int depth7 = 2;
    private final int cadence7 = 13;

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
            if (value >= this.depth7 && value <= this.cadence7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally8 = 2;
    private final int offset8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile8(int value) {
        if (value < this.tally8) {
            return "below";
        }
        if (value == this.tally8) {
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

    public int tally8Bound() {
        return this.tally8;
    }

    public int offset8Bound() {
        return this.offset8;
    }

    private final int bias9 = 2;
    private int quota9;
    private boolean yield9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile9() {
        if (this.yield9) {
            return false;
        }
        this.quota9++;
        if (this.quota9 >= this.bias9) {
            this.yield9 = true;
        }
        return true;
    }

    public int quota9Count() {
        return this.quota9;
    }

    private final int span10 = 30;
    private int drift10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune10(int value) {
        if (value < 0) {
            return this.drift10;
        }
        if (this.drift10 + value > this.span10) {
            this.drift10 = this.span10;
        } else {
            this.drift10 += value;
        }
        return this.drift10;
    }

    public int drift10Value() {
        return this.drift10;
    }

    private final double yield11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield11 ? this.yield11 : raw;
    }

    private final int bias12 = 2;
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
            if (value >= this.bias12 && value <= this.tally12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight13 = 3;
    private final int depth13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal13(int value) {
        if (value < this.weight13) {
            return "below";
        }
        if (value == this.weight13) {
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

    public int weight13Bound() {
        return this.weight13;
    }

    public int depth13Bound() {
        return this.depth13;
    }

    private final int capacity14 = 3;
    private int quota14;
    private boolean span14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle14() {
        if (this.span14) {
            return false;
        }
        this.quota14++;
        if (this.quota14 >= this.capacity14) {
            this.span14 = true;
        }
        return true;
    }

    public int quota14Count() {
        return this.quota14;
    }

    private final int drift15 = 35;
    private int depth15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge15(int value) {
        if (value < 0) {
            return this.depth15;
        }
        if (this.depth15 + value > this.drift15) {
            this.depth15 = this.drift15;
        } else {
            this.depth15 += value;
        }
        return this.depth15;
    }

    public int depth15Value() {
        return this.depth15;
    }

    private final double capacity16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity16 ? this.capacity16 : raw;
    }

    private final int quota17 = 2;
    private final int tally17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota17 && value <= this.tally17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield18 = 4;
    private final int margin18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String brace18(int value) {
        if (value < this.yield18) {
            return "below";
        }
        if (value == this.yield18) {
            return "lower-bound";
        }
        if (value < this.margin18) {
            return "within";
        }
        if (value == this.margin18) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield18Bound() {
        return this.yield18;
    }

    public int margin18Bound() {
        return this.margin18;
    }

    private final int cadence19 = 4;
    private int margin19;
    private boolean depth19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally19() {
        if (this.depth19) {
            return false;
        }
        this.margin19++;
        if (this.margin19 >= this.cadence19) {
            this.depth19 = true;
        }
        return true;
    }

    public int margin19Count() {
        return this.margin19;
    }
}
