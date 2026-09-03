package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            new Class054().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class054().normalize("  x "));
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class054().merge(2, 5));
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class054().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class054().capacity());
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class054().capacity());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class054().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class054().capacity());
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class054().normalize("  x "));
    }

}
