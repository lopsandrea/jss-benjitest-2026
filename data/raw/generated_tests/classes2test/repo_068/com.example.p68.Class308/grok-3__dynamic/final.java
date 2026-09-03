package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class308().compute(3));
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class308().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class308().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class308().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void preservesResetForBoundaryValue() {
        new Class308().reset();
        assertNotNull(new Class308());
    }

}
