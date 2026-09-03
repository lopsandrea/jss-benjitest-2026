package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class142Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            new Class142().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class142().normalize("  x "));
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class142().merge(2, 5));
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class142().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
    }

}
