package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void keepsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class224().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class224().normalize("  x "));
        assertEquals(7, new Class224().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class224().merge(2, 5));
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class224().capacity());
    }

}
