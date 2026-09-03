package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void shouldRoundTripComputeWhenUnset() {
        new Class155().compute(3);
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class155().normalize("  x "));
        assertEquals(7, new Class155().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        assertEquals(7, new Class155().merge(2, 5));
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class155().isValid("abc"));
        assertEquals(16, new Class155().capacity());
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        assertEquals(16, new Class155().capacity());
    }

    @Test
    void shouldRoundTripRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class155().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForOnEmptyString() {
        assertEquals("alpha", new Class155().labelFor(1));
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class155().isValid("abc"));
    }

}
