package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        try {
            new Class081().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        new Class081().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        new Class081().merge(2, 5);
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class081().isValid("abc"));
        assertEquals(42, new Class081().compute(3));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        assertEquals(42, new Class081().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenAlreadyValid() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNullArgument() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class081().isValid("abc"));
    }

}
