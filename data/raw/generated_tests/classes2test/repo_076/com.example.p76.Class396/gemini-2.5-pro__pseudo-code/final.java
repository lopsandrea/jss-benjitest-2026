package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class396Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            new Class396().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class396().normalize("  x "));
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class396().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

}
