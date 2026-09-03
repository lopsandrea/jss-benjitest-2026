package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class092().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class092().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class092().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class092().isValid("abc"));
    }

}
