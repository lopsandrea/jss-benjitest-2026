package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            new Class391().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class391().normalize("  x "));
        assertEquals(7, new Class391().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class391().merge(2, 5));
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class391().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class391().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class391().isValid("abc"));
    }

}
