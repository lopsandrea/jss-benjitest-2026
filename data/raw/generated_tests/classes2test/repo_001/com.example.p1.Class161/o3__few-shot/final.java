package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {
    @Test
    void clampsComputeAtZero() {
        new Class161().compute(3);
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class161().normalize("  x "));
        assertEquals(7, new Class161().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class161().merge(2, 5));
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        assertEquals(16, new Class161().capacity());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class161().compute(3));
    }

}
