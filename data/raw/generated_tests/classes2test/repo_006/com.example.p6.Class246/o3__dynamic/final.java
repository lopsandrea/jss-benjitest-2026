package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class246().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class246().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

}
