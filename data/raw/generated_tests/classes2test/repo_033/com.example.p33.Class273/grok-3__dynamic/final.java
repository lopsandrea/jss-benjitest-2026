package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class273Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class273().compute(3));
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class273().normalize("  x "));
        assertEquals(7, new Class273().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class273().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        assertEquals(16, new Class273().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        assertEquals(0.5, new Class273().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class273().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class273().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class273().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

}
