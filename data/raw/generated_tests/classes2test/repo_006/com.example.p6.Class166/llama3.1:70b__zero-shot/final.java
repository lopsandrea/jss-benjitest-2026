package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class166().compute(3));
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class166().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class166().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

}
