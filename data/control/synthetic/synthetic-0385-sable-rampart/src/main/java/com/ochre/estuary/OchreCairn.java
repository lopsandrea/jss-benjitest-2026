package com.ochre.estuary;

/**
 * Synthetic control class assembled from 29 independent features.
 */
public class OchreCairn {

    private final int span0 = 20;
    private int weight0;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int tally0(int value) {
        if (value < 0) {
            return this.weight0;
        }
        if (this.weight0 + value > this.span0) {
            this.weight0 = this.span0;
        } else {
            this.weight0 += value;
        }
        return this.weight0;
    }

    public int weight0Value() {
        return this.weight0;
    }

    private final double bias1 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift1(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias1 ? this.bias1 : raw;
    }

    private final int span2 = 2;
    private final int quota2 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten2(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span2 && value <= this.quota2) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int weight3 = 5;
    private final int ratio3 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle3(int value) {
        if (value < this.weight3) {
            return "below";
        }
        if (value == this.weight3) {
            return "lower-bound";
        }
        if (value < this.ratio3) {
            return "within";
        }
        if (value == this.ratio3) {
            return "upper-bound";
        }
        return "above";
    }

    public int weight3Bound() {
        return this.weight3;
    }

    public int ratio3Bound() {
        return this.ratio3;
    }

    private final int yield4 = 1;
    private int threshold4;
    private boolean offset4;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten4() {
        if (this.offset4) {
            return false;
        }
        this.threshold4++;
        if (this.threshold4 >= this.yield4) {
            this.offset4 = true;
        }
        return true;
    }

    public int threshold4Count() {
        return this.threshold4;
    }

    private final int drift5 = 25;
    private int weight5;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate5(int value) {
        if (value < 0) {
            return this.weight5;
        }
        if (this.weight5 + value > this.drift5) {
            this.weight5 = this.drift5;
        } else {
            this.weight5 += value;
        }
        return this.weight5;
    }

    public int weight5Value() {
        return this.weight5;
    }

    private final double drift6 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift6(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.drift6 ? this.drift6 : raw;
    }

    private final int margin7 = 2;
    private final int threshold7 = 13;

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
            if (value >= this.margin7 && value <= this.threshold7) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int offset8 = 2;
    private final int margin8 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle8(int value) {
        if (value < this.offset8) {
            return "below";
        }
        if (value == this.offset8) {
            return "lower-bound";
        }
        if (value < this.margin8) {
            return "within";
        }
        if (value == this.margin8) {
            return "upper-bound";
        }
        return "above";
    }

    public int offset8Bound() {
        return this.offset8;
    }

    public int margin8Bound() {
        return this.margin8;
    }

    private final int threshold9 = 2;
    private int span9;
    private boolean bias9;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten9() {
        if (this.bias9) {
            return false;
        }
        this.span9++;
        if (this.span9 >= this.threshold9) {
            this.bias9 = true;
        }
        return true;
    }

    public int span9Count() {
        return this.span9;
    }

    private final int capacity10 = 30;
    private int weight10;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int flatten10(int value) {
        if (value < 0) {
            return this.weight10;
        }
        if (this.weight10 + value > this.capacity10) {
            this.weight10 = this.capacity10;
        } else {
            this.weight10 += value;
        }
        return this.weight10;
    }

    public int weight10Value() {
        return this.weight10;
    }

    private final double tally11 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double collate11(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally11 ? this.tally11 : raw;
    }

    private final int margin12 = 2;
    private final int yield12 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune12(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin12 && value <= this.yield12) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span13 = 3;
    private final int cadence13 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String tally13(int value) {
        if (value < this.span13) {
            return "below";
        }
        if (value == this.span13) {
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

    public int span13Bound() {
        return this.span13;
    }

    public int cadence13Bound() {
        return this.cadence13;
    }

    private final int capacity14 = 3;
    private int cadence14;
    private boolean span14;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean brace14() {
        if (this.span14) {
            return false;
        }
        this.cadence14++;
        if (this.cadence14 >= this.capacity14) {
            this.span14 = true;
        }
        return true;
    }

    public int cadence14Count() {
        return this.cadence14;
    }

    private final int threshold15 = 35;
    private int yield15;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int temper15(int value) {
        if (value < 0) {
            return this.yield15;
        }
        if (this.yield15 + value > this.threshold15) {
            this.yield15 = this.threshold15;
        } else {
            this.yield15 += value;
        }
        return this.yield15;
    }

    public int yield15Value() {
        return this.yield15;
    }

    private final double ratio16 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double winnow16(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio16 ? this.ratio16 : raw;
    }

    private final int ratio17 = 2;
    private final int weight17 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> collate17(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.ratio17 && value <= this.weight17) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int yield18 = 4;
    private final int threshold18 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow18(int value) {
        if (value < this.yield18) {
            return "below";
        }
        if (value == this.yield18) {
            return "lower-bound";
        }
        if (value < this.threshold18) {
            return "within";
        }
        if (value == this.threshold18) {
            return "upper-bound";
        }
        return "above";
    }

    public int yield18Bound() {
        return this.yield18;
    }

    public int threshold18Bound() {
        return this.threshold18;
    }

    private final int depth19 = 4;
    private int yield19;
    private boolean weight19;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean kindle19() {
        if (this.weight19) {
            return false;
        }
        this.yield19++;
        if (this.yield19 >= this.depth19) {
            this.weight19 = true;
        }
        return true;
    }

    public int yield19Count() {
        return this.yield19;
    }

    private final int capacity20 = 40;
    private int depth20;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int hoist20(int value) {
        if (value < 0) {
            return this.depth20;
        }
        if (this.depth20 + value > this.capacity20) {
            this.depth20 = this.capacity20;
        } else {
            this.depth20 += value;
        }
        return this.depth20;
    }

    public int depth20Value() {
        return this.depth20;
    }

    private final double bias21 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double flatten21(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias21 ? this.bias21 : raw;
    }

    private final int drift22 = 2;
    private final int threshold22 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> hoist22(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.drift22 && value <= this.threshold22) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally23 = 5;
    private final int threshold23 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String gauge23(int value) {
        if (value < this.tally23) {
            return "below";
        }
        if (value == this.tally23) {
            return "lower-bound";
        }
        if (value < this.threshold23) {
            return "within";
        }
        if (value == this.threshold23) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally23Bound() {
        return this.tally23;
    }

    public int threshold23Bound() {
        return this.threshold23;
    }

    private final int quota24 = 1;
    private int span24;
    private boolean drift24;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean gauge24() {
        if (this.drift24) {
            return false;
        }
        this.span24++;
        if (this.span24 >= this.quota24) {
            this.drift24 = true;
        }
        return true;
    }

    public int span24Count() {
        return this.span24;
    }

    private final int quota25 = 45;
    private int capacity25;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int prune25(int value) {
        if (value < 0) {
            return this.capacity25;
        }
        if (this.capacity25 + value > this.quota25) {
            this.capacity25 = this.quota25;
        } else {
            this.capacity25 += value;
        }
        return this.capacity25;
    }

    public int capacity25Value() {
        return this.capacity25;
    }

    private final double tally26 = 2.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double gauge26(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally26 ? this.tally26 : raw;
    }

    private final int bias27 = 2;
    private final int span27 = 6;

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
            if (value >= this.bias27 && value <= this.span27) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int margin28 = 2;
    private final int tally28 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String sift28(int value) {
        if (value < this.margin28) {
            return "below";
        }
        if (value == this.margin28) {
            return "lower-bound";
        }
        if (value < this.tally28) {
            return "within";
        }
        if (value == this.tally28) {
            return "upper-bound";
        }
        return "above";
    }

    public int margin28Bound() {
        return this.margin28;
    }

    public int tally28Bound() {
        return this.tally28;
    }
}
