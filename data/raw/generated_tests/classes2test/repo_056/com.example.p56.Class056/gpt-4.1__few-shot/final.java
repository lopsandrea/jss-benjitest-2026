package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class056().compute(3));
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class056().normalize("  x "));
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

}
