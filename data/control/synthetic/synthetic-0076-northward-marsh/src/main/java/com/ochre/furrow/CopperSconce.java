package com.ochre.furrow;

/**
 * Synthetic control class assembled from 38 independent features.
 */
public class CopperSconce {

    private final double threshold0 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double anneal0(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.threshold0 ? this.threshold0 : raw;
    }

    private final int bias1 = 1;
    private final int span1 = 7;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten1(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias1 && value <= this.span1) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth2 = 4;
    private final int bias2 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String winnow2(int value) {
        if (value < this.depth2) {
            return "below";
        }
        if (value == this.depth2) {
            return "lower-bound";
        }
        if (value < this.bias2) {
            return "within";
        }
        if (value == this.bias2) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth2Bound() {
        return this.depth2;
    }

    public int bias2Bound() {
        return this.bias2;
    }

    private final int offset3 = 4;
    private int span3;
    private boolean capacity3;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally3() {
        if (this.capacity3) {
            return false;
        }
        this.span3++;
        if (this.span3 >= this.offset3) {
            this.capacity3 = true;
        }
        return true;
    }

    public int span3Count() {
        return this.span3;
    }

    private final int capacity4 = 24;
    private int quota4;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int gauge4(int value) {
        if (value < 0) {
            return this.quota4;
        }
        if (this.quota4 + value > this.capacity4) {
            this.quota4 = this.capacity4;
        } else {
            this.quota4 += value;
        }
        return this.quota4;
    }

    public int quota4Value() {
        return this.quota4;
    }

    private final double bias5 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double hoist5(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.bias5 ? this.bias5 : raw;
    }

    private final int margin6 = 1;
    private final int yield6 = 12;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> flatten6(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin6 && value <= this.yield6) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int bias7 = 5;
    private final int margin7 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String collate7(int value) {
        if (value < this.bias7) {
            return "below";
        }
        if (value == this.bias7) {
            return "lower-bound";
        }
        if (value < this.margin7) {
            return "within";
        }
        if (value == this.margin7) {
            return "upper-bound";
        }
        return "above";
    }

    public int bias7Bound() {
        return this.bias7;
    }

    public int margin7Bound() {
        return this.margin7;
    }

    private final int weight8 = 1;
    private int depth8;
    private boolean threshold8;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean furl8() {
        if (this.threshold8) {
            return false;
        }
        this.depth8++;
        if (this.depth8 >= this.weight8) {
            this.threshold8 = true;
        }
        return true;
    }

    public int depth8Count() {
        return this.depth8;
    }

    private final int cadence9 = 29;
    private int drift9;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int anneal9(int value) {
        if (value < 0) {
            return this.drift9;
        }
        if (this.drift9 + value > this.cadence9) {
            this.drift9 = this.cadence9;
        } else {
            this.drift9 += value;
        }
        return this.drift9;
    }

    public int drift9Value() {
        return this.drift9;
    }

    private final double depth10 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double tally10(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.depth10 ? this.depth10 : raw;
    }

    private final int bias11 = 1;
    private final int tally11 = 8;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge11(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.bias11 && value <= this.tally11) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth12 = 2;
    private final int yield12 = 7;

    /** Where {@code value} falls relative to the configured range. */
    public String kindle12(int value) {
        if (value < this.depth12) {
            return "below";
        }
        if (value == this.depth12) {
            return "lower-bound";
        }
        if (value < this.yield12) {
            return "within";
        }
        if (value == this.yield12) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth12Bound() {
        return this.depth12;
    }

    public int yield12Bound() {
        return this.yield12;
    }

    private final int drift13 = 2;
    private int bias13;
    private boolean cadence13;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean winnow13() {
        if (this.cadence13) {
            return false;
        }
        this.bias13++;
        if (this.bias13 >= this.drift13) {
            this.cadence13 = true;
        }
        return true;
    }

    public int bias13Count() {
        return this.bias13;
    }

    private final int threshold14 = 34;
    private int ratio14;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow14(int value) {
        if (value < 0) {
            return this.ratio14;
        }
        if (this.ratio14 + value > this.threshold14) {
            this.ratio14 = this.threshold14;
        } else {
            this.ratio14 += value;
        }
        return this.ratio14;
    }

    public int ratio14Value() {
        return this.ratio14;
    }

    private final double cadence15 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double temper15(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.cadence15 ? this.cadence15 : raw;
    }

    private final int capacity16 = 1;
    private final int ratio16 = 13;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge16(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity16 && value <= this.ratio16) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int tally17 = 3;
    private final int offset17 = 12;

    /** Where {@code value} falls relative to the configured range. */
    public String flatten17(int value) {
        if (value < this.tally17) {
            return "below";
        }
        if (value == this.tally17) {
            return "lower-bound";
        }
        if (value < this.offset17) {
            return "within";
        }
        if (value == this.offset17) {
            return "upper-bound";
        }
        return "above";
    }

    public int tally17Bound() {
        return this.tally17;
    }

    public int offset17Bound() {
        return this.offset17;
    }

    private final int offset18 = 3;
    private int yield18;
    private boolean bias18;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean hoist18() {
        if (this.bias18) {
            return false;
        }
        this.yield18++;
        if (this.yield18 >= this.offset18) {
            this.bias18 = true;
        }
        return true;
    }

    public int yield18Count() {
        return this.yield18;
    }

    private final int offset19 = 39;
    private int margin19;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int collate19(int value) {
        if (value < 0) {
            return this.margin19;
        }
        if (this.margin19 + value > this.offset19) {
            this.margin19 = this.offset19;
        } else {
            this.margin19 += value;
        }
        return this.margin19;
    }

    public int margin19Value() {
        return this.margin19;
    }

    private final double weight20 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl20(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.weight20 ? this.weight20 : raw;
    }

    private final int depth21 = 1;
    private final int span21 = 9;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge21(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth21 && value <= this.span21) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int depth22 = 4;
    private final int yield22 = 11;

    /** Where {@code value} falls relative to the configured range. */
    public String reconcile22(int value) {
        if (value < this.depth22) {
            return "below";
        }
        if (value == this.depth22) {
            return "lower-bound";
        }
        if (value < this.yield22) {
            return "within";
        }
        if (value == this.yield22) {
            return "upper-bound";
        }
        return "above";
    }

    public int depth22Bound() {
        return this.depth22;
    }

    public int yield22Bound() {
        return this.yield22;
    }

    private final int yield23 = 4;
    private int weight23;
    private boolean ratio23;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean flatten23() {
        if (this.ratio23) {
            return false;
        }
        this.weight23++;
        if (this.weight23 >= this.yield23) {
            this.ratio23 = true;
        }
        return true;
    }

    public int weight23Count() {
        return this.weight23;
    }

    private final int span24 = 44;
    private int weight24;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int kindle24(int value) {
        if (value < 0) {
            return this.weight24;
        }
        if (this.weight24 + value > this.span24) {
            this.weight24 = this.span24;
        } else {
            this.weight24 += value;
        }
        return this.weight24;
    }

    public int weight24Value() {
        return this.weight24;
    }

    private final double ratio25 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double furl25(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.ratio25 ? this.ratio25 : raw;
    }

    private final int depth26 = 1;
    private final int drift26 = 14;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> anneal26(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.depth26 && value <= this.drift26) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int capacity27 = 5;
    private final int bias27 = 10;

    /** Where {@code value} falls relative to the configured range. */
    public String brace27(int value) {
        if (value < this.capacity27) {
            return "below";
        }
        if (value == this.capacity27) {
            return "lower-bound";
        }
        if (value < this.bias27) {
            return "within";
        }
        if (value == this.bias27) {
            return "upper-bound";
        }
        return "above";
    }

    public int capacity27Bound() {
        return this.capacity27;
    }

    public int bias27Bound() {
        return this.bias27;
    }

    private final int yield28 = 1;
    private int bias28;
    private boolean offset28;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean tally28() {
        if (this.offset28) {
            return false;
        }
        this.bias28++;
        if (this.bias28 >= this.yield28) {
            this.offset28 = true;
        }
        return true;
    }

    public int bias28Count() {
        return this.bias28;
    }

    private final int span29 = 49;
    private int drift29;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int winnow29(int value) {
        if (value < 0) {
            return this.drift29;
        }
        if (this.drift29 + value > this.span29) {
            this.drift29 = this.span29;
        } else {
            this.drift29 += value;
        }
        return this.drift29;
    }

    public int drift29Value() {
        return this.drift29;
    }

    private final double tally30 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double reconcile30(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.tally30 ? this.tally30 : raw;
    }

    private final int margin31 = 1;
    private final int span31 = 10;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> sift31(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.margin31 && value <= this.span31) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int cadence32 = 2;
    private final int quota32 = 9;

    /** Where {@code value} falls relative to the configured range. */
    public String hoist32(int value) {
        if (value < this.cadence32) {
            return "below";
        }
        if (value == this.cadence32) {
            return "lower-bound";
        }
        if (value < this.quota32) {
            return "within";
        }
        if (value == this.quota32) {
            return "upper-bound";
        }
        return "above";
    }

    public int cadence32Bound() {
        return this.cadence32;
    }

    public int quota32Bound() {
        return this.quota32;
    }

    private final int weight33 = 2;
    private int capacity33;
    private boolean drift33;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean temper33() {
        if (this.drift33) {
            return false;
        }
        this.capacity33++;
        if (this.capacity33 >= this.weight33) {
            this.drift33 = true;
        }
        return true;
    }

    public int capacity33Count() {
        return this.capacity33;
    }

    private final int ratio34 = 54;
    private int depth34;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int reconcile34(int value) {
        if (value < 0) {
            return this.depth34;
        }
        if (this.depth34 + value > this.ratio34) {
            this.depth34 = this.ratio34;
        } else {
            this.depth34 += value;
        }
        return this.depth34;
    }

    public int depth34Value() {
        return this.depth34;
    }

    private final double capacity35 = 1.0;

    /** Ratio of the arguments, clamped at the bound. */
    public double sift35(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("denominator must be non-zero");
        }
        double raw = numerator / denominator;
        return raw > this.capacity35 ? this.capacity35 : raw;
    }

    private final int capacity36 = 1;
    private final int threshold36 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> prune36(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.capacity36 && value <= this.threshold36) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int quota37 = 3;
    private final int capacity37 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String sift37(int value) {
        if (value < this.quota37) {
            return "below";
        }
        if (value == this.quota37) {
            return "lower-bound";
        }
        if (value < this.capacity37) {
            return "within";
        }
        if (value == this.capacity37) {
            return "upper-bound";
        }
        return "above";
    }

    public int quota37Bound() {
        return this.quota37;
    }

    public int capacity37Bound() {
        return this.capacity37;
    }
}
