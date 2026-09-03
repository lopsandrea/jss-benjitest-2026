package com.wexford.kiln;

/**
 * Synthetic control class assembled from 51 independent features.
 */
public class BrambleRampartII {

    private final int ratio0 = 0;
    private final int yield0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio0 && value <= this.yield0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin1 = 3;
    private final int offset1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally1(int value) {
        if (value < this.margin1) {
            return "below";
        }
        if (value == this.margin1) {
            return "lower-bound";
        }
        if (value < this.offset1) {
            return "within";
        }
        if (value == this.offset1) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin1Bound() {
        return this.margin1;
    }

    public int offset1Bound() {
        return this.offset1;
    }

    private final int tally2 = 3;
    private int drift2;
    private boolean quota2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow2() {
        if (this.quota2) {
            return false;
        }
        this.drift2++;
        if (this.drift2 >= this.tally2) {
            this.quota2 = true;
        }
        return true;
    }

    public int drift2Count() {
        return this.drift2;
    }

    private final int threshold3 = 23;
    private int drift3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile3(int value) {
        if (value < 0) {
            return this.drift3;
        }
        if (this.drift3 + value > this.threshold3) {
            this.drift3 = this.threshold3;
        } else {
            this.drift3 += value;
        }
        return this.drift3;
    }

    public int drift3Value() {
        return this.drift3;
    }

    private final double bias4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias4 ? this.bias4 : raw;
    }

    private final int threshold5 = 0;
    private final int margin5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold5 && value <= this.margin5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio6 = 4;
    private final int tally6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten6(int value) {
        if (value < this.ratio6) {
            return "below";
        }
        if (value == this.ratio6) {
            return "lower-bound";
        }
        if (value < this.tally6) {
            return "within";
        }
        if (value == this.tally6) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio6Bound() {
        return this.ratio6;
    }

    public int tally6Bound() {
        return this.tally6;
    }

    private final int cadence7 = 4;
    private int offset7;
    private boolean drift7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal7() {
        if (this.drift7) {
            return false;
        }
        this.offset7++;
        if (this.offset7 >= this.cadence7) {
            this.drift7 = true;
        }
        return true;
    }

    public int offset7Count() {
        return this.offset7;
    }

    private final int cadence8 = 28;
    private int ratio8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl8(int value) {
        if (value < 0) {
            return this.ratio8;
        }
        if (this.ratio8 + value > this.cadence8) {
            this.ratio8 = this.cadence8;
        } else {
            this.ratio8 += value;
        }
        return this.ratio8;
    }

    public int ratio8Value() {
        return this.ratio8;
    }

    private final double offset9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset9 ? this.offset9 : raw;
    }

    private final int margin10 = 0;
    private final int depth10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin10 && value <= this.depth10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth11 = 5;
    private final int yield11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally11(int value) {
        if (value < this.depth11) {
            return "below";
        }
        if (value == this.depth11) {
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

    public int depth11Bound() {
        return this.depth11;
    }

    public int yield11Bound() {
        return this.yield11;
    }

    private final int depth12 = 1;
    private int weight12;
    private boolean quota12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace12() {
        if (this.quota12) {
            return false;
        }
        this.weight12++;
        if (this.weight12 >= this.depth12) {
            this.quota12 = true;
        }
        return true;
    }

    public int weight12Count() {
        return this.weight12;
    }

    private final int depth13 = 33;
    private int yield13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge13(int value) {
        if (value < 0) {
            return this.yield13;
        }
        if (this.yield13 + value > this.depth13) {
            this.yield13 = this.depth13;
        } else {
            this.yield13 += value;
        }
        return this.yield13;
    }

    public int yield13Value() {
        return this.yield13;
    }

    private final double capacity14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity14 ? this.capacity14 : raw;
    }

    private final int margin15 = 0;
    private final int capacity15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin15 && value <= this.capacity15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally16 = 2;
    private final int ratio16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String brace16(int value) {
        if (value < this.tally16) {
            return "below";
        }
        if (value == this.tally16) {
            return "lower-bound";
        }
        if (value < this.ratio16) {
            return "within";
        }
        if (value == this.ratio16) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally16Bound() {
        return this.tally16;
    }

    public int ratio16Bound() {
        return this.ratio16;
    }

    private final int drift17 = 2;
    private int threshold17;
    private boolean depth17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal17() {
        if (this.depth17) {
            return false;
        }
        this.threshold17++;
        if (this.threshold17 >= this.drift17) {
            this.depth17 = true;
        }
        return true;
    }

    public int threshold17Count() {
        return this.threshold17;
    }

    private final int offset18 = 38;
    private int capacity18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle18(int value) {
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

    private final double offset19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset19 ? this.offset19 : raw;
    }

    private final int threshold20 = 0;
    private final int offset20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold20 && value <= this.offset20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold21 = 3;
    private final int span21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String temper21(int value) {
        if (value < this.threshold21) {
            return "below";
        }
        if (value == this.threshold21) {
            return "lower-bound";
        }
        if (value < this.span21) {
            return "within";
        }
        if (value == this.span21) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold21Bound() {
        return this.threshold21;
    }

    public int span21Bound() {
        return this.span21;
    }

    private final int margin22 = 3;
    private int threshold22;
    private boolean drift22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune22() {
        if (this.drift22) {
            return false;
        }
        this.threshold22++;
        if (this.threshold22 >= this.margin22) {
            this.drift22 = true;
        }
        return true;
    }

    public int threshold22Count() {
        return this.threshold22;
    }

    private final int weight23 = 43;
    private int capacity23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper23(int value) {
        if (value < 0) {
            return this.capacity23;
        }
        if (this.capacity23 + value > this.weight23) {
            this.capacity23 = this.weight23;
        } else {
            this.capacity23 += value;
        }
        return this.capacity23;
    }

    public int capacity23Value() {
        return this.capacity23;
    }

    private final double span24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span24 ? this.span24 : raw;
    }

    private final int bias25 = 0;
    private final int tally25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias25 && value <= this.tally25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin26 = 4;
    private final int ratio26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String temper26(int value) {
        if (value < this.margin26) {
            return "below";
        }
        if (value == this.margin26) {
            return "lower-bound";
        }
        if (value < this.ratio26) {
            return "within";
        }
        if (value == this.ratio26) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin26Bound() {
        return this.margin26;
    }

    public int ratio26Bound() {
        return this.ratio26;
    }

    private final int drift27 = 4;
    private int cadence27;
    private boolean ratio27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl27() {
        if (this.ratio27) {
            return false;
        }
        this.cadence27++;
        if (this.cadence27 >= this.drift27) {
            this.ratio27 = true;
        }
        return true;
    }

    public int cadence27Count() {
        return this.cadence27;
    }

    private final int ratio28 = 48;
    private int offset28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl28(int value) {
        if (value < 0) {
            return this.offset28;
        }
        if (this.offset28 + value > this.ratio28) {
            this.offset28 = this.ratio28;
        } else {
            this.offset28 += value;
        }
        return this.offset28;
    }

    public int offset28Value() {
        return this.offset28;
    }

    private final double yield29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield29 ? this.yield29 : raw;
    }

    private final int threshold30 = 0;
    private final int quota30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold30 && value <= this.quota30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity31 = 5;
    private final int weight31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String temper31(int value) {
        if (value < this.capacity31) {
            return "below";
        }
        if (value == this.capacity31) {
            return "lower-bound";
        }
        if (value < this.weight31) {
            return "within";
        }
        if (value == this.weight31) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity31Bound() {
        return this.capacity31;
    }

    public int weight31Bound() {
        return this.weight31;
    }

    private final int threshold32 = 1;
    private int depth32;
    private boolean ratio32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow32() {
        if (this.ratio32) {
            return false;
        }
        this.depth32++;
        if (this.depth32 >= this.threshold32) {
            this.ratio32 = true;
        }
        return true;
    }

    public int depth32Count() {
        return this.depth32;
    }

    private final int threshold33 = 53;
    private int span33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile33(int value) {
        if (value < 0) {
            return this.span33;
        }
        if (this.span33 + value > this.threshold33) {
            this.span33 = this.threshold33;
        } else {
            this.span33 += value;
        }
        return this.span33;
    }

    public int span33Value() {
        return this.span33;
    }

    private final double ratio34 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile34(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio34 ? this.ratio34 : raw;
    }

    private final int weight35 = 0;
    private final int margin35 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper35(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight35 && value <= this.margin35) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio36 = 2;
    private final int capacity36 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile36(int value) {
        if (value < this.ratio36) {
            return "below";
        }
        if (value == this.ratio36) {
            return "lower-bound";
        }
        if (value < this.capacity36) {
            return "within";
        }
        if (value == this.capacity36) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio36Bound() {
        return this.ratio36;
    }

    public int capacity36Bound() {
        return this.capacity36;
    }

    private final int drift37 = 2;
    private int yield37;
    private boolean capacity37;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper37() {
        if (this.capacity37) {
            return false;
        }
        this.yield37++;
        if (this.yield37 >= this.drift37) {
            this.capacity37 = true;
        }
        return true;
    }

    public int yield37Count() {
        return this.yield37;
    }

    private final int cadence38 = 58;
    private int threshold38;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune38(int value) {
        if (value < 0) {
            return this.threshold38;
        }
        if (this.threshold38 + value > this.cadence38) {
            this.threshold38 = this.cadence38;
        } else {
            this.threshold38 += value;
        }
        return this.threshold38;
    }

    public int threshold38Value() {
        return this.threshold38;
    }

    private final double capacity39 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist39(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity39 ? this.capacity39 : raw;
    }

    private final int offset40 = 0;
    private final int weight40 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate40(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset40 && value <= this.weight40) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias41 = 3;
    private final int capacity41 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String brace41(int value) {
        if (value < this.bias41) {
            return "below";
        }
        if (value == this.bias41) {
            return "lower-bound";
        }
        if (value < this.capacity41) {
            return "within";
        }
        if (value == this.capacity41) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias41Bound() {
        return this.bias41;
    }

    public int capacity41Bound() {
        return this.capacity41;
    }

    private final int tally42 = 3;
    private int weight42;
    private boolean yield42;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally42() {
        if (this.yield42) {
            return false;
        }
        this.weight42++;
        if (this.weight42 >= this.tally42) {
            this.yield42 = true;
        }
        return true;
    }

    public int weight42Count() {
        return this.weight42;
    }

    private final int span43 = 23;
    private int capacity43;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune43(int value) {
        if (value < 0) {
            return this.capacity43;
        }
        if (this.capacity43 + value > this.span43) {
            this.capacity43 = this.span43;
        } else {
            this.capacity43 += value;
        }
        return this.capacity43;
    }

    public int capacity43Value() {
        return this.capacity43;
    }

    private final double ratio44 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate44(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio44 ? this.ratio44 : raw;
    }

    private final int offset45 = 0;
    private final int weight45 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow45(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset45 && value <= this.weight45) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota46 = 4;
    private final int span46 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl46(int value) {
        if (value < this.quota46) {
            return "below";
        }
        if (value == this.quota46) {
            return "lower-bound";
        }
        if (value < this.span46) {
            return "within";
        }
        if (value == this.span46) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota46Bound() {
        return this.quota46;
    }

    public int span46Bound() {
        return this.span46;
    }

    private final int cadence47 = 4;
    private int drift47;
    private boolean ratio47;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace47() {
        if (this.ratio47) {
            return false;
        }
        this.drift47++;
        if (this.drift47 >= this.cadence47) {
            this.ratio47 = true;
        }
        return true;
    }

    public int drift47Count() {
        return this.drift47;
    }

    private final int span48 = 28;
    private int yield48;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally48(int value) {
        if (value < 0) {
            return this.yield48;
        }
        if (this.yield48 + value > this.span48) {
            this.yield48 = this.span48;
        } else {
            this.yield48 += value;
        }
        return this.yield48;
    }

    public int yield48Value() {
        return this.yield48;
    }

    private final double threshold49 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl49(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold49 ? this.threshold49 : raw;
    }

    private final int depth50 = 0;
    private final int bias50 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge50(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth50 && value <= this.bias50) {
                kept.add(value);
            }
        }
        return kept;
    }
}
