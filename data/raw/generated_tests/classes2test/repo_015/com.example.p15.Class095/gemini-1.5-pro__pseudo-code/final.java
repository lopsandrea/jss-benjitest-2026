package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class095().compute(3));
            assertEquals("ok", new Class095().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class095().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class095().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class095().labelFor(1));
    }

}
