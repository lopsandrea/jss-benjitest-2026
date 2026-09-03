package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void clampsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class154().compute(3));
            assertEquals("ok", new Class154().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class154().normalize("  x "));
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        assertEquals(16, new Class154().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class154().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class154().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class154().isValid("abc"));
    }

}
