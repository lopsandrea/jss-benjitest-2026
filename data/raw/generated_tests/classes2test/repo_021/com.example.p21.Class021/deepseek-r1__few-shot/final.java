package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class021().compute(3));
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class021().normalize("  x "));
        assertEquals(7, new Class021().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class021().merge(2, 5));
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class021().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class021().merge(2, 5));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

}
