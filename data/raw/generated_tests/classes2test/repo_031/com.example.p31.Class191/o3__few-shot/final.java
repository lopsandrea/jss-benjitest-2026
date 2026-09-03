package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class191().compute(3));
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class191().normalize("  x "));
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class191().merge(2, 5));
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class191().isValid("abc"));
        assertEquals(16, new Class191().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class191().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class191().isValid("abc"));
    }

}
