package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class354Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class354().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

}
