package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class232().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class232().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class232().isValid("abc"));
    }

}
