package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void yieldsComputeWhenUnset() {
        try {
            new Class236().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class236().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class236().isValid("abc"));
    }

}
