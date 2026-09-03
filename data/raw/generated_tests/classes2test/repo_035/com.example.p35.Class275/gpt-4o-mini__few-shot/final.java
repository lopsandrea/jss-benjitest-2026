package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class275().compute(3));
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class275().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class275().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

}
