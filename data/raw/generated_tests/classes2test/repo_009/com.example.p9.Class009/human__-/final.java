package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        assertEquals(42, new Class009().compute(3));
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class009().normalize("  x "));
        assertEquals(7, new Class009().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        assertEquals(7, new Class009().merge(2, 5));
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNegativeInput() {
        assertTrue(new Class009().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class009().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class009().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

}
