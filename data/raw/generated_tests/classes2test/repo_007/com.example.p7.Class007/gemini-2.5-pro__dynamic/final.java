package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class007().compute(3));
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class007().isValid("abc"));
    }

}
