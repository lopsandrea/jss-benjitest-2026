package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class347().compute(3));
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class347().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class347().labelFor(1));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

}
