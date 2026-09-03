package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {
    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        new Class036().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        new Class036().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeWhenUnset() {
        assertEquals(7, new Class036().merge(2, 5));
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class036().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class036().compute(3));
    }

    @Test
    void shouldIgnoreComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void shouldReturnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class036().isValid("abc"));
    }

}
