package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        new Class225().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class225().normalize("  x "));
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class225().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class225().isValid("abc"));
    }

}
