package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class016().compute(3));
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class016().normalize("  x "));
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class016().merge(2, 5));
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class016().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class016().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class016().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class016().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

}
