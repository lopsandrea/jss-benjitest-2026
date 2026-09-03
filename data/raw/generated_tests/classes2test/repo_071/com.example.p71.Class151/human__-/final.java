package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class151().compute(3));
            assertEquals("ok", new Class151().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class151().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class151().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class151().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class151().capacity());
    }

    @Test
    void shouldHandleCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class151().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class151().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class151().labelFor(1));
    }

    @Test
    void shouldReturnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void shouldHandleComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

}
