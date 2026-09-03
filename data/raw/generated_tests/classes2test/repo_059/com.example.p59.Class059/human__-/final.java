package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {
    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        assertEquals(42, new Class059().compute(3));
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class059().normalize("  x "));
        assertEquals(7, new Class059().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        assertEquals(7, new Class059().merge(2, 5));
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class059().capacity());
    }

    @Test
    void shouldIgnoreRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class059().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class059().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class059().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class059().capacity());
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

}
