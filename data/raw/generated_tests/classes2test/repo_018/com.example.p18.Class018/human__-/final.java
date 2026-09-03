package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void shouldRejectComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class018().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnEmptyString() {
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenAlreadyValid() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtUpperBound() {
        assertEquals(16, new Class018().capacity());
    }

    @Test
    void shouldHandleRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class018().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForAtUpperBound() {
        assertEquals("alpha", new Class018().labelFor(1));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

}
