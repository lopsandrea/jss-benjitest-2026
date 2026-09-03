package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class234().compute(3));
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class234().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

}
