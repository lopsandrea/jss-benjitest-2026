package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {
    @Test
    void clampsComputeWhenUnset() {
        new Class036().compute(3);
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class036().normalize("  x "));
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class036().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

}
