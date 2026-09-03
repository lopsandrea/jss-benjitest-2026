package com.northward.cairn;

/**
 * Synthetic control class assembled from 60 independent features.
 */
public class AshenKilnIII {

    private final int quota0 = 2;
    private final int cadence0 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String prune0(int value) {
        if (value < this.quota0) {
            return "below";
        }
        if (value == this.quota0) {
            return "lower-bound";
        }
        if (value < this.cadence0) {
            return "within";
        }
        if (value == this.cadence0) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota0Bound() {
        return this.quota0;
    }

    public int cadence0Bound() {
        return this.cadence0;
    }

    private final int offset1 = 2;
    private int margin1;
    private boolean yield1;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist1() {
        if (this.yield1) {
            return false;
        }
        this.margin1++;
        if (this.margin1 >= this.offset1) {
            this.yield1 = true;
        }
        return true;
    }

    public int margin1Count() {
        return this.margin1;
    }

    private final int yield2 = 22;
    private int capacity2;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper2(int value) {
        if (value < 0) {
            return this.capacity2;
        }
        if (this.capacity2 + value > this.yield2) {
            this.capacity2 = this.yield2;
        } else {
            this.capacity2 += value;
        }
        return this.capacity2;
    }

    public int capacity2Value() {
        return this.capacity2;
    }

    private final double drift3 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift3(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift3 ? this.drift3 : raw;
    }

    private final int margin4 = 4;
    private final int span4 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten4(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin4 && value <= this.span4) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight5 = 3;
    private final int drift5 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String anneal5(int value) {
        if (value < this.weight5) {
            return "below";
        }
        if (value == this.weight5) {
            return "lower-bound";
        }
        if (value < this.drift5) {
            return "within";
        }
        if (value == this.drift5) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight5Bound() {
        return this.weight5;
    }

    public int drift5Bound() {
        return this.drift5;
    }

    private final int capacity6 = 3;
    private int weight6;
    private boolean span6;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle6() {
        if (this.span6) {
            return false;
        }
        this.weight6++;
        if (this.weight6 >= this.capacity6) {
            this.span6 = true;
        }
        return true;
    }

    public int weight6Count() {
        return this.weight6;
    }

    private final int offset7 = 27;
    private int quota7;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten7(int value) {
        if (value < 0) {
            return this.quota7;
        }
        if (this.quota7 + value > this.offset7) {
            this.quota7 = this.offset7;
        } else {
            this.quota7 += value;
        }
        return this.quota7;
    }

    public int quota7Value() {
        return this.quota7;
    }

    private final double cadence8 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift8(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence8 ? this.cadence8 : raw;
    }

    private final int tally9 = 4;
    private final int drift9 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl9(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally9 && value <= this.drift9) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity10 = 4;
    private final int weight10 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift10(int value) {
        if (value < this.capacity10) {
            return "below";
        }
        if (value == this.capacity10) {
            return "lower-bound";
        }
        if (value < this.weight10) {
            return "within";
        }
        if (value == this.weight10) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity10Bound() {
        return this.capacity10;
    }

    public int weight10Bound() {
        return this.weight10;
    }

    private final int ratio11 = 4;
    private int bias11;
    private boolean quota11;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl11() {
        if (this.quota11) {
            return false;
        }
        this.bias11++;
        if (this.bias11 >= this.ratio11) {
            this.quota11 = true;
        }
        return true;
    }

    public int bias11Count() {
        return this.bias11;
    }

    private final int quota12 = 32;
    private int drift12;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate12(int value) {
        if (value < 0) {
            return this.drift12;
        }
        if (this.drift12 + value > this.quota12) {
            this.drift12 = this.quota12;
        } else {
            this.drift12 += value;
        }
        return this.drift12;
    }

    public int drift12Value() {
        return this.drift12;
    }

    private final double tally13 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl13(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally13 ? this.tally13 : raw;
    }

    private final int cadence14 = 4;
    private final int yield14 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl14(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.cadence14 && value <= this.yield14) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence15 = 5;
    private final int bias15 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist15(int value) {
        if (value < this.cadence15) {
            return "below";
        }
        if (value == this.cadence15) {
            return "lower-bound";
        }
        if (value < this.bias15) {
            return "within";
        }
        if (value == this.bias15) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence15Bound() {
        return this.cadence15;
    }

    public int bias15Bound() {
        return this.bias15;
    }

    private final int bias16 = 1;
    private int drift16;
    private boolean tally16;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune16() {
        if (this.tally16) {
            return false;
        }
        this.drift16++;
        if (this.drift16 >= this.bias16) {
            this.tally16 = true;
        }
        return true;
    }

    public int drift16Count() {
        return this.drift16;
    }

    private final int capacity17 = 37;
    private int threshold17;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle17(int value) {
        if (value < 0) {
            return this.threshold17;
        }
        if (this.threshold17 + value > this.capacity17) {
            this.threshold17 = this.capacity17;
        } else {
            this.threshold17 += value;
        }
        return this.threshold17;
    }

    public int threshold17Value() {
        return this.threshold17;
    }

    private final double tally18 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper18(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally18 ? this.tally18 : raw;
    }

    private final int threshold19 = 4;
    private final int weight19 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle19(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold19 && value <= this.weight19) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth20 = 2;
    private final int threshold20 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow20(int value) {
        if (value < this.depth20) {
            return "below";
        }
        if (value == this.depth20) {
            return "lower-bound";
        }
        if (value < this.threshold20) {
            return "within";
        }
        if (value == this.threshold20) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth20Bound() {
        return this.depth20;
    }

    public int threshold20Bound() {
        return this.threshold20;
    }

    private final int yield21 = 2;
    private int quota21;
    private boolean ratio21;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally21() {
        if (this.ratio21) {
            return false;
        }
        this.quota21++;
        if (this.quota21 >= this.yield21) {
            this.ratio21 = true;
        }
        return true;
    }

    public int quota21Count() {
        return this.quota21;
    }

    private final int yield22 = 42;
    private int depth22;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow22(int value) {
        if (value < 0) {
            return this.depth22;
        }
        if (this.depth22 + value > this.yield22) {
            this.depth22 = this.yield22;
        } else {
            this.depth22 += value;
        }
        return this.depth22;
    }

    public int depth22Value() {
        return this.depth22;
    }

    private final double cadence23 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist23(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence23 ? this.cadence23 : raw;
    }

    private final int tally24 = 4;
    private final int bias24 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate24(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally24 && value <= this.bias24) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity25 = 3;
    private final int offset25 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile25(int value) {
        if (value < this.capacity25) {
            return "below";
        }
        if (value == this.capacity25) {
            return "lower-bound";
        }
        if (value < this.offset25) {
            return "within";
        }
        if (value == this.offset25) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity25Bound() {
        return this.capacity25;
    }

    public int offset25Bound() {
        return this.offset25;
    }

    private final int bias26 = 3;
    private int offset26;
    private boolean cadence26;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean sift26() {
        if (this.cadence26) {
            return false;
        }
        this.offset26++;
        if (this.offset26 >= this.bias26) {
            this.cadence26 = true;
        }
        return true;
    }

    public int offset26Count() {
        return this.offset26;
    }

    private final int tally27 = 47;
    private int margin27;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper27(int value) {
        if (value < 0) {
            return this.margin27;
        }
        if (this.margin27 + value > this.tally27) {
            this.margin27 = this.tally27;
        } else {
            this.margin27 += value;
        }
        return this.margin27;
    }

    public int margin27Value() {
        return this.margin27;
    }

    private final double quota28 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double kindle28(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.quota28 ? this.quota28 : raw;
    }

    private final int bias29 = 4;
    private final int yield29 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> kindle29(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias29 && value <= this.yield29) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int ratio30 = 4;
    private final int quota30 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String furl30(int value) {
        if (value < this.ratio30) {
            return "below";
        }
        if (value == this.ratio30) {
            return "lower-bound";
        }
        if (value < this.quota30) {
            return "within";
        }
        if (value == this.quota30) {
            return "upper-bound";
        }
        return "above";
    }

    public int ratio30Bound() {
        return this.ratio30;
    }

    public int quota30Bound() {
        return this.quota30;
    }

    private final int yield31 = 4;
    private int offset31;
    private boolean weight31;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal31() {
        if (this.weight31) {
            return false;
        }
        this.offset31++;
        if (this.offset31 >= this.yield31) {
            this.weight31 = true;
        }
        return true;
    }

    public int offset31Count() {
        return this.offset31;
    }

    private final int weight32 = 52;
    private int tally32;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal32(int value) {
        if (value < 0) {
            return this.tally32;
        }
        if (this.tally32 + value > this.weight32) {
            this.tally32 = this.weight32;
        } else {
            this.tally32 += value;
        }
        return this.tally32;
    }

    public int tally32Value() {
        return this.tally32;
    }

    private final double depth33 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper33(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth33 ? this.depth33 : raw;
    }

    private final int threshold34 = 4;
    private final int offset34 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge34(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold34 && value <= this.offset34) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally35 = 5;
    private final int bias35 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String temper35(int value) {
        if (value < this.tally35) {
            return "below";
        }
        if (value == this.tally35) {
            return "lower-bound";
        }
        if (value < this.bias35) {
            return "within";
        }
        if (value == this.bias35) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally35Bound() {
        return this.tally35;
    }

    public int bias35Bound() {
        return this.bias35;
    }

    private final int yield36 = 1;
    private int cadence36;
    private boolean bias36;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate36() {
        if (this.bias36) {
            return false;
        }
        this.cadence36++;
        if (this.cadence36 >= this.yield36) {
            this.bias36 = true;
        }
        return true;
    }

    public int cadence36Count() {
        return this.cadence36;
    }

    private final int cadence37 = 57;
    private int span37;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int brace37(int value) {
        if (value < 0) {
            return this.span37;
        }
        if (this.span37 + value > this.cadence37) {
            this.span37 = this.cadence37;
        } else {
            this.span37 += value;
        }
        return this.span37;
    }

    public int span37Value() {
        return this.span37;
    }

    private final double bias38 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist38(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias38 ? this.bias38 : raw;
    }

    private final int tally39 = 4;
    private final int yield39 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> tally39(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.tally39 && value <= this.yield39) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally40 = 2;
    private final int yield40 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist40(int value) {
        if (value < this.tally40) {
            return "below";
        }
        if (value == this.tally40) {
            return "lower-bound";
        }
        if (value < this.yield40) {
            return "within";
        }
        if (value == this.yield40) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally40Bound() {
        return this.tally40;
    }

    public int yield40Bound() {
        return this.yield40;
    }

    private final int tally41 = 2;
    private int offset41;
    private boolean capacity41;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean anneal41() {
        if (this.capacity41) {
            return false;
        }
        this.offset41++;
        if (this.offset41 >= this.tally41) {
            this.capacity41 = true;
        }
        return true;
    }

    public int offset41Count() {
        return this.offset41;
    }

    private final int depth42 = 22;
    private int yield42;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile42(int value) {
        if (value < 0) {
            return this.yield42;
        }
        if (this.yield42 + value > this.depth42) {
            this.yield42 = this.depth42;
        } else {
            this.yield42 += value;
        }
        return this.yield42;
    }

    public int yield42Value() {
        return this.yield42;
    }

    private final double cadence43 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow43(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence43 ? this.cadence43 : raw;
    }

    private final int margin44 = 4;
    private final int cadence44 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> winnow44(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin44 && value <= this.cadence44) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int drift45 = 3;
    private final int quota45 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile45(int value) {
        if (value < this.drift45) {
            return "below";
        }
        if (value == this.drift45) {
            return "lower-bound";
        }
        if (value < this.quota45) {
            return "within";
        }
        if (value == this.quota45) {
            return "upper-bound";
        }
        return "above";
    }

    public int drift45Bound() {
        return this.drift45;
    }

    public int quota45Bound() {
        return this.quota45;
    }

    private final int depth46 = 3;
    private int weight46;
    private boolean span46;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean collate46() {
        if (this.span46) {
            return false;
        }
        this.weight46++;
        if (this.weight46 >= this.depth46) {
            this.span46 = true;
        }
        return true;
    }

    public int weight46Count() {
        return this.weight46;
    }

    private final int tally47 = 27;
    private int bias47;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten47(int value) {
        if (value < 0) {
            return this.bias47;
        }
        if (this.bias47 + value > this.tally47) {
            this.bias47 = this.tally47;
        } else {
            this.bias47 += value;
        }
        return this.bias47;
    }

    public int bias47Value() {
        return this.bias47;
    }

    private final double threshold48 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate48(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold48 ? this.threshold48 : raw;
    }

    private final int threshold49 = 4;
    private final int capacity49 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune49(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.threshold49 && value <= this.capacity49) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int threshold50 = 4;
    private final int cadence50 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge50(int value) {
        if (value < this.threshold50) {
            return "below";
        }
        if (value == this.threshold50) {
            return "lower-bound";
        }
        if (value < this.cadence50) {
            return "within";
        }
        if (value == this.cadence50) {
            return "upper-bound";
        }
        return "above";
    }

    public int threshold50Bound() {
        return this.threshold50;
    }

    public int cadence50Bound() {
        return this.cadence50;
    }

    private final int cadence51 = 4;
    private int capacity51;
    private boolean margin51;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge51() {
        if (this.margin51) {
            return false;
        }
        this.capacity51++;
        if (this.capacity51 >= this.cadence51) {
            this.margin51 = true;
        }
        return true;
    }

    public int capacity51Count() {
        return this.capacity51;
    }

    private final int threshold52 = 32;
    private int quota52;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally52(int value) {
        if (value < 0) {
            return this.quota52;
        }
        if (this.quota52 + value > this.threshold52) {
            this.quota52 = this.threshold52;
        } else {
            this.quota52 += value;
        }
        return this.quota52;
    }

    public int quota52Value() {
        return this.quota52;
    }

    private final double capacity53 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double brace53(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity53 ? this.capacity53 : raw;
    }

    private final int yield54 = 4;
    private final int quota54 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> furl54(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.yield54 && value <= this.quota54) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight55 = 5;
    private final int offset55 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle55(int value) {
        if (value < this.weight55) {
            return "below";
        }
        if (value == this.weight55) {
            return "lower-bound";
        }
        if (value < this.offset55) {
            return "within";
        }
        if (value == this.offset55) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight55Bound() {
        return this.weight55;
    }

    public int offset55Bound() {
        return this.offset55;
    }

    private final int threshold56 = 1;
    private int offset56;
    private boolean cadence56;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten56() {
        if (this.cadence56) {
            return false;
        }
        this.offset56++;
        if (this.offset56 >= this.threshold56) {
            this.cadence56 = true;
        }
        return true;
    }

    public int offset56Count() {
        return this.offset56;
    }

    private final int depth57 = 37;
    private int yield57;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow57(int value) {
        if (value < 0) {
            return this.yield57;
        }
        if (this.yield57 + value > this.depth57) {
            this.yield57 = this.depth57;
        } else {
            this.yield57 += value;
        }
        return this.yield57;
    }

    public int yield57Value() {
        return this.yield57;
    }

    private final double capacity58 = 4.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally58(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity58 ? this.capacity58 : raw;
    }

    private final int margin59 = 4;
    private final int weight59 = 11;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten59(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin59 && value <= this.weight59) {
                kept.add(value);
            }
        }
        return kept;
    }
}
