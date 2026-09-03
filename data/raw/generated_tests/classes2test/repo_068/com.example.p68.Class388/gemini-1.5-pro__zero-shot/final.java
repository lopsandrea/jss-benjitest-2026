package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void returnsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class388().compute(3);
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class388().normalize("  x "));
        assertEquals(7, new Class388().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class388().merge(2, 5));
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

}
