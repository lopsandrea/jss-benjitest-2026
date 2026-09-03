package com.pallid.sconce;

/**
 * Synthetic control class assembled from 56 independent features.
 */
public class NorthwardPylonIII {

    private final int span0 = 0;
    private final int threshold0 = 6;

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
            if (value >= this.span0 && value <= this.threshold0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias1 = 3;
    private final int depth1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle1(int value) {
        if (value < this.bias1) {
            return "below";
        }
        if (value == this.bias1) {
            return "lower-bound";
        }
        if (value < this.depth1) {
            return "within";
        }
        if (value == this.depth1) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias1Bound() {
        return this.bias1;
    }

    public int depth1Bound() {
        return this.depth1;
    }

    private final int tally2 = 3;
    private int drift2;
    private boolean ratio2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal2() {
        if (this.ratio2) {
            return false;
        }
        this.drift2++;
        if (this.drift2 >= this.tally2) {
            this.ratio2 = true;
        }
        return true;
    }

    public int drift2Count() {
        return this.drift2;
    }

    private final int cadence3 = 23;
    private int tally3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate3(int value) {
        if (value < 0) {
            return this.tally3;
        }
        if (this.tally3 + value > this.cadence3) {
            this.tally3 = this.cadence3;
        } else {
            this.tally3 += value;
        }
        return this.tally3;
    }

    public int tally3Value() {
        return this.tally3;
    }

    private final double bias4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias4 ? this.bias4 : raw;
    }

    private final int yield5 = 0;
    private final int cadence5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield5 && value <= this.cadence5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth6 = 4;
    private final int margin6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge6(int value) {
        if (value < this.depth6) {
            return "below";
        }
        if (value == this.depth6) {
            return "lower-bound";
        }
        if (value < this.margin6) {
            return "within";
        }
        if (value == this.margin6) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth6Bound() {
        return this.depth6;
    }

    public int margin6Bound() {
        return this.margin6;
    }

    private final int capacity7 = 4;
    private int ratio7;
    private boolean margin7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal7() {
        if (this.margin7) {
            return false;
        }
        this.ratio7++;
        if (this.ratio7 >= this.capacity7) {
            this.margin7 = true;
        }
        return true;
    }

    public int ratio7Count() {
        return this.ratio7;
    }

    private final int bias8 = 28;
    private int threshold8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle8(int value) {
        if (value < 0) {
            return this.threshold8;
        }
        if (this.threshold8 + value > this.bias8) {
            this.threshold8 = this.bias8;
        } else {
            this.threshold8 += value;
        }
        return this.threshold8;
    }

    public int threshold8Value() {
        return this.threshold8;
    }

    private final double drift9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift9 ? this.drift9 : raw;
    }

    private final int quota10 = 0;
    private final int margin10 = 7;

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
            if (value >= this.quota10 && value <= this.margin10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset11 = 5;
    private final int span11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String sift11(int value) {
        if (value < this.offset11) {
            return "below";
        }
        if (value == this.offset11) {
            return "lower-bound";
        }
        if (value < this.span11) {
            return "within";
        }
        if (value == this.span11) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset11Bound() {
        return this.offset11;
    }

    public int span11Bound() {
        return this.span11;
    }

    private final int capacity12 = 1;
    private int offset12;
    private boolean drift12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge12() {
        if (this.drift12) {
            return false;
        }
        this.offset12++;
        if (this.offset12 >= this.capacity12) {
            this.drift12 = true;
        }
        return true;
    }

    public int offset12Count() {
        return this.offset12;
    }

    private final int tally13 = 33;
    private int threshold13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist13(int value) {
        if (value < 0) {
            return this.threshold13;
        }
        if (this.threshold13 + value > this.tally13) {
            this.threshold13 = this.tally13;
        } else {
            this.threshold13 += value;
        }
        return this.threshold13;
    }

    public int threshold13Value() {
        return this.threshold13;
    }

    private final double depth14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth14 ? this.depth14 : raw;
    }

    private final int depth15 = 0;
    private final int drift15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth15 && value <= this.drift15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota16 = 2;
    private final int yield16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String tally16(int value) {
        if (value < this.quota16) {
            return "below";
        }
        if (value == this.quota16) {
            return "lower-bound";
        }
        if (value < this.yield16) {
            return "within";
        }
        if (value == this.yield16) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota16Bound() {
        return this.quota16;
    }

    public int yield16Bound() {
        return this.yield16;
    }

    private final int depth17 = 2;
    private int offset17;
    private boolean ratio17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge17() {
        if (this.ratio17) {
            return false;
        }
        this.offset17++;
        if (this.offset17 >= this.depth17) {
            this.ratio17 = true;
        }
        return true;
    }

    public int offset17Count() {
        return this.offset17;
    }

    private final int yield18 = 38;
    private int bias18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge18(int value) {
        if (value < 0) {
            return this.bias18;
        }
        if (this.bias18 + value > this.yield18) {
            this.bias18 = this.yield18;
        } else {
            this.bias18 += value;
        }
        return this.bias18;
    }

    public int bias18Value() {
        return this.bias18;
    }

    private final double margin19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin19 ? this.margin19 : raw;
    }

    private final int ratio20 = 0;
    private final int tally20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio20 && value <= this.tally20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence21 = 3;
    private final int capacity21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge21(int value) {
        if (value < this.cadence21) {
            return "below";
        }
        if (value == this.cadence21) {
            return "lower-bound";
        }
        if (value < this.capacity21) {
            return "within";
        }
        if (value == this.capacity21) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence21Bound() {
        return this.cadence21;
    }

    public int capacity21Bound() {
        return this.capacity21;
    }

    private final int drift22 = 3;
    private int tally22;
    private boolean bias22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune22() {
        if (this.bias22) {
            return false;
        }
        this.tally22++;
        if (this.tally22 >= this.drift22) {
            this.bias22 = true;
        }
        return true;
    }

    public int tally22Count() {
        return this.tally22;
    }

    private final int tally23 = 43;
    private int threshold23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist23(int value) {
        if (value < 0) {
            return this.threshold23;
        }
        if (this.threshold23 + value > this.tally23) {
            this.threshold23 = this.tally23;
        } else {
            this.threshold23 += value;
        }
        return this.threshold23;
    }

    public int threshold23Value() {
        return this.threshold23;
    }

    private final double bias24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias24 ? this.bias24 : raw;
    }

    private final int span25 = 0;
    private final int ratio25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span25 && value <= this.ratio25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold26 = 4;
    private final int quota26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten26(int value) {
        if (value < this.threshold26) {
            return "below";
        }
        if (value == this.threshold26) {
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

    public int threshold26Bound() {
        return this.threshold26;
    }

    public int quota26Bound() {
        return this.quota26;
    }

    private final int yield27 = 4;
    private int capacity27;
    private boolean threshold27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist27() {
        if (this.threshold27) {
            return false;
        }
        this.capacity27++;
        if (this.capacity27 >= this.yield27) {
            this.threshold27 = true;
        }
        return true;
    }

    public int capacity27Count() {
        return this.capacity27;
    }

    private final int bias28 = 48;
    private int ratio28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune28(int value) {
        if (value < 0) {
            return this.ratio28;
        }
        if (this.ratio28 + value > this.bias28) {
            this.ratio28 = this.bias28;
        } else {
            this.ratio28 += value;
        }
        return this.ratio28;
    }

    public int ratio28Value() {
        return this.ratio28;
    }

    private final double threshold29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold29 ? this.threshold29 : raw;
    }

    private final int depth30 = 0;
    private final int capacity30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth30 && value <= this.capacity30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity31 = 5;
    private final int bias31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String prune31(int value) {
        if (value < this.capacity31) {
            return "below";
        }
        if (value == this.capacity31) {
            return "lower-bound";
        }
        if (value < this.bias31) {
            return "within";
        }
        if (value == this.bias31) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity31Bound() {
        return this.capacity31;
    }

    public int bias31Bound() {
        return this.bias31;
    }

    private final int margin32 = 1;
    private int threshold32;
    private boolean ratio32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace32() {
        if (this.ratio32) {
            return false;
        }
        this.threshold32++;
        if (this.threshold32 >= this.margin32) {
            this.ratio32 = true;
        }
        return true;
    }

    public int threshold32Count() {
        return this.threshold32;
    }

    private final int weight33 = 53;
    private int ratio33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate33(int value) {
        if (value < 0) {
            return this.ratio33;
        }
        if (this.ratio33 + value > this.weight33) {
            this.ratio33 = this.weight33;
        } else {
            this.ratio33 += value;
        }
        return this.ratio33;
    }

    public int ratio33Value() {
        return this.ratio33;
    }

    private final double yield34 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten34(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield34 ? this.yield34 : raw;
    }

    private final int ratio35 = 0;
    private final int drift35 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist35(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio35 && value <= this.drift35) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset36 = 2;
    private final int margin36 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle36(int value) {
        if (value < this.offset36) {
            return "below";
        }
        if (value == this.offset36) {
            return "lower-bound";
        }
        if (value < this.margin36) {
            return "within";
        }
        if (value == this.margin36) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset36Bound() {
        return this.offset36;
    }

    public int margin36Bound() {
        return this.margin36;
    }

    private final int offset37 = 2;
    private int margin37;
    private boolean cadence37;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift37() {
        if (this.cadence37) {
            return false;
        }
        this.margin37++;
        if (this.margin37 >= this.offset37) {
            this.cadence37 = true;
        }
        return true;
    }

    public int margin37Count() {
        return this.margin37;
    }

    private final int offset38 = 58;
    private int threshold38;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl38(int value) {
        if (value < 0) {
            return this.threshold38;
        }
        if (this.threshold38 + value > this.offset38) {
            this.threshold38 = this.offset38;
        } else {
            this.threshold38 += value;
        }
        return this.threshold38;
    }

    public int threshold38Value() {
        return this.threshold38;
    }

    private final double yield39 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper39(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.yield39 ? this.yield39 : raw;
    }

    private final int ratio40 = 0;
    private final int span40 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace40(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio40 && value <= this.span40) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield41 = 3;
    private final int tally41 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String temper41(int value) {
        if (value < this.yield41) {
            return "below";
        }
        if (value == this.yield41) {
            return "lower-bound";
        }
        if (value < this.tally41) {
            return "within";
        }
        if (value == this.tally41) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield41Bound() {
        return this.yield41;
    }

    public int tally41Bound() {
        return this.tally41;
    }

    private final int drift42 = 3;
    private int yield42;
    private boolean ratio42;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile42() {
        if (this.ratio42) {
            return false;
        }
        this.yield42++;
        if (this.yield42 >= this.drift42) {
            this.ratio42 = true;
        }
        return true;
    }

    public int yield42Count() {
        return this.yield42;
    }

    private final int threshold43 = 23;
    private int yield43;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace43(int value) {
        if (value < 0) {
            return this.yield43;
        }
        if (this.yield43 + value > this.threshold43) {
            this.yield43 = this.threshold43;
        } else {
            this.yield43 += value;
        }
        return this.yield43;
    }

    public int yield43Value() {
        return this.yield43;
    }

    private final double depth44 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile44(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth44 ? this.depth44 : raw;
    }

    private final int span45 = 0;
    private final int quota45 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune45(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span45 && value <= this.quota45) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth46 = 4;
    private final int tally46 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String brace46(int value) {
        if (value < this.depth46) {
            return "below";
        }
        if (value == this.depth46) {
            return "lower-bound";
        }
        if (value < this.tally46) {
            return "within";
        }
        if (value == this.tally46) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth46Bound() {
        return this.depth46;
    }

    public int tally46Bound() {
        return this.tally46;
    }

    private final int margin47 = 4;
    private int weight47;
    private boolean tally47;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle47() {
        if (this.tally47) {
            return false;
        }
        this.weight47++;
        if (this.weight47 >= this.margin47) {
            this.tally47 = true;
        }
        return true;
    }

    public int weight47Count() {
        return this.weight47;
    }

    private final int depth48 = 28;
    private int weight48;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift48(int value) {
        if (value < 0) {
            return this.weight48;
        }
        if (this.weight48 + value > this.depth48) {
            this.weight48 = this.depth48;
        } else {
            this.weight48 += value;
        }
        return this.weight48;
    }

    public int weight48Value() {
        return this.weight48;
    }

    private final double cadence49 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper49(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence49 ? this.cadence49 : raw;
    }

    private final int margin50 = 0;
    private final int span50 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper50(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin50 && value <= this.span50) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift51 = 5;
    private final int tally51 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge51(int value) {
        if (value < this.drift51) {
            return "below";
        }
        if (value == this.drift51) {
            return "lower-bound";
        }
        if (value < this.tally51) {
            return "within";
        }
        if (value == this.tally51) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift51Bound() {
        return this.drift51;
    }

    public int tally51Bound() {
        return this.tally51;
    }

    private final int yield52 = 1;
    private int margin52;
    private boolean weight52;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace52() {
        if (this.weight52) {
            return false;
        }
        this.margin52++;
        if (this.margin52 >= this.yield52) {
            this.weight52 = true;
        }
        return true;
    }

    public int margin52Count() {
        return this.margin52;
    }

    private final int quota53 = 33;
    private int weight53;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally53(int value) {
        if (value < 0) {
            return this.weight53;
        }
        if (this.weight53 + value > this.quota53) {
            this.weight53 = this.quota53;
        } else {
            this.weight53 += value;
        }
        return this.weight53;
    }

    public int weight53Value() {
        return this.weight53;
    }

    private final double ratio54 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally54(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio54 ? this.ratio54 : raw;
    }

    private final int yield55 = 0;
    private final int span55 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist55(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield55 && value <= this.span55) {
                kept.add(value);
            }
        }
        return kept;
    }
}
