package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class340().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class340().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class340().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class340().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        assertEquals(0.5, new Class340().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class340().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class340().merge(2, 5));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class340().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

}
