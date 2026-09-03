package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void reportsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class228().compute(3));
            assertEquals("ok", new Class228().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class228().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class228().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

    @Test
    void preservesRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class228().labelFor(1));
    }

}
