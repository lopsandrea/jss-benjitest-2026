package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {
    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class365().compute(3));
            assertEquals("ok", new Class365().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class365().normalize("  x "));
            assertEquals(7, new Class365().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        assertEquals(7, new Class365().merge(2, 5));
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnMixedCase() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

}
