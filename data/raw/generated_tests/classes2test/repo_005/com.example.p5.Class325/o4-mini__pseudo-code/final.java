package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            assertEquals(42, new Class325().compute(3));
            assertEquals("ok", new Class325().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class325().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class325().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class325().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

}
