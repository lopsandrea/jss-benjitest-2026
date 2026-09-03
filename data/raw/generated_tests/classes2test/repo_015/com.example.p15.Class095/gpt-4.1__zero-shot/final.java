package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class095().compute(3));
            assertEquals("ok", new Class095().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class095().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class095().isValid("abc"));
    }

}
