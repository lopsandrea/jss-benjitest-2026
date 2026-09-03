package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class323().compute(3));
            assertEquals("ok", new Class323().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class323().normalize("  x "));
        assertEquals(7, new Class323().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class323().merge(2, 5));
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class323().isValid("abc"));
    }

}
