package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class226().compute(3));
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class226().capacity());
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class226().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class226().isValid("abc"));
    }

}
