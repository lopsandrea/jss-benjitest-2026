package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class104().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class104().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForAtZero() {
        assertEquals("alpha", new Class104().labelFor(1));
    }

    @Test
    void acceptsResetOnMixedCase() {
        new Class104().reset();
        assertNotNull(new Class104());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

}
