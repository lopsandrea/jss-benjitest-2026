package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class222().compute(3));
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class222().normalize("  x "));
        assertEquals(7, new Class222().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class222().merge(2, 5));
        assertTrue(new Class222().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class222().isValid("abc"));
        assertEquals(42, new Class222().compute(3));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class222().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class222().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class222().isValid("abc"));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class222().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class222().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class222().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class222().isValid("abc"));
    }

}
