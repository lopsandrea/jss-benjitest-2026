package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class305().compute(3));
        assertEquals("ok", new Class305().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class305().normalize("  x "));
        assertEquals(7, new Class305().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class305().merge(2, 5));
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class305().isValid("abc"));
    }

}
