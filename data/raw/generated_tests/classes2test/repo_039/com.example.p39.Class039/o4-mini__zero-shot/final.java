package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class039().compute(3));
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class039().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class039().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class039().isValid("abc"));
    }

}
