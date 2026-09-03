package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class352Test {
    @Test
    void shouldReturnComputeAtUpperBound() {
        try {
            assertEquals(42, new Class352().compute(3));
            assertEquals("ok", new Class352().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class352().normalize("  x "));
        assertEquals(7, new Class352().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnTrimmedInput() {
        assertEquals(7, new Class352().merge(2, 5));
        assertTrue(new Class352().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class352().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class352().capacity());
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class352().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class352().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class352().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNullArgument() {
        assertTrue(new Class352().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class352().capacity());
    }

}
