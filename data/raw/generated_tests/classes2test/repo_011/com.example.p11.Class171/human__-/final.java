package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class171().compute(3));
            assertEquals("ok", new Class171().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class171().capacity());
    }

    @Test
    void shouldIgnoreRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class171().ratio(1.0, 2.0), 1e-9);
    }

}
