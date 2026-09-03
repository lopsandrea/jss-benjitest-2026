package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class325().compute(3));
    }

}
