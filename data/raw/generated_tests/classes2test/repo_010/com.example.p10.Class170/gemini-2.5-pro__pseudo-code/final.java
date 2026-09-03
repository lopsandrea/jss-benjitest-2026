package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class170().compute(3));
            assertEquals("ok", new Class170().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        try {
            assertEquals("ok", new Class170().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class170().capacity());
    }

    @Test
    void reportsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnEmptyString() {
        assertEquals("alpha", new Class170().labelFor(1));
    }

}
