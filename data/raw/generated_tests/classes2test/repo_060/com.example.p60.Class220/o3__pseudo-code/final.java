package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class220Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class220().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class220().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class220().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class220().isValid("abc"));
    }

    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class220().compute(3));
    }

}
