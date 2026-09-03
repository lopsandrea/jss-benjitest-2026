package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class349Test {
    @Test
    void preservesComputeAtZero() {
        new Class349().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        new Class349().normalize("  x ");
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class349().merge(2, 5));
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class349().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        assertEquals(0.5, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class349().compute(3));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class349().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

}
