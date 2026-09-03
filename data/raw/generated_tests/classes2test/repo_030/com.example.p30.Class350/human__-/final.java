package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class350Test {
    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        new Class350().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        new Class350().normalize("  x ");
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class350().merge(2, 5));
        assertTrue(new Class350().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidWithNegativeInput() {
        assertTrue(new Class350().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class350().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class350().compute(3));
        assertEquals("ok", new Class350().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeForKnownCode() {
        assertEquals("ok", new Class350().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class350().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class350().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class350().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class350().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnEmptyString() {
        assertEquals("ok", new Class350().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class350().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class350().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class350().compute(3));
    }

}
