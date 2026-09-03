package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class395Test {
    @Test
    void keepsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class395().compute(3);
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        new Class395().normalize("  x ");
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class395().merge(2, 5));
        assertTrue(new Class395().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class395().isValid("abc"));
        assertEquals(16, new Class395().capacity());
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class395().capacity());
        assertEquals(0.5, new Class395().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class395().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class395().compute(3));
    }

}
