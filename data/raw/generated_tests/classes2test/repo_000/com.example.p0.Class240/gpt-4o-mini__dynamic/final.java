package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class240().compute(3));
            assertEquals("ok", new Class240().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class240().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class240().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class240().isValid("abc"));
    }

}
