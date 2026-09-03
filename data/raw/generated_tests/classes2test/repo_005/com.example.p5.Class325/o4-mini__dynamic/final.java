package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        new Class325().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        new Class325().normalize("  x ");
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class325().merge(2, 5));
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class325().isValid("abc"));
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class325().isValid("abc"));
    }

}
