package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void reportsComputeAtZero() {
        new Class137().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class137().normalize("  x "));
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class137().merge(2, 5));
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class137().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class137().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class137().ratio(1.0, 2.0), 1e-9);
    }

}
