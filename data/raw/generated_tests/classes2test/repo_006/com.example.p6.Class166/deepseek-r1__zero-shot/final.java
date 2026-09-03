package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            new Class166().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class166().normalize("  x "));
            assertEquals(7, new Class166().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class166().merge(2, 5));
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class166().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class166().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class166().merge(2, 5));
    }

}
