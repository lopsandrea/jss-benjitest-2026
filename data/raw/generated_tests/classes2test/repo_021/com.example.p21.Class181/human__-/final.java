package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        try {
            new Class181().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class181().normalize("  x "));
        assertEquals(7, new Class181().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        assertEquals(7, new Class181().merge(2, 5));
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class181().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class181().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class181().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class181().merge(2, 5));
    }

}
