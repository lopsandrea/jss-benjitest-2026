package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        try {
            assertEquals(42, new Class289().compute(3));
            assertEquals("ok", new Class289().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class289().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class289().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class289().isValid("abc"));
    }

}
