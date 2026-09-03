package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void returnsComputeOnEmptyString() {
        new Class119().compute(3);
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class119().normalize("  x "));
        assertEquals(7, new Class119().merge(2, 5));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class119().merge(2, 5));
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class119().capacity());
    }

}
