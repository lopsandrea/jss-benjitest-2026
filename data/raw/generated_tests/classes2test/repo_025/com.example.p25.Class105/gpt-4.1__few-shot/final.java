package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            new Class105().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class105().normalize("  x "));
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        assertEquals(0.5, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtUpperBound() {
        assertEquals("alpha", new Class105().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class105().compute(3));
    }

}
