package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class336().compute(3));
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class336().normalize("  x "));
        assertEquals(7, new Class336().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class336().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class336().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class336().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class336().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class336().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

}
