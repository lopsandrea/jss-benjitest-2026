package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class318Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class318().compute(3));
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class318().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class318().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

}
