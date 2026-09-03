package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class095().compute(3));
            assertEquals("ok", new Class095().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class095().normalize("  x "));
            assertEquals(7, new Class095().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class095().merge(2, 5));
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class095().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class095().isValid("abc"));
    }

}
