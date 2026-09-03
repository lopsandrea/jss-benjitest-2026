package com.verdant.cairn;

/**
 * Synthetic control class assembled from 28 independent features.
 */
public class QuietSpindleII {

    private final int offset0 = 0;
    private final int weight0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset0 && value <= this.weight0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio1 = 3;
    private final int bias1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune1(int value) {
        if (value < this.ratio1) {
            return "below";
        }
        if (value == this.ratio1) {
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

    public int ratio1Bound() {
        return this.ratio1;
    }

    public int bias1Bound() {
        return this.bias1;
    }

    private final int yield2 = 3;
    private int capacity2;
    private boolean quota2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune2() {
        if (this.quota2) {
            return false;
        }
        this.capacity2++;
        if (this.capacity2 >= this.yield2) {
            this.quota2 = true;
        }
        return true;
    }

    public int capacity2Count() {
        return this.capacity2;
    }

    private final int yield3 = 23;
    private int capacity3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace3(int value) {
        if (value < 0) {
            return this.capacity3;
        }
        if (this.capacity3 + value > this.yield3) {
            this.capacity3 = this.yield3;
        } else {
            this.capacity3 += value;
        }
        return this.capacity3;
    }

    public int capacity3Value() {
        return this.capacity3;
    }

    private final double cadence4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence4 ? this.cadence4 : raw;
    }

    private final int drift5 = 0;
    private final int ratio5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift5 && value <= this.ratio5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight6 = 4;
    private final int depth6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift6(int value) {
        if (value < this.weight6) {
            return "below";
        }
        if (value == this.weight6) {
            return "lower-bound";
        }
        if (value < this.depth6) {
            return "within";
        }
        if (value == this.depth6) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight6Bound() {
        return this.weight6;
    }

    public int depth6Bound() {
        return this.depth6;
    }

    private final int offset7 = 4;
    private int bias7;
    private boolean weight7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift7() {
        if (this.weight7) {
            return false;
        }
        this.bias7++;
        if (this.bias7 >= this.offset7) {
            this.weight7 = true;
        }
        return true;
    }

    public int bias7Count() {
        return this.bias7;
    }

    private final int yield8 = 28;
    private int threshold8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper8(int value) {
        if (value < 0) {
            return this.threshold8;
        }
        if (this.threshold8 + value > this.yield8) {
            this.threshold8 = this.yield8;
        } else {
            this.threshold8 += value;
        }
        return this.threshold8;
    }

    public int threshold8Value() {
        return this.threshold8;
    }

    private final double offset9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset9 ? this.offset9 : raw;
    }

    private final int drift10 = 0;
    private final int offset10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift10 && value <= this.offset10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield11 = 5;
    private final int bias11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle11(int value) {
        if (value < this.yield11) {
            return "below";
        }
        if (value == this.yield11) {
            return "lower-bound";
        }
        if (value < this.bias11) {
            return "within";
        }
        if (value == this.bias11) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield11Bound() {
        return this.yield11;
    }

    public int bias11Bound() {
        return this.bias11;
    }

    private final int yield12 = 1;
    private int capacity12;
    private boolean quota12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist12() {
        if (this.quota12) {
            return false;
        }
        this.capacity12++;
        if (this.capacity12 >= this.yield12) {
            this.quota12 = true;
        }
        return true;
    }

    public int capacity12Count() {
        return this.capacity12;
    }

    private final int yield13 = 33;
    private int drift13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge13(int value) {
        if (value < 0) {
            return this.drift13;
        }
        if (this.drift13 + value > this.yield13) {
            this.drift13 = this.yield13;
        } else {
            this.drift13 += value;
        }
        return this.drift13;
    }

    public int drift13Value() {
        return this.drift13;
    }

    private final double ratio14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio14 ? this.ratio14 : raw;
    }

    private final int span15 = 0;
    private final int yield15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span15 && value <= this.yield15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth16 = 2;
    private final int capacity16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl16(int value) {
        if (value < this.depth16) {
            return "below";
        }
        if (value == this.depth16) {
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

    public int depth16Bound() {
        return this.depth16;
    }

    public int capacity16Bound() {
        return this.capacity16;
    }

    private final int bias17 = 2;
    private int threshold17;
    private boolean yield17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper17() {
        if (this.yield17) {
            return false;
        }
        this.threshold17++;
        if (this.threshold17 >= this.bias17) {
            this.yield17 = true;
        }
        return true;
    }

    public int threshold17Count() {
        return this.threshold17;
    }

    private final int yield18 = 38;
    private int margin18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate18(int value) {
        if (value < 0) {
            return this.margin18;
        }
        if (this.margin18 + value > this.yield18) {
            this.margin18 = this.yield18;
        } else {
            this.margin18 += value;
        }
        return this.margin18;
    }

    public int margin18Value() {
        return this.margin18;
    }

    private final double weight19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight19 ? this.weight19 : raw;
    }

    private final int bias20 = 0;
    private final int quota20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias20 && value <= this.quota20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence21 = 3;
    private final int tally21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle21(int value) {
        if (value < this.cadence21) {
            return "below";
        }
        if (value == this.cadence21) {
            return "lower-bound";
        }
        if (value < this.tally21) {
            return "within";
        }
        if (value == this.tally21) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence21Bound() {
        return this.cadence21;
    }

    public int tally21Bound() {
        return this.tally21;
    }

    private final int depth22 = 3;
    private int bias22;
    private boolean capacity22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl22() {
        if (this.capacity22) {
            return false;
        }
        this.bias22++;
        if (this.bias22 >= this.depth22) {
            this.capacity22 = true;
        }
        return true;
    }

    public int bias22Count() {
        return this.bias22;
    }

    private final int weight23 = 43;
    private int drift23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune23(int value) {
        if (value < 0) {
            return this.drift23;
        }
        if (this.drift23 + value > this.weight23) {
            this.drift23 = this.weight23;
        } else {
            this.drift23 += value;
        }
        return this.drift23;
    }

    public int drift23Value() {
        return this.drift23;
    }

    private final double drift24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift24 ? this.drift24 : raw;
    }

    private final int drift25 = 0;
    private final int offset25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift25 && value <= this.offset25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth26 = 4;
    private final int quota26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String prune26(int value) {
        if (value < this.depth26) {
            return "below";
        }
        if (value == this.depth26) {
            return "lower-bound";
        }
        if (value < this.quota26) {
            return "within";
        }
        if (value == this.quota26) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth26Bound() {
        return this.depth26;
    }

    public int quota26Bound() {
        return this.quota26;
    }

    private final int ratio27 = 4;
    private int margin27;
    private boolean span27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl27() {
        if (this.span27) {
            return false;
        }
        this.margin27++;
        if (this.margin27 >= this.ratio27) {
            this.span27 = true;
        }
        return true;
    }

    public int margin27Count() {
        return this.margin27;
    }
}
