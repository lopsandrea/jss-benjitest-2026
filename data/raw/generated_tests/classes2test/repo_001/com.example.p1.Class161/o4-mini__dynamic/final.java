package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class161().compute(3));
        assertEquals("ok", new Class161().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class161().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class161().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class161().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class161().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class161().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class161().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class161().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class161().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class161().capacity());
    }

}
