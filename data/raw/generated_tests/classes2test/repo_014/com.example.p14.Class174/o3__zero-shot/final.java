package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class174Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class174().compute(3));
            assertEquals("ok", new Class174().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class174().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class174().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class174().merge(2, 5));
        assertTrue(new Class174().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class174().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class174().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class174().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class174().compute(3));
    }

}
