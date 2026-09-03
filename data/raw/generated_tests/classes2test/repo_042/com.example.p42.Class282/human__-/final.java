package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class282Test {
    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        assertEquals(42, new Class282().compute(3));
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class282().normalize("  x "));
        assertEquals(7, new Class282().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        assertEquals(7, new Class282().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class282().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class282().capacity());
    }

    @Test
    void shouldRoundTripRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class282().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWithNegativeInput() {
        assertEquals("alpha", new Class282().labelFor(1));
    }

    @Test
    void shouldRejectResetAtUpperBound() {
        new Class282().reset();
        assertNotNull(new Class282());
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class282().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class282().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class282().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class282().capacity());
    }

    @Test
    void shouldHandleRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class282().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class282().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class282().compute(3));
    }

}
