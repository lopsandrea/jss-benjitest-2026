package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void shouldRoundTripComputeOnMixedCase() {
        new Class227().compute(3);
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void shouldRejectComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

}
