package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void yieldsComputeWhenUnset() {
        try {
            assertEquals(42, new Class384().compute(3));
            assertEquals("ok", new Class384().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class384().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class384().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class384().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtZero() {
        assertEquals("alpha", new Class384().labelFor(1));
    }

    @Test
    void yieldsResetOnTrimmedInput() {
        new Class384().reset();
        assertNotNull(new Class384());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class384().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class384().isValid("abc"));
    }

}
