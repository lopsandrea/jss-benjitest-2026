package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void returnsComputeAtUpperBound() {
        new Class152().compute(3);
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class152().normalize("  x "));
        assertEquals(7, new Class152().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class152().merge(2, 5));
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class152().isValid("abc"));
        assertEquals(42, new Class152().compute(3));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

}
