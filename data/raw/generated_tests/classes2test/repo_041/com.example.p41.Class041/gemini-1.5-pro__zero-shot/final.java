package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class041().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class041().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class041().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class041().ratio(1.0, 2.0), 1e-9);
    }

}
