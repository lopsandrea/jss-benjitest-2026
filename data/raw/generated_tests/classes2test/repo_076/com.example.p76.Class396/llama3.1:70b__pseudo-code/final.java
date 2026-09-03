package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class396Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class396().compute(3));
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class396().normalize("  x "));
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class396().merge(2, 5));
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class396().isValid("abc"));
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

}
