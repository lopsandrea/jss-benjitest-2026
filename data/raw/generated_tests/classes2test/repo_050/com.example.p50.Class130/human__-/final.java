package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class130Test {
    @Test
    void shouldHandleComputeForKnownCode() {
        assertEquals(42, new Class130().compute(3));
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        assertEquals(7, new Class130().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenAlreadyValid() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnRepeatedCall() {
        assertEquals(16, new Class130().capacity());
    }

    @Test
    void shouldRoundTripRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class130().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class130().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNegativeInput() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class130().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class130().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

}
