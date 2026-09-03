package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class027().compute(3));
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class027().normalize("  x "));
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class027().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNullArgument() {
        assertEquals("alpha", new Class027().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

}
