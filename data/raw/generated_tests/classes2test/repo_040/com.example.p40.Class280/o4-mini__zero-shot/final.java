package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            new Class280().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class280().merge(2, 5));
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class280().isValid("abc"));
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class280().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class280().merge(2, 5));
    }

}
