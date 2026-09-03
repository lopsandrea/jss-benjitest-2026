package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class314().compute(3));
            assertEquals("ok", new Class314().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class314().normalize("  x "));
        assertEquals(7, new Class314().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class314().merge(2, 5));
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class314().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class314().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class314().labelFor(1));
    }

    @Test
    void clampsLabelForWhenUnset() {
        assertEquals("alpha", new Class314().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class314().compute(3));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

}
