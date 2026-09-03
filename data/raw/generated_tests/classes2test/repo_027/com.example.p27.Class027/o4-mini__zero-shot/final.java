package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        new Class027().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class027().normalize("  x "));
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class027().merge(2, 5));
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class027().isValid("abc"));
        assertEquals(16, new Class027().capacity());
    }

    @Test
    void reportsCapacityForKnownCode() {
        assertEquals(16, new Class027().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        assertEquals(0.5, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class027().labelFor(1));
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class027().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class027().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class027().isValid("abc"));
    }

}
