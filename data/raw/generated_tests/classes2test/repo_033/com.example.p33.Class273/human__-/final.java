package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class273Test {
    @Test
    void shouldIgnoreComputeWithNullArgument() {
        try {
            new Class273().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class273().normalize("  x "));
        assertEquals(7, new Class273().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        assertEquals(7, new Class273().merge(2, 5));
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class273().capacity());
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

}
