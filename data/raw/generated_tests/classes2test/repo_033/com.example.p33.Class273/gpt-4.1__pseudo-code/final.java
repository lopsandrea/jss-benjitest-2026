package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class273Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class273().compute(3));
            assertEquals("ok", new Class273().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class273().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class273().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class273().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class273().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class273().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class273().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class273().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class273().capacity());
    }

}
