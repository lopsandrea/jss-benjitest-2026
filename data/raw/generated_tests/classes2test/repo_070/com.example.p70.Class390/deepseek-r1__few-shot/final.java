package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class390().compute(3));
            assertEquals("ok", new Class390().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class390().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class390().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class390().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

}
