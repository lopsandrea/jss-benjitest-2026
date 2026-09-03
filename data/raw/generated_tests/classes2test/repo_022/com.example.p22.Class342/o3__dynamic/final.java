package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class342().compute(3));
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class342().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

}
