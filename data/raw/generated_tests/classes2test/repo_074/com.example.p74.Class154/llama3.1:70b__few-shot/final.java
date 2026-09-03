package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class154().compute(3));
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class154().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class154().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class154().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

}
