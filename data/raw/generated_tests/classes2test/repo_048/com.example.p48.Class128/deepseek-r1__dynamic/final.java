package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class128().compute(3));
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

}
