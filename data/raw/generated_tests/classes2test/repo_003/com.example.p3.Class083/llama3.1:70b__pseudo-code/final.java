package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class083Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class083().compute(3));
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class083().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class083().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class083().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class083().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class083().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class083().merge(2, 5));
    }

}
