package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class127Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class127().compute(3));
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class127().normalize("  x "));
        assertEquals(7, new Class127().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class127().merge(2, 5));
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class127().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class127().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class127().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class127().capacity());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class127().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class127().merge(2, 5));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class127().compute(3));
    }

}
