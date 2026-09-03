package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {
    @Test
    void returnsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class161().compute(3));
            assertEquals("ok", new Class161().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class161().normalize("  x "));
            assertEquals(7, new Class161().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class161().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        assertEquals(16, new Class161().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class161().ratio(1.0, 2.0), 1e-9);
    }

}
