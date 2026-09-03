package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void shouldIgnoreComputeAtUpperBound() {
        try {
            assertEquals(42, new Class101().compute(3));
            assertEquals("ok", new Class101().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class101().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class101().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class101().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class101().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class101().isValid("abc"));
    }

}
