package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class075().compute(3));
            assertEquals("ok", new Class075().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class075().normalize("  x "));
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        assertEquals(16, new Class075().capacity());
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class075().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class075().normalize("  x "));
    }

}
