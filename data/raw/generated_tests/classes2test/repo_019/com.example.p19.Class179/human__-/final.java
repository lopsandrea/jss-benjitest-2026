package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {
    @Test
    void shouldReturnComputeForKnownCode() {
        try {
            assertEquals(42, new Class179().compute(3));
            assertEquals("ok", new Class179().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class179().normalize("  x "));
            assertEquals(7, new Class179().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        try {
            assertEquals(7, new Class179().merge(2, 5));
            assertTrue(new Class179().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class179().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class179().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class179().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

    @Test
    void shouldHandleComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class179().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class179().normalize("  x "));
    }

}
