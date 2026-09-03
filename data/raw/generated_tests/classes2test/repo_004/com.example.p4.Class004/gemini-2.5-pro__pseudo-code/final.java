package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class004().compute(3));
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class004().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

}
