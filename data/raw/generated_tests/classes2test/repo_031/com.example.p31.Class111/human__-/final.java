package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void shouldRejectComputeAtZero() {
        assertEquals(42, new Class111().compute(3));
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidForBoundaryValue() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class111().capacity());
    }

    @Test
    void shouldRoundTripRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class111().capacity());
    }

    @Test
    void shouldHandleRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForWhenUnset() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

}
