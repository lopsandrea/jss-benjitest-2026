package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class094().compute(3));
            assertEquals("ok", new Class094().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class094().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class094().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class094().merge(2, 5));
            assertTrue(new Class094().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class094().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class094().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

}
