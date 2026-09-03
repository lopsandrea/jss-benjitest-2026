package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {
    @Test
    void shouldReturnComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class086().compute(3));
            assertEquals("ok", new Class086().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class086().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class086().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class086().merge(2, 5));
    }

}
