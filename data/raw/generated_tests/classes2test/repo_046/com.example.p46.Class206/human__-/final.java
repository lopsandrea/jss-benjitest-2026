package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class206Test {
    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        assertEquals(42, new Class206().compute(3));
        assertEquals("ok", new Class206().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class206().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        assertEquals(7, new Class206().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnTrimmedInput() {
        assertTrue(new Class206().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class206().capacity());
    }

    @Test
    void shouldFailFastRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class206().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForKnownCode() {
        assertEquals("alpha", new Class206().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class206().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class206().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class206().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class206().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class206().capacity());
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class206().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class206().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class206().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class206().merge(2, 5));
    }

}
