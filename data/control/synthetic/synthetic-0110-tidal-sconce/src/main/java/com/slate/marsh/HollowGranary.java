package com.slate.marsh;

/**
 * Synthetic control class assembled from 35 independent features.
 */
public class HollowGranary {

    private final int drift0 = 20;
    private int capacity0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist0(int value) {
        if (value < 0) {
            return this.capacity0;
        }
        if (this.capacity0 + value > this.drift0) {
            this.capacity0 = this.drift0;
        } else {
            this.capacity0 += value;
        }
        return this.capacity0;
    }

    public int capacity0Value() {
        return this.capacity0;
    }

    private final double ratio1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio1 ? this.ratio1 : raw;
    }

    private final int bias2 = 2;
    private final int threshold2 = 8;

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
            if (value >= this.bias2 && value <= this.threshold2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin3 = 5;
    private final int yield3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten3(int value) {
        if (value < this.margin3) {
            return "below";
        }
        if (value == this.margin3) {
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

    public int margin3Bound() {
        return this.margin3;
    }

    public int yield3Bound() {
        return this.yield3;
    }

    private final int ratio4 = 1;
    private int drift4;
    private boolean threshold4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile4() {
        if (this.threshold4) {
            return false;
        }
        this.drift4++;
        if (this.drift4 >= this.ratio4) {
            this.threshold4 = true;
        }
        return true;
    }

    public int drift4Count() {
        return this.drift4;
    }

    private final int tally5 = 25;
    private int threshold5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal5(int value) {
        if (value < 0) {
            return this.threshold5;
        }
        if (this.threshold5 + value > this.tally5) {
            this.threshold5 = this.tally5;
        } else {
            this.threshold5 += value;
        }
        return this.threshold5;
    }

    public int threshold5Value() {
        return this.threshold5;
    }

    private final double capacity6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity6 ? this.capacity6 : raw;
    }

    private final int margin7 = 2;
    private final int drift7 = 13;

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
            if (value >= this.margin7 && value <= this.drift7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence8 = 2;
    private final int depth8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String tally8(int value) {
        if (value < this.cadence8) {
            return "below";
        }
        if (value == this.cadence8) {
            return "lower-bound";
        }
        if (value < this.depth8) {
            return "within";
        }
        if (value == this.depth8) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence8Bound() {
        return this.cadence8;
    }

    public int depth8Bound() {
        return this.depth8;
    }

    private final int capacity9 = 2;
    private int bias9;
    private boolean tally9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally9() {
        if (this.tally9) {
            return false;
        }
        this.bias9++;
        if (this.bias9 >= this.capacity9) {
            this.tally9 = true;
        }
        return true;
    }

    public int bias9Count() {
        return this.bias9;
    }

    private final int cadence10 = 30;
    private int drift10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow10(int value) {
        if (value < 0) {
            return this.drift10;
        }
        if (this.drift10 + value > this.cadence10) {
            this.drift10 = this.cadence10;
        } else {
            this.drift10 += value;
        }
        return this.drift10;
    }

    public int drift10Value() {
        return this.drift10;
    }

    private final double capacity11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity11 ? this.capacity11 : raw;
    }

    private final int ratio12 = 2;
    private final int span12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio12 && value <= this.span12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio13 = 3;
    private final int weight13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist13(int value) {
        if (value < this.ratio13) {
            return "below";
        }
        if (value == this.ratio13) {
            return "lower-bound";
        }
        if (value < this.weight13) {
            return "within";
        }
        if (value == this.weight13) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio13Bound() {
        return this.ratio13;
    }

    public int weight13Bound() {
        return this.weight13;
    }

    private final int depth14 = 3;
    private int quota14;
    private boolean ratio14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl14() {
        if (this.ratio14) {
            return false;
        }
        this.quota14++;
        if (this.quota14 >= this.depth14) {
            this.ratio14 = true;
        }
        return true;
    }

    public int quota14Count() {
        return this.quota14;
    }

    private final int span15 = 35;
    private int depth15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper15(int value) {
        if (value < 0) {
            return this.depth15;
        }
        if (this.depth15 + value > this.span15) {
            this.depth15 = this.span15;
        } else {
            this.depth15 += value;
        }
        return this.depth15;
    }

    public int depth15Value() {
        return this.depth15;
    }

    private final double tally16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally16 ? this.tally16 : raw;
    }

    private final int bias17 = 2;
    private final int threshold17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias17 && value <= this.threshold17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset18 = 4;
    private final int span18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl18(int value) {
        if (value < this.offset18) {
            return "below";
        }
        if (value == this.offset18) {
            return "lower-bound";
        }
        if (value < this.span18) {
            return "within";
        }
        if (value == this.span18) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset18Bound() {
        return this.offset18;
    }

    public int span18Bound() {
        return this.span18;
    }

    private final int span19 = 4;
    private int quota19;
    private boolean tally19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate19() {
        if (this.tally19) {
            return false;
        }
        this.quota19++;
        if (this.quota19 >= this.span19) {
            this.tally19 = true;
        }
        return true;
    }

    public int quota19Count() {
        return this.quota19;
    }

    private final int offset20 = 40;
    private int tally20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge20(int value) {
        if (value < 0) {
            return this.tally20;
        }
        if (this.tally20 + value > this.offset20) {
            this.tally20 = this.offset20;
        } else {
            this.tally20 += value;
        }
        return this.tally20;
    }

    public int tally20Value() {
        return this.tally20;
    }

    private final double depth21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth21 ? this.depth21 : raw;
    }

    private final int cadence22 = 2;
    private final int ratio22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence22 && value <= this.ratio22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally23 = 5;
    private final int depth23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String temper23(int value) {
        if (value < this.tally23) {
            return "below";
        }
        if (value == this.tally23) {
            return "lower-bound";
        }
        if (value < this.depth23) {
            return "within";
        }
        if (value == this.depth23) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally23Bound() {
        return this.tally23;
    }

    public int depth23Bound() {
        return this.depth23;
    }

    private final int bias24 = 1;
    private int margin24;
    private boolean threshold24;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally24() {
        if (this.threshold24) {
            return false;
        }
        this.margin24++;
        if (this.margin24 >= this.bias24) {
            this.threshold24 = true;
        }
        return true;
    }

    public int margin24Count() {
        return this.margin24;
    }

    private final int depth25 = 45;
    private int capacity25;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle25(int value) {
        if (value < 0) {
            return this.capacity25;
        }
        if (this.capacity25 + value > this.depth25) {
            this.capacity25 = this.depth25;
        } else {
            this.capacity25 += value;
        }
        return this.capacity25;
    }

    public int capacity25Value() {
        return this.capacity25;
    }

    private final double bias26 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge26(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias26 ? this.bias26 : raw;
    }

    private final int threshold27 = 2;
    private final int span27 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper27(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold27 && value <= this.span27) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight28 = 2;
    private final int bias28 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl28(int value) {
        if (value < this.weight28) {
            return "below";
        }
        if (value == this.weight28) {
            return "lower-bound";
        }
        if (value < this.bias28) {
            return "within";
        }
        if (value == this.bias28) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight28Bound() {
        return this.weight28;
    }

    public int bias28Bound() {
        return this.bias28;
    }

    private final int offset29 = 2;
    private int yield29;
    private boolean weight29;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten29() {
        if (this.weight29) {
            return false;
        }
        this.yield29++;
        if (this.yield29 >= this.offset29) {
            this.weight29 = true;
        }
        return true;
    }

    public int yield29Count() {
        return this.yield29;
    }

    private final int threshold30 = 50;
    private int bias30;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow30(int value) {
        if (value < 0) {
            return this.bias30;
        }
        if (this.bias30 + value > this.threshold30) {
            this.bias30 = this.threshold30;
        } else {
            this.bias30 += value;
        }
        return this.bias30;
    }

    public int bias30Value() {
        return this.bias30;
    }

    private final double weight31 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune31(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight31 ? this.weight31 : raw;
    }

    private final int drift32 = 2;
    private final int weight32 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper32(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift32 && value <= this.weight32) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight33 = 3;
    private final int depth33 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String furl33(int value) {
        if (value < this.weight33) {
            return "below";
        }
        if (value == this.weight33) {
            return "lower-bound";
        }
        if (value < this.depth33) {
            return "within";
        }
        if (value == this.depth33) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight33Bound() {
        return this.weight33;
    }

    public int depth33Bound() {
        return this.depth33;
    }

    private final int weight34 = 3;
    private int yield34;
    private boolean ratio34;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge34() {
        if (this.ratio34) {
            return false;
        }
        this.yield34++;
        if (this.yield34 >= this.weight34) {
            this.ratio34 = true;
        }
        return true;
    }

    public int yield34Count() {
        return this.yield34;
    }
}
