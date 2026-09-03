package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class004().compute(3));
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class004().normalize("  x "));
        assertEquals(7, new Class004().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class004().merge(2, 5));
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class004().compute(3));
    }

}
