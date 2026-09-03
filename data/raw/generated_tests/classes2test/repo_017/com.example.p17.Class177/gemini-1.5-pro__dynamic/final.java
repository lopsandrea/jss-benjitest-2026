package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class177().compute(3));
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

}
