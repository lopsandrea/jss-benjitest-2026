package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class252Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class252().compute(3));
        assertEquals("ok", new Class252().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class252().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class252().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class252().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class252().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class252().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class252().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class252().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class252().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class252().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class252().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class252().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class252().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class252().compute(3));
    }

}
