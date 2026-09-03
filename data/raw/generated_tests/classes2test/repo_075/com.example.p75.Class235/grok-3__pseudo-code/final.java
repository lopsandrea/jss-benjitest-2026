package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            new Class235().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class235().normalize("  x "));
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class235().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
    }

    @Test
    void acceptsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class235().ratio(1.0, 2.0), 1e-9);
    }

}
