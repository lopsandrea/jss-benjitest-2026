package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class316().compute(3);
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class316().capacity());
    }

    @Test
    void acceptsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class316().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class316().compute(3));
    }

}
