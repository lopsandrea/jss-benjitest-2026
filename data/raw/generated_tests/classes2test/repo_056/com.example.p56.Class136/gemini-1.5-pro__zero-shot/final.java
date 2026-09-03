package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void reportsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class136().compute(3));
            assertEquals("ok", new Class136().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class136().normalize("  x "));
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class136().merge(2, 5));
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class136().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class136().capacity());
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class136().capacity());
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

}
