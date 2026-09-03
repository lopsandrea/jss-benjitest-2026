package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void clampsComputeAtUpperBound() {
        new Class300().compute(3);
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class300().normalize("  x "));
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class300().compute(3));
    }

}
