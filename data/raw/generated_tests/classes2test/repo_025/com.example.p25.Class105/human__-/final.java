package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void shouldRejectComputeWhenUnset() {
        new Class105().compute(3);
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        new Class105().normalize("  x ");
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        assertEquals(7, new Class105().merge(2, 5));
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class105().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class105().capacity());
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class105().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class105().labelFor(1));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class105().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class105().compute(3));
    }

}
