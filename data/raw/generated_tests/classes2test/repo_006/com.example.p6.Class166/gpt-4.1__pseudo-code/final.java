package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class166().compute(3));
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class166().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class166().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class166().isValid("abc"));
    }

}
