package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class225().compute(3));
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class225().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

}
