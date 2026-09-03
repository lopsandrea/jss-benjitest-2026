package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class377Test {
    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        assertEquals(42, new Class377().compute(3));
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class377().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class377().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class377().capacity());
    }

    @Test
    void shouldRejectRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class377().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class377().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
    }

}
