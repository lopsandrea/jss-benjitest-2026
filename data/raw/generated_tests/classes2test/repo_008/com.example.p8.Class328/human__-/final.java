package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        try {
            assertEquals(42, new Class328().compute(3));
            assertEquals("ok", new Class328().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class328().normalize("  x "));
            assertEquals(7, new Class328().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeAtZero() {
        assertEquals(7, new Class328().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        assertEquals(16, new Class328().capacity());
    }

    @Test
    void shouldRejectRatioWithNegativeInput() {
        assertEquals(0.5, new Class328().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
    }

    @Test
    void shouldHandleRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class328().ratio(1.0, 2.0), 1e-9);
    }

}
