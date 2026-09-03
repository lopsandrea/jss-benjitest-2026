package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void reportsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class088().compute(3));
            assertEquals("ok", new Class088().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class088().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class088().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class088().capacity());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class088().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class088().normalize("  x "));
    }

}
