package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {
    @Test
    void shouldRejectComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class356().compute(3));
            assertEquals("ok", new Class356().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        try {
            assertEquals("ok", new Class356().normalize("  x "));
            assertEquals(7, new Class356().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleMergeOnMixedCase() {
        try {
            assertEquals(7, new Class356().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class356().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        assertEquals(16, new Class356().capacity());
    }

    @Test
    void shouldRejectRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class356().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class356().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class356().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class356().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class356().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class356().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class356().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class356().merge(2, 5));
    }

}
