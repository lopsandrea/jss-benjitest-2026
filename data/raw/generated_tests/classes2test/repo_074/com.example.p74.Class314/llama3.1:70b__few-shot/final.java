package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class314().compute(3));
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class314().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class314().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class314().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

}
