package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class210().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class210().merge(2, 5));
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class210().isValid("abc"));
        assertEquals(16, new Class210().capacity());
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
    }

}
