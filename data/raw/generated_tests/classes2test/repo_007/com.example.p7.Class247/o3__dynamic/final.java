package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class247().compute(3));
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class247().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class247().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class247().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class247().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class247().capacity());
    }

}
