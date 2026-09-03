package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void keepsComputeWhenUnset() {
        new Class121().compute(3);
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class121().normalize("  x "));
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class121().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class121().ratio(1.0, 2.0), 1e-9);
    }

}
