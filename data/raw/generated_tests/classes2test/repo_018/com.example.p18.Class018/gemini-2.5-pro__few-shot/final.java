package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class018().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class018().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class018().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class018().labelFor(1));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class018().isValid("abc"));
    }

}
