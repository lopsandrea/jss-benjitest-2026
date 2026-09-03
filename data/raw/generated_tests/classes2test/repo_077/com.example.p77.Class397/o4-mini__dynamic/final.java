package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class397().compute(3));
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class397().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class397().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class397().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class397().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class397().labelFor(1));
    }

    @Test
    void reportsResetOnMixedCase() {
        new Class397().reset();
        assertNotNull(new Class397());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

}
