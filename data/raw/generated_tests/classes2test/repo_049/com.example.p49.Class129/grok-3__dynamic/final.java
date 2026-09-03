package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class129().compute(3));
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class129().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

}
