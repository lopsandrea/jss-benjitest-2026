package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class073().compute(3));
            assertEquals("ok", new Class073().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class073().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class073().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeAtUpperBound() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class073().merge(2, 5));
            assertTrue(new Class073().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

}
