package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        new Class272().compute(3);
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class272().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class272().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class272().isValid("abc"));
    }

}
