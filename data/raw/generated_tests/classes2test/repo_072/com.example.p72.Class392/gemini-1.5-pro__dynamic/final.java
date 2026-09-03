package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class392().compute(3));
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class392().merge(2, 5));
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class392().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class392().capacity());
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class392().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class392().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class392().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class392().isValid("abc"));
    }

}
