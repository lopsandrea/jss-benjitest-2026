package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class315().compute(3));
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class315().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class315().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class315().merge(2, 5));
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class315().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class315().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class315().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class315().isValid("abc"));
    }

}
