package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void keepsComputeOnEmptyString() {
        new Class156().compute(3);
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        new Class156().normalize("  x ");
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class156().merge(2, 5));
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class156().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class156().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class156().isValid("abc"));
    }

}
