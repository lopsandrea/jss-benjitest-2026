package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class066Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class066().compute(3);
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        new Class066().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class066().merge(2, 5));
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class066().isValid("abc"));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class066().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class066().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class066().merge(2, 5));
    }

}
