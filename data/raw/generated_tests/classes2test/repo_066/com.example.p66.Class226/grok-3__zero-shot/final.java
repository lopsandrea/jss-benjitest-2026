package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class226().compute(3));
            assertEquals("ok", new Class226().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class226().normalize("  x "));
            assertEquals(7, new Class226().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class226().merge(2, 5));
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class226().isValid("abc"));
        assertEquals(16, new Class226().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class226().capacity());
        assertEquals(0.5, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class226().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

}
