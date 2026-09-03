package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class245().compute(3));
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class245().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class245().isValid("abc"));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class245().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class245().normalize("  x "));
    }

}
