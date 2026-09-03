package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class018().compute(3));
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class018().isValid("abc"));
    }

}
