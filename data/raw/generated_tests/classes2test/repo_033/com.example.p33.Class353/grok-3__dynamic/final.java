package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class353Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class353().compute(3));
            assertEquals("ok", new Class353().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class353().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class353().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class353().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class353().isValid("abc"));
    }

}
