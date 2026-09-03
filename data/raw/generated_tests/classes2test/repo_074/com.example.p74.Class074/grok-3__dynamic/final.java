package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

}
