package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class043().compute(3));
            assertEquals("ok", new Class043().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class043().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class043().merge(2, 5));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNegativeInput() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

}
