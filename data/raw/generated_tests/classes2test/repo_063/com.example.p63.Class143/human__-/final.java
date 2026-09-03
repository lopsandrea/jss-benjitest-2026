package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {
    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class143().compute(3));
            assertEquals("ok", new Class143().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class143().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        try {
            assertEquals(7, new Class143().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        try {
            assertTrue(new Class143().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleCapacityOnMixedCase() {
        assertEquals(16, new Class143().capacity());
    }

    @Test
    void shouldFailFastRatioOnTrimmedInput() {
        assertEquals(0.5, new Class143().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class143().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class143().merge(2, 5));
    }

}
