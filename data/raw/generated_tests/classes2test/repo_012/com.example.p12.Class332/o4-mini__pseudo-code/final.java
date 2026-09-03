package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class332().compute(3));
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class332().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class332().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class332().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class332().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class332().isValid("abc"));
    }

}
