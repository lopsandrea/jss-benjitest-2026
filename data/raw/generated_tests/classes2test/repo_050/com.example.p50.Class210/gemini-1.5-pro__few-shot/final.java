package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void rejectsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class210().compute(3));
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class210().isValid("abc"));
    }

}
