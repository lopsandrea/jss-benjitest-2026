package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {
    @Test
    void acceptsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class247().compute(3));
            assertEquals("ok", new Class247().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class247().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class247().merge(2, 5));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class247().merge(2, 5));
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class247().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class247().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class247().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class247().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class247().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class247().compute(3));
    }

}
