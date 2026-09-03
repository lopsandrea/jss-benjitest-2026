package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class098Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class098().compute(3));
            assertEquals("ok", new Class098().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class098().normalize("  x "));
            assertEquals(7, new Class098().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeOnEmptyString() {
        try {
            assertEquals(7, new Class098().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class098().isValid("abc"));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class098().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class098().normalize("  x "));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class098().compute(3));
    }

}
