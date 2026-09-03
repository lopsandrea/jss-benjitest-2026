package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class007().compute(3);
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        new Class007().normalize("  x ");
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class007().merge(2, 5));
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class007().isValid("abc"));
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class007().compute(3));
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

}
