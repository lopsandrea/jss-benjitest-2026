package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void returnsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class159().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class159().normalize("  x "));
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class159().merge(2, 5));
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class159().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class159().compute(3));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

}
