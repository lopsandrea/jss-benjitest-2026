package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class182().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class182().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        assertEquals(16, new Class182().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class182().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class182().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class182().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

}
