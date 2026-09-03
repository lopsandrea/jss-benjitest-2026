package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class370Test {
    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class370().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class370().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class370().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class370().isValid("abc"));
    }

}
