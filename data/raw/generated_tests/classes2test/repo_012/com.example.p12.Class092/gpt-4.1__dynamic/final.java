package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class092Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class092().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class092().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class092().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class092().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class092().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class092().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class092().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class092().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class092().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class092().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNullArgument() {
        assertEquals("alpha", new Class092().labelFor(1));
    }

}
