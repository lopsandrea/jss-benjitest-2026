package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class199().compute(3));
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class199().normalize("  x "));
        assertEquals(7, new Class199().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class199().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class199().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

}
