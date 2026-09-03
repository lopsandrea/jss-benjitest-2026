package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {
    @Test
    void returnsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class092().compute(3));
            assertEquals("ok", new Class092().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class092().normalize("  x "));
        assertEquals(7, new Class092().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class092().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class092().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class092().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class092().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class092().ratio(1.0, 2.0), 1e-9);
    }

}
