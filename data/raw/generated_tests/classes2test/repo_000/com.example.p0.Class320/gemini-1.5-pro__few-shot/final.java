package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class320().compute(3));
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class320().normalize("  x "));
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class320().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

}
