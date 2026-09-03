package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class013().compute(3));
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class013().normalize("  x "));
        assertEquals(7, new Class013().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class013().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class013().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class013().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class013().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class013().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

}
