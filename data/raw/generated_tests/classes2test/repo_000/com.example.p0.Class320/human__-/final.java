package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void shouldFailFastComputeAtZero() {
        assertEquals(42, new Class320().compute(3));
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class320().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class320().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenUnset() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenAlreadyValid() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnTrimmedInput() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

}
