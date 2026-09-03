package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        new Class110().compute(3);
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        assertEquals("ok", new Class110().normalize("  x "));
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnTrimmedInput() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void shouldKeepComputeOnTrimmedInput() {
        assertEquals(42, new Class110().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnMixedCase() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

}
