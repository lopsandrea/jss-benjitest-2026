package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        assertEquals(42, new Class112().compute(3));
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class112().normalize("  x "));
        assertEquals(7, new Class112().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        assertEquals(7, new Class112().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNegativeInput() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class112().capacity());
    }

    @Test
    void shouldReturnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class112().merge(2, 5));
    }

}
