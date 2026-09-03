package com.wexford.rampart;

/**
 * Synthetic control class assembled from 46 independent features.
 */
public class HollowThicket {

    private final int weight0 = 0;
    private final int threshold0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight0 && value <= this.threshold0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight1 = 3;
    private final int yield1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl1(int value) {
        if (value < this.weight1) {
            return "below";
        }
        if (value == this.weight1) {
            return "lower-bound";
        }
        if (value < this.yield1) {
            return "within";
        }
        if (value == this.yield1) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight1Bound() {
        return this.weight1;
    }

    public int yield1Bound() {
        return this.yield1;
    }

    private final int capacity2 = 3;
    private int weight2;
    private boolean span2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally2() {
        if (this.span2) {
            return false;
        }
        this.weight2++;
        if (this.weight2 >= this.capacity2) {
            this.span2 = true;
        }
        return true;
    }

    public int weight2Count() {
        return this.weight2;
    }

    private final int cadence3 = 23;
    private int capacity3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper3(int value) {
        if (value < 0) {
            return this.capacity3;
        }
        if (this.capacity3 + value > this.cadence3) {
            this.capacity3 = this.cadence3;
        } else {
            this.capacity3 += value;
        }
        return this.capacity3;
    }

    public int capacity3Value() {
        return this.capacity3;
    }

    private final double quota4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota4 ? this.quota4 : raw;
    }

    private final int ratio5 = 0;
    private final int capacity5 = 11;

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
            if (value >= this.ratio5 && value <= this.capacity5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota6 = 4;
    private final int ratio6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile6(int value) {
        if (value < this.quota6) {
            return "below";
        }
        if (value == this.quota6) {
            return "lower-bound";
        }
        if (value < this.ratio6) {
            return "within";
        }
        if (value == this.ratio6) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota6Bound() {
        return this.quota6;
    }

    public int ratio6Bound() {
        return this.ratio6;
    }

    private final int span7 = 4;
    private int tally7;
    private boolean yield7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate7() {
        if (this.yield7) {
            return false;
        }
        this.tally7++;
        if (this.tally7 >= this.span7) {
            this.yield7 = true;
        }
        return true;
    }

    public int tally7Count() {
        return this.tally7;
    }

    private final int bias8 = 28;
    private int span8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate8(int value) {
        if (value < 0) {
            return this.span8;
        }
        if (this.span8 + value > this.bias8) {
            this.span8 = this.bias8;
        } else {
            this.span8 += value;
        }
        return this.span8;
    }

    public int span8Value() {
        return this.span8;
    }

    private final double threshold9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold9 ? this.threshold9 : raw;
    }

    private final int margin10 = 0;
    private final int drift10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin10 && value <= this.drift10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift11 = 5;
    private final int ratio11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist11(int value) {
        if (value < this.drift11) {
            return "below";
        }
        if (value == this.drift11) {
            return "lower-bound";
        }
        if (value < this.ratio11) {
            return "within";
        }
        if (value == this.ratio11) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift11Bound() {
        return this.drift11;
    }

    public int ratio11Bound() {
        return this.ratio11;
    }

    private final int span12 = 1;
    private int weight12;
    private boolean tally12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper12() {
        if (this.tally12) {
            return false;
        }
        this.weight12++;
        if (this.weight12 >= this.span12) {
            this.tally12 = true;
        }
        return true;
    }

    public int weight12Count() {
        return this.weight12;
    }

    private final int margin13 = 33;
    private int cadence13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge13(int value) {
        if (value < 0) {
            return this.cadence13;
        }
        if (this.cadence13 + value > this.margin13) {
            this.cadence13 = this.margin13;
        } else {
            this.cadence13 += value;
        }
        return this.cadence13;
    }

    public int cadence13Value() {
        return this.cadence13;
    }

    private final double capacity14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity14 ? this.capacity14 : raw;
    }

    private final int margin15 = 0;
    private final int span15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin15 && value <= this.span15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin16 = 2;
    private final int depth16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge16(int value) {
        if (value < this.margin16) {
            return "below";
        }
        if (value == this.margin16) {
            return "lower-bound";
        }
        if (value < this.depth16) {
            return "within";
        }
        if (value == this.depth16) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin16Bound() {
        return this.margin16;
    }

    public int depth16Bound() {
        return this.depth16;
    }

    private final int offset17 = 2;
    private int span17;
    private boolean ratio17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile17() {
        if (this.ratio17) {
            return false;
        }
        this.span17++;
        if (this.span17 >= this.offset17) {
            this.ratio17 = true;
        }
        return true;
    }

    public int span17Count() {
        return this.span17;
    }

    private final int threshold18 = 38;
    private int depth18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl18(int value) {
        if (value < 0) {
            return this.depth18;
        }
        if (this.depth18 + value > this.threshold18) {
            this.depth18 = this.threshold18;
        } else {
            this.depth18 += value;
        }
        return this.depth18;
    }

    public int depth18Value() {
        return this.depth18;
    }

    private final double threshold19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold19 ? this.threshold19 : raw;
    }

    private final int cadence20 = 0;
    private final int offset20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence20 && value <= this.offset20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias21 = 3;
    private final int depth21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String brace21(int value) {
        if (value < this.bias21) {
            return "below";
        }
        if (value == this.bias21) {
            return "lower-bound";
        }
        if (value < this.depth21) {
            return "within";
        }
        if (value == this.depth21) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias21Bound() {
        return this.bias21;
    }

    public int depth21Bound() {
        return this.depth21;
    }

    private final int quota22 = 3;
    private int span22;
    private boolean yield22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate22() {
        if (this.yield22) {
            return false;
        }
        this.span22++;
        if (this.span22 >= this.quota22) {
            this.yield22 = true;
        }
        return true;
    }

    public int span22Count() {
        return this.span22;
    }

    private final int depth23 = 43;
    private int quota23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift23(int value) {
        if (value < 0) {
            return this.quota23;
        }
        if (this.quota23 + value > this.depth23) {
            this.quota23 = this.depth23;
        } else {
            this.quota23 += value;
        }
        return this.quota23;
    }

    public int quota23Value() {
        return this.quota23;
    }

    private final double tally24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally24 ? this.tally24 : raw;
    }

    private final int cadence25 = 0;
    private final int weight25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence25 && value <= this.weight25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin26 = 4;
    private final int yield26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten26(int value) {
        if (value < this.margin26) {
            return "below";
        }
        if (value == this.margin26) {
            return "lower-bound";
        }
        if (value < this.yield26) {
            return "within";
        }
        if (value == this.yield26) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin26Bound() {
        return this.margin26;
    }

    public int yield26Bound() {
        return this.yield26;
    }

    private final int capacity27 = 4;
    private int depth27;
    private boolean threshold27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally27() {
        if (this.threshold27) {
            return false;
        }
        this.depth27++;
        if (this.depth27 >= this.capacity27) {
            this.threshold27 = true;
        }
        return true;
    }

    public int depth27Count() {
        return this.depth27;
    }

    private final int depth28 = 48;
    private int span28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge28(int value) {
        if (value < 0) {
            return this.span28;
        }
        if (this.span28 + value > this.depth28) {
            this.span28 = this.depth28;
        } else {
            this.span28 += value;
        }
        return this.span28;
    }

    public int span28Value() {
        return this.span28;
    }

    private final double depth29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth29 ? this.depth29 : raw;
    }

    private final int cadence30 = 0;
    private final int weight30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence30 && value <= this.weight30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth31 = 5;
    private final int yield31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate31(int value) {
        if (value < this.depth31) {
            return "below";
        }
        if (value == this.depth31) {
            return "lower-bound";
        }
        if (value < this.yield31) {
            return "within";
        }
        if (value == this.yield31) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth31Bound() {
        return this.depth31;
    }

    public int yield31Bound() {
        return this.yield31;
    }

    private final int cadence32 = 1;
    private int yield32;
    private boolean drift32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal32() {
        if (this.drift32) {
            return false;
        }
        this.yield32++;
        if (this.yield32 >= this.cadence32) {
            this.drift32 = true;
        }
        return true;
    }

    public int yield32Count() {
        return this.yield32;
    }

    private final int yield33 = 53;
    private int tally33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper33(int value) {
        if (value < 0) {
            return this.tally33;
        }
        if (this.tally33 + value > this.yield33) {
            this.tally33 = this.yield33;
        } else {
            this.tally33 += value;
        }
        return this.tally33;
    }

    public int tally33Value() {
        return this.tally33;
    }

    private final double tally34 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace34(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally34 ? this.tally34 : raw;
    }

    private final int threshold35 = 0;
    private final int ratio35 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile35(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold35 && value <= this.ratio35) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold36 = 2;
    private final int drift36 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift36(int value) {
        if (value < this.threshold36) {
            return "below";
        }
        if (value == this.threshold36) {
            return "lower-bound";
        }
        if (value < this.drift36) {
            return "within";
        }
        if (value == this.drift36) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold36Bound() {
        return this.threshold36;
    }

    public int drift36Bound() {
        return this.drift36;
    }

    private final int tally37 = 2;
    private int threshold37;
    private boolean cadence37;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl37() {
        if (this.cadence37) {
            return false;
        }
        this.threshold37++;
        if (this.threshold37 >= this.tally37) {
            this.cadence37 = true;
        }
        return true;
    }

    public int threshold37Count() {
        return this.threshold37;
    }

    private final int offset38 = 58;
    private int drift38;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune38(int value) {
        if (value < 0) {
            return this.drift38;
        }
        if (this.drift38 + value > this.offset38) {
            this.drift38 = this.offset38;
        } else {
            this.drift38 += value;
        }
        return this.drift38;
    }

    public int drift38Value() {
        return this.drift38;
    }

    private final double depth39 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten39(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth39 ? this.depth39 : raw;
    }

    private final int offset40 = 0;
    private final int bias40 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist40(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset40 && value <= this.bias40) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity41 = 3;
    private final int tally41 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String furl41(int value) {
        if (value < this.capacity41) {
            return "below";
        }
        if (value == this.capacity41) {
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

    public int capacity41Bound() {
        return this.capacity41;
    }

    public int tally41Bound() {
        return this.tally41;
    }

    private final int bias42 = 3;
    private int depth42;
    private boolean offset42;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile42() {
        if (this.offset42) {
            return false;
        }
        this.depth42++;
        if (this.depth42 >= this.bias42) {
            this.offset42 = true;
        }
        return true;
    }

    public int depth42Count() {
        return this.depth42;
    }

    private final int bias43 = 23;
    private int drift43;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist43(int value) {
        if (value < 0) {
            return this.drift43;
        }
        if (this.drift43 + value > this.bias43) {
            this.drift43 = this.bias43;
        } else {
            this.drift43 += value;
        }
        return this.drift43;
    }

    public int drift43Value() {
        return this.drift43;
    }

    private final double drift44 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl44(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift44 ? this.drift44 : raw;
    }

    private final int depth45 = 0;
    private final int drift45 = 6;

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
            if (value >= this.depth45 && value <= this.drift45) {
                kept.add(value);
            }
        }
        return kept;
    }
}
