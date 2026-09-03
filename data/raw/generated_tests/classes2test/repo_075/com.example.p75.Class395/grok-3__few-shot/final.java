package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class395Test {
    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class395().compute(3));
        assertEquals("ok", new Class395().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class395().normalize("  x "));
        assertEquals(7, new Class395().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class395().merge(2, 5));
        assertTrue(new Class395().isValid("abc"));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class395().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class395().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class395().merge(2, 5));
    }

}
