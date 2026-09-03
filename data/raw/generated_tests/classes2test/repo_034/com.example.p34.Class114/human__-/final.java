package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class114Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        new Class114().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        new Class114().normalize("  x ");
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class114().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class114().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class114().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class114().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class114().capacity());
    }

}
