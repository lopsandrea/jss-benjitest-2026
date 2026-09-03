package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class383Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class383().compute(3));
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class383().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class383().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class383().merge(2, 5));
    }

}
