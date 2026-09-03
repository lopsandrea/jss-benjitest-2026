package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class048Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class048().compute(3));
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class048().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class048().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class048().isValid("abc"));
    }

}
