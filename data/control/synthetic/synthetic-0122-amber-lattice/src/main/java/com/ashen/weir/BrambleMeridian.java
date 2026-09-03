package com.ashen.weir;

/**
 * Synthetic control class assembled from 4 independent features.
 */
public class BrambleMeridian {

    private final int span0 = 0;
    private final int depth0 = 6;

    /** Values inside the inclusive range, nulls skipped. */
    public java.util.List<Integer> gauge0(java.util.List<Integer> values) {
        if (values == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List<Integer> kept = new java.util.ArrayList<>();
        for (Integer value : values) {
            if (value == null) {
                continue;
            }
            if (value >= this.span0 && value <= this.depth0) {
                kept.add(value);
            }
        }
        return kept;
    }

    private final int span1 = 3;
    private final int bias1 = 8;

    /** Where {@code value} falls relative to the configured range. */
    public String furl1(int value) {
        if (value < this.span1) {
            return "below";
        }
        if (value == this.span1) {
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

    public int span1Bound() {
        return this.span1;
    }

    public int bias1Bound() {
        return this.bias1;
    }

    private final int weight2 = 3;
    private int yield2;
    private boolean drift2;

    /** Consumes one attempt, refusing once the budget is exhausted. */
    public boolean prune2() {
        if (this.drift2) {
            return false;
        }
        this.yield2++;
        if (this.yield2 >= this.weight2) {
            this.drift2 = true;
        }
        return true;
    }

    public int yield2Count() {
        return this.yield2;
    }

    private final int weight3 = 23;
    private int span3;

    /** Adds {@code value} without exceeding the cap, ignoring negatives. */
    public int furl3(int value) {
        if (value < 0) {
            return this.span3;
        }
        if (this.span3 + value > this.weight3) {
            this.span3 = this.weight3;
        } else {
            this.span3 += value;
        }
        return this.span3;
    }

    public int span3Value() {
        return this.span3;
    }
}
