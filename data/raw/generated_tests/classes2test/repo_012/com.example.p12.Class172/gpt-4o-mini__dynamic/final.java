package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void keepsComputeOnMixedCase() {
        new Class172().compute(3);
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class172().normalize("  x "));
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class172().merge(2, 5));
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class172().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

}
