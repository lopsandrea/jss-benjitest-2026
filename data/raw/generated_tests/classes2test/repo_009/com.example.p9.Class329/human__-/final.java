package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void shouldFailFastComputeForBoundaryValue() {
        assertEquals(42, new Class329().compute(3));
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class329().normalize("  x "));
        assertEquals(7, new Class329().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        assertEquals(7, new Class329().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class329().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

}
