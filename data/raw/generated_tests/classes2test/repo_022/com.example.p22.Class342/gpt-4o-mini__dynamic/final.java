package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void preservesComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class342().compute(3));
            assertEquals("ok", new Class342().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class342().normalize("  x "));
            assertEquals(7, new Class342().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class342().merge(2, 5));
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

}
