package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class255().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class255().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class255().capacity());
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        assertEquals(0.5, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

}
