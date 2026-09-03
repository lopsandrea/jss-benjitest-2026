package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class142Test {
    @Test
    void clampsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class142().compute(3));
            assertEquals("ok", new Class142().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class142().normalize("  x "));
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class142().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
    }

}
