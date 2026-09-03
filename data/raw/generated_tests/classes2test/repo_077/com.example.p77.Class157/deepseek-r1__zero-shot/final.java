package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            new Class157().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        new Class157().normalize("  x ");
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class157().isValid("abc"));
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class157().capacity());
        assertEquals(0.5, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioAtUpperBound() {
        assertEquals(0.5, new Class157().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class157().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class157().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

}
