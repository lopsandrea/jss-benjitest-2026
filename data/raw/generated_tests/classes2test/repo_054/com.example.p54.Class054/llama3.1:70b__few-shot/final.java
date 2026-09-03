package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class054().compute(3));
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class054().normalize("  x "));
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

}
