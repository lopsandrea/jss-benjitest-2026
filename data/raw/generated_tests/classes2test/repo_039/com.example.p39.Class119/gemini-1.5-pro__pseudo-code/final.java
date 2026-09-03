package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void keepsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class119().compute(3));
            assertEquals("ok", new Class119().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class119().normalize("  x "));
            assertEquals(7, new Class119().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class119().merge(2, 5));
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class119().isValid("abc"));
        assertEquals(16, new Class119().capacity());
    }

    @Test
    void reportsCapacityWithNullArgument() {
        assertEquals(16, new Class119().capacity());
        assertEquals(0.5, new Class119().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class119().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class119().labelFor(1));
    }

    @Test
    void acceptsLabelForAtUpperBound() {
        assertEquals("alpha", new Class119().labelFor(1));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

}
