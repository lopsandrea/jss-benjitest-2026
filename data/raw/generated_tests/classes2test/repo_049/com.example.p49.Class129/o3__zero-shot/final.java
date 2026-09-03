package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void reportsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class129().compute(3));
            assertEquals("ok", new Class129().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class129().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class129().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class129().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class129().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnMixedCase() {
        assertEquals("alpha", new Class129().labelFor(1));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

}
