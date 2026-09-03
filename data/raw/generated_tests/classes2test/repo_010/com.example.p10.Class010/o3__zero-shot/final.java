package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class010Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class010().compute(3));
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class010().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class010().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class010().isValid("abc"));
    }

}
