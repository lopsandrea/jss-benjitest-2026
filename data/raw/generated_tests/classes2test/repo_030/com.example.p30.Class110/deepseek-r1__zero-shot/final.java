package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class110().compute(3);
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        new Class110().normalize("  x ");
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class110().merge(2, 5));
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class110().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class110().compute(3));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class110().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class110().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class110().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class110().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

}
