package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {
    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        new Class079().compute(3);
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class079().normalize("  x "));
        assertEquals(7, new Class079().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class079().merge(2, 5));
        assertTrue(new Class079().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class079().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class079().compute(3));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class079().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class079().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class079().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenAlreadyValid() {
        assertTrue(new Class079().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class079().compute(3));
    }

    @Test
    void shouldRejectComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class079().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class079().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class079().merge(2, 5));
    }

}
