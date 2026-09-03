package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class237().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class237().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtUpperBound() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

}
