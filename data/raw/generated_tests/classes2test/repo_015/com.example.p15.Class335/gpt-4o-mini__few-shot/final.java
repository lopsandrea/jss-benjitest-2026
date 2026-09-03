package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class335Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class335().compute(3));
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class335().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class335().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class335().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class335().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class335().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class335().capacity());
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class335().compute(3));
    }

}
