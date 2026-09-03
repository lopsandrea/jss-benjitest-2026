package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class027().compute(3));
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class027().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class027().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

}
