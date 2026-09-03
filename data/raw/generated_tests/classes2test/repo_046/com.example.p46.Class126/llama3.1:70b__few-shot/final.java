package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class126Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class126().compute(3));
            assertEquals("ok", new Class126().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class126().normalize("  x "));
            assertEquals(7, new Class126().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeOnMixedCase() {
        try {
            assertEquals(7, new Class126().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class126().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class126().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class126().ratio(1.0, 2.0), 1e-9);
    }

}
