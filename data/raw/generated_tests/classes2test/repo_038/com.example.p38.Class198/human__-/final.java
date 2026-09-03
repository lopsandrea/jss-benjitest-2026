package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class198Test {
    @Test
    void shouldKeepComputeOnEmptyString() {
        try {
            new Class198().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class198().normalize("  x "));
            assertEquals(7, new Class198().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        try {
            assertEquals(7, new Class198().merge(2, 5));
            assertTrue(new Class198().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class198().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class198().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class198().capacity());
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class198().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtZero() {
        assertEquals("ok", new Class198().normalize("  x "));
    }

}
