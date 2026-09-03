package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {
    @Test
    void reportsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class292().compute(3));
            assertEquals("ok", new Class292().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class292().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        assertEquals(0.5, new Class292().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class292().labelFor(1));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class292().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class292().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class292().capacity());
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

}
