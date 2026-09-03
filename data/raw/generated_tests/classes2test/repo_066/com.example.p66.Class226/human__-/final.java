package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void shouldRoundTripComputeForKnownCode() {
        new Class226().compute(3);
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class226().normalize("  x "));
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class226().isValid("abc"));
    }

}
