package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class019().compute(3));
            assertEquals("ok", new Class019().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class019().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class019().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class019().ratio(1.0, 2.0), 1e-9);
    }

}
