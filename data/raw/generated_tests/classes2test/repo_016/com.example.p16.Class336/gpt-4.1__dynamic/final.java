package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class336().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class336().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class336().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class336().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class336().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class336().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class336().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class336().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class336().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class336().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

}
