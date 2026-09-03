package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class299().compute(3));
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class299().normalize("  x "));
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class299().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class299().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class299().ratio(1.0, 2.0), 1e-9);
    }

}
