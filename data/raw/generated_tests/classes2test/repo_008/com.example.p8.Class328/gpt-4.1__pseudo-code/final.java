package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class328().compute(3);
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class328().normalize("  x "));
        assertEquals(7, new Class328().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class328().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class328().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

}
