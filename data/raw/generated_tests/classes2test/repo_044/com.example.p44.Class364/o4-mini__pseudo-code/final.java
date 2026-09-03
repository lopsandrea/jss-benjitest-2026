package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class364().compute(3));
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class364().normalize("  x "));
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        assertEquals(0.5, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class364().isValid("abc"));
    }

}
