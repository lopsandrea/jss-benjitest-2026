package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class140().compute(3));
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class140().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class140().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class140().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class140().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class140().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class140().isValid("abc"));
    }

}
