package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void clampsComputeAtUpperBound() {
        new Class088().compute(3);
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class088().normalize("  x "));
        assertEquals(7, new Class088().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class088().merge(2, 5));
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class088().compute(3));
    }

}
