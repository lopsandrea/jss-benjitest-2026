package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void shouldKeepComputeForBoundaryValue() {
        new Class082().compute(3);
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class082().normalize("  x "));
        assertEquals(7, new Class082().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        assertEquals(7, new Class082().merge(2, 5));
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class082().isValid("abc"));
        assertEquals(16, new Class082().capacity());
    }

    @Test
    void shouldRoundTripCapacityOnMixedCase() {
        assertEquals(16, new Class082().capacity());
        assertEquals(0.5, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioAtUpperBound() {
        assertEquals(0.5, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class082().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void shouldRoundTripRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

}
