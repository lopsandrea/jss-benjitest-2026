package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class289().compute(3));
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

}
