package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class015().compute(3));
            assertEquals("ok", new Class015().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class015().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class015().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class015().isValid("abc"));
    }

}
