package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {
    @Test
    void rejectsComputeWithNullArgument() {
        try {
            new Class006().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class006().normalize("  x "));
        assertEquals(7, new Class006().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class006().merge(2, 5));
        assertTrue(new Class006().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class006().isValid("abc"));
        assertEquals(42, new Class006().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class006().compute(3));
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class006().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class006().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class006().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class006().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class006().merge(2, 5));
    }

}
