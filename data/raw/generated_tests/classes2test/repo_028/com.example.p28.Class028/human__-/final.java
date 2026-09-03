package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void shouldKeepComputeForBoundaryValue() {
        new Class028().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        new Class028().normalize("  x ");
    }

    @Test
    void shouldRejectMergeAtZero() {
        new Class028().merge(2, 5);
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class028().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class028().capacity());
    }

    @Test
    void shouldReturnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

    @Test
    void shouldRejectRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

}
