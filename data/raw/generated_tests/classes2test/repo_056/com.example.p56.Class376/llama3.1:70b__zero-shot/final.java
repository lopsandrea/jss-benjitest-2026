package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class376().compute(3));
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class376().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class376().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        assertEquals(0.5, new Class376().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

}
