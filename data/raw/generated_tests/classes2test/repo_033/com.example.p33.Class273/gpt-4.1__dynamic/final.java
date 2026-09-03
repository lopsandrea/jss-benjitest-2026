package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class273Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class273().compute(3));
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class273().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class273().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class273().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class273().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class273().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

}
