package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class289().compute(3));
            assertEquals("ok", new Class289().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class289().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class289().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

}
