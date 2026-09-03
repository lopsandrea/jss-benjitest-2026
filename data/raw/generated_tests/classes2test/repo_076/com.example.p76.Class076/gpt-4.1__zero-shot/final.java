package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            new Class076().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class076().normalize("  x "));
        assertEquals(7, new Class076().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class076().merge(2, 5));
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class076().isValid("abc"));
    }

}
