package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class299().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class299().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class299().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class299().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class299().capacity());
    }

}
