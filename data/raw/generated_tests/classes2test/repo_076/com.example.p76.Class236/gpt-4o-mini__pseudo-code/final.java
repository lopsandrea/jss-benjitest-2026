package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class236().compute(3));
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class236().normalize("  x "));
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class236().merge(2, 5));
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class236().compute(3));
    }

}
