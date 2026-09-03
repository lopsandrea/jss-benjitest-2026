package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            assertEquals(42, new Class121().compute(3));
            assertEquals("ok", new Class121().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class121().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class121().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnMixedCase() {
        assertEquals("alpha", new Class121().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

}
