package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void shouldRoundTripComputeForKnownCode() {
        try {
            new Class216().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class216().normalize("  x "));
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        assertEquals(7, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class216().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class216().capacity());
    }

    @Test
    void shouldRejectCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void shouldHandleLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

}
