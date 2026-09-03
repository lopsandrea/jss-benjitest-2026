package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void keepsComputeForBoundaryValue() {
        new Class098().compute(3);
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class098().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class098().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class098().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class098().compute(3));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class098().merge(2, 5));
    }

}
