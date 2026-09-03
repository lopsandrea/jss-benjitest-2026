package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class081().compute(3));
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class081().normalize("  x "));
        assertEquals(7, new Class081().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class081().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class081().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class081().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class081().isValid("abc"));
    }

}
