package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {
    @Test
    void reportsComputeAtZero() {
        try {
            assertEquals(42, new Class086().compute(3));
            assertEquals("ok", new Class086().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class086().normalize("  x "));
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class086().merge(2, 5));
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class086().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class086().capacity());
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class086().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class086().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class086().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class086().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class086().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class086().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class086().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

}
