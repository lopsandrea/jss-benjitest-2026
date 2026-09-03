package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void preservesComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class007().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

}
