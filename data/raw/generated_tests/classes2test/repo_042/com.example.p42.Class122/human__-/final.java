package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void shouldReturnComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class122().compute(3));
            assertEquals("ok", new Class122().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class122().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class122().merge(2, 5));
    }

}
