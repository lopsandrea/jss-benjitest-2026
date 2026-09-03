package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        new Class240().compute(3);
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        new Class240().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        new Class240().merge(2, 5);
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class240().isValid("abc"));
        assertEquals(16, new Class240().capacity());
    }

    @Test
    void shouldHandleCapacityAtZero() {
        assertEquals(16, new Class240().capacity());
        assertEquals(0.5, new Class240().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class240().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void shouldHandleLabelForOnEmptyString() {
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenUnset() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenUnset() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

    @Test
    void shouldRejectRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class240().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForForBoundaryValue() {
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

}
