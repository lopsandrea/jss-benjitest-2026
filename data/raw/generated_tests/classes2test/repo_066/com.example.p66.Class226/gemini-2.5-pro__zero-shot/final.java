package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class226().compute(3));
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class226().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class226().merge(2, 5));
    }

}
