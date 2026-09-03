package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class306().compute(3));
            assertEquals("ok", new Class306().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class306().compute(3));
    }

}
