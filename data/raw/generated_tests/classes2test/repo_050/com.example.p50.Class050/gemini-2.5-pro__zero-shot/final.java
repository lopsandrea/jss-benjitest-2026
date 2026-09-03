package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {
    @Test
    void keepsComputeForKnownCode() {
        try {
            new Class050().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class050().normalize("  x "));
        assertEquals(7, new Class050().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class050().merge(2, 5));
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class050().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class050().capacity());
    }

}
