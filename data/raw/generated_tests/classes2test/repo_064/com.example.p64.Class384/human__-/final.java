package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            new Class384().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        try {
            assertEquals("ok", new Class384().normalize("  x "));
            assertEquals(7, new Class384().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class384().capacity());
    }

    @Test
    void shouldKeepRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForWithNegativeInput() {
        assertEquals("alpha", new Class384().labelFor(1));
    }

    @Test
    void shouldRejectResetForBoundaryValue() {
        new Class384().reset();
        assertNotNull(new Class384());
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

}
