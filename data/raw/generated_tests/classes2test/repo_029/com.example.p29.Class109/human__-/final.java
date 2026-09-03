package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class109Test {
    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        try {
            new Class109().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class109().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class109().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class109().merge(2, 5));
            assertTrue(new Class109().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnIsValidWhenAlreadyValid() {
        assertTrue(new Class109().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class109().compute(3));
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

}
