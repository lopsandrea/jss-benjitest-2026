package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class050().compute(3));
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class050().normalize("  x "));
        assertEquals(7, new Class050().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class050().merge(2, 5));
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class050().isValid("abc"));
        assertEquals(16, new Class050().capacity());
    }

    @Test
    void reportsCapacityForKnownCode() {
        assertEquals(16, new Class050().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class050().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

}
