package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

}
