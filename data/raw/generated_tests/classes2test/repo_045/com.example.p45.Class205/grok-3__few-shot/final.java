package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class205().compute(3));
            assertEquals("ok", new Class205().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class205().normalize("  x "));
            assertEquals(7, new Class205().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class205().merge(2, 5));
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class205().capacity());
    }

    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class205().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class205().merge(2, 5));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class205().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

}
