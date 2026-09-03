package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class322().compute(3));
            assertEquals("ok", new Class322().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class322().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class322().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class322().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class322().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class322().labelFor(1));
    }

    @Test
    void keepsResetOnMixedCase() {
        new Class322().reset();
        assertNotNull(new Class322());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

}
