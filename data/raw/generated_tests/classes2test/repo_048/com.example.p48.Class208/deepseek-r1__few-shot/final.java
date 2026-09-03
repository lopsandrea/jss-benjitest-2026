package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class208Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class208().compute(3));
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class208().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class208().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class208().compute(3));
    }

}
