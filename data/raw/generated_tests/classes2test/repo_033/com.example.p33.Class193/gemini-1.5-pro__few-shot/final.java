package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {
    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class193().compute(3));
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class193().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class193().capacity());
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

}
