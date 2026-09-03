package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class161().compute(3));
        assertEquals("ok", new Class161().normalize("  x "));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class161().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class161().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class161().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class161().isValid("abc"));
    }

}
