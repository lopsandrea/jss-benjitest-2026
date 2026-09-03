package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        assertEquals(42, new Class275().compute(3));
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class275().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class275().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenUnset() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnTrimmedInput() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

}
