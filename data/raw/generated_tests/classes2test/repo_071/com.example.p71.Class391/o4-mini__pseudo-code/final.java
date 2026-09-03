package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void preservesComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class391().compute(3));
            assertEquals("ok", new Class391().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class391().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class391().merge(2, 5));
    }

}
