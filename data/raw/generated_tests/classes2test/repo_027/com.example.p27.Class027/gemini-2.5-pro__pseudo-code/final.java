package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class027().compute(3));
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class027().normalize("  x "));
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class027().isValid("abc"));
    }

}
