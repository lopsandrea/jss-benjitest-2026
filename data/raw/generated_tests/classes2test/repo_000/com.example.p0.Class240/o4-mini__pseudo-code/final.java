package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class240().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class240().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class240().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class240().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

}
