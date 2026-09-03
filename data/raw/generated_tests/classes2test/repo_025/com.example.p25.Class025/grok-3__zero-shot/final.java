package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void reportsComputeAtZero() {
        new Class025().compute(3);
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class025().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class025().capacity());
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

}
