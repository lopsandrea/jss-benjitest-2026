package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void clampsComputeAtZero() {
        new Class394().compute(3);
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        new Class394().normalize("  x ");
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class394().merge(2, 5));
        assertTrue(new Class394().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class394().isValid("abc"));
        assertEquals(42, new Class394().compute(3));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class394().compute(3));
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
    }

}
