package com.tidal.beacon;

/**
 * Synthetic control class assembled from 57 independent features.
 */
public class TidalAlmanacII {

    private final int yield0 = 20;
    private int ratio0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace0(int value) {
        if (value < 0) {
            return this.ratio0;
        }
        if (this.ratio0 + value > this.yield0) {
            this.ratio0 = this.yield0;
        } else {
            this.ratio0 += value;
        }
        return this.ratio0;
    }

    public int ratio0Value() {
        return this.ratio0;
    }

    private final double offset1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.offset1 ? this.offset1 : raw;
    }

    private final int depth2 = 2;
    private final int threshold2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth2 && value <= this.threshold2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold3 = 5;
    private final int capacity3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String collate3(int value) {
        if (value < this.threshold3) {
            return "below";
        }
        if (value == this.threshold3) {
            return "lower-bound";
        }
        if (value < this.capacity3) {
            return "within";
        }
        if (value == this.capacity3) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold3Bound() {
        return this.threshold3;
    }

    public int capacity3Bound() {
        return this.capacity3;
    }

    private final int bias4 = 1;
    private int threshold4;
    private boolean cadence4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge4() {
        if (this.cadence4) {
            return false;
        }
        this.threshold4++;
        if (this.threshold4 >= this.bias4) {
            this.cadence4 = true;
        }
        return true;
    }

    public int threshold4Count() {
        return this.threshold4;
    }

    private final int capacity5 = 25;
    private int quota5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist5(int value) {
        if (value < 0) {
            return this.quota5;
        }
        if (this.quota5 + value > this.capacity5) {
            this.quota5 = this.capacity5;
        } else {
            this.quota5 += value;
        }
        return this.quota5;
    }

    public int quota5Value() {
        return this.quota5;
    }

    private final double threshold6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold6 ? this.threshold6 : raw;
    }

    private final int drift7 = 2;
    private final int weight7 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> temper7(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift7 && value <= this.weight7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity8 = 2;
    private final int weight8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten8(int value) {
        if (value < this.capacity8) {
            return "below";
        }
        if (value == this.capacity8) {
            return "lower-bound";
        }
        if (value < this.weight8) {
            return "within";
        }
        if (value == this.weight8) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity8Bound() {
        return this.capacity8;
    }

    public int weight8Bound() {
        return this.weight8;
    }

    private final int depth9 = 2;
    private int quota9;
    private boolean bias9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper9() {
        if (this.bias9) {
            return false;
        }
        this.quota9++;
        if (this.quota9 >= this.depth9) {
            this.bias9 = true;
        }
        return true;
    }

    public int quota9Count() {
        return this.quota9;
    }

    private final int weight10 = 30;
    private int threshold10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune10(int value) {
        if (value < 0) {
            return this.threshold10;
        }
        if (this.threshold10 + value > this.weight10) {
            this.threshold10 = this.weight10;
        } else {
            this.threshold10 += value;
        }
        return this.threshold10;
    }

    public int threshold10Value() {
        return this.threshold10;
    }

    private final double tally11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally11 ? this.tally11 : raw;
    }

    private final int margin12 = 2;
    private final int drift12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin12 && value <= this.drift12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight13 = 3;
    private final int margin13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl13(int value) {
        if (value < this.weight13) {
            return "below";
        }
        if (value == this.weight13) {
            return "lower-bound";
        }
        if (value < this.margin13) {
            return "within";
        }
        if (value == this.margin13) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight13Bound() {
        return this.weight13;
    }

    public int margin13Bound() {
        return this.margin13;
    }

    private final int tally14 = 3;
    private int drift14;
    private boolean span14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune14() {
        if (this.span14) {
            return false;
        }
        this.drift14++;
        if (this.drift14 >= this.tally14) {
            this.span14 = true;
        }
        return true;
    }

    public int drift14Count() {
        return this.drift14;
    }

    private final int offset15 = 35;
    private int span15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal15(int value) {
        if (value < 0) {
            return this.span15;
        }
        if (this.span15 + value > this.offset15) {
            this.span15 = this.offset15;
        } else {
            this.span15 += value;
        }
        return this.span15;
    }

    public int span15Value() {
        return this.span15;
    }

    private final double ratio16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio16 ? this.ratio16 : raw;
    }

    private final int ratio17 = 2;
    private final int margin17 = 14;

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
            if (value >= this.ratio17 && value <= this.margin17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally18 = 4;
    private final int ratio18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String sift18(int value) {
        if (value < this.tally18) {
            return "below";
        }
        if (value == this.tally18) {
            return "lower-bound";
        }
        if (value < this.ratio18) {
            return "within";
        }
        if (value == this.ratio18) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally18Bound() {
        return this.tally18;
    }

    public int ratio18Bound() {
        return this.ratio18;
    }

    private final int quota19 = 4;
    private int margin19;
    private boolean yield19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle19() {
        if (this.yield19) {
            return false;
        }
        this.margin19++;
        if (this.margin19 >= this.quota19) {
            this.yield19 = true;
        }
        return true;
    }

    public int margin19Count() {
        return this.margin19;
    }

    private final int quota20 = 40;
    private int capacity20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper20(int value) {
        if (value < 0) {
            return this.capacity20;
        }
        if (this.capacity20 + value > this.quota20) {
            this.capacity20 = this.quota20;
        } else {
            this.capacity20 += value;
        }
        return this.capacity20;
    }

    public int capacity20Value() {
        return this.capacity20;
    }

    private final double ratio21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio21 ? this.ratio21 : raw;
    }

    private final int bias22 = 2;
    private final int offset22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias22 && value <= this.offset22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence23 = 5;
    private final int bias23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String temper23(int value) {
        if (value < this.cadence23) {
            return "below";
        }
        if (value == this.cadence23) {
            return "lower-bound";
        }
        if (value < this.bias23) {
            return "within";
        }
        if (value == this.bias23) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence23Bound() {
        return this.cadence23;
    }

    public int bias23Bound() {
        return this.bias23;
    }

    private final int margin24 = 1;
    private int capacity24;
    private boolean offset24;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle24() {
        if (this.offset24) {
            return false;
        }
        this.capacity24++;
        if (this.capacity24 >= this.margin24) {
            this.offset24 = true;
        }
        return true;
    }

    public int capacity24Count() {
        return this.capacity24;
    }

    private final int span25 = 45;
    private int depth25;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist25(int value) {
        if (value < 0) {
            return this.depth25;
        }
        if (this.depth25 + value > this.span25) {
            this.depth25 = this.span25;
        } else {
            this.depth25 += value;
        }
        return this.depth25;
    }

    public int depth25Value() {
        return this.depth25;
    }

    private final double span26 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally26(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.span26 ? this.span26 : raw;
    }

    private final int depth27 = 2;
    private final int yield27 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally27(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth27 && value <= this.yield27) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias28 = 2;
    private final int cadence28 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String collate28(int value) {
        if (value < this.bias28) {
            return "below";
        }
        if (value == this.bias28) {
            return "lower-bound";
        }
        if (value < this.cadence28) {
            return "within";
        }
        if (value == this.cadence28) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias28Bound() {
        return this.bias28;
    }

    public int cadence28Bound() {
        return this.cadence28;
    }

    private final int yield29 = 2;
    private int cadence29;
    private boolean quota29;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl29() {
        if (this.quota29) {
            return false;
        }
        this.cadence29++;
        if (this.cadence29 >= this.yield29) {
            this.quota29 = true;
        }
        return true;
    }

    public int cadence29Count() {
        return this.cadence29;
    }

    private final int yield30 = 50;
    private int quota30;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate30(int value) {
        if (value < 0) {
            return this.quota30;
        }
        if (this.quota30 + value > this.yield30) {
            this.quota30 = this.yield30;
        } else {
            this.quota30 += value;
        }
        return this.quota30;
    }

    public int quota30Value() {
        return this.quota30;
    }

    private final double threshold31 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl31(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold31 ? this.threshold31 : raw;
    }

    private final int quota32 = 2;
    private final int capacity32 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile32(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.quota32 && value <= this.capacity32) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity33 = 3;
    private final int ratio33 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow33(int value) {
        if (value < this.capacity33) {
            return "below";
        }
        if (value == this.capacity33) {
            return "lower-bound";
        }
        if (value < this.ratio33) {
            return "within";
        }
        if (value == this.ratio33) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity33Bound() {
        return this.capacity33;
    }

    public int ratio33Bound() {
        return this.ratio33;
    }

    private final int offset34 = 3;
    private int span34;
    private boolean margin34;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace34() {
        if (this.margin34) {
            return false;
        }
        this.span34++;
        if (this.span34 >= this.offset34) {
            this.margin34 = true;
        }
        return true;
    }

    public int span34Count() {
        return this.span34;
    }

    private final int bias35 = 55;
    private int drift35;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge35(int value) {
        if (value < 0) {
            return this.drift35;
        }
        if (this.drift35 + value > this.bias35) {
            this.drift35 = this.bias35;
        } else {
            this.drift35 += value;
        }
        return this.drift35;
    }

    public int drift35Value() {
        return this.drift35;
    }

    private final double bias36 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift36(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias36 ? this.bias36 : raw;
    }

    private final int yield37 = 2;
    private final int ratio37 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> brace37(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield37 && value <= this.ratio37) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight38 = 4;
    private final int bias38 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge38(int value) {
        if (value < this.weight38) {
            return "below";
        }
        if (value == this.weight38) {
            return "lower-bound";
        }
        if (value < this.bias38) {
            return "within";
        }
        if (value == this.bias38) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight38Bound() {
        return this.weight38;
    }

    public int bias38Bound() {
        return this.bias38;
    }

    private final int threshold39 = 4;
    private int margin39;
    private boolean tally39;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper39() {
        if (this.tally39) {
            return false;
        }
        this.margin39++;
        if (this.margin39 >= this.threshold39) {
            this.tally39 = true;
        }
        return true;
    }

    public int margin39Count() {
        return this.margin39;
    }

    private final int margin40 = 20;
    private int weight40;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace40(int value) {
        if (value < 0) {
            return this.weight40;
        }
        if (this.weight40 + value > this.margin40) {
            this.weight40 = this.margin40;
        } else {
            this.weight40 += value;
        }
        return this.weight40;
    }

    public int weight40Value() {
        return this.weight40;
    }

    private final double quota41 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow41(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota41 ? this.quota41 : raw;
    }

    private final int yield42 = 2;
    private final int bias42 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow42(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield42 && value <= this.bias42) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence43 = 5;
    private final int threshold43 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal43(int value) {
        if (value < this.cadence43) {
            return "below";
        }
        if (value == this.cadence43) {
            return "lower-bound";
        }
        if (value < this.threshold43) {
            return "within";
        }
        if (value == this.threshold43) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence43Bound() {
        return this.cadence43;
    }

    public int threshold43Bound() {
        return this.threshold43;
    }

    private final int offset44 = 1;
    private int weight44;
    private boolean depth44;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl44() {
        if (this.depth44) {
            return false;
        }
        this.weight44++;
        if (this.weight44 >= this.offset44) {
            this.depth44 = true;
        }
        return true;
    }

    public int weight44Count() {
        return this.weight44;
    }

    private final int span45 = 25;
    private int offset45;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace45(int value) {
        if (value < 0) {
            return this.offset45;
        }
        if (this.offset45 + value > this.span45) {
            this.offset45 = this.span45;
        } else {
            this.offset45 += value;
        }
        return this.offset45;
    }

    public int offset45Value() {
        return this.offset45;
    }

    private final double bias46 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift46(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias46 ? this.bias46 : raw;
    }

    private final int drift47 = 2;
    private final int margin47 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> reconcile47(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift47 && value <= this.margin47) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset48 = 2;
    private final int ratio48 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow48(int value) {
        if (value < this.offset48) {
            return "below";
        }
        if (value == this.offset48) {
            return "lower-bound";
        }
        if (value < this.ratio48) {
            return "within";
        }
        if (value == this.ratio48) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset48Bound() {
        return this.offset48;
    }

    public int ratio48Bound() {
        return this.ratio48;
    }

    private final int quota49 = 2;
    private int span49;
    private boolean ratio49;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift49() {
        if (this.ratio49) {
            return false;
        }
        this.span49++;
        if (this.span49 >= this.quota49) {
            this.ratio49 = true;
        }
        return true;
    }

    public int span49Count() {
        return this.span49;
    }

    private final int bias50 = 30;
    private int tally50;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge50(int value) {
        if (value < 0) {
            return this.tally50;
        }
        if (this.tally50 + value > this.bias50) {
            this.tally50 = this.bias50;
        } else {
            this.tally50 += value;
        }
        return this.tally50;
    }

    public int tally50Value() {
        return this.tally50;
    }

    private final double quota51 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal51(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota51 ? this.quota51 : raw;
    }

    private final int ratio52 = 2;
    private final int depth52 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist52(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio52 && value <= this.depth52) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally53 = 3;
    private final int yield53 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String brace53(int value) {
        if (value < this.tally53) {
            return "below";
        }
        if (value == this.tally53) {
            return "lower-bound";
        }
        if (value < this.yield53) {
            return "within";
        }
        if (value == this.yield53) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally53Bound() {
        return this.tally53;
    }

    public int yield53Bound() {
        return this.yield53;
    }

    private final int depth54 = 3;
    private int weight54;
    private boolean threshold54;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal54() {
        if (this.threshold54) {
            return false;
        }
        this.weight54++;
        if (this.weight54 >= this.depth54) {
            this.threshold54 = true;
        }
        return true;
    }

    public int weight54Count() {
        return this.weight54;
    }

    private final int offset55 = 35;
    private int capacity55;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow55(int value) {
        if (value < 0) {
            return this.capacity55;
        }
        if (this.capacity55 + value > this.offset55) {
            this.capacity55 = this.offset55;
        } else {
            this.capacity55 += value;
        }
        return this.capacity55;
    }

    public int capacity55Value() {
        return this.capacity55;
    }

    private final double ratio56 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow56(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio56 ? this.ratio56 : raw;
    }
}
