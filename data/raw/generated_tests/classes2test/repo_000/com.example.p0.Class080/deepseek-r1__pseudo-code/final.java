package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void yieldsComputeForKnownCode() {
        new Class080().compute(3);
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        assertEquals(0.5, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

}
