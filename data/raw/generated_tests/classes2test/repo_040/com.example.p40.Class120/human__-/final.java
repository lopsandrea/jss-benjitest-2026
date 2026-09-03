package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        assertEquals(42, new Class120().compute(3));
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class120().normalize("  x "));
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class120().capacity());
    }

    @Test
    void shouldNotThrowOnRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class120().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class120().capacity());
    }

    @Test
    void shouldIgnoreRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class120().merge(2, 5));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

}
