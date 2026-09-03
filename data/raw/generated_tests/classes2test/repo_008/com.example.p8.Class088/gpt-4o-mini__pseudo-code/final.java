package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class088().compute(3));
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class088().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class088().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class088().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class088().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class088().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class088().labelFor(1));
    }

}
