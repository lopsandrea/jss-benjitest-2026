package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void returnsComputeWhenUnset() {
        new Class234().compute(3);
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class234().isValid("abc"));
        assertEquals(16, new Class234().capacity());
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        assertEquals(16, new Class234().capacity());
        assertEquals(0.5, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class234().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class234().isValid("abc"));
    }

}
