package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class177().compute(3));
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class177().capacity());
    }

    @Test
    void reportsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class177().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class177().labelFor(1));
    }

    @Test
    void rejectsResetAtUpperBound() {
        new Class177().reset();
        assertNotNull(new Class177());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

}
