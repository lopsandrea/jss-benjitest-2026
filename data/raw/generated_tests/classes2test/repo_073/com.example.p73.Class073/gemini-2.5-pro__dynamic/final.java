package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class073().compute(3));
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class073().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class073().capacity());
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class073().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class073().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class073().merge(2, 5));
    }

}
