package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class287().compute(3));
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class287().normalize("  x "));
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class287().merge(2, 5));
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class287().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class287().labelFor(1));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

}
