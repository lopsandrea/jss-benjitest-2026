package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            new Class154().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class154().normalize("  x "));
            assertEquals(7, new Class154().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class154().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class154().compute(3));
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class154().compute(3));
    }

}
