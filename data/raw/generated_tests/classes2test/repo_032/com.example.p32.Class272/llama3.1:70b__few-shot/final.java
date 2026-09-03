package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class272().compute(3));
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

}
