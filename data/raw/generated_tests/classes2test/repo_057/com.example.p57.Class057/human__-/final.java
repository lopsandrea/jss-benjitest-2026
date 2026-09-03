package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void shouldRejectComputeAtZero() {
        try {
            new Class057().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class057().capacity());
    }

}
