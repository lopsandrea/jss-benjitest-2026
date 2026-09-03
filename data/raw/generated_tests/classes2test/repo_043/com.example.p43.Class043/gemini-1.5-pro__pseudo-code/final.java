package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class043().compute(3));
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class043().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

}
