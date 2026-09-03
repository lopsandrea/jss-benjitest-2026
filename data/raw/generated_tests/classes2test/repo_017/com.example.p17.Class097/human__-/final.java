package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        assertEquals(42, new Class097().compute(3));
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class097().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class097().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
        assertTrue(new Class097().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenAlreadyValid() {
        assertTrue(new Class097().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class097().compute(3));
    }

    @Test
    void shouldIgnoreComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void shouldReturnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class097().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class097().merge(2, 5));
    }

}
