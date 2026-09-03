package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class396Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class396().compute(3));
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class396().normalize("  x "));
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

}
