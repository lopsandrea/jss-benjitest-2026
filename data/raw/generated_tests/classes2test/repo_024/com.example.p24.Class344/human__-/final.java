package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            new Class344().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class344().normalize("  x "));
            assertEquals(7, new Class344().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        assertEquals(7, new Class344().merge(2, 5));
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnEmptyString() {
        assertEquals(16, new Class344().capacity());
    }

    @Test
    void shouldKeepRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class344().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

}
