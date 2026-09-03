package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        assertEquals(42, new Class334().compute(3));
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class334().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class334().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class334().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class334().capacity());
    }

    @Test
    void shouldRejectCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class334().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class334().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class334().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class334().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class334().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNegativeInput() {
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class334().capacity());
    }

    @Test
    void shouldHandleRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class334().ratio(1.0, 2.0), 1e-9);
    }

}
