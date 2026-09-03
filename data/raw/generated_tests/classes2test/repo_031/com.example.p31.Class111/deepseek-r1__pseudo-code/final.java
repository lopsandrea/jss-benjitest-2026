package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class111().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class111().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        assertEquals(16, new Class111().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnEmptyString() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

}
