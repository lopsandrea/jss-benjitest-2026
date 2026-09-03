package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void returnsComputeAtZero() {
        try {
            assertEquals(42, new Class144().compute(3));
            assertEquals("ok", new Class144().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class144().normalize("  x "));
        assertEquals(7, new Class144().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class144().merge(2, 5));
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class144().isValid("abc"));
        assertEquals(16, new Class144().capacity());
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        assertEquals(16, new Class144().capacity());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class144().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

}
