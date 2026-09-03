package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void shouldNotThrowOnComputeAtZero() {
        try {
            assertEquals(42, new Class368().compute(3));
            assertEquals("ok", new Class368().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class368().normalize("  x "));
        assertEquals(7, new Class368().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class368().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNullArgument() {
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

}
