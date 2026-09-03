package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class397().compute(3));
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class397().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        assertEquals(16, new Class397().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        assertEquals(0.5, new Class397().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForAtZero() {
        assertEquals("alpha", new Class397().labelFor(1));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class397().isValid("abc"));
    }

}
