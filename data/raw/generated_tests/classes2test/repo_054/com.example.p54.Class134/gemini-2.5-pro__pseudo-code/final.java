package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class134Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class134().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class134().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class134().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class134().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class134().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class134().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class134().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class134().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class134().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class134().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class134().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class134().merge(2, 5));
    }

}
