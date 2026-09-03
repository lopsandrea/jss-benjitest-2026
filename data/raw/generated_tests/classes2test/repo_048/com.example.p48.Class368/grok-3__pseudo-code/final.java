package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class368().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class368().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class368().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class368().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtZero() {
        assertEquals("alpha", new Class368().labelFor(1));
    }

    @Test
    void keepsResetAtZero() {
        new Class368().reset();
        assertNotNull(new Class368());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class368().merge(2, 5));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

}
