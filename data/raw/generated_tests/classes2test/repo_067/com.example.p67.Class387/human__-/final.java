package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        try {
            new Class387().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class387().normalize("  x "));
        assertEquals(7, new Class387().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class387().merge(2, 5));
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class387().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class387().capacity());
    }

    @Test
    void shouldReturnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class387().capacity());
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenUnset() {
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class387().capacity());
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNegativeInput() {
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class387().isValid("abc"));
    }

}
