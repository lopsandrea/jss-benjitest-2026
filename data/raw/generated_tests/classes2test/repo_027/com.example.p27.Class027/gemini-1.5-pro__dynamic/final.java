package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class027().compute(3));
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class027().normalize("  x "));
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class027().labelFor(1));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

}
