package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class007().compute(3);
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class007().normalize("  x "));
        assertEquals(7, new Class007().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class007().merge(2, 5));
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class007().isValid("abc"));
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

}
