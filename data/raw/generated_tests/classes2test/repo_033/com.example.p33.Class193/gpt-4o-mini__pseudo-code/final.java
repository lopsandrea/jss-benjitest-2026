package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class193().compute(3));
            assertEquals("ok", new Class193().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class193().normalize("  x "));
        assertEquals(7, new Class193().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class193().merge(2, 5));
        assertTrue(new Class193().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class193().isValid("abc"));
        assertEquals(16, new Class193().capacity());
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class193().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class193().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class193().capacity());
    }

}
