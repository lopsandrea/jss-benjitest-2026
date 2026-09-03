package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class133().compute(3));
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class133().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class133().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

}
