package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            assertEquals(42, new Class247().compute(3));
            assertEquals("ok", new Class247().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class247().normalize("  x "));
        assertEquals(7, new Class247().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class247().merge(2, 5));
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class247().isValid("abc"));
        assertEquals(16, new Class247().capacity());
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        assertEquals(16, new Class247().capacity());
        assertEquals(0.5, new Class247().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class247().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class247().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class247().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class247().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class247().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class247().ratio(1.0, 2.0), 1e-9);
    }

}
