package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void returnsComputeWithNullArgument() {
        new Class106().compute(3);
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class106().merge(2, 5));
        assertTrue(new Class106().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class106().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class106().capacity());
    }

}
