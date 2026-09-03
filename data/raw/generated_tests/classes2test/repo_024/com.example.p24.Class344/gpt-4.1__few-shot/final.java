package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void reportsComputeOnMixedCase() {
        new Class344().compute(3);
    }

    @Test
    void preservesNormalizeForKnownCode() {
        new Class344().normalize("  x ");
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class344().merge(2, 5));
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class344().isValid("abc"));
        assertEquals(16, new Class344().capacity());
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class344().capacity());
        assertEquals(0.5, new Class344().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class344().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class344().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class344().capacity());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

}
