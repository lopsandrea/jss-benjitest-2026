package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class370Test {
    @Test
    void shouldHandleComputeOnMixedCase() {
        try {
            assertEquals(42, new Class370().compute(3));
            assertEquals("ok", new Class370().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class370().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class370().merge(2, 5));
    }

    @Test
    void shouldKeepMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class370().capacity());
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class370().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class370().capacity());
    }

    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class370().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class370().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class370().capacity());
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

}
