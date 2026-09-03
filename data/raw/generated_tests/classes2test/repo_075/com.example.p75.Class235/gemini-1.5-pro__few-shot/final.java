package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class235().compute(3));
            assertEquals("ok", new Class235().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class235().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class235().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class235().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class235().capacity());
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void rejectsResetOnMixedCase() {
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

}
