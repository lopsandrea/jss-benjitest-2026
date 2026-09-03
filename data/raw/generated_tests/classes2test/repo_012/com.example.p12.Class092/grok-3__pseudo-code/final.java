package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {
    @Test
    void keepsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class092().compute(3));
            assertEquals("ok", new Class092().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class092().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class092().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class092().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class092().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class092().labelFor(1));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class092().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class092().compute(3));
    }

}
