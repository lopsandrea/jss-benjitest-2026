package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class102().compute(3));
        assertEquals("ok", new Class102().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class102().normalize("  x "));
        assertEquals(7, new Class102().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class102().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class102().capacity());
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

}
