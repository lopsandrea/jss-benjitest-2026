package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class176Test {
    @Test
    void rejectsComputeAtZero() {
        new Class176().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class176().normalize("  x "));
        assertEquals(7, new Class176().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class176().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class176().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class176().capacity());
    }

    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class176().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class176().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class176().merge(2, 5));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class176().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class176().normalize("  x "));
    }

}
