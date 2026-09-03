package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class152().compute(3));
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class152().normalize("  x "));
        assertEquals(7, new Class152().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class152().merge(2, 5));
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class152().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class152().compute(3));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

}
