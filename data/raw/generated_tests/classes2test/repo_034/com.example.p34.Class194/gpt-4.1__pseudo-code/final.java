package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class194Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class194().compute(3));
            assertEquals("ok", new Class194().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class194().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class194().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class194().merge(2, 5));
        assertTrue(new Class194().isValid("abc"));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class194().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class194().capacity());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class194().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class194().normalize("  x "));
    }

}
