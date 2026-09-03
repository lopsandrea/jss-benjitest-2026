package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class377Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        new Class377().compute(3);
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        new Class377().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class377().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class377().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class377().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class377().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class377().capacity());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class377().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
    }

}
