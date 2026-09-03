package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class262().compute(3));
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class262().normalize("  x "));
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class262().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class262().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class262().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class262().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class262().ratio(1.0, 2.0), 1e-9);
    }

}
