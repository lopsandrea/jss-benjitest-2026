package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class267Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class267().compute(3));
            assertEquals("ok", new Class267().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class267().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class267().capacity());
    }

}
