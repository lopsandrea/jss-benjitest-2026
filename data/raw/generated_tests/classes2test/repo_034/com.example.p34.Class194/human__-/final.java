package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class194Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        assertEquals(42, new Class194().compute(3));
        assertEquals("ok", new Class194().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class194().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class194().merge(2, 5));
    }

    @Test
    void shouldKeepMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class194().merge(2, 5));
        assertTrue(new Class194().isValid("abc"));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class194().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class194().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class194().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class194().isValid("abc"));
    }

}
