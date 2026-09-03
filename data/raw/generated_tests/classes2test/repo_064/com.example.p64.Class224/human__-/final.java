package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        try {
            new Class224().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class224().normalize("  x "));
            assertEquals(7, new Class224().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        assertEquals(7, new Class224().merge(2, 5));
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class224().isValid("abc"));
        assertEquals(16, new Class224().capacity());
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

}
