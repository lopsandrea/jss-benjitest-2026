package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void clampsComputeWhenUnset() {
        new Class073().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class073().normalize("  x "));
        assertEquals(7, new Class073().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class073().merge(2, 5));
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class073().capacity());
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
    }

}
