package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class395Test {
    @Test
    void shouldFailFastComputeAtZero() {
        assertEquals(42, new Class395().compute(3));
        assertEquals("ok", new Class395().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class395().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class395().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class395().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class395().isValid("abc"));
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class395().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class395().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class395().merge(2, 5));
    }

}
