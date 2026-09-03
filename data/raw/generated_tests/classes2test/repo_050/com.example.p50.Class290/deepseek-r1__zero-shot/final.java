package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class290().compute(3));
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class290().normalize("  x "));
        assertEquals(7, new Class290().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class290().merge(2, 5));
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class290().isValid("abc"));
        assertEquals(16, new Class290().capacity());
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class290().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class290().labelFor(1));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class290().isValid("abc"));
    }

}
