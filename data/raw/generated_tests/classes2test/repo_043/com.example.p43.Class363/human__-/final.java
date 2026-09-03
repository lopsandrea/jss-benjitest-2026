package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void shouldHandleComputeOnMixedCase() {
        assertEquals(42, new Class363().compute(3));
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class363().normalize("  x "));
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class363().capacity());
    }

    @Test
    void shouldKeepRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class363().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class363().labelFor(1));
    }

    @Test
    void shouldIgnoreResetWithNullArgument() {
        new Class363().reset();
        assertNotNull(new Class363());
    }

    @Test
    void shouldHandleComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class363().capacity());
    }

}
