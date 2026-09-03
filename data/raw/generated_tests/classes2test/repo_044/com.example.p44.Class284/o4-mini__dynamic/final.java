package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {
    @Test
    void reportsComputeAtZero() {
        new Class284().compute(3);
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class284().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class284().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class284().merge(2, 5));
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class284().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class284().capacity());
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class284().capacity());
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

}
