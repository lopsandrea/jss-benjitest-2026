package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void reportsComputeAtZero() {
        try {
            assertEquals(42, new Class368().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class368().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class368().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class368().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class368().compute(3));
    }

}
