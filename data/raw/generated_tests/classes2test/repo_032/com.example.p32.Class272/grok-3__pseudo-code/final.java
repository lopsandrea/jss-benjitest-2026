package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class272().compute(3);
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class272().normalize("  x "));
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class272().merge(2, 5));
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class272().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class272().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void keepsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class272().isValid("abc"));
    }

}
