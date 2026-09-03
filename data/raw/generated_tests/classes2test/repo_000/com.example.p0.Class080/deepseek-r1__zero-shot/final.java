package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void reportsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class080().compute(3));
            assertEquals("ok", new Class080().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        assertEquals(0.5, new Class080().ratio(1.0, 2.0), 1e-9);
    }

}
