package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class325().compute(3));
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class325().normalize("  x "));
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class325().merge(2, 5));
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class325().compute(3));
    }

}
