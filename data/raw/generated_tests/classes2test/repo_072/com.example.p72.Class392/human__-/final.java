package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void shouldHandleComputeWhenUnset() {
        new Class392().compute(3);
    }

    @Test
    void shouldKeepNormalizeForKnownCode() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class392().capacity());
    }

    @Test
    void shouldFailFastRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class392().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

}
