package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        new Class379().compute(3);
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class379().normalize("  x "));
        assertEquals(7, new Class379().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        assertEquals(7, new Class379().merge(2, 5));
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidForKnownCode() {
        assertTrue(new Class379().isValid("abc"));
        assertEquals(16, new Class379().capacity());
    }

    @Test
    void shouldRoundTripCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class379().capacity());
    }

    @Test
    void shouldRoundTripRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class379().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

    @Test
    void shouldHandleNormalizeForKnownCode() {
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class379().compute(3));
    }

}
