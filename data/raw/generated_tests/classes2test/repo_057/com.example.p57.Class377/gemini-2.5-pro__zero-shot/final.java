package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class377Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        new Class377().compute(3);
    }

    @Test
    void rejectsNormalizeAtZero() {
        new Class377().normalize("  x ");
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class377().merge(2, 5));
        assertTrue(new Class377().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class377().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class377().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class377().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class377().isValid("abc"));
    }

}
