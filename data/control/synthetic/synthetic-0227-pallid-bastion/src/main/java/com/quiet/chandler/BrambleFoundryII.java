package com.quiet.chandler;

/**
 * Synthetic control class assembled from 47 independent features.
 */
public class BrambleFoundryII {

    private final int quota0 = 0;
    private final int yield0 = 6;

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
            if (value >= this.quota0 && value <= this.yield0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset1 = 3;
    private final int drift1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String temper1(int value) {
        if (value < this.offset1) {
            return "below";
        }
        if (value == this.offset1) {
            return "lower-bound";
        }
        if (value < this.drift1) {
            return "within";
        }
        if (value == this.drift1) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset1Bound() {
        return this.offset1;
    }

    public int drift1Bound() {
        return this.drift1;
    }

    private final int ratio2 = 3;
    private int offset2;
    private boolean weight2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal2() {
        if (this.weight2) {
            return false;
        }
        this.offset2++;
        if (this.offset2 >= this.ratio2) {
            this.weight2 = true;
        }
        return true;
    }

    public int offset2Count() {
        return this.offset2;
    }

    private final int threshold3 = 23;
    private int offset3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow3(int value) {
        if (value < 0) {
            return this.offset3;
        }
        if (this.offset3 + value > this.threshold3) {
            this.offset3 = this.threshold3;
        } else {
            this.offset3 += value;
        }
        return this.offset3;
    }

    public int offset3Value() {
        return this.offset3;
    }

    private final double drift4 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double prune4(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift4 ? this.drift4 : raw;
    }

    private final int threshold5 = 0;
    private final int ratio5 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace5(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold5 && value <= this.ratio5) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield6 = 4;
    private final int span6 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String prune6(int value) {
        if (value < this.yield6) {
            return "below";
        }
        if (value == this.yield6) {
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

    public int yield6Bound() {
        return this.yield6;
    }

    public int span6Bound() {
        return this.span6;
    }

    private final int offset7 = 4;
    private int span7;
    private boolean ratio7;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten7() {
        if (this.ratio7) {
            return false;
        }
        this.span7++;
        if (this.span7 >= this.offset7) {
            this.ratio7 = true;
        }
        return true;
    }

    public int span7Count() {
        return this.span7;
    }

    private final int bias8 = 28;
    private int depth8;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate8(int value) {
        if (value < 0) {
            return this.depth8;
        }
        if (this.depth8 + value > this.bias8) {
            this.depth8 = this.bias8;
        } else {
            this.depth8 += value;
        }
        return this.depth8;
    }

    public int depth8Value() {
        return this.depth8;
    }

    private final double drift9 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist9(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift9 ? this.drift9 : raw;
    }

    private final int quota10 = 0;
    private final int weight10 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl10(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota10 && value <= this.weight10) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield11 = 5;
    private final int span11 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String sift11(int value) {
        if (value < this.yield11) {
            return "below";
        }
        if (value == this.yield11) {
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

    public int yield11Bound() {
        return this.yield11;
    }

    public int span11Bound() {
        return this.span11;
    }

    private final int yield12 = 1;
    private int offset12;
    private boolean depth12;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl12() {
        if (this.depth12) {
            return false;
        }
        this.offset12++;
        if (this.offset12 >= this.yield12) {
            this.depth12 = true;
        }
        return true;
    }

    public int offset12Count() {
        return this.offset12;
    }

    private final int ratio13 = 33;
    private int threshold13;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally13(int value) {
        if (value < 0) {
            return this.threshold13;
        }
        if (this.threshold13 + value > this.ratio13) {
            this.threshold13 = this.ratio13;
        } else {
            this.threshold13 += value;
        }
        return this.threshold13;
    }

    public int threshold13Value() {
        return this.threshold13;
    }

    private final double cadence14 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge14(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence14 ? this.cadence14 : raw;
    }

    private final int offset15 = 0;
    private final int threshold15 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten15(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset15 && value <= this.threshold15) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield16 = 2;
    private final int capacity16 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl16(int value) {
        if (value < this.yield16) {
            return "below";
        }
        if (value == this.yield16) {
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

    public int yield16Bound() {
        return this.yield16;
    }

    public int capacity16Bound() {
        return this.capacity16;
    }

    private final int capacity17 = 2;
    private int bias17;
    private boolean tally17;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper17() {
        if (this.tally17) {
            return false;
        }
        this.bias17++;
        if (this.bias17 >= this.capacity17) {
            this.tally17 = true;
        }
        return true;
    }

    public int bias17Count() {
        return this.bias17;
    }

    private final int ratio18 = 38;
    private int threshold18;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl18(int value) {
        if (value < 0) {
            return this.threshold18;
        }
        if (this.threshold18 + value > this.ratio18) {
            this.threshold18 = this.ratio18;
        } else {
            this.threshold18 += value;
        }
        return this.threshold18;
    }

    public int threshold18Value() {
        return this.threshold18;
    }

    private final double ratio19 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge19(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio19 ? this.ratio19 : raw;
    }

    private final int weight20 = 0;
    private final int tally20 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge20(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight20 && value <= this.tally20) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth21 = 3;
    private final int bias21 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist21(int value) {
        if (value < this.depth21) {
            return "below";
        }
        if (value == this.depth21) {
            return "lower-bound";
        }
        if (value < this.bias21) {
            return "within";
        }
        if (value == this.bias21) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth21Bound() {
        return this.depth21;
    }

    public int bias21Bound() {
        return this.bias21;
    }

    private final int threshold22 = 3;
    private int quota22;
    private boolean weight22;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten22() {
        if (this.weight22) {
            return false;
        }
        this.quota22++;
        if (this.quota22 >= this.threshold22) {
            this.weight22 = true;
        }
        return true;
    }

    public int quota22Count() {
        return this.quota22;
    }

    private final int ratio23 = 43;
    private int cadence23;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift23(int value) {
        if (value < 0) {
            return this.cadence23;
        }
        if (this.cadence23 + value > this.ratio23) {
            this.cadence23 = this.ratio23;
        } else {
            this.cadence23 += value;
        }
        return this.cadence23;
    }

    public int cadence23Value() {
        return this.cadence23;
    }

    private final double drift24 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist24(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift24 ? this.drift24 : raw;
    }

    private final int offset25 = 0;
    private final int tally25 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift25(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset25 && value <= this.tally25) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio26 = 4;
    private final int drift26 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal26(int value) {
        if (value < this.ratio26) {
            return "below";
        }
        if (value == this.ratio26) {
            return "lower-bound";
        }
        if (value < this.drift26) {
            return "within";
        }
        if (value == this.drift26) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio26Bound() {
        return this.ratio26;
    }

    public int drift26Bound() {
        return this.drift26;
    }

    private final int cadence27 = 4;
    private int capacity27;
    private boolean threshold27;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift27() {
        if (this.threshold27) {
            return false;
        }
        this.capacity27++;
        if (this.capacity27 >= this.cadence27) {
            this.threshold27 = true;
        }
        return true;
    }

    public int capacity27Count() {
        return this.capacity27;
    }

    private final int yield28 = 48;
    private int tally28;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift28(int value) {
        if (value < 0) {
            return this.tally28;
        }
        if (this.tally28 + value > this.yield28) {
            this.tally28 = this.yield28;
        } else {
            this.tally28 += value;
        }
        return this.tally28;
    }

    public int tally28Value() {
        return this.tally28;
    }

    private final double bias29 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow29(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias29 ? this.bias29 : raw;
    }

    private final int tally30 = 0;
    private final int depth30 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper30(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally30 && value <= this.depth30) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span31 = 5;
    private final int yield31 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow31(int value) {
        if (value < this.span31) {
            return "below";
        }
        if (value == this.span31) {
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

    public int span31Bound() {
        return this.span31;
    }

    public int yield31Bound() {
        return this.yield31;
    }

    private final int cadence32 = 1;
    private int quota32;
    private boolean span32;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper32() {
        if (this.span32) {
            return false;
        }
        this.quota32++;
        if (this.quota32 >= this.cadence32) {
            this.span32 = true;
        }
        return true;
    }

    public int quota32Count() {
        return this.quota32;
    }

    private final int capacity33 = 53;
    private int cadence33;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal33(int value) {
        if (value < 0) {
            return this.cadence33;
        }
        if (this.cadence33 + value > this.capacity33) {
            this.cadence33 = this.capacity33;
        } else {
            this.cadence33 += value;
        }
        return this.cadence33;
    }

    public int cadence33Value() {
        return this.cadence33;
    }

    private final double ratio34 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper34(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio34 ? this.ratio34 : raw;
    }

    private final int offset35 = 0;
    private final int weight35 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle35(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset35 && value <= this.weight35) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset36 = 2;
    private final int capacity36 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String temper36(int value) {
        if (value < this.offset36) {
            return "below";
        }
        if (value == this.offset36) {
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

    public int offset36Bound() {
        return this.offset36;
    }

    public int capacity36Bound() {
        return this.capacity36;
    }

    private final int bias37 = 2;
    private int yield37;
    private boolean capacity37;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle37() {
        if (this.capacity37) {
            return false;
        }
        this.yield37++;
        if (this.yield37 >= this.bias37) {
            this.capacity37 = true;
        }
        return true;
    }

    public int yield37Count() {
        return this.yield37;
    }

    private final int weight38 = 58;
    private int capacity38;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle38(int value) {
        if (value < 0) {
            return this.capacity38;
        }
        if (this.capacity38 + value > this.weight38) {
            this.capacity38 = this.weight38;
        } else {
            this.capacity38 += value;
        }
        return this.capacity38;
    }

    public int capacity38Value() {
        return this.capacity38;
    }

    private final double span39 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist39(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span39 ? this.span39 : raw;
    }

    private final int bias40 = 0;
    private final int tally40 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally40(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias40 && value <= this.tally40) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota41 = 3;
    private final int bias41 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String sift41(int value) {
        if (value < this.quota41) {
            return "below";
        }
        if (value == this.quota41) {
            return "lower-bound";
        }
        if (value < this.bias41) {
            return "within";
        }
        if (value == this.bias41) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota41Bound() {
        return this.quota41;
    }

    public int bias41Bound() {
        return this.bias41;
    }

    private final int bias42 = 3;
    private int depth42;
    private boolean cadence42;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist42() {
        if (this.cadence42) {
            return false;
        }
        this.depth42++;
        if (this.depth42 >= this.bias42) {
            this.cadence42 = true;
        }
        return true;
    }

    public int depth42Count() {
        return this.depth42;
    }

    private final int bias43 = 23;
    private int margin43;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal43(int value) {
        if (value < 0) {
            return this.margin43;
        }
        if (this.margin43 + value > this.bias43) {
            this.margin43 = this.bias43;
        } else {
            this.margin43 += value;
        }
        return this.margin43;
    }

    public int margin43Value() {
        return this.margin43;
    }

    private final double cadence44 = 5.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow44(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence44 ? this.cadence44 : raw;
    }

    private final int threshold45 = 0;
    private final int cadence45 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper45(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold45 && value <= this.cadence45) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally46 = 4;
    private final int ratio46 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten46(int value) {
        if (value < this.tally46) {
            return "below";
        }
        if (value == this.tally46) {
            return "lower-bound";
        }
        if (value < this.ratio46) {
            return "within";
        }
        if (value == this.ratio46) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally46Bound() {
        return this.tally46;
    }

    public int ratio46Bound() {
        return this.ratio46;
    }
}
