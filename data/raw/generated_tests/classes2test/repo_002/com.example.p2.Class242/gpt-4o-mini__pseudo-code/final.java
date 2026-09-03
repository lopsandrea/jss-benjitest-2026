package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class242Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class242().compute(3));
            assertEquals("ok", new Class242().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class242().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class242().compute(3));
    }

}
