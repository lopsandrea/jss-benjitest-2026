package com.quiet.beacon;

/**
 * Synthetic control class assembled from 59 independent features.
 */
public class PallidLatticeII {

    private final int bias0 = 20;
    private int ratio0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift0(int value) {
        if (value < 0) {
            return this.ratio0;
        }
        if (this.ratio0 + value > this.bias0) {
            this.ratio0 = this.bias0;
        } else {
            this.ratio0 += value;
        }
        return this.ratio0;
    }

    public int ratio0Value() {
        return this.ratio0;
    }

    private final double span1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span1 ? this.span1 : raw;
    }

    private final int quota2 = 2;
    private final int drift2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota2 && value <= this.drift2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span3 = 5;
    private final int drift3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String prune3(int value) {
        if (value < this.span3) {
            return "below";
        }
        if (value == this.span3) {
            return "lower-bound";
        }
        if (value < this.drift3) {
            return "within";
        }
        if (value == this.drift3) {
            return "upper-bound";
        }
        return "above";
    }

    public int span3Bound() {
        return this.span3;
    }

    public int drift3Bound() {
        return this.drift3;
    }

    private final int weight4 = 1;
    private int offset4;
    private boolean tally4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten4() {
        if (this.tally4) {
            return false;
        }
        this.offset4++;
        if (this.offset4 >= this.weight4) {
            this.tally4 = true;
        }
        return true;
    }

    public int offset4Count() {
        return this.offset4;
    }

    private final int threshold5 = 25;
    private int cadence5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal5(int value) {
        if (value < 0) {
            return this.cadence5;
        }
        if (this.cadence5 + value > this.threshold5) {
            this.cadence5 = this.threshold5;
        } else {
            this.cadence5 += value;
        }
        return this.cadence5;
    }

    public int cadence5Value() {
        return this.cadence5;
    }

    private final double weight6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight6 ? this.weight6 : raw;
    }

    private final int span7 = 2;
    private final int quota7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span7 && value <= this.quota7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias8 = 2;
    private final int span8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow8(int value) {
        if (value < this.bias8) {
            return "below";
        }
        if (value == this.bias8) {
            return "lower-bound";
        }
        if (value < this.span8) {
            return "within";
        }
        if (value == this.span8) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias8Bound() {
        return this.bias8;
    }

    public int span8Bound() {
        return this.span8;
    }

    private final int yield9 = 2;
    private int tally9;
    private boolean offset9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle9() {
        if (this.offset9) {
            return false;
        }
        this.tally9++;
        if (this.tally9 >= this.yield9) {
            this.offset9 = true;
        }
        return true;
    }

    public int tally9Count() {
        return this.tally9;
    }

    private final int offset10 = 30;
    private int span10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten10(int value) {
        if (value < 0) {
            return this.span10;
        }
        if (this.span10 + value > this.offset10) {
            this.span10 = this.offset10;
        } else {
            this.span10 += value;
        }
        return this.span10;
    }

    public int span10Value() {
        return this.span10;
    }

    private final double tally11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally11 ? this.tally11 : raw;
    }

    private final int offset12 = 2;
    private final int threshold12 = 9;

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
            if (value >= this.offset12 && value <= this.threshold12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset13 = 3;
    private final int cadence13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge13(int value) {
        if (value < this.offset13) {
            return "below";
        }
        if (value == this.offset13) {
            return "lower-bound";
        }
        if (value < this.cadence13) {
            return "within";
        }
        if (value == this.cadence13) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset13Bound() {
        return this.offset13;
    }

    public int cadence13Bound() {
        return this.cadence13;
    }

    private final int drift14 = 3;
    private int threshold14;
    private boolean depth14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal14() {
        if (this.depth14) {
            return false;
        }
        this.threshold14++;
        if (this.threshold14 >= this.drift14) {
            this.depth14 = true;
        }
        return true;
    }

    public int threshold14Count() {
        return this.threshold14;
    }

    private final int yield15 = 35;
    private int tally15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally15(int value) {
        if (value < 0) {
            return this.tally15;
        }
        if (this.tally15 + value > this.yield15) {
            this.tally15 = this.yield15;
        } else {
            this.tally15 += value;
        }
        return this.tally15;
    }

    public int tally15Value() {
        return this.tally15;
    }

    private final double threshold16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold16 ? this.threshold16 : raw;
    }

    private final int weight17 = 2;
    private final int capacity17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.weight17 && value <= this.capacity17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias18 = 4;
    private final int span18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle18(int value) {
        if (value < this.bias18) {
            return "below";
        }
        if (value == this.bias18) {
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

    public int bias18Bound() {
        return this.bias18;
    }

    public int span18Bound() {
        return this.span18;
    }

    private final int cadence19 = 4;
    private int ratio19;
    private boolean weight19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow19() {
        if (this.weight19) {
            return false;
        }
        this.ratio19++;
        if (this.ratio19 >= this.cadence19) {
            this.weight19 = true;
        }
        return true;
    }

    public int ratio19Count() {
        return this.ratio19;
    }

    private final int capacity20 = 40;
    private int threshold20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge20(int value) {
        if (value < 0) {
            return this.threshold20;
        }
        if (this.threshold20 + value > this.capacity20) {
            this.threshold20 = this.capacity20;
        } else {
            this.threshold20 += value;
        }
        return this.threshold20;
    }

    public int threshold20Value() {
        return this.threshold20;
    }

    private final double threshold21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold21 ? this.threshold21 : raw;
    }

    private final int offset22 = 2;
    private final int cadence22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.offset22 && value <= this.cadence22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span23 = 5;
    private final int depth23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String tally23(int value) {
        if (value < this.span23) {
            return "below";
        }
        if (value == this.span23) {
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

    public int span23Bound() {
        return this.span23;
    }

    public int depth23Bound() {
        return this.depth23;
    }

    private final int bias24 = 1;
    private int yield24;
    private boolean drift24;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune24() {
        if (this.drift24) {
            return false;
        }
        this.yield24++;
        if (this.yield24 >= this.bias24) {
            this.drift24 = true;
        }
        return true;
    }

    public int yield24Count() {
        return this.yield24;
    }

    private final int depth25 = 45;
    private int offset25;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int sift25(int value) {
        if (value < 0) {
            return this.offset25;
        }
        if (this.offset25 + value > this.depth25) {
            this.offset25 = this.depth25;
        } else {
            this.offset25 += value;
        }
        return this.offset25;
    }

    public int offset25Value() {
        return this.offset25;
    }

    private final double weight26 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge26(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight26 ? this.weight26 : raw;
    }

    private final int quota27 = 2;
    private final int tally27 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow27(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota27 && value <= this.tally27) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally28 = 2;
    private final int weight28 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String furl28(int value) {
        if (value < this.tally28) {
            return "below";
        }
        if (value == this.tally28) {
            return "lower-bound";
        }
        if (value < this.weight28) {
            return "within";
        }
        if (value == this.weight28) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally28Bound() {
        return this.tally28;
    }

    public int weight28Bound() {
        return this.weight28;
    }

    private final int yield29 = 2;
    private int drift29;
    private boolean ratio29;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten29() {
        if (this.ratio29) {
            return false;
        }
        this.drift29++;
        if (this.drift29 >= this.yield29) {
            this.ratio29 = true;
        }
        return true;
    }

    public int drift29Count() {
        return this.drift29;
    }

    private final int quota30 = 50;
    private int tally30;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle30(int value) {
        if (value < 0) {
            return this.tally30;
        }
        if (this.tally30 + value > this.quota30) {
            this.tally30 = this.quota30;
        } else {
            this.tally30 += value;
        }
        return this.tally30;
    }

    public int tally30Value() {
        return this.tally30;
    }

    private final double ratio31 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist31(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio31 ? this.ratio31 : raw;
    }

    private final int margin32 = 2;
    private final int quota32 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist32(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin32 && value <= this.quota32) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence33 = 3;
    private final int yield33 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String temper33(int value) {
        if (value < this.cadence33) {
            return "below";
        }
        if (value == this.cadence33) {
            return "lower-bound";
        }
        if (value < this.yield33) {
            return "within";
        }
        if (value == this.yield33) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence33Bound() {
        return this.cadence33;
    }

    public int yield33Bound() {
        return this.yield33;
    }

    private final int quota34 = 3;
    private int bias34;
    private boolean cadence34;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift34() {
        if (this.cadence34) {
            return false;
        }
        this.bias34++;
        if (this.bias34 >= this.quota34) {
            this.cadence34 = true;
        }
        return true;
    }

    public int bias34Count() {
        return this.bias34;
    }

    private final int offset35 = 55;
    private int threshold35;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten35(int value) {
        if (value < 0) {
            return this.threshold35;
        }
        if (this.threshold35 + value > this.offset35) {
            this.threshold35 = this.offset35;
        } else {
            this.threshold35 += value;
        }
        return this.threshold35;
    }

    public int threshold35Value() {
        return this.threshold35;
    }

    private final double cadence36 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper36(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence36 ? this.cadence36 : raw;
    }

    private final int tally37 = 2;
    private final int margin37 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally37(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally37 && value <= this.margin37) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio38 = 4;
    private final int tally38 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String sift38(int value) {
        if (value < this.ratio38) {
            return "below";
        }
        if (value == this.ratio38) {
            return "lower-bound";
        }
        if (value < this.tally38) {
            return "within";
        }
        if (value == this.tally38) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio38Bound() {
        return this.ratio38;
    }

    public int tally38Bound() {
        return this.tally38;
    }

    private final int ratio39 = 4;
    private int margin39;
    private boolean bias39;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace39() {
        if (this.bias39) {
            return false;
        }
        this.margin39++;
        if (this.margin39 >= this.ratio39) {
            this.bias39 = true;
        }
        return true;
    }

    public int margin39Count() {
        return this.margin39;
    }

    private final int cadence40 = 20;
    private int bias40;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper40(int value) {
        if (value < 0) {
            return this.bias40;
        }
        if (this.bias40 + value > this.cadence40) {
            this.bias40 = this.cadence40;
        } else {
            this.bias40 += value;
        }
        return this.bias40;
    }

    public int bias40Value() {
        return this.bias40;
    }

    private final double margin41 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile41(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.margin41 ? this.margin41 : raw;
    }

    private final int margin42 = 2;
    private final int threshold42 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile42(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin42 && value <= this.threshold42) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence43 = 5;
    private final int tally43 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow43(int value) {
        if (value < this.cadence43) {
            return "below";
        }
        if (value == this.cadence43) {
            return "lower-bound";
        }
        if (value < this.tally43) {
            return "within";
        }
        if (value == this.tally43) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence43Bound() {
        return this.cadence43;
    }

    public int tally43Bound() {
        return this.tally43;
    }

    private final int cadence44 = 1;
    private int depth44;
    private boolean weight44;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean reconcile44() {
        if (this.weight44) {
            return false;
        }
        this.depth44++;
        if (this.depth44 >= this.cadence44) {
            this.weight44 = true;
        }
        return true;
    }

    public int depth44Count() {
        return this.depth44;
    }

    private final int drift45 = 25;
    private int threshold45;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace45(int value) {
        if (value < 0) {
            return this.threshold45;
        }
        if (this.threshold45 + value > this.drift45) {
            this.threshold45 = this.drift45;
        } else {
            this.threshold45 += value;
        }
        return this.threshold45;
    }

    public int threshold45Value() {
        return this.threshold45;
    }

    private final double bias46 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally46(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias46 ? this.bias46 : raw;
    }

    private final int tally47 = 2;
    private final int cadence47 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl47(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally47 && value <= this.cadence47) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight48 = 2;
    private final int quota48 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow48(int value) {
        if (value < this.weight48) {
            return "below";
        }
        if (value == this.weight48) {
            return "lower-bound";
        }
        if (value < this.quota48) {
            return "within";
        }
        if (value == this.quota48) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight48Bound() {
        return this.weight48;
    }

    public int quota48Bound() {
        return this.quota48;
    }

    private final int capacity49 = 2;
    private int quota49;
    private boolean cadence49;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal49() {
        if (this.cadence49) {
            return false;
        }
        this.quota49++;
        if (this.quota49 >= this.capacity49) {
            this.cadence49 = true;
        }
        return true;
    }

    public int quota49Count() {
        return this.quota49;
    }

    private final int threshold50 = 30;
    private int span50;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow50(int value) {
        if (value < 0) {
            return this.span50;
        }
        if (this.span50 + value > this.threshold50) {
            this.span50 = this.threshold50;
        } else {
            this.span50 += value;
        }
        return this.span50;
    }

    public int span50Value() {
        return this.span50;
    }

    private final double depth51 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile51(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth51 ? this.depth51 : raw;
    }

    private final int yield52 = 2;
    private final int threshold52 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace52(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield52 && value <= this.threshold52) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset53 = 3;
    private final int margin53 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge53(int value) {
        if (value < this.offset53) {
            return "below";
        }
        if (value == this.offset53) {
            return "lower-bound";
        }
        if (value < this.margin53) {
            return "within";
        }
        if (value == this.margin53) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset53Bound() {
        return this.offset53;
    }

    public int margin53Bound() {
        return this.margin53;
    }

    private final int ratio54 = 3;
    private int cadence54;
    private boolean threshold54;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal54() {
        if (this.threshold54) {
            return false;
        }
        this.cadence54++;
        if (this.cadence54 >= this.ratio54) {
            this.threshold54 = true;
        }
        return true;
    }

    public int cadence54Count() {
        return this.cadence54;
    }

    private final int threshold55 = 35;
    private int tally55;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune55(int value) {
        if (value < 0) {
            return this.tally55;
        }
        if (this.tally55 + value > this.threshold55) {
            this.tally55 = this.threshold55;
        } else {
            this.tally55 += value;
        }
        return this.tally55;
    }

    public int tally55Value() {
        return this.tally55;
    }

    private final double cadence56 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow56(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence56 ? this.cadence56 : raw;
    }

    private final int tally57 = 2;
    private final int depth57 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift57(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally57 && value <= this.depth57) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias58 = 4;
    private final int margin58 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten58(int value) {
        if (value < this.bias58) {
            return "below";
        }
        if (value == this.bias58) {
            return "lower-bound";
        }
        if (value < this.margin58) {
            return "within";
        }
        if (value == this.margin58) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias58Bound() {
        return this.bias58;
    }

    public int margin58Bound() {
        return this.margin58;
    }
}
