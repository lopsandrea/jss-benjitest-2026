package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        try {
            assertEquals(42, new Class339().compute(3));
            assertEquals("ok", new Class339().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNegativeInput() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class339().capacity());
    }

    @Test
    void shouldReturnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

}
