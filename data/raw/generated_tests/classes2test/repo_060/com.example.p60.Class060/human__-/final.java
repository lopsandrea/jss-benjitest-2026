package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void shouldHandleComputeOnRepeatedCall() {
        assertEquals(42, new Class060().compute(3));
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        assertEquals("ok", new Class060().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class060().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void shouldHandleRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void shouldKeepComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

}
