package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class302().compute(3));
            assertEquals("ok", new Class302().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class302().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class302().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

}
