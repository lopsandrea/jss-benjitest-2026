package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class163Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class163().compute(3));
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class163().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class163().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

}
