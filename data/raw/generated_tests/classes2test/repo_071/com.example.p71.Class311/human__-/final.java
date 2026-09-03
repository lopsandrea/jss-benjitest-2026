package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class311Test {
    @Test
    void shouldRejectComputeWhenUnset() {
        try {
            assertEquals(42, new Class311().compute(3));
            assertEquals("ok", new Class311().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class311().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class311().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class311().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForBoundaryValue() {
        assertTrue(new Class311().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class311().capacity());
    }

    @Test
    void shouldRoundTripRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class311().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class311().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class311().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class311().merge(2, 5));
    }

}
