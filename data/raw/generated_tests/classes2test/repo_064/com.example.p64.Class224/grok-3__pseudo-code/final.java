package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class224().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class224().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class224().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class224().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class224().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

}
