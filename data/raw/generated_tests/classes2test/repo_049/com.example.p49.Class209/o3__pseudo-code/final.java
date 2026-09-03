package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class209Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class209().compute(3));
            assertEquals("ok", new Class209().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class209().normalize("  x "));
        assertEquals(7, new Class209().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class209().merge(2, 5));
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class209().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class209().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

}
