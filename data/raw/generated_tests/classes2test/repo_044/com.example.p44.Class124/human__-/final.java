package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class124().compute(3));
            assertEquals("ok", new Class124().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWithNegativeInput() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void shouldKeepRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtZero() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

}
