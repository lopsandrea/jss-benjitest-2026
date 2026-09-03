package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        new Class065().compute(3);
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class065().normalize("  x "));
        assertEquals(7, new Class065().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class065().merge(2, 5));
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class065().isValid("abc"));
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class065().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class065().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class065().compute(3));
    }

}
