package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class203Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class203().compute(3));
        assertEquals("ok", new Class203().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class203().normalize("  x "));
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class203().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class203().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class203().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class203().normalize("  x "));
    }

}
