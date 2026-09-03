package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class131Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class131().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class131().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class131().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class131().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class131().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class131().isValid("abc"));
    }

}
