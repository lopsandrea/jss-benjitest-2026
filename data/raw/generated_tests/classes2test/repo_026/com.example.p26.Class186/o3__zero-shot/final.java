package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void reportsComputeWhenUnset() {
        try {
            assertEquals(42, new Class186().compute(3));
            assertEquals("ok", new Class186().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class186().normalize("  x "));
        assertEquals(7, new Class186().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class186().merge(2, 5));
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class186().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class186().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class186().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class186().ratio(1.0, 2.0), 1e-9);
    }

}
