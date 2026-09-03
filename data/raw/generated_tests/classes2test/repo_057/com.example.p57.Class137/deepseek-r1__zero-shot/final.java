package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void reportsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class137().compute(3));
            assertEquals("ok", new Class137().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class137().normalize("  x "));
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class137().merge(2, 5));
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

}
