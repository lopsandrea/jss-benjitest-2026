package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class256Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class256().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class256().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class256().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class256().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

}
