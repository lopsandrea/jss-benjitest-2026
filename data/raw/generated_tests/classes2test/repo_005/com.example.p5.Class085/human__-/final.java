package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class085Test {
    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class085().compute(3));
            assertEquals("ok", new Class085().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class085().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class085().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class085().merge(2, 5));
        assertTrue(new Class085().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidForBoundaryValue() {
        assertTrue(new Class085().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class085().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class085().capacity());
    }

    @Test
    void shouldRoundTripRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class085().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWithNullArgument() {
        assertEquals("alpha", new Class085().labelFor(1));
    }

    @Test
    void shouldKeepResetOnRepeatedCall() {
        new Class085().reset();
        assertNotNull(new Class085());
    }

    @Test
    void shouldRejectComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class085().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class085().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class085().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class085().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class085().capacity());
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class085().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForForKnownCode() {
        assertEquals("alpha", new Class085().labelFor(1));
    }

    @Test
    void shouldIgnoreResetForBoundaryValue() {
        new Class085().reset();
        assertNotNull(new Class085());
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class085().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class085().normalize("  x "));
    }

}
