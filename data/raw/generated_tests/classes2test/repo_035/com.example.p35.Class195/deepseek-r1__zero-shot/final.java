package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class195().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        new Class195().normalize("  x ");
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class195().merge(2, 5));
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class195().isValid("abc"));
        assertEquals(16, new Class195().capacity());
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class195().capacity());
        assertEquals(0.5, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioForBoundaryValue() {
        assertEquals(0.5, new Class195().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class195().compute(3));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class195().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class195().isValid("abc"));
    }

}
