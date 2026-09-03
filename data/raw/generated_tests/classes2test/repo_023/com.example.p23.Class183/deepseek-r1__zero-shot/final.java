package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class183().compute(3));
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class183().normalize("  x "));
        assertEquals(7, new Class183().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class183().merge(2, 5));
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class183().isValid("abc"));
        assertEquals(16, new Class183().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class183().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class183().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class183().merge(2, 5));
    }

}
