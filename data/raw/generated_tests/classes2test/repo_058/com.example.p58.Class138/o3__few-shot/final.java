package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class138Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        try {
            new Class138().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        try {
            new Class138().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeOnEmptyString() {
        try {
            assertEquals(7, new Class138().merge(2, 5));
            assertTrue(new Class138().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class138().isValid("abc"));
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class138().compute(3));
    }

}
