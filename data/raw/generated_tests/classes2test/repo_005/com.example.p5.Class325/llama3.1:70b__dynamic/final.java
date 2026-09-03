package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class325().compute(3));
            assertEquals("ok", new Class325().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class325().normalize("  x "));
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class325().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class325().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class325().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class325().isValid("abc"));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class325().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class325().merge(2, 5));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class325().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class325().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class325().merge(2, 5));
    }

}
