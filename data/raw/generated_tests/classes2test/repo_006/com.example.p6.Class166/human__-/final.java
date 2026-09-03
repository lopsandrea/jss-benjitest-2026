package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        assertEquals(42, new Class166().compute(3));
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class166().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class166().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class166().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class166().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnTrimmedInput() {
        assertTrue(new Class166().isValid("abc"));
    }

}
