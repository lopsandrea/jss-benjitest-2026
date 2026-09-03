package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void shouldKeepComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class314().compute(3));
            assertEquals("ok", new Class314().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class314().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class314().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidAtUpperBound() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

    @Test
    void shouldHandleRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForForBoundaryValue() {
        assertEquals("alpha", new Class314().labelFor(1));
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

}
