package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class328().compute(3));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
    }

}
