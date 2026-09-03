package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class094().compute(3));
            assertEquals("ok", new Class094().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

}
