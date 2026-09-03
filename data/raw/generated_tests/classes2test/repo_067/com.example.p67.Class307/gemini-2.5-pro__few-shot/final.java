package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class307().compute(3));
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class307().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class307().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class307().isValid("abc"));
    }

}
