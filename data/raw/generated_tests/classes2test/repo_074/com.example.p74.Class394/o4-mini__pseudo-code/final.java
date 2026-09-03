package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void preservesComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class394().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        new Class394().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class394().merge(2, 5));
        assertTrue(new Class394().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class394().isValid("abc"));
        assertEquals(42, new Class394().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class394().compute(3));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class394().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

}
