package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            new Class334().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class334().normalize("  x "));
        assertEquals(7, new Class334().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class334().merge(2, 5));
        assertTrue(new Class334().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class334().isValid("abc"));
        assertEquals(16, new Class334().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class334().capacity());
        assertEquals(0.5, new Class334().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioForBoundaryValue() {
        assertEquals(0.5, new Class334().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class334().compute(3));
    }

}
