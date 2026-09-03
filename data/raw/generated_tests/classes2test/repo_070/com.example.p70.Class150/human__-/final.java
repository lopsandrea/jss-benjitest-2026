package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class150Test {
    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        new Class150().compute(3);
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class150().normalize("  x "));
        assertEquals(7, new Class150().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        assertEquals(7, new Class150().merge(2, 5));
        assertTrue(new Class150().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidForBoundaryValue() {
        assertTrue(new Class150().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class150().capacity());
    }

    @Test
    void shouldKeepCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class150().capacity());
    }

    @Test
    void shouldRoundTripRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class150().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnMixedCase() {
        assertEquals("alpha", new Class150().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class150().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class150().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class150().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class150().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class150().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class150().merge(2, 5));
    }

}
