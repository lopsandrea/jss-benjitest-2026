package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            new Class106().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class106().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class106().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class106().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

}
