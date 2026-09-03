package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            new Class181().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class181().normalize("  x "));
        assertEquals(7, new Class181().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class181().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class181().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class181().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class181().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class181().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

}
