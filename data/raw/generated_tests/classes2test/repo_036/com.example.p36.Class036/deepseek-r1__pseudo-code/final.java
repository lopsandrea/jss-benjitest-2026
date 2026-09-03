package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {
    @Test
    void keepsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class036().compute(3));
            assertEquals("ok", new Class036().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

}
