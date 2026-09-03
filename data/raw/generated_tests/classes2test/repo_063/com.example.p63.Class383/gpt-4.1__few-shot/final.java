package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class383Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class383().compute(3));
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class383().normalize("  x "));
        assertEquals(7, new Class383().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class383().merge(2, 5));
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class383().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class383().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class383().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class383().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class383().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class383().compute(3));
    }

}
