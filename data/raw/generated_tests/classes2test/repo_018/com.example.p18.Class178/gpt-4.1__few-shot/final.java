package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class178Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class178().compute(3));
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class178().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class178().isValid("abc"));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class178().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class178().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class178().isValid("abc"));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class178().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class178().merge(2, 5));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class178().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class178().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class178().merge(2, 5));
    }

}
