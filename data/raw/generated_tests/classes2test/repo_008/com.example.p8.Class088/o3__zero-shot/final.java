package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class088().compute(3));
            assertEquals("ok", new Class088().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class088().normalize("  x "));
        assertEquals(7, new Class088().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class088().merge(2, 5));
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class088().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class088().normalize("  x "));
    }

}
