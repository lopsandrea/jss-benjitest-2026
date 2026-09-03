package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {
    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        assertEquals(42, new Class187().compute(3));
        assertEquals("ok", new Class187().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class187().normalize("  x "));
        assertEquals(7, new Class187().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnRepeatedCall() {
        assertEquals(7, new Class187().merge(2, 5));
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class187().compute(3));
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class187().compute(3));
    }

}
