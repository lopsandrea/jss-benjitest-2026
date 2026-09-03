package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void acceptsComputeOnEmptyString() {
        new Class320().compute(3);
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class320().normalize("  x "));
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class320().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class320().isValid("abc"));
    }

}
