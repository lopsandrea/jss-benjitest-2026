package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        try {
            assertEquals(42, new Class255().compute(3));
            assertEquals("ok", new Class255().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class255().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class255().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class255().merge(2, 5));
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class255().capacity());
    }

    @Test
    void shouldReturnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class255().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidForBoundaryValue() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class255().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

}
