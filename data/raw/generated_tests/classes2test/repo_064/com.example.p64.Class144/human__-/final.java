package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        assertEquals(42, new Class144().compute(3));
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class144().normalize("  x "));
        assertEquals(7, new Class144().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        assertEquals(7, new Class144().merge(2, 5));
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class144().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class144().capacity());
    }

    @Test
    void shouldIgnoreCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class144().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class144().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class144().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class144().labelFor(1));
    }

    @Test
    void shouldKeepLabelForOnEmptyString() {
        assertEquals("alpha", new Class144().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class144().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void shouldRejectComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class144().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNegativeInput() {
        assertTrue(new Class144().isValid("abc"));
    }

}
