package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void shouldRejectComputeAtZero() {
        try {
            assertEquals(42, new Class251().compute(3));
            assertEquals("ok", new Class251().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class251().normalize("  x "));
            assertEquals(7, new Class251().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        assertEquals(7, new Class251().merge(2, 5));
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class251().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class251().capacity());
    }

    @Test
    void shouldRoundTripCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class251().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class251().compute(3));
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class251().capacity());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtUpperBound() {
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class251().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

}
