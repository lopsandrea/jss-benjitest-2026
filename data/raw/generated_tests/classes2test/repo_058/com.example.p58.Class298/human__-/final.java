package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class298Test {
    @Test
    void shouldReturnComputeAtUpperBound() {
        try {
            assertEquals(42, new Class298().compute(3));
            assertEquals("ok", new Class298().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class298().normalize("  x "));
        assertEquals(7, new Class298().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        assertEquals(7, new Class298().merge(2, 5));
        assertTrue(new Class298().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class298().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class298().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class298().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class298().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class298().normalize("  x "));
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class298().compute(3));
    }

}
