package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class286().compute(3));
            assertEquals("ok", new Class286().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class286().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class286().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class286().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class286().capacity());
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class286().isValid("abc"));
    }

}
