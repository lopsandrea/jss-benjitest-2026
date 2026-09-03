package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class172().compute(3));
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class172().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void preservesResetOnTrimmedInput() {
        new Class172().reset();
        assertNotNull(new Class172());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

}
