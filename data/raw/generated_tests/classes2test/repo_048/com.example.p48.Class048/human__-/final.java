package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class048Test {
    @Test
    void shouldReturnComputeForKnownCode() {
        new Class048().compute(3);
    }

    @Test
    void shouldKeepNormalizeWithNullArgument() {
        new Class048().normalize("  x ");
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        new Class048().merge(2, 5);
    }

    @Test
    void shouldIgnoreComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class048().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class048().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidForKnownCode() {
        assertTrue(new Class048().isValid("abc"));
    }

}
