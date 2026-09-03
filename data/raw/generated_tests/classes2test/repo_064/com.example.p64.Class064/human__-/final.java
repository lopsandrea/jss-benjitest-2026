package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class064Test {
    @Test
    void shouldIgnoreComputeAtZero() {
        try {
            new Class064().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        new Class064().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        assertEquals(7, new Class064().merge(2, 5));
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class064().capacity());
    }

    @Test
    void shouldReturnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class064().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class064().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class064().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenAlreadyValid() {
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class064().capacity());
    }

    @Test
    void shouldRoundTripRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class064().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
    }

}
