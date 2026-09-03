package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class059().compute(3));
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class059().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class059().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class059().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class059().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class059().capacity());
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

}
