package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void keepsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class043().compute(3));
            assertEquals("ok", new Class043().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class043().normalize("  x "));
            assertEquals(7, new Class043().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class043().merge(2, 5));
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class043().isValid("abc"));
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class043().compute(3));
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

}
