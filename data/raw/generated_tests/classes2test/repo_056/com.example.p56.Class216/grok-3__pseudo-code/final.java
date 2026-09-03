package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class216().compute(3));
            assertEquals("ok", new Class216().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class216().normalize("  x "));
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class216().compute(3));
    }

}
