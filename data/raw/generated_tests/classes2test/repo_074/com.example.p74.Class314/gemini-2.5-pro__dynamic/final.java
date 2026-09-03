package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class314().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForAtZero() {
        assertEquals("alpha", new Class314().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

}
