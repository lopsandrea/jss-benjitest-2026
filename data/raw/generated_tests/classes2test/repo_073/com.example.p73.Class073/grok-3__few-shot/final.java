package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class073().compute(3));
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class073().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

}
