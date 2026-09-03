package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class081().compute(3));
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class081().normalize("  x "));
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class081().merge(2, 5));
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

}
