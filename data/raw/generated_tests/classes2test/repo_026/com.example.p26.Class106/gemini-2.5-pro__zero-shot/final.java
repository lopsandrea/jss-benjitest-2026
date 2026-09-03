package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class106().compute(3));
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class106().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class106().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class106().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

}
