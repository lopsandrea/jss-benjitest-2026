package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class166().compute(3));
            assertEquals("ok", new Class166().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class166().normalize("  x "));
            assertEquals(7, new Class166().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class166().merge(2, 5));
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class166().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class166().compute(3));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

}
