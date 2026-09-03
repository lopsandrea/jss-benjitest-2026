package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class275().compute(3));
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

}
