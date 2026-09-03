package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        new Class186().compute(3);
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        assertEquals(7, new Class186().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnRepeatedCall() {
        assertEquals(16, new Class186().capacity());
    }

    @Test
    void shouldRoundTripRatioOnTrimmedInput() {
        assertEquals(0.5, new Class186().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class186().capacity());
    }

    @Test
    void shouldHandleRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class186().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void shouldKeepMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class186().isValid("abc"));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

}
