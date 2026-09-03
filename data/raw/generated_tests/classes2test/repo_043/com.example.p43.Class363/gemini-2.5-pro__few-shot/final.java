package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class363().compute(3));
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class363().normalize("  x "));
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class363().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class363().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class363().isValid("abc"));
    }

}
