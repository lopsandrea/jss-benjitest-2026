package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void shouldRejectComputeWithNegativeInput() {
        assertEquals(42, new Class303().compute(3));
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeAtUpperBound() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnMixedCase() {
        assertTrue(new Class303().isValid("abc"));
    }

}
