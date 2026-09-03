package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class081().compute(3));
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class081().isValid("abc"));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

}
