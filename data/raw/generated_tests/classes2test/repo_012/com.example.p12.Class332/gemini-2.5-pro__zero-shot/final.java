package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class332().compute(3));
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class332().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class332().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

}
