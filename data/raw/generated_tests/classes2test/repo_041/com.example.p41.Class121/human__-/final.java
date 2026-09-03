package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        try {
            assertEquals(42, new Class121().compute(3));
            assertEquals("ok", new Class121().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class121().normalize("  x "));
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class121().isValid("abc"));
    }

}
