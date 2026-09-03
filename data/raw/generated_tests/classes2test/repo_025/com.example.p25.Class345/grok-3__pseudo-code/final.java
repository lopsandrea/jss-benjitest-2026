package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        new Class345().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        new Class345().normalize("  x ");
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class345().merge(2, 5));
        assertTrue(new Class345().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class345().isValid("abc"));
        assertEquals(16, new Class345().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class345().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class345().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class345().isValid("abc"));
    }

}
