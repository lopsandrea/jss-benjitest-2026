package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class348().compute(3));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class348().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class348().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class348().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class348().ratio(1.0, 2.0), 1e-9);
    }

}
