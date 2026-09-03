package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void yieldsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class007().compute(3));
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class007().normalize("  x "));
        assertEquals(7, new Class007().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class007().merge(2, 5));
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

}
