package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class376().compute(3));
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class376().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class376().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class376().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class376().ratio(1.0, 2.0), 1e-9);
    }

}
