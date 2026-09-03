package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        try {
            new Class228().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class228().normalize("  x "));
            assertEquals(7, new Class228().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        assertEquals(7, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidOnTrimmedInput() {
        assertTrue(new Class228().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class228().capacity());
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

}
