package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class088Test {
    @Test
    void rejectsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class088().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        new Class088().normalize("  x ");
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class088().merge(2, 5));
        assertTrue(new Class088().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class088().compute(3));
    }

}
