package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class286().compute(3));
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class286().capacity());
    }

}
