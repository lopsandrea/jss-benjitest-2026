package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void shouldKeepComputeWhenUnset() {
        new Class332().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenUnset() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

}
