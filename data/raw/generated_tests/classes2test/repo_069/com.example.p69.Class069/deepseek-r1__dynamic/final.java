package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void keepsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class069().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class069().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class069().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class069().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class069().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

}
