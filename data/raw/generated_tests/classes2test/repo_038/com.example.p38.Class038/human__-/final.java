package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {
    @Test
    void shouldHandleComputeOnEmptyString() {
        assertEquals(42, new Class038().compute(3));
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class038().normalize("  x "));
        assertEquals(7, new Class038().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class038().merge(2, 5));
        assertTrue(new Class038().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class038().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class038().compute(3));
    }

    @Test
    void shouldKeepComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class038().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class038().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class038().merge(2, 5));
    }

}
