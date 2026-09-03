package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class046().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class046().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        assertEquals(0.5, new Class046().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class046().labelFor(1));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class046().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class046().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class046().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class046().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class046().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenUnset() {
        assertEquals("alpha", new Class046().labelFor(1));
    }

}
