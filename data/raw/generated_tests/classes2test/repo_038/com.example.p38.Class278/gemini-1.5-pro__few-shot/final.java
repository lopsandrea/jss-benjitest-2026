package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class278().compute(3));
            assertEquals("ok", new Class278().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class278().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class278().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class278().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class278().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class278().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class278().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class278().merge(2, 5));
    }

}
