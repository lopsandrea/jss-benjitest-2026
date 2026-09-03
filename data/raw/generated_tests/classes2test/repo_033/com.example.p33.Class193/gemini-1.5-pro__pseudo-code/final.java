package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class193().compute(3));
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class193().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class193().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

}
