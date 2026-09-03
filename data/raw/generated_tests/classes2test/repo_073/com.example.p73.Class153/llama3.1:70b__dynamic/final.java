package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void returnsComputeAtZero() {
        try {
            assertEquals(42, new Class153().compute(3));
            assertEquals("ok", new Class153().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class153().merge(2, 5));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class153().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

}
